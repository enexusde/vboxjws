
/*
 * Copyright (C) 2010-2022 Oracle and/or its affiliates.
 *
 * This file is part of a free software library; you can redistribute
 * it and/or modify it under the terms of the GNU Lesser General
 * Public License version 2.1 as published by the Free Software
 * Foundation and shipped in the \"COPYING.LIB\" file with this library.
 * The library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY of any kind.
 *
 * Oracle LGPL Disclaimer: For the avoidance of doubt, except that if
 * any license choice other than GPL or LGPL is available it will
 * apply instead, Oracle elects to use only the Lesser General Public
 * License version 2.1 (LGPLv2) at this time for any software where
 * a choice of LGPL license versions is made available with the
 * language indicating that LGPLv2 or any later version may be used,
 * or where a choice of which version of the LGPL is applied is
 * otherwise unspecified.

 * http://www.virtualbox.org.  This library is free software; you can
 * redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, in version 2.1
 * as it comes in the "COPYING.LIB" file of the VirtualBox SDK distribution.
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 * License for more details.
 *
 * SPDX-License-Identifier: LGPL-2.1-only
 */

/*
 * VirtualBoxManager.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;
import java.net.URL;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.lang.Integer;
import java.lang.ref.WeakReference;
import java.lang.ref.ReferenceQueue;
import javax.xml.namespace.QName;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.Holder;
import jakarta.xml.ws.WebServiceException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.net.Socket;
import java.net.InetAddress;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLSocket;

class PortPool
{
    private final static String wsdlFile = "vboxwebService_7_0.wsdl";
    private Map<VboxPortType, Integer> known;
    private boolean initStarted;
    private VboxService svc;

    PortPool(boolean usePreinit)
    {
        known = new HashMap<VboxPortType, Integer>();

        if (usePreinit)
        {
            new Thread(new Runnable()
                {
                    public void run()
                    {
                        // need to sync on something else but 'this'
                        synchronized (known)
                        {
                            initStarted = true;
                            known.notify();
                        }

                        preinit();
                    }
                }).start();

            synchronized (known)
            {
                while (!initStarted)
                {
                    try
                    {
                        known.wait();
                    }
                    catch (InterruptedException e)
                    {
                        break;
                    }
                }
            }
        }
    }

    private synchronized void preinit()
    {
        VboxPortType port = getPort();
        releasePort(port);
    }

    synchronized VboxPortType getPort()
    {
        VboxPortType port = null;
        int ttl = 0;

        for (VboxPortType cur: known.keySet())
        {
            int value = known.get(cur);
            if ((value & 0x10000) == 0)
            {
                port = cur;
                ttl = value & 0xffff;
                break;
            }
        }

        if (port == null)
        {
            if (svc == null)
            {
                URL wsdl = PortPool.class.getClassLoader().getResource(wsdlFile);
                if (wsdl == null)
                    throw new LinkageError(wsdlFile + " not found, but it should have been in the jar");
                svc = new VboxService(wsdl,
                                      new QName("http://www.virtualbox.org/Service",
                                                "vboxService"));
            }
            port = svc.getVboxServicePort();
            // reuse this object 0x10 times
            ttl = 0x10;
        }
        // mark as used
        known.put(port, new Integer(0x10000 | ttl));
        return port;
    }

    synchronized void releasePort(VboxPortType port)
    {
        Integer val = known.get(port);
        if (val == null || val == 0)
        {
            // know you not
            return;
        }

        int v = val;
        int ttl = v & 0xffff;
        // decrement TTL, and throw away port if used too much times
        if (--ttl <= 0)
        {
            known.remove(port);
        }
        else
        {
            v = ttl; // set new TTL and clear busy bit
            known.put(port, v);
        }
    }
}


/**
 * This class manages the object references between us and the webservice server.
 * It makes sure that the object on the server side is destroyed when all
 */
class ObjectRefManager
{
    private final static ReferenceQueue<IUnknown> refQ = new ReferenceQueue<IUnknown>();

    private final ConcurrentMap<String, ManagedObj> map = new ConcurrentHashMap<String, ManagedObj>();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final ObjRefMgrCleanupThread objRefMgrCleanup;

    public ObjectRefManager()
    {
        this.objRefMgrCleanup = new ObjRefMgrCleanupThread(this, 100);
        this.objRefMgrCleanup.start();
    }

    public void markShutdown() {
    	this.objRefMgrCleanup.markShutdown();
    }
    
    /**
     * Prevents the object reference manager cleanup thread from releasing any
     * server side objects to avoid a fundamental race in the multi threaded
     * java environment where it is possible that a wrapper got the object ID
     * from the server but couldn't create the local stub protecting the object
     * before the cleanup thread released it.
     */
    public void preventObjRelease()
    {
        lock.readLock().lock();
    }

    /**
     * Allows releasing server side objects from the cleanup thread again.
     */
    public void allowObjRelease()
    {
        lock.readLock().unlock();
    }

    /**
     * Marks the start of a run to release server side objects which don't hold
     * a reference locally anymore.
     */
    public void startObjRelease()
    {
        lock.writeLock().lock();
    }

    /**
     * Marks the end of a cleanup run.
     */
    public void endObjRelease()
    {
        lock.writeLock().unlock();
    }

    /**
     * Registers a new stub object for automatic reference managing.
     */
    public void registerObj(IUnknown obj)
    {
        assert lock.getReadLockCount() > 0;
        ManagedObjRef ref = new ManagedObjRef(obj);

        ManagedObj mgrobj = map.get(obj.getWrapped());
        if (mgrobj != null)
        {
            mgrobj.addObject(ref);
        }
        else
        {
            /* Create new. */
            mgrobj = new ManagedObj(obj.getWrapped(), obj.getRemoteWSPort());
            mgrobj.addObject(ref);
            map.put(obj.getWrapped(), mgrobj);
        }
    }

    /**
     * Removes a garbage collected object reference from our reference manager.
     *
     * Returns the server side object wrapper if there is no stub referencing it
     * anymore otherwise null is returned.
     */
    public ManagedObj unregisterObj(ManagedObjRef objRef)
    {
        ManagedObj obj = this.map.get(objRef.objId);

        assert obj != null;
        obj.removeObject(objRef);
        if (!obj.isReferenced())
            return obj;

        return null;
    }

    public void releaseRemoteObj(ManagedObj obj)
    {
        assert lock.isWriteLockedByCurrentThread();

        if (!obj.isReferenced())
        {
            try
            {
                obj.port.iManagedObjectRefRelease(obj.objId);
            }
            catch (InvalidObjectFaultMsg e)
            {
                throw new WebServiceException(e);
            }
            catch (RuntimeFaultMsg e)
            {
                throw new WebServiceException(e);
            }
            finally
            {
                this.map.remove(obj.objId);
            }
        }
    }

    /**
     * An object which is living on the server side. This can be referenced
     * by multiple stub objects here.
     */
    static class ManagedObj
    {
        private final String                               objId;
        private final VboxPortType                         port;
        private final ConcurrentLinkedQueue<ManagedObjRef> refQ;

        ManagedObj(String objId,  VboxPortType port)
        {
          this.objId = objId;
          this.port  = port;
          this.refQ  = new ConcurrentLinkedQueue<ManagedObjRef>();
        }

        public void addObject(ManagedObjRef obj)
        {
            this.refQ.add(obj);
        }

        public void removeObject(ManagedObjRef obj)
        {
            this.refQ.remove(obj);
        }

        public boolean isReferenced()
        {
            return !this.refQ.isEmpty();
        }
    }

    /**
     * A private class extending WeakReference to get notified about garbage
     * collected stub objects.
     */
    static class ManagedObjRef extends WeakReference<IUnknown>
    {
        final String objId;

        ManagedObjRef(IUnknown obj)
        {
            super(obj, refQ);
            this.objId = obj.getWrapped();
        }
    }

    /**
     * A private class implementing a thread getting notified
     * about garbage collected objects so it can release the object on the
     * server side if it is not used anymore.
     */
    static class ObjRefMgrCleanupThread extends Thread
    {
        ObjectRefManager            objRefMgr;
        int                         cStubsReleased;
        int                         cStubsReleaseThreshold;
        HashMap<String, ManagedObj> mapToRelease = new HashMap<String, ManagedObj>();
        boolean shouldRun = true;

        ObjRefMgrCleanupThread(ObjectRefManager objRefMgr)
        {
            init(objRefMgr, 500);
        }

        ObjRefMgrCleanupThread(ObjectRefManager objRefMgr, int cStubsReleaseThreshold)
        {
            init(objRefMgr, cStubsReleaseThreshold);
        }

        private void init(ObjectRefManager objRefMgr, int cStubsReleaseThreshold)
        {
            this.objRefMgr = objRefMgr;
            this.cStubsReleased = 0;
            this.cStubsReleaseThreshold = cStubsReleaseThreshold;
            setName("ObjectRefManager-VBoxWSObjRefGcThrd");
            /*
             * setDaemon() makes sure the jvm exits and is not blocked
             * if the thread is still running so we don't have to care about
             * tearing it down.
             */
            setDaemon(true);
        }
        void markShutdown() {
        	shouldRun = false;
        }
        public void run()
        {
            while (shouldRun)
            {
                while (cStubsReleased < cStubsReleaseThreshold && shouldRun)
                {
                    try
                    {
                        /* Accumulate a few objects before we start. */
                        while (cStubsReleased < cStubsReleaseThreshold && shouldRun)
                        {
                            ManagedObjRef ref = (ManagedObjRef)refQ.remove(100);
                            if (ref != null) {
	                            ManagedObj obj = this.objRefMgr.unregisterObj(ref);
	                            /*
	                             * If the server side object is not referenced anymore
	                             * promote to map for releasing later.
	                             */
	                            if (obj != null && !mapToRelease.containsKey(ref.objId))
	                                mapToRelease.put(ref.objId, obj);
	
	                            cStubsReleased++;
                            }
                        }
                    }
                    catch (InterruptedException e)
                    { /* ignore */ }
                    catch (jakarta.xml.ws.WebServiceException e)
                    { /* ignore */ }
                }

                /*
                 * After we released enough stubs we go over all non referenced
                 * server side objects and release them if they were not
                 * referenced again in between.
                 */
                cStubsReleased = 0;
                if (!mapToRelease.isEmpty())
                {
                    this.objRefMgr.startObjRelease();
                    try
                    {
                        Iterator<ManagedObj> it = mapToRelease.values().iterator();
                        while (it.hasNext() && shouldRun)
                        {
                            ManagedObj obj = it.next();
                            this.objRefMgr.releaseRemoteObj(obj);
                        }

                        mapToRelease.clear();
                    }
                    catch (jakarta.xml.ws.WebServiceException e)
                    { /* ignore */ }
                    finally
                    {
                        this.objRefMgr.endObjRelease();
                    }
                }
            }
        }
    }
}

class VBoxTLSSocketFactory extends SSLSocketFactory
{
    private final SSLSocketFactory sf;

    private void setupSocket(SSLSocket s)
    {
        String[] oldproto = s.getEnabledProtocols();
        List<String> protolist = new ArrayList<String>();
        for (int i = 0; i < oldproto.length; i++)
            if (oldproto[i].toUpperCase().startsWith("TLS"))
                protolist.add(oldproto[i]);
        String[] newproto = protolist.toArray(new String[protolist.size()]);
        s.setEnabledProtocols(newproto);
    }

    public VBoxTLSSocketFactory()
    {
        SSLSocketFactory tmp = null;
        try
        {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, null, null);
            tmp = sc.getSocketFactory();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        sf = tmp;
    }

    public static SocketFactory getDefault()
    {
        return new VBoxTLSSocketFactory();
    }

    public Socket createSocket(Socket socket, String host, int port,
                               boolean autoClose) throws IOException, UnknownHostException
    {
        SSLSocket s = (SSLSocket)sf.createSocket(socket, host, port, autoClose);
        setupSocket(s);
        return s;
    }

    public Socket createSocket() throws IOException
    {
        SSLSocket s = (SSLSocket)sf.createSocket();
        setupSocket(s);
        return s;
    }

    public Socket createSocket(InetAddress host, int port) throws IOException
    {
        SSLSocket s = (SSLSocket)sf.createSocket(host, port);
        setupSocket(s);
        return s;
    }

    public Socket createSocket(InetAddress address, int port,
                               InetAddress localAddress, int localPort) throws IOException
    {
        SSLSocket s = (SSLSocket)sf.createSocket(address, port, localAddress, localPort);
        setupSocket(s);
        return s;
    }

    public Socket createSocket(String host, int port) throws IOException, UnknownHostException
    {
        SSLSocket s = (SSLSocket)sf.createSocket(host, port);
        setupSocket(s);
        return s;
    }

    public Socket createSocket(String host, int port,
                               InetAddress localHost, int localPort) throws IOException, UnknownHostException
    {
        SSLSocket s = (SSLSocket)sf.createSocket(host, port, localHost, localPort);
        setupSocket(s);
        return s;
    }

    public String[] getDefaultCipherSuites()
    {
        return sf.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites()
    {
        return sf.getSupportedCipherSuites();
    }
}


public class VirtualBoxManager
{
    private static PortPool pool = new PortPool(true);
    private static final ObjectRefManager objMgr = new ObjectRefManager();
    protected VboxPortType port;

    private IVirtualBox vbox;

    private VirtualBoxManager()
    {
    }

    public void markShutdown() {
    	objMgr.markShutdown();
    }
    
    public static void initPerThread()
    {
    }

    public static void deinitPerThread()
    {
    }

    public void connect(String url, String username, String passwd)
    {
        this.port = pool.getPort();
        try
        {
            ((BindingProvider)port).getRequestContext().
                put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);

            // Unfortunately there is no official way to make JAX-WS use
            // TLS only, which means that a rather tedious approach is
            // unavoidable (implementing a TLS only SSLSocketFactory,
            // because the default one associated with a TLS SSLContext
            // happily uses SSLv2/3 handshakes, which make TLS servers
            // drop the connection), and additionally a not standardized,
            // shotgun approach is needed to make the relevant JAX-WS
            // implementations use this factory.
            VBoxTLSSocketFactory sf = new VBoxTLSSocketFactory();
            ((BindingProvider)port).getRequestContext().
                put("com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory", sf);
            ((BindingProvider)port).getRequestContext().
                put("com.sun.xml.ws.transport.https.client.SSLSocketFactory", sf);

            String handle = port.iWebsessionManagerLogon(username, passwd);
            this.objMgr.preventObjRelease();
            try
            {
                this.vbox = new IVirtualBox(handle, this.objMgr, port);
            }
            finally
            {
                this.objMgr.allowObjRelease();
            }
        }
        catch (Throwable t)
        {
            if (this.port != null && pool != null)
            {
                pool.releasePort(this.port);
                this.port = null;
            }
            // we have to throw smth derived from RuntimeException
            throw new VBoxException(t.getMessage(), t, this.objMgr, this.port);
        }
    }

    public void connect(String url, String username, String passwd,
                        Map<String, Object> requestContext, Map<String, Object> responseContext)
    {
        this.port = pool.getPort();
        try
        {
            ((BindingProvider)port).getRequestContext();
            if (requestContext != null)
                ((BindingProvider)port).getRequestContext().putAll(requestContext);

            if (responseContext != null)
                ((BindingProvider)port).getResponseContext().putAll(responseContext);

            ((BindingProvider)port).getRequestContext().
                put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
            String handle = port.iWebsessionManagerLogon(username, passwd);
            this.objMgr.preventObjRelease();
            try
            {
                this.vbox = new IVirtualBox(handle, this.objMgr, port);
            }
            finally
            {
                this.objMgr.allowObjRelease();
            }
        }
        catch (Throwable t)
        {
            if (this.port != null && pool != null)
            {
                pool.releasePort(this.port);
                this.port = null;
            }
            // we have to throw smth derived from RuntimeException
            throw new VBoxException(t.getMessage(), t, this.objMgr, this.port);
        }
    }

    public void disconnect()
    {
        if (this.port == null)
            return;

        try
        {
            if (this.vbox != null && port != null)
                port.iWebsessionManagerLogoff(this.vbox.getWrapped());
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.objMgr, this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.objMgr, this.port);
        }
        finally
        {
            if (this.port != null)
            {
                pool.releasePort(this.port);
                this.port = null;
            }
        }
    }

    public String getClientAPIVersion()
    {
        return "7_0";
    }

    public IVirtualBox getVBox()
    {
        return this.vbox;
    }

    public ISession getSessionObject()
    {
        if (this.vbox == null)
            throw new VBoxException("connect first");
        try
        {
            String handle = port.iWebsessionManagerGetSessionObject(this.vbox.getWrapped());
            this.objMgr.preventObjRelease();
            try
            {
                return new ISession(handle, this.objMgr, port);
            }
            finally
            {
                this.objMgr.allowObjRelease();
            }
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.objMgr, this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.objMgr, this.port);
        }
    }

    public ISession openMachineSession(IMachine m) throws Exception
    {
        ISession s = getSessionObject();
        m.lockMachine(s, LockType.Shared);
        return s;
    }

    public void closeMachineSession(ISession s)
    {
          if (s != null)
            s.unlockMachine();
    }

    public static synchronized VirtualBoxManager createInstance(String home)
    {
        return new VirtualBoxManager();
    }

    public IEventListener createListener(Object sink)
    {
        throw new VBoxException("no active listeners here");
    }

    public void cleanup()
    {
        disconnect();
        deinitPerThread();
    }

    public void waitForEvents(long tmo)
    {
        try
        {
          Thread.sleep(tmo);
        }
        catch (InterruptedException ie)
        {
        }
    }

    protected void finalize() throws Throwable
    {
        try
        {
            cleanup();
        }
        catch(Exception e)
        {
        }
        finally
        {
            super.finalize();
        }
    }
}

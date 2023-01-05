
/*
 *  Copyright (C) 2010-2011 Oracle Corporation
 *
 *  This file is part of the VirtualBox SDK, as available from
 *  http://www.virtualbox.org.  This library is free software; you can
 *  redistribute it and/or modify it under the terms of the GNU Lesser General
 *  Public License as published by the Free Software Foundation, in version 2.1
 *  as it comes in the "COPYING.LIB" file of the VirtualBox SDK distribution.
 *  This library is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 *  License for more details.
 *
 * VirtualBoxManager.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.virtualbox_4_2.jaxws.InvalidObjectFaultMsg;
import org.virtualbox_4_2.jaxws.RuntimeFaultMsg;
import org.virtualbox_4_2.jaxws.VboxPortType;
import org.virtualbox_4_2.jaxws.VboxService;

class PortPool {
	private final static String wsdlFile = "vboxwebService_4_2.wsdl";

	private Map<VboxPortType, Integer> known;
	private boolean initStarted;
	private VboxService svc;

	PortPool(boolean usePreinit) {
		known = new HashMap<VboxPortType, Integer>();

		if (usePreinit) {
			new Thread(new Runnable() {
				public void run() {
					// need to sync on something else but 'this'
					synchronized (known) {
						initStarted = true;
						known.notify();
					}

					preinit();
				}
			}).start();

			synchronized (known) {
				while (!initStarted) {
					try {
						known.wait();
					} catch (InterruptedException e) {
						break;
					}
				}
			}
		}
	}

	private synchronized void preinit() {
		VboxPortType port = getPort();
		releasePort(port);
	}

	synchronized VboxPortType getPort() {
		VboxPortType port = null;
		int ttl = 0;

		for (VboxPortType cur : known.keySet()) {
			int value = known.get(cur);
			if ((value & 0x10000) == 0) {
				port = cur;
				ttl = value & 0xffff;
				break;
			}
		}

		if (port == null) {
			if (svc == null) {
				URL wsdl = PortPool.class.getClassLoader().getResource(wsdlFile);
				if (wsdl == null)
					throw new LinkageError(wsdlFile + " not found, but it should have been in the jar");
				svc = new VboxService(wsdl, new QName("http://www.virtualbox.org/Service", "vboxService"));
			}
			port = svc.getVboxServicePort();
			// reuse this object 0x10 times
			ttl = 0x10;
		}
		// mark as used
		known.put(port, new Integer(0x10000 | ttl));
		return port;
	}

	synchronized void releasePort(VboxPortType port) {
		Integer val = known.get(port);
		if (val == null || val == 0) {
			// know you not
			return;
		}

		int v = val;
		int ttl = v & 0xffff;
		// decrement TTL, and throw away port if used too much times
		if (--ttl <= 0) {
			known.remove(port);
		} else {
			v = ttl; // set new TTL and clear busy bit
			known.put(port, v);
		}
	}
}

public class VirtualBoxManager {
	private static PortPool pool = new PortPool(true);
	protected VboxPortType port;

	private IVirtualBox vbox;

	private VirtualBoxManager() {
	}

	public static void initPerThread() {
	}

	public static void deinitPerThread() {
	}

	/**
	 * Creates a connection to the VBoxWebSrv-Deamon. You might find the executable
	 * in the Virtualbox-binary-folder.
	 * <p>
	 * Usually the url is a typical root-http-url on port <code>18083</code>. In
	 * example <code>http://localhost:18083/</code>. Remote systems might be allowed
	 * but for technical reasons you might expire performance issues. I8n domains
	 * are not allowed, please concider using punycode domains.
	 * <p>
	 * The scheme of the url is http, the protocol is not.
	 * <p>
	 * Make sure you disconnected to the server using {@link #disconnect()} before
	 * opening a new Connection.
	 * 
	 * @param url      The URL to the system that have the VBoxWebSrv running, never
	 *                 <code>null</code>
	 * @param username The username of the process-owner of VBoxWebSrv. This is the
	 *                 technical username, a eMail for a microsoft-account is not a
	 *                 valid username. You should concider creating a local/offline
	 *                 user-account that executes VBoxWebSrv. Never
	 *                 <code>null</code>
	 * @param passwd   The password of the user. This password must be a typical
	 *                 system-password, a PIN or a fingerprint is not valid.
	 *                 Kerberos is not supported. Never <code>null</code>
	 * 
	 * @throws VBoxException If anything is thrown, no matter if {@link Error} or
	 *                       {@link Exception}. This is like a fault barrier, even
	 *                       {@link OutOfMemoryError oome's} are encoupsuled. In
	 *                       order to inspect the real reason of the Exception. You
	 *                       should use the {@link VBoxException#getCause()}
	 */
	public void connect(String url, String username, String passwd) {
		this.port = pool.getPort();
		try {
			((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
			String handle = port.iWebsessionManagerLogon(username, passwd);
			this.vbox = new IVirtualBox(handle, port);
		} catch (Throwable t) {
			if (this.port != null && pool != null) {
				pool.releasePort(this.port);
				this.port = null;
			}
			// we have to throw smth derived from RuntimeException
			throw new VBoxException(t, t.getMessage());
		}
	}

	public void connect(String url, String username, String passwd, Map<String, Object> requestContext,
			Map<String, Object> responseContext) {
		this.port = pool.getPort();

		try {
			((BindingProvider) port).getRequestContext();
			if (requestContext != null)
				((BindingProvider) port).getRequestContext().putAll(requestContext);

			if (responseContext != null)
				((BindingProvider) port).getResponseContext().putAll(responseContext);

			((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
			String handle = port.iWebsessionManagerLogon(username, passwd);
			this.vbox = new IVirtualBox(handle, port);
		} catch (Throwable t) {
			if (this.port != null && pool != null) {
				pool.releasePort(this.port);
				this.port = null;
			}
			// we have to throw smth derived from RuntimeException
			throw new VBoxException(t, t.getMessage());
		}
	}

	public void disconnect() {
		try {
			if (this.vbox != null)
				port.iWebsessionManagerLogoff(this.vbox.getWrapped());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} finally {
			if (this.port != null) {
				pool.releasePort(this.port);
				this.port = null;
			}
		}
	}

	/**
	 * This returns the connected Virtualbox-API. If no connection has been
	 * established this method will return <code>null</code>.
	 * <p>
	 * This API offers a variety of functions to the running Virtualbox. The variety
	 * is similar to all functionalities you could use the built-in gui of
	 * virtualbox. But there are more functions you can discover.
	 * 
	 * @return The Virtualbox-API, or <code>null</code>
	 */
	public IVirtualBox getVBox() {
		return this.vbox;
	}

	public ISession getSessionObject() {
		if (this.vbox == null)
			throw new RuntimeException("connect first");
		try {
			String handle = port.iWebsessionManagerGetSessionObject(this.vbox.getWrapped());
			return new ISession(handle, port);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public ISession openMachineSession(IMachine m) throws Exception {
		ISession s = getSessionObject();
		m.lockMachine(s, LockType.Shared);
		return s;
	}

	public void closeMachineSession(ISession s) {
		if (s != null)
			s.unlockMachine();
	}

	/**
	 * This method will create a {@link VirtualBoxManager manager} instance.
	 * 
	 * @param home Not used at the moment. Designed maybe for machines having
	 *             multiple virtualbox installations
	 * @return The new instance of {@link VirtualBoxManager}, never
	 *         <code>null</code>
	 */
	public static synchronized VirtualBoxManager createInstance(String home) {
		return new VirtualBoxManager();
	}

	public IEventListener createListener(Object sink) {
		throw new RuntimeException("no active listeners here");
	}

	public void cleanup() {
		disconnect();
		deinitPerThread();
	}

	public boolean progressBar(IProgress p, int wait) {
		long end = System.currentTimeMillis() + wait;
		while (!p.getCompleted()) {
			p.waitForCompletion(wait);
			if (System.currentTimeMillis() >= end)
				return false;
		}

		return true;
	}

	/**
	 * This method will start a VM. This is a blocking process.
	 * <p>
	 * This method will use no putenv-values.
	 * 
	 * @param name    The name or UUID of the machine, never <code>null</code>.
	 *                Notice that the name might be ambiguous, it is suggested to
	 *                use the uuid of the VM
	 * @param type    The type of the VM, valid values are: <tt>gui</tt>,
	 *                <tt>headless</tt>, <tt>sdl</tt>. <tt>emergencystop</tt> is
	 *                currently reserved for future use. Empty-string is allowed and
	 *                means the default type configured for this specific VM.
	 *                <code>null</code> will be rewritten to <tt>gui</tt>. Invalid
	 *                values will result in unexpected behavior
	 * @param timeout The timeout (in ms) the progressbar uses. A value of 0 will
	 *                always provoke the return value <code>false</code>. This
	 *                timeout is for informational issues only, will not prevent a
	 *                threadlock and will not affect the time this method is
	 *                running.
	 * @return <code>true</code> if the VM has been started in time,
	 *         <code>false</code> otherwise
	 */
	public boolean startVm(String name, String type, int timeout) {
		IMachine m = vbox.findMachine(name);
		if (m == null)
			return false;
		ISession session = getSessionObject();

		if (type == null)
			type = "gui";
		IProgress p = m.launchVMProcess(session, type, "");
		progressBar(p, timeout);
		session.unlockMachine();
		return true;
	}

	public void waitForEvents(long tmo) {
	}

	protected void finalize() throws Throwable {
		try {
			cleanup();
		} catch (Exception e) {
		} finally {
			super.finalize();
		}
	}
}

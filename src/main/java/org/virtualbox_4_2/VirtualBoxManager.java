
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

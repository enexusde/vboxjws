
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
 * IEventListener.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.InvalidObjectFaultMsg;
import org.virtualbox_4_2.jaxws.RuntimeFaultMsg;
import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Event listener. An event listener can work in either active or passive mode,
 * depending on the way it was registered. See {@link org.virtualbox_4_2.IEvent}
 * for an introduction to VirtualBox event handling.
 * 
 * Interface ID: <tt>{67099191-32E7-4F6C-85EE-422304C71B90}</tt>
 */
public class IEventListener extends IUnknown {

	public IEventListener(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	public static IEventListener queryInterface(IUnknown obj) {
		return obj == null ? null : new IEventListener(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Handle event callback for active listeners. It is not called for passive
	 * listeners. After calling {@link #handleEvent(org.virtualbox_4_2.IEvent)} on
	 * all active listeners and having received acknowledgement from all passive
	 * listeners via
	 * {@link org.virtualbox_4_2.IEventSource#eventProcessed(org.virtualbox_4_2.IEventListener,org.virtualbox_4_2.IEvent)},
	 * the event is marked as processed and
	 * {@link org.virtualbox_4_2.IEvent#waitProcessed(Integer)} will return
	 * immediately.
	 * 
	 * @param event Event available.
	 * 
	 */
	public void handleEvent(org.virtualbox_4_2.IEvent event) {
		try {
			port.iEventListenerHandleEvent(obj, ((event == null) ? null : event.getWrapped()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

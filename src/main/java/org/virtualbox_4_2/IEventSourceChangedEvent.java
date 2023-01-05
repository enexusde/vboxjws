
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
 * IEventSourceChangedEvent.java
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
 * Notification when an event source state changes (listener added or removed).
 * 
 * Interface ID: <tt>{E7932CB8-F6D4-4AB6-9CBF-558EB8959A6A}</tt>
 */
public class IEventSourceChangedEvent extends IEvent {

	public IEventSourceChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Event listener which has changed.
	 * 
	 * @return org.virtualbox_4_2.IEventListener
	 * 
	 */
	public org.virtualbox_4_2.IEventListener getListener() {
		try {
			String retVal = port.iEventSourceChangedEventGetListener(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IEventListener(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether listener was added or removed.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getAdd() {
		try {
			Boolean retVal = port.iEventSourceChangedEventGetAdd(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IEventSourceChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IEventSourceChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

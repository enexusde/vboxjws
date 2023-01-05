
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
 * ISerialPortChangedEvent.java
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
 * Notification when a property of one of the virtual
 * {@link org.virtualbox_4_2.IMachine#getSerialPort(Long)} changes. Interested
 * callees should use ISerialPort methods and attributes to find out what has
 * changed.
 * 
 * Interface ID: <tt>{3BA329DC-659C-488B-835C-4ECA7AE71C6C}</tt>
 */
public class ISerialPortChangedEvent extends IEvent {

	public ISerialPortChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Serial port that is subject to change.
	 * 
	 * @return org.virtualbox_4_2.ISerialPort
	 * 
	 */
	public org.virtualbox_4_2.ISerialPort getSerialPort() {
		try {
			String retVal = port.iSerialPortChangedEventGetSerialPort(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.ISerialPort(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static ISerialPortChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new ISerialPortChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

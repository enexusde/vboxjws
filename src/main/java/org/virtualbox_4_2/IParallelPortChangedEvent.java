
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
 * IParallelPortChangedEvent.java
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
 * {@link org.virtualbox_4_2.IMachine#getParallelPort(Long)} changes. Interested
 * callees should use ISerialPort methods and attributes to find out what has
 * changed.
 * 
 * Interface ID: <tt>{813C99FC-9849-4F47-813E-24A75DC85615}</tt>
 */
public class IParallelPortChangedEvent extends IEvent {

	public IParallelPortChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Parallel port that is subject to change.
	 * 
	 * @return org.virtualbox_4_2.IParallelPort
	 * 
	 */
	public org.virtualbox_4_2.IParallelPort getParallelPort() {
		try {
			String retVal = port.iParallelPortChangedEventGetParallelPort(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IParallelPort(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IParallelPortChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IParallelPortChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

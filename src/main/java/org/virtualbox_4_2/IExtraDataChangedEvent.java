
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
 * IExtraDataChangedEvent.java
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
 * Notification when machine specific or global extra data has changed.
 * 
 * Interface ID: <tt>{024F00CE-6E0B-492A-A8D0-968472A94DC7}</tt>
 */
public class IExtraDataChangedEvent extends IEvent {

	public IExtraDataChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * ID of the machine this event relates to. Null for global extra data changes.
	 * 
	 * @return String
	 * 
	 */
	public String getMachineId() {
		try {
			String retVal = port.iExtraDataChangedEventGetMachineId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Extra data key that has changed.
	 * 
	 * @return String
	 * 
	 */
	public String getKey() {
		try {
			String retVal = port.iExtraDataChangedEventGetKey(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Extra data value for the given key.
	 * 
	 * @return String
	 * 
	 */
	public String getValue() {
		try {
			String retVal = port.iExtraDataChangedEventGetValue(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IExtraDataChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IExtraDataChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

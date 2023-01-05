
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
 * IExtraDataCanChangeEvent.java
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
 * Notification when someone tries to change extra data for either the given
 * machine or (if null) global extra data. This gives the chance to veto against
 * changes.
 * 
 * Interface ID: <tt>{245D88BD-800A-40F8-87A6-170D02249A55}</tt>
 */
public class IExtraDataCanChangeEvent extends IVetoEvent {

	public IExtraDataCanChangeEvent(String wrapped, VboxPortType port) {
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
			String retVal = port.iExtraDataCanChangeEventGetMachineId(obj);
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
			String retVal = port.iExtraDataCanChangeEventGetKey(obj);
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
			String retVal = port.iExtraDataCanChangeEventGetValue(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IExtraDataCanChangeEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IExtraDataCanChangeEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

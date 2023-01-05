
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
 * IMachineEvent.java
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
 * Base abstract interface for all machine events. Interface ID:
 * <tt>{92ED7B1A-0D96-40ED-AE46-A564D484325E}</tt>
 */
public class IMachineEvent extends IEvent {

	public IMachineEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * ID of the machine this event relates to.
	 * 
	 * @return String
	 * 
	 */
	public String getMachineId() {
		try {
			String retVal = port.iMachineEventGetMachineId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IMachineEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IMachineEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

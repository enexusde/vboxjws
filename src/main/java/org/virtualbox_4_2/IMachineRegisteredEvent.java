
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
 * IMachineRegisteredEvent.java
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
 * The given machine was registered or unregistered within this VirtualBox
 * installation.
 * 
 * Interface ID: <tt>{C354A762-3FF2-4F2E-8F09-07382EE25088}</tt>
 */
public class IMachineRegisteredEvent extends IMachineEvent {

	public IMachineRegisteredEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * If true, the machine was registered, otherwise it was unregistered.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getRegistered() {
		try {
			Boolean retVal = port.iMachineRegisteredEventGetRegistered(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IMachineRegisteredEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IMachineRegisteredEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

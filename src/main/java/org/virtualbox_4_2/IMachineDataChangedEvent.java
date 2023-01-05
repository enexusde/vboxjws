
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
 * IMachineDataChangedEvent.java
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
 * Any of the settings of the given machine has changed.
 * 
 * Interface ID: <tt>{ABE94809-2E88-4436-83D7-50F3E64D0503}</tt>
 */
public class IMachineDataChangedEvent extends IMachineEvent {

	public IMachineDataChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * true if the settings change is temporary. All permanent settings changes will
	 * trigger an event, and only temporary settings changes for running VMs will
	 * trigger an event. Note: sending events for temporary changes is NOT
	 * IMPLEMENTED.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getTemporary() {
		try {
			Boolean retVal = port.iMachineDataChangedEventGetTemporary(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IMachineDataChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IMachineDataChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

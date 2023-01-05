
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
 * IStateChangedEvent.java
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
 * Notification when the execution state of the machine has changed. The new
 * state is given.
 * 
 * Interface ID: <tt>{4376693C-CF37-453B-9289-3B0F521CAF27}</tt>
 */
public class IStateChangedEvent extends IEvent {

	public IStateChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * New machine state.
	 * 
	 * @return org.virtualbox_4_2.MachineState
	 * 
	 */
	public org.virtualbox_4_2.MachineState getState() {
		try {
			org.virtualbox_4_2.jaxws.MachineState retVal = port.iStateChangedEventGetState(obj);
			return org.virtualbox_4_2.MachineState.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IStateChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IStateChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

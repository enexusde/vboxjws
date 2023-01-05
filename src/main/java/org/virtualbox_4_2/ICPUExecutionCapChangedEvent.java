
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
 * ICPUExecutionCapChangedEvent.java
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
 * Notification when the CPU execution cap changes.
 * 
 * Interface ID: <tt>{DFA7E4F5-B4A4-44CE-85A8-127AC5EB59DC}</tt>
 */
public class ICPUExecutionCapChangedEvent extends IEvent {

	public ICPUExecutionCapChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * The new CPU execution cap value. (1-100)
	 * 
	 * @return Long
	 * 
	 */
	public Long getExecutionCap() {
		try {
			Long retVal = port.icpuExecutionCapChangedEventGetExecutionCap(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static ICPUExecutionCapChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new ICPUExecutionCapChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

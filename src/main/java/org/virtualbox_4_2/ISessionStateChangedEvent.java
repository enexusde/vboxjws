
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
 * ISessionStateChangedEvent.java
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
 * The state of the session for the given machine was changed.
 * 
 * @see org.virtualbox_4_2.IMachine#getSessionState()
 * 
 *      Interface ID: <tt>{714A3EEF-799A-4489-86CD-FE8E45B2FF8E}</tt>
 */
public class ISessionStateChangedEvent extends IMachineEvent {

	public ISessionStateChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * New session state.
	 * 
	 * @return org.virtualbox_4_2.SessionState
	 * 
	 */
	public org.virtualbox_4_2.SessionState getState() {
		try {
			org.virtualbox_4_2.jaxws.SessionState retVal = port.iSessionStateChangedEventGetState(obj);
			return org.virtualbox_4_2.SessionState.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static ISessionStateChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new ISessionStateChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

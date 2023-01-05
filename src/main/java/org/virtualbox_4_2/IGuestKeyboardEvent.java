
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
 * IGuestKeyboardEvent.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import java.util.List;

import org.virtualbox_4_2.jaxws.InvalidObjectFaultMsg;
import org.virtualbox_4_2.jaxws.RuntimeFaultMsg;
import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Notification when guest keyboard event happens.
 * 
 * Interface ID: <tt>{88394258-7006-40D4-B339-472EE3801844}</tt>
 */
public class IGuestKeyboardEvent extends IEvent {

	public IGuestKeyboardEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Array of scancodes.
	 * 
	 * @return List<Integer>
	 * 
	 */
	public List<Integer> getScancodes() {
		try {
			List<Integer> retVal = port.iGuestKeyboardEventGetScancodes(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IGuestKeyboardEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IGuestKeyboardEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

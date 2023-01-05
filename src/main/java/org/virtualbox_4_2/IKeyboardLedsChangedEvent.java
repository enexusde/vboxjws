
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
 * IKeyboardLedsChangedEvent.java
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
 * Notification when the guest OS executes the KBD_CMD_SET_LEDS command to alter
 * the state of the keyboard LEDs.
 * 
 * Interface ID: <tt>{6DDEF35E-4737-457B-99FC-BC52C851A44F}</tt>
 */
public class IKeyboardLedsChangedEvent extends IEvent {

	public IKeyboardLedsChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * NumLock status.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getNumLock() {
		try {
			Boolean retVal = port.iKeyboardLedsChangedEventGetNumLock(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * CapsLock status.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getCapsLock() {
		try {
			Boolean retVal = port.iKeyboardLedsChangedEventGetCapsLock(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * ScrollLock status.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getScrollLock() {
		try {
			Boolean retVal = port.iKeyboardLedsChangedEventGetScrollLock(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IKeyboardLedsChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IKeyboardLedsChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

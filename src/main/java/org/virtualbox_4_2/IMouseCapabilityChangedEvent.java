
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
 * IMouseCapabilityChangedEvent.java
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
 * Notification when the mouse capabilities reported by the guest have changed.
 * The new capabilities are passed.
 * 
 * Interface ID: <tt>{D633AD48-820C-4207-B46C-6BD3596640D5}</tt>
 */
public class IMouseCapabilityChangedEvent extends IEvent {

	public IMouseCapabilityChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Supports absolute coordinates.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getSupportsAbsolute() {
		try {
			Boolean retVal = port.iMouseCapabilityChangedEventGetSupportsAbsolute(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Supports relative coordinates.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getSupportsRelative() {
		try {
			Boolean retVal = port.iMouseCapabilityChangedEventGetSupportsRelative(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * If host cursor is needed.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getNeedsHostCursor() {
		try {
			Boolean retVal = port.iMouseCapabilityChangedEventGetNeedsHostCursor(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IMouseCapabilityChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IMouseCapabilityChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

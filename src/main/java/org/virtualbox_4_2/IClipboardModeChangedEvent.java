
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
 * IClipboardModeChangedEvent.java
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
 * Notification when the shared clipboard mode changes.
 * 
 * Interface ID: <tt>{CAC21692-7997-4595-A731-3A509DB604E5}</tt>
 */
public class IClipboardModeChangedEvent extends IEvent {

	public IClipboardModeChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * The new clipboard mode.
	 * 
	 * @return org.virtualbox_4_2.ClipboardMode
	 * 
	 */
	public org.virtualbox_4_2.ClipboardMode getClipboardMode() {
		try {
			org.virtualbox_4_2.jaxws.ClipboardMode retVal = port.iClipboardModeChangedEventGetClipboardMode(obj);
			return org.virtualbox_4_2.ClipboardMode.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IClipboardModeChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IClipboardModeChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

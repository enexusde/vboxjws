
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
 * IGuestPropertyChangedEvent.java
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
 * Notification when a guest property has changed.
 * 
 * Interface ID: <tt>{3F63597A-26F1-4EDB-8DD2-6BDDD0912368}</tt>
 */
public class IGuestPropertyChangedEvent extends IMachineEvent {

	public IGuestPropertyChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * The name of the property that has changed.
	 * 
	 * @return String
	 * 
	 */
	public String getName() {
		try {
			String retVal = port.iGuestPropertyChangedEventGetName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The new property value.
	 * 
	 * @return String
	 * 
	 */
	public String getValue() {
		try {
			String retVal = port.iGuestPropertyChangedEventGetValue(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The new property flags.
	 * 
	 * @return String
	 * 
	 */
	public String getFlags() {
		try {
			String retVal = port.iGuestPropertyChangedEventGetFlags(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IGuestPropertyChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IGuestPropertyChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

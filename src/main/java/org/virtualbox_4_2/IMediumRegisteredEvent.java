
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
 * IMediumRegisteredEvent.java
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
 * The given medium was registered or unregistered within this VirtualBox
 * installation.
 * 
 * Interface ID: <tt>{53FAC49A-B7F1-4A5A-A4EF-A11DD9C2A458}</tt>
 */
public class IMediumRegisteredEvent extends IEvent {

	public IMediumRegisteredEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * ID of the medium this event relates to.
	 * 
	 * @return String
	 * 
	 */
	public String getMediumId() {
		try {
			String retVal = port.iMediumRegisteredEventGetMediumId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Type of the medium this event relates to.
	 * 
	 * @return org.virtualbox_4_2.DeviceType
	 * 
	 */
	public org.virtualbox_4_2.DeviceType getMediumType() {
		try {
			org.virtualbox_4_2.jaxws.DeviceType retVal = port.iMediumRegisteredEventGetMediumType(obj);
			return org.virtualbox_4_2.DeviceType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * If true, the medium was registered, otherwise it was unregistered.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getRegistered() {
		try {
			Boolean retVal = port.iMediumRegisteredEventGetRegistered(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IMediumRegisteredEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IMediumRegisteredEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

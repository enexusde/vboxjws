
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
 * IStorageDeviceChangedEvent.java
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
 * Notification when a
 * {@link org.virtualbox_4_2.IMachine#getMediumAttachments()} is attached or
 * removed.
 * 
 * Interface ID: <tt>{8A5C2DCE-E341-49D4-AFCE-C95979F7D70C}</tt>
 */
public class IStorageDeviceChangedEvent extends IEvent {

	public IStorageDeviceChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Storage device that is subject to change.
	 * 
	 * @return org.virtualbox_4_2.IMediumAttachment
	 * 
	 */
	public org.virtualbox_4_2.IMediumAttachment getStorageDevice() {
		try {
			org.virtualbox_4_2.jaxws.IMediumAttachment retVal = port.iStorageDeviceChangedEventGetStorageDevice(obj);
			return (retVal != null) ? new org.virtualbox_4_2.IMediumAttachment(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether the device was removed or added to the VM.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getRemoved() {
		try {
			Boolean retVal = port.iStorageDeviceChangedEventGetRemoved(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IStorageDeviceChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IStorageDeviceChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

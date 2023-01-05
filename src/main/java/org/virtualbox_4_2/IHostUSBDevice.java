
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
 * IHostUSBDevice.java
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
 * The IHostUSBDevice interface represents a physical USB device attached to the
 * host computer.
 * 
 * Besides properties inherited from IUSBDevice, this interface adds the
 * {@link #getState()} property that holds the current state of the USB device.
 * 
 * 
 * @see org.virtualbox_4_2.IHost#getUSBDevices()
 * @see org.virtualbox_4_2.IHost#getUSBDeviceFilters()
 * 
 *      Interface ID: <tt>{173B4B44-D268-4334-A00D-B6521C9A740A}</tt>
 */
public class IHostUSBDevice extends IUSBDevice {

	public IHostUSBDevice(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Current state of the device.
	 * 
	 * @return org.virtualbox_4_2.USBDeviceState
	 * 
	 */
	public org.virtualbox_4_2.USBDeviceState getState() {
		try {
			org.virtualbox_4_2.jaxws.USBDeviceState retVal = port.iHostUSBDeviceGetState(obj);
			return org.virtualbox_4_2.USBDeviceState.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IHostUSBDevice queryInterface(IUnknown obj) {
		return obj == null ? null : new IHostUSBDevice(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

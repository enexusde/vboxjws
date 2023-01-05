
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
 * IUSBDevice.java
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
 * The IUSBDevice interface represents a virtual USB device attached to the
 * virtual machine.
 * 
 * A collection of objects implementing this interface is stored in the
 * {@link org.virtualbox_4_2.IConsole#getUSBDevices()} attribute which lists all
 * USB devices attached to a running virtual machine's USB controller.
 * 
 * Interface ID: <tt>{F8967B0B-4483-400F-92B5-8B675D98A85B}</tt>
 */
public class IUSBDevice extends IUnknown {

	public IUSBDevice(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Unique USB device ID. This ID is built from #vendorId, #productId, #revision
	 * and #serialNumber.
	 * 
	 * @return String
	 * 
	 */
	public String getId() {
		try {
			String retVal = port.iusbDeviceGetId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Vendor ID.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getVendorId() {
		try {
			Integer retVal = port.iusbDeviceGetVendorId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Product ID.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getProductId() {
		try {
			Integer retVal = port.iusbDeviceGetProductId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Product revision number. This is a packed BCD represented as unsigned short.
	 * The high byte is the integer part and the low byte is the decimal.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getRevision() {
		try {
			Integer retVal = port.iusbDeviceGetRevision(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Manufacturer string.
	 * 
	 * @return String
	 * 
	 */
	public String getManufacturer() {
		try {
			String retVal = port.iusbDeviceGetManufacturer(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Product string.
	 * 
	 * @return String
	 * 
	 */
	public String getProduct() {
		try {
			String retVal = port.iusbDeviceGetProduct(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Serial number string.
	 * 
	 * @return String
	 * 
	 */
	public String getSerialNumber() {
		try {
			String retVal = port.iusbDeviceGetSerialNumber(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Host specific address of the device.
	 * 
	 * @return String
	 * 
	 */
	public String getAddress() {
		try {
			String retVal = port.iusbDeviceGetAddress(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Host USB port number the device is physically connected to.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getPort() {
		try {
			Integer retVal = port.iusbDeviceGetPort(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The major USB version of the device - 1 or 2.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getVersion() {
		try {
			Integer retVal = port.iusbDeviceGetVersion(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The major USB version of the host USB port the device is physically connected
	 * to - 1 or 2. For devices not connected to anything this will have the same
	 * value as the version attribute.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getPortVersion() {
		try {
			Integer retVal = port.iusbDeviceGetPortVersion(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Whether the device is physically connected to a remote VRDE client or to a
	 * local host machine.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getRemote() {
		try {
			Boolean retVal = port.iusbDeviceGetRemote(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IUSBDevice queryInterface(IUnknown obj) {
		return obj == null ? null : new IUSBDevice(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

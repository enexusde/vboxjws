
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
 * IHostPCIDevicePlugEvent.java
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
 * Notification when host PCI device is plugged/unplugged. Plugging usually
 * takes place on VM startup, unplug - when
 * {@link org.virtualbox_4_2.IMachine#detachHostPCIDevice(Integer)} is called.
 * 
 * 
 * @see org.virtualbox_4_2.IMachine#detachHostPCIDevice(Integer)
 * 
 *      Interface ID: <tt>{A0BAD6DF-D612-47D3-89D4-DB3992533948}</tt>
 */
public class IHostPCIDevicePlugEvent extends IMachineEvent {

	public IHostPCIDevicePlugEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * If device successfully plugged or unplugged.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getPlugged() {
		try {
			Boolean retVal = port.iHostPCIDevicePlugEventGetPlugged(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * If operation was successful, if false - 'message' attribute may be of
	 * interest.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getSuccess() {
		try {
			Boolean retVal = port.iHostPCIDevicePlugEventGetSuccess(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Attachment info for this device.
	 * 
	 * @return org.virtualbox_4_2.IPCIDeviceAttachment
	 * 
	 */
	public org.virtualbox_4_2.IPCIDeviceAttachment getAttachment() {
		try {
			org.virtualbox_4_2.jaxws.IPCIDeviceAttachment retVal = port.iHostPCIDevicePlugEventGetAttachment(obj);
			return (retVal != null) ? new org.virtualbox_4_2.IPCIDeviceAttachment(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Optional error message.
	 * 
	 * @return String
	 * 
	 */
	public String getMessage() {
		try {
			String retVal = port.iHostPCIDevicePlugEventGetMessage(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IHostPCIDevicePlugEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IHostPCIDevicePlugEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

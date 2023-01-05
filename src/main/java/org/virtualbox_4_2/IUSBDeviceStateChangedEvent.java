
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
 * IUSBDeviceStateChangedEvent.java
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
 * Notification when a USB device is attached to or detached from the virtual
 * USB controller.
 * 
 * This notification is sent as a result of the indirect request to attach the
 * device because it matches one of the machine USB filters, or as a result of
 * the direct request issued by
 * {@link org.virtualbox_4_2.IConsole#attachUSBDevice(String)} or
 * {@link org.virtualbox_4_2.IConsole#detachUSBDevice(String)}.
 * 
 * This notification is sent in case of both a succeeded and a failed request
 * completion. When the request succeeds, the error parameter is null, and the
 * given device has been already added to (when attached is true) or removed
 * from (when attached is false) the collection represented by
 * {@link org.virtualbox_4_2.IConsole#getUSBDevices()}. On failure, the
 * collection doesn't change and the error parameter represents the error
 * message describing the failure.
 * 
 * Interface ID: <tt>{806DA61B-6679-422A-B629-51B06B0C6D93}</tt>
 */
public class IUSBDeviceStateChangedEvent extends IEvent {

	public IUSBDeviceStateChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Device that is subject to state change.
	 * 
	 * @return org.virtualbox_4_2.IUSBDevice
	 * 
	 */
	public org.virtualbox_4_2.IUSBDevice getDevice() {
		try {
			String retVal = port.iusbDeviceStateChangedEventGetDevice(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IUSBDevice(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * true if the device was attached and false otherwise.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getAttached() {
		try {
			Boolean retVal = port.iusbDeviceStateChangedEventGetAttached(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * null on success or an error message object on failure.
	 * 
	 * @return org.virtualbox_4_2.IVirtualBoxErrorInfo
	 * 
	 */
	public org.virtualbox_4_2.IVirtualBoxErrorInfo getError() {
		try {
			String retVal = port.iusbDeviceStateChangedEventGetError(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IVirtualBoxErrorInfo(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IUSBDeviceStateChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IUSBDeviceStateChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

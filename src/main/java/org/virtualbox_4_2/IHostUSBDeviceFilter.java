
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
 * IHostUSBDeviceFilter.java
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
 * The IHostUSBDeviceFilter interface represents a global filter for a physical
 * USB device used by the host computer. Used indirectly in
 * {@link org.virtualbox_4_2.IHost#getUSBDeviceFilters()}.
 * 
 * Using filters of this type, the host computer determines the initial state of
 * the USB device after it is physically attached to the host's USB controller.
 * 
 * 
 * NOTE: The {@link org.virtualbox_4_2.IUSBDeviceFilter#getRemote()} attribute
 * is ignored by this type of filters, because it makes sense only for
 * {@link org.virtualbox_4_2.IUSBController#getDeviceFilters()}.
 * 
 * 
 * @see org.virtualbox_4_2.IHost#getUSBDeviceFilters()
 * 
 *      Interface ID: <tt>{4CC70246-D74A-400F-8222-3900489C0374}</tt>
 */
public class IHostUSBDeviceFilter extends IUSBDeviceFilter {

	public IHostUSBDeviceFilter(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Action performed by the host when an attached USB device matches this filter.
	 * 
	 * @return org.virtualbox_4_2.USBDeviceFilterAction
	 * 
	 */
	public org.virtualbox_4_2.USBDeviceFilterAction getAction() {
		try {
			org.virtualbox_4_2.jaxws.USBDeviceFilterAction retVal = port.iHostUSBDeviceFilterGetAction(obj);
			return org.virtualbox_4_2.USBDeviceFilterAction.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Action performed by the host when an attached USB device matches this filter.
	 * 
	 * @param value org.virtualbox_4_2.USBDeviceFilterAction
	 * 
	 */
	public void setAction(org.virtualbox_4_2.USBDeviceFilterAction value) {
		try {
			port.iHostUSBDeviceFilterSetAction(obj,
					org.virtualbox_4_2.jaxws.USBDeviceFilterAction.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IHostUSBDeviceFilter queryInterface(IUnknown obj) {
		return obj == null ? null : new IHostUSBDeviceFilter(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

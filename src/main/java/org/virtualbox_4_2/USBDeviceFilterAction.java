
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
 * USBDeviceFilterAction.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Actions for host USB device filters.
 * 
 * @see org.virtualbox_4_2.IHostUSBDeviceFilter
 * @see org.virtualbox_4_2.USBDeviceState
 * 
 *      Interface ID: <tt>{CBC30A49-2F4E-43B5-9DA6-121320475933}</tt>
 */
public enum USBDeviceFilterAction {

	/**
	 * Null value (never used by the API).
	 */
	Null(0),
	/**
	 * Ignore the matched USB device.
	 */
	Ignore(1),
	/**
	 * Hold the matched USB device.
	 */
	Hold(2);

	private final int value;

	USBDeviceFilterAction(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static USBDeviceFilterAction fromValue(long v) {
		for (USBDeviceFilterAction c : USBDeviceFilterAction.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static USBDeviceFilterAction fromValue(String v) {
		return valueOf(USBDeviceFilterAction.class, v);
	}
}

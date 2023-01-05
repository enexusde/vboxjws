
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
 * DeviceType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Device type.
 * 
 * Interface ID: <tt>{6D9420F7-0B56-4636-99F9-7346F1B01E57}</tt>
 */
public enum DeviceType {

	/**
	 * 
	 * Null value, may also mean "no device" (not allowed for
	 * {@link org.virtualbox_4_2.IConsole#getDeviceActivity(org.virtualbox_4_2.DeviceType)}).
	 * 
	 */
	Null(0),
	/**
	 * Floppy device.
	 */
	Floppy(1),
	/**
	 * CD/DVD-ROM device.
	 */
	DVD(2),
	/**
	 * Hard disk device.
	 */
	HardDisk(3),
	/**
	 * Network device.
	 */
	Network(4),
	/**
	 * USB device.
	 */
	USB(5),
	/**
	 * Shared folder device.
	 */
	SharedFolder(6);

	private final int value;

	DeviceType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static DeviceType fromValue(long v) {
		for (DeviceType c : DeviceType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static DeviceType fromValue(String v) {
		return valueOf(DeviceType.class, v);
	}
}

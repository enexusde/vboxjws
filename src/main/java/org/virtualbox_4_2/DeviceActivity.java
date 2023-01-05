
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
 * DeviceActivity.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Device activity for
 * {@link org.virtualbox_4_2.IConsole#getDeviceActivity(org.virtualbox_4_2.DeviceType)}.
 * 
 * Interface ID: <tt>{6FC8AEAA-130A-4EB5-8954-3F921422D707}</tt>
 */
public enum DeviceActivity {

	Null(0), Idle(1), Reading(2), Writing(3);

	private final int value;

	DeviceActivity(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static DeviceActivity fromValue(long v) {
		for (DeviceActivity c : DeviceActivity.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static DeviceActivity fromValue(String v) {
		return valueOf(DeviceActivity.class, v);
	}
}

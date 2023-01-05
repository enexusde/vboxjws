
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
 * PointingHIDType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Type of pointing device used in a virtual machine.
 * 
 * Interface ID: <tt>{E44B2F7B-72BA-44FB-9E53-2186014F0D17}</tt>
 */
public enum PointingHIDType {

	/**
	 * No mouse.
	 */
	None(1),
	/**
	 * PS/2 auxiliary device, a.k.a. mouse.
	 */
	PS2Mouse(2),
	/**
	 * USB mouse (relative pointer).
	 */
	USBMouse(3),
	/**
	 * USB tablet (absolute pointer).
	 */
	USBTablet(4),
	/**
	 * Combined device, working as PS/2 or USB mouse, depending on guest behavior.
	 * Using of such device can have negative performance implications.
	 */
	ComboMouse(5);

	private final int value;

	PointingHIDType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static PointingHIDType fromValue(long v) {
		for (PointingHIDType c : PointingHIDType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static PointingHIDType fromValue(String v) {
		return valueOf(PointingHIDType.class, v);
	}
}

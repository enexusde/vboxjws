
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
 * KeyboardHIDType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Type of keyboard device used in a virtual machine.
 * 
 * Interface ID: <tt>{383E43D7-5C7C-4EC8-9CB8-EDA1BCCD6699}</tt>
 */
public enum KeyboardHIDType {

	/**
	 * No keyboard.
	 */
	None(1),
	/**
	 * PS/2 keyboard.
	 */
	PS2Keyboard(2),
	/**
	 * USB keyboard.
	 */
	USBKeyboard(3),
	/**
	 * Combined device, working as PS/2 or USB keyboard, depending on guest
	 * behavior. Using of such device can have negative performance implications.
	 */
	ComboKeyboard(4);

	private final int value;

	KeyboardHIDType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static KeyboardHIDType fromValue(long v) {
		for (KeyboardHIDType c : KeyboardHIDType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static KeyboardHIDType fromValue(String v) {
		return valueOf(KeyboardHIDType.class, v);
	}
}

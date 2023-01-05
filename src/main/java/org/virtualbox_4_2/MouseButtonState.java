
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
 * MouseButtonState.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Mouse button state.
 * 
 * Interface ID: <tt>{9EE094B8-B28A-4D56-A166-973CB588D7F8}</tt>
 */
public enum MouseButtonState {

	LeftButton(0x01), RightButton(0x02), MiddleButton(0x04), WheelUp(0x08), WheelDown(0x10), XButton1(0x20),
	XButton2(0x40), MouseStateMask(0x7F);

	private final int value;

	MouseButtonState(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static MouseButtonState fromValue(long v) {
		for (MouseButtonState c : MouseButtonState.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static MouseButtonState fromValue(String v) {
		return valueOf(MouseButtonState.class, v);
	}
}

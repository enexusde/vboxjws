
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
 * ClipboardMode.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Host-Guest clipboard interchange mode.
 * 
 * Interface ID: <tt>{33364716-4008-4701-8F14-BE0FA3D62950}</tt>
 */
public enum ClipboardMode {

	Disabled(0), HostToGuest(1), GuestToHost(2), Bidirectional(3);

	private final int value;

	ClipboardMode(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static ClipboardMode fromValue(long v) {
		for (ClipboardMode c : ClipboardMode.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static ClipboardMode fromValue(String v) {
		return valueOf(ClipboardMode.class, v);
	}
}

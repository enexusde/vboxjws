
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
 * AccessMode.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Access mode for opening files.
 * 
 * Interface ID: <tt>{1DA0007C-DDF7-4BE8-BCAC-D84A1558785F}</tt>
 */
public enum AccessMode {

	ReadOnly(1), ReadWrite(2);

	private final int value;

	AccessMode(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static AccessMode fromValue(long v) {
		for (AccessMode c : AccessMode.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static AccessMode fromValue(String v) {
		return valueOf(AccessMode.class, v);
	}
}

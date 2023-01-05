
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
 * DirectoryCreateFlag.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Directory creation flags.
 * 
 * Interface ID: <tt>{BD721B0E-CED5-4F79-B368-249897C32A36}</tt>
 */
public enum DirectoryCreateFlag {

	/**
	 * No flag set.
	 */
	None(0),
	/**
	 * No error if existing, make parent directories as needed.
	 */
	Parents(1);

	private final int value;

	DirectoryCreateFlag(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static DirectoryCreateFlag fromValue(long v) {
		for (DirectoryCreateFlag c : DirectoryCreateFlag.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static DirectoryCreateFlag fromValue(String v) {
		return valueOf(DirectoryCreateFlag.class, v);
	}
}

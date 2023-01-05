
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
 * SymlinkReadFlag.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Symbolic link reading flags.
 * 
 * Interface ID: <tt>{B7FE2B9D-790E-4B25-8ADF-1CA33026931F}</tt>
 */
public enum SymlinkReadFlag {

	/**
	 * No flags set.
	 */
	None(0),
	/**
	 * Don't allow symbolic links as part of the path.
	 */
	NoSymlinks(1);

	private final int value;

	SymlinkReadFlag(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static SymlinkReadFlag fromValue(long v) {
		for (SymlinkReadFlag c : SymlinkReadFlag.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static SymlinkReadFlag fromValue(String v) {
		return valueOf(SymlinkReadFlag.class, v);
	}
}


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
 * SymlinkType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Symbolic link types.
 * 
 * Interface ID: <tt>{37794668-F8F1-4714-98A5-6F8FA2ED0118}</tt>
 */
public enum SymlinkType {

	/**
	 * It is not known what is being targeted.
	 */
	Unknown(0),
	/**
	 * The link targets a directory.
	 */
	Directory(1),
	/**
	 * The link targets a file (or whatever else).
	 */
	File(2);

	private final int value;

	SymlinkType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static SymlinkType fromValue(long v) {
		for (SymlinkType c : SymlinkType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static SymlinkType fromValue(String v) {
		return valueOf(SymlinkType.class, v);
	}
}

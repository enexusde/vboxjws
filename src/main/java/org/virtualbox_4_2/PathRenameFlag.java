
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
 * PathRenameFlag.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Path renaming flags.
 * 
 * Interface ID: <tt>{F3BAA09F-C758-453D-B91C-C7787D76351D}</tt>
 */
public enum PathRenameFlag {

	/**
	 * No flag set.
	 */
	None(0),
	/**
	 * Do not replace anything.
	 */
	NoReplace(1),
	/**
	 * This will replace attempt any target which isn't a directory.
	 */
	Replace(2),
	/**
	 * Don't allow symbolic links as part of the path.
	 */
	NoSymlinks(4);

	private final int value;

	PathRenameFlag(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static PathRenameFlag fromValue(long v) {
		for (PathRenameFlag c : PathRenameFlag.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static PathRenameFlag fromValue(String v) {
		return valueOf(PathRenameFlag.class, v);
	}
}

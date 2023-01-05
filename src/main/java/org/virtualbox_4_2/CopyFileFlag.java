
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
 * CopyFileFlag.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * File copying flags.
 * 
 * Interface ID: <tt>{23F79FDF-738A-493D-B80B-42D607C9B916}</tt>
 */
public enum CopyFileFlag {

	/**
	 * No flag set.
	 */
	None(0),
	/**
	 * Copy directories recursively.
	 */
	Recursive(1),
	/**
	 * Only copy when the source file is newer than the destination file or when the
	 * destination file is missing.
	 */
	Update(2),
	/**
	 * Follow symbolic links.
	 */
	FollowLinks(4);

	private final int value;

	CopyFileFlag(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static CopyFileFlag fromValue(long v) {
		for (CopyFileFlag c : CopyFileFlag.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static CopyFileFlag fromValue(String v) {
		return valueOf(CopyFileFlag.class, v);
	}
}

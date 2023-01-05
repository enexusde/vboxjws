
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
 * DirectoryRemoveRecFlag.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Directory recursive removement flags.
 * 
 * Interface ID: <tt>{455AABF0-7692-48F6-9061-F21579B65769}</tt>
 */
public enum DirectoryRemoveRecFlag {

	/**
	 * No flag set.
	 */
	None(0),
	/**
	 * Delete the content of the directory and the directory itself.
	 */
	ContentAndDir(1),
	/**
	 * Only delete the content of the directory, omit the directory it self.
	 */
	ContentOnly(2);

	private final int value;

	DirectoryRemoveRecFlag(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static DirectoryRemoveRecFlag fromValue(long v) {
		for (DirectoryRemoveRecFlag c : DirectoryRemoveRecFlag.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static DirectoryRemoveRecFlag fromValue(String v) {
		return valueOf(DirectoryRemoveRecFlag.class, v);
	}
}

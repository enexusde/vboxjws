
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
 * FileSeekType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * File seeking types.
 * 
 * Interface ID: <tt>{1B73F4F3-3515-4073-A506-76878D9E2541}</tt>
 */
public enum FileSeekType {

	/**
	 * Seek from the start of the file.
	 */
	Set(0),
	/**
	 * Seek from the current file position.
	 */
	Current(1);

	private final int value;

	FileSeekType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static FileSeekType fromValue(long v) {
		for (FileSeekType c : FileSeekType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static FileSeekType fromValue(String v) {
		return valueOf(FileSeekType.class, v);
	}
}

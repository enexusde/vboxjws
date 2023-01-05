
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
 * FsObjType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * File system object type.
 * 
 * Interface ID: <tt>{A1ED437C-B3C3-4CA2-B19C-4239D658D5E8}</tt>
 */
public enum FsObjType {

	/**
	 * Type is undefined / unknown.
	 */
	Undefined(0),
	/**
	 * Named pipe.
	 */
	FIFO(1),
	/**
	 * Character device.
	 */
	DevChar(10),
	/**
	 * Block device.
	 */
	DevBlock(11),
	/**
	 * Directory.
	 */
	Directory(50),
	/**
	 * File.
	 */
	File(80),
	/**
	 * Symlink.
	 */
	Symlink(100),
	/**
	 * Socket.
	 */
	Socket(200),
	/**
	 * Whiteout.
	 */
	Whiteout(400);

	private final int value;

	FsObjType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static FsObjType fromValue(long v) {
		for (FsObjType c : FsObjType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static FsObjType fromValue(String v) {
		return valueOf(FsObjType.class, v);
	}
}

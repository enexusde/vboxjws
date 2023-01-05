
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
 * VFSType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Virtual file systems supported by VFSExplorer.
 * 
 * Interface ID: <tt>{813999BA-B949-48A8-9230-AADC6285E2F2}</tt>
 */
public enum VFSType {

	File(1), Cloud(2), S3(3), WebDav(4);

	private final int value;

	VFSType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static VFSType fromValue(long v) {
		for (VFSType c : VFSType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static VFSType fromValue(String v) {
		return valueOf(VFSType.class, v);
	}
}

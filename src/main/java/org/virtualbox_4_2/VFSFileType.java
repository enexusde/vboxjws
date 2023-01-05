
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
 * VFSFileType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * File types known by VFSExplorer.
 * 
 * Interface ID: <tt>{714333CD-44E2-415F-A245-D378FA9B1242}</tt>
 */
public enum VFSFileType {

	Unknown(1), Fifo(2), DevChar(3), Directory(4), DevBlock(5), File(6), SymLink(7), Socket(8), WhiteOut(9);

	private final int value;

	VFSFileType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static VFSFileType fromValue(long v) {
		for (VFSFileType c : VFSFileType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static VFSFileType fromValue(String v) {
		return valueOf(VFSFileType.class, v);
	}
}

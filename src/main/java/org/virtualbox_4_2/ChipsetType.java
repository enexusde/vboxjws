
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
 * ChipsetType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Type of emulated chipset (mostly southbridge).
 * 
 * Interface ID: <tt>{8B4096A8-A7C3-4D3B-BBB1-05A0A51EC394}</tt>
 */
public enum ChipsetType {

	/**
	 * null value. Never used by the API.
	 */
	Null(0),
	/**
	 * A PIIX3 (PCI IDE ISA Xcelerator) chipset.
	 */
	PIIX3(1),
	/**
	 * A ICH9 (I/O Controller Hub) chipset.
	 */
	ICH9(2);

	private final int value;

	ChipsetType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static ChipsetType fromValue(long v) {
		for (ChipsetType c : ChipsetType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static ChipsetType fromValue(String v) {
		return valueOf(ChipsetType.class, v);
	}
}

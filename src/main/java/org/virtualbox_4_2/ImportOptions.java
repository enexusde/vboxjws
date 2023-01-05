
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
 * ImportOptions.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import java.util.List;

/**
 * 
 * Import options, used with
 * {@link org.virtualbox_4_2.IAppliance#importMachines(List)}.
 * 
 * Interface ID: <tt>{0A981523-3B20-4004-8EE3-DFD322202ACE}</tt>
 */
public enum ImportOptions {

	/**
	 * Don't generate new MAC addresses of the attached network adapters.
	 */
	KeepAllMACs(1),
	/**
	 * Don't generate new MAC addresses of the attached network adapters when they
	 * are using NAT.
	 */
	KeepNATMACs(2);

	private final int value;

	ImportOptions(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static ImportOptions fromValue(long v) {
		for (ImportOptions c : ImportOptions.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static ImportOptions fromValue(String v) {
		return valueOf(ImportOptions.class, v);
	}
}

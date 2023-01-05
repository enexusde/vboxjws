
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
 * CPUPropertyType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Virtual CPU property type. This enumeration represents possible values of the
 * IMachine get- and setCPUProperty methods.
 * 
 * Interface ID: <tt>{24D356A6-2F45-4ABD-B977-1CBE9C4701F5}</tt>
 */
public enum CPUPropertyType {

	/**
	 * Null value (never used by the API).
	 */
	Null(0),
	/**
	 * 
	 * This setting determines whether VirtualBox will expose the Physical Address
	 * Extension (PAE) feature of the host CPU to the guest. Note that in case PAE
	 * is not available, it will not be reported.
	 * 
	 */
	PAE(1),
	/**
	 * 
	 * This setting determines whether VirtualBox will expose a synthetic CPU to the
	 * guest to allow teleporting between host systems that differ significantly.
	 * 
	 */
	Synthetic(2);

	private final int value;

	CPUPropertyType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static CPUPropertyType fromValue(long v) {
		for (CPUPropertyType c : CPUPropertyType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static CPUPropertyType fromValue(String v) {
		return valueOf(CPUPropertyType.class, v);
	}
}

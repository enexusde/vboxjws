
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
 * AdditionsFacilityClass.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Guest Additions facility classes.
 * 
 * Interface ID: <tt>{446451B2-C88D-4E5D-84C9-91BC7F533F5F}</tt>
 */
public enum AdditionsFacilityClass {

	/**
	 * No/invalid class.
	 */
	None(0),
	/**
	 * Driver.
	 */
	Driver(10),
	/**
	 * System service.
	 */
	Service(30),
	/**
	 * Program.
	 */
	Program(50),
	/**
	 * Feature.
	 */
	Feature(100),
	/**
	 * Third party.
	 */
	ThirdParty(999),
	/**
	 * All facility classes selected.
	 */
	All(2147483646);

	private final int value;

	AdditionsFacilityClass(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static AdditionsFacilityClass fromValue(long v) {
		for (AdditionsFacilityClass c : AdditionsFacilityClass.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static AdditionsFacilityClass fromValue(String v) {
		return valueOf(AdditionsFacilityClass.class, v);
	}
}


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
 * AdditionsRunLevelType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Guest Additions run level type.
 * 
 * Interface ID: <tt>{A25417EE-A9DD-4F5B-B0DC-377860087754}</tt>
 */
public enum AdditionsRunLevelType {

	/**
	 * Guest Additions are not loaded.
	 */
	None(0),
	/**
	 * Guest drivers are loaded.
	 */
	System(1),
	/**
	 * Common components (such as application services) are loaded.
	 */
	Userland(2),
	/**
	 * Per-user desktop components are loaded.
	 */
	Desktop(3);

	private final int value;

	AdditionsRunLevelType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static AdditionsRunLevelType fromValue(long v) {
		for (AdditionsRunLevelType c : AdditionsRunLevelType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static AdditionsRunLevelType fromValue(String v) {
		return valueOf(AdditionsRunLevelType.class, v);
	}
}

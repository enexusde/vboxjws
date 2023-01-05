
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
 * ProcessPriority.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Process priorities.
 * 
 * Interface ID: <tt>{EE8CAC50-E232-49FE-806B-D1214D9C2E49}</tt>
 */
public enum ProcessPriority {

	/**
	 * Invalid priority, do not use.
	 */
	Invalid(0),
	/**
	 * Default process priority determined by the OS.
	 */
	Default(1);

	private final int value;

	ProcessPriority(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static ProcessPriority fromValue(long v) {
		for (ProcessPriority c : ProcessPriority.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static ProcessPriority fromValue(String v) {
		return valueOf(ProcessPriority.class, v);
	}
}

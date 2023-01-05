
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
 * Scope.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Scope of the operation.
 * 
 * A generic enumeration used in various methods to define the action or
 * argument scope.
 * 
 * Interface ID: <tt>{7C91096E-499E-4ECA-9F9B-9001438D7855}</tt>
 */
public enum Scope {

	Global(0), Machine(1), Session(2);

	private final int value;

	Scope(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static Scope fromValue(long v) {
		for (Scope c : Scope.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static Scope fromValue(String v) {
		return valueOf(Scope.class, v);
	}
}

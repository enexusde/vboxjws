
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
 * LockType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Used with
 * {@link org.virtualbox_4_2.IMachine#lockMachine(org.virtualbox_4_2.ISession,org.virtualbox_4_2.LockType)}.
 * 
 * Interface ID: <tt>{168A6A8E-12FD-4878-A1F9-38A750A56089}</tt>
 */
public enum LockType {

	/**
	 * Lock the machine for writing.
	 */
	Write(2),
	/**
	 * Request only a shared read lock for remote-controlling the machine.
	 */
	Shared(1),
	/**
	 * Lock the machine for writing, and create objects necessary for running a VM
	 * in this process.
	 */
	VM(3);

	private final int value;

	LockType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static LockType fromValue(long v) {
		for (LockType c : LockType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static LockType fromValue(String v) {
		return valueOf(LockType.class, v);
	}
}


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
 * SessionType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Session type. This enumeration represents possible values of the
 * {@link org.virtualbox_4_2.ISession#getType()} attribute.
 * 
 * Interface ID: <tt>{A13C02CB-0C2C-421E-8317-AC0E8AAA153A}</tt>
 */
public enum SessionType {

	/**
	 * Null value (never used by the API).
	 */
	Null(0),
	/**
	 * 
	 * Session has acquired an exclusive write lock on a machine using
	 * {@link org.virtualbox_4_2.IMachine#lockMachine(org.virtualbox_4_2.ISession,org.virtualbox_4_2.LockType)}.
	 * 
	 */
	WriteLock(1),
	/**
	 * 
	 * Session has launched a VM process using
	 * {@link org.virtualbox_4_2.IMachine#launchVMProcess(org.virtualbox_4_2.ISession,String,String)}
	 */
	Remote(2),
	/**
	 * 
	 * Session has obtained a link to another session using
	 * {@link org.virtualbox_4_2.IMachine#lockMachine(org.virtualbox_4_2.ISession,org.virtualbox_4_2.LockType)}
	 */
	Shared(3);

	private final int value;

	SessionType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static SessionType fromValue(long v) {
		for (SessionType c : SessionType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static SessionType fromValue(String v) {
		return valueOf(SessionType.class, v);
	}
}

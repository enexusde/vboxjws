
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
 * GuestMonitorChangedEventType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * How the guest monitor has been changed.
 * 
 * Interface ID: <tt>{EF172985-7E36-4297-95BE-E46396968D66}</tt>
 */
public enum GuestMonitorChangedEventType {

	/**
	 * 
	 * The guest monitor has been enabled by the guest.
	 * 
	 */
	Enabled(0),
	/**
	 * 
	 * The guest monitor has been disabled by the guest.
	 * 
	 */
	Disabled(1),
	/**
	 * 
	 * The guest monitor origin has changed in the guest.
	 * 
	 */
	NewOrigin(2);

	private final int value;

	GuestMonitorChangedEventType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static GuestMonitorChangedEventType fromValue(long v) {
		for (GuestMonitorChangedEventType c : GuestMonitorChangedEventType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static GuestMonitorChangedEventType fromValue(String v) {
		return valueOf(GuestMonitorChangedEventType.class, v);
	}
}

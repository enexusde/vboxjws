
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
 * BandwidthGroupType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Type of a bandwidth control group.
 * 
 * Interface ID: <tt>{1D92B67D-DC69-4BE9-AD4C-93A01E1E0C8E}</tt>
 */
public enum BandwidthGroupType {

	/**
	 * 
	 * Null type, must be first.
	 * 
	 */
	Null(0),
	/**
	 * 
	 * The bandwidth group controls disk I/O.
	 * 
	 */
	Disk(1),
	/**
	 * 
	 * The bandwidth group controls network I/O.
	 * 
	 */
	Network(2);

	private final int value;

	BandwidthGroupType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static BandwidthGroupType fromValue(long v) {
		for (BandwidthGroupType c : BandwidthGroupType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static BandwidthGroupType fromValue(String v) {
		return valueOf(BandwidthGroupType.class, v);
	}
}

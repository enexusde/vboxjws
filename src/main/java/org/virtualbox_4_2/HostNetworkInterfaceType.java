
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
 * HostNetworkInterfaceType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Network interface type.
 * 
 * Interface ID: <tt>{67431B00-9946-48A2-BC02-B25C5919F4F3}</tt>
 */
public enum HostNetworkInterfaceType {

	Bridged(1), HostOnly(2);

	private final int value;

	HostNetworkInterfaceType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static HostNetworkInterfaceType fromValue(long v) {
		for (HostNetworkInterfaceType c : HostNetworkInterfaceType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static HostNetworkInterfaceType fromValue(String v) {
		return valueOf(HostNetworkInterfaceType.class, v);
	}
}

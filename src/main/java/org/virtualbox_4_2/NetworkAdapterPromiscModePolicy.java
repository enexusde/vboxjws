
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
 * NetworkAdapterPromiscModePolicy.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * The promiscuous mode policy of an interface.
 * 
 * Interface ID: <tt>{C963768A-376F-4C85-8D84-D8CED4B7269E}</tt>
 */
public enum NetworkAdapterPromiscModePolicy {

	/**
	 * Deny promiscuous mode requests.
	 */
	Deny(1),
	/**
	 * 
	 * Allow promicuous mode, but restrict the scope it to the internal network so
	 * that it only applies to other VMs.
	 * 
	 */
	AllowNetwork(2),
	/**
	 * 
	 * Allow promicuous mode, include unrelated traffic going over the wire and
	 * internally on the host.
	 * 
	 */
	AllowAll(3);

	private final int value;

	NetworkAdapterPromiscModePolicy(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static NetworkAdapterPromiscModePolicy fromValue(long v) {
		for (NetworkAdapterPromiscModePolicy c : NetworkAdapterPromiscModePolicy.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static NetworkAdapterPromiscModePolicy fromValue(String v) {
		return valueOf(NetworkAdapterPromiscModePolicy.class, v);
	}
}

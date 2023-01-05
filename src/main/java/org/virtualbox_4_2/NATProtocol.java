
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
 * NATProtocol.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * Protocol definitions used with NAT port-forwarding rules. Interface ID:
 * <tt>{E90164BE-EB03-11DE-94AF-FFF9B1C1B19F}</tt>
 */
public enum NATProtocol {

	/**
	 * Port-forwarding uses UDP protocol.
	 */
	UDP(0),
	/**
	 * Port-forwarding uses TCP protocol.
	 */
	TCP(1);

	private final int value;

	NATProtocol(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static NATProtocol fromValue(long v) {
		for (NATProtocol c : NATProtocol.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static NATProtocol fromValue(String v) {
		return valueOf(NATProtocol.class, v);
	}
}


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
 * NATAliasMode.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Interface ID: <tt>{67772168-50D9-11DF-9669-7FB714EE4FA1}</tt>
 */
public enum NATAliasMode {

	/**
	
	*/
	AliasLog(0x1),
	/**
	
	*/
	AliasProxyOnly(0x02),
	/**
	
	*/
	AliasUseSamePorts(0x04);

	private final int value;

	NATAliasMode(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static NATAliasMode fromValue(long v) {
		for (NATAliasMode c : NATAliasMode.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static NATAliasMode fromValue(String v) {
		return valueOf(NATAliasMode.class, v);
	}
}

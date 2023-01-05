
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
 * NetworkAttachmentType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Network attachment type.
 * 
 * Interface ID: <tt>{2AC4BC71-6B82-417A-ACD1-F7426D2570D6}</tt>
 */
public enum NetworkAttachmentType {

	/**
	 * Null value, also means "not attached".
	 */
	Null(0), NAT(1), Bridged(2), Internal(3), HostOnly(4), Generic(5);

	private final int value;

	NetworkAttachmentType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static NetworkAttachmentType fromValue(long v) {
		for (NetworkAttachmentType c : NetworkAttachmentType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static NetworkAttachmentType fromValue(String v) {
		return valueOf(NetworkAttachmentType.class, v);
	}
}

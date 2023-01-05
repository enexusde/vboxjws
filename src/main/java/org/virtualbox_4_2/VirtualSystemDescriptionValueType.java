
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
 * VirtualSystemDescriptionValueType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * Used with
 * {@link org.virtualbox_4_2.IVirtualSystemDescription#getValuesByType(org.virtualbox_4_2.VirtualSystemDescriptionType,org.virtualbox_4_2.VirtualSystemDescriptionValueType)}
 * to describe the value type to fetch. Interface ID:
 * <tt>{56D9403F-3425-4118-9919-36F2A9B8C77C}</tt>
 */
public enum VirtualSystemDescriptionValueType {

	Reference(1), Original(2), Auto(3), ExtraConfig(4);

	private final int value;

	VirtualSystemDescriptionValueType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static VirtualSystemDescriptionValueType fromValue(long v) {
		for (VirtualSystemDescriptionValueType c : VirtualSystemDescriptionValueType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static VirtualSystemDescriptionValueType fromValue(String v) {
		return valueOf(VirtualSystemDescriptionValueType.class, v);
	}
}

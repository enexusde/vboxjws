
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
 * HWVirtExPropertyType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Hardware virtualization property type. This enumeration represents possible
 * values for the
 * {@link org.virtualbox_4_2.IMachine#getHWVirtExProperty(org.virtualbox_4_2.HWVirtExPropertyType)}
 * and
 * {@link org.virtualbox_4_2.IMachine#setHWVirtExProperty(org.virtualbox_4_2.HWVirtExPropertyType,Boolean)}
 * methods.
 * 
 * Interface ID: <tt>{CE81DFDD-D2B8-4A90-BBEA-40EE8B7FFCEE}</tt>
 */
public enum HWVirtExPropertyType {

	/**
	 * Null value (never used by the API).
	 */
	Null(0),
	/**
	 * 
	 * Whether hardware virtualization (VT-x/AMD-V) is enabled at all. If such
	 * extensions are not available, they will not be used.
	 * 
	 */
	Enabled(1),
	/**
	 * 
	 * Whether hardware virtualization is used exclusively by VirtualBox. When
	 * enabled, VirtualBox assumes it can acquire full and exclusive access to the
	 * VT-x or AMD-V feature of the host. To share these with other hypervisors, you
	 * must disable this property.
	 * 
	 */
	Exclusive(2),
	/**
	 * 
	 * Whether VT-x VPID is enabled. If this extension is not available, it will not
	 * be used.
	 * 
	 */
	VPID(3),
	/**
	 * 
	 * Whether Nested Paging is enabled. If this extension is not available, it will
	 * not be used.
	 * 
	 */
	NestedPaging(4),
	/**
	 * 
	 * Whether large page allocation is enabled; requires nested paging and a 64
	 * bits host.
	 * 
	 */
	LargePages(5),
	/**
	 * 
	 * Whether the VM should fail to start if hardware virtualization (VT-x/AMD-V)
	 * cannot be used. If not set, there will be an automatic fallback to software
	 * virtualization.
	 * 
	 */
	Force(6);

	private final int value;

	HWVirtExPropertyType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static HWVirtExPropertyType fromValue(long v) {
		for (HWVirtExPropertyType c : HWVirtExPropertyType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static HWVirtExPropertyType fromValue(String v) {
		return valueOf(HWVirtExPropertyType.class, v);
	}
}

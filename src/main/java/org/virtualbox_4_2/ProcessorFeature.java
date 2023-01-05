
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
 * ProcessorFeature.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * CPU features.
 * 
 * Interface ID: <tt>{64C38E6B-8BCF-45AD-AC03-9B406287C5BF}</tt>
 */
public enum ProcessorFeature {

	HWVirtEx(0), PAE(1), LongMode(2), NestedPaging(3);

	private final int value;

	ProcessorFeature(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static ProcessorFeature fromValue(long v) {
		for (ProcessorFeature c : ProcessorFeature.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static ProcessorFeature fromValue(String v) {
		return valueOf(ProcessorFeature.class, v);
	}
}

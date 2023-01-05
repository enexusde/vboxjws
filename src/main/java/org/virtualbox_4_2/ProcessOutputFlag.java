
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
 * ProcessOutputFlag.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Guest process output flags for specifying which type of output to retrieve.
 * 
 * Interface ID: <tt>{9979E85A-52BB-40B7-870C-57115E27E0F1}</tt>
 */
public enum ProcessOutputFlag {

	/**
	 * No flags set. Get output from stdout.
	 */
	None(0),
	/**
	 * Get output from stderr.
	 */
	StdErr(1);

	private final int value;

	ProcessOutputFlag(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static ProcessOutputFlag fromValue(long v) {
		for (ProcessOutputFlag c : ProcessOutputFlag.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static ProcessOutputFlag fromValue(String v) {
		return valueOf(ProcessOutputFlag.class, v);
	}
}


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
 * ProcessInputFlag.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Guest process input flags.
 * 
 * Interface ID: <tt>{5D38C1DD-2604-4DDF-92E5-0C0CDD3BDBD5}</tt>
 */
public enum ProcessInputFlag {

	/**
	 * No flag set.
	 */
	None(0),
	/**
	 * End of file (input) reached.
	 */
	EndOfFile(1);

	private final int value;

	ProcessInputFlag(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static ProcessInputFlag fromValue(long v) {
		for (ProcessInputFlag c : ProcessInputFlag.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static ProcessInputFlag fromValue(String v) {
		return valueOf(ProcessInputFlag.class, v);
	}
}

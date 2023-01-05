
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
 * ProcessWaitForFlag.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Process waiting flags. Multiple flags can be combined.
 * 
 * Interface ID: <tt>{23B550C7-78E1-437E-98F0-65FD9757BCD2}</tt>
 */
public enum ProcessWaitForFlag {

	/**
	 * No waiting flags specified. Do not use this.
	 */
	None(0),
	/**
	 * Wait for the process being started.
	 */
	Start(1),
	/**
	 * Wait for the process being terminated.
	 */
	Terminate(2),
	/**
	 * Wait for stdin becoming available.
	 */
	StdIn(4),
	/**
	 * Wait for data becoming available on stdout.
	 */
	StdOut(8),
	/**
	 * Wait for data becoming available on stderr.
	 */
	StdErr(16);

	private final int value;

	ProcessWaitForFlag(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static ProcessWaitForFlag fromValue(long v) {
		for (ProcessWaitForFlag c : ProcessWaitForFlag.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static ProcessWaitForFlag fromValue(String v) {
		return valueOf(ProcessWaitForFlag.class, v);
	}
}

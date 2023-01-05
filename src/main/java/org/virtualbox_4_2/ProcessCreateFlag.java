
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
 * ProcessCreateFlag.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Guest process execution flags.
 * 
 * Interface ID: <tt>{35192799-BFDE-405D-9BEA-C735AB9998E4}</tt>
 */
public enum ProcessCreateFlag {

	/**
	 * No flag set.
	 */
	None(0),
	/**
	 * Only use the specified timeout value to wait for starting the guest process -
	 * the guest process itself then uses an infinite timeout.
	 */
	WaitForProcessStartOnly(1),
	/**
	 * Do not report an error when executed processes are still alive when
	 * VBoxService or the guest OS is shutting down.
	 */
	IgnoreOrphanedProcesses(2),
	/**
	 * Do not show the started process according to the guest OS guidelines.
	 */
	Hidden(4),
	/**
	 * Do not use the user's profile data when exeuting a process. Only available
	 * for Windows guests.
	 */
	NoProfile(8),
	/**
	 * The guest process waits until all data from stdout is read out.
	 */
	WaitForStdOut(16),
	/**
	 * The guest process waits until all data from stderr is read out.
	 */
	WaitForStdErr(32),
	/**
	 * Expands environment variables in process arguments.
	 */
	ExpandArguments(64);

	private final int value;

	ProcessCreateFlag(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static ProcessCreateFlag fromValue(long v) {
		for (ProcessCreateFlag c : ProcessCreateFlag.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static ProcessCreateFlag fromValue(String v) {
		return valueOf(ProcessCreateFlag.class, v);
	}
}

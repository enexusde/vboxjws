
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
 * CloneMode.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import java.util.List;

/**
 * 
 * Clone mode, used with
 * {@link org.virtualbox_4_2.IMachine#cloneTo(org.virtualbox_4_2.IMachine,org.virtualbox_4_2.CloneMode,List)}.
 * 
 * Interface ID: <tt>{A7A159FE-5096-4B8D-8C3C-D033CB0B35A8}</tt>
 */
public enum CloneMode {

	/**
	 * Clone the state of the selected machine.
	 */
	MachineState(1),
	/**
	 * Clone the state of the selected machine and its child snapshots if present.
	 */
	MachineAndChildStates(2),
	/**
	 * Clone all states (including all snapshots) of the machine, regardless of the
	 * machine object used.
	 */
	AllStates(3);

	private final int value;

	CloneMode(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static CloneMode fromValue(long v) {
		for (CloneMode c : CloneMode.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static CloneMode fromValue(String v) {
		return valueOf(CloneMode.class, v);
	}
}

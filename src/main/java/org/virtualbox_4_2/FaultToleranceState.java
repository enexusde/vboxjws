
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
 * FaultToleranceState.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Used with {@link org.virtualbox_4_2.IMachine#getFaultToleranceState()}.
 * 
 * Interface ID: <tt>{5124F7EC-6B67-493C-9DEE-EE45A44114E1}</tt>
 */
public enum FaultToleranceState {

	/**
	 * No fault tolerance enabled.
	 */
	Inactive(1),
	/**
	 * Fault tolerant master VM.
	 */
	Master(2),
	/**
	 * Fault tolerant standby VM.
	 */
	Standby(3);

	private final int value;

	FaultToleranceState(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static FaultToleranceState fromValue(long v) {
		for (FaultToleranceState c : FaultToleranceState.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static FaultToleranceState fromValue(String v) {
		return valueOf(FaultToleranceState.class, v);
	}
}

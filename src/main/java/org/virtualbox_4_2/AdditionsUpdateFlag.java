
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
 * AdditionsUpdateFlag.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Guest Additions update flags.
 * 
 * Interface ID: <tt>{726A818D-18D6-4389-94E8-3E9E6826171A}</tt>
 */
public enum AdditionsUpdateFlag {

	/**
	 * No flag set.
	 */
	None(0),
	/**
	 * Starts the regular updating process and waits until the actual Guest
	 * Additions update inside the guest was started. This can be necessary due to
	 * needed interaction with the guest OS during the installation phase.
	 */
	WaitForUpdateStartOnly(1);

	private final int value;

	AdditionsUpdateFlag(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static AdditionsUpdateFlag fromValue(long v) {
		for (AdditionsUpdateFlag c : AdditionsUpdateFlag.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static AdditionsUpdateFlag fromValue(String v) {
		return valueOf(AdditionsUpdateFlag.class, v);
	}
}

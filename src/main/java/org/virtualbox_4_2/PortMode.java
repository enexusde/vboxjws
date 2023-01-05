
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
 * PortMode.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * The PortMode enumeration represents possible communication modes for the
 * virtual serial port device.
 * 
 * Interface ID: <tt>{533B5FE3-0185-4197-86A7-17E37DD39D76}</tt>
 */
public enum PortMode {

	/**
	 * Virtual device is not attached to any real host device.
	 */
	Disconnected(0),
	/**
	 * Virtual device is attached to a host pipe.
	 */
	HostPipe(1),
	/**
	 * Virtual device is attached to a host device.
	 */
	HostDevice(2),
	/**
	 * Virtual device is attached to a raw file.
	 */
	RawFile(3);

	private final int value;

	PortMode(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static PortMode fromValue(long v) {
		for (PortMode c : PortMode.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static PortMode fromValue(String v) {
		return valueOf(PortMode.class, v);
	}
}

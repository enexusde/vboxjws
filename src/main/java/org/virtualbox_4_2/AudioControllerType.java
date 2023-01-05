
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
 * AudioControllerType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Virtual audio controller type.
 * 
 * Interface ID: <tt>{7AFD395C-42C3-444E-8788-3CE80292F36C}</tt>
 */
public enum AudioControllerType {

	AC97(0), SB16(1), HDA(2);

	private final int value;

	AudioControllerType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static AudioControllerType fromValue(long v) {
		for (AudioControllerType c : AudioControllerType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static AudioControllerType fromValue(String v) {
		return valueOf(AudioControllerType.class, v);
	}
}

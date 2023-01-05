
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
 * AudioDriverType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Host audio driver type.
 * 
 * Interface ID: <tt>{4BCC3D73-C2FE-40DB-B72F-0C2CA9D68496}</tt>
 */
public enum AudioDriverType {

	/**
	 * Null value, also means "dummy audio driver".
	 */
	Null(0),
	/**
	 * Windows multimedia (Windows hosts only).
	 */
	WinMM(1),
	/**
	 * Open Sound System (Linux hosts only).
	 */
	OSS(2),
	/**
	 * Advanced Linux Sound Architecture (Linux hosts only).
	 */
	ALSA(3),
	/**
	 * DirectSound (Windows hosts only).
	 */
	DirectSound(4),
	/**
	 * CoreAudio (Mac hosts only).
	 */
	CoreAudio(5),
	/**
	 * Reserved for historical reasons.
	 */
	MMPM(6),
	/**
	 * PulseAudio (Linux hosts only).
	 */
	Pulse(7),
	/**
	 * Solaris audio (Solaris hosts only).
	 */
	SolAudio(8);

	private final int value;

	AudioDriverType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static AudioDriverType fromValue(long v) {
		for (AudioDriverType c : AudioDriverType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static AudioDriverType fromValue(String v) {
		return valueOf(AudioDriverType.class, v);
	}
}

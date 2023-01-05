
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
 * FirmwareType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Firmware type.
 * 
 * Interface ID: <tt>{B903F264-C230-483E-AC74-2B37CE60D371}</tt>
 */
public enum FirmwareType {

	/**
	 * BIOS Firmware.
	 */
	BIOS(1),
	/**
	 * EFI Firmware, bitness detected basing on OS type.
	 */
	EFI(2),
	/**
	 * Efi firmware, 32-bit.
	 */
	EFI32(3),
	/**
	 * Efi firmware, 64-bit.
	 */
	EFI64(4),
	/**
	 * Efi firmware, combined 32 and 64-bit.
	 */
	EFIDUAL(5);

	private final int value;

	FirmwareType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static FirmwareType fromValue(long v) {
		for (FirmwareType c : FirmwareType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static FirmwareType fromValue(String v) {
		return valueOf(FirmwareType.class, v);
	}
}

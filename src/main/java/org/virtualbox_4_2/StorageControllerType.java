
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
 * StorageControllerType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * The exact variant of storage controller hardware presented to the guest; see
 * {@link org.virtualbox_4_2.IStorageController#getControllerType()}.
 * 
 * Interface ID: <tt>{8A412B8A-F43E-4456-BD37-B474F0879A58}</tt>
 */
public enum StorageControllerType {

	/**
	 * null value. Never used by the API.
	 */
	Null(0),
	/**
	 * A SCSI controller of the LsiLogic variant.
	 */
	LsiLogic(1),
	/**
	 * A SCSI controller of the BusLogic variant.
	 */
	BusLogic(2),
	/**
	 * An Intel AHCI SATA controller; this is the only variant for SATA.
	 */
	IntelAhci(3),
	/**
	 * An IDE controller of the PIIX3 variant.
	 */
	PIIX3(4),
	/**
	 * An IDE controller of the PIIX4 variant.
	 */
	PIIX4(5),
	/**
	 * An IDE controller of the ICH6 variant.
	 */
	ICH6(6),
	/**
	 * A floppy disk controller; this is the only variant for floppy drives.
	 */
	I82078(7),
	/**
	 * A variant of the LsiLogic controller using SAS.
	 */
	LsiLogicSas(8);

	private final int value;

	StorageControllerType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static StorageControllerType fromValue(long v) {
		for (StorageControllerType c : StorageControllerType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static StorageControllerType fromValue(String v) {
		return valueOf(StorageControllerType.class, v);
	}
}

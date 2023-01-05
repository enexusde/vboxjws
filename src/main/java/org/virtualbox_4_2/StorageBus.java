
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
 * StorageBus.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * The bus type of the storage controller (IDE, SATA, SCSI, SAS or Floppy); see
 * {@link org.virtualbox_4_2.IStorageController#getBus()}.
 * 
 * Interface ID: <tt>{EEE67AB3-668D-4EF5-91E0-7025FE4A0D7A}</tt>
 */
public enum StorageBus {

	/**
	 * null value. Never used by the API.
	 */
	Null(0), IDE(1), SATA(2), SCSI(3), Floppy(4), SAS(5);

	private final int value;

	StorageBus(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static StorageBus fromValue(long v) {
		for (StorageBus c : StorageBus.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static StorageBus fromValue(String v) {
		return valueOf(StorageBus.class, v);
	}
}

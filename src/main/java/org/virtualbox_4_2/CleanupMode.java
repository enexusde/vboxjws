
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
 * CleanupMode.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * Cleanup mode, used with
 * {@link org.virtualbox_4_2.IMachine#unregister(org.virtualbox_4_2.CleanupMode)}.
 * 
 * Interface ID: <tt>{67897C50-7CCA-47A9-83F6-CE8FD8EB5441}</tt>
 */
public enum CleanupMode {

	/**
	 * Unregister only the machine, but neither delete snapshots nor detach media.
	 */
	UnregisterOnly(1),
	/**
	 * Delete all snapshots and detach all media but return none; this will keep all
	 * media registered.
	 */
	DetachAllReturnNone(2),
	/**
	 * Delete all snapshots, detach all media and return hard disks for closing, but
	 * not removable media.
	 */
	DetachAllReturnHardDisksOnly(3),
	/**
	 * Delete all snapshots, detach all media and return all media for closing.
	 */
	Full(4);

	private final int value;

	CleanupMode(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static CleanupMode fromValue(long v) {
		for (CleanupMode c : CleanupMode.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static CleanupMode fromValue(String v) {
		return valueOf(CleanupMode.class, v);
	}
}

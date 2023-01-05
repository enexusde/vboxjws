
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
 * MediumState.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Virtual medium state.
 * 
 * @see org.virtualbox_4_2.IMedium
 * 
 *      Interface ID: <tt>{EF41E980-E012-43CD-9DEA-479D4EF14D13}</tt>
 */
public enum MediumState {

	/**
	 * 
	 * Associated medium storage does not exist (either was not created yet or was
	 * deleted).
	 * 
	 */
	NotCreated(0),
	/**
	 * 
	 * Associated storage exists and accessible; this gets set if the accessibility
	 * check performed by {@link org.virtualbox_4_2.IMedium#refreshState()} was
	 * successful.
	 * 
	 */
	Created(1),
	/**
	 * 
	 * Medium is locked for reading (see
	 * {@link org.virtualbox_4_2.IMedium#lockRead()}), no data modification is
	 * possible.
	 * 
	 */
	LockedRead(2),
	/**
	 * 
	 * Medium is locked for writing (see
	 * {@link org.virtualbox_4_2.IMedium#lockWrite()}), no concurrent data reading
	 * or modification is possible.
	 * 
	 */
	LockedWrite(3),
	/**
	 * 
	 * Medium accessibility check (see
	 * {@link org.virtualbox_4_2.IMedium#refreshState()}) has not yet been
	 * performed, or else, associated medium storage is not accessible. In the first
	 * case, {@link org.virtualbox_4_2.IMedium#getLastAccessError()} is empty, in
	 * the second case, it describes the error that occurred.
	 * 
	 */
	Inaccessible(4),
	/**
	 * 
	 * Associated medium storage is being created.
	 * 
	 */
	Creating(5),
	/**
	 * 
	 * Associated medium storage is being deleted.
	 * 
	 */
	Deleting(6);

	private final int value;

	MediumState(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static MediumState fromValue(long v) {
		for (MediumState c : MediumState.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static MediumState fromValue(String v) {
		return valueOf(MediumState.class, v);
	}
}

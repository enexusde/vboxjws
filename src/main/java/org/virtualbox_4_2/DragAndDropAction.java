
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
 * DragAndDropAction.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Possible actions within an Drag and Drop operation.
 * 
 * Interface ID: <tt>{47F3B162-C107-4FCD-BFA7-54B8135C441E}</tt>
 */
public enum DragAndDropAction {

	/**
	 * Do nothing.
	 */
	Ignore(0),
	/**
	 * Copy the item to the target.
	 */
	Copy(1),
	/**
	 * Move the item to the target.
	 */
	Move(2),
	/**
	 * Link the item from within the target.
	 */
	Link(3);

	private final int value;

	DragAndDropAction(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static DragAndDropAction fromValue(long v) {
		for (DragAndDropAction c : DragAndDropAction.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static DragAndDropAction fromValue(String v) {
		return valueOf(DragAndDropAction.class, v);
	}
}

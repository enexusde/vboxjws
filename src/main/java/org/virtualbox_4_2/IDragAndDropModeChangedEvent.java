
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
 * IDragAndDropModeChangedEvent.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.InvalidObjectFaultMsg;
import org.virtualbox_4_2.jaxws.RuntimeFaultMsg;
import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Notification when the drag'n'drop mode changes.
 * 
 * Interface ID: <tt>{E90B8850-AC8E-4DFF-8059-4100AE2C3C3D}</tt>
 */
public class IDragAndDropModeChangedEvent extends IEvent {

	public IDragAndDropModeChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * The new drag'n'drop mode.
	 * 
	 * @return org.virtualbox_4_2.DragAndDropMode
	 * 
	 */
	public org.virtualbox_4_2.DragAndDropMode getDragAndDropMode() {
		try {
			org.virtualbox_4_2.jaxws.DragAndDropMode retVal = port.iDragAndDropModeChangedEventGetDragAndDropMode(obj);
			return org.virtualbox_4_2.DragAndDropMode.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IDragAndDropModeChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IDragAndDropModeChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

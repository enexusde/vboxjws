
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
 * IVRDEServerChangedEvent.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Notification when a property of the
 * {@link org.virtualbox_4_2.IMachine#getVRDEServer()} changes. Interested
 * callees should use IVRDEServer methods and attributes to find out what has
 * changed.
 * 
 * Interface ID: <tt>{A06FD66A-3188-4C8C-8756-1395E8CB691C}</tt>
 */
public class IVRDEServerChangedEvent extends IEvent {

	public IVRDEServerChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	public static IVRDEServerChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IVRDEServerChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

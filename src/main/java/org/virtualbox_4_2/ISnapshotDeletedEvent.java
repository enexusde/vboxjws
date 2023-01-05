
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
 * ISnapshotDeletedEvent.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Snapshot of the given machine has been deleted.
 * 
 * 
 * NOTE: This notification is delivered <b>after</b> the snapshot object has
 * been uninitialized on the server (so that any attempt to call its methods
 * will return an error).
 * 
 * 
 * @see org.virtualbox_4_2.ISnapshot
 * 
 *      Interface ID: <tt>{C48F3401-4A9E-43F4-B7A7-54BD285E22F4}</tt>
 */
public class ISnapshotDeletedEvent extends ISnapshotEvent {

	public ISnapshotDeletedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	public static ISnapshotDeletedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new ISnapshotDeletedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

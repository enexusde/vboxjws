
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
 * ISnapshotChangedEvent.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Snapshot properties (name and/or description) have been changed.
 * 
 * @see org.virtualbox_4_2.ISnapshot
 * 
 *      Interface ID: <tt>{07541941-8079-447A-A33E-47A69C7980DB}</tt>
 */
public class ISnapshotChangedEvent extends ISnapshotEvent {

	public ISnapshotChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	public static ISnapshotChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new ISnapshotChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

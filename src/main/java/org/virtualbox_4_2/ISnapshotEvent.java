
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
 * ISnapshotEvent.java
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
 * Base interface for all snapshot events. Interface ID:
 * <tt>{21637B0E-34B8-42D3-ACFB-7E96DAF77C22}</tt>
 */
public class ISnapshotEvent extends IMachineEvent {

	public ISnapshotEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * ID of the snapshot this event relates to.
	 * 
	 * @return String
	 * 
	 */
	public String getSnapshotId() {
		try {
			String retVal = port.iSnapshotEventGetSnapshotId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static ISnapshotEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new ISnapshotEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

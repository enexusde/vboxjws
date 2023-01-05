
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
 * IBandwidthGroupChangedEvent.java
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
 * Notification when one of the bandwidth groups changed
 * 
 * Interface ID: <tt>{334DF94A-7556-4CBC-8C04-043096B02D82}</tt>
 */
public class IBandwidthGroupChangedEvent extends IEvent {

	public IBandwidthGroupChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * The changed bandwidth group.
	 * 
	 * @return org.virtualbox_4_2.IBandwidthGroup
	 * 
	 */
	public org.virtualbox_4_2.IBandwidthGroup getBandwidthGroup() {
		try {
			String retVal = port.iBandwidthGroupChangedEventGetBandwidthGroup(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IBandwidthGroup(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IBandwidthGroupChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IBandwidthGroupChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

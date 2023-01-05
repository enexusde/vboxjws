
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
 * INetworkAdapterChangedEvent.java
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
 * Notification when a property of one of the virtual
 * {@link org.virtualbox_4_2.IMachine#getNetworkAdapter(Long)} changes.
 * Interested callees should use INetworkAdapter methods and attributes to find
 * out what has changed.
 * 
 * Interface ID: <tt>{08889892-1EC6-4883-801D-77F56CFD0103}</tt>
 */
public class INetworkAdapterChangedEvent extends IEvent {

	public INetworkAdapterChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Network adapter that is subject to change.
	 * 
	 * @return org.virtualbox_4_2.INetworkAdapter
	 * 
	 */
	public org.virtualbox_4_2.INetworkAdapter getNetworkAdapter() {
		try {
			String retVal = port.iNetworkAdapterChangedEventGetNetworkAdapter(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.INetworkAdapter(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static INetworkAdapterChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new INetworkAdapterChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

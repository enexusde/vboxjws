
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
 * ISharedFolderChangedEvent.java
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
 * Notification when a shared folder is added or removed. The scope argument
 * defines one of three scopes:
 * {@link org.virtualbox_4_2.IVirtualBox#getSharedFolders()}
 * ({@link org.virtualbox_4_2.Scope#Global}),
 * {@link org.virtualbox_4_2.IMachine#getSharedFolders()} of the machine
 * ({@link org.virtualbox_4_2.Scope#Machine}) or
 * {@link org.virtualbox_4_2.IConsole#getSharedFolders()} of the machine
 * ({@link org.virtualbox_4_2.Scope#Session}). Interested callees should use
 * query the corresponding collections to find out what has changed.
 * 
 * Interface ID: <tt>{B66349B5-3534-4239-B2DE-8E1535D94C0B}</tt>
 */
public class ISharedFolderChangedEvent extends IEvent {

	public ISharedFolderChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Scope of the notification.
	 * 
	 * @return org.virtualbox_4_2.Scope
	 * 
	 */
	public org.virtualbox_4_2.Scope getScope() {
		try {
			org.virtualbox_4_2.jaxws.Scope retVal = port.iSharedFolderChangedEventGetScope(obj);
			return org.virtualbox_4_2.Scope.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static ISharedFolderChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new ISharedFolderChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

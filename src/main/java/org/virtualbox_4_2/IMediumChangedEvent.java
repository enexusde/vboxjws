
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
 * IMediumChangedEvent.java
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
 * Notification when a
 * {@link org.virtualbox_4_2.IMachine#getMediumAttachments()} changes.
 * 
 * Interface ID: <tt>{0FE2DA40-5637-472A-9736-72019EABD7DE}</tt>
 */
public class IMediumChangedEvent extends IEvent {

	public IMediumChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Medium attachment that is subject to change.
	 * 
	 * @return org.virtualbox_4_2.IMediumAttachment
	 * 
	 */
	public org.virtualbox_4_2.IMediumAttachment getMediumAttachment() {
		try {
			org.virtualbox_4_2.jaxws.IMediumAttachment retVal = port.iMediumChangedEventGetMediumAttachment(obj);
			return (retVal != null) ? new org.virtualbox_4_2.IMediumAttachment(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IMediumChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IMediumChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

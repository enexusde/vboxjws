
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
 * ICanShowWindowEvent.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Notification when a call to
 * {@link org.virtualbox_4_2.IMachine#canShowConsoleWindow()} is made by a
 * front-end to check if a subsequent call to
 * {@link org.virtualbox_4_2.IMachine#showConsoleWindow()} can succeed.
 * 
 * The callee should give an answer appropriate to the current machine state
 * using event veto. This answer must remain valid at least until the next
 * {@link org.virtualbox_4_2.IConsole#getState()} change.
 * 
 * Interface ID: <tt>{ADF292B0-92C9-4A77-9D35-E058B39FE0B9}</tt>
 */
public class ICanShowWindowEvent extends IVetoEvent {

	public ICanShowWindowEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	public static ICanShowWindowEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new ICanShowWindowEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

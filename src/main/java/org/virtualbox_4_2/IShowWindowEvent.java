
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
 * IShowWindowEvent.java
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
 * Notification when a call to
 * {@link org.virtualbox_4_2.IMachine#showConsoleWindow()} requests the console
 * window to be activated and brought to foreground on the desktop of the host
 * PC.
 * 
 * This notification should cause the VM console process to perform the
 * requested action as described above. If it is impossible to do it at a time
 * of this notification, this method should return a failure.
 * 
 * Note that many modern window managers on many platforms implement some sort
 * of focus stealing prevention logic, so that it may be impossible to activate
 * a window without the help of the currently active application (which is
 * supposedly an initiator of this notification). In this case, this method must
 * return a non-zero identifier that represents the top-level window of the VM
 * console process. The caller, if it represents a currently active process, is
 * responsible to use this identifier (in a platform-dependent manner) to
 * perform actual window activation.
 * 
 * This method must set winId to zero if it has performed all actions necessary
 * to complete the request and the console window is now active and in
 * foreground, to indicate that no further action is required on the caller's
 * side.
 * 
 * Interface ID: <tt>{B0A0904D-2F05-4D28-855F-488F96BAD2B2}</tt>
 */
public class IShowWindowEvent extends IEvent {

	public IShowWindowEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Platform-dependent identifier of the top-level VM console window, or zero if
	 * this method has performed all actions necessary to implement the <i>show
	 * window</i> semantics for the given platform and/or this VirtualBox front-end.
	 * 
	 * @return Long
	 * 
	 */
	public Long getWinId() {
		try {
			Long retVal = port.iShowWindowEventGetWinId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Platform-dependent identifier of the top-level VM console window, or zero if
	 * this method has performed all actions necessary to implement the <i>show
	 * window</i> semantics for the given platform and/or this VirtualBox front-end.
	 * 
	 * @param value Long
	 * 
	 */
	public void setWinId(Long value) {
		try {
			port.iShowWindowEventSetWinId(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IShowWindowEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IShowWindowEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}


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
 * IKeyboard.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import java.util.List;

import org.virtualbox_4_2.jaxws.InvalidObjectFaultMsg;
import org.virtualbox_4_2.jaxws.RuntimeFaultMsg;
import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * The IKeyboard interface represents the virtual machine's keyboard. Used in
 * {@link org.virtualbox_4_2.IConsole#getKeyboard()}.
 * 
 * Use this interface to send keystrokes or the Ctrl-Alt-Del sequence to the
 * virtual machine.
 * 
 * 
 * Interface ID: <tt>{F6916EC5-A881-4237-898F-7DE58CF88672}</tt>
 */
public class IKeyboard extends IUnknown {

	public IKeyboard(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Event source for keyboard events.
	 * 
	 * @return org.virtualbox_4_2.IEventSource
	 * 
	 */
	public org.virtualbox_4_2.IEventSource getEventSource() {
		try {
			String retVal = port.iKeyboardGetEventSource(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IEventSource(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IKeyboard queryInterface(IUnknown obj) {
		return obj == null ? null : new IKeyboard(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * Sends a scancode to the keyboard.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 * <td>Could not send scan code to virtual keyboard.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public void putScancode(Integer scancode) {
		try {
			port.iKeyboardPutScancode(obj, scancode);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Sends an array of scancodes to the keyboard.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 * <td>Could not send all scan codes to virtual keyboard.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public Long putScancodes(List<Integer> scancodes) {
		try {
			Long retVal;
			retVal = port.iKeyboardPutScancodes(obj, scancodes);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Sends the Ctrl-Alt-Del sequence to the keyboard. This function is nothing
	 * special, it is just a convenience function calling
	 * {@link org.virtualbox_4_2.IKeyboard#putScancodes(List)} with the proper
	 * scancodes.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 * <td>Could not send all scan codes to virtual keyboard.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public void putCAD() {
		try {
			port.iKeyboardPutCAD(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

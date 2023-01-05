
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
 * IMouse.java
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
 * The IMouse interface represents the virtual machine's mouse. Used in
 * {@link org.virtualbox_4_2.IConsole#getMouse()}.
 * 
 * Through this interface, the virtual machine's virtual mouse can be
 * controlled.
 * 
 * Interface ID: <tt>{05044A52-7811-4F00-AE3A-0AB7FF707B10}</tt>
 */
public class IMouse extends IUnknown {

	public IMouse(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Whether the guest OS supports absolute mouse pointer positioning or not.
	 * 
	 * NOTE: You can use the {@link org.virtualbox_4_2.IMouseCapabilityChangedEvent}
	 * event to be instantly informed about changes of this attribute during virtual
	 * machine execution.
	 * 
	 * 
	 * @return Boolean
	 * 
	 * @see #putMouseEventAbsolute(Integer,Integer,Integer,Integer,Integer)
	 * 
	 */
	public Boolean getAbsoluteSupported() {
		try {
			Boolean retVal = port.iMouseGetAbsoluteSupported(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Whether the guest OS supports relative mouse pointer positioning or not.
	 * 
	 * NOTE: You can use the {@link org.virtualbox_4_2.IMouseCapabilityChangedEvent}
	 * event to be instantly informed about changes of this attribute during virtual
	 * machine execution.
	 * 
	 * 
	 * @return Boolean
	 * 
	 * @see #putMouseEvent(Integer,Integer,Integer,Integer,Integer)
	 * 
	 */
	public Boolean getRelativeSupported() {
		try {
			Boolean retVal = port.iMouseGetRelativeSupported(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Whether the guest OS can currently switch to drawing it's own mouse cursor on
	 * demand.
	 * 
	 * NOTE: You can use the {@link org.virtualbox_4_2.IMouseCapabilityChangedEvent}
	 * event to be instantly informed about changes of this attribute during virtual
	 * machine execution.
	 * 
	 * 
	 * @return Boolean
	 * 
	 * @see #putMouseEvent(Integer,Integer,Integer,Integer,Integer)
	 * 
	 */
	public Boolean getNeedsHostCursor() {
		try {
			Boolean retVal = port.iMouseGetNeedsHostCursor(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Event source for mouse events.
	 * 
	 * @return org.virtualbox_4_2.IEventSource
	 * 
	 */
	public org.virtualbox_4_2.IEventSource getEventSource() {
		try {
			String retVal = port.iMouseGetEventSource(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IEventSource(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IMouse queryInterface(IUnknown obj) {
		return obj == null ? null : new IMouse(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Initiates a mouse event using relative pointer movements along x and y axis.
	 * 
	 * 
	 * @param dx          Amount of pixels the mouse should move to the right.
	 *                    Negative values move the mouse to the left.
	 * 
	 * 
	 * @param dy          Amount of pixels the mouse should move downwards. Negative
	 *                    values move the mouse upwards.
	 * 
	 * 
	 * @param dz          Amount of mouse wheel moves. Positive values describe
	 *                    clockwise wheel rotations, negative values describe
	 *                    counterclockwise rotations.
	 * 
	 * 
	 * @param dw          Amount of horizontal mouse wheel moves. Positive values
	 *                    describe a movement to the left, negative values describe
	 *                    a movement to the right.
	 * 
	 * 
	 * @param buttonState The current state of mouse buttons. Every bit represents a
	 *                    mouse button as follows:
	 *                    <table>
	 *                    <tr>
	 *                    <td>Bit 0 (<tt>0x01</tt>)</td>
	 *                    <td>left mouse button</td>
	 *                    </tr>
	 *                    <tr>
	 *                    <td>Bit 1 (<tt>0x02</tt>)</td>
	 *                    <td>right mouse button</td>
	 *                    </tr>
	 *                    <tr>
	 *                    <td>Bit 2 (<tt>0x04</tt>)</td>
	 *                    <td>middle mouse button</td>
	 *                    </tr>
	 *                    </table>
	 *                    A value of <tt>1</tt> means the corresponding button is
	 *                    pressed. otherwise it is released.
	 * 
	 * 
	 *                    Expected result codes:
	 *                    <table>
	 *                    <tr>
	 *                    <td>E_ACCESSDENIED</td>
	 *                    <td>Console not powered up.</td>
	 *                    <tr>
	 *                    <tr>
	 *                    <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *                    <td>Could not send mouse event to virtual mouse.</td>
	 *                    <tr>
	 *                    </table>
	 * 
	 */
	public void putMouseEvent(Integer dx, Integer dy, Integer dz, Integer dw, Integer buttonState) {
		try {
			port.iMousePutMouseEvent(obj, dx, dy, dz, dw, buttonState);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Positions the mouse pointer using absolute x and y coordinates. These
	 * coordinates are expressed in pixels and start from <tt>[1,1]</tt> which
	 * corresponds to the top left corner of the virtual display.
	 * 
	 * 
	 * @param x           X coordinate of the pointer in pixels, starting from 1.
	 * 
	 * 
	 * @param y           Y coordinate of the pointer in pixels, starting from 1.
	 * 
	 * 
	 * @param dz          Amount of mouse wheel moves. Positive values describe
	 *                    clockwise wheel rotations, negative values describe
	 *                    counterclockwise rotations.
	 * 
	 * 
	 * @param dw          Amount of horizontal mouse wheel moves. Positive values
	 *                    describe a movement to the left, negative values describe
	 *                    a movement to the right.
	 * 
	 * 
	 * @param buttonState The current state of mouse buttons. Every bit represents a
	 *                    mouse button as follows:
	 *                    <table>
	 *                    <tr>
	 *                    <td>Bit 0 (<tt>0x01</tt>)</td>
	 *                    <td>left mouse button</td>
	 *                    </tr>
	 *                    <tr>
	 *                    <td>Bit 1 (<tt>0x02</tt>)</td>
	 *                    <td>right mouse button</td>
	 *                    </tr>
	 *                    <tr>
	 *                    <td>Bit 2 (<tt>0x04</tt>)</td>
	 *                    <td>middle mouse button</td>
	 *                    </tr>
	 *                    </table>
	 *                    A value of 1 means the corresponding button is pressed.
	 *                    otherwise it is released.
	 * 
	 * 
	 *                    Expected result codes:
	 *                    <table>
	 *                    <tr>
	 *                    <td>E_ACCESSDENIED</td>
	 *                    <td>Console not powered up.</td>
	 *                    <tr>
	 *                    <tr>
	 *                    <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *                    <td>Could not send mouse event to virtual mouse.</td>
	 *                    <tr>
	 *                    </table>
	 * 
	 *                    NOTE: This method will have effect only if absolute mouse
	 *                    positioning is supported by the guest OS.
	 * 
	 * 
	 * @see #getAbsoluteSupported()
	 * 
	 */
	public void putMouseEventAbsolute(Integer x, Integer y, Integer dz, Integer dw, Integer buttonState) {
		try {
			port.iMousePutMouseEventAbsolute(obj, x, y, dz, dw, buttonState);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}


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
 * IGuestMouseEvent.java
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
 * Notification when guest mouse event happens.
 * 
 * Interface ID: <tt>{1F85D35C-C524-40FF-8E98-307000DF0992}</tt>
 */
public class IGuestMouseEvent extends IReusableEvent {

	public IGuestMouseEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * If this event is relative or absolute.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getAbsolute() {
		try {
			Boolean retVal = port.iGuestMouseEventGetAbsolute(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * New X position, or X delta.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getX() {
		try {
			Integer retVal = port.iGuestMouseEventGetX(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * New Y position, or Y delta.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getY() {
		try {
			Integer retVal = port.iGuestMouseEventGetY(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Z delta.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getZ() {
		try {
			Integer retVal = port.iGuestMouseEventGetZ(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * W delta.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getW() {
		try {
			Integer retVal = port.iGuestMouseEventGetW(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Button state bitmask.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getButtons() {
		try {
			Integer retVal = port.iGuestMouseEventGetButtons(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IGuestMouseEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IGuestMouseEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

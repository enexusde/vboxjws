
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
 * IGuestMonitorChangedEvent.java
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
 * Notification when the guest enables one of its monitors.
 * 
 * Interface ID: <tt>{0F7B8A22-C71F-4A36-8E5F-A77D01D76090}</tt>
 */
public class IGuestMonitorChangedEvent extends IEvent {

	public IGuestMonitorChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * What was changed for this guest monitor.
	 * 
	 * @return org.virtualbox_4_2.GuestMonitorChangedEventType
	 * 
	 */
	public org.virtualbox_4_2.GuestMonitorChangedEventType getChangeType() {
		try {
			org.virtualbox_4_2.jaxws.GuestMonitorChangedEventType retVal = port
					.iGuestMonitorChangedEventGetChangeType(obj);
			return org.virtualbox_4_2.GuestMonitorChangedEventType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The monitor which was changed.
	 * 
	 * @return Long
	 * 
	 */
	public Long getScreenId() {
		try {
			Long retVal = port.iGuestMonitorChangedEventGetScreenId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Physical X origin relative to the primary screen. Valid for Enabled and
	 * NewOrigin.
	 * 
	 * @return Long
	 * 
	 */
	public Long getOriginX() {
		try {
			Long retVal = port.iGuestMonitorChangedEventGetOriginX(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Physical Y origin relative to the primary screen. Valid for Enabled and
	 * NewOrigin.
	 * 
	 * @return Long
	 * 
	 */
	public Long getOriginY() {
		try {
			Long retVal = port.iGuestMonitorChangedEventGetOriginY(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Width of the screen. Valid for Enabled.
	 * 
	 * @return Long
	 * 
	 */
	public Long getWidth() {
		try {
			Long retVal = port.iGuestMonitorChangedEventGetWidth(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Height of the screen. Valid for Enabled.
	 * 
	 * @return Long
	 * 
	 */
	public Long getHeight() {
		try {
			Long retVal = port.iGuestMonitorChangedEventGetHeight(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IGuestMonitorChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IGuestMonitorChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

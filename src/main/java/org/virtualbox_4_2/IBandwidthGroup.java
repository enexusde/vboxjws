
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
 * IBandwidthGroup.java
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
 * Represents one bandwidth group. Interface ID:
 * <tt>{BADEA2D7-0261-4146-89F0-6A57CC34833D}</tt>
 */
public class IBandwidthGroup extends IUnknown {

	public IBandwidthGroup(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * Name of the group.
	 * 
	 * @return String
	 * 
	 */
	public String getName() {
		try {
			String retVal = port.iBandwidthGroupGetName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Type of the group.
	 * 
	 * @return org.virtualbox_4_2.BandwidthGroupType
	 * 
	 */
	public org.virtualbox_4_2.BandwidthGroupType getType() {
		try {
			org.virtualbox_4_2.jaxws.BandwidthGroupType retVal = port.iBandwidthGroupGetType(obj);
			return org.virtualbox_4_2.BandwidthGroupType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * How many devices/medium attachements use this group.
	 * 
	 * @return Long
	 * 
	 */
	public Long getReference() {
		try {
			Long retVal = port.iBandwidthGroupGetReference(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * The maximum number of bytes which can be transfered by all entities attached
	 * to this group during one second.
	 * 
	 * @return Long
	 * 
	 */
	public Long getMaxBytesPerSec() {
		try {
			Long retVal = port.iBandwidthGroupGetMaxBytesPerSec(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * The maximum number of bytes which can be transfered by all entities attached
	 * to this group during one second.
	 * 
	 * @param value Long
	 * 
	 */
	public void setMaxBytesPerSec(Long value) {
		try {
			port.iBandwidthGroupSetMaxBytesPerSec(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IBandwidthGroup queryInterface(IUnknown obj) {
		return obj == null ? null : new IBandwidthGroup(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

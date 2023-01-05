
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
 * IBandwidthControl.java
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
 * Controls the bandwidth groups of one machine used to cap I/O done by a VM.
 * This includes network and disk I/O.
 * 
 * Interface ID: <tt>{E2EB3930-D2F4-4F87-BE17-0707E30F019F}</tt>
 */
public class IBandwidthControl extends IUnknown {

	public IBandwidthControl(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * The current number of existing bandwidth groups managed.
	 * 
	 * @return Long
	 * 
	 */
	public Long getNumGroups() {
		try {
			Long retVal = port.iBandwidthControlGetNumGroups(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IBandwidthControl queryInterface(IUnknown obj) {
		return obj == null ? null : new IBandwidthControl(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Creates a new bandwidth group.
	 * 
	 * @param name           Name of the bandwidth group.
	 * 
	 * @param type           The type of the bandwidth group (network or disk).
	 * 
	 * @param maxBytesPerSec The maximum number of bytes which can be transfered by
	 *                       all entities attached to this group during one second.
	 * 
	 */
	public void createBandwidthGroup(String name, org.virtualbox_4_2.BandwidthGroupType type, Long maxBytesPerSec) {
		try {
			port.iBandwidthControlCreateBandwidthGroup(obj, name,
					org.virtualbox_4_2.jaxws.BandwidthGroupType.fromValue(type.name()), maxBytesPerSec);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Deletes a new bandwidth group.
	 * 
	 * @param name Name of the bandwidth group to delete.
	 * 
	 */
	public void deleteBandwidthGroup(String name) {
		try {
			port.iBandwidthControlDeleteBandwidthGroup(obj, name);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Get a bandwidth group by name.
	 * 
	 * @param name Name of the bandwidth group to get.
	 * 
	 * @return Where to store the bandwidth group on success.
	 * 
	 */
	public org.virtualbox_4_2.IBandwidthGroup getBandwidthGroup(String name) {
		try {
			String retVal;
			retVal = port.iBandwidthControlGetBandwidthGroup(obj, name);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IBandwidthGroup(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Get all managed bandwidth groups.
	 * 
	 * @return The array of managed bandwidth groups.
	 * 
	 */
	public List<org.virtualbox_4_2.IBandwidthGroup> getAllBandwidthGroups() {
		try {
			List<String> retVal;
			retVal = port.iBandwidthControlGetAllBandwidthGroups(obj);
			return Helper.wrap(org.virtualbox_4_2.IBandwidthGroup.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

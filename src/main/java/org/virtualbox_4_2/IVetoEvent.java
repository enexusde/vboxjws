
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
 * IVetoEvent.java
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
 * Base abstract interface for veto events. Interface ID:
 * <tt>{9A1A4130-69FE-472F-AC10-C6FA25D75007}</tt>
 */
public class IVetoEvent extends IEvent {

	public IVetoEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	public static IVetoEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IVetoEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Adds a veto on this event.
	 * 
	 * @param reason Reason for veto, could be null or empty string.
	 * 
	 * 
	 */
	public void addVeto(String reason) {
		try {
			port.iVetoEventAddVeto(obj, reason);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * If this event was vetoed.
	 * 
	 * @return Reason for veto.
	 * 
	 * 
	 */
	public Boolean isVetoed() {
		try {
			Boolean retVal;
			retVal = port.iVetoEventIsVetoed(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Current veto reason list, if size is 0 - no veto.
	 * 
	 * @return Array of reasons for veto provided by different event handlers.
	 * 
	 * 
	 */
	public List<String> getVetos() {
		try {
			List<String> retVal;
			retVal = port.iVetoEventGetVetos(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

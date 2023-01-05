
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
 * INATRedirectEvent.java
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
 * Notification when NAT redirect rule added or removed.
 * 
 * Interface ID: <tt>{24EEF068-C380-4510-BC7C-19314A7352F1}</tt>
 */
public class INATRedirectEvent extends IMachineEvent {

	public INATRedirectEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Adapter which NAT attached to.
	 * 
	 * @return Long
	 * 
	 */
	public Long getSlot() {
		try {
			Long retVal = port.inatRedirectEventGetSlot(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Whether rule remove or add.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getRemove() {
		try {
			Boolean retVal = port.inatRedirectEventGetRemove(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the rule.
	 * 
	 * @return String
	 * 
	 */
	public String getName() {
		try {
			String retVal = port.inatRedirectEventGetName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Protocol (TCP or UDP) of the redirect rule.
	 * 
	 * @return org.virtualbox_4_2.NATProtocol
	 * 
	 */
	public org.virtualbox_4_2.NATProtocol getProto() {
		try {
			org.virtualbox_4_2.jaxws.NATProtocol retVal = port.inatRedirectEventGetProto(obj);
			return org.virtualbox_4_2.NATProtocol.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Host ip address to bind socket on.
	 * 
	 * @return String
	 * 
	 */
	public String getHostIP() {
		try {
			String retVal = port.inatRedirectEventGetHostIP(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Host port to bind socket on.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getHostPort() {
		try {
			Integer retVal = port.inatRedirectEventGetHostPort(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Guest ip address to redirect to.
	 * 
	 * @return String
	 * 
	 */
	public String getGuestIP() {
		try {
			String retVal = port.inatRedirectEventGetGuestIP(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Guest port to redirect to.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getGuestPort() {
		try {
			Integer retVal = port.inatRedirectEventGetGuestPort(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static INATRedirectEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new INATRedirectEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

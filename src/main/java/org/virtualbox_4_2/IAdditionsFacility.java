
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
 * IAdditionsFacility.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Structure representing a Guest Additions facility.
 * 
 * Interface ID: <tt>{54992946-6AF1-4E49-98EC-58B558B7291E}</tt>
 */
public class IAdditionsFacility {

	private org.virtualbox_4_2.jaxws.IAdditionsFacility real;
	private VboxPortType port;

	public IAdditionsFacility(org.virtualbox_4_2.jaxws.IAdditionsFacility real, VboxPortType port) {
		this.real = real;
		this.port = port;
	}

	public org.virtualbox_4_2.AdditionsFacilityClass getClassType() {
		org.virtualbox_4_2.jaxws.AdditionsFacilityClass retVal = real.getClassType();
		return org.virtualbox_4_2.AdditionsFacilityClass.fromValue(retVal.value());
	}

	public Long getLastUpdated() {
		Long retVal = real.getLastUpdated();
		return retVal;
	}

	public String getName() {
		String retVal = real.getName();
		return retVal;
	}

	public org.virtualbox_4_2.AdditionsFacilityStatus getStatus() {
		org.virtualbox_4_2.jaxws.AdditionsFacilityStatus retVal = real.getStatus();
		return org.virtualbox_4_2.AdditionsFacilityStatus.fromValue(retVal.value());
	}

	public org.virtualbox_4_2.AdditionsFacilityType getType() {
		org.virtualbox_4_2.jaxws.AdditionsFacilityType retVal = real.getType();
		return org.virtualbox_4_2.AdditionsFacilityType.fromValue(retVal.value());
	}
}

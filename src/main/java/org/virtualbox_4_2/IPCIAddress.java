
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
 * IPCIAddress.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Address on the PCI bus.
 * 
 * Interface ID: <tt>{D88B324F-DB19-4D3B-A1A9-BF5B127199A8}</tt>
 */
public class IPCIAddress {

	private org.virtualbox_4_2.jaxws.IPCIAddress real;
	private VboxPortType port;

	public IPCIAddress(org.virtualbox_4_2.jaxws.IPCIAddress real, VboxPortType port) {
		this.real = real;
		this.port = port;
	}

	public Short getBus() {
		Short retVal = real.getBus();
		return retVal;
	}

	public Short getDevice() {
		Short retVal = real.getDevice();
		return retVal;
	}

	public Short getDevFunction() {
		Short retVal = real.getDevFunction();
		return retVal;
	}
}

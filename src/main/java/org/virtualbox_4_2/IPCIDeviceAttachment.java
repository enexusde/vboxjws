
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
 * IPCIDeviceAttachment.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Information about PCI attachments.
 * 
 * Interface ID: <tt>{91F33D6F-E621-4F70-A77E-15F0E3C714D5}</tt>
 */
public class IPCIDeviceAttachment {

	private org.virtualbox_4_2.jaxws.IPCIDeviceAttachment real;
	private VboxPortType port;

	public IPCIDeviceAttachment(org.virtualbox_4_2.jaxws.IPCIDeviceAttachment real, VboxPortType port) {
		this.real = real;
		this.port = port;
	}

	public String getName() {
		String retVal = real.getName();
		return retVal;
	}

	public Boolean getIsPhysicalDevice() {
		Boolean retVal = real.isIsPhysicalDevice();
		return retVal;
	}

	public Integer getHostAddress() {
		Integer retVal = real.getHostAddress();
		return retVal;
	}

	public Integer getGuestAddress() {
		Integer retVal = real.getGuestAddress();
		return retVal;
	}
}

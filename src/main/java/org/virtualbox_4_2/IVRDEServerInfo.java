
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
 * IVRDEServerInfo.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Contains information about the remote desktop (VRDE) server capabilities and
 * status. This is used in the
 * {@link org.virtualbox_4_2.IConsole#getVRDEServerInfo()} attribute.
 * 
 * Interface ID: <tt>{714434A1-58C3-4AAB-9049-7652C5DF113B}</tt>
 */
public class IVRDEServerInfo {

	private org.virtualbox_4_2.jaxws.IVRDEServerInfo real;
	private VboxPortType port;

	public IVRDEServerInfo(org.virtualbox_4_2.jaxws.IVRDEServerInfo real, VboxPortType port) {
		this.real = real;
		this.port = port;
	}

	public Boolean getActive() {
		Boolean retVal = real.isActive();
		return retVal;
	}

	public Integer getPort() {
		Integer retVal = real.getPort();
		return retVal;
	}

	public Long getNumberOfClients() {
		Long retVal = real.getNumberOfClients();
		return retVal;
	}

	public Long getBeginTime() {
		Long retVal = real.getBeginTime();
		return retVal;
	}

	public Long getEndTime() {
		Long retVal = real.getEndTime();
		return retVal;
	}

	public Long getBytesSent() {
		Long retVal = real.getBytesSent();
		return retVal;
	}

	public Long getBytesSentTotal() {
		Long retVal = real.getBytesSentTotal();
		return retVal;
	}

	public Long getBytesReceived() {
		Long retVal = real.getBytesReceived();
		return retVal;
	}

	public Long getBytesReceivedTotal() {
		Long retVal = real.getBytesReceivedTotal();
		return retVal;
	}

	public String getUser() {
		String retVal = real.getUser();
		return retVal;
	}

	public String getDomain() {
		String retVal = real.getDomain();
		return retVal;
	}

	public String getClientName() {
		String retVal = real.getClientName();
		return retVal;
	}

	public String getClientIP() {
		String retVal = real.getClientIP();
		return retVal;
	}

	public Long getClientVersion() {
		Long retVal = real.getClientVersion();
		return retVal;
	}

	public Long getEncryptionStyle() {
		Long retVal = real.getEncryptionStyle();
		return retVal;
	}
}

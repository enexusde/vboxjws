
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
 * IUnknown.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import javax.xml.ws.WebServiceException;

import org.virtualbox_4_2.jaxws.InvalidObjectFaultMsg;
import org.virtualbox_4_2.jaxws.RuntimeFaultMsg;
import org.virtualbox_4_2.jaxws.VboxPortType;

public class IUnknown {
	protected String obj;
	protected final VboxPortType port;

	public IUnknown(String obj, VboxPortType port) {
		this.obj = obj;
		this.port = port;
	}

	public final String getWrapped() {
		return this.obj;
	}

	public final VboxPortType getRemoteWSPort() {
		return this.port;
	}

	public synchronized void releaseRemote() throws WebServiceException {
		if (obj == null) {
			return;
		}
		try {
			this.port.iManagedObjectRefRelease(obj);
			this.obj = null;
		} catch (InvalidObjectFaultMsg e) {
			throw new WebServiceException(e);
		} catch (RuntimeFaultMsg e) {
			throw new WebServiceException(e);
		}
	}
}

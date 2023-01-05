
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
 * IGuestFile.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Implementation of the {@link org.virtualbox_4_2.IFile} object for files on
 * the guest.
 * 
 * Interface ID: <tt>{60661AEC-145F-4D11-B80E-8EA151598093}</tt>
 */
public class IGuestFile extends IFile {

	public IGuestFile(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	public static IGuestFile queryInterface(IUnknown obj) {
		return obj == null ? null : new IGuestFile(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

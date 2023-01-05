
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
 * IDirectory.java
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
 * Abstract parent interface for directories handled by VirtualBox.
 * 
 * Interface ID: <tt>{1B70DD03-26D7-483A-8877-89BBB0F87B70}</tt>
 */
public class IDirectory extends IUnknown {

	public IDirectory(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Full path of directory.
	 * 
	 * @return String
	 * 
	 */
	public String getDirectoryName() {
		try {
			String retVal = port.iDirectoryGetDirectoryName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The open filter.
	 * 
	 * @return String
	 * 
	 */
	public String getFilter() {
		try {
			String retVal = port.iDirectoryGetFilter(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IDirectory queryInterface(IUnknown obj) {
		return obj == null ? null : new IDirectory(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Closes this directory. After closing operations like reading the next
	 * directory entry will not be possible anymore.
	 * 
	 */
	public void close() {
		try {
			port.iDirectoryClose(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Reads the next directory entry of this directory.
	 * 
	 * @return Object information of the current directory entry read. Also see
	 *         {@link org.virtualbox_4_2.IFsObjInfo}.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>No more directory entries to read.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IFsObjInfo read() {
		try {
			String retVal;
			retVal = port.iDirectoryRead(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IFsObjInfo(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

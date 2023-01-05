
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
 * ISharedFolder.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * The ISharedFolder interface represents a folder in the host computer's file
 * system accessible from the guest OS running inside a virtual machine using an
 * associated logical name.
 * 
 * There are three types of shared folders:
 * <ul>
 * <li><i>Global</i>
 * ({@link org.virtualbox_4_2.IVirtualBox#getSharedFolders()}), shared folders
 * available to all virtual machines.</li>
 * <li><i>Permanent</i>
 * ({@link org.virtualbox_4_2.IMachine#getSharedFolders()}), VM-specific shared
 * folders available to the given virtual machine at startup.</li>
 * <li><i>Transient</i>
 * ({@link org.virtualbox_4_2.IConsole#getSharedFolders()}), VM-specific shared
 * folders created in the session context (for example, when the virtual machine
 * is running) and automatically discarded when the session is closed (the VM is
 * powered off).</li>
 * </ul>
 * 
 * Logical names of shared folders must be unique within the given scope
 * (global, permanent or transient). However, they do not need to be unique
 * across scopes. In this case, the definition of the shared folder in a more
 * specific scope takes precedence over definitions in all other scopes. The
 * order of precedence is (more specific to more general):
 * <ol>
 * <li>Transient definitions</li>
 * <li>Permanent definitions</li>
 * <li>Global definitions</li>
 * </ol>
 * 
 * For example, if MyMachine has a shared folder named <tt>C_DRIVE</tt> (that
 * points to <tt>C:\\</tt>), then creating a transient shared folder named
 * <tt>C_DRIVE</tt> (that points to <tt>C:\\\\WINDOWS</tt>) will change the
 * definition of <tt>C_DRIVE</tt> in the guest OS so that
 * <tt>\\\\VBOXSVR\\C_DRIVE</tt> will give access to <tt>C:\\WINDOWS</tt>
 * instead of <tt>C:\\</tt> on the host PC. Removing the transient shared folder
 * <tt>C_DRIVE</tt> will restore the previous (permanent) definition of
 * <tt>C_DRIVE</tt> that points to <tt>C:\\</tt> if it still exists.
 * 
 * Note that permanent and transient shared folders of different machines are in
 * different name spaces, so they don't overlap and don't need to have unique
 * logical names.
 * 
 * 
 * NOTE: Global shared folders are not implemented in the current version of the
 * product.
 * 
 * 
 * Interface ID: <tt>{8388DA11-B559-4574-A5B7-2BD7ACD5CEF8}</tt>
 */
public class ISharedFolder {

	private org.virtualbox_4_2.jaxws.ISharedFolder real;
	private VboxPortType port;

	public ISharedFolder(org.virtualbox_4_2.jaxws.ISharedFolder real, VboxPortType port) {
		this.real = real;
		this.port = port;
	}

	public String getName() {
		String retVal = real.getName();
		return retVal;
	}

	public String getHostPath() {
		String retVal = real.getHostPath();
		return retVal;
	}

	public Boolean getAccessible() {
		Boolean retVal = real.isAccessible();
		return retVal;
	}

	public Boolean getWritable() {
		Boolean retVal = real.isWritable();
		return retVal;
	}

	public Boolean getAutoMount() {
		Boolean retVal = real.isAutoMount();
		return retVal;
	}

	public String getLastAccessError() {
		String retVal = real.getLastAccessError();
		return retVal;
	}
}

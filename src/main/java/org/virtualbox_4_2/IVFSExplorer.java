
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
 * IVFSExplorer.java
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
 * 
 * The VFSExplorer interface unifies access to different file system types. This
 * includes local file systems as well remote file systems like S3. For a list
 * of supported types see {@link org.virtualbox_4_2.VFSType}. An instance of
 * this is returned by
 * {@link org.virtualbox_4_2.IAppliance#createVFSExplorer(String)}.
 * 
 * Interface ID: <tt>{003D7F92-D38E-487F-B790-8C5E8631CB2F}</tt>
 */
public class IVFSExplorer extends IUnknown {

	public IVFSExplorer(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * Returns the current path in the virtual file system.
	 * 
	 * @return String
	 * 
	 */
	public String getPath() {
		try {
			String retVal = port.ivfsExplorerGetPath(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the file system type which is currently in use.
	 * 
	 * @return org.virtualbox_4_2.VFSType
	 * 
	 */
	public org.virtualbox_4_2.VFSType getType() {
		try {
			org.virtualbox_4_2.jaxws.VFSType retVal = port.ivfsExplorerGetType(obj);
			return org.virtualbox_4_2.VFSType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IVFSExplorer queryInterface(IUnknown obj) {
		return obj == null ? null : new IVFSExplorer(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * Updates the internal list of files/directories from the current directory
	 * level. Use {@link #entryList(Holder,Holder,Holder,Holder)} to get the full
	 * list after a call to this method.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 */
	public org.virtualbox_4_2.IProgress update() {
		try {
			String retVal;
			retVal = port.ivfsExplorerUpdate(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Change the current directory level.
	 * 
	 * @param aDir The name of the directory to go in.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 */
	public org.virtualbox_4_2.IProgress cd(String aDir) {
		try {
			String retVal;
			retVal = port.ivfsExplorerCd(obj, aDir);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Go one directory upwards from the current directory level.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 */
	public org.virtualbox_4_2.IProgress cdUp() {
		try {
			String retVal;
			retVal = port.ivfsExplorerCdUp(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns a list of files/directories after a call to {@link #update()}. The
	 * user is responsible for keeping this internal list up do date.
	 * 
	 * @param aNames The list of names for the entries.
	 * 
	 * @param aTypes The list of types for the entries.
	 * 
	 * @param aSizes The list of sizes (in bytes) for the entries.
	 * 
	 * @param aModes The list of file modes (in octal form) for the entries.
	 * 
	 */
	public void entryList(Holder<List<String>> aNames, Holder<List<Long>> aTypes, Holder<List<Long>> aSizes,
			Holder<List<Long>> aModes) {
		try {
			javax.xml.ws.Holder<List<String>> tmp_aNames = new javax.xml.ws.Holder<List<String>>();
			javax.xml.ws.Holder<List<Long>> tmp_aTypes = new javax.xml.ws.Holder<List<Long>>();
			javax.xml.ws.Holder<List<Long>> tmp_aSizes = new javax.xml.ws.Holder<List<Long>>();
			javax.xml.ws.Holder<List<Long>> tmp_aModes = new javax.xml.ws.Holder<List<Long>>();
			port.ivfsExplorerEntryList(obj, tmp_aNames, tmp_aTypes, tmp_aSizes, tmp_aModes);
			aNames.value = tmp_aNames.value;
			aTypes.value = tmp_aTypes.value;
			aSizes.value = tmp_aSizes.value;
			aModes.value = tmp_aModes.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Checks if the given file list exists in the current directory level.
	 * 
	 * @param aNames The names to check.
	 * 
	 * @return The names which exist.
	 * 
	 */
	public List<String> exists(List<String> aNames) {
		try {
			List<String> retVal;
			retVal = port.ivfsExplorerExists(obj, aNames);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Deletes the given files in the current directory level.
	 * 
	 * @param aNames The names to remove.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 */
	public org.virtualbox_4_2.IProgress remove(List<String> aNames) {
		try {
			String retVal;
			retVal = port.ivfsExplorerRemove(obj, aNames);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

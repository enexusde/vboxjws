
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
 * IAppliance.java
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
 * Represents a platform-independent appliance in OVF format. An instance of
 * this is returned by {@link org.virtualbox_4_2.IVirtualBox#createAppliance()},
 * which can then be used to import and export virtual machines within an
 * appliance with VirtualBox.
 * 
 * The OVF standard suggests two different physical file formats:
 * 
 * <ol>
 * <li>If the appliance is distributed as a set of files, there must be at least
 * one XML descriptor file that conforms to the OVF standard and carries an
 * <tt>.ovf</tt> file extension. If this descriptor file references other files
 * such as disk images, as OVF appliances typically do, those additional files
 * must be in the same directory as the descriptor file.</li>
 * <li>If the appliance is distributed as a single file, it must be in TAR
 * format and have the <tt>.ova</tt> file extension. This TAR file must then
 * contain at least the OVF descriptor files and optionally other files.
 * 
 * At this time, VirtualBox does not not yet support the packed (TAR) variant;
 * support will be added with a later version.</li>
 * </ol>
 * <b>Importing</b> an OVF appliance into VirtualBox as instances of
 * {@link org.virtualbox_4_2.IMachine} involves the following sequence of API
 * calls:
 * 
 * <ol>
 * <li>Call {@link org.virtualbox_4_2.IVirtualBox#createAppliance()}. This will
 * create an empty IAppliance object.</li>
 * <li>On the new object, call {@link #read(String)} with the full path of the
 * OVF file you would like to import. So long as this file is syntactically
 * valid, this will succeed and fill the appliance object with the parsed data
 * from the OVF file.</li>
 * <li>Next, call {@link #interpret()}, which analyzes the OVF data and sets up
 * the contents of the IAppliance attributes accordingly. These can be inspected
 * by a VirtualBox front-end such as the GUI, and the suggestions can be
 * displayed to the user. In particular, the
 * {@link #getVirtualSystemDescriptions()} array contains instances of
 * {@link org.virtualbox_4_2.IVirtualSystemDescription} which represent the
 * virtual systems (machines) in the OVF, which in turn describe the virtual
 * hardware prescribed by the OVF (network and hardware adapters, virtual disk
 * images, memory size and so on). The GUI can then give the user the option to
 * confirm and/or change these suggestions.</li>
 * <li>If desired, call
 * {@link org.virtualbox_4_2.IVirtualSystemDescription#setFinalValues(List,List,List)}
 * for each virtual system (machine) to override the suggestions made by the
 * {@link #interpret()} routine.</li>
 * <li>Finally, call {@link #importMachines(List)} to create virtual machines in
 * VirtualBox as instances of {@link org.virtualbox_4_2.IMachine} that match the
 * information in the virtual system descriptions. After this call succeeded,
 * the UUIDs of the machines created can be found in the {@link #getMachines()}
 * array attribute.</li>
 * </ol>
 * <b>Exporting</b> VirtualBox machines into an OVF appliance involves the
 * following steps:
 * 
 * <ol>
 * <li>As with importing, first call
 * {@link org.virtualbox_4_2.IVirtualBox#createAppliance()} to create an empty
 * IAppliance object.</li>
 * <li>For each machine you would like to export, call
 * {@link org.virtualbox_4_2.IMachine#export(org.virtualbox_4_2.IAppliance,String)}
 * with the IAppliance object you just created. Each such call creates one
 * instance of {@link org.virtualbox_4_2.IVirtualSystemDescription} inside the
 * appliance.</li>
 * <li>If desired, call
 * {@link org.virtualbox_4_2.IVirtualSystemDescription#setFinalValues(List,List,List)}
 * for each virtual system (machine) to override the suggestions made by the
 * {@link org.virtualbox_4_2.IMachine#export(org.virtualbox_4_2.IAppliance,String)}
 * routine.</li>
 * <li>Finally, call {@link #write(String,Boolean,String)} with a path
 * specification to have the OVF file written.</li>
 * </ol>
 * Interface ID: <tt>{3059CF9E-25C7-4F0B-9FA5-3C42E441670B}</tt>
 */
public class IAppliance extends IUnknown {

	public IAppliance(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * Path to the main file of the OVF appliance, which is either the <tt>.ovf</tt>
	 * or the <tt>.ova</tt> file passed to {@link #read(String)} (for import) or
	 * {@link #write(String,Boolean,String)} (for export). This attribute is empty
	 * until one of these methods has been called.
	 * 
	 * @return String
	 * 
	 */
	public String getPath() {
		try {
			String retVal = port.iApplianceGetPath(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Array of virtual disk definitions. One such description exists for each disk
	 * definition in the OVF; each string array item represents one such piece of
	 * disk information, with the information fields separated by tab (\\t)
	 * characters.
	 * 
	 * The caller should be prepared for additional fields being appended to this
	 * string in future versions of VirtualBox and therefore check for the number of
	 * tabs in the strings returned.
	 * 
	 * In the current version, the following eight fields are returned per string in
	 * the array:
	 * 
	 * <ol>
	 * <li>Disk ID (unique string identifier given to disk)</li>
	 * <li>Capacity (unsigned integer indicating the maximum capacity of the
	 * disk)</li>
	 * <li>Populated size (optional unsigned integer indicating the current size of
	 * the disk; can be approximate; -1 if unspecified)</li>
	 * <li>Format (string identifying the disk format, typically
	 * "http://www.vmware.com/specifications/vmdk.html#sparse")</li>
	 * <li>Reference (where to find the disk image, typically a file name; if empty,
	 * then the disk should be created on import)</li>
	 * <li>Image size (optional unsigned integer indicating the size of the image,
	 * which need not necessarily be the same as the values specified above, since
	 * the image may be compressed or sparse; -1 if not specified)</li>
	 * <li>Chunk size (optional unsigned integer if the image is split into chunks;
	 * presently unsupported and always -1)</li>
	 * <li>Compression (optional string equalling "gzip" if the image is
	 * gzip-compressed)</li>
	 * </ol>
	 * 
	 * @return List<String>
	 * 
	 */
	public List<String> getDisks() {
		try {
			List<String> retVal = port.iApplianceGetDisks(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Array of virtual system descriptions. One such description is created for
	 * each virtual system (machine) found in the OVF. This array is empty until
	 * either {@link #interpret()} (for import) or
	 * {@link org.virtualbox_4_2.IMachine#export(org.virtualbox_4_2.IAppliance,String)}
	 * (for export) has been called.
	 * 
	 * @return List<org.virtualbox_4_2.IVirtualSystemDescription>
	 * 
	 */
	public List<org.virtualbox_4_2.IVirtualSystemDescription> getVirtualSystemDescriptions() {
		try {
			List<String> retVal = port.iApplianceGetVirtualSystemDescriptions(obj);
			return Helper.wrap(org.virtualbox_4_2.IVirtualSystemDescription.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Contains the UUIDs of the machines created from the information in this
	 * appliances. This is only relevant for the import case, and will only contain
	 * data after a call to {@link #importMachines(List)} succeeded.
	 * 
	 * @return List<String>
	 * 
	 */
	public List<String> getMachines() {
		try {
			List<String> retVal = port.iApplianceGetMachines(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IAppliance queryInterface(IUnknown obj) {
		return obj == null ? null : new IAppliance(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Reads an OVF file into the appliance object.
	 * 
	 * This method succeeds if the OVF is syntactically valid and, by itself,
	 * without errors. The mere fact that this method returns successfully does not
	 * mean that VirtualBox supports all features requested by the appliance; this
	 * can only be examined after a call to {@link #interpret()}.
	 * 
	 * @param file Name of appliance file to open (either with an <tt>.ovf</tt> or
	 *             <tt>.ova</tt> extension, depending on whether the appliance is
	 *             distributed as a set of files or as a single file, respectively).
	 * 
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 */
	public org.virtualbox_4_2.IProgress read(String file) {
		try {
			String retVal;
			retVal = port.iApplianceRead(obj, file);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Interprets the OVF data that was read when the appliance was constructed.
	 * After calling this method, one can inspect the
	 * {@link #getVirtualSystemDescriptions()} array attribute, which will then
	 * contain one {@link org.virtualbox_4_2.IVirtualSystemDescription} for each
	 * virtual machine found in the appliance.
	 * 
	 * Calling this method is the second step of importing an appliance into
	 * VirtualBox; see {@link org.virtualbox_4_2.IAppliance} for an overview.
	 * 
	 * After calling this method, one should call {@link #getWarnings()} to find out
	 * if problems were encountered during the processing which might later lead to
	 * errors.
	 * 
	 */
	public void interpret() {
		try {
			port.iApplianceInterpret(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Imports the appliance into VirtualBox by creating instances of
	 * {@link org.virtualbox_4_2.IMachine} and other interfaces that match the
	 * information contained in the appliance as closely as possible, as represented
	 * by the import instructions in the {@link #getVirtualSystemDescriptions()}
	 * array.
	 * 
	 * Calling this method is the final step of importing an appliance into
	 * VirtualBox; see {@link org.virtualbox_4_2.IAppliance} for an overview.
	 * 
	 * Since importing the appliance will most probably involve copying and
	 * converting disk images, which can take a long time, this method operates
	 * asynchronously and returns an IProgress object to allow the caller to monitor
	 * the progress.
	 * 
	 * After the import succeeded, the UUIDs of the IMachine instances created can
	 * be retrieved from the {@link #getMachines()} array attribute.
	 * 
	 * @param options Options for the importing operation.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 */
	public org.virtualbox_4_2.IProgress importMachines(List<org.virtualbox_4_2.ImportOptions> options) {
		try {
			String retVal;
			retVal = port.iApplianceImportMachines(obj, Helper.convertEnums(org.virtualbox_4_2.ImportOptions.class,
					org.virtualbox_4_2.jaxws.ImportOptions.class, options));
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns a {@link org.virtualbox_4_2.IVFSExplorer} object for the given URI.
	 * 
	 * @param aUri The URI describing the file system to use.
	 * 
	 */
	public org.virtualbox_4_2.IVFSExplorer createVFSExplorer(String aUri) {
		try {
			String retVal;
			retVal = port.iApplianceCreateVFSExplorer(obj, aUri);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IVFSExplorer(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Writes the contents of the appliance exports into a new OVF file.
	 * 
	 * Calling this method is the final step of exporting an appliance from
	 * VirtualBox; see {@link org.virtualbox_4_2.IAppliance} for an overview.
	 * 
	 * Since exporting the appliance will most probably involve copying and
	 * converting disk images, which can take a long time, this method operates
	 * asynchronously and returns an IProgress object to allow the caller to monitor
	 * the progress.
	 * 
	 * @param format   Output format, as a string. Currently supported formats are
	 *                 "ovf-0.9", "ovf-1.0" and "ovf-2.0"; future versions of
	 *                 VirtualBox may support additional formats.
	 * 
	 * 
	 * @param manifest Indicate if the optional manifest file (.mf) should be
	 *                 written. The manifest file is used for integrity checks prior
	 *                 import.
	 * 
	 * 
	 * @param path     Name of appliance file to open (either with an <tt>.ovf</tt>
	 *                 or <tt>.ova</tt> extension, depending on whether the
	 *                 appliance is distributed as a set of files or as a single
	 *                 file, respectively).
	 * 
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 */
	public org.virtualbox_4_2.IProgress write(String format, Boolean manifest, String path) {
		try {
			String retVal;
			retVal = port.iApplianceWrite(obj, format, manifest, path);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns textual warnings which occurred during execution of
	 * {@link #interpret()}.
	 */
	public List<String> getWarnings() {
		try {
			List<String> retVal;
			retVal = port.iApplianceGetWarnings(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

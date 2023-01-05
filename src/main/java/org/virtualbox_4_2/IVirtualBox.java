
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
 * IVirtualBox.java
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
 * The IVirtualBox interface represents the main interface exposed by the
 * product that provides virtual machine management.
 * 
 * An instance of IVirtualBox is required for the product to do anything useful.
 * Even though the interface does not expose this, internally, IVirtualBox is
 * implemented as a singleton and actually lives in the process of the
 * VirtualBox server (VBoxSVC.exe). This makes sure that IVirtualBox can track
 * the state of all virtual machines on a particular host, regardless of which
 * frontend started them.
 * 
 * To enumerate all the virtual machines on the host, use the
 * {@link org.virtualbox_4_2.IVirtualBox#getMachines()} attribute.
 * 
 * Interface ID: <tt>{3B2F08EB-B810-4715-BEE0-BB06B9880AD2}</tt>
 */
public class IVirtualBox extends IUnknown {

	public IVirtualBox(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * A string representing the version number of the product. The format is 3
	 * integer numbers divided by dots (e.g. 1.0.1). The last number represents the
	 * build number and will frequently change.
	 * 
	 * This may be followed by a _ALPHA[0-9]*, _BETA[0-9]* or _RC[0-9]* tag in
	 * prerelease builds. Non-Oracle builds may (/shall) also have a publisher tag,
	 * at the end. The publisher tag starts with an underscore just like the
	 * prerelease build type tag.
	 * 
	 * @return String
	 * 
	 */
	public String getVersion() {
		try {
			String retVal = port.iVirtualBoxGetVersion(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * A string representing the version number of the product, without the
	 * publisher information (but still with other tags). See {@link #getVersion()}.
	 * 
	 * @return String
	 * 
	 */
	public String getVersionNormalized() {
		try {
			String retVal = port.iVirtualBoxGetVersionNormalized(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The internal build revision number of the product.
	 * 
	 * @return Long
	 * 
	 */
	public Long getRevision() {
		try {
			Long retVal = port.iVirtualBoxGetRevision(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * A string representing the package type of this product. The format is
	 * OS_ARCH_DIST where OS is either WINDOWS, LINUX, SOLARIS, DARWIN. ARCH is
	 * either 32BITS or 64BITS. DIST is either GENERIC, UBUNTU_606, UBUNTU_710, or
	 * something like this.
	 * 
	 * @return String
	 * 
	 */
	public String getPackageType() {
		try {
			String retVal = port.iVirtualBoxGetPackageType(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * A string representing the VirtualBox API version number. The format is 2
	 * integer numbers divided by an underscore (e.g. 1_0). After the first public
	 * release of packages with a particular API version the API will not be changed
	 * in an incompatible way. Note that this guarantee does not apply to
	 * development builds, and also there is no guarantee that this version is
	 * identical to the first two integer numbers of the package version.
	 * 
	 * @return String
	 * 
	 */
	public String getAPIVersion() {
		try {
			String retVal = port.iVirtualBoxGetAPIVersion(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Full path to the directory where the global settings file,
	 * <tt>VirtualBox.xml</tt>, is stored.
	 * 
	 * In this version of VirtualBox, the value of this property is always
	 * <tt><user_dir>/.VirtualBox</tt> (where <tt><user_dir></tt> is the path to the
	 * user directory, as determined by the host OS), and cannot be changed.
	 * 
	 * This path is also used as the base to resolve relative paths in places where
	 * relative paths are allowed (unless otherwise expressly indicated).
	 * 
	 * @return String
	 * 
	 */
	public String getHomeFolder() {
		try {
			String retVal = port.iVirtualBoxGetHomeFolder(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Full name of the global settings file. The value of this property corresponds
	 * to the value of {@link #getHomeFolder()} plus <tt>/VirtualBox.xml</tt>.
	 * 
	 * @return String
	 * 
	 */
	public String getSettingsFilePath() {
		try {
			String retVal = port.iVirtualBoxGetSettingsFilePath(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Associated host object.
	 * 
	 * @return org.virtualbox_4_2.IHost
	 * 
	 */
	public org.virtualbox_4_2.IHost getHost() {
		try {
			String retVal = port.iVirtualBoxGetHost(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IHost(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Associated system information object.
	 * 
	 * @return org.virtualbox_4_2.ISystemProperties
	 * 
	 */
	public org.virtualbox_4_2.ISystemProperties getSystemProperties() {
		try {
			String retVal = port.iVirtualBoxGetSystemProperties(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.ISystemProperties(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Array of machine objects registered within this VirtualBox instance.
	 * 
	 * @return List<org.virtualbox_4_2.IMachine>
	 * 
	 */
	public List<org.virtualbox_4_2.IMachine> getMachines() {
		try {
			List<String> retVal = port.iVirtualBoxGetMachines(obj);
			return Helper.wrap(org.virtualbox_4_2.IMachine.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Array of all machine group names which are used by the machines which are
	 * accessible. Each group is only listed once, however they are listed in no
	 * particular order and there is no guarantee that there are no gaps in the
	 * group hierarchy (i.e. <tt>"/"</tt>, <tt>"/group/subgroup"</tt> is a valid
	 * result).
	 * 
	 * @return List<String>
	 * 
	 */
	public List<String> getMachineGroups() {
		try {
			List<String> retVal = port.iVirtualBoxGetMachineGroups(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Array of medium objects known to this VirtualBox installation.
	 * 
	 * This array contains only base media. All differencing media of the given base
	 * medium can be enumerated using
	 * {@link org.virtualbox_4_2.IMedium#getChildren()}.
	 * 
	 * @return List<org.virtualbox_4_2.IMedium>
	 * 
	 */
	public List<org.virtualbox_4_2.IMedium> getHardDisks() {
		try {
			List<String> retVal = port.iVirtualBoxGetHardDisks(obj);
			return Helper.wrap(org.virtualbox_4_2.IMedium.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Array of CD/DVD image objects currently in use by this VirtualBox instance.
	 * 
	 * @return List<org.virtualbox_4_2.IMedium>
	 * 
	 */
	public List<org.virtualbox_4_2.IMedium> getDVDImages() {
		try {
			List<String> retVal = port.iVirtualBoxGetDVDImages(obj);
			return Helper.wrap(org.virtualbox_4_2.IMedium.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Array of floppy image objects currently in use by this VirtualBox instance.
	 * 
	 * @return List<org.virtualbox_4_2.IMedium>
	 * 
	 */
	public List<org.virtualbox_4_2.IMedium> getFloppyImages() {
		try {
			List<String> retVal = port.iVirtualBoxGetFloppyImages(obj);
			return Helper.wrap(org.virtualbox_4_2.IMedium.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public List<org.virtualbox_4_2.IProgress> getProgressOperations() {
		try {
			List<String> retVal = port.iVirtualBoxGetProgressOperations(obj);
			return Helper.wrap(org.virtualbox_4_2.IProgress.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public List<org.virtualbox_4_2.IGuestOSType> getGuestOSTypes() {
		try {
			List<org.virtualbox_4_2.jaxws.IGuestOSType> retVal = port.iVirtualBoxGetGuestOSTypes(obj);
			return Helper.wrap2(org.virtualbox_4_2.IGuestOSType.class, org.virtualbox_4_2.jaxws.IGuestOSType.class,
					port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Collection of global shared folders. Global shared folders are available to
	 * all virtual machines.
	 * 
	 * New shared folders are added to the collection using
	 * {@link #createSharedFolder(String,String,Boolean,Boolean)}. Existing shared
	 * folders can be removed using {@link #removeSharedFolder(String)}.
	 * 
	 * 
	 * NOTE: In the current version of the product, global shared folders are not
	 * implemented and therefore this collection is always empty.
	 * 
	 * 
	 * @return List<org.virtualbox_4_2.ISharedFolder>
	 * 
	 */
	public List<org.virtualbox_4_2.ISharedFolder> getSharedFolders() {
		try {
			List<org.virtualbox_4_2.jaxws.ISharedFolder> retVal = port.iVirtualBoxGetSharedFolders(obj);
			return Helper.wrap2(org.virtualbox_4_2.ISharedFolder.class, org.virtualbox_4_2.jaxws.ISharedFolder.class,
					port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Associated performance collector object.
	 * 
	 * @return org.virtualbox_4_2.IPerformanceCollector
	 * 
	 */
	public org.virtualbox_4_2.IPerformanceCollector getPerformanceCollector() {
		try {
			String retVal = port.iVirtualBoxGetPerformanceCollector(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IPerformanceCollector(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * DHCP servers.
	 * 
	 * @return List<org.virtualbox_4_2.IDHCPServer>
	 * 
	 */
	public List<org.virtualbox_4_2.IDHCPServer> getDHCPServers() {
		try {
			List<String> retVal = port.iVirtualBoxGetDHCPServers(obj);
			return Helper.wrap(org.virtualbox_4_2.IDHCPServer.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Event source for VirtualBox events.
	 * 
	 * @return org.virtualbox_4_2.IEventSource
	 * 
	 */
	public org.virtualbox_4_2.IEventSource getEventSource() {
		try {
			String retVal = port.iVirtualBoxGetEventSource(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IEventSource(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
	// skip attribute extensionPackManager of suppressed type IExtPackManager

	/**
	 * 
	 * Names of all internal networks.
	 * 
	 * @return List<String>
	 * 
	 */
	public List<String> getInternalNetworks() {
		try {
			List<String> retVal = port.iVirtualBoxGetInternalNetworks(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Names of all generic network drivers.
	 * 
	 * @return List<String>
	 * 
	 */
	public List<String> getGenericNetworkDrivers() {
		try {
			List<String> retVal = port.iVirtualBoxGetGenericNetworkDrivers(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IVirtualBox queryInterface(IUnknown obj) {
		return obj == null ? null : new IVirtualBox(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Returns a recommended full path of the settings file name for a new virtual
	 * machine.
	 * 
	 * This API serves two purposes:
	 * 
	 * <ul>
	 * <li>It gets called by
	 * {@link #createMachine(String,String,List,String,String)} if null or empty
	 * string (which is recommended) is specified for the settingsFile argument
	 * there, which means that API should use a recommended default file name.</li>
	 * <li>It can be called manually by a client software before creating a machine,
	 * e.g. if that client wants to pre-create the machine directory to create
	 * virtual hard disks in that directory together with the new machine settings
	 * file. In that case, the file name should be stripped from the full settings
	 * file path returned by this function to obtain the machine directory.</li>
	 * </ul>
	 * 
	 * See {@link org.virtualbox_4_2.IMachine#getName()} and
	 * {@link #createMachine(String,String,List,String,String)} for more details
	 * about the machine name.
	 * 
	 * groupName defines which additional subdirectory levels should be included. It
	 * must be either a valid group name or null or empty string which designates
	 * that the machine will not be related to a machine group.
	 * 
	 * If baseFolder is a null or empty string (which is recommended), the default
	 * machine settings folder (see
	 * {@link org.virtualbox_4_2.ISystemProperties#getDefaultMachineFolder()}) will
	 * be used as a base folder for the created machine, resulting in a file name
	 * like "/home/user/VirtualBox VMs/name/name.vbox". Otherwise the given base
	 * folder will be used.
	 * 
	 * This method does not access the host disks. In particular, it does not check
	 * for whether a machine with this name already exists.
	 * 
	 * @param name        Suggested machine name.
	 * 
	 * @param group       Machine group name for the new machine or machine group.
	 *                    It is used to determine the right subdirectory.
	 * 
	 * @param createFlags Machine creation flags, see
	 *                    {@link #createMachine(String,String,List,String,String)}
	 *                    (optional).
	 * 
	 * @param baseFolder  Base machine folder (optional).
	 * 
	 * @return Fully qualified path where the machine would be created.
	 * 
	 */
	public String composeMachineFilename(String name, String group, String createFlags, String baseFolder) {
		try {
			String retVal;
			retVal = port.iVirtualBoxComposeMachineFilename(obj, name, group, createFlags, baseFolder);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Creates a new virtual machine by creating a machine settings file at the
	 * given location.
	 * 
	 * VirtualBox machine settings files use a custom XML dialect. Starting with
	 * VirtualBox 4.0, a ".vbox" extension is recommended, but not enforced, and
	 * machine files can be created at arbitrary locations.
	 * 
	 * However, it is recommended that machines are created in the default machine
	 * folder (e.g. "/home/user/VirtualBox VMs/name/name.vbox"; see
	 * {@link org.virtualbox_4_2.ISystemProperties#getDefaultMachineFolder()}). If
	 * you specify null or empty string (which is recommended) for the settingsFile
	 * argument, {@link #composeMachineFilename(String,String,String,String)} is
	 * called automatically to have such a recommended name composed based on the
	 * machine name given in the name argument and the primary group.
	 * 
	 * If the resulting settings file already exists, this method will fail, unless
	 * the forceOverwrite flag is set.
	 * 
	 * The new machine is created unregistered, with the initial configuration set
	 * according to the specified guest OS type. A typical sequence of actions to
	 * create a new virtual machine is as follows:
	 * 
	 * <ol>
	 * <li>Call this method to have a new machine created. The returned machine
	 * object will be "mutable" allowing to change any machine property.</li>
	 * <li>Configure the machine using the appropriate attributes and methods.</li>
	 * <li>Call {@link org.virtualbox_4_2.IMachine#saveSettings()} to write the
	 * settings to the machine's XML settings file. The configuration of the newly
	 * created machine will not be saved to disk until this method is called.</li>
	 * <li>Call {@link #registerMachine(org.virtualbox_4_2.IMachine)} to add the
	 * machine to the list of machines known to VirtualBox.</li>
	 * </ol>
	 * 
	 * The specified guest OS type identifier must match an ID of one of known guest
	 * OS types listed in the
	 * {@link org.virtualbox_4_2.IVirtualBox#getGuestOSTypes()} array.
	 * 
	 * 
	 * @param settingsFile Fully qualified path where the settings file should be
	 *                     created, empty string or null for a default folder and
	 *                     file based on the name argument and the primary group.
	 *                     (see
	 *                     {@link #composeMachineFilename(String,String,String,String)}).
	 * 
	 * @param name         Machine name.
	 * 
	 * @param groups       Array of group names. null or an empty array have the
	 *                     same meaning as an array with just the empty string or
	 *                     <tt>"/"</tt>, i.e. create a machine without group
	 *                     association.
	 * 
	 * @param osTypeId     Guest OS Type ID.
	 * 
	 * @param flags        Additional property parameters, passed as a
	 *                     comma-separated list of "name=value" type entries. The
	 *                     following ones are recognized: <tt>forceOverwrite=1</tt>
	 *                     to overwrite an existing machine settings file,
	 *                     <tt>UUID=<uuid></tt> to specify a machine UUID and
	 *                     <tt>directoryIncludesUUID=1</tt> to switch to a special
	 *                     VM directory naming scheme which should not be used
	 *                     unless necessary.
	 * 
	 * 
	 * @return Created machine object.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>osTypeId is invalid.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_FILE_ERROR VBOX_E_FILE_ERROR</td>
	 *         <td>Resulting settings file name is invalid or the settings file
	 *         already exists or could not be created due to an I/O error.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>name is empty or null.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: There is no way to change the name of the settings file or
	 *         subfolder of the created machine directly.
	 * 
	 * 
	 */
	public org.virtualbox_4_2.IMachine createMachine(String settingsFile, String name, List<String> groups,
			String osTypeId, String flags) {
		try {
			String retVal;
			retVal = port.iVirtualBoxCreateMachine(obj, settingsFile, name, groups, osTypeId, flags);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IMachine(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Opens a virtual machine from the existing settings file. The opened machine
	 * remains unregistered until you call
	 * {@link #registerMachine(org.virtualbox_4_2.IMachine)}.
	 * 
	 * The specified settings file name must be fully qualified. The file must exist
	 * and be a valid machine XML settings file whose contents will be used to
	 * construct the machine object.
	 * 
	 * 
	 * @param settingsFile Name of the machine settings file.
	 * 
	 * 
	 * @return Opened machine object.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_FILE_ERROR VBOX_E_FILE_ERROR</td>
	 *         <td>Settings file name invalid, not found or sharing violation.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IMachine openMachine(String settingsFile) {
		try {
			String retVal;
			retVal = port.iVirtualBoxOpenMachine(obj, settingsFile);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IMachine(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * 
	 * Registers the machine previously created using
	 * {@link #createMachine(String,String,List,String,String)} or opened using
	 * {@link #openMachine(String)} within this VirtualBox installation. After
	 * successful method invocation, the
	 * {@link org.virtualbox_4_2.IMachineRegisteredEvent} event is fired.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 * <td>No matching virtual machine found.</td>
	 * <tr>
	 * <tr>
	 * <td>@link ::VBOX_E_INVALID_OBJECT_STATE VBOX_E_INVALID_OBJECT_STATE</td>
	 * <td>Virtual machine was not created within this VirtualBox instance.</td>
	 * <tr>
	 * </table>
	 * 
	 * NOTE: This method implicitly calls
	 * {@link org.virtualbox_4_2.IMachine#saveSettings()} to save all current
	 * machine settings before registering it.
	 * 
	 * 
	 */
	public void registerMachine(org.virtualbox_4_2.IMachine machine) {
		try {
			port.iVirtualBoxRegisterMachine(obj, ((machine == null) ? null : machine.getWrapped()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Attempts to find a virtual machine given its name or UUID.
	 * 
	 * 
	 * @param nameOrId What to search for. This can either be the UUID or the name
	 *                 of a virtual machine.
	 * 
	 * @return Machine object, if found.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>Could not find registered machine matching nameOrId.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: Inaccessible machines cannot be found by name, only by UUID,
	 *         because their name cannot safely be determined.
	 * 
	 */
	public org.virtualbox_4_2.IMachine findMachine(String nameOrId) {
		try {
			String retVal;
			retVal = port.iVirtualBoxFindMachine(obj, nameOrId);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IMachine(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Gets all machine references which are in one of the specified groups.
	 * 
	 * @param groups What groups to match. The usual group list rules apply, i.e.
	 *               passing an empty list will match VMs in the toplevel group,
	 *               likewise the empty string.
	 * 
	 * @return All machines which matched.
	 * 
	 */
	public List<org.virtualbox_4_2.IMachine> getMachinesByGroups(List<String> groups) {
		try {
			List<String> retVal;
			retVal = port.iVirtualBoxGetMachinesByGroups(obj, groups);
			return Helper.wrap(org.virtualbox_4_2.IMachine.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Gets the state of several machines in a single operation.
	 * 
	 * @param machines Array with the machine references.
	 * 
	 * @return Machine states, corresponding to the machines.
	 * 
	 */
	public List<org.virtualbox_4_2.MachineState> getMachineStates(List<org.virtualbox_4_2.IMachine> machines) {
		try {
			List<org.virtualbox_4_2.jaxws.MachineState> retVal;
			retVal = port.iVirtualBoxGetMachineStates(obj, Helper.unwrap(machines));
			return Helper.convertEnums(org.virtualbox_4_2.jaxws.MachineState.class,
					org.virtualbox_4_2.MachineState.class, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Creates a new appliance object, which represents an appliance in the Open
	 * Virtual Machine Format (OVF). This can then be used to import an OVF
	 * appliance into VirtualBox or to export machines as an OVF appliance; see the
	 * documentation for {@link org.virtualbox_4_2.IAppliance} for details.
	 * 
	 * @return New appliance.
	 * 
	 */
	public org.virtualbox_4_2.IAppliance createAppliance() {
		try {
			String retVal;
			retVal = port.iVirtualBoxCreateAppliance(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IAppliance(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Creates a new base medium object that will use the given storage format and
	 * location for medium data.
	 * 
	 * The actual storage unit is not created by this method. In order to do it, and
	 * before you are able to attach the created medium to virtual machines, you
	 * must call one of the following methods to allocate a format-specific storage
	 * unit at the specified location:
	 * <ul>
	 * <li>{@link org.virtualbox_4_2.IMedium#createBaseStorage(Long,Long)}</li>
	 * <li>{@link org.virtualbox_4_2.IMedium#createDiffStorage(org.virtualbox_4_2.IMedium,Long)}</li>
	 * </ul>
	 * 
	 * Some medium attributes, such as {@link org.virtualbox_4_2.IMedium#getId()},
	 * may remain uninitialized until the medium storage unit is successfully
	 * created by one of the above methods.
	 * 
	 * After the storage unit is successfully created, it will be accessible through
	 * the
	 * {@link #openMedium(String,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.AccessMode,Boolean)}
	 * method and can be found in the {@link #getHardDisks()} array.
	 * 
	 * The list of all storage formats supported by this VirtualBox installation can
	 * be obtained using
	 * {@link org.virtualbox_4_2.ISystemProperties#getMediumFormats()}. If the
	 * format attribute is empty or null then the default storage format specified
	 * by {@link org.virtualbox_4_2.ISystemProperties#getDefaultHardDiskFormat()}
	 * will be used for creating a storage unit of the medium.
	 * 
	 * Note that the format of the location string is storage format specific. See
	 * {@link org.virtualbox_4_2.IMedium#getLocation()} and IMedium for more
	 * details.
	 * 
	 * 
	 * @param format   Identifier of the storage format to use for the new medium.
	 * 
	 * 
	 * @param location Location of the storage unit for the new medium.
	 * 
	 * 
	 * @return Created medium object.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>format identifier is invalid. See
	 *         {@link org.virtualbox_4_2.ISystemProperties#getMediumFormats()}.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_FILE_ERROR VBOX_E_FILE_ERROR</td>
	 *         <td>location is a not valid file name (for file-based formats only).
	 *         </td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IMedium createHardDisk(String format, String location) {
		try {
			String retVal;
			retVal = port.iVirtualBoxCreateHardDisk(obj, format, location);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IMedium(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Finds existing media or opens a medium from an existing storage location.
	 * 
	 * Once a medium has been opened, it can be passed to other VirtualBox methods,
	 * in particular to
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}.
	 * 
	 * Depending on the given device type, the file at the storage location must be
	 * in one of the media formats understood by VirtualBox:
	 * 
	 * <ul>
	 * <li>With a "HardDisk" device type, the file must be a hard disk image in one
	 * of the formats supported by VirtualBox (see
	 * {@link org.virtualbox_4_2.ISystemProperties#getMediumFormats()}). After this
	 * method succeeds, if the medium is a base medium, it will be added to the
	 * {@link #getHardDisks()} array attribute.</li>
	 * <li>With a "DVD" device type, the file must be an ISO 9960 CD/DVD image.
	 * After this method succeeds, the medium will be added to the
	 * {@link #getDVDImages()} array attribute.</li>
	 * <li>With a "Floppy" device type, the file must be an RAW floppy image. After
	 * this method succeeds, the medium will be added to the
	 * {@link #getFloppyImages()} array attribute.</li>
	 * </ul>
	 * 
	 * After having been opened, the medium can be re-found by this method and can
	 * be attached to virtual machines. See {@link org.virtualbox_4_2.IMedium} for
	 * more details.
	 * 
	 * The UUID of the newly opened medium will either be retrieved from the storage
	 * location, if the format supports it (e.g. for hard disk images), or a new
	 * UUID will be randomly generated (e.g. for ISO and RAW files). If for some
	 * reason you need to change the medium's UUID, use
	 * {@link org.virtualbox_4_2.IMedium#setIds(Boolean,String,Boolean,String)}.
	 * 
	 * If a differencing hard disk medium is to be opened by this method, the
	 * operation will succeed only if its parent medium and all ancestors, if any,
	 * are already known to this VirtualBox installation (for example, were opened
	 * by this method before).
	 * 
	 * This method attempts to guess the storage format of the specified medium by
	 * reading medium data at the specified location.
	 * 
	 * If accessMode is ReadWrite (which it should be for hard disks and floppies),
	 * the image is opened for read/write access and must have according
	 * permissions, as VirtualBox may actually write status information into the
	 * disk's metadata sections.
	 * 
	 * Note that write access is required for all typical hard disk usage in
	 * VirtualBox, since VirtualBox may need to write metadata such as a UUID into
	 * the image. The only exception is opening a source image temporarily for
	 * copying and cloning (see
	 * {@link org.virtualbox_4_2.IMedium#cloneTo(org.virtualbox_4_2.IMedium,Long,org.virtualbox_4_2.IMedium)}
	 * when the image will be closed again soon.
	 * 
	 * The format of the location string is storage format specific. See
	 * {@link org.virtualbox_4_2.IMedium#getLocation()} and IMedium for more
	 * details.
	 * 
	 * 
	 * @param location     Location of the storage unit that contains medium data in
	 *                     one of the supported storage formats.
	 * 
	 * 
	 * @param deviceType   Must be one of "HardDisk", "DVD" or "Floppy".
	 * 
	 * 
	 * @param accessMode   Whether to open the image in read/write or read-only
	 *                     mode. For a "DVD" device type, this is ignored and
	 *                     read-only mode is always assumed.
	 * 
	 * @param forceNewUuid Allows the caller to request a completely new medium UUID
	 *                     for the image which is to be opened. Useful if one
	 *                     intends to open an exact copy of a previously opened
	 *                     image, as this would normally fail due to the duplicate
	 *                     UUID.
	 * 
	 * @return Opened medium object.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_FILE_ERROR VBOX_E_FILE_ERROR</td>
	 *         <td>Invalid medium storage file location or could not find the medium
	 *         at the specified location.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Could not get medium storage format.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>Invalid medium storage format.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *         VBOX_E_INVALID_OBJECT_STATE</td>
	 *         <td>Medium has already been added to a media registry.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IMedium openMedium(String location, org.virtualbox_4_2.DeviceType deviceType,
			org.virtualbox_4_2.AccessMode accessMode, Boolean forceNewUuid) {
		try {
			String retVal;
			retVal = port.iVirtualBoxOpenMedium(obj, location,
					org.virtualbox_4_2.jaxws.DeviceType.fromValue(deviceType.name()),
					org.virtualbox_4_2.jaxws.AccessMode.fromValue(accessMode.name()), forceNewUuid);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IMedium(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns an object describing the specified guest OS type.
	 * 
	 * The requested guest OS type is specified using a string which is a mnemonic
	 * identifier of the guest operating system, such as <tt>"win31"</tt> or
	 * <tt>"ubuntu"</tt>. The guest OS type ID of a particular virtual machine can
	 * be read or set using the {@link org.virtualbox_4_2.IMachine#getOSTypeId()}
	 * attribute.
	 * 
	 * The {@link org.virtualbox_4_2.IVirtualBox#getGuestOSTypes()} collection
	 * contains all available guest OS type objects. Each object has an
	 * {@link org.virtualbox_4_2.IGuestOSType#getId()} attribute which contains an
	 * identifier of the guest OS this object describes.
	 * 
	 * 
	 * @param id Guest OS type ID string.
	 * 
	 * @return Guest OS type object.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>id is not a valid Guest OS type.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IGuestOSType getGuestOSType(String id) {
		try {
			org.virtualbox_4_2.jaxws.IGuestOSType retVal;
			retVal = port.iVirtualBoxGetGuestOSType(obj, id);
			return (retVal != null) ? new org.virtualbox_4_2.IGuestOSType(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Creates a new global shared folder by associating the given logical name with
	 * the given host path, adds it to the collection of shared folders and starts
	 * sharing it. Refer to the description of
	 * {@link org.virtualbox_4_2.ISharedFolder} to read more about logical names.
	 * 
	 * @param name      Unique logical name of the shared folder.
	 * 
	 * @param hostPath  Full path to the shared folder in the host file system.
	 * 
	 * @param writable  Whether the share is writable or readonly
	 * 
	 * @param automount Whether the share gets automatically mounted by the guest or
	 *                  not.
	 * 
	 *                  NOTE: In the current implementation, this operation is not
	 *                  implemented.
	 * 
	 * 
	 */
	public void createSharedFolder(String name, String hostPath, Boolean writable, Boolean automount) {
		try {
			port.iVirtualBoxCreateSharedFolder(obj, name, hostPath, writable, automount);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes the global shared folder with the given name previously created by
	 * {@link #createSharedFolder(String,String,Boolean,Boolean)} from the
	 * collection of shared folders and stops sharing it.
	 * 
	 * @param name Logical name of the shared folder to remove.
	 * 
	 *             NOTE: In the current implementation, this operation is not
	 *             implemented.
	 * 
	 * 
	 */
	public void removeSharedFolder(String name) {
		try {
			port.iVirtualBoxRemoveSharedFolder(obj, name);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns an array representing the global extra data keys which currently have
	 * values defined.
	 * 
	 * @return Array of extra data keys.
	 * 
	 */
	public List<String> getExtraDataKeys() {
		try {
			List<String> retVal;
			retVal = port.iVirtualBoxGetExtraDataKeys(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns associated global extra data.
	 * 
	 * If the requested data key does not exist, this function will succeed and
	 * return an empty string in the value argument.
	 * 
	 * 
	 * @param key Name of the data key to get.
	 * 
	 * @return Value of the requested data key.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_FILE_ERROR VBOX_E_FILE_ERROR</td>
	 *         <td>Settings file not accessible.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_XML_ERROR VBOX_E_XML_ERROR</td>
	 *         <td>Could not parse the settings file.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public String getExtraData(String key) {
		try {
			String retVal;
			retVal = port.iVirtualBoxGetExtraData(obj, key);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets associated global extra data.
	 * 
	 * If you pass null or empty string as a key value, the given key will be
	 * deleted.
	 * 
	 * 
	 * @param key   Name of the data key to set.
	 * 
	 * @param value Value to assign to the key.
	 * 
	 *              Expected result codes:
	 *              <table>
	 *              <tr>
	 *              <td>@link ::VBOX_E_FILE_ERROR VBOX_E_FILE_ERROR</td>
	 *              <td>Settings file not accessible.</td>
	 *              <tr>
	 *              <tr>
	 *              <td>@link ::VBOX_E_XML_ERROR VBOX_E_XML_ERROR</td>
	 *              <td>Could not parse the settings file.</td>
	 *              <tr>
	 *              <tr>
	 *              <td>E_ACCESSDENIED</td>
	 *              <td>Modification request refused.</td>
	 *              <tr>
	 *              </table>
	 * 
	 *              NOTE: Before performing the actual data change, this method will
	 *              ask all registered event listener using the
	 *              {@link org.virtualbox_4_2.IExtraDataCanChangeEvent} notification
	 *              for a permission. If one of the listeners refuses the new value,
	 *              the change will not be performed.
	 * 
	 * 
	 *              NOTE: On success, the
	 *              {@link org.virtualbox_4_2.IExtraDataChangedEvent} notification
	 *              is called to inform all registered listeners about a successful
	 *              data change.
	 * 
	 * 
	 */
	public void setExtraData(String key, String value) {
		try {
			port.iVirtualBoxSetExtraData(obj, key, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Unlocks the secret data by passing the unlock password to the server. The
	 * server will cache the password for that machine.
	 * 
	 * 
	 * @param password The cipher key.
	 * 
	 * 
	 *                 Expected result codes:
	 *                 <table>
	 *                 <tr>
	 *                 <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                 VBOX_E_INVALID_VM_STATE</td>
	 *                 <td>Virtual machine is not mutable.</td>
	 *                 <tr>
	 *                 </table>
	 * 
	 */
	public void setSettingsSecret(String password) {
		try {
			port.iVirtualBoxSetSettingsSecret(obj, password);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Creates a DHCP server settings to be used for the given internal network name
	 * 
	 * @param name server name
	 * 
	 * @return DHCP server settings
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>Host network interface name already exists.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IDHCPServer createDHCPServer(String name) {
		try {
			String retVal;
			retVal = port.iVirtualBoxCreateDHCPServer(obj, name);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IDHCPServer(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Searches a DHCP server settings to be used for the given internal network
	 * name
	 * 
	 * @param name server name
	 * 
	 * @return DHCP server settings
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>Host network interface name already exists.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IDHCPServer findDHCPServerByNetworkName(String name) {
		try {
			String retVal;
			retVal = port.iVirtualBoxFindDHCPServerByNetworkName(obj, name);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IDHCPServer(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes the DHCP server settings
	 * 
	 * @param server DHCP server settings to be removed
	 * 
	 *               Expected result codes:
	 *               <table>
	 *               <tr>
	 *               <td>E_INVALIDARG</td>
	 *               <td>Host network interface name already exists.</td>
	 *               <tr>
	 *               </table>
	 * 
	 */
	public void removeDHCPServer(org.virtualbox_4_2.IDHCPServer server) {
		try {
			port.iVirtualBoxRemoveDHCPServer(obj, ((server == null) ? null : server.getWrapped()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Check if this VirtualBox installation has a firmware of the given type
	 * available, either system-wide or per-user. Optionally, this may return a hint
	 * where this firmware can be downloaded from.
	 * 
	 * @param firmwareType Type of firmware to check.
	 * 
	 * 
	 * @param version      Expected version number, usually empty string (presently
	 *                     ignored).
	 * 
	 * @param url          Suggested URL to download this firmware from.
	 * 
	 * 
	 * @param file         Filename of firmware, only valid if result == TRUE.
	 * 
	 * 
	 * @return If firmware of this type and version is available.
	 * 
	 */
	public Boolean checkFirmwarePresent(org.virtualbox_4_2.FirmwareType firmwareType, String version,
			Holder<String> url, Holder<String> file) {
		try {
			javax.xml.ws.Holder<String> tmp_url = new javax.xml.ws.Holder<String>();
			javax.xml.ws.Holder<String> tmp_file = new javax.xml.ws.Holder<String>();
			javax.xml.ws.Holder<Boolean> retVal = new javax.xml.ws.Holder<Boolean>();
			port.iVirtualBoxCheckFirmwarePresent(obj,
					org.virtualbox_4_2.jaxws.FirmwareType.fromValue(firmwareType.name()), version, tmp_url, tmp_file,
					retVal);
			url.value = tmp_url.value;
			file.value = tmp_file.value;
			return retVal.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}


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
 * IMachine.java
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
 * The IMachine interface represents a virtual machine, or guest, created in
 * VirtualBox.
 * 
 * This interface is used in two contexts. First of all, a collection of objects
 * implementing this interface is stored in the
 * {@link org.virtualbox_4_2.IVirtualBox#getMachines()} attribute which lists
 * all the virtual machines that are currently registered with this VirtualBox
 * installation. Also, once a session has been opened for the given virtual
 * machine (e.g. the virtual machine is running), the machine object associated
 * with the open session can be queried from the session object; see
 * {@link org.virtualbox_4_2.ISession} for details.
 * 
 * The main role of this interface is to expose the settings of the virtual
 * machine and provide methods to change various aspects of the virtual
 * machine's configuration. For machine objects stored in the
 * {@link org.virtualbox_4_2.IVirtualBox#getMachines()} collection, all
 * attributes are read-only unless explicitly stated otherwise in individual
 * attribute and method descriptions.
 * 
 * In order to change a machine setting, a session for this machine must be
 * opened using one of the
 * {@link org.virtualbox_4_2.IMachine#lockMachine(org.virtualbox_4_2.ISession,org.virtualbox_4_2.LockType)}
 * or
 * {@link org.virtualbox_4_2.IMachine#launchVMProcess(org.virtualbox_4_2.ISession,String,String)}
 * methods. After the machine has been successfully locked for a session, a
 * mutable machine object needs to be queried from the session object and then
 * the desired settings changes can be applied to the returned object using
 * IMachine attributes and methods. See the {@link org.virtualbox_4_2.ISession}
 * interface description for more information about sessions.
 * 
 * Note that IMachine does not provide methods to control virtual machine
 * execution (such as start the machine, or power it down) -- these methods are
 * grouped in a separate interface called {@link org.virtualbox_4_2.IConsole}.
 * 
 * 
 * @see org.virtualbox_4_2.ISession
 * @see org.virtualbox_4_2.IConsole
 * 
 *      Interface ID: <tt>{22781AF3-1C96-4126-9EDF-67A020E0E858}</tt>
 */
public class IMachine extends IUnknown {

	public IMachine(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * Associated parent object.
	 * 
	 * @return org.virtualbox_4_2.IVirtualBox
	 * 
	 */
	public org.virtualbox_4_2.IVirtualBox getParent() {
		try {
			String retVal = port.iMachineGetParent(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IVirtualBox(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Whether this virtual machine is currently accessible or not.
	 * 
	 * A machine is always deemed accessible unless it is registered <i>and</i> its
	 * settings file cannot be read or parsed (either because the file itself is
	 * unavailable or has invalid XML contents).
	 * 
	 * Every time this property is read, the accessibility state of this machine is
	 * re-evaluated. If the returned value is false, the {@link #getAccessError()}
	 * property may be used to get the detailed error information describing the
	 * reason of inaccessibility, including XML error messages.
	 * 
	 * When the machine is inaccessible, only the following properties can be used
	 * on it:
	 * <ul>
	 * <li>{@link #getParent()}</li>
	 * <li>{@link #getId()}</li>
	 * <li>{@link #getSettingsFilePath()}</li>
	 * <li>{@link #getAccessible()}</li>
	 * <li>{@link #getAccessError()}</li>
	 * </ul>
	 * 
	 * An attempt to access any other property or method will return an error.
	 * 
	 * The only possible action you can perform on an inaccessible machine is to
	 * unregister it using the
	 * {@link org.virtualbox_4_2.IMachine#unregister(org.virtualbox_4_2.CleanupMode)}
	 * call (or, to check for the accessibility state once more by querying this
	 * property).
	 * 
	 * 
	 * NOTE: In the current implementation, once this property returns true, the
	 * machine will never become inaccessible later, even if its settings file
	 * cannot be successfully read/written any more (at least, until the VirtualBox
	 * server is restarted). This limitation may be removed in future releases.
	 * 
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getAccessible() {
		try {
			Boolean retVal = port.iMachineGetAccessible(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Error information describing the reason of machine inaccessibility.
	 * 
	 * Reading this property is only valid after the last call to
	 * {@link #getAccessible()} returned false (i.e. the machine is currently
	 * inaccessible). Otherwise, a null IVirtualBoxErrorInfo object will be
	 * returned.
	 * 
	 * @return org.virtualbox_4_2.IVirtualBoxErrorInfo
	 * 
	 */
	public org.virtualbox_4_2.IVirtualBoxErrorInfo getAccessError() {
		try {
			String retVal = port.iMachineGetAccessError(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IVirtualBoxErrorInfo(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the virtual machine.
	 * 
	 * Besides being used for human-readable identification purposes everywhere in
	 * VirtualBox, the virtual machine name is also used as a name of the machine's
	 * settings file and as a name of the subdirectory this settings file resides
	 * in. Thus, every time you change the value of this property, the settings file
	 * will be renamed once you call {@link #saveSettings()} to confirm the change.
	 * The containing subdirectory will be also renamed, but only if it has exactly
	 * the same name as the settings file itself prior to changing this property
	 * (for backward compatibility with previous API releases). The above implies
	 * the following limitations:
	 * <ul>
	 * <li>The machine name cannot be empty.</li>
	 * <li>The machine name can contain only characters that are valid file name
	 * characters according to the rules of the file system used to store VirtualBox
	 * configuration.</li>
	 * <li>You cannot have two or more machines with the same name if they use the
	 * same subdirectory for storing the machine settings files.</li>
	 * <li>You cannot change the name of the machine if it is running, or if any
	 * file in the directory containing the settings file is being used by another
	 * running machine or by any other process in the host operating system at a
	 * time when {@link #saveSettings()} is called.</li>
	 * </ul>
	 * If any of the above limitations are hit, {@link #saveSettings()} will return
	 * an appropriate error message explaining the exact reason and the changes you
	 * made to this machine will not be saved.
	 * 
	 * Starting with VirtualBox 4.0, a ".vbox" extension of the settings file is
	 * recommended, but not enforced. (Previous versions always used a generic
	 * ".xml" extension.)
	 * 
	 * @return String
	 * 
	 */
	public String getName() {
		try {
			String retVal = port.iMachineGetName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the virtual machine.
	 * 
	 * Besides being used for human-readable identification purposes everywhere in
	 * VirtualBox, the virtual machine name is also used as a name of the machine's
	 * settings file and as a name of the subdirectory this settings file resides
	 * in. Thus, every time you change the value of this property, the settings file
	 * will be renamed once you call {@link #saveSettings()} to confirm the change.
	 * The containing subdirectory will be also renamed, but only if it has exactly
	 * the same name as the settings file itself prior to changing this property
	 * (for backward compatibility with previous API releases). The above implies
	 * the following limitations:
	 * <ul>
	 * <li>The machine name cannot be empty.</li>
	 * <li>The machine name can contain only characters that are valid file name
	 * characters according to the rules of the file system used to store VirtualBox
	 * configuration.</li>
	 * <li>You cannot have two or more machines with the same name if they use the
	 * same subdirectory for storing the machine settings files.</li>
	 * <li>You cannot change the name of the machine if it is running, or if any
	 * file in the directory containing the settings file is being used by another
	 * running machine or by any other process in the host operating system at a
	 * time when {@link #saveSettings()} is called.</li>
	 * </ul>
	 * If any of the above limitations are hit, {@link #saveSettings()} will return
	 * an appropriate error message explaining the exact reason and the changes you
	 * made to this machine will not be saved.
	 * 
	 * Starting with VirtualBox 4.0, a ".vbox" extension of the settings file is
	 * recommended, but not enforced. (Previous versions always used a generic
	 * ".xml" extension.)
	 * 
	 * @param value String
	 * 
	 */
	public void setName(String value) {
		try {
			port.iMachineSetName(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Description of the virtual machine.
	 * 
	 * The description attribute can contain any text and is typically used to
	 * describe the hardware and software configuration of the virtual machine in
	 * detail (i.e. network settings, versions of the installed software and so on).
	 * 
	 * @return String
	 * 
	 */
	public String getDescription() {
		try {
			String retVal = port.iMachineGetDescription(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Description of the virtual machine.
	 * 
	 * The description attribute can contain any text and is typically used to
	 * describe the hardware and software configuration of the virtual machine in
	 * detail (i.e. network settings, versions of the installed software and so on).
	 * 
	 * @param value String
	 * 
	 */
	public void setDescription(String value) {
		try {
			port.iMachineSetDescription(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * UUID of the virtual machine.
	 * 
	 * @return String
	 * 
	 */
	public String getId() {
		try {
			String retVal = port.iMachineGetId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Array of machine group names of which this machine is a member. <tt>""</tt>
	 * and <tt>"/"</tt> are synonyms for the toplevel group. Each group is only
	 * listed once, however they are listed in no particular order and there is no
	 * guarantee that there are no gaps in the group hierarchy (i.e.
	 * <tt>"/group"</tt>, <tt>"/group/subgroup/subsubgroup"</tt> is a valid result).
	 * 
	 * @return List<String>
	 * 
	 */
	public List<String> getGroups() {
		try {
			List<String> retVal = port.iMachineGetGroups(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Array of machine group names of which this machine is a member. <tt>""</tt>
	 * and <tt>"/"</tt> are synonyms for the toplevel group. Each group is only
	 * listed once, however they are listed in no particular order and there is no
	 * guarantee that there are no gaps in the group hierarchy (i.e.
	 * <tt>"/group"</tt>, <tt>"/group/subgroup/subsubgroup"</tt> is a valid result).
	 * 
	 * @param value List<String>
	 * 
	 */
	public void setGroups(List<String> value) {
		try {
			port.iMachineSetGroups(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * User-defined identifier of the Guest OS type. You may use
	 * {@link org.virtualbox_4_2.IVirtualBox#getGuestOSType(String)} to obtain an
	 * IGuestOSType object representing details about the given Guest OS type.
	 * 
	 * NOTE: This value may differ from the value returned by
	 * {@link org.virtualbox_4_2.IGuest#getOSTypeId()} if Guest Additions are
	 * installed to the guest OS.
	 * 
	 * 
	 * @return String
	 * 
	 */
	public String getOSTypeId() {
		try {
			String retVal = port.iMachineGetOSTypeId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * User-defined identifier of the Guest OS type. You may use
	 * {@link org.virtualbox_4_2.IVirtualBox#getGuestOSType(String)} to obtain an
	 * IGuestOSType object representing details about the given Guest OS type.
	 * 
	 * NOTE: This value may differ from the value returned by
	 * {@link org.virtualbox_4_2.IGuest#getOSTypeId()} if Guest Additions are
	 * installed to the guest OS.
	 * 
	 * 
	 * @param value String
	 * 
	 */
	public void setOSTypeId(String value) {
		try {
			port.iMachineSetOSTypeId(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Hardware version identifier. Internal use only for now.
	 * 
	 * @return String
	 * 
	 */
	public String getHardwareVersion() {
		try {
			String retVal = port.iMachineGetHardwareVersion(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Hardware version identifier. Internal use only for now.
	 * 
	 * @param value String
	 * 
	 */
	public void setHardwareVersion(String value) {
		try {
			port.iMachineSetHardwareVersion(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The UUID presented to the guest via memory tables, hardware and guest
	 * properties. For most VMs this is the same as the id, but for VMs which have
	 * been cloned or teleported it may be the same as the source VM. The latter is
	 * because the guest shouldn't notice that it was cloned or teleported.
	 * 
	 * @return String
	 * 
	 */
	public String getHardwareUUID() {
		try {
			String retVal = port.iMachineGetHardwareUUID(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The UUID presented to the guest via memory tables, hardware and guest
	 * properties. For most VMs this is the same as the id, but for VMs which have
	 * been cloned or teleported it may be the same as the source VM. The latter is
	 * because the guest shouldn't notice that it was cloned or teleported.
	 * 
	 * @param value String
	 * 
	 */
	public void setHardwareUUID(String value) {
		try {
			port.iMachineSetHardwareUUID(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Number of virtual CPUs in the VM.
	 * 
	 * @return Long
	 * 
	 */
	public Long getCPUCount() {
		try {
			Long retVal = port.iMachineGetCPUCount(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Number of virtual CPUs in the VM.
	 * 
	 * @param value Long
	 * 
	 */
	public void setCPUCount(Long value) {
		try {
			port.iMachineSetCPUCount(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines whether VirtualBox allows CPU hotplugging for this
	 * machine.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getCPUHotPlugEnabled() {
		try {
			Boolean retVal = port.iMachineGetCPUHotPlugEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines whether VirtualBox allows CPU hotplugging for this
	 * machine.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setCPUHotPlugEnabled(Boolean value) {
		try {
			port.iMachineSetCPUHotPlugEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Means to limit the number of CPU cycles a guest can use. The unit is
	 * percentage of host CPU cycles per second. The valid range is 1 - 100. 100
	 * (the default) implies no limit.
	 * 
	 * @return Long
	 * 
	 */
	public Long getCPUExecutionCap() {
		try {
			Long retVal = port.iMachineGetCPUExecutionCap(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Means to limit the number of CPU cycles a guest can use. The unit is
	 * percentage of host CPU cycles per second. The valid range is 1 - 100. 100
	 * (the default) implies no limit.
	 * 
	 * @param value Long
	 * 
	 */
	public void setCPUExecutionCap(Long value) {
		try {
			port.iMachineSetCPUExecutionCap(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * System memory size in megabytes.
	 * 
	 * @return Long
	 * 
	 */
	public Long getMemorySize() {
		try {
			Long retVal = port.iMachineGetMemorySize(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * System memory size in megabytes.
	 * 
	 * @param value Long
	 * 
	 */
	public void setMemorySize(Long value) {
		try {
			port.iMachineSetMemorySize(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Memory balloon size in megabytes.
	 * 
	 * @return Long
	 * 
	 */
	public Long getMemoryBalloonSize() {
		try {
			Long retVal = port.iMachineGetMemoryBalloonSize(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Memory balloon size in megabytes.
	 * 
	 * @param value Long
	 * 
	 */
	public void setMemoryBalloonSize(Long value) {
		try {
			port.iMachineSetMemoryBalloonSize(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines whether VirtualBox allows page fusion for this
	 * machine (64 bits host only).
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getPageFusionEnabled() {
		try {
			Boolean retVal = port.iMachineGetPageFusionEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines whether VirtualBox allows page fusion for this
	 * machine (64 bits host only).
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setPageFusionEnabled(Boolean value) {
		try {
			port.iMachineSetPageFusionEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Video memory size in megabytes.
	 * 
	 * @return Long
	 * 
	 */
	public Long getVRAMSize() {
		try {
			Long retVal = port.iMachineGetVRAMSize(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Video memory size in megabytes.
	 * 
	 * @param value Long
	 * 
	 */
	public void setVRAMSize(Long value) {
		try {
			port.iMachineSetVRAMSize(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines whether VirtualBox allows this machine to make use of
	 * the 3D graphics support available on the host.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getAccelerate3DEnabled() {
		try {
			Boolean retVal = port.iMachineGetAccelerate3DEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines whether VirtualBox allows this machine to make use of
	 * the 3D graphics support available on the host.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setAccelerate3DEnabled(Boolean value) {
		try {
			port.iMachineSetAccelerate3DEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines whether VirtualBox allows this machine to make use of
	 * the 2D video acceleration support available on the host.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getAccelerate2DVideoEnabled() {
		try {
			Boolean retVal = port.iMachineGetAccelerate2DVideoEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines whether VirtualBox allows this machine to make use of
	 * the 2D video acceleration support available on the host.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setAccelerate2DVideoEnabled(Boolean value) {
		try {
			port.iMachineSetAccelerate2DVideoEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Number of virtual monitors.
	 * 
	 * NOTE: Only effective on Windows XP and later guests with Guest Additions
	 * installed.
	 * 
	 * 
	 * @return Long
	 * 
	 */
	public Long getMonitorCount() {
		try {
			Long retVal = port.iMachineGetMonitorCount(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Number of virtual monitors.
	 * 
	 * NOTE: Only effective on Windows XP and later guests with Guest Additions
	 * installed.
	 * 
	 * 
	 * @param value Long
	 * 
	 */
	public void setMonitorCount(Long value) {
		try {
			port.iMachineSetMonitorCount(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines whether VirtualBox uses video recording to record VM
	 * session.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getVideoCaptureEnabled() {
		try {
			Boolean retVal = port.iMachineGetVideoCaptureEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines whether VirtualBox uses video recording to record VM
	 * session.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setVideoCaptureEnabled(Boolean value) {
		try {
			port.iMachineSetVideoCaptureEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines what filename VirtualBox uses to save the recorded
	 * content.
	 * 
	 * @return String
	 * 
	 */
	public String getVideoCaptureFile() {
		try {
			String retVal = port.iMachineGetVideoCaptureFile(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines what filename VirtualBox uses to save the recorded
	 * content.
	 * 
	 * @param value String
	 * 
	 */
	public void setVideoCaptureFile(String value) {
		try {
			port.iMachineSetVideoCaptureFile(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines what should be the horizontal resolution of recorded
	 * video.
	 * 
	 * @return Long
	 * 
	 */
	public Long getVideoCaptureWidth() {
		try {
			Long retVal = port.iMachineGetVideoCaptureWidth(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines what should be the horizontal resolution of recorded
	 * video.
	 * 
	 * @param value Long
	 * 
	 */
	public void setVideoCaptureWidth(Long value) {
		try {
			port.iMachineSetVideoCaptureWidth(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines what should be the vertical resolution of recorded
	 * video.
	 * 
	 * @return Long
	 * 
	 */
	public Long getVideoCaptureHeight() {
		try {
			Long retVal = port.iMachineGetVideoCaptureHeight(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This setting determines what should be the vertical resolution of recorded
	 * video.
	 * 
	 * @param value Long
	 * 
	 */
	public void setVideoCaptureHeight(Long value) {
		try {
			port.iMachineSetVideoCaptureHeight(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Object containing all BIOS settings.
	 * 
	 * @return org.virtualbox_4_2.IBIOSSettings
	 * 
	 */
	public org.virtualbox_4_2.IBIOSSettings getBIOSSettings() {
		try {
			String retVal = port.iMachineGetBIOSSettings(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IBIOSSettings(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Type of firmware (such as legacy BIOS or EFI), used for initial bootstrap in
	 * this VM.
	 * 
	 * @return org.virtualbox_4_2.FirmwareType
	 * 
	 */
	public org.virtualbox_4_2.FirmwareType getFirmwareType() {
		try {
			org.virtualbox_4_2.jaxws.FirmwareType retVal = port.iMachineGetFirmwareType(obj);
			return org.virtualbox_4_2.FirmwareType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Type of firmware (such as legacy BIOS or EFI), used for initial bootstrap in
	 * this VM.
	 * 
	 * @param value org.virtualbox_4_2.FirmwareType
	 * 
	 */
	public void setFirmwareType(org.virtualbox_4_2.FirmwareType value) {
		try {
			port.iMachineSetFirmwareType(obj, org.virtualbox_4_2.jaxws.FirmwareType.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Type of pointing HID (such as mouse or tablet) used in this VM. The default
	 * is typically "PS2Mouse" but can vary depending on the requirements of the
	 * guest operating system.
	 * 
	 * @return org.virtualbox_4_2.PointingHIDType
	 * 
	 */
	public org.virtualbox_4_2.PointingHIDType getPointingHIDType() {
		try {
			org.virtualbox_4_2.jaxws.PointingHIDType retVal = port.iMachineGetPointingHIDType(obj);
			return org.virtualbox_4_2.PointingHIDType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Type of pointing HID (such as mouse or tablet) used in this VM. The default
	 * is typically "PS2Mouse" but can vary depending on the requirements of the
	 * guest operating system.
	 * 
	 * @param value org.virtualbox_4_2.PointingHIDType
	 * 
	 */
	public void setPointingHIDType(org.virtualbox_4_2.PointingHIDType value) {
		try {
			port.iMachineSetPointingHIDType(obj, org.virtualbox_4_2.jaxws.PointingHIDType.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Type of keyboard HID used in this VM. The default is typically "PS2Keyboard"
	 * but can vary depending on the requirements of the guest operating system.
	 * 
	 * @return org.virtualbox_4_2.KeyboardHIDType
	 * 
	 */
	public org.virtualbox_4_2.KeyboardHIDType getKeyboardHIDType() {
		try {
			org.virtualbox_4_2.jaxws.KeyboardHIDType retVal = port.iMachineGetKeyboardHIDType(obj);
			return org.virtualbox_4_2.KeyboardHIDType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Type of keyboard HID used in this VM. The default is typically "PS2Keyboard"
	 * but can vary depending on the requirements of the guest operating system.
	 * 
	 * @param value org.virtualbox_4_2.KeyboardHIDType
	 * 
	 */
	public void setKeyboardHIDType(org.virtualbox_4_2.KeyboardHIDType value) {
		try {
			port.iMachineSetKeyboardHIDType(obj, org.virtualbox_4_2.jaxws.KeyboardHIDType.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * This attribute controls if High Precision Event Timer (HPET) is enabled in
	 * this VM. Use this property if you want to provide guests with additional time
	 * source, or if guest requires HPET to function correctly. Default is false.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getHPETEnabled() {
		try {
			Boolean retVal = port.iMachineGetHPETEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * This attribute controls if High Precision Event Timer (HPET) is enabled in
	 * this VM. Use this property if you want to provide guests with additional time
	 * source, or if guest requires HPET to function correctly. Default is false.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setHPETEnabled(Boolean value) {
		try {
			port.iMachineSetHPETEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Chipset type used in this VM.
	 * 
	 * @return org.virtualbox_4_2.ChipsetType
	 * 
	 */
	public org.virtualbox_4_2.ChipsetType getChipsetType() {
		try {
			org.virtualbox_4_2.jaxws.ChipsetType retVal = port.iMachineGetChipsetType(obj);
			return org.virtualbox_4_2.ChipsetType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Chipset type used in this VM.
	 * 
	 * @param value org.virtualbox_4_2.ChipsetType
	 * 
	 */
	public void setChipsetType(org.virtualbox_4_2.ChipsetType value) {
		try {
			port.iMachineSetChipsetType(obj, org.virtualbox_4_2.jaxws.ChipsetType.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Full path to the directory used to store snapshot data (differencing media
	 * and saved state files) of this machine.
	 * 
	 * The initial value of this property is
	 * <tt><</tt>{@link #getSettingsFilePath()}<tt>>/<</tt>{@link #getId()}<tt>></tt>.
	 * 
	 * Currently, it is an error to try to change this property on a machine that
	 * has snapshots (because this would require to move possibly large files to a
	 * different location). A separate method will be available for this purpose
	 * later.
	 * 
	 * 
	 * NOTE: Setting this property to null or to an empty string will restore the
	 * initial value.
	 * 
	 * 
	 * NOTE: When setting this property, the specified path can be absolute (full
	 * path) or relative to the directory where the {@link #getSettingsFilePath()}
	 * is located. When reading this property, a full path is always returned.
	 * 
	 * 
	 * NOTE: The specified path may not exist, it will be created when necessary.
	 * 
	 * 
	 * @return String
	 * 
	 */
	public String getSnapshotFolder() {
		try {
			String retVal = port.iMachineGetSnapshotFolder(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Full path to the directory used to store snapshot data (differencing media
	 * and saved state files) of this machine.
	 * 
	 * The initial value of this property is
	 * <tt><</tt>{@link #getSettingsFilePath()}<tt>>/<</tt>{@link #getId()}<tt>></tt>.
	 * 
	 * Currently, it is an error to try to change this property on a machine that
	 * has snapshots (because this would require to move possibly large files to a
	 * different location). A separate method will be available for this purpose
	 * later.
	 * 
	 * 
	 * NOTE: Setting this property to null or to an empty string will restore the
	 * initial value.
	 * 
	 * 
	 * NOTE: When setting this property, the specified path can be absolute (full
	 * path) or relative to the directory where the {@link #getSettingsFilePath()}
	 * is located. When reading this property, a full path is always returned.
	 * 
	 * 
	 * NOTE: The specified path may not exist, it will be created when necessary.
	 * 
	 * 
	 * @param value String
	 * 
	 */
	public void setSnapshotFolder(String value) {
		try {
			port.iMachineSetSnapshotFolder(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * VirtualBox Remote Desktop Extension (VRDE) server object.
	 * 
	 * @return org.virtualbox_4_2.IVRDEServer
	 * 
	 */
	public org.virtualbox_4_2.IVRDEServer getVRDEServer() {
		try {
			String retVal = port.iMachineGetVRDEServer(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IVRDEServer(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public Boolean getEmulatedUSBWebcameraEnabled() {
		try {
			Boolean retVal = port.iMachineGetEmulatedUSBWebcameraEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public void setEmulatedUSBWebcameraEnabled(Boolean value) {
		try {
			port.iMachineSetEmulatedUSBWebcameraEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public Boolean getEmulatedUSBCardReaderEnabled() {
		try {
			Boolean retVal = port.iMachineGetEmulatedUSBCardReaderEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public void setEmulatedUSBCardReaderEnabled(Boolean value) {
		try {
			port.iMachineSetEmulatedUSBCardReaderEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Array of media attached to this machine.
	 * 
	 * @return List<org.virtualbox_4_2.IMediumAttachment>
	 * 
	 */
	public List<org.virtualbox_4_2.IMediumAttachment> getMediumAttachments() {
		try {
			List<org.virtualbox_4_2.jaxws.IMediumAttachment> retVal = port.iMachineGetMediumAttachments(obj);
			return Helper.wrap2(org.virtualbox_4_2.IMediumAttachment.class,
					org.virtualbox_4_2.jaxws.IMediumAttachment.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Associated USB controller object.
	 * 
	 * 
	 * NOTE: If USB functionality is not available in the given edition of
	 * VirtualBox, this method will set the result code to E_NOTIMPL.
	 * 
	 * 
	 * @return org.virtualbox_4_2.IUSBController
	 * 
	 */
	public org.virtualbox_4_2.IUSBController getUSBController() {
		try {
			String retVal = port.iMachineGetUSBController(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IUSBController(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Associated audio adapter, always present.
	 * 
	 * @return org.virtualbox_4_2.IAudioAdapter
	 * 
	 */
	public org.virtualbox_4_2.IAudioAdapter getAudioAdapter() {
		try {
			String retVal = port.iMachineGetAudioAdapter(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IAudioAdapter(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Array of storage controllers attached to this machine.
	 * 
	 * @return List<org.virtualbox_4_2.IStorageController>
	 * 
	 */
	public List<org.virtualbox_4_2.IStorageController> getStorageControllers() {
		try {
			List<String> retVal = port.iMachineGetStorageControllers(obj);
			return Helper.wrap(org.virtualbox_4_2.IStorageController.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Full name of the file containing machine settings data.
	 * 
	 * @return String
	 * 
	 */
	public String getSettingsFilePath() {
		try {
			String retVal = port.iMachineGetSettingsFilePath(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Whether the settings of this machine have been modified (but neither yet
	 * saved nor discarded).
	 * 
	 * NOTE: Reading this property is only valid on instances returned by
	 * {@link org.virtualbox_4_2.ISession#getMachine()} and on new machines created
	 * by
	 * {@link org.virtualbox_4_2.IVirtualBox#createMachine(String,String,List,String,String)}
	 * or opened by {@link org.virtualbox_4_2.IVirtualBox#openMachine(String)} but
	 * not yet registered, or on unregistered machines after calling
	 * {@link org.virtualbox_4_2.IMachine#unregister(org.virtualbox_4_2.CleanupMode)}.
	 * For all other cases, the settings can never be modified.
	 * 
	 * 
	 * NOTE: For newly created unregistered machines, the value of this property is
	 * always true until {@link #saveSettings()} is called (no matter if any machine
	 * settings have been changed after the creation or not). For opened machines
	 * the value is set to false (and then follows to normal rules).
	 * 
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getSettingsModified() {
		try {
			Boolean retVal = port.iMachineGetSettingsModified(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Current session state for this machine.
	 * 
	 * @return org.virtualbox_4_2.SessionState
	 * 
	 */
	public org.virtualbox_4_2.SessionState getSessionState() {
		try {
			org.virtualbox_4_2.jaxws.SessionState retVal = port.iMachineGetSessionState(obj);
			return org.virtualbox_4_2.SessionState.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Type of the session. If {@link #getSessionState()} is Spawning or Locked,
	 * this attribute contains the same value as passed to the
	 * {@link org.virtualbox_4_2.IMachine#launchVMProcess(org.virtualbox_4_2.ISession,String,String)}
	 * method in the type parameter. If the session was used with
	 * {@link org.virtualbox_4_2.IMachine#lockMachine(org.virtualbox_4_2.ISession,org.virtualbox_4_2.LockType)},
	 * or if {@link #getSessionState()} is SessionClosed, the value of this
	 * attribute is an empty string.
	 * 
	 * @return String
	 * 
	 */
	public String getSessionType() {
		try {
			String retVal = port.iMachineGetSessionType(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Identifier of the session process. This attribute contains the
	 * platform-dependent identifier of the process whose session was used with
	 * {@link org.virtualbox_4_2.IMachine#lockMachine(org.virtualbox_4_2.ISession,org.virtualbox_4_2.LockType)}
	 * call. The returned value is only valid if {@link #getSessionState()} is
	 * Locked or Unlocking by the time this property is read.
	 * 
	 * @return Long
	 * 
	 */
	public Long getSessionPID() {
		try {
			Long retVal = port.iMachineGetSessionPID(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Current execution state of this machine.
	 * 
	 * @return org.virtualbox_4_2.MachineState
	 * 
	 */
	public org.virtualbox_4_2.MachineState getState() {
		try {
			org.virtualbox_4_2.jaxws.MachineState retVal = port.iMachineGetState(obj);
			return org.virtualbox_4_2.MachineState.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Time stamp of the last execution state change, in milliseconds since
	 * 1970-01-01 UTC.
	 * 
	 * @return Long
	 * 
	 */
	public Long getLastStateChange() {
		try {
			Long retVal = port.iMachineGetLastStateChange(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Full path to the file that stores the execution state of the machine when it
	 * is in the {@link org.virtualbox_4_2.MachineState#Saved} state.
	 * 
	 * NOTE: When the machine is not in the Saved state, this attribute is an empty
	 * string.
	 * 
	 * 
	 * @return String
	 * 
	 */
	public String getStateFilePath() {
		try {
			String retVal = port.iMachineGetStateFilePath(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Full path to the folder that stores a set of rotated log files recorded
	 * during machine execution. The most recent log file is named
	 * <tt>VBox.log</tt>, the previous log file is named <tt>VBox.log.1</tt> and so
	 * on (up to <tt>VBox.log.3</tt> in the current version).
	 * 
	 * @return String
	 * 
	 */
	public String getLogFolder() {
		try {
			String retVal = port.iMachineGetLogFolder(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Current snapshot of this machine. This is null if the machine currently has
	 * no snapshots. If it is not null, then it was set by one of
	 * {@link org.virtualbox_4_2.IConsole#takeSnapshot(String,String)},
	 * {@link org.virtualbox_4_2.IConsole#deleteSnapshot(String)} or
	 * {@link org.virtualbox_4_2.IConsole#restoreSnapshot(org.virtualbox_4_2.ISnapshot)},
	 * depending on which was called last. See {@link org.virtualbox_4_2.ISnapshot}
	 * for details.
	 * 
	 * @return org.virtualbox_4_2.ISnapshot
	 * 
	 */
	public org.virtualbox_4_2.ISnapshot getCurrentSnapshot() {
		try {
			String retVal = port.iMachineGetCurrentSnapshot(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.ISnapshot(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Number of snapshots taken on this machine. Zero means the machine doesn't
	 * have any snapshots.
	 * 
	 * @return Long
	 * 
	 */
	public Long getSnapshotCount() {
		try {
			Long retVal = port.iMachineGetSnapshotCount(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns true if the current state of the machine is not identical to the
	 * state stored in the current snapshot.
	 * 
	 * The current state is identical to the current snapshot only directly after
	 * one of the following calls are made:
	 * 
	 * <ul>
	 * <li>{@link org.virtualbox_4_2.IConsole#restoreSnapshot(org.virtualbox_4_2.ISnapshot)}</li>
	 * <li>{@link org.virtualbox_4_2.IConsole#takeSnapshot(String,String)} (issued
	 * on a "powered off" or "saved" machine, for which
	 * {@link #getSettingsModified()} returns false)</li>
	 * </ul>
	 * 
	 * The current state remains identical until one of the following happens:
	 * <ul>
	 * <li>settings of the machine are changed</li>
	 * <li>the saved state is deleted</li>
	 * <li>the current snapshot is deleted</li>
	 * <li>an attempt to execute the machine is made</li>
	 * </ul>
	 * NOTE: For machines that don't have snapshots, this property is always false.
	 * 
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getCurrentStateModified() {
		try {
			Boolean retVal = port.iMachineGetCurrentStateModified(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Collection of shared folders for this machine (permanent shared folders).
	 * These folders are shared automatically at machine startup and available only
	 * to the guest OS installed within this machine.
	 * 
	 * New shared folders are added to the collection using
	 * {@link #createSharedFolder(String,String,Boolean,Boolean)}. Existing shared
	 * folders can be removed using {@link #removeSharedFolder(String)}.
	 * 
	 * @return List<org.virtualbox_4_2.ISharedFolder>
	 * 
	 */
	public List<org.virtualbox_4_2.ISharedFolder> getSharedFolders() {
		try {
			List<org.virtualbox_4_2.jaxws.ISharedFolder> retVal = port.iMachineGetSharedFolders(obj);
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
	 * Synchronization mode between the host OS clipboard and the guest OS
	 * clipboard.
	 * 
	 * @return org.virtualbox_4_2.ClipboardMode
	 * 
	 */
	public org.virtualbox_4_2.ClipboardMode getClipboardMode() {
		try {
			org.virtualbox_4_2.jaxws.ClipboardMode retVal = port.iMachineGetClipboardMode(obj);
			return org.virtualbox_4_2.ClipboardMode.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Synchronization mode between the host OS clipboard and the guest OS
	 * clipboard.
	 * 
	 * @param value org.virtualbox_4_2.ClipboardMode
	 * 
	 */
	public void setClipboardMode(org.virtualbox_4_2.ClipboardMode value) {
		try {
			port.iMachineSetClipboardMode(obj, org.virtualbox_4_2.jaxws.ClipboardMode.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Which mode is allowed for drag'n'drop.
	 * 
	 * @return org.virtualbox_4_2.DragAndDropMode
	 * 
	 */
	public org.virtualbox_4_2.DragAndDropMode getDragAndDropMode() {
		try {
			org.virtualbox_4_2.jaxws.DragAndDropMode retVal = port.iMachineGetDragAndDropMode(obj);
			return org.virtualbox_4_2.DragAndDropMode.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Which mode is allowed for drag'n'drop.
	 * 
	 * @param value org.virtualbox_4_2.DragAndDropMode
	 * 
	 */
	public void setDragAndDropMode(org.virtualbox_4_2.DragAndDropMode value) {
		try {
			port.iMachineSetDragAndDropMode(obj, org.virtualbox_4_2.jaxws.DragAndDropMode.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * A comma-separated list of simple glob patterns. Changes to guest properties
	 * whose name matches one of the patterns will generate an
	 * {@link org.virtualbox_4_2.IGuestPropertyChangedEvent} signal.
	 * 
	 * @return String
	 * 
	 */
	public String getGuestPropertyNotificationPatterns() {
		try {
			String retVal = port.iMachineGetGuestPropertyNotificationPatterns(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * A comma-separated list of simple glob patterns. Changes to guest properties
	 * whose name matches one of the patterns will generate an
	 * {@link org.virtualbox_4_2.IGuestPropertyChangedEvent} signal.
	 * 
	 * @param value String
	 * 
	 */
	public void setGuestPropertyNotificationPatterns(String value) {
		try {
			port.iMachineSetGuestPropertyNotificationPatterns(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * When set to true, the virtual machine becomes a target teleporter the next
	 * time it is powered on. This can only set to true when the VM is in the
	 * PoweredOff or Aborted state.
	 * 
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getTeleporterEnabled() {
		try {
			Boolean retVal = port.iMachineGetTeleporterEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * When set to true, the virtual machine becomes a target teleporter the next
	 * time it is powered on. This can only set to true when the VM is in the
	 * PoweredOff or Aborted state.
	 * 
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setTeleporterEnabled(Boolean value) {
		try {
			port.iMachineSetTeleporterEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The TCP port the target teleporter will listen for incoming teleportations
	 * on.
	 * 
	 * 0 means the port is automatically selected upon power on. The actual value
	 * can be read from this property while the machine is waiting for incoming
	 * teleportations.
	 * 
	 * @return Long
	 * 
	 */
	public Long getTeleporterPort() {
		try {
			Long retVal = port.iMachineGetTeleporterPort(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The TCP port the target teleporter will listen for incoming teleportations
	 * on.
	 * 
	 * 0 means the port is automatically selected upon power on. The actual value
	 * can be read from this property while the machine is waiting for incoming
	 * teleportations.
	 * 
	 * @param value Long
	 * 
	 */
	public void setTeleporterPort(Long value) {
		try {
			port.iMachineSetTeleporterPort(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The address the target teleporter will listen on. If set to an empty string,
	 * it will listen on all addresses.
	 * 
	 * @return String
	 * 
	 */
	public String getTeleporterAddress() {
		try {
			String retVal = port.iMachineGetTeleporterAddress(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The address the target teleporter will listen on. If set to an empty string,
	 * it will listen on all addresses.
	 * 
	 * @param value String
	 * 
	 */
	public void setTeleporterAddress(String value) {
		try {
			port.iMachineSetTeleporterAddress(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The password to check for on the target teleporter. This is just a very basic
	 * measure to prevent simple hacks and operators accidentally beaming a virtual
	 * machine to the wrong place.
	 * 
	 * Note that you SET a plain text password while reading back a HASHED password.
	 * Setting a hashed password is currently not supported.
	 * 
	 * @return String
	 * 
	 */
	public String getTeleporterPassword() {
		try {
			String retVal = port.iMachineGetTeleporterPassword(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The password to check for on the target teleporter. This is just a very basic
	 * measure to prevent simple hacks and operators accidentally beaming a virtual
	 * machine to the wrong place.
	 * 
	 * Note that you SET a plain text password while reading back a HASHED password.
	 * Setting a hashed password is currently not supported.
	 * 
	 * @param value String
	 * 
	 */
	public void setTeleporterPassword(String value) {
		try {
			port.iMachineSetTeleporterPassword(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Fault tolerance state; disabled, source or target. This property can be
	 * changed at any time. If you change it for a running VM, then the fault
	 * tolerance address and port must be set beforehand.
	 * 
	 * @return org.virtualbox_4_2.FaultToleranceState
	 * 
	 */
	public org.virtualbox_4_2.FaultToleranceState getFaultToleranceState() {
		try {
			org.virtualbox_4_2.jaxws.FaultToleranceState retVal = port.iMachineGetFaultToleranceState(obj);
			return org.virtualbox_4_2.FaultToleranceState.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Fault tolerance state; disabled, source or target. This property can be
	 * changed at any time. If you change it for a running VM, then the fault
	 * tolerance address and port must be set beforehand.
	 * 
	 * @param value org.virtualbox_4_2.FaultToleranceState
	 * 
	 */
	public void setFaultToleranceState(org.virtualbox_4_2.FaultToleranceState value) {
		try {
			port.iMachineSetFaultToleranceState(obj,
					org.virtualbox_4_2.jaxws.FaultToleranceState.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The TCP port the fault tolerance source or target will use for communication.
	 * 
	 * @return Long
	 * 
	 */
	public Long getFaultTolerancePort() {
		try {
			Long retVal = port.iMachineGetFaultTolerancePort(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The TCP port the fault tolerance source or target will use for communication.
	 * 
	 * @param value Long
	 * 
	 */
	public void setFaultTolerancePort(Long value) {
		try {
			port.iMachineSetFaultTolerancePort(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The address the fault tolerance source or target.
	 * 
	 * @return String
	 * 
	 */
	public String getFaultToleranceAddress() {
		try {
			String retVal = port.iMachineGetFaultToleranceAddress(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The address the fault tolerance source or target.
	 * 
	 * @param value String
	 * 
	 */
	public void setFaultToleranceAddress(String value) {
		try {
			port.iMachineSetFaultToleranceAddress(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The password to check for on the standby VM. This is just a very basic
	 * measure to prevent simple hacks and operators accidentally choosing the wrong
	 * standby VM.
	 * 
	 * @return String
	 * 
	 */
	public String getFaultTolerancePassword() {
		try {
			String retVal = port.iMachineGetFaultTolerancePassword(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The password to check for on the standby VM. This is just a very basic
	 * measure to prevent simple hacks and operators accidentally choosing the wrong
	 * standby VM.
	 * 
	 * @param value String
	 * 
	 */
	public void setFaultTolerancePassword(String value) {
		try {
			port.iMachineSetFaultTolerancePassword(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The interval in ms used for syncing the state between source and target.
	 * 
	 * @return Long
	 * 
	 */
	public Long getFaultToleranceSyncInterval() {
		try {
			Long retVal = port.iMachineGetFaultToleranceSyncInterval(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The interval in ms used for syncing the state between source and target.
	 * 
	 * @param value Long
	 * 
	 */
	public void setFaultToleranceSyncInterval(Long value) {
		try {
			port.iMachineSetFaultToleranceSyncInterval(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * When set to true, the RTC device of the virtual machine will run in UTC time,
	 * otherwise in local time. Especially Unix guests prefer the time in UTC.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getRTCUseUTC() {
		try {
			Boolean retVal = port.iMachineGetRTCUseUTC(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * When set to true, the RTC device of the virtual machine will run in UTC time,
	 * otherwise in local time. Especially Unix guests prefer the time in UTC.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setRTCUseUTC(Boolean value) {
		try {
			port.iMachineSetRTCUseUTC(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * When set to true, the builtin I/O cache of the virtual machine will be
	 * enabled.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getIOCacheEnabled() {
		try {
			Boolean retVal = port.iMachineGetIOCacheEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * When set to true, the builtin I/O cache of the virtual machine will be
	 * enabled.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setIOCacheEnabled(Boolean value) {
		try {
			port.iMachineSetIOCacheEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Maximum size of the I/O cache in MB.
	 * 
	 * @return Long
	 * 
	 */
	public Long getIOCacheSize() {
		try {
			Long retVal = port.iMachineGetIOCacheSize(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Maximum size of the I/O cache in MB.
	 * 
	 * @param value Long
	 * 
	 */
	public void setIOCacheSize(Long value) {
		try {
			port.iMachineSetIOCacheSize(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Array of PCI devices assigned to this machine, to get list of all PCI devices
	 * attached to the machine use
	 * {@link org.virtualbox_4_2.IConsole#getAttachedPCIDevices()} attribute, as
	 * this attribute is intended to list only devices additional to what described
	 * in virtual hardware config. Usually, this list keeps host's physical devices
	 * assigned to the particular machine.
	 * 
	 * @return List<org.virtualbox_4_2.IPCIDeviceAttachment>
	 * 
	 */
	public List<org.virtualbox_4_2.IPCIDeviceAttachment> getPCIDeviceAssignments() {
		try {
			List<org.virtualbox_4_2.jaxws.IPCIDeviceAttachment> retVal = port.iMachineGetPCIDeviceAssignments(obj);
			return Helper.wrap2(org.virtualbox_4_2.IPCIDeviceAttachment.class,
					org.virtualbox_4_2.jaxws.IPCIDeviceAttachment.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Bandwidth control manager.
	 * 
	 * @return org.virtualbox_4_2.IBandwidthControl
	 * 
	 */
	public org.virtualbox_4_2.IBandwidthControl getBandwidthControl() {
		try {
			String retVal = port.iMachineGetBandwidthControl(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IBandwidthControl(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Enables the tracing facility in the VMM (including PDM devices + drivers).
	 * The VMM will consume about 0.5MB of more memory when enabled and there may be
	 * some extra overhead from tracepoints that are always enabled.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getTracingEnabled() {
		try {
			Boolean retVal = port.iMachineGetTracingEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Enables the tracing facility in the VMM (including PDM devices + drivers).
	 * The VMM will consume about 0.5MB of more memory when enabled and there may be
	 * some extra overhead from tracepoints that are always enabled.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setTracingEnabled(Boolean value) {
		try {
			port.iMachineSetTracingEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Tracepoint configuration to apply at startup when
	 * {@link org.virtualbox_4_2.IMachine#getTracingEnabled()} is true. The string
	 * specifies a space separated of tracepoint group names to enable. The special
	 * group 'all' enables all tracepoints. Check DBGFR3TracingConfig for more
	 * details on available tracepoint groups and such.
	 * 
	 * Note that on hosts supporting DTrace (or similar), a lot of the tracepoints
	 * may be implemented exclusivly as DTrace probes. So, the effect of the same
	 * config may differ between Solaris and Windows for example.
	 * 
	 * @return String
	 * 
	 */
	public String getTracingConfig() {
		try {
			String retVal = port.iMachineGetTracingConfig(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Tracepoint configuration to apply at startup when
	 * {@link org.virtualbox_4_2.IMachine#getTracingEnabled()} is true. The string
	 * specifies a space separated of tracepoint group names to enable. The special
	 * group 'all' enables all tracepoints. Check DBGFR3TracingConfig for more
	 * details on available tracepoint groups and such.
	 * 
	 * Note that on hosts supporting DTrace (or similar), a lot of the tracepoints
	 * may be implemented exclusivly as DTrace probes. So, the effect of the same
	 * config may differ between Solaris and Windows for example.
	 * 
	 * @param value String
	 * 
	 */
	public void setTracingConfig(String value) {
		try {
			port.iMachineSetTracingConfig(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Enables tracepoints in PDM devices and drivers to use the VMCPU or VM
	 * structures when firing off trace points. This is especially useful with
	 * DTrace tracepoints, as it allows you to use the VMCPU or VM pointer to obtain
	 * useful information such as guest register state.
	 * 
	 * This is disabled by default because devices and drivers normally has no
	 * business accessing the VMCPU or VM structures, and are therefore unable to
	 * get any pointers to these.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getAllowTracingToAccessVM() {
		try {
			Boolean retVal = port.iMachineGetAllowTracingToAccessVM(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Enables tracepoints in PDM devices and drivers to use the VMCPU or VM
	 * structures when firing off trace points. This is especially useful with
	 * DTrace tracepoints, as it allows you to use the VMCPU or VM pointer to obtain
	 * useful information such as guest register state.
	 * 
	 * This is disabled by default because devices and drivers normally has no
	 * business accessing the VMCPU or VM structures, and are therefore unable to
	 * get any pointers to these.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setAllowTracingToAccessVM(Boolean value) {
		try {
			port.iMachineSetAllowTracingToAccessVM(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Enables autostart of the VM during system boot.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getAutostartEnabled() {
		try {
			Boolean retVal = port.iMachineGetAutostartEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Enables autostart of the VM during system boot.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setAutostartEnabled(Boolean value) {
		try {
			port.iMachineSetAutostartEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Number of seconds to wait until the VM should be started during system boot.
	 * 
	 * @return Long
	 * 
	 */
	public Long getAutostartDelay() {
		try {
			Long retVal = port.iMachineGetAutostartDelay(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Number of seconds to wait until the VM should be started during system boot.
	 * 
	 * @param value Long
	 * 
	 */
	public void setAutostartDelay(Long value) {
		try {
			port.iMachineSetAutostartDelay(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Action type to do when the system is shutting down.
	 * 
	 * @return org.virtualbox_4_2.AutostopType
	 * 
	 */
	public org.virtualbox_4_2.AutostopType getAutostopType() {
		try {
			org.virtualbox_4_2.jaxws.AutostopType retVal = port.iMachineGetAutostopType(obj);
			return org.virtualbox_4_2.AutostopType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Action type to do when the system is shutting down.
	 * 
	 * @param value org.virtualbox_4_2.AutostopType
	 * 
	 */
	public void setAutostopType(org.virtualbox_4_2.AutostopType value) {
		try {
			port.iMachineSetAutostopType(obj, org.virtualbox_4_2.jaxws.AutostopType.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IMachine queryInterface(IUnknown obj) {
		return obj == null ? null : new IMachine(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Locks the machine for the given session to enable the caller to make changes
	 * to the machine or start the VM or control VM execution.
	 * 
	 * There are two ways to lock a machine for such uses:
	 * 
	 * <ul>
	 * <li>If you want to make changes to the machine settings, you must obtain an
	 * exclusive write lock on the machine by setting lockType to Write.
	 * 
	 * This will only succeed if no other process has locked the machine to prevent
	 * conflicting changes. Only after an exclusive write lock has been obtained
	 * using this method, one can change all VM settings or execute the VM in the
	 * process space of the session object. (Note that the latter is only of
	 * interest if you actually want to write a new front-end for virtual machines;
	 * but this API gets called internally by the existing front-ends such as
	 * VBoxHeadless and the VirtualBox GUI to acquire a write lock on the machine
	 * that they are running.)
	 * 
	 * On success, write-locking the machine for a session creates a second copy of
	 * the IMachine object. It is this second object upon which changes can be made;
	 * in VirtualBox terminology, the second copy is "mutable". It is only this
	 * second, mutable machine object upon which you can call methods that change
	 * the machine state. After having called this method, you can obtain this
	 * second, mutable machine object using the
	 * {@link org.virtualbox_4_2.ISession#getMachine()} attribute.</li>
	 * <li>If you only want to check the machine state or control machine execution
	 * without actually changing machine settings (e.g. to get access to VM
	 * statistics or take a snapshot or save the machine state), then set the
	 * lockType argument to Shared.
	 * 
	 * If no other session has obtained a lock, you will obtain an exclusive write
	 * lock as described above. However, if another session has already obtained
	 * such a lock, then a link to that existing session will be established which
	 * allows you to control that existing session.
	 * 
	 * To find out which type of lock was obtained, you can inspect
	 * {@link org.virtualbox_4_2.ISession#getType()}, which will have been set to
	 * either WriteLock or Shared.</li>
	 * </ul>
	 * 
	 * In either case, you can get access to the {@link org.virtualbox_4_2.IConsole}
	 * object which controls VM execution.
	 * 
	 * Also in all of the above cases, one must always call
	 * {@link org.virtualbox_4_2.ISession#unlockMachine()} to release the lock on
	 * the machine, or the machine's state will eventually be set to "Aborted".
	 * 
	 * To change settings on a machine, the following sequence is typically
	 * performed:
	 * 
	 * <ol>
	 * <li>Call this method to obtain an exclusive write lock for the current
	 * session.</li>
	 * <li>Obtain a mutable IMachine object from
	 * {@link org.virtualbox_4_2.ISession#getMachine()}.</li>
	 * <li>Change the settings of the machine by invoking IMachine methods.</li>
	 * <li>Call {@link org.virtualbox_4_2.IMachine#saveSettings()}.</li>
	 * <li>Release the write lock by calling
	 * {@link org.virtualbox_4_2.ISession#unlockMachine()}.</li>
	 * </ol>
	 * 
	 * @param session  Session object for which the machine will be locked.
	 * 
	 * 
	 * @param lockType If set to Write, then attempt to acquire an exclusive write
	 *                 lock or fail. If set to Shared, then either acquire an
	 *                 exclusive write lock or establish a link to an existing
	 *                 session.
	 * 
	 * 
	 *                 Expected result codes:
	 *                 <table>
	 *                 <tr>
	 *                 <td>E_UNEXPECTED</td>
	 *                 <td>Virtual machine not registered.</td>
	 *                 <tr>
	 *                 <tr>
	 *                 <td>E_ACCESSDENIED</td>
	 *                 <td>Process not started by OpenRemoteSession.</td>
	 *                 <tr>
	 *                 <tr>
	 *                 <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                 VBOX_E_INVALID_OBJECT_STATE</td>
	 *                 <td>Session already open or being opened.</td>
	 *                 <tr>
	 *                 <tr>
	 *                 <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 *                 <td>Failed to assign machine to session.</td>
	 *                 <tr>
	 *                 </table>
	 * 
	 */
	public void lockMachine(org.virtualbox_4_2.ISession session, org.virtualbox_4_2.LockType lockType) {
		try {
			port.iMachineLockMachine(obj, ((session == null) ? null : session.getWrapped()),
					org.virtualbox_4_2.jaxws.LockType.fromValue(lockType.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Spawns a new process that will execute the virtual machine and obtains a
	 * shared lock on the machine for the calling session.
	 * 
	 * If launching the VM succeeds, the new VM process will create its own session
	 * and write-lock the machine for it, preventing conflicting changes from other
	 * processes. If the machine is already locked (because it is already running or
	 * because another session has a write lock), launching the VM process will
	 * therefore fail. Reversely, future attempts to obtain a write lock will also
	 * fail while the machine is running.
	 * 
	 * The caller's session object remains separate from the session opened by the
	 * new VM process. It receives its own {@link org.virtualbox_4_2.IConsole}
	 * object which can be used to control machine execution, but it cannot be used
	 * to change all VM settings which would be available after a
	 * {@link #lockMachine(org.virtualbox_4_2.ISession,org.virtualbox_4_2.LockType)}
	 * call.
	 * 
	 * The caller must eventually release the session's shared lock by calling
	 * {@link org.virtualbox_4_2.ISession#unlockMachine()} on the local session
	 * object once this call has returned. However, the session's state (see
	 * {@link org.virtualbox_4_2.ISession#getState()}) will not return to "Unlocked"
	 * until the remote session has also unlocked the machine (i.e. the machine has
	 * stopped running).
	 * 
	 * Launching a VM process can take some time (a new VM is started in a new
	 * process, for which memory and other resources need to be set up). Because of
	 * this, an {@link org.virtualbox_4_2.IProgress} object is returned to allow the
	 * caller to wait for this asynchronous operation to be completed. Until then,
	 * the caller's session object remains in the "Unlocked" state, and its
	 * {@link org.virtualbox_4_2.ISession#getMachine()} and
	 * {@link org.virtualbox_4_2.ISession#getConsole()} attributes cannot be
	 * accessed. It is recommended to use
	 * {@link org.virtualbox_4_2.IProgress#waitForCompletion(Integer)} or similar
	 * calls to wait for completion. Completion is signalled when the VM is powered
	 * on. If launching the VM fails, error messages can be queried via the progress
	 * object, if available.
	 * 
	 * The progress object will have at least 2 sub-operations. The first operation
	 * covers the period up to the new VM process calls powerUp. The subsequent
	 * operations mirror the {@link org.virtualbox_4_2.IConsole#powerUp()} progress
	 * object. Because {@link org.virtualbox_4_2.IConsole#powerUp()} may require
	 * some extra sub-operations, the
	 * {@link org.virtualbox_4_2.IProgress#getOperationCount()} may change at the
	 * completion of operation.
	 * 
	 * For details on the teleportation progress operation, see
	 * {@link org.virtualbox_4_2.IConsole#powerUp()}.
	 * 
	 * The environment argument is a string containing definitions of environment
	 * variables in the following format:
	 * 
	 * <pre>
	 NAME[=VALUE]\n
	 NAME[=VALUE]\n
	 ...
	 * </pre>
	 * 
	 * where <tt>\\n</tt> is the new line character. These environment variables
	 * will be appended to the environment of the VirtualBox server process. If an
	 * environment variable exists both in the server process and in this list, the
	 * value from this list takes precedence over the server's variable. If the
	 * value of the environment variable is omitted, this variable will be removed
	 * from the resulting environment. If the environment string is null or empty,
	 * the server environment is inherited by the started process as is.
	 * 
	 * 
	 * @param session     Client session object to which the VM process will be
	 *                    connected (this must be in "Unlocked" state).
	 * 
	 * 
	 * @param type        Front-end to use for the new VM process. The following are
	 *                    currently supported:
	 *                    <ul>
	 *                    <li><tt>"gui"</tt>: VirtualBox Qt GUI front-end</li>
	 *                    <li><tt>"headless"</tt>: VBoxHeadless (VRDE Server)
	 *                    front-end</li>
	 *                    <li><tt>"sdl"</tt>: VirtualBox SDL front-end</li>
	 *                    <li><tt>"emergencystop"</tt>: reserved value, used for
	 *                    aborting the currently running VM or session owner. In
	 *                    this case the session parameter may be null (if it is
	 *                    non-null it isn't used in any way), and the progress
	 *                    return value will be always null. The operation completes
	 *                    immediately.</li>
	 *                    </ul>
	 * 
	 * @param environment Environment to pass to the VM process.
	 * 
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_UNEXPECTED</td>
	 *         <td>Virtual machine not registered.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>Invalid session type type.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>No machine matching machineId found.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *         VBOX_E_INVALID_OBJECT_STATE</td>
	 *         <td>Session already open or being opened.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Launching process for machine failed.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 *         <td>Failed to assign machine to session.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IProgress launchVMProcess(org.virtualbox_4_2.ISession session, String type,
			String environment) {
		try {
			String retVal;
			retVal = port.iMachineLaunchVMProcess(obj, ((session == null) ? null : session.getWrapped()), type,
					environment);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Puts the given device to the specified position in the boot order.
	 * 
	 * To indicate that no device is associated with the given position,
	 * {@link org.virtualbox_4_2.DeviceType#Null} should be used.
	 * 
	 * TODO setHardDiskBootOrder(), setNetworkBootOrder()
	 * 
	 * 
	 * @param position Position in the boot order ( 1 to the total number of devices
	 *                 the machine can boot from, as returned by
	 *                 {@link org.virtualbox_4_2.ISystemProperties#getMaxBootPosition()}).
	 * 
	 * 
	 * @param device   The type of the device used to boot at the given position.
	 * 
	 * 
	 *                 Expected result codes:
	 *                 <table>
	 *                 <tr>
	 *                 <td>E_INVALIDARG</td>
	 *                 <td>Boot position out of range.</td>
	 *                 <tr>
	 *                 <tr>
	 *                 <td>E_NOTIMPL</td>
	 *                 <td>Booting from USB device currently not supported.</td>
	 *                 <tr>
	 *                 </table>
	 * 
	 */
	public void setBootOrder(Long position, org.virtualbox_4_2.DeviceType device) {
		try {
			port.iMachineSetBootOrder(obj, position, org.virtualbox_4_2.jaxws.DeviceType.fromValue(device.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the device type that occupies the specified position in the boot
	 * order.
	 * 
	 * TODO [remove?] If the machine can have more than one device of the returned
	 * type (such as hard disks), then a separate method should be used to retrieve
	 * the individual device that occupies the given position.
	 * 
	 * If here are no devices at the given position, then
	 * {@link org.virtualbox_4_2.DeviceType#Null} is returned.
	 * 
	 * TODO getHardDiskBootOrder(), getNetworkBootOrder()
	 * 
	 * 
	 * @param position Position in the boot order ( 1 to the total number of devices
	 *                 the machine can boot from, as returned by
	 *                 {@link org.virtualbox_4_2.ISystemProperties#getMaxBootPosition()}).
	 * 
	 * 
	 * @return Device at the given position.
	 * 
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>Boot position out of range.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.DeviceType getBootOrder(Long position) {
		try {
			org.virtualbox_4_2.jaxws.DeviceType retVal;
			retVal = port.iMachineGetBootOrder(obj, position);
			return org.virtualbox_4_2.DeviceType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Attaches a device and optionally mounts a medium to the given storage
	 * controller ({@link org.virtualbox_4_2.IStorageController}, identified by
	 * name), at the indicated port and device.
	 * 
	 * This method is intended for managing storage devices in general while a
	 * machine is powered off. It can be used to attach and detach fixed and
	 * removable media. The following kind of media can be attached to a machine:
	 * 
	 * <ul>
	 * <li>For fixed and removable media, you can pass in a medium that was
	 * previously opened using
	 * {@link org.virtualbox_4_2.IVirtualBox#openMedium(String,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.AccessMode,Boolean)}.
	 * </li>
	 * <li>Only for storage devices supporting removable media (such as DVDs and
	 * floppies), you can also specify a null pointer to indicate an empty drive or
	 * one of the medium objects listed in the
	 * {@link org.virtualbox_4_2.IHost#getDVDDrives()} and
	 * {@link org.virtualbox_4_2.IHost#getFloppyDrives()} arrays to indicate a host
	 * drive. For removable devices, you can also use
	 * {@link org.virtualbox_4_2.IMachine#mountMedium(String,Integer,Integer,org.virtualbox_4_2.IMedium,Boolean)}
	 * to change the media while the machine is running.</li>
	 * </ul>
	 * 
	 * In a VM's default configuration of virtual machines, the secondary master of
	 * the IDE controller is used for a CD/DVD drive.
	 * 
	 * After calling this returns successfully, a new instance of
	 * {@link org.virtualbox_4_2.IMediumAttachment} will appear in the machine's
	 * list of medium attachments (see
	 * {@link org.virtualbox_4_2.IMachine#getMediumAttachments()}).
	 * 
	 * See {@link org.virtualbox_4_2.IMedium} and
	 * {@link org.virtualbox_4_2.IMediumAttachment} for more information about
	 * attaching media.
	 * 
	 * The specified device slot must not have a device attached to it, or this
	 * method will fail.
	 * 
	 * 
	 * @param name           Name of the storage controller to attach the device to.
	 * 
	 * @param controllerPort Port to attach the device to. For an IDE controller, 0
	 *                       specifies the primary controller and 1 specifies the
	 *                       secondary controller. For a SCSI controller, this must
	 *                       range from 0 to 15; for a SATA controller, from 0 to
	 *                       29; for an SAS controller, from 0 to 7.
	 * 
	 * @param device         Device slot in the given port to attach the device to.
	 *                       This is only relevant for IDE controllers, for which 0
	 *                       specifies the master device and 1 specifies the slave
	 *                       device. For all other controller types, this must be 0.
	 * 
	 * @param type           Device type of the attached device. For media opened by
	 *                       {@link org.virtualbox_4_2.IVirtualBox#openMedium(String,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.AccessMode,Boolean)},
	 *                       this must match the device type specified there.
	 * 
	 * @param medium         Medium to mount or null for an empty drive.
	 * 
	 *                       Expected result codes:
	 *                       <table>
	 *                       <tr>
	 *                       <td>E_INVALIDARG</td>
	 *                       <td>SATA device, SATA port, IDE port or IDE slot out of
	 *                       range, or file or UUID not found.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                       VBOX_E_INVALID_OBJECT_STATE</td>
	 *                       <td>Machine must be registered before media can be
	 *                       attached.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                       VBOX_E_INVALID_VM_STATE</td>
	 *                       <td>Invalid machine state.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_OBJECT_IN_USE
	 *                       VBOX_E_OBJECT_IN_USE</td>
	 *                       <td>A medium is already attached to this or another
	 *                       virtual machine.</td>
	 *                       <tr>
	 *                       </table>
	 * 
	 *                       NOTE: You cannot attach a device to a newly created
	 *                       machine until this machine's settings are saved to disk
	 *                       using {@link #saveSettings()}.
	 * 
	 * 
	 *                       NOTE: If the medium is being attached indirectly, a new
	 *                       differencing medium will implicitly be created for it
	 *                       and attached instead. If the changes made to the
	 *                       machine settings (including this indirect attachment)
	 *                       are later cancelled using {@link #discardSettings()},
	 *                       this implicitly created differencing medium will
	 *                       implicitly be deleted.
	 * 
	 * 
	 */
	public void attachDevice(String name, Integer controllerPort, Integer device, org.virtualbox_4_2.DeviceType type,
			org.virtualbox_4_2.IMedium medium) {
		try {
			port.iMachineAttachDevice(obj, name, controllerPort, device,
					org.virtualbox_4_2.jaxws.DeviceType.fromValue(type.name()),
					((medium == null) ? null : medium.getWrapped()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Attaches a device and optionally mounts a medium to the given storage
	 * controller ({@link org.virtualbox_4_2.IStorageController}, identified by
	 * name), at the indicated port and device.
	 * 
	 * This method is intended for managing storage devices in general while a
	 * machine is powered off. It can be used to attach and detach fixed and
	 * removable media. The following kind of media can be attached to a machine:
	 * <ul>
	 * <li>For fixed and removable media, you can pass in a medium that was
	 * previously opened using
	 * {@link org.virtualbox_4_2.IVirtualBox#openMedium(String,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.AccessMode,Boolean)}.
	 * </li>
	 * <li>Only for storage devices supporting removable media (such as DVDs and
	 * floppies) with an empty drive or one of the medium objects listed in the
	 * {@link org.virtualbox_4_2.IHost#getDVDDrives()} and
	 * {@link org.virtualbox_4_2.IHost#getFloppyDrives()} arrays to indicate a host
	 * drive. For removable devices, you can also use
	 * {@link org.virtualbox_4_2.IMachine#mountMedium(String,Integer,Integer,org.virtualbox_4_2.IMedium,Boolean)}
	 * to change the media while the machine is running.</li>
	 * </ul>
	 * 
	 * In a VM's default configuration of virtual machines, the secondary master of
	 * the IDE controller is used for a CD/DVD drive.
	 * {@link org.virtualbox_4_2.IMediumAttachment} will appear in the machine's
	 * list of medium attachments (see
	 * {@link org.virtualbox_4_2.IMachine#getMediumAttachments()}).
	 * 
	 * See {@link org.virtualbox_4_2.IMedium} and
	 * {@link org.virtualbox_4_2.IMediumAttachment} for more information about
	 * attaching media.
	 * 
	 * The specified device slot must not have a device attached to it, or this
	 * method will fail.
	 * 
	 * @param name           Name of the storage controller to attach the device to.
	 * 
	 * @param controllerPort Port to attach the device to. For an IDE controller, 0
	 *                       specifies the primary controller and 1 specifies the
	 *                       secondary controller. For a SCSI controller, this must
	 *                       range from 0 to 15; for a SATA controller, from 0 to
	 *                       29; for an SAS controller, from 0 to 7.
	 * 
	 * @param device         Device slot in the given port to attach the device to.
	 *                       This is only relevant for IDE controllers, for which 0
	 *                       specifies the master device and 1 specifies the slave
	 *                       device. For all other controller types, this must be 0.
	 * 
	 * @param type           Device type of the attached device. For media opened by
	 *                       {@link org.virtualbox_4_2.IVirtualBox#openMedium(String,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.AccessMode,Boolean)},
	 *                       this must match the device type specified there.
	 * 
	 *                       Expected result codes:
	 *                       <table>
	 *                       <tr>
	 *                       <td>E_INVALIDARG</td>
	 *                       <td>SATA device, SATA port, IDE port or IDE slot out of
	 *                       range, or file or UUID not found.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                       VBOX_E_INVALID_OBJECT_STATE</td>
	 *                       <td>Machine must be registered before media can be
	 *                       attached.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                       VBOX_E_INVALID_VM_STATE</td>
	 *                       <td>Invalid machine state.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_OBJECT_IN_USE
	 *                       VBOX_E_OBJECT_IN_USE</td>
	 *                       <td>A medium is already attached to this or another
	 *                       virtual machine.</td>
	 *                       <tr>
	 *                       </table>
	 * 
	 *                       NOTE: You cannot attach a device to a newly created
	 *                       machine until this machine's settings are saved to disk
	 *                       using {@link #saveSettings()}.
	 * 
	 * 
	 *                       NOTE: If the medium is being attached indirectly, a new
	 *                       differencing medium will implicitly be created for it
	 *                       and attached instead. If the changes made to the
	 *                       machine settings (including this indirect attachment)
	 *                       are later cancelled using {@link #discardSettings()},
	 *                       this implicitly created differencing medium will
	 *                       implicitly be deleted.
	 * 
	 * 
	 */
	public void attachDeviceWithoutMedium(String name, Integer controllerPort, Integer device,
			org.virtualbox_4_2.DeviceType type) {
		try {
			port.iMachineAttachDeviceWithoutMedium(obj, name, controllerPort, device,
					org.virtualbox_4_2.jaxws.DeviceType.fromValue(type.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Detaches the device attached to a device slot of the specified bus.
	 * 
	 * Detaching the device from the virtual machine is deferred. This means that
	 * the medium remains associated with the machine when this method returns and
	 * gets actually de-associated only after a successful {@link #saveSettings()}
	 * call. See {@link org.virtualbox_4_2.IMedium} for more detailed information
	 * about attaching media.
	 * 
	 * 
	 * @param name           Name of the storage controller to detach the medium
	 *                       from.
	 * 
	 * @param controllerPort Port number to detach the medium from.
	 * 
	 * @param device         Device slot number to detach the medium from.
	 * 
	 *                       Expected result codes:
	 *                       <table>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                       VBOX_E_INVALID_VM_STATE</td>
	 *                       <td>Attempt to detach medium from a running virtual
	 *                       machine.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_OBJECT_NOT_FOUND
	 *                       VBOX_E_OBJECT_NOT_FOUND</td>
	 *                       <td>No medium attached to given slot/bus.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_NOT_SUPPORTED
	 *                       VBOX_E_NOT_SUPPORTED</td>
	 *                       <td>Medium format does not support storage deletion
	 *                       (only for implicitly created differencing media, should
	 *                       not happen).</td>
	 *                       <tr>
	 *                       </table>
	 * 
	 *                       NOTE: You cannot detach a device from a running
	 *                       machine.
	 * 
	 * 
	 *                       NOTE: Detaching differencing media implicitly created
	 *                       by
	 *                       {@link #attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
	 *                       for the indirect attachment using this method will
	 *                       <b>not</b> implicitly delete them. The
	 *                       {@link org.virtualbox_4_2.IMedium#deleteStorage()}
	 *                       operation should be explicitly performed by the caller
	 *                       after the medium is successfully detached and the
	 *                       settings are saved with {@link #saveSettings()}, if it
	 *                       is the desired action.
	 * 
	 * 
	 */
	public void detachDevice(String name, Integer controllerPort, Integer device) {
		try {
			port.iMachineDetachDevice(obj, name, controllerPort, device);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets the passthrough mode of an existing DVD device. Changing the setting
	 * while the VM is running is forbidden. The setting is only used if at VM start
	 * the device is configured as a host DVD drive, in all other cases it is
	 * ignored. The device must already exist; see
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
	 * for how to attach a new device.
	 * 
	 * The controllerPort and device parameters specify the device slot and have
	 * have the same meaning as with
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}.
	 * 
	 * 
	 * @param name           Name of the storage controller.
	 * 
	 * @param controllerPort Storage controller port.
	 * 
	 * @param device         Device slot in the given port.
	 * 
	 * @param passthrough    New value for the passthrough setting.
	 * 
	 *                       Expected result codes:
	 *                       <table>
	 *                       <tr>
	 *                       <td>E_INVALIDARG</td>
	 *                       <td>SATA device, SATA port, IDE port or IDE slot out of
	 *                       range.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                       VBOX_E_INVALID_OBJECT_STATE</td>
	 *                       <td>Attempt to modify an unregistered virtual machine.
	 *                       </td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                       VBOX_E_INVALID_VM_STATE</td>
	 *                       <td>Invalid machine state.</td>
	 *                       <tr>
	 *                       </table>
	 * 
	 */
	public void passthroughDevice(String name, Integer controllerPort, Integer device, Boolean passthrough) {
		try {
			port.iMachinePassthroughDevice(obj, name, controllerPort, device, passthrough);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets the behavior for guest-triggered medium eject. In some situations it is
	 * desirable that such ejects update the VM configuration, and in others the
	 * eject should keep the VM configuration. The device must already exist; see
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
	 * for how to attach a new device.
	 * 
	 * The controllerPort and device parameters specify the device slot and have
	 * have the same meaning as with
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}.
	 * 
	 * 
	 * @param name           Name of the storage controller.
	 * 
	 * @param controllerPort Storage controller port.
	 * 
	 * @param device         Device slot in the given port.
	 * 
	 * @param temporaryEject New value for the eject behavior.
	 * 
	 *                       Expected result codes:
	 *                       <table>
	 *                       <tr>
	 *                       <td>E_INVALIDARG</td>
	 *                       <td>SATA device, SATA port, IDE port or IDE slot out of
	 *                       range.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                       VBOX_E_INVALID_OBJECT_STATE</td>
	 *                       <td>Attempt to modify an unregistered virtual machine.
	 *                       </td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                       VBOX_E_INVALID_VM_STATE</td>
	 *                       <td>Invalid machine state.</td>
	 *                       <tr>
	 *                       </table>
	 * 
	 */
	public void temporaryEjectDevice(String name, Integer controllerPort, Integer device, Boolean temporaryEject) {
		try {
			port.iMachineTemporaryEjectDevice(obj, name, controllerPort, device, temporaryEject);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets a flag in the device information which indicates that the medium is not
	 * based on rotational technology, i.e. that the access times are more or less
	 * independent of the position on the medium. This may or may not be supported
	 * by a particular drive, and is silently ignored in the latter case. At the
	 * moment only hard disks (which is a misnomer in this context) accept this
	 * setting. Changing the setting while the VM is running is forbidden. The
	 * device must already exist; see
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
	 * for how to attach a new device.
	 * 
	 * The controllerPort and device parameters specify the device slot and have
	 * have the same meaning as with
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}.
	 * 
	 * 
	 * @param name           Name of the storage controller.
	 * 
	 * @param controllerPort Storage controller port.
	 * 
	 * @param device         Device slot in the given port.
	 * 
	 * @param nonRotational  New value for the non-rotational device flag.
	 * 
	 *                       Expected result codes:
	 *                       <table>
	 *                       <tr>
	 *                       <td>E_INVALIDARG</td>
	 *                       <td>SATA device, SATA port, IDE port or IDE slot out of
	 *                       range.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                       VBOX_E_INVALID_OBJECT_STATE</td>
	 *                       <td>Attempt to modify an unregistered virtual machine.
	 *                       </td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                       VBOX_E_INVALID_VM_STATE</td>
	 *                       <td>Invalid machine state.</td>
	 *                       <tr>
	 *                       </table>
	 * 
	 */
	public void nonRotationalDevice(String name, Integer controllerPort, Integer device, Boolean nonRotational) {
		try {
			port.iMachineNonRotationalDevice(obj, name, controllerPort, device, nonRotational);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets a flag in the device information which indicates that the medium
	 * supports discarding unsused blocks (called trimming for SATA or unmap for
	 * SCSI devices) .This may or may not be supported by a particular drive, and is
	 * silently ignored in the latter case. At the moment only hard disks (which is
	 * a misnomer in this context) accept this setting. Changing the setting while
	 * the VM is running is forbidden. The device must already exist; see
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
	 * for how to attach a new device.
	 * 
	 * The controllerPort and device parameters specify the device slot and have
	 * have the same meaning as with
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}.
	 * 
	 * 
	 * @param name           Name of the storage controller.
	 * 
	 * @param controllerPort Storage controller port.
	 * 
	 * @param device         Device slot in the given port.
	 * 
	 * @param discard        New value for the discard device flag.
	 * 
	 *                       Expected result codes:
	 *                       <table>
	 *                       <tr>
	 *                       <td>E_INVALIDARG</td>
	 *                       <td>SATA device, SATA port, SCSI port out of range.
	 *                       </td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                       VBOX_E_INVALID_OBJECT_STATE</td>
	 *                       <td>Attempt to modify an unregistered virtual machine.
	 *                       </td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                       VBOX_E_INVALID_VM_STATE</td>
	 *                       <td>Invalid machine state.</td>
	 *                       <tr>
	 *                       </table>
	 * 
	 */
	public void setAutoDiscardForDevice(String name, Integer controllerPort, Integer device, Boolean discard) {
		try {
			port.iMachineSetAutoDiscardForDevice(obj, name, controllerPort, device, discard);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets the bandwidth group of an existing storage device. The device must
	 * already exist; see
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
	 * for how to attach a new device.
	 * 
	 * The controllerPort and device parameters specify the device slot and have
	 * have the same meaning as with
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}.
	 * 
	 * 
	 * @param name           Name of the storage controller.
	 * 
	 * @param controllerPort Storage controller port.
	 * 
	 * @param device         Device slot in the given port.
	 * 
	 * @param bandwidthGroup New value for the bandwidth group or null for no group.
	 * 
	 *                       Expected result codes:
	 *                       <table>
	 *                       <tr>
	 *                       <td>E_INVALIDARG</td>
	 *                       <td>SATA device, SATA port, IDE port or IDE slot out of
	 *                       range.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                       VBOX_E_INVALID_OBJECT_STATE</td>
	 *                       <td>Attempt to modify an unregistered virtual machine.
	 *                       </td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                       VBOX_E_INVALID_VM_STATE</td>
	 *                       <td>Invalid machine state.</td>
	 *                       <tr>
	 *                       </table>
	 * 
	 */
	public void setBandwidthGroupForDevice(String name, Integer controllerPort, Integer device,
			org.virtualbox_4_2.IBandwidthGroup bandwidthGroup) {
		try {
			port.iMachineSetBandwidthGroupForDevice(obj, name, controllerPort, device,
					((bandwidthGroup == null) ? null : bandwidthGroup.getWrapped()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets no bandwidth group for an existing storage device. The device must
	 * already exist; see
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
	 * for how to attach a new device. The controllerPort and device parameters
	 * specify the device slot and have have the same meaning as with
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}.
	 * 
	 * @param name           Name of the storage controller.
	 * 
	 * @param controllerPort Storage controller port.
	 * 
	 * @param device         Device slot in the given port.
	 * 
	 *                       Expected result codes:
	 *                       <table>
	 *                       <tr>
	 *                       <td>E_INVALIDARG</td>
	 *                       <td>SATA device, SATA port, IDE port or IDE slot out of
	 *                       range.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                       VBOX_E_INVALID_OBJECT_STATE</td>
	 *                       <td>Attempt to modify an unregistered virtual machine.
	 *                       </td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                       VBOX_E_INVALID_VM_STATE</td>
	 *                       <td>Invalid machine state.</td>
	 *                       <tr>
	 *                       </table>
	 * 
	 */
	public void setNoBandwidthGroupForDevice(String name, Integer controllerPort, Integer device) {
		try {
			port.iMachineSetNoBandwidthGroupForDevice(obj, name, controllerPort, device);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Unmounts any currently mounted medium ({@link org.virtualbox_4_2.IMedium},
	 * identified by the given UUID id) to the given storage controller
	 * ({@link org.virtualbox_4_2.IStorageController}, identified by name), at the
	 * indicated port and device. The device must already exist;
	 * 
	 * This method is intended only for managing removable media, where the device
	 * is fixed but media is changeable at runtime (such as DVDs and floppies). It
	 * cannot be used for fixed media such as hard disks.
	 * 
	 * The controllerPort and device parameters specify the device slot and have
	 * have the same meaning as with
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}.
	 * 
	 * The specified device slot must have a medium mounted, which will be
	 * unmounted. If there is no mounted medium it will do nothing. See
	 * {@link org.virtualbox_4_2.IMedium} for more detailed information about
	 * attaching/unmounting media.
	 * 
	 * 
	 * @param name           Name of the storage controller to unmount the medium
	 *                       from.
	 * 
	 * @param controllerPort Port to unmount the medium from.
	 * 
	 * @param device         Device slot in the given port to unmount the medium
	 *                       from.
	 * 
	 * @param force          Allows to force unmount of a medium which is locked by
	 *                       the device slot in the given port medium is attached
	 *                       to.
	 * 
	 *                       Expected result codes:
	 *                       <table>
	 *                       <tr>
	 *                       <td>E_INVALIDARG</td>
	 *                       <td>SATA device, SATA port, IDE port or IDE slot out of
	 *                       range.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                       VBOX_E_INVALID_OBJECT_STATE</td>
	 *                       <td>Attempt to unmount medium that is not removeable -
	 *                       not dvd or floppy.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                       VBOX_E_INVALID_VM_STATE</td>
	 *                       <td>Invalid machine state.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_OBJECT_IN_USE
	 *                       VBOX_E_OBJECT_IN_USE</td>
	 *                       <td>Medium already attached to this or another virtual
	 *                       machine.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_OBJECT_NOT_FOUND
	 *                       VBOX_E_OBJECT_NOT_FOUND</td>
	 *                       <td>Medium not attached to specified port, device,
	 *                       controller.</td>
	 *                       <tr>
	 *                       </table>
	 * 
	 */
	public void unmountMedium(String name, Integer controllerPort, Integer device, Boolean force) {
		try {
			port.iMachineUnmountMedium(obj, name, controllerPort, device, force);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Mounts a medium ({@link org.virtualbox_4_2.IMedium}, identified by the given
	 * UUID id) to the given storage controller
	 * ({@link org.virtualbox_4_2.IStorageController}, identified by name), at the
	 * indicated port and device. The device must already exist; see
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
	 * for how to attach a new device.
	 * 
	 * This method is intended only for managing removable media, where the device
	 * is fixed but media is changeable at runtime (such as DVDs and floppies). It
	 * cannot be used for fixed media such as hard disks.
	 * 
	 * The controllerPort and device parameters specify the device slot and have
	 * have the same meaning as with
	 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}.
	 * 
	 * The specified device slot can have a medium mounted, which will be unmounted
	 * first. Specifying a zero UUID (or an empty string) for medium does just an
	 * unmount.
	 * 
	 * See {@link org.virtualbox_4_2.IMedium} for more detailed information about
	 * attaching media.
	 * 
	 * 
	 * @param name           Name of the storage controller to attach the medium to.
	 * 
	 * @param controllerPort Port to attach the medium to.
	 * 
	 * @param device         Device slot in the given port to attach the medium to.
	 * 
	 * @param medium         Medium to mount or null for an empty drive.
	 * 
	 * @param force          Allows to force unmount/mount of a medium which is
	 *                       locked by the device slot in the given port to attach
	 *                       the medium to.
	 * 
	 *                       Expected result codes:
	 *                       <table>
	 *                       <tr>
	 *                       <td>E_INVALIDARG</td>
	 *                       <td>SATA device, SATA port, IDE port or IDE slot out of
	 *                       range.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                       VBOX_E_INVALID_OBJECT_STATE</td>
	 *                       <td>Attempt to attach medium to an unregistered virtual
	 *                       machine.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                       VBOX_E_INVALID_VM_STATE</td>
	 *                       <td>Invalid machine state.</td>
	 *                       <tr>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_OBJECT_IN_USE
	 *                       VBOX_E_OBJECT_IN_USE</td>
	 *                       <td>Medium already attached to this or another virtual
	 *                       machine.</td>
	 *                       <tr>
	 *                       </table>
	 * 
	 */
	public void mountMedium(String name, Integer controllerPort, Integer device, org.virtualbox_4_2.IMedium medium,
			Boolean force) {
		try {
			port.iMachineMountMedium(obj, name, controllerPort, device, ((medium == null) ? null : medium.getWrapped()),
					force);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the virtual medium attached to a device slot of the specified bus.
	 * 
	 * Note that if the medium was indirectly attached by
	 * {@link #mountMedium(String,Integer,Integer,org.virtualbox_4_2.IMedium,Boolean)}
	 * to the given device slot then this method will return not the same object as
	 * passed to the
	 * {@link #mountMedium(String,Integer,Integer,org.virtualbox_4_2.IMedium,Boolean)}
	 * call. See {@link org.virtualbox_4_2.IMedium} for more detailed information
	 * about mounting a medium.
	 * 
	 * 
	 * @param name           Name of the storage controller the medium is attached
	 *                       to.
	 * 
	 * @param controllerPort Port to query.
	 * 
	 * @param device         Device slot in the given port to query.
	 * 
	 * @return Attached medium object.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>No medium attached to given slot/bus.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IMedium getMedium(String name, Integer controllerPort, Integer device) {
		try {
			String retVal;
			retVal = port.iMachineGetMedium(obj, name, controllerPort, device);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IMedium(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns an array of medium attachments which are attached to the the
	 * controller with the given name.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 * <td>A storage controller with given name doesn't exist.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public List<org.virtualbox_4_2.IMediumAttachment> getMediumAttachmentsOfController(String name) {
		try {
			List<org.virtualbox_4_2.jaxws.IMediumAttachment> retVal;
			retVal = port.iMachineGetMediumAttachmentsOfController(obj, name);
			return Helper.wrap2(org.virtualbox_4_2.IMediumAttachment.class,
					org.virtualbox_4_2.jaxws.IMediumAttachment.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns a medium attachment which corresponds to the controller with the
	 * given name, on the given port and device slot.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 * <td>No attachment exists for the given controller/port/device combination.
	 * </td>
	 * <tr>
	 * </table>
	 * 
	 */
	public org.virtualbox_4_2.IMediumAttachment getMediumAttachment(String name, Integer controllerPort,
			Integer device) {
		try {
			org.virtualbox_4_2.jaxws.IMediumAttachment retVal;
			retVal = port.iMachineGetMediumAttachment(obj, name, controllerPort, device);
			return (retVal != null) ? new org.virtualbox_4_2.IMediumAttachment(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Attaches host PCI device with the given (host) PCI address to the PCI bus of
	 * the virtual machine. Please note, that this operation is two phase, as real
	 * attachment will happen when VM will start, and most information will be
	 * delivered as IHostPCIDevicePlugEvent on IVirtualBox event source.
	 * 
	 * 
	 * @param hostAddress         Address of the host PCI device.
	 * 
	 * @param desiredGuestAddress Desired position of this device on guest PCI bus.
	 * 
	 * @param tryToUnbind         If VMM shall try to unbind existing drivers from
	 *                            the device before attaching it to the guest.
	 * 
	 *                            Expected result codes:
	 *                            <table>
	 *                            <tr>
	 *                            <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                            VBOX_E_INVALID_VM_STATE</td>
	 *                            <td>Virtual machine state is not stopped (PCI
	 *                            hotplug not yet implemented).</td>
	 *                            <tr>
	 *                            <tr>
	 *                            <td>@link ::VBOX_E_PDM_ERROR VBOX_E_PDM_ERROR</td>
	 *                            <td>Virtual machine does not have a PCI controller
	 *                            allowing attachment of physical devices.</td>
	 *                            <tr>
	 *                            <tr>
	 *                            <td>@link ::VBOX_E_NOT_SUPPORTED
	 *                            VBOX_E_NOT_SUPPORTED</td>
	 *                            <td>Hardware or host OS doesn't allow PCI device
	 *                            passthrought.</td>
	 *                            <tr>
	 *                            </table>
	 * 
	 * @see org.virtualbox_4_2.IHostPCIDevicePlugEvent
	 * 
	 */
	public void attachHostPCIDevice(Integer hostAddress, Integer desiredGuestAddress, Boolean tryToUnbind) {
		try {
			port.iMachineAttachHostPCIDevice(obj, hostAddress, desiredGuestAddress, tryToUnbind);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Detach host PCI device from the virtual machine. Also HostPCIDevicePlugEvent
	 * on IVirtualBox event source will be delivered. As currently we don't support
	 * hot device unplug, IHostPCIDevicePlugEvent event is delivered immediately.
	 * 
	 * 
	 * @param hostAddress Address of the host PCI device.
	 * 
	 *                    Expected result codes:
	 *                    <table>
	 *                    <tr>
	 *                    <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                    VBOX_E_INVALID_VM_STATE</td>
	 *                    <td>Virtual machine state is not stopped (PCI hotplug not
	 *                    yet implemented).</td>
	 *                    <tr>
	 *                    <tr>
	 *                    <td>@link ::VBOX_E_OBJECT_NOT_FOUND
	 *                    VBOX_E_OBJECT_NOT_FOUND</td>
	 *                    <td>This host device is not attached to this machine.</td>
	 *                    <tr>
	 *                    <tr>
	 *                    <td>@link ::VBOX_E_PDM_ERROR VBOX_E_PDM_ERROR</td>
	 *                    <td>Virtual machine does not have a PCI controller
	 *                    allowing attachment of physical devices.</td>
	 *                    <tr>
	 *                    <tr>
	 *                    <td>@link ::VBOX_E_NOT_SUPPORTED VBOX_E_NOT_SUPPORTED</td>
	 *                    <td>Hardware or host OS doesn't allow PCI device
	 *                    passthrought.</td>
	 *                    <tr>
	 *                    </table>
	 * 
	 * @see org.virtualbox_4_2.IHostPCIDevicePlugEvent
	 * 
	 */
	public void detachHostPCIDevice(Integer hostAddress) {
		try {
			port.iMachineDetachHostPCIDevice(obj, hostAddress);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the network adapter associated with the given slot. Slots are
	 * numbered sequentially, starting with zero. The total number of adapters per
	 * machine is defined by the
	 * {@link org.virtualbox_4_2.ISystemProperties#getMaxNetworkAdapters(org.virtualbox_4_2.ChipsetType)}
	 * property, so the maximum slot number is one less than that property's value.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>E_INVALIDARG</td>
	 * <td>Invalid slot number.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public org.virtualbox_4_2.INetworkAdapter getNetworkAdapter(Long slot) {
		try {
			String retVal;
			retVal = port.iMachineGetNetworkAdapter(obj, slot);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.INetworkAdapter(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Adds a new storage controller (SCSI, SAS or SATA controller) to the machine
	 * and returns it as an instance of
	 * {@link org.virtualbox_4_2.IStorageController}.
	 * 
	 * name identifies the controller for subsequent calls such as
	 * {@link #getStorageControllerByName(String)},
	 * {@link #getStorageControllerByInstance(Long)},
	 * {@link #removeStorageController(String)},
	 * {@link #attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
	 * or
	 * {@link #mountMedium(String,Integer,Integer,org.virtualbox_4_2.IMedium,Boolean)}.
	 * 
	 * After the controller has been added, you can set its exact type by setting
	 * the {@link org.virtualbox_4_2.IStorageController#getControllerType()}.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_OBJECT_IN_USE VBOX_E_OBJECT_IN_USE</td>
	 * <td>A storage controller with given name exists already.</td>
	 * <tr>
	 * <tr>
	 * <td>E_INVALIDARG</td>
	 * <td>Invalid controllerType.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public org.virtualbox_4_2.IStorageController addStorageController(String name,
			org.virtualbox_4_2.StorageBus connectionType) {
		try {
			String retVal;
			retVal = port.iMachineAddStorageController(obj, name,
					org.virtualbox_4_2.jaxws.StorageBus.fromValue(connectionType.name()));
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IStorageController(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns a storage controller with the given name.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 * <td>A storage controller with given name doesn't exist.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public org.virtualbox_4_2.IStorageController getStorageControllerByName(String name) {
		try {
			String retVal;
			retVal = port.iMachineGetStorageControllerByName(obj, name);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IStorageController(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns a storage controller with the given instance number.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 * <td>A storage controller with given instance number doesn't exist.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public org.virtualbox_4_2.IStorageController getStorageControllerByInstance(Long instance) {
		try {
			String retVal;
			retVal = port.iMachineGetStorageControllerByInstance(obj, instance);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IStorageController(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes a storage controller from the machine with all devices attached to
	 * it.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 * <td>A storage controller with given name doesn't exist.</td>
	 * <tr>
	 * <tr>
	 * <td>@link ::VBOX_E_NOT_SUPPORTED VBOX_E_NOT_SUPPORTED</td>
	 * <td>Medium format does not support storage deletion (only for implicitly
	 * created differencing media, should not happen).</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public void removeStorageController(String name) {
		try {
			port.iMachineRemoveStorageController(obj, name);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets the bootable flag of the storage controller with the given name.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 * <td>A storage controller with given name doesn't exist.</td>
	 * <tr>
	 * <tr>
	 * <td>@link ::VBOX_E_OBJECT_IN_USE VBOX_E_OBJECT_IN_USE</td>
	 * <td>Another storage controller is marked as bootable already.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public void setStorageControllerBootable(String name, Boolean bootable) {
		try {
			port.iMachineSetStorageControllerBootable(obj, name, bootable);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the serial port associated with the given slot. Slots are numbered
	 * sequentially, starting with zero. The total number of serial ports per
	 * machine is defined by the
	 * {@link org.virtualbox_4_2.ISystemProperties#getSerialPortCount()} property,
	 * so the maximum slot number is one less than that property's value.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>E_INVALIDARG</td>
	 * <td>Invalid slot number.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public org.virtualbox_4_2.ISerialPort getSerialPort(Long slot) {
		try {
			String retVal;
			retVal = port.iMachineGetSerialPort(obj, slot);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.ISerialPort(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the parallel port associated with the given slot. Slots are numbered
	 * sequentially, starting with zero. The total number of parallel ports per
	 * machine is defined by the
	 * {@link org.virtualbox_4_2.ISystemProperties#getParallelPortCount()} property,
	 * so the maximum slot number is one less than that property's value.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>E_INVALIDARG</td>
	 * <td>Invalid slot number.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public org.virtualbox_4_2.IParallelPort getParallelPort(Long slot) {
		try {
			String retVal;
			retVal = port.iMachineGetParallelPort(obj, slot);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IParallelPort(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns an array representing the machine-specific extra data keys which
	 * currently have values defined.
	 * 
	 * @return Array of extra data keys.
	 * 
	 */
	public List<String> getExtraDataKeys() {
		try {
			List<String> retVal;
			retVal = port.iMachineGetExtraDataKeys(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns associated machine-specific extra data.
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
			retVal = port.iMachineGetExtraData(obj, key);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets associated machine-specific extra data.
	 * 
	 * If you pass null or an empty string as a key value, the given key will be
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
	 *              </table>
	 * 
	 *              NOTE: Before performing the actual data change, this method will
	 *              ask all registered listeners using the
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
	 *              NOTE: This method can be called outside the machine session and
	 *              therefore it's a caller's responsibility to handle possible race
	 *              conditions when several clients change the same key at the same
	 *              time.
	 * 
	 * 
	 */
	public void setExtraData(String key, String value) {
		try {
			port.iMachineSetExtraData(obj, key, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the virtual CPU boolean value of the specified property.
	 * 
	 * 
	 * @param property Property type to query.
	 * 
	 * 
	 * @return Property value.
	 * 
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>Invalid property.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public Boolean getCPUProperty(org.virtualbox_4_2.CPUPropertyType property) {
		try {
			Boolean retVal;
			retVal = port.iMachineGetCPUProperty(obj,
					org.virtualbox_4_2.jaxws.CPUPropertyType.fromValue(property.name()));
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets the virtual CPU boolean value of the specified property.
	 * 
	 * 
	 * @param property Property type to query.
	 * 
	 * 
	 * @param value    Property value.
	 * 
	 * 
	 *                 Expected result codes:
	 *                 <table>
	 *                 <tr>
	 *                 <td>E_INVALIDARG</td>
	 *                 <td>Invalid property.</td>
	 *                 <tr>
	 *                 </table>
	 * 
	 */
	public void setCPUProperty(org.virtualbox_4_2.CPUPropertyType property, Boolean value) {
		try {
			port.iMachineSetCPUProperty(obj, org.virtualbox_4_2.jaxws.CPUPropertyType.fromValue(property.name()),
					value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the virtual CPU cpuid information for the specified leaf.
	 * 
	 * Currently supported index values for cpuid: Standard CPUID leafs: 0 - 0xA
	 * Extended CPUID leafs: 0x80000000 - 0x8000000A
	 * 
	 * See the Intel and AMD programmer's manuals for detailed information about the
	 * cpuid instruction and its leafs.
	 * 
	 * @param id     CPUID leaf index.
	 * 
	 * 
	 * @param valEax CPUID leaf value for register eax.
	 * 
	 * 
	 * @param valEbx CPUID leaf value for register ebx.
	 * 
	 * 
	 * @param valEcx CPUID leaf value for register ecx.
	 * 
	 * 
	 * @param valEdx CPUID leaf value for register edx.
	 * 
	 * 
	 *               Expected result codes:
	 *               <table>
	 *               <tr>
	 *               <td>E_INVALIDARG</td>
	 *               <td>Invalid id.</td>
	 *               <tr>
	 *               </table>
	 * 
	 */
	public void getCPUIDLeaf(Long id, Holder<Long> valEax, Holder<Long> valEbx, Holder<Long> valEcx,
			Holder<Long> valEdx) {
		try {
			javax.xml.ws.Holder<Long> tmp_valEax = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_valEbx = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_valEcx = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_valEdx = new javax.xml.ws.Holder<Long>();
			port.iMachineGetCPUIDLeaf(obj, id, tmp_valEax, tmp_valEbx, tmp_valEcx, tmp_valEdx);
			valEax.value = tmp_valEax.value;
			valEbx.value = tmp_valEbx.value;
			valEcx.value = tmp_valEcx.value;
			valEdx.value = tmp_valEdx.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets the virtual CPU cpuid information for the specified leaf. Note that
	 * these values are not passed unmodified. VirtualBox clears features that it
	 * doesn't support.
	 * 
	 * Currently supported index values for cpuid: Standard CPUID leafs: 0 - 0xA
	 * Extended CPUID leafs: 0x80000000 - 0x8000000A
	 * 
	 * See the Intel and AMD programmer's manuals for detailed information about the
	 * cpuid instruction and its leafs.
	 * 
	 * Do not use this method unless you know exactly what you're doing. Misuse can
	 * lead to random crashes inside VMs.
	 * 
	 * @param id     CPUID leaf index.
	 * 
	 * 
	 * @param valEax CPUID leaf value for register eax.
	 * 
	 * 
	 * @param valEbx CPUID leaf value for register ebx.
	 * 
	 * 
	 * @param valEcx CPUID leaf value for register ecx.
	 * 
	 * 
	 * @param valEdx CPUID leaf value for register edx.
	 * 
	 * 
	 *               Expected result codes:
	 *               <table>
	 *               <tr>
	 *               <td>E_INVALIDARG</td>
	 *               <td>Invalid id.</td>
	 *               <tr>
	 *               </table>
	 * 
	 */
	public void setCPUIDLeaf(Long id, Long valEax, Long valEbx, Long valEcx, Long valEdx) {
		try {
			port.iMachineSetCPUIDLeaf(obj, id, valEax, valEbx, valEcx, valEdx);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes the virtual CPU cpuid leaf for the specified index
	 * 
	 * 
	 * @param id CPUID leaf index.
	 * 
	 * 
	 *           Expected result codes:
	 *           <table>
	 *           <tr>
	 *           <td>E_INVALIDARG</td>
	 *           <td>Invalid id.</td>
	 *           <tr>
	 *           </table>
	 * 
	 */
	public void removeCPUIDLeaf(Long id) {
		try {
			port.iMachineRemoveCPUIDLeaf(obj, id);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes all the virtual CPU cpuid leaves
	 * 
	 */
	public void removeAllCPUIDLeaves() {
		try {
			port.iMachineRemoveAllCPUIDLeaves(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the value of the specified hardware virtualization boolean property.
	 * 
	 * 
	 * @param property Property type to query.
	 * 
	 * 
	 * @return Property value.
	 * 
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>Invalid property.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public Boolean getHWVirtExProperty(org.virtualbox_4_2.HWVirtExPropertyType property) {
		try {
			Boolean retVal;
			retVal = port.iMachineGetHWVirtExProperty(obj,
					org.virtualbox_4_2.jaxws.HWVirtExPropertyType.fromValue(property.name()));
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets a new value for the specified hardware virtualization boolean property.
	 * 
	 * 
	 * @param property Property type to set.
	 * 
	 * 
	 * @param value    New property value.
	 * 
	 * 
	 *                 Expected result codes:
	 *                 <table>
	 *                 <tr>
	 *                 <td>E_INVALIDARG</td>
	 *                 <td>Invalid property.</td>
	 *                 <tr>
	 *                 </table>
	 * 
	 */
	public void setHWVirtExProperty(org.virtualbox_4_2.HWVirtExPropertyType property, Boolean value) {
		try {
			port.iMachineSetHWVirtExProperty(obj,
					org.virtualbox_4_2.jaxws.HWVirtExPropertyType.fromValue(property.name()), value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Saves any changes to machine settings made since the session has been opened
	 * or a new machine has been created, or since the last call to
	 * {@link #saveSettings()} or {@link #discardSettings()}. For registered
	 * machines, new settings become visible to all other VirtualBox clients after
	 * successful invocation of this method.
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_FILE_ERROR VBOX_E_FILE_ERROR</td>
	 * <td>Settings file not accessible.</td>
	 * <tr>
	 * <tr>
	 * <td>@link ::VBOX_E_XML_ERROR VBOX_E_XML_ERROR</td>
	 * <td>Could not parse the settings file.</td>
	 * <tr>
	 * <tr>
	 * <td>E_ACCESSDENIED</td>
	 * <td>Modification request refused.</td>
	 * <tr>
	 * </table>
	 * 
	 * NOTE: The method sends {@link org.virtualbox_4_2.IMachineDataChangedEvent}
	 * notification event after the configuration has been successfully saved (only
	 * for registered machines).
	 * 
	 * 
	 * NOTE: Calling this method is only valid on instances returned by
	 * {@link org.virtualbox_4_2.ISession#getMachine()} and on new machines created
	 * by
	 * {@link org.virtualbox_4_2.IVirtualBox#createMachine(String,String,List,String,String)}
	 * but not yet registered, or on unregistered machines after calling
	 * {@link org.virtualbox_4_2.IMachine#unregister(org.virtualbox_4_2.CleanupMode)}.
	 * 
	 * 
	 */
	public void saveSettings() {
		try {
			port.iMachineSaveSettings(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Discards any changes to the machine settings made since the session has been
	 * opened or since the last call to {@link #saveSettings()} or
	 * {@link #discardSettings()}.
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 * <td>Virtual machine is not mutable.</td>
	 * <tr>
	 * </table>
	 * 
	 * NOTE: Calling this method is only valid on instances returned by
	 * {@link org.virtualbox_4_2.ISession#getMachine()} and on new machines created
	 * by
	 * {@link org.virtualbox_4_2.IVirtualBox#createMachine(String,String,List,String,String)}
	 * or opened by {@link org.virtualbox_4_2.IVirtualBox#openMachine(String)} but
	 * not yet registered, or on unregistered machines after calling
	 * {@link org.virtualbox_4_2.IMachine#unregister(org.virtualbox_4_2.CleanupMode)}.
	 * 
	 * 
	 */
	public void discardSettings() {
		try {
			port.iMachineDiscardSettings(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Unregisters a machine previously registered with
	 * {@link org.virtualbox_4_2.IVirtualBox#registerMachine(org.virtualbox_4_2.IMachine)}
	 * and optionally do additional cleanup before the machine is unregistered.
	 * 
	 * This method does not delete any files. It only changes the machine
	 * configuration and the list of registered machines in the VirtualBox object.
	 * To delete the files which belonged to the machine, including the XML file of
	 * the machine itself, call {@link #delete(List)}, optionally with the array of
	 * IMedium objects which was returned from this method.
	 * 
	 * How thoroughly this method cleans up the machine configuration before
	 * unregistering the machine depends on the cleanupMode argument.
	 * 
	 * <ul>
	 * <li>With "UnregisterOnly", the machine will only be unregistered, but no
	 * additional cleanup will be performed. The call will fail if the machine is in
	 * "Saved" state or has any snapshots or any media attached (see
	 * {@link org.virtualbox_4_2.IMediumAttachment}). It is the responsibility of
	 * the caller to delete all such configuration in this mode. In this mode, the
	 * API behaves like the former IVirtualBox::unregisterMachine() API which it
	 * replaces.</li>
	 * <li>With "DetachAllReturnNone", the call will succeed even if the machine is
	 * in "Saved" state or if it has snapshots or media attached. All media attached
	 * to the current machine state or in snapshots will be detached. No medium
	 * objects will be returned; all of the machine's media will remain open.</li>
	 * <li>With "DetachAllReturnHardDisksOnly", the call will behave like with
	 * "DetachAllReturnNone", except that all the hard disk medium objects which
	 * were detached from the machine will be returned as an array. This allows for
	 * quickly passing them to the {@link #delete(List)} API for closing and
	 * deletion.</li>
	 * <li>With "Full", the call will behave like with
	 * "DetachAllReturnHardDisksOnly", except that all media will be returned in the
	 * array, including removable media like DVDs and floppies. This might be useful
	 * if the user wants to inspect in detail which media were attached to the
	 * machine. Be careful when passing the media array to {@link #delete(List)} in
	 * that case because users will typically want to preserve ISO and RAW image
	 * files.</li>
	 * </ul>
	 * 
	 * A typical implementation will use "DetachAllReturnHardDisksOnly" and then
	 * pass the resulting IMedium array to {@link #delete(List)}. This way, the
	 * machine is completely deleted with all its saved states and hard disk images,
	 * but images for removable drives (such as ISO and RAW files) will remain on
	 * disk.
	 * 
	 * This API does not verify whether the media files returned in the array are
	 * still attached to other machines (i.e. shared between several machines). If
	 * such a shared image is passed to {@link #delete(List)} however, closing the
	 * image will fail there and the image will be silently skipped.
	 * 
	 * This API may, however, move media from this machine's media registry to other
	 * media registries (see {@link org.virtualbox_4_2.IMedium} for details on media
	 * registries). For machines created with VirtualBox 4.0 or later, if media from
	 * this machine's media registry are also attached to another machine (shared
	 * attachments), each such medium will be moved to another machine's registry.
	 * This is because without this machine's media registry, the other machine
	 * cannot find its media any more and would become inaccessible.
	 * 
	 * This API implicitly calls {@link #saveSettings()} to save all current machine
	 * settings before unregistering it. It may also silently call
	 * {@link #saveSettings()} on other machines if media are moved to other
	 * machines' media registries.
	 * 
	 * After successful method invocation, the
	 * {@link org.virtualbox_4_2.IMachineRegisteredEvent} event is fired.
	 * 
	 * The call will fail if the machine is currently locked (see
	 * {@link org.virtualbox_4_2.ISession}).
	 * 
	 * 
	 * @param cleanupMode How to clean up after the machine has been unregistered.
	 * 
	 * @return List of media detached from the machine, depending on the cleanupMode
	 *         parameter.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *         VBOX_E_INVALID_OBJECT_STATE</td>
	 *         <td>Machine is currently locked for a session.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: If the given machine is inaccessible (see
	 *         {@link #getAccessible()}), it will be unregistered and fully
	 *         uninitialized right afterwards. As a result, the returned machine
	 *         object will be unusable and an attempt to call <b>any</b> method will
	 *         return the "Object not ready" error.
	 * 
	 * 
	 */
	public List<org.virtualbox_4_2.IMedium> unregister(org.virtualbox_4_2.CleanupMode cleanupMode) {
		try {
			List<String> retVal;
			retVal = port.iMachineUnregister(obj, org.virtualbox_4_2.jaxws.CleanupMode.fromValue(cleanupMode.name()));
			return Helper.wrap(org.virtualbox_4_2.IMedium.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Deletes the files associated with this machine from disk. If medium objects
	 * are passed in with the aMedia argument, they are closed and, if closing was
	 * successful, their storage files are deleted as well. For convenience, this
	 * array of media files can be the same as the one returned from a previous
	 * {@link #unregister(org.virtualbox_4_2.CleanupMode)} call.
	 * 
	 * This method must only be called on machines which are either write-locked
	 * (i.e. on instances returned by
	 * {@link org.virtualbox_4_2.ISession#getMachine()}) or on unregistered machines
	 * (i.e. not yet registered machines created by
	 * {@link org.virtualbox_4_2.IVirtualBox#createMachine(String,String,List,String,String)}
	 * or opened by {@link org.virtualbox_4_2.IVirtualBox#openMachine(String)}, or
	 * after having called {@link #unregister(org.virtualbox_4_2.CleanupMode)}).
	 * 
	 * The following files will be deleted by this method:
	 * <ul>
	 * <li>If {@link #unregister(org.virtualbox_4_2.CleanupMode)} had been
	 * previously called with a cleanupMode argument other than "UnregisterOnly",
	 * this will delete all saved state files that the machine had in use; possibly
	 * one if the machine was in "Saved" state and one for each online snapshot that
	 * the machine had.</li>
	 * <li>On each medium object passed in the aMedia array, this will call
	 * {@link org.virtualbox_4_2.IMedium#close()}. If that succeeds, this will
	 * attempt to delete the medium's storage on disk. Since the
	 * {@link org.virtualbox_4_2.IMedium#close()} call will fail if the medium is
	 * still in use, e.g. because it is still attached to a second machine; in that
	 * case the storage will not be deleted.</li>
	 * <li>Finally, the machine's own XML file will be deleted.</li>
	 * </ul>
	 * 
	 * Since deleting large disk image files can be a time-consuming I/O operation,
	 * this method operates asynchronously and returns an IProgress object to allow
	 * the caller to monitor the progress. There will be one sub-operation for each
	 * file that is being deleted (saved state or medium storage file).
	 * 
	 * 
	 * @param aMedia List of media to be closed and whose storage files will be
	 *               deleted.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>Machine is registered but not write-locked.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Could not delete the settings file.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: {@link #getSettingsModified()} will return true after this
	 *         method successfully returns.
	 * 
	 * 
	 */
	public org.virtualbox_4_2.IProgress delete(List<org.virtualbox_4_2.IMedium> aMedia) {
		try {
			String retVal;
			retVal = port.iMachineDelete(obj, Helper.unwrap(aMedia));
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Exports the machine to an OVF appliance. See
	 * {@link org.virtualbox_4_2.IAppliance} for the steps required to export
	 * VirtualBox machines to OVF.
	 * 
	 * @param aAppliance Appliance to export this machine to.
	 * 
	 * @param location   The target location.
	 * 
	 * @return VirtualSystemDescription object which is created for this machine.
	 * 
	 */
	public org.virtualbox_4_2.IVirtualSystemDescription export(org.virtualbox_4_2.IAppliance aAppliance,
			String location) {
		try {
			String retVal;
			retVal = port.iMachineExport(obj, ((aAppliance == null) ? null : aAppliance.getWrapped()), location);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IVirtualSystemDescription(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns a snapshot of this machine with the given name or UUID.
	 * 
	 * Returns a snapshot of this machine with the given UUID. A null argument can
	 * be used to obtain the first snapshot taken on this machine. To traverse the
	 * whole tree of snapshots starting from the root, inspect the root snapshot's
	 * {@link org.virtualbox_4_2.ISnapshot#getChildren()} attribute and recurse over
	 * those children.
	 * 
	 * 
	 * @param nameOrId What to search for. Name or UUID of the snapshot to find
	 * 
	 * @return Snapshot object with the given name.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>Virtual machine has no snapshots or snapshot not found.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.ISnapshot findSnapshot(String nameOrId) {
		try {
			String retVal;
			retVal = port.iMachineFindSnapshot(obj, nameOrId);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.ISnapshot(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Creates a new permanent shared folder by associating the given logical name
	 * with the given host path, adds it to the collection of shared folders and
	 * starts sharing it. Refer to the description of
	 * {@link org.virtualbox_4_2.ISharedFolder} to read more about logical names.
	 * 
	 * 
	 * @param name      Unique logical name of the shared folder.
	 * 
	 * @param hostPath  Full path to the shared folder in the host file system.
	 * 
	 * @param writable  Whether the share is writable or readonly.
	 * 
	 * @param automount Whether the share gets automatically mounted by the guest or
	 *                  not.
	 * 
	 *                  Expected result codes:
	 *                  <table>
	 *                  <tr>
	 *                  <td>@link ::VBOX_E_OBJECT_IN_USE VBOX_E_OBJECT_IN_USE</td>
	 *                  <td>Shared folder already exists.</td>
	 *                  <tr>
	 *                  <tr>
	 *                  <td>@link ::VBOX_E_FILE_ERROR VBOX_E_FILE_ERROR</td>
	 *                  <td>Shared folder hostPath not accessible.</td>
	 *                  <tr>
	 *                  </table>
	 * 
	 */
	public void createSharedFolder(String name, String hostPath, Boolean writable, Boolean automount) {
		try {
			port.iMachineCreateSharedFolder(obj, name, hostPath, writable, automount);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes the permanent shared folder with the given name previously created by
	 * {@link #createSharedFolder(String,String,Boolean,Boolean)} from the
	 * collection of shared folders and stops sharing it.
	 * 
	 * 
	 * @param name Logical name of the shared folder to remove.
	 * 
	 *             Expected result codes:
	 *             <table>
	 *             <tr>
	 *             <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *             <td>Virtual machine is not mutable.</td>
	 *             <tr>
	 *             <tr>
	 *             <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *             <td>Shared folder name does not exist.</td>
	 *             <tr>
	 *             </table>
	 * 
	 */
	public void removeSharedFolder(String name) {
		try {
			port.iMachineRemoveSharedFolder(obj, name);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns true if the VM console process can activate the console window and
	 * bring it to foreground on the desktop of the host PC.
	 * 
	 * @return true if the console window can be shown and false otherwise.
	 * 
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>Machine session is not open.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: This method will fail if a session for this machine is not
	 *         currently open.
	 * 
	 * 
	 */
	public Boolean canShowConsoleWindow() {
		try {
			Boolean retVal;
			retVal = port.iMachineCanShowConsoleWindow(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Activates the console window and brings it to foreground on the desktop of
	 * the host PC. Many modern window managers on many platforms implement some
	 * sort of focus stealing prevention logic, so that it may be impossible to
	 * activate a window without the help of the currently active application. In
	 * this case, this method will return a non-zero identifier that represents the
	 * top-level window of the VM console process. The caller, if it represents a
	 * currently active process, is responsible to use this identifier (in a
	 * platform-dependent manner) to perform actual window activation.
	 * 
	 * @return Platform-dependent identifier of the top-level VM console window, or
	 *         zero if this method has performed all actions necessary to implement
	 *         the <i>show window</i> semantics for the given platform and/or
	 *         VirtualBox front-end.
	 * 
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>Machine session is not open.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: This method will fail if a session for this machine is not
	 *         currently open.
	 * 
	 * 
	 */
	public Long showConsoleWindow() {
		try {
			Long retVal;
			retVal = port.iMachineShowConsoleWindow(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Reads an entry from the machine's guest property store.
	 * 
	 * 
	 * @param name      The name of the property to read.
	 * 
	 * 
	 * @param value     The value of the property. If the property does not exist
	 *                  then this will be empty.
	 * 
	 * 
	 * @param timestamp The time at which the property was last modified, as seen by
	 *                  the server process.
	 * 
	 * 
	 * @param flags     Additional property parameters, passed as a comma-separated
	 *                  list of "name=value" type entries.
	 * 
	 * 
	 *                  Expected result codes:
	 *                  <table>
	 *                  <tr>
	 *                  <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                  VBOX_E_INVALID_VM_STATE</td>
	 *                  <td>Machine session is not open.</td>
	 *                  <tr>
	 *                  </table>
	 * 
	 */
	public void getGuestProperty(String name, Holder<String> value, Holder<Long> timestamp, Holder<String> flags) {
		try {
			javax.xml.ws.Holder<String> tmp_value = new javax.xml.ws.Holder<String>();
			javax.xml.ws.Holder<Long> tmp_timestamp = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<String> tmp_flags = new javax.xml.ws.Holder<String>();
			port.iMachineGetGuestProperty(obj, name, tmp_value, tmp_timestamp, tmp_flags);
			value.value = tmp_value.value;
			timestamp.value = tmp_timestamp.value;
			flags.value = tmp_flags.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Reads a value from the machine's guest property store.
	 * 
	 * 
	 * @param property The name of the property to read.
	 * 
	 * 
	 * @return The value of the property. If the property does not exist then this
	 *         will be empty.
	 * 
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>Machine session is not open.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public String getGuestPropertyValue(String property) {
		try {
			String retVal;
			retVal = port.iMachineGetGuestPropertyValue(obj, property);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Reads a property timestamp from the machine's guest property store.
	 * 
	 * 
	 * @param property The name of the property to read.
	 * 
	 * 
	 * @return The timestamp. If the property does not exist then this will be
	 *         empty.
	 * 
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>Machine session is not open.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public Long getGuestPropertyTimestamp(String property) {
		try {
			Long retVal;
			retVal = port.iMachineGetGuestPropertyTimestamp(obj, property);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets, changes or deletes an entry in the machine's guest property store.
	 * 
	 * 
	 * @param property The name of the property to set, change or delete.
	 * 
	 * 
	 * @param value    The new value of the property to set, change or delete. If
	 *                 the property does not yet exist and value is non-empty, it
	 *                 will be created. If the value is null or empty, the property
	 *                 will be deleted if it exists.
	 * 
	 * 
	 * @param flags    Additional property parameters, passed as a comma-separated
	 *                 list of "name=value" type entries.
	 * 
	 * 
	 *                 Expected result codes:
	 *                 <table>
	 *                 <tr>
	 *                 <td>E_ACCESSDENIED</td>
	 *                 <td>Property cannot be changed.</td>
	 *                 <tr>
	 *                 <tr>
	 *                 <td>E_INVALIDARG</td>
	 *                 <td>Invalid flags.</td>
	 *                 <tr>
	 *                 <tr>
	 *                 <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                 VBOX_E_INVALID_VM_STATE</td>
	 *                 <td>Virtual machine is not mutable or session not open.</td>
	 *                 <tr>
	 *                 <tr>
	 *                 <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                 VBOX_E_INVALID_OBJECT_STATE</td>
	 *                 <td>Cannot set transient property when machine not running.
	 *                 </td>
	 *                 <tr>
	 *                 </table>
	 * 
	 */
	public void setGuestProperty(String property, String value, String flags) {
		try {
			port.iMachineSetGuestProperty(obj, property, value, flags);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets, changes or deletes a value in the machine's guest property store. The
	 * flags field will be left unchanged or created empty for a new property.
	 * 
	 * 
	 * @param property The name of the property to set, change or delete.
	 * 
	 * 
	 * @param value    The new value of the property to set, change or delete. If
	 *                 the property does not yet exist and value is non-empty, it
	 *                 will be created. If the value is null or empty, the property
	 *                 will be deleted if it exists.
	 * 
	 * 
	 *                 Expected result codes:
	 *                 <table>
	 *                 <tr>
	 *                 <td>E_ACCESSDENIED</td>
	 *                 <td>Property cannot be changed.</td>
	 *                 <tr>
	 *                 <tr>
	 *                 <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                 VBOX_E_INVALID_VM_STATE</td>
	 *                 <td>Virtual machine is not mutable or session not open.</td>
	 *                 <tr>
	 *                 <tr>
	 *                 <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                 VBOX_E_INVALID_OBJECT_STATE</td>
	 *                 <td>Cannot set transient property when machine not running.
	 *                 </td>
	 *                 <tr>
	 *                 </table>
	 * 
	 */
	public void setGuestPropertyValue(String property, String value) {
		try {
			port.iMachineSetGuestPropertyValue(obj, property, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Deletes an entry from the machine's guest property store.
	 * 
	 * 
	 * @param name The name of the property to delete.
	 * 
	 * 
	 *             Expected result codes:
	 *             <table>
	 *             <tr>
	 *             <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *             <td>Machine session is not open.</td>
	 *             <tr>
	 *             </table>
	 * 
	 */
	public void deleteGuestProperty(String name) {
		try {
			port.iMachineDeleteGuestProperty(obj, name);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Return a list of the guest properties matching a set of patterns along with
	 * their values, time stamps and flags.
	 * 
	 * @param patterns  The patterns to match the properties against, separated by
	 *                  '|' characters. If this is empty or null, all properties
	 *                  will match.
	 * 
	 * 
	 * @param name      The names of the properties returned.
	 * 
	 * 
	 * @param value     The values of the properties returned. The array entries
	 *                  match the corresponding entries in the name array.
	 * 
	 * 
	 * @param timestamp The time stamps of the properties returned. The array
	 *                  entries match the corresponding entries in the name array.
	 * 
	 * 
	 * @param flags     The flags of the properties returned. The array entries
	 *                  match the corresponding entries in the name array.
	 * 
	 * 
	 */
	public void enumerateGuestProperties(String patterns, Holder<List<String>> name, Holder<List<String>> value,
			Holder<List<Long>> timestamp, Holder<List<String>> flags) {
		try {
			javax.xml.ws.Holder<List<String>> tmp_name = new javax.xml.ws.Holder<List<String>>();
			javax.xml.ws.Holder<List<String>> tmp_value = new javax.xml.ws.Holder<List<String>>();
			javax.xml.ws.Holder<List<Long>> tmp_timestamp = new javax.xml.ws.Holder<List<Long>>();
			javax.xml.ws.Holder<List<String>> tmp_flags = new javax.xml.ws.Holder<List<String>>();
			port.iMachineEnumerateGuestProperties(obj, patterns, tmp_name, tmp_value, tmp_timestamp, tmp_flags);
			name.value = tmp_name.value;
			value.value = tmp_value.value;
			timestamp.value = tmp_timestamp.value;
			flags.value = tmp_flags.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the guest dimensions from the saved state.
	 * 
	 * @param screenId Saved guest screen to query info from.
	 * 
	 * 
	 * @param originX  The X position of the guest monitor top left corner.
	 * 
	 * 
	 * @param originY  The Y position of the guest monitor top left corner.
	 * 
	 * 
	 * @param width    Guest width at the time of the saved state was taken.
	 * 
	 * 
	 * @param height   Guest height at the time of the saved state was taken.
	 * 
	 * 
	 * @param enabled  Whether the monitor is enabled in the guest.
	 * 
	 * 
	 */
	public void querySavedGuestScreenInfo(Long screenId, Holder<Long> originX, Holder<Long> originY, Holder<Long> width,
			Holder<Long> height, Holder<Boolean> enabled) {
		try {
			javax.xml.ws.Holder<Long> tmp_originX = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_originY = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_width = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_height = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Boolean> tmp_enabled = new javax.xml.ws.Holder<Boolean>();
			port.iMachineQuerySavedGuestScreenInfo(obj, screenId, tmp_originX, tmp_originY, tmp_width, tmp_height,
					tmp_enabled);
			originX.value = tmp_originX.value;
			originY.value = tmp_originY.value;
			width.value = tmp_width.value;
			height.value = tmp_height.value;
			enabled.value = tmp_enabled.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns size in bytes and dimensions in pixels of a saved thumbnail bitmap
	 * from saved state.
	 * 
	 * @param screenId Saved guest screen to query info from.
	 * 
	 * 
	 * @param size     Size of buffer required to store the bitmap.
	 * 
	 * 
	 * @param width    Bitmap width.
	 * 
	 * 
	 * @param height   Bitmap height.
	 * 
	 * 
	 */
	public void querySavedThumbnailSize(Long screenId, Holder<Long> size, Holder<Long> width, Holder<Long> height) {
		try {
			javax.xml.ws.Holder<Long> tmp_size = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_width = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_height = new javax.xml.ws.Holder<Long>();
			port.iMachineQuerySavedThumbnailSize(obj, screenId, tmp_size, tmp_width, tmp_height);
			size.value = tmp_size.value;
			width.value = tmp_width.value;
			height.value = tmp_height.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Thumbnail is retrieved to an array of bytes in uncompressed 32-bit BGRA or
	 * RGBA format.
	 * 
	 * @param screenId Saved guest screen to read from.
	 * 
	 * 
	 * @param BGR      How to order bytes in the pixel. A pixel consists of 4 bytes.
	 *                 If this parameter is true, then bytes order is: B, G, R,
	 *                 0xFF. If this parameter is false, then bytes order is: R, G,
	 *                 B, 0xFF.
	 * 
	 * 
	 * @param width    Bitmap width.
	 * 
	 * 
	 * @param height   Bitmap height.
	 * 
	 * 
	 * @return Array with resulting bitmap data.
	 * 
	 * 
	 */
	public byte[] readSavedThumbnailToArray(Long screenId, Boolean BGR, Holder<Long> width, Holder<Long> height) {
		try {
			javax.xml.ws.Holder<Long> tmp_width = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_height = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder</* base64 */String> retVal = new javax.xml.ws.Holder</* base64 */String>();
			port.iMachineReadSavedThumbnailToArray(obj, screenId, BGR, tmp_width, tmp_height, retVal);
			width.value = tmp_width.value;
			height.value = tmp_height.value;
			return Helper.decodeBase64(retVal.value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Thumbnail in PNG format is retrieved to an array of bytes.
	 * 
	 * @param screenId Saved guest screen to read from.
	 * 
	 * 
	 * @param width    Image width.
	 * 
	 * 
	 * @param height   Image height.
	 * 
	 * 
	 * @return Array with resulting PNG data.
	 * 
	 * 
	 */
	public byte[] readSavedThumbnailPNGToArray(Long screenId, Holder<Long> width, Holder<Long> height) {
		try {
			javax.xml.ws.Holder<Long> tmp_width = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_height = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder</* base64 */String> retVal = new javax.xml.ws.Holder</* base64 */String>();
			port.iMachineReadSavedThumbnailPNGToArray(obj, screenId, tmp_width, tmp_height, retVal);
			width.value = tmp_width.value;
			height.value = tmp_height.value;
			return Helper.decodeBase64(retVal.value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns size in bytes and dimensions of a saved PNG image of screenshot from
	 * saved state.
	 * 
	 * @param screenId Saved guest screen to query info from.
	 * 
	 * 
	 * @param size     Size of buffer required to store the PNG binary data.
	 * 
	 * 
	 * @param width    Image width.
	 * 
	 * 
	 * @param height   Image height.
	 * 
	 * 
	 */
	public void querySavedScreenshotPNGSize(Long screenId, Holder<Long> size, Holder<Long> width, Holder<Long> height) {
		try {
			javax.xml.ws.Holder<Long> tmp_size = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_width = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_height = new javax.xml.ws.Holder<Long>();
			port.iMachineQuerySavedScreenshotPNGSize(obj, screenId, tmp_size, tmp_width, tmp_height);
			size.value = tmp_size.value;
			width.value = tmp_width.value;
			height.value = tmp_height.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Screenshot in PNG format is retrieved to an array of bytes.
	 * 
	 * @param screenId Saved guest screen to read from.
	 * 
	 * 
	 * @param width    Image width.
	 * 
	 * 
	 * @param height   Image height.
	 * 
	 * 
	 * @return Array with resulting PNG data.
	 * 
	 * 
	 */
	public byte[] readSavedScreenshotPNGToArray(Long screenId, Holder<Long> width, Holder<Long> height) {
		try {
			javax.xml.ws.Holder<Long> tmp_width = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_height = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder</* base64 */String> retVal = new javax.xml.ws.Holder</* base64 */String>();
			port.iMachineReadSavedScreenshotPNGToArray(obj, screenId, tmp_width, tmp_height, retVal);
			width.value = tmp_width.value;
			height.value = tmp_height.value;
			return Helper.decodeBase64(retVal.value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Plugs a CPU into the machine.
	 * 
	 * @param cpu The CPU id to insert.
	 * 
	 * 
	 */
	public void hotPlugCPU(Long cpu) {
		try {
			port.iMachineHotPlugCPU(obj, cpu);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes a CPU from the machine.
	 * 
	 * @param cpu The CPU id to remove.
	 * 
	 * 
	 */
	public void hotUnplugCPU(Long cpu) {
		try {
			port.iMachineHotUnplugCPU(obj, cpu);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the current status of the given CPU.
	 * 
	 * @param cpu The CPU id to check for.
	 * 
	 * 
	 * @return Status of the CPU.
	 * 
	 * 
	 */
	public Boolean getCPUStatus(Long cpu) {
		try {
			Boolean retVal;
			retVal = port.iMachineGetCPUStatus(obj, cpu);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Queries for the VM log file name of an given index. Returns an empty string
	 * if a log file with that index doesn't exists.
	 * 
	 * @param idx Which log file name to query. 0=current log file.
	 * 
	 * 
	 * @return On return the full path to the log file or an empty string on error.
	 * 
	 * 
	 */
	public String queryLogFilename(Long idx) {
		try {
			String retVal;
			retVal = port.iMachineQueryLogFilename(obj, idx);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Reads the VM log file. The chunk size is limited, so even if you ask for a
	 * big piece there might be less data returned.
	 * 
	 * @param idx    Which log file to read. 0=current log file.
	 * 
	 * 
	 * @param offset Offset in the log file.
	 * 
	 * 
	 * @param size   Chunk size to read in the log file.
	 * 
	 * 
	 * @return Data read from the log file. A data size of 0 means end of file if
	 *         the requested chunk size was not 0. This is the unprocessed file
	 *         data, i.e. the line ending style depends on the platform of the
	 *         system the server is running on.
	 * 
	 * 
	 */
	public byte[] readLog(Long idx, Long offset, Long size) {
		try {
			/* base64 */String retVal;
			retVal = port.iMachineReadLog(obj, idx, offset, size);
			return Helper.decodeBase64(retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Creates a clone of this machine, either as a full clone (which means creating
	 * independent copies of the hard disk media, save states and so on), or as a
	 * linked clone (which uses its own differencing media, sharing the parent media
	 * with the source machine).
	 * 
	 * The target machine object must have been created previously with
	 * {@link org.virtualbox_4_2.IVirtualBox#createMachine(String,String,List,String,String)},
	 * and all the settings will be transferred except the VM name and the hardware
	 * UUID. You can set the VM name and the new hardware UUID when creating the
	 * target machine. The network MAC addresses are newly created for all newtwork
	 * adapters. You can change that behaviour with the options parameter. The
	 * operation is performed asynchronously, so the machine object will be not be
	 * usable until the progress object signals completion.
	 * 
	 * 
	 * @param target  Target machine object.
	 * 
	 * @param mode    Which states should be cloned.
	 * 
	 * @param options Options for the cloning operation.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>target is null.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IProgress cloneTo(org.virtualbox_4_2.IMachine target, org.virtualbox_4_2.CloneMode mode,
			List<org.virtualbox_4_2.CloneOptions> options) {
		try {
			String retVal;
			retVal = port.iMachineCloneTo(obj, ((target == null) ? null : target.getWrapped()),
					org.virtualbox_4_2.jaxws.CloneMode.fromValue(mode.name()),
					Helper.convertEnums(org.virtualbox_4_2.CloneOptions.class,
							org.virtualbox_4_2.jaxws.CloneOptions.class, options));
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

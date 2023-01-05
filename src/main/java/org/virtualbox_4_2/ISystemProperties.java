
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
 * ISystemProperties.java
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
 * The ISystemProperties interface represents global properties of the given
 * VirtualBox installation.
 * 
 * These properties define limits and default values for various attributes and
 * parameters. Most of the properties are read-only, but some can be changed by
 * a user.
 * 
 * Interface ID: <tt>{1D7ACA29-97F0-4287-9874-A60EC4F80EA6}</tt>
 */
public class ISystemProperties extends IUnknown {

	public ISystemProperties(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * Minimum guest system memory in Megabytes.
	 * 
	 * @return Long
	 * 
	 */
	public Long getMinGuestRAM() {
		try {
			Long retVal = port.iSystemPropertiesGetMinGuestRAM(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Maximum guest system memory in Megabytes.
	 * 
	 * @return Long
	 * 
	 */
	public Long getMaxGuestRAM() {
		try {
			Long retVal = port.iSystemPropertiesGetMaxGuestRAM(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Minimum guest video memory in Megabytes.
	 * 
	 * @return Long
	 * 
	 */
	public Long getMinGuestVRAM() {
		try {
			Long retVal = port.iSystemPropertiesGetMinGuestVRAM(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Maximum guest video memory in Megabytes.
	 * 
	 * @return Long
	 * 
	 */
	public Long getMaxGuestVRAM() {
		try {
			Long retVal = port.iSystemPropertiesGetMaxGuestVRAM(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Minimum CPU count.
	 * 
	 * @return Long
	 * 
	 */
	public Long getMinGuestCPUCount() {
		try {
			Long retVal = port.iSystemPropertiesGetMinGuestCPUCount(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Maximum CPU count.
	 * 
	 * @return Long
	 * 
	 */
	public Long getMaxGuestCPUCount() {
		try {
			Long retVal = port.iSystemPropertiesGetMaxGuestCPUCount(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Maximum of monitors which could be connected.
	 * 
	 * @return Long
	 * 
	 */
	public Long getMaxGuestMonitors() {
		try {
			Long retVal = port.iSystemPropertiesGetMaxGuestMonitors(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Maximum size of a virtual disk image in bytes. Informational value, does not
	 * reflect the limits of any virtual disk image format.
	 * 
	 * @return Long
	 * 
	 */
	public Long getInfoVDSize() {
		try {
			Long retVal = port.iSystemPropertiesGetInfoVDSize(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Maximum number of serial ports associated with every
	 * {@link org.virtualbox_4_2.IMachine} instance.
	 * 
	 * @return Long
	 * 
	 */
	public Long getSerialPortCount() {
		try {
			Long retVal = port.iSystemPropertiesGetSerialPortCount(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Maximum number of parallel ports associated with every
	 * {@link org.virtualbox_4_2.IMachine} instance.
	 * 
	 * @return Long
	 * 
	 */
	public Long getParallelPortCount() {
		try {
			Long retVal = port.iSystemPropertiesGetParallelPortCount(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Maximum device position in the boot order. This value corresponds to the
	 * total number of devices a machine can boot from, to make it possible to
	 * include all possible devices to the boot list.
	 * 
	 * @return Long
	 * 
	 * @see org.virtualbox_4_2.IMachine#setBootOrder(Long,org.virtualbox_4_2.DeviceType)
	 * 
	 */
	public Long getMaxBootPosition() {
		try {
			Long retVal = port.iSystemPropertiesGetMaxBootPosition(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Full path to the default directory used to create new or open existing
	 * machines when a machine settings file name contains no path.
	 * 
	 * Starting with VirtualBox 4.0, by default, this attribute contains the full
	 * path of folder named "VirtualBox VMs" in the user's home directory, which
	 * depends on the host platform.
	 * 
	 * When setting this attribute, a full path must be specified. Setting this
	 * property to null or an empty string or the special value "Machines" (for
	 * compatibility reasons) will restore that default value.
	 * 
	 * If the folder specified herein does not exist, it will be created
	 * automatically as needed.
	 * 
	 * 
	 * @return String
	 * 
	 * @see org.virtualbox_4_2.IVirtualBox#createMachine(String,String,List,String,String)
	 * @see org.virtualbox_4_2.IVirtualBox#openMachine(String)
	 * 
	 */
	public String getDefaultMachineFolder() {
		try {
			String retVal = port.iSystemPropertiesGetDefaultMachineFolder(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Full path to the default directory used to create new or open existing
	 * machines when a machine settings file name contains no path.
	 * 
	 * Starting with VirtualBox 4.0, by default, this attribute contains the full
	 * path of folder named "VirtualBox VMs" in the user's home directory, which
	 * depends on the host platform.
	 * 
	 * When setting this attribute, a full path must be specified. Setting this
	 * property to null or an empty string or the special value "Machines" (for
	 * compatibility reasons) will restore that default value.
	 * 
	 * If the folder specified herein does not exist, it will be created
	 * automatically as needed.
	 * 
	 * 
	 * @param value String
	 * 
	 * @see org.virtualbox_4_2.IVirtualBox#createMachine(String,String,List,String,String)
	 * @see org.virtualbox_4_2.IVirtualBox#openMachine(String)
	 * 
	 */
	public void setDefaultMachineFolder(String value) {
		try {
			port.iSystemPropertiesSetDefaultMachineFolder(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * List of all medium storage formats supported by this VirtualBox installation.
	 * 
	 * Keep in mind that the medium format identifier
	 * ({@link org.virtualbox_4_2.IMediumFormat#getId()}) used in other API calls
	 * like {@link org.virtualbox_4_2.IVirtualBox#createHardDisk(String,String)} to
	 * refer to a particular medium format is a case-insensitive string. This means
	 * that, for example, all of the following strings:
	 * 
	 * <pre>
	   "VDI"
	   "vdi"
	   "VdI"
	 * </pre>
	 * 
	 * refer to the same medium format.
	 * 
	 * Note that the virtual medium framework is backend-based, therefore the list
	 * of supported formats depends on what backends are currently installed.
	 * 
	 * 
	 * @return List<org.virtualbox_4_2.IMediumFormat>
	 * 
	 * @see org.virtualbox_4_2.IMediumFormat
	 * 
	 */
	public List<org.virtualbox_4_2.IMediumFormat> getMediumFormats() {
		try {
			List<String> retVal = port.iSystemPropertiesGetMediumFormats(obj);
			return Helper.wrap(org.virtualbox_4_2.IMediumFormat.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Identifier of the default medium format used by VirtualBox.
	 * 
	 * The medium format set by this attribute is used by VirtualBox when the medium
	 * format was not specified explicitly. One example is
	 * {@link org.virtualbox_4_2.IVirtualBox#createHardDisk(String,String)} with the
	 * empty format argument. A more complex example is implicit creation of
	 * differencing media when taking a snapshot of a virtual machine: this
	 * operation will try to use a format of the parent medium first and if this
	 * format does not support differencing media the default format specified by
	 * this argument will be used.
	 * 
	 * The list of supported medium formats may be obtained by the
	 * {@link #getMediumFormats()} call. Note that the default medium format must
	 * have a capability to create differencing media; otherwise operations that
	 * create media implicitly may fail unexpectedly.
	 * 
	 * The initial value of this property is <tt>"VDI"</tt> in the current version
	 * of the VirtualBox product, but may change in the future.
	 * 
	 * 
	 * NOTE: Setting this property to null or empty string will restore the initial
	 * value.
	 * 
	 * 
	 * @return String
	 * 
	 * @see #getMediumFormats()
	 * @see org.virtualbox_4_2.IMediumFormat#getId()
	 * @see org.virtualbox_4_2.IVirtualBox#createHardDisk(String,String)
	 * 
	 */
	public String getDefaultHardDiskFormat() {
		try {
			String retVal = port.iSystemPropertiesGetDefaultHardDiskFormat(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Identifier of the default medium format used by VirtualBox.
	 * 
	 * The medium format set by this attribute is used by VirtualBox when the medium
	 * format was not specified explicitly. One example is
	 * {@link org.virtualbox_4_2.IVirtualBox#createHardDisk(String,String)} with the
	 * empty format argument. A more complex example is implicit creation of
	 * differencing media when taking a snapshot of a virtual machine: this
	 * operation will try to use a format of the parent medium first and if this
	 * format does not support differencing media the default format specified by
	 * this argument will be used.
	 * 
	 * The list of supported medium formats may be obtained by the
	 * {@link #getMediumFormats()} call. Note that the default medium format must
	 * have a capability to create differencing media; otherwise operations that
	 * create media implicitly may fail unexpectedly.
	 * 
	 * The initial value of this property is <tt>"VDI"</tt> in the current version
	 * of the VirtualBox product, but may change in the future.
	 * 
	 * 
	 * NOTE: Setting this property to null or empty string will restore the initial
	 * value.
	 * 
	 * 
	 * @param value String
	 * 
	 * @see #getMediumFormats()
	 * @see org.virtualbox_4_2.IMediumFormat#getId()
	 * @see org.virtualbox_4_2.IVirtualBox#createHardDisk(String,String)
	 * 
	 */
	public void setDefaultHardDiskFormat(String value) {
		try {
			port.iSystemPropertiesSetDefaultHardDiskFormat(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Issue a warning if the free disk space is below (or in some disk intensive
	 * operation is expected to go below) the given size in bytes.
	 * 
	 * @return Long
	 * 
	 */
	public Long getFreeDiskSpaceWarning() {
		try {
			Long retVal = port.iSystemPropertiesGetFreeDiskSpaceWarning(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Issue a warning if the free disk space is below (or in some disk intensive
	 * operation is expected to go below) the given size in bytes.
	 * 
	 * @param value Long
	 * 
	 */
	public void setFreeDiskSpaceWarning(Long value) {
		try {
			port.iSystemPropertiesSetFreeDiskSpaceWarning(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Issue a warning if the free disk space is below (or in some disk intensive
	 * operation is expected to go below) the given percentage.
	 * 
	 * @return Long
	 * 
	 */
	public Long getFreeDiskSpacePercentWarning() {
		try {
			Long retVal = port.iSystemPropertiesGetFreeDiskSpacePercentWarning(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Issue a warning if the free disk space is below (or in some disk intensive
	 * operation is expected to go below) the given percentage.
	 * 
	 * @param value Long
	 * 
	 */
	public void setFreeDiskSpacePercentWarning(Long value) {
		try {
			port.iSystemPropertiesSetFreeDiskSpacePercentWarning(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Issue an error if the free disk space is below (or in some disk intensive
	 * operation is expected to go below) the given size in bytes.
	 * 
	 * @return Long
	 * 
	 */
	public Long getFreeDiskSpaceError() {
		try {
			Long retVal = port.iSystemPropertiesGetFreeDiskSpaceError(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Issue an error if the free disk space is below (or in some disk intensive
	 * operation is expected to go below) the given size in bytes.
	 * 
	 * @param value Long
	 * 
	 */
	public void setFreeDiskSpaceError(Long value) {
		try {
			port.iSystemPropertiesSetFreeDiskSpaceError(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Issue an error if the free disk space is below (or in some disk intensive
	 * operation is expected to go below) the given percentage.
	 * 
	 * @return Long
	 * 
	 */
	public Long getFreeDiskSpacePercentError() {
		try {
			Long retVal = port.iSystemPropertiesGetFreeDiskSpacePercentError(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Issue an error if the free disk space is below (or in some disk intensive
	 * operation is expected to go below) the given percentage.
	 * 
	 * @param value Long
	 * 
	 */
	public void setFreeDiskSpacePercentError(Long value) {
		try {
			port.iSystemPropertiesSetFreeDiskSpacePercentError(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Library that provides authentication for Remote Desktop clients. The library
	 * is used if a virtual machine's authentication type is set to "external" in
	 * the VM RemoteDisplay configuration.
	 * 
	 * The system library extension (".DLL" or ".so") must be omitted. A full path
	 * can be specified; if not, then the library must reside on the system's
	 * default library path.
	 * 
	 * The default value of this property is <tt>"VBoxAuth"</tt>. There is a library
	 * of that name in one of the default VirtualBox library directories.
	 * 
	 * For details about VirtualBox authentication libraries and how to implement
	 * them, please refer to the VirtualBox manual.
	 * 
	 * 
	 * NOTE: Setting this property to null or empty string will restore the initial
	 * value.
	 * 
	 * 
	 * @return String
	 * 
	 */
	public String getVRDEAuthLibrary() {
		try {
			String retVal = port.iSystemPropertiesGetVRDEAuthLibrary(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Library that provides authentication for Remote Desktop clients. The library
	 * is used if a virtual machine's authentication type is set to "external" in
	 * the VM RemoteDisplay configuration.
	 * 
	 * The system library extension (".DLL" or ".so") must be omitted. A full path
	 * can be specified; if not, then the library must reside on the system's
	 * default library path.
	 * 
	 * The default value of this property is <tt>"VBoxAuth"</tt>. There is a library
	 * of that name in one of the default VirtualBox library directories.
	 * 
	 * For details about VirtualBox authentication libraries and how to implement
	 * them, please refer to the VirtualBox manual.
	 * 
	 * 
	 * NOTE: Setting this property to null or empty string will restore the initial
	 * value.
	 * 
	 * 
	 * @param value String
	 * 
	 */
	public void setVRDEAuthLibrary(String value) {
		try {
			port.iSystemPropertiesSetVRDEAuthLibrary(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Library that provides authentication for webservice clients. The library is
	 * used if a virtual machine's authentication type is set to "external" in the
	 * VM RemoteDisplay configuration and will be called from within the
	 * {@link org.virtualbox_4_2.IWebsessionManager#logon(String,String)}
	 * implementation.
	 * 
	 * As opposed to
	 * {@link org.virtualbox_4_2.ISystemProperties#getVRDEAuthLibrary()}, there is
	 * no per-VM setting for this, as the webservice is a global resource (if it is
	 * running). Only for this setting (for the webservice), setting this value to a
	 * literal <tt>"null"</tt> string disables authentication, meaning that
	 * {@link org.virtualbox_4_2.IWebsessionManager#logon(String,String)} will
	 * always succeed, no matter what user name and password are supplied.
	 * 
	 * The initial value of this property is <tt>"VBoxAuth"</tt>, meaning that the
	 * webservice will use the same authentication library that is used by default
	 * for VRDE (again, see
	 * {@link org.virtualbox_4_2.ISystemProperties#getVRDEAuthLibrary()}). The
	 * format and calling convention of authentication libraries is the same for the
	 * webservice as it is for VRDE.
	 * 
	 * 
	 * NOTE: Setting this property to null or empty string will restore the initial
	 * value.
	 * 
	 * 
	 * @return String
	 * 
	 */
	public String getWebServiceAuthLibrary() {
		try {
			String retVal = port.iSystemPropertiesGetWebServiceAuthLibrary(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Library that provides authentication for webservice clients. The library is
	 * used if a virtual machine's authentication type is set to "external" in the
	 * VM RemoteDisplay configuration and will be called from within the
	 * {@link org.virtualbox_4_2.IWebsessionManager#logon(String,String)}
	 * implementation.
	 * 
	 * As opposed to
	 * {@link org.virtualbox_4_2.ISystemProperties#getVRDEAuthLibrary()}, there is
	 * no per-VM setting for this, as the webservice is a global resource (if it is
	 * running). Only for this setting (for the webservice), setting this value to a
	 * literal <tt>"null"</tt> string disables authentication, meaning that
	 * {@link org.virtualbox_4_2.IWebsessionManager#logon(String,String)} will
	 * always succeed, no matter what user name and password are supplied.
	 * 
	 * The initial value of this property is <tt>"VBoxAuth"</tt>, meaning that the
	 * webservice will use the same authentication library that is used by default
	 * for VRDE (again, see
	 * {@link org.virtualbox_4_2.ISystemProperties#getVRDEAuthLibrary()}). The
	 * format and calling convention of authentication libraries is the same for the
	 * webservice as it is for VRDE.
	 * 
	 * 
	 * NOTE: Setting this property to null or empty string will restore the initial
	 * value.
	 * 
	 * 
	 * @param value String
	 * 
	 */
	public void setWebServiceAuthLibrary(String value) {
		try {
			port.iSystemPropertiesSetWebServiceAuthLibrary(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The name of the extension pack providing the default VRDE.
	 * 
	 * This attribute is for choosing between multiple extension packs providing
	 * VRDE. If only one is installed, it will automatically be the default one. The
	 * attribute value can be empty if no VRDE extension pack is installed.
	 * 
	 * For details about VirtualBox Remote Desktop Extension and how to implement
	 * one, please refer to the VirtualBox SDK.
	 * 
	 * @return String
	 * 
	 */
	public String getDefaultVRDEExtPack() {
		try {
			String retVal = port.iSystemPropertiesGetDefaultVRDEExtPack(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The name of the extension pack providing the default VRDE.
	 * 
	 * This attribute is for choosing between multiple extension packs providing
	 * VRDE. If only one is installed, it will automatically be the default one. The
	 * attribute value can be empty if no VRDE extension pack is installed.
	 * 
	 * For details about VirtualBox Remote Desktop Extension and how to implement
	 * one, please refer to the VirtualBox SDK.
	 * 
	 * @param value String
	 * 
	 */
	public void setDefaultVRDEExtPack(String value) {
		try {
			port.iSystemPropertiesSetDefaultVRDEExtPack(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This value specifies how many old release log files are kept.
	 * 
	 * @return Long
	 * 
	 */
	public Long getLogHistoryCount() {
		try {
			Long retVal = port.iSystemPropertiesGetLogHistoryCount(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * This value specifies how many old release log files are kept.
	 * 
	 * @param value Long
	 * 
	 */
	public void setLogHistoryCount(Long value) {
		try {
			port.iSystemPropertiesSetLogHistoryCount(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * This value hold the default audio driver for the current system.
	 * 
	 * @return org.virtualbox_4_2.AudioDriverType
	 * 
	 */
	public org.virtualbox_4_2.AudioDriverType getDefaultAudioDriver() {
		try {
			org.virtualbox_4_2.jaxws.AudioDriverType retVal = port.iSystemPropertiesGetDefaultAudioDriver(obj);
			return org.virtualbox_4_2.AudioDriverType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The path to the autostart database. Depending on the host this might be a
	 * filesystem path or something else.
	 * 
	 * @return String
	 * 
	 */
	public String getAutostartDatabasePath() {
		try {
			String retVal = port.iSystemPropertiesGetAutostartDatabasePath(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The path to the autostart database. Depending on the host this might be a
	 * filesystem path or something else.
	 * 
	 * @param value String
	 * 
	 */
	public void setAutostartDatabasePath(String value) {
		try {
			port.iSystemPropertiesSetAutostartDatabasePath(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The path to the default Guest Additions ISO image. Can be empty if the
	 * location is not known in this installation.
	 * 
	 * @return String
	 * 
	 */
	public String getDefaultAdditionsISO() {
		try {
			String retVal = port.iSystemPropertiesGetDefaultAdditionsISO(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The path to the default Guest Additions ISO image. Can be empty if the
	 * location is not known in this installation.
	 * 
	 * @param value String
	 * 
	 */
	public void setDefaultAdditionsISO(String value) {
		try {
			port.iSystemPropertiesSetDefaultAdditionsISO(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static ISystemProperties queryInterface(IUnknown obj) {
		return obj == null ? null : new ISystemProperties(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Maximum total number of network adapters associated with every
	 * {@link org.virtualbox_4_2.IMachine} instance.
	 * 
	 * @param chipset The chipset type to get the value for.
	 * 
	 * @return The maximum total number of network adapters allowed.
	 * 
	 */
	public Long getMaxNetworkAdapters(org.virtualbox_4_2.ChipsetType chipset) {
		try {
			Long retVal;
			retVal = port.iSystemPropertiesGetMaxNetworkAdapters(obj,
					org.virtualbox_4_2.jaxws.ChipsetType.fromValue(chipset.name()));
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Maximum number of network adapters of a given attachment type, associated
	 * with every {@link org.virtualbox_4_2.IMachine} instance.
	 * 
	 * @param chipset The chipset type to get the value for.
	 * 
	 * @param type    Type of attachment.
	 * 
	 * @return The maximum number of network adapters allowed for particular chipset
	 *         and attachment type.
	 * 
	 */
	public Long getMaxNetworkAdaptersOfType(org.virtualbox_4_2.ChipsetType chipset,
			org.virtualbox_4_2.NetworkAttachmentType type) {
		try {
			Long retVal;
			retVal = port.iSystemPropertiesGetMaxNetworkAdaptersOfType(obj,
					org.virtualbox_4_2.jaxws.ChipsetType.fromValue(chipset.name()),
					org.virtualbox_4_2.jaxws.NetworkAttachmentType.fromValue(type.name()));
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the maximum number of devices which can be attached to a port for the
	 * given storage bus.
	 * 
	 * @param bus The storage bus type to get the value for.
	 * 
	 * @return The maximum number of devices which can be attached to the port for
	 *         the given storage bus.
	 * 
	 */
	public Long getMaxDevicesPerPortForStorageBus(org.virtualbox_4_2.StorageBus bus) {
		try {
			Long retVal;
			retVal = port.iSystemPropertiesGetMaxDevicesPerPortForStorageBus(obj,
					org.virtualbox_4_2.jaxws.StorageBus.fromValue(bus.name()));
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the minimum number of ports the given storage bus supports.
	 * 
	 * @param bus The storage bus type to get the value for.
	 * 
	 * @return The minimum number of ports for the given storage bus.
	 * 
	 */
	public Long getMinPortCountForStorageBus(org.virtualbox_4_2.StorageBus bus) {
		try {
			Long retVal;
			retVal = port.iSystemPropertiesGetMinPortCountForStorageBus(obj,
					org.virtualbox_4_2.jaxws.StorageBus.fromValue(bus.name()));
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the maximum number of ports the given storage bus supports.
	 * 
	 * @param bus The storage bus type to get the value for.
	 * 
	 * @return The maximum number of ports for the given storage bus.
	 * 
	 */
	public Long getMaxPortCountForStorageBus(org.virtualbox_4_2.StorageBus bus) {
		try {
			Long retVal;
			retVal = port.iSystemPropertiesGetMaxPortCountForStorageBus(obj,
					org.virtualbox_4_2.jaxws.StorageBus.fromValue(bus.name()));
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the maximum number of storage bus instances which can be configured
	 * for each VM. This corresponds to the number of storage controllers one can
	 * have. Value may depend on chipset type used.
	 * 
	 * @param chipset The chipset type to get the value for.
	 * 
	 * @param bus     The storage bus type to get the value for.
	 * 
	 * @return The maximum number of instances for the given storage bus.
	 * 
	 */
	public Long getMaxInstancesOfStorageBus(org.virtualbox_4_2.ChipsetType chipset, org.virtualbox_4_2.StorageBus bus) {
		try {
			Long retVal;
			retVal = port.iSystemPropertiesGetMaxInstancesOfStorageBus(obj,
					org.virtualbox_4_2.jaxws.ChipsetType.fromValue(chipset.name()),
					org.virtualbox_4_2.jaxws.StorageBus.fromValue(bus.name()));
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns list of all the supported device types
	 * ({@link org.virtualbox_4_2.DeviceType}) for the given type of storage bus.
	 * 
	 * @param bus The storage bus type to get the value for.
	 * 
	 * @return The list of all supported device types for the given storage bus.
	 * 
	 */
	public List<org.virtualbox_4_2.DeviceType> getDeviceTypesForStorageBus(org.virtualbox_4_2.StorageBus bus) {
		try {
			List<org.virtualbox_4_2.jaxws.DeviceType> retVal;
			retVal = port.iSystemPropertiesGetDeviceTypesForStorageBus(obj,
					org.virtualbox_4_2.jaxws.StorageBus.fromValue(bus.name()));
			return Helper.convertEnums(org.virtualbox_4_2.jaxws.DeviceType.class, org.virtualbox_4_2.DeviceType.class,
					retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the default I/O cache setting for the given storage controller
	 * 
	 * @param controllerType The storage controller to the setting for.
	 * 
	 * @return Returned flag indicating the default value
	 * 
	 */
	public Boolean getDefaultIoCacheSettingForStorageController(
			org.virtualbox_4_2.StorageControllerType controllerType) {
		try {
			Boolean retVal;
			retVal = port.iSystemPropertiesGetDefaultIoCacheSettingForStorageController(obj,
					org.virtualbox_4_2.jaxws.StorageControllerType.fromValue(controllerType.name()));
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

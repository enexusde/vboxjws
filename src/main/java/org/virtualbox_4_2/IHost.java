
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
 * IHost.java
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
 * The IHost interface represents the physical machine that this VirtualBox
 * installation runs on.
 * 
 * An object implementing this interface is returned by the
 * {@link org.virtualbox_4_2.IVirtualBox#getHost()} attribute. This interface
 * contains read-only information about the host's physical hardware (such as
 * what processors and disks are available, what the host operating system is,
 * and so on) and also allows for manipulating some of the host's hardware, such
 * as global USB device filters and host interface networking.
 * 
 * 
 * Interface ID: <tt>{30678943-32DF-4830-B413-931B25AC86A0}</tt>
 */
public class IHost extends IUnknown {

	public IHost(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * List of DVD drives available on the host.
	 * 
	 * @return List<org.virtualbox_4_2.IMedium>
	 * 
	 */
	public List<org.virtualbox_4_2.IMedium> getDVDDrives() {
		try {
			List<String> retVal = port.iHostGetDVDDrives(obj);
			return Helper.wrap(org.virtualbox_4_2.IMedium.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * List of floppy drives available on the host.
	 * 
	 * @return List<org.virtualbox_4_2.IMedium>
	 * 
	 */
	public List<org.virtualbox_4_2.IMedium> getFloppyDrives() {
		try {
			List<String> retVal = port.iHostGetFloppyDrives(obj);
			return Helper.wrap(org.virtualbox_4_2.IMedium.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * List of USB devices currently attached to the host. Once a new device is
	 * physically attached to the host computer, it appears in this list and remains
	 * there until detached.
	 * 
	 * 
	 * NOTE: If USB functionality is not available in the given edition of
	 * VirtualBox, this method will set the result code to E_NOTIMPL.
	 * 
	 * 
	 * @return List<org.virtualbox_4_2.IHostUSBDevice>
	 * 
	 */
	public List<org.virtualbox_4_2.IHostUSBDevice> getUSBDevices() {
		try {
			List<String> retVal = port.iHostGetUSBDevices(obj);
			return Helper.wrap(org.virtualbox_4_2.IHostUSBDevice.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * List of USB device filters in action. When a new device is physically
	 * attached to the host computer, filters from this list are applied to it (in
	 * order they are stored in the list). The first matched filter will determine
	 * the {@link org.virtualbox_4_2.IHostUSBDeviceFilter#getAction()} performed on
	 * the device.
	 * 
	 * Unless the device is ignored by these filters, filters of all currently
	 * running virtual machines
	 * ({@link org.virtualbox_4_2.IUSBController#getDeviceFilters()}) are applied to
	 * it.
	 * 
	 * 
	 * NOTE: If USB functionality is not available in the given edition of
	 * VirtualBox, this method will set the result code to E_NOTIMPL.
	 * 
	 * 
	 * @return List<org.virtualbox_4_2.IHostUSBDeviceFilter>
	 * 
	 * @see org.virtualbox_4_2.IHostUSBDeviceFilter
	 * @see org.virtualbox_4_2.USBDeviceState
	 * 
	 */
	public List<org.virtualbox_4_2.IHostUSBDeviceFilter> getUSBDeviceFilters() {
		try {
			List<String> retVal = port.iHostGetUSBDeviceFilters(obj);
			return Helper.wrap(org.virtualbox_4_2.IHostUSBDeviceFilter.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * List of host network interfaces currently defined on the host.
	 * 
	 * @return List<org.virtualbox_4_2.IHostNetworkInterface>
	 * 
	 */
	public List<org.virtualbox_4_2.IHostNetworkInterface> getNetworkInterfaces() {
		try {
			List<String> retVal = port.iHostGetNetworkInterfaces(obj);
			return Helper.wrap(org.virtualbox_4_2.IHostNetworkInterface.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Number of (logical) CPUs installed in the host system.
	 * 
	 * @return Long
	 * 
	 */
	public Long getProcessorCount() {
		try {
			Long retVal = port.iHostGetProcessorCount(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Number of (logical) CPUs online in the host system.
	 * 
	 * @return Long
	 * 
	 */
	public Long getProcessorOnlineCount() {
		try {
			Long retVal = port.iHostGetProcessorOnlineCount(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Number of physical processor cores installed in the host system.
	 * 
	 * @return Long
	 * 
	 */
	public Long getProcessorCoreCount() {
		try {
			Long retVal = port.iHostGetProcessorCoreCount(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Amount of system memory in megabytes installed in the host system.
	 * 
	 * @return Long
	 * 
	 */
	public Long getMemorySize() {
		try {
			Long retVal = port.iHostGetMemorySize(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Available system memory in the host system.
	 * 
	 * @return Long
	 * 
	 */
	public Long getMemoryAvailable() {
		try {
			Long retVal = port.iHostGetMemoryAvailable(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Name of the host system's operating system.
	 * 
	 * @return String
	 * 
	 */
	public String getOperatingSystem() {
		try {
			String retVal = port.iHostGetOperatingSystem(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Host operating system's version string.
	 * 
	 * @return String
	 * 
	 */
	public String getOSVersion() {
		try {
			String retVal = port.iHostGetOSVersion(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the current host time in milliseconds since 1970-01-01 UTC.
	 * 
	 * @return Long
	 * 
	 */
	public Long getUTCTime() {
		try {
			Long retVal = port.iHostGetUTCTime(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns true when the host supports 3D hardware acceleration.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getAcceleration3DAvailable() {
		try {
			Boolean retVal = port.iHostGetAcceleration3DAvailable(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IHost queryInterface(IUnknown obj) {
		return obj == null ? null : new IHost(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * Query the (approximate) maximum speed of a specified host CPU in Megahertz.
	 * 
	 * @param cpuId Identifier of the CPU.
	 * 
	 * 
	 * @return Speed value. 0 is returned if value is not known or cpuId is invalid.
	 * 
	 * 
	 */
	public Long getProcessorSpeed(Long cpuId) {
		try {
			Long retVal;
			retVal = port.iHostGetProcessorSpeed(obj, cpuId);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Query whether a CPU feature is supported or not.
	 * 
	 * @param feature CPU Feature identifier.
	 * 
	 * 
	 * @return Feature is supported or not.
	 * 
	 * 
	 */
	public Boolean getProcessorFeature(org.virtualbox_4_2.ProcessorFeature feature) {
		try {
			Boolean retVal;
			retVal = port.iHostGetProcessorFeature(obj,
					org.virtualbox_4_2.jaxws.ProcessorFeature.fromValue(feature.name()));
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Query the model string of a specified host CPU.
	 * 
	 * @param cpuId Identifier of the CPU.
	 * 
	 * 
	 * @return Model string. An empty string is returned if value is not known or
	 *         cpuId is invalid.
	 * 
	 * 
	 *         NOTE: The current implementation might not necessarily return the
	 *         description for this exact CPU.
	 * 
	 * 
	 */
	public String getProcessorDescription(Long cpuId) {
		try {
			String retVal;
			retVal = port.iHostGetProcessorDescription(obj, cpuId);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the CPU cpuid information for the specified leaf.
	 * 
	 * @param cpuId   Identifier of the CPU. The CPU most be online.
	 * 
	 * 
	 * @param leaf    CPUID leaf index (eax).
	 * 
	 * 
	 * @param subLeaf CPUID leaf sub index (ecx). This currently only applies to
	 *                cache information on Intel CPUs. Use 0 if retrieving values
	 *                for
	 *                {@link org.virtualbox_4_2.IMachine#setCPUIDLeaf(Long,Long,Long,Long,Long)}.
	 * 
	 * 
	 * @param valEax  CPUID leaf value for register eax.
	 * 
	 * 
	 * @param valEbx  CPUID leaf value for register ebx.
	 * 
	 * 
	 * @param valEcx  CPUID leaf value for register ecx.
	 * 
	 * 
	 * @param valEdx  CPUID leaf value for register edx.
	 * 
	 * 
	 *                NOTE: The current implementation might not necessarily return
	 *                the description for this exact CPU.
	 * 
	 * 
	 */
	public void getProcessorCPUIDLeaf(Long cpuId, Long leaf, Long subLeaf, Holder<Long> valEax, Holder<Long> valEbx,
			Holder<Long> valEcx, Holder<Long> valEdx) {
		try {
			javax.xml.ws.Holder<Long> tmp_valEax = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_valEbx = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_valEcx = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_valEdx = new javax.xml.ws.Holder<Long>();
			port.iHostGetProcessorCPUIDLeaf(obj, cpuId, leaf, subLeaf, tmp_valEax, tmp_valEbx, tmp_valEcx, tmp_valEdx);
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
	 * Creates a new adapter for Host Only Networking.
	 * 
	 * @param hostInterface Created host interface object.
	 * 
	 * 
	 * @return Progress object to track the operation completion.
	 * 
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
	public org.virtualbox_4_2.IProgress createHostOnlyNetworkInterface(
			Holder<org.virtualbox_4_2.IHostNetworkInterface> hostInterface) {
		try {
			javax.xml.ws.Holder<String> tmp_hostInterface = new javax.xml.ws.Holder<String>();
			javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
			port.iHostCreateHostOnlyNetworkInterface(obj, tmp_hostInterface, retVal);
			hostInterface.value = (tmp_hostInterface.value.length() > 0)
					? new org.virtualbox_4_2.IHostNetworkInterface(tmp_hostInterface.value, port)
					: null;
			return (retVal.value.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal.value, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes the given Host Only Networking interface.
	 * 
	 * @param id Adapter GUID.
	 * 
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>No host network interface matching id found.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IProgress removeHostOnlyNetworkInterface(String id) {
		try {
			String retVal;
			retVal = port.iHostRemoveHostOnlyNetworkInterface(obj, id);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Creates a new USB device filter. All attributes except the filter name are
	 * set to empty (any match), <i>active</i> is false (the filter is not active).
	 * 
	 * The created filter can be added to the list of filters using
	 * {@link #insertUSBDeviceFilter(Long,org.virtualbox_4_2.IHostUSBDeviceFilter)}.
	 * 
	 * 
	 * @param name Filter name. See
	 *             {@link org.virtualbox_4_2.IUSBDeviceFilter#getName()} for more
	 *             information.
	 * 
	 * 
	 * @return Created filter object.
	 * 
	 * @see #getUSBDeviceFilters()
	 * 
	 */
	public org.virtualbox_4_2.IHostUSBDeviceFilter createUSBDeviceFilter(String name) {
		try {
			String retVal;
			retVal = port.iHostCreateUSBDeviceFilter(obj, name);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IHostUSBDeviceFilter(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Inserts the given USB device to the specified position in the list of
	 * filters.
	 * 
	 * Positions are numbered starting from 0. If the specified position is equal to
	 * or greater than the number of elements in the list, the filter is added at
	 * the end of the collection.
	 * 
	 * 
	 * @param position Position to insert the filter to.
	 * 
	 * @param filter   USB device filter to insert.
	 * 
	 *                 Expected result codes:
	 *                 <table>
	 *                 <tr>
	 *                 <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                 VBOX_E_INVALID_OBJECT_STATE</td>
	 *                 <td>USB device filter is not created within this VirtualBox
	 *                 instance.</td>
	 *                 <tr>
	 *                 <tr>
	 *                 <td>E_INVALIDARG</td>
	 *                 <td>USB device filter already in list.</td>
	 *                 <tr>
	 *                 </table>
	 * 
	 *                 NOTE: Duplicates are not allowed, so an attempt to insert a
	 *                 filter already in the list is an error.
	 * 
	 * 
	 *                 NOTE: If USB functionality is not available in the given
	 *                 edition of VirtualBox, this method will set the result code
	 *                 to E_NOTIMPL.
	 * 
	 * 
	 * @see #getUSBDeviceFilters()
	 * 
	 */
	public void insertUSBDeviceFilter(Long position, org.virtualbox_4_2.IHostUSBDeviceFilter filter) {
		try {
			port.iHostInsertUSBDeviceFilter(obj, position, ((filter == null) ? null : filter.getWrapped()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes a USB device filter from the specified position in the list of
	 * filters.
	 * 
	 * Positions are numbered starting from 0. Specifying a position equal to or
	 * greater than the number of elements in the list will produce an error.
	 * 
	 * 
	 * @param position Position to remove the filter from.
	 * 
	 *                 Expected result codes:
	 *                 <table>
	 *                 <tr>
	 *                 <td>E_INVALIDARG</td>
	 *                 <td>USB device filter list empty or invalid position.</td>
	 *                 <tr>
	 *                 </table>
	 * 
	 *                 NOTE: If USB functionality is not available in the given
	 *                 edition of VirtualBox, this method will set the result code
	 *                 to E_NOTIMPL.
	 * 
	 * 
	 * @see #getUSBDeviceFilters()
	 * 
	 */
	public void removeUSBDeviceFilter(Long position) {
		try {
			port.iHostRemoveUSBDeviceFilter(obj, position);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Searches for a host DVD drive with the given name.
	 * 
	 * 
	 * @param name Name of the host drive to search for
	 * 
	 * @return Found host drive object
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>Given name does not correspond to any host drive.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IMedium findHostDVDDrive(String name) {
		try {
			String retVal;
			retVal = port.iHostFindHostDVDDrive(obj, name);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IMedium(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Searches for a host floppy drive with the given name.
	 * 
	 * 
	 * @param name Name of the host floppy drive to search for
	 * 
	 * @return Found host floppy drive object
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>Given name does not correspond to any host floppy drive.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IMedium findHostFloppyDrive(String name) {
		try {
			String retVal;
			retVal = port.iHostFindHostFloppyDrive(obj, name);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IMedium(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Searches through all host network interfaces for an interface with the given
	 * name.
	 * 
	 * @param name Name of the host network interface to search for.
	 * 
	 * @return Found host network interface object.
	 * 
	 *         NOTE: The method returns an error if the given name does not
	 *         correspond to any host network interface.
	 * 
	 * 
	 */
	public org.virtualbox_4_2.IHostNetworkInterface findHostNetworkInterfaceByName(String name) {
		try {
			String retVal;
			retVal = port.iHostFindHostNetworkInterfaceByName(obj, name);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IHostNetworkInterface(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Searches through all host network interfaces for an interface with the given
	 * GUID.
	 * 
	 * @param id GUID of the host network interface to search for.
	 * 
	 * @return Found host network interface object.
	 * 
	 *         NOTE: The method returns an error if the given GUID does not
	 *         correspond to any host network interface.
	 * 
	 * 
	 */
	public org.virtualbox_4_2.IHostNetworkInterface findHostNetworkInterfaceById(String id) {
		try {
			String retVal;
			retVal = port.iHostFindHostNetworkInterfaceById(obj, id);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IHostNetworkInterface(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Searches through all host network interfaces and returns a list of interfaces
	 * of the specified type
	 * 
	 * @param type type of the host network interfaces to search for.
	 * 
	 * @return Found host network interface objects.
	 * 
	 */
	public List<org.virtualbox_4_2.IHostNetworkInterface> findHostNetworkInterfacesOfType(
			org.virtualbox_4_2.HostNetworkInterfaceType type) {
		try {
			List<String> retVal;
			retVal = port.iHostFindHostNetworkInterfacesOfType(obj,
					org.virtualbox_4_2.jaxws.HostNetworkInterfaceType.fromValue(type.name()));
			return Helper.wrap(org.virtualbox_4_2.IHostNetworkInterface.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Searches for a USB device with the given UUID.
	 * 
	 * 
	 * @param id UUID of the USB device to search for.
	 * 
	 * @return Found USB device object.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>Given id does not correspond to any USB device.</td>
	 *         <tr>
	 *         </table>
	 * 
	 * @see org.virtualbox_4_2.IUSBDevice#getId()
	 * 
	 */
	public org.virtualbox_4_2.IHostUSBDevice findUSBDeviceById(String id) {
		try {
			String retVal;
			retVal = port.iHostFindUSBDeviceById(obj, id);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IHostUSBDevice(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Searches for a USB device with the given host address.
	 * 
	 * 
	 * @param name Address of the USB device (as assigned by the host) to search
	 *             for.
	 * 
	 * 
	 * @return Found USB device object.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>Given name does not correspond to any USB device.</td>
	 *         <tr>
	 *         </table>
	 * 
	 * @see org.virtualbox_4_2.IUSBDevice#getAddress()
	 * 
	 */
	public org.virtualbox_4_2.IHostUSBDevice findUSBDeviceByAddress(String name) {
		try {
			String retVal;
			retVal = port.iHostFindUSBDeviceByAddress(obj, name);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IHostUSBDevice(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Generates a valid Ethernet MAC address, 12 hexadecimal characters.
	 * 
	 * @return New Ethernet MAC address.
	 * 
	 */
	public String generateMACAddress() {
		try {
			String retVal;
			retVal = port.iHostGenerateMACAddress(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}


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
 * IUSBController.java
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

public class IUSBController extends IUnknown {

	public IUSBController(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Flag whether the USB controller is present in the guest system. If disabled,
	 * the virtual guest hardware will not contain any USB controller. Can only be
	 * changed when the VM is powered off.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getEnabled() {
		try {
			Boolean retVal = port.iusbControllerGetEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether the USB controller is present in the guest system. If disabled,
	 * the virtual guest hardware will not contain any USB controller. Can only be
	 * changed when the VM is powered off.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setEnabled(Boolean value) {
		try {
			port.iusbControllerSetEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether the USB EHCI controller is present in the guest system. If
	 * disabled, the virtual guest hardware will not contain a USB EHCI controller.
	 * Can only be changed when the VM is powered off.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getEnabledEHCI() {
		try {
			Boolean retVal = port.iusbControllerGetEnabledEHCI(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether the USB EHCI controller is present in the guest system. If
	 * disabled, the virtual guest hardware will not contain a USB EHCI controller.
	 * Can only be changed when the VM is powered off.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setEnabledEHCI(Boolean value) {
		try {
			port.iusbControllerSetEnabledEHCI(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether there is an USB proxy available.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getProxyAvailable() {
		try {
			Boolean retVal = port.iusbControllerGetProxyAvailable(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * USB standard version which the controller implements. This is a BCD which
	 * means that the major version is in the high byte and minor version is in the
	 * low byte.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getUSBStandard() {
		try {
			Integer retVal = port.iusbControllerGetUSBStandard(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * List of USB device filters associated with the machine.
	 * 
	 * If the machine is currently running, these filters are activated every time a
	 * new (supported) USB device is attached to the host computer that was not
	 * ignored by global filters
	 * ({@link org.virtualbox_4_2.IHost#getUSBDeviceFilters()}).
	 * 
	 * These filters are also activated when the machine is powered up. They are run
	 * against a list of all currently available USB devices (in states
	 * {@link org.virtualbox_4_2.USBDeviceState#Available},
	 * {@link org.virtualbox_4_2.USBDeviceState#Busy},
	 * {@link org.virtualbox_4_2.USBDeviceState#Held}) that were not previously
	 * ignored by global filters.
	 * 
	 * If at least one filter matches the USB device in question, this device is
	 * automatically captured (attached to) the virtual USB controller of this
	 * machine.
	 * 
	 * 
	 * @return List<org.virtualbox_4_2.IUSBDeviceFilter>
	 * 
	 * @see org.virtualbox_4_2.IUSBDeviceFilter
	 * @see org.virtualbox_4_2.IUSBController
	 * 
	 */
	public List<org.virtualbox_4_2.IUSBDeviceFilter> getDeviceFilters() {
		try {
			List<String> retVal = port.iusbControllerGetDeviceFilters(obj);
			return Helper.wrap(org.virtualbox_4_2.IUSBDeviceFilter.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IUSBController queryInterface(IUnknown obj) {
		return obj == null ? null : new IUSBController(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Creates a new USB device filter. All attributes except the filter name are
	 * set to empty (any match), <i>active</i> is false (the filter is not active).
	 * 
	 * The created filter can then be added to the list of filters using
	 * {@link #insertDeviceFilter(Long,org.virtualbox_4_2.IUSBDeviceFilter)}.
	 * 
	 * 
	 * @param name Filter name. See
	 *             {@link org.virtualbox_4_2.IUSBDeviceFilter#getName()} for more
	 *             info.
	 * 
	 * 
	 * @return Created filter object.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>The virtual machine is not mutable.</td>
	 *         <tr>
	 *         </table>
	 * 
	 * @see #getDeviceFilters()
	 * 
	 */
	public org.virtualbox_4_2.IUSBDeviceFilter createDeviceFilter(String name) {
		try {
			String retVal;
			retVal = port.iusbControllerCreateDeviceFilter(obj, name);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IUSBDeviceFilter(retVal, port) : null;
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
	 * Positions are numbered starting from <tt>0</tt>. If the specified position is
	 * equal to or greater than the number of elements in the list, the filter is
	 * added to the end of the collection.
	 * 
	 * 
	 * @param position Position to insert the filter to.
	 * 
	 * @param filter   USB device filter to insert.
	 * 
	 *                 Expected result codes:
	 *                 <table>
	 *                 <tr>
	 *                 <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                 VBOX_E_INVALID_VM_STATE</td>
	 *                 <td>Virtual machine is not mutable.</td>
	 *                 <tr>
	 *                 <tr>
	 *                 <td>E_INVALIDARG</td>
	 *                 <td>USB device filter not created within this VirtualBox
	 *                 instance.</td>
	 *                 <tr>
	 *                 <tr>
	 *                 <td>@link ::VBOX_E_INVALID_OBJECT_STATE
	 *                 VBOX_E_INVALID_OBJECT_STATE</td>
	 *                 <td>USB device filter already in list.</td>
	 *                 <tr>
	 *                 </table>
	 * 
	 *                 NOTE: Duplicates are not allowed, so an attempt to insert a
	 *                 filter that is already in the collection, will return an
	 *                 error.
	 * 
	 * 
	 * @see #getDeviceFilters()
	 * 
	 */
	public void insertDeviceFilter(Long position, org.virtualbox_4_2.IUSBDeviceFilter filter) {
		try {
			port.iusbControllerInsertDeviceFilter(obj, position, ((filter == null) ? null : filter.getWrapped()));
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
	 * Positions are numbered starting from <tt>0</tt>. Specifying a position equal
	 * to or greater than the number of elements in the list will produce an error.
	 * 
	 * 
	 * @param position Position to remove the filter from.
	 * 
	 * @return Removed USB device filter.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>Virtual machine is not mutable.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>USB device filter list empty or invalid position.</td>
	 *         <tr>
	 *         </table>
	 * 
	 * @see #getDeviceFilters()
	 * 
	 */
	public org.virtualbox_4_2.IUSBDeviceFilter removeDeviceFilter(Long position) {
		try {
			String retVal;
			retVal = port.iusbControllerRemoveDeviceFilter(obj, position);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IUSBDeviceFilter(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}


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
 * INetworkAdapter.java
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
 * Represents a virtual network adapter that is attached to a virtual machine.
 * Each virtual machine has a fixed number of network adapter slots with one
 * instance of this attached to each of them. Call
 * {@link org.virtualbox_4_2.IMachine#getNetworkAdapter(Long)} to get the
 * network adapter that is attached to a given slot in a given machine.
 * 
 * Each network adapter can be in one of five attachment modes, which are
 * represented by the {@link org.virtualbox_4_2.NetworkAttachmentType}
 * enumeration; see the {@link #getAttachmentType()} attribute.
 * 
 * Interface ID: <tt>{EFA0F965-63C7-4C60-AFDF-B1CC9943B9C0}</tt>
 */
public class INetworkAdapter extends IUnknown {

	public INetworkAdapter(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Type of the virtual network adapter. Depending on this value, VirtualBox will
	 * provide a different virtual network hardware to the guest.
	 * 
	 * @return org.virtualbox_4_2.NetworkAdapterType
	 * 
	 */
	public org.virtualbox_4_2.NetworkAdapterType getAdapterType() {
		try {
			org.virtualbox_4_2.jaxws.NetworkAdapterType retVal = port.iNetworkAdapterGetAdapterType(obj);
			return org.virtualbox_4_2.NetworkAdapterType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Type of the virtual network adapter. Depending on this value, VirtualBox will
	 * provide a different virtual network hardware to the guest.
	 * 
	 * @param value org.virtualbox_4_2.NetworkAdapterType
	 * 
	 */
	public void setAdapterType(org.virtualbox_4_2.NetworkAdapterType value) {
		try {
			port.iNetworkAdapterSetAdapterType(obj,
					org.virtualbox_4_2.jaxws.NetworkAdapterType.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Slot number this adapter is plugged into. Corresponds to the value you pass
	 * to {@link org.virtualbox_4_2.IMachine#getNetworkAdapter(Long)} to obtain this
	 * instance.
	 * 
	 * @return Long
	 * 
	 */
	public Long getSlot() {
		try {
			Long retVal = port.iNetworkAdapterGetSlot(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether the network adapter is present in the guest system. If disabled,
	 * the virtual guest hardware will not contain this network adapter. Can only be
	 * changed when the VM is not running.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getEnabled() {
		try {
			Boolean retVal = port.iNetworkAdapterGetEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether the network adapter is present in the guest system. If disabled,
	 * the virtual guest hardware will not contain this network adapter. Can only be
	 * changed when the VM is not running.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setEnabled(Boolean value) {
		try {
			port.iNetworkAdapterSetEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Ethernet MAC address of the adapter, 12 hexadecimal characters. When setting
	 * it to null or an empty string, VirtualBox will generate a unique MAC address.
	 * 
	 * @return String
	 * 
	 */
	public String getMACAddress() {
		try {
			String retVal = port.iNetworkAdapterGetMACAddress(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Ethernet MAC address of the adapter, 12 hexadecimal characters. When setting
	 * it to null or an empty string, VirtualBox will generate a unique MAC address.
	 * 
	 * @param value String
	 * 
	 */
	public void setMACAddress(String value) {
		try {
			port.iNetworkAdapterSetMACAddress(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets/Gets network attachment type of this network adapter.
	 * 
	 * @return org.virtualbox_4_2.NetworkAttachmentType
	 * 
	 */
	public org.virtualbox_4_2.NetworkAttachmentType getAttachmentType() {
		try {
			org.virtualbox_4_2.jaxws.NetworkAttachmentType retVal = port.iNetworkAdapterGetAttachmentType(obj);
			return org.virtualbox_4_2.NetworkAttachmentType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets/Gets network attachment type of this network adapter.
	 * 
	 * @param value org.virtualbox_4_2.NetworkAttachmentType
	 * 
	 */
	public void setAttachmentType(org.virtualbox_4_2.NetworkAttachmentType value) {
		try {
			port.iNetworkAdapterSetAttachmentType(obj,
					org.virtualbox_4_2.jaxws.NetworkAttachmentType.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the network interface the VM should be bridged to.
	 * 
	 * @return String
	 * 
	 */
	public String getBridgedInterface() {
		try {
			String retVal = port.iNetworkAdapterGetBridgedInterface(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the network interface the VM should be bridged to.
	 * 
	 * @param value String
	 * 
	 */
	public void setBridgedInterface(String value) {
		try {
			port.iNetworkAdapterSetBridgedInterface(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the host only network interface the VM is attached to.
	 * 
	 * @return String
	 * 
	 */
	public String getHostOnlyInterface() {
		try {
			String retVal = port.iNetworkAdapterGetHostOnlyInterface(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the host only network interface the VM is attached to.
	 * 
	 * @param value String
	 * 
	 */
	public void setHostOnlyInterface(String value) {
		try {
			port.iNetworkAdapterSetHostOnlyInterface(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the internal network the VM is attached to.
	 * 
	 * @return String
	 * 
	 */
	public String getInternalNetwork() {
		try {
			String retVal = port.iNetworkAdapterGetInternalNetwork(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the internal network the VM is attached to.
	 * 
	 * @param value String
	 * 
	 */
	public void setInternalNetwork(String value) {
		try {
			port.iNetworkAdapterSetInternalNetwork(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the NAT network the VM is attached to.
	 * 
	 * @return String
	 * 
	 */
	public String getNATNetwork() {
		try {
			String retVal = port.iNetworkAdapterGetNATNetwork(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the NAT network the VM is attached to.
	 * 
	 * @param value String
	 * 
	 */
	public void setNATNetwork(String value) {
		try {
			port.iNetworkAdapterSetNATNetwork(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the driver to use for the "Generic" network attachment type.
	 * 
	 * @return String
	 * 
	 */
	public String getGenericDriver() {
		try {
			String retVal = port.iNetworkAdapterGetGenericDriver(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the driver to use for the "Generic" network attachment type.
	 * 
	 * @param value String
	 * 
	 */
	public void setGenericDriver(String value) {
		try {
			port.iNetworkAdapterSetGenericDriver(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether the adapter reports the cable as connected or not. It can be
	 * used to report offline situations to a VM.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getCableConnected() {
		try {
			Boolean retVal = port.iNetworkAdapterGetCableConnected(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether the adapter reports the cable as connected or not. It can be
	 * used to report offline situations to a VM.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setCableConnected(Boolean value) {
		try {
			port.iNetworkAdapterSetCableConnected(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Line speed reported by custom drivers, in units of 1 kbps.
	 * 
	 * @return Long
	 * 
	 */
	public Long getLineSpeed() {
		try {
			Long retVal = port.iNetworkAdapterGetLineSpeed(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Line speed reported by custom drivers, in units of 1 kbps.
	 * 
	 * @param value Long
	 * 
	 */
	public void setLineSpeed(Long value) {
		try {
			port.iNetworkAdapterSetLineSpeed(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The promiscuous mode policy of the network adapter when attached to an
	 * internal network, host only network or a bridge.
	 * 
	 * @return org.virtualbox_4_2.NetworkAdapterPromiscModePolicy
	 * 
	 */
	public org.virtualbox_4_2.NetworkAdapterPromiscModePolicy getPromiscModePolicy() {
		try {
			org.virtualbox_4_2.jaxws.NetworkAdapterPromiscModePolicy retVal = port
					.iNetworkAdapterGetPromiscModePolicy(obj);
			return org.virtualbox_4_2.NetworkAdapterPromiscModePolicy.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The promiscuous mode policy of the network adapter when attached to an
	 * internal network, host only network or a bridge.
	 * 
	 * @param value org.virtualbox_4_2.NetworkAdapterPromiscModePolicy
	 * 
	 */
	public void setPromiscModePolicy(org.virtualbox_4_2.NetworkAdapterPromiscModePolicy value) {
		try {
			port.iNetworkAdapterSetPromiscModePolicy(obj,
					org.virtualbox_4_2.jaxws.NetworkAdapterPromiscModePolicy.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether network traffic from/to the network card should be traced. Can
	 * only be toggled when the VM is turned off.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getTraceEnabled() {
		try {
			Boolean retVal = port.iNetworkAdapterGetTraceEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether network traffic from/to the network card should be traced. Can
	 * only be toggled when the VM is turned off.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setTraceEnabled(Boolean value) {
		try {
			port.iNetworkAdapterSetTraceEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Filename where a network trace will be stored. If not set, VBox-pid.pcap will
	 * be used.
	 * 
	 * @return String
	 * 
	 */
	public String getTraceFile() {
		try {
			String retVal = port.iNetworkAdapterGetTraceFile(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Filename where a network trace will be stored. If not set, VBox-pid.pcap will
	 * be used.
	 * 
	 * @param value String
	 * 
	 */
	public void setTraceFile(String value) {
		try {
			port.iNetworkAdapterSetTraceFile(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Points to the NAT engine which handles the network address translation for
	 * this interface. This is active only when the interface actually uses NAT.
	 * 
	 * @return org.virtualbox_4_2.INATEngine
	 * 
	 */
	public org.virtualbox_4_2.INATEngine getNATEngine() {
		try {
			String retVal = port.iNetworkAdapterGetNATEngine(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.INATEngine(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Network boot priority of the adapter. Priority 1 is highest. If not set, the
	 * priority is considered to be at the lowest possible setting.
	 * 
	 * @return Long
	 * 
	 */
	public Long getBootPriority() {
		try {
			Long retVal = port.iNetworkAdapterGetBootPriority(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Network boot priority of the adapter. Priority 1 is highest. If not set, the
	 * priority is considered to be at the lowest possible setting.
	 * 
	 * @param value Long
	 * 
	 */
	public void setBootPriority(Long value) {
		try {
			port.iNetworkAdapterSetBootPriority(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * The bandwidth group this network adapter is assigned to.
	 * 
	 * @return org.virtualbox_4_2.IBandwidthGroup
	 * 
	 */
	public org.virtualbox_4_2.IBandwidthGroup getBandwidthGroup() {
		try {
			String retVal = port.iNetworkAdapterGetBandwidthGroup(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IBandwidthGroup(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * The bandwidth group this network adapter is assigned to.
	 * 
	 * @param value org.virtualbox_4_2.IBandwidthGroup
	 * 
	 */
	public void setBandwidthGroup(org.virtualbox_4_2.IBandwidthGroup value) {
		try {
			port.iNetworkAdapterSetBandwidthGroup(obj, ((value == null) ? null : value.getWrapped()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static INetworkAdapter queryInterface(IUnknown obj) {
		return obj == null ? null : new INetworkAdapter(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Returns the value of the network attachment property with the given name.
	 * 
	 * If the requested data key does not exist, this function will succeed and
	 * return an empty string in the value argument.
	 * 
	 * 
	 * @param key Name of the property to get.
	 * 
	 * @return Current property value.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>name is null or empty.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public String getProperty(String key) {
		try {
			String retVal;
			retVal = port.iNetworkAdapterGetProperty(obj, key);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets the value of the network attachment property with the given name.
	 * 
	 * Setting the property value to null or an empty string is equivalent to
	 * deleting the existing value.
	 * 
	 * 
	 * @param key   Name of the property to set.
	 * 
	 * @param value Property value to set.
	 * 
	 *              Expected result codes:
	 *              <table>
	 *              <tr>
	 *              <td>E_INVALIDARG</td>
	 *              <td>name is null or empty.</td>
	 *              <tr>
	 *              </table>
	 * 
	 */
	public void setProperty(String key, String value) {
		try {
			port.iNetworkAdapterSetProperty(obj, key, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns values for a group of properties in one call.
	 * 
	 * The names of the properties to get are specified using the names argument
	 * which is a list of comma-separated property names or an empty string if all
	 * properties are to be returned.
	 * 
	 * 
	 * The method returns two arrays, the array of property names corresponding to
	 * the names argument and the current values of these properties. Both arrays
	 * have the same number of elements with each element at the given index in the
	 * first array corresponds to an element at the same index in the second array.
	 * 
	 * @param names       Names of properties to get.
	 * 
	 * 
	 * @param returnNames Names of returned properties.
	 * 
	 * @return Values of returned properties.
	 * 
	 *         NOTE: Currently the value of this argument is ignored and the method
	 *         always returns all existing properties.
	 * 
	 */
	public List<String> getProperties(String names, Holder<List<String>> returnNames) {
		try {
			javax.xml.ws.Holder<List<String>> tmp_returnNames = new javax.xml.ws.Holder<List<String>>();
			javax.xml.ws.Holder<List<String>> retVal = new javax.xml.ws.Holder<List<String>>();
			port.iNetworkAdapterGetProperties(obj, names, tmp_returnNames, retVal);
			returnNames.value = tmp_returnNames.value;
			return retVal.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}


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
 * IHostNetworkInterface.java
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
 * Represents one of host's network interfaces. IP V6 address and network mask
 * are strings of 32 hexdecimal digits grouped by four. Groups are separated by
 * colons. For example, fe80:0000:0000:0000:021e:c2ff:fed2:b030.
 * 
 * Interface ID: <tt>{87A4153D-6889-4DD6-9654-2E9FF0AE8DEC}</tt>
 */
public class IHostNetworkInterface extends IUnknown {

	public IHostNetworkInterface(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * Returns the host network interface name.
	 * 
	 * @return String
	 * 
	 */
	public String getName() {
		try {
			String retVal = port.iHostNetworkInterfaceGetName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the interface UUID.
	 * 
	 * @return String
	 * 
	 */
	public String getId() {
		try {
			String retVal = port.iHostNetworkInterfaceGetId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the name of a virtual network the interface gets attached to.
	 * 
	 * @return String
	 * 
	 */
	public String getNetworkName() {
		try {
			String retVal = port.iHostNetworkInterfaceGetNetworkName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Specifies whether the DHCP is enabled for the interface.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getDHCPEnabled() {
		try {
			Boolean retVal = port.iHostNetworkInterfaceGetDHCPEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the IP V4 address of the interface.
	 * 
	 * @return String
	 * 
	 */
	public String getIPAddress() {
		try {
			String retVal = port.iHostNetworkInterfaceGetIPAddress(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the network mask of the interface.
	 * 
	 * @return String
	 * 
	 */
	public String getNetworkMask() {
		try {
			String retVal = port.iHostNetworkInterfaceGetNetworkMask(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Specifies whether the IP V6 is supported/enabled for the interface.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getIPV6Supported() {
		try {
			Boolean retVal = port.iHostNetworkInterfaceGetIPV6Supported(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the IP V6 address of the interface.
	 * 
	 * @return String
	 * 
	 */
	public String getIPV6Address() {
		try {
			String retVal = port.iHostNetworkInterfaceGetIPV6Address(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the length IP V6 network mask prefix of the interface.
	 * 
	 * @return Long
	 * 
	 */
	public Long getIPV6NetworkMaskPrefixLength() {
		try {
			Long retVal = port.iHostNetworkInterfaceGetIPV6NetworkMaskPrefixLength(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the hardware address. For Ethernet it is MAC address.
	 * 
	 * @return String
	 * 
	 */
	public String getHardwareAddress() {
		try {
			String retVal = port.iHostNetworkInterfaceGetHardwareAddress(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Type of protocol encapsulation used.
	 * 
	 * @return org.virtualbox_4_2.HostNetworkInterfaceMediumType
	 * 
	 */
	public org.virtualbox_4_2.HostNetworkInterfaceMediumType getMediumType() {
		try {
			org.virtualbox_4_2.jaxws.HostNetworkInterfaceMediumType retVal = port
					.iHostNetworkInterfaceGetMediumType(obj);
			return org.virtualbox_4_2.HostNetworkInterfaceMediumType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Status of the interface.
	 * 
	 * @return org.virtualbox_4_2.HostNetworkInterfaceStatus
	 * 
	 */
	public org.virtualbox_4_2.HostNetworkInterfaceStatus getStatus() {
		try {
			org.virtualbox_4_2.jaxws.HostNetworkInterfaceStatus retVal = port.iHostNetworkInterfaceGetStatus(obj);
			return org.virtualbox_4_2.HostNetworkInterfaceStatus.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * specifies the host interface type.
	 * 
	 * @return org.virtualbox_4_2.HostNetworkInterfaceType
	 * 
	 */
	public org.virtualbox_4_2.HostNetworkInterfaceType getInterfaceType() {
		try {
			org.virtualbox_4_2.jaxws.HostNetworkInterfaceType retVal = port.iHostNetworkInterfaceGetInterfaceType(obj);
			return org.virtualbox_4_2.HostNetworkInterfaceType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IHostNetworkInterface queryInterface(IUnknown obj) {
		return obj == null ? null : new IHostNetworkInterface(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * sets and enables the static IP V4 configuration for the given interface.
	 * 
	 * @param IPAddress   IP address.
	 * 
	 * 
	 * @param networkMask network mask.
	 * 
	 * 
	 */
	public void enableStaticIPConfig(String IPAddress, String networkMask) {
		try {
			port.iHostNetworkInterfaceEnableStaticIPConfig(obj, IPAddress, networkMask);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * sets and enables the static IP V6 configuration for the given interface.
	 * 
	 * @param IPV6Address                 IP address.
	 * 
	 * 
	 * @param IPV6NetworkMaskPrefixLength network mask.
	 * 
	 * 
	 */
	public void enableStaticIPConfigV6(String IPV6Address, Long IPV6NetworkMaskPrefixLength) {
		try {
			port.iHostNetworkInterfaceEnableStaticIPConfigV6(obj, IPV6Address, IPV6NetworkMaskPrefixLength);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * enables the dynamic IP configuration.
	 */
	public void enableDynamicIPConfig() {
		try {
			port.iHostNetworkInterfaceEnableDynamicIPConfig(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * refreshes the IP configuration for DHCP-enabled interface.
	 */
	public void DHCPRediscover() {
		try {
			port.iHostNetworkInterfaceDHCPRediscover(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

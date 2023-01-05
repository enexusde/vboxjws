
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
 * IDHCPServer.java
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
 * The IDHCPServer interface represents the vbox DHCP server configuration.
 * 
 * To enumerate all the DHCP servers on the host, use the
 * {@link org.virtualbox_4_2.IVirtualBox#getDHCPServers()} attribute.
 * 
 * Interface ID: <tt>{6CFE387C-74FB-4CA7-BFF6-973BEC8AF7A3}</tt>
 */
public class IDHCPServer extends IUnknown {

	public IDHCPServer(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * specifies if the DHCP server is enabled
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getEnabled() {
		try {
			Boolean retVal = port.idhcpServerGetEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * specifies if the DHCP server is enabled
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setEnabled(Boolean value) {
		try {
			port.idhcpServerSetEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * specifies server IP
	 * 
	 * @return String
	 * 
	 */
	public String getIPAddress() {
		try {
			String retVal = port.idhcpServerGetIPAddress(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * specifies server network mask
	 * 
	 * @return String
	 * 
	 */
	public String getNetworkMask() {
		try {
			String retVal = port.idhcpServerGetNetworkMask(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * specifies internal network name the server is used for
	 * 
	 * @return String
	 * 
	 */
	public String getNetworkName() {
		try {
			String retVal = port.idhcpServerGetNetworkName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * specifies from IP address in server address range
	 * 
	 * @return String
	 * 
	 */
	public String getLowerIP() {
		try {
			String retVal = port.idhcpServerGetLowerIP(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * specifies to IP address in server address range
	 * 
	 * @return String
	 * 
	 */
	public String getUpperIP() {
		try {
			String retVal = port.idhcpServerGetUpperIP(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IDHCPServer queryInterface(IUnknown obj) {
		return obj == null ? null : new IDHCPServer(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * configures the server
	 * 
	 * @param IPAddress     server IP address
	 * 
	 * 
	 * @param networkMask   server network mask
	 * 
	 * 
	 * @param FromIPAddress server From IP address for address range
	 * 
	 * 
	 * @param ToIPAddress   server To IP address for address range
	 * 
	 * 
	 *                      Expected result codes:
	 *                      <table>
	 *                      <tr>
	 *                      <td>E_INVALIDARG</td>
	 *                      <td>invalid configuration supplied</td>
	 *                      <tr>
	 *                      </table>
	 * 
	 */
	public void setConfiguration(String IPAddress, String networkMask, String FromIPAddress, String ToIPAddress) {
		try {
			port.idhcpServerSetConfiguration(obj, IPAddress, networkMask, FromIPAddress, ToIPAddress);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Starts DHCP server process.
	 * 
	 * @param networkName Name of internal network DHCP server should attach to.
	 * 
	 * 
	 * @param trunkName   Name of internal network trunk.
	 * 
	 * 
	 * @param trunkType   Type of internal network trunk.
	 * 
	 * 
	 *                    Expected result codes:
	 *                    <table>
	 *                    <tr>
	 *                    <td>E_FAIL</td>
	 *                    <td>Failed to start the process.</td>
	 *                    <tr>
	 *                    </table>
	 * 
	 */
	public void start(String networkName, String trunkName, String trunkType) {
		try {
			port.idhcpServerStart(obj, networkName, trunkName, trunkType);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Stops DHCP server process.
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>E_FAIL</td>
	 * <td>Failed to stop the process.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public void stop() {
		try {
			port.idhcpServerStop(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

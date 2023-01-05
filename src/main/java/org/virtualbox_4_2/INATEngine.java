
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
 * INATEngine.java
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
 * Interface for managing a NAT engine which is used with a virtual machine.
 * This allows for changing NAT behavior such as port-forwarding rules. This
 * interface is used in the
 * {@link org.virtualbox_4_2.INetworkAdapter#getNATEngine()} attribute.
 * Interface ID: <tt>{26451B99-3B2D-4DCB-8E4B-D63654218175}</tt>
 */
public class INATEngine extends IUnknown {

	public INATEngine(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * The network attribute of the NAT engine (the same value is used with built-in
	 * DHCP server to fill corresponding fields of DHCP leases).
	 * 
	 * @return String
	 * 
	 */
	public String getNetwork() {
		try {
			String retVal = port.inatEngineGetNetwork(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * The network attribute of the NAT engine (the same value is used with built-in
	 * DHCP server to fill corresponding fields of DHCP leases).
	 * 
	 * @param value String
	 * 
	 */
	public void setNetwork(String value) {
		try {
			port.inatEngineSetNetwork(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * IP of host interface to bind all opened sockets to.
	 * 
	 * NOTE: Changing this does not change binding of port forwarding.
	 * 
	 * @return String
	 * 
	 */
	public String getHostIP() {
		try {
			String retVal = port.inatEngineGetHostIP(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * IP of host interface to bind all opened sockets to.
	 * 
	 * NOTE: Changing this does not change binding of port forwarding.
	 * 
	 * @param value String
	 * 
	 */
	public void setHostIP(String value) {
		try {
			port.inatEngineSetHostIP(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * TFTP prefix attribute which is used with the built-in DHCP server to fill the
	 * corresponding fields of DHCP leases.
	 * 
	 * @return String
	 * 
	 */
	public String getTFTPPrefix() {
		try {
			String retVal = port.inatEngineGetTFTPPrefix(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * TFTP prefix attribute which is used with the built-in DHCP server to fill the
	 * corresponding fields of DHCP leases.
	 * 
	 * @param value String
	 * 
	 */
	public void setTFTPPrefix(String value) {
		try {
			port.inatEngineSetTFTPPrefix(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * TFTP boot file attribute which is used with the built-in DHCP server to fill
	 * the corresponding fields of DHCP leases.
	 * 
	 * @return String
	 * 
	 */
	public String getTFTPBootFile() {
		try {
			String retVal = port.inatEngineGetTFTPBootFile(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * TFTP boot file attribute which is used with the built-in DHCP server to fill
	 * the corresponding fields of DHCP leases.
	 * 
	 * @param value String
	 * 
	 */
	public void setTFTPBootFile(String value) {
		try {
			port.inatEngineSetTFTPBootFile(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * TFTP server attribute which is used with the built-in DHCP server to fill the
	 * corresponding fields of DHCP leases.
	 * 
	 * NOTE: The preferred form is IPv4 addresses.
	 * 
	 * @return String
	 * 
	 */
	public String getTFTPNextServer() {
		try {
			String retVal = port.inatEngineGetTFTPNextServer(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * TFTP server attribute which is used with the built-in DHCP server to fill the
	 * corresponding fields of DHCP leases.
	 * 
	 * NOTE: The preferred form is IPv4 addresses.
	 * 
	 * @param value String
	 * 
	 */
	public void setTFTPNextServer(String value) {
		try {
			port.inatEngineSetTFTPNextServer(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * @return Long
	 * 
	 */
	public Long getAliasMode() {
		try {
			Long retVal = port.inatEngineGetAliasMode(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * @param value Long
	 * 
	 */
	public void setAliasMode(Long value) {
		try {
			port.inatEngineSetAliasMode(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Whether the DHCP server should pass the DNS domain used by the host.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getDNSPassDomain() {
		try {
			Boolean retVal = port.inatEngineGetDNSPassDomain(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Whether the DHCP server should pass the DNS domain used by the host.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setDNSPassDomain(Boolean value) {
		try {
			port.inatEngineSetDNSPassDomain(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Whether the DHCP server (and the DNS traffic by NAT) should pass the address
	 * of the DNS proxy and process traffic using DNS servers registered on the
	 * host.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getDNSProxy() {
		try {
			Boolean retVal = port.inatEngineGetDNSProxy(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Whether the DHCP server (and the DNS traffic by NAT) should pass the address
	 * of the DNS proxy and process traffic using DNS servers registered on the
	 * host.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setDNSProxy(Boolean value) {
		try {
			port.inatEngineSetDNSProxy(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Whether the DHCP server (and the DNS traffic by NAT) should pass the address
	 * of the DNS proxy and process traffic using the host resolver mechanism.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getDNSUseHostResolver() {
		try {
			Boolean retVal = port.inatEngineGetDNSUseHostResolver(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Whether the DHCP server (and the DNS traffic by NAT) should pass the address
	 * of the DNS proxy and process traffic using the host resolver mechanism.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setDNSUseHostResolver(Boolean value) {
		try {
			port.inatEngineSetDNSUseHostResolver(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Array of NAT port-forwarding rules in string representation, in the following
	 * format: "name,protocol id,host ip,host port,guest ip,guest port".
	 * 
	 * @return List<String>
	 * 
	 */
	public List<String> getRedirects() {
		try {
			List<String> retVal = port.inatEngineGetRedirects(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static INATEngine queryInterface(IUnknown obj) {
		return obj == null ? null : new INATEngine(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * Sets network configuration of the NAT engine.
	 * 
	 * @param mtu       MTU (maximum transmission unit) of the NAT engine in bytes.
	 * 
	 * @param sockSnd   Capacity of the socket send buffer in bytes when creating a
	 *                  new socket.
	 * 
	 * @param sockRcv   Capacity of the socket receive buffer in bytes when creating
	 *                  a new socket.
	 * 
	 * @param TcpWndSnd Initial size of the NAT engine's sending TCP window in bytes
	 *                  when establishing a new TCP connection.
	 * 
	 * @param TcpWndRcv Initial size of the NAT engine's receiving TCP window in
	 *                  bytes when establishing a new TCP connection.
	 * 
	 */
	public void setNetworkSettings(Long mtu, Long sockSnd, Long sockRcv, Long TcpWndSnd, Long TcpWndRcv) {
		try {
			port.inatEngineSetNetworkSettings(obj, mtu, sockSnd, sockRcv, TcpWndSnd, TcpWndRcv);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns network configuration of NAT engine. See
	 * {@link #setNetworkSettings(Long,Long,Long,Long,Long)} for parameter
	 * descriptions.
	 */
	public void getNetworkSettings(Holder<Long> mtu, Holder<Long> sockSnd, Holder<Long> sockRcv, Holder<Long> TcpWndSnd,
			Holder<Long> TcpWndRcv) {
		try {
			javax.xml.ws.Holder<Long> tmp_mtu = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_sockSnd = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_sockRcv = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_TcpWndSnd = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_TcpWndRcv = new javax.xml.ws.Holder<Long>();
			port.inatEngineGetNetworkSettings(obj, tmp_mtu, tmp_sockSnd, tmp_sockRcv, tmp_TcpWndSnd, tmp_TcpWndRcv);
			mtu.value = tmp_mtu.value;
			sockSnd.value = tmp_sockSnd.value;
			sockRcv.value = tmp_sockRcv.value;
			TcpWndSnd.value = tmp_TcpWndSnd.value;
			TcpWndRcv.value = tmp_TcpWndRcv.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Adds a new NAT port-forwarding rule.
	 * 
	 * @param name      The name of the rule. An empty name is acceptable, in which
	 *                  case the NAT engine auto-generates one using the other
	 *                  parameters.
	 * 
	 * @param proto     Protocol handled with the rule.
	 * 
	 * @param hostIP    IP of the host interface to which the rule should apply. An
	 *                  empty ip address is acceptable, in which case the NAT engine
	 *                  binds the handling socket to any interface.
	 * 
	 * @param hostPort  The port number to listen on.
	 * 
	 * @param guestIP   The IP address of the guest which the NAT engine will
	 *                  forward matching packets to. An empty IP address is
	 *                  acceptable, in which case the NAT engine will forward
	 *                  packets to the first DHCP lease (x.x.x.15).
	 * 
	 * @param guestPort The port number to forward.
	 * 
	 */
	public void addRedirect(String name, org.virtualbox_4_2.NATProtocol proto, String hostIP, Integer hostPort,
			String guestIP, Integer guestPort) {
		try {
			port.inatEngineAddRedirect(obj, name, org.virtualbox_4_2.jaxws.NATProtocol.fromValue(proto.name()), hostIP,
					hostPort, guestIP, guestPort);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Removes a port-forwarding rule that was previously registered.
	 * 
	 * @param name The name of the rule to delete.
	 * 
	 */
	public void removeRedirect(String name) {
		try {
			port.inatEngineRemoveRedirect(obj, name);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

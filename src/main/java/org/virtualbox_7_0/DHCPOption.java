
/*
 * Copyright (C) 2010-2022 Oracle and/or its affiliates.
 *
 * This file is part of a free software library; you can redistribute
 * it and/or modify it under the terms of the GNU Lesser General
 * Public License version 2.1 as published by the Free Software
 * Foundation and shipped in the \"COPYING.LIB\" file with this library.
 * The library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY of any kind.
 *
 * Oracle LGPL Disclaimer: For the avoidance of doubt, except that if
 * any license choice other than GPL or LGPL is available it will
 * apply instead, Oracle elects to use only the Lesser General Public
 * License version 2.1 (LGPLv2) at this time for any software where
 * a choice of LGPL license versions is made available with the
 * language indicating that LGPLv2 or any later version may be used,
 * or where a choice of which version of the LGPL is applied is
 * otherwise unspecified.

 * http://www.virtualbox.org.  This library is free software; you can
 * redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, in version 2.1
 * as it comes in the "COPYING.LIB" file of the VirtualBox SDK distribution.
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 * License for more details.
 *
 * SPDX-License-Identifier: LGPL-2.1-only
 */

/*
 * DHCPOption.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;
public enum DHCPOption
{

/**
IPv4 netmask. Set to{@link org.virtualbox_7_0.IDHCPServer#getNetworkMask()}by default.
*/
    SubnetMask(1),

/**
UTC offset in seconds (32-bit decimal value).
*/
    TimeOffset(2),

/**
Space separated list of IPv4 router addresses.
*/
    Routers(3),

/**
Space separated list of IPv4 time server (RFC 868) addresses.
*/
    TimeServers(4),

/**
Space separated list of IPv4 name server (IEN 116) addresses.
*/
    NameServers(5),

/**
Space separated list of IPv4 DNS addresses.
*/
    DomainNameServers(6),

/**
Space separated list of IPv4 log server addresses.
*/
    LogServers(7),

/**
Space separated list of IPv4 cookie server (RFC 865) addresses.
*/
    CookieServers(8),

/**
Space separated list of IPv4 line printer server (RFC 1179) addresses.
*/
    LPRServers(9),

/**
Space separated list of IPv4 imagen impress server addresses.
*/
    ImpressServers(10),

/**
Space separated list of IPv4 resource location (RFC 887) addresses.
*/
    ResourseLocationServers(11),

/**
The client name. See RFC 1035 for character limits.
*/
    HostName(12),

/**
Number of 512 byte blocks making up the boot file (16-bit decimal value).
*/
    BootFileSize(13),

/**
Client core file.
*/
    MeritDumpFile(14),

/**
Domain name for the client.
*/
    DomainName(15),

/**
IPv4 address of the swap server that the client should use.
*/
    SwapServer(16),

/**
The path to the root disk the client should use.
*/
    RootPath(17),

/**
Path to a file containing additional DHCP options (RFC2123).
*/
    ExtensionPath(18),

/**
Whether IP forwarding should be enabled by the client (boolean).
*/
    IPForwarding(19),

/**
Whether non-local datagrams should be forwarded by the client (boolean)
*/
    OptNonLocalSourceRouting(20),

/**
List of IPv4 addresses and masks paris controlling non-local source routing.
*/
    PolicyFilter(21),

/**
The maximum datagram size the client should reassemble (16-bit decimal value).
*/
    MaxDgramReassemblySize(22),

/**
The default time-to-leave on outgoing (IP) datagrams (8-bit decimal value).
*/
    DefaultIPTTL(23),

/**
RFC1191 path MTU discovery timeout value in seconds (32-bit decimal value).
*/
    PathMTUAgingTimeout(24),

/**
RFC1191 path MTU discovery size table, sorted in ascending order (list of 16-bit decimal values).
*/
    PathMTUPlateauTable(25),

/**
The MTU size for the interface (16-bit decimal value).
*/
    InterfaceMTU(26),

/**
Indicates whether the MTU size is the same for all subnets (boolean).
*/
    AllSubnetsAreLocal(27),

/**
Broadcast address (RFC1122) for the client to use (IPv4 address).
*/
    BroadcastAddress(28),

/**
Whether to perform subnet mask discovery via ICMP (boolean).
*/
    PerformMaskDiscovery(29),

/**
Whether to respond to subnet mask requests via ICMP (boolean).
*/
    MaskSupplier(30),

/**
Whether to perform router discovery (RFC1256) (boolean).
*/
    PerformRouterDiscovery(31),

/**
Where to send router solicitation requests (RFC1256) (IPv4 address).
*/
    RouterSolicitationAddress(32),

/**
List of network and router address pairs addresses.
*/
    StaticRoute(33),

/**
Whether to negotiate the use of trailers for ARP (RTF893) (boolean).
*/
    TrailerEncapsulation(34),

/**
The timeout in seconds for ARP cache entries (32-bit decimal value).
*/
    ARPCacheTimeout(35),

/**
Whether to use IEEE 802.3 (RTF1042) rather than of v2 (RFC894) ethernet encapsulation (boolean).
*/
    EthernetEncapsulation(36),

/**
Default time-to-live for TCP sends (non-zero 8-bit decimal value).
*/
    TCPDefaultTTL(37),

/**
The interface in seconds between TCP keepalive messages (32-bit decimal value).
*/
    TCPKeepaliveInterval(38),

/**
Whether to include a byte of garbage in TCP keepalive messages for backward compatibility (boolean).
*/
    TCPKeepaliveGarbage(39),

/**
The NIS (Sun Network Information Services) domain name (string).
*/
    NISDomain(40),

/**
Space separated list of IPv4 NIS server addresses.
*/
    NISServers(41),

/**
Space separated list of IPv4 NTP (RFC1035) server addresses.
*/
    NTPServers(42),

/**
Vendor specific information. Only accessible using{@link org.virtualbox_7_0.DHCPOptionEncoding#Hex}.
*/
    VendorSpecificInfo(43),

/**
Space separated list of IPv4 NetBIOS name server (NBNS) addresses (RFC1001,RFC1002).
*/
    NetBIOSNameServers(44),

/**
Space separated list of IPv4 NetBIOS datagram distribution server (NBDD) addresses (RFC1001,RFC1002).
*/
    NetBIOSDatagramServers(45),

/**
NetBIOS node type (RFC1001,RFC1002): 1=B-node, 2=P-node, 4=M-node, and 8=H-node (8-bit decimal value).
*/
    NetBIOSNodeType(46),

/**
NetBIOS scope (RFC1001,RFC1002). Only accessible using{@link org.virtualbox_7_0.DHCPOptionEncoding#Hex}.
*/
    NetBIOSScope(47),

/**
Space separated list of IPv4 X windows font server addresses.
*/
    XWindowsFontServers(48),

/**
Space separated list of IPv4 X windows display manager addresses.
*/
    XWindowsDisplayManager(49),

/**
Netware IP domain name (RFC2242) (string).
*/
    NetWareIPDomainName(62),

/**
Netware IP information (RFC2242). Only accessible using{@link org.virtualbox_7_0.DHCPOptionEncoding#Hex}.
*/
    NetWareIPInformation(63),

/**
The NIS+ domain name (string).
*/
    NISPlusDomain(64),

/**
Space separated list of IPv4 NIS+ server addresses.
*/
    NISPlusServers(65),

/**
TFTP server name (string).
*/
    TFTPServerName(66),

/**
Bootfile name (string).
*/
    BootfileName(67),

/**
Space separated list of IPv4 mobile IP agent addresses.
*/
    MobileIPHomeAgents(68),

/**
Space separated list of IPv4 simple mail transport protocol (SMPT) server addresses.
*/
    SMTPServers(69),

/**
Space separated list of IPv4 post office protocol 3 (POP3) server addresses.
*/
    POP3Servers(70),

/**
Space separated list of IPv4 network news transport protocol (NTTP) server addresses.
*/
    NNTPServers(71),

/**
Space separated list of default IPv4 world wide web (WWW) server addresses.
*/
    WWWServers(72),

/**
Space separated list of default IPv4 finger server addresses.
*/
    FingerServers(73),

/**
Space separated list of default IPv4 internet relay chat (IRC) server  addresses.
*/
    IRCServers(74),

/**
Space separated list of IPv4 StreetTalk server addresses.
*/
    StreetTalkServers(75),

/**
Space separated list of IPv4 StreetTalk directory assistance (STDA) server addresses.
*/
    STDAServers(76),

/**
Addresses of one or more service location protocol (SLP) directory agent, and an indicator of whether their use is mandatory. Only accessible using{@link org.virtualbox_7_0.DHCPOptionEncoding#Hex}.
*/
    SLPDirectoryAgent(78),

/**
List of service scopes for the service location protocol (SLP) and whether using the list is mandator. Only accessible using{@link org.virtualbox_7_0.DHCPOptionEncoding#Hex}.
*/
    SLPServiceScope(79),

/**
Domain search list, see RFC3397 and section 4.1.4 in RFC1035 for encoding.  Only accessible using{@link org.virtualbox_7_0.DHCPOptionEncoding#Hex}.
*/
    DomainSearch(119);

    private final int value;

    DHCPOption(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static DHCPOption fromValue(long v)
    {
        for (DHCPOption c: DHCPOption.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static DHCPOption fromValue(String v)
    {
        return valueOf(DHCPOption.class, v);
    }
}


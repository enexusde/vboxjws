
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
 * INATNetwork.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;
import java.util.List;

public class INATNetwork extends IUnknown
{

    public INATNetwork(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
TBD: the idea, technically we can start any number of the NAT networks,
but we should expect that at some point we will get collisions because of
port-forwanding rules. so perhaps we should support only single instance of NAT
network.
@return String
*/
    public String getNetworkName()
    {
        try
        {
            String retVal = port.inatNetworkGetNetworkName(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
TBD: the idea, technically we can start any number of the NAT networks,
but we should expect that at some point we will get collisions because of
port-forwanding rules. so perhaps we should support only single instance of NAT
network.
@param value String

*/
    public void setNetworkName(String value)
    {
        try
        {
        port.inatNetworkSetNetworkName(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public Boolean getEnabled()
    {
        try
        {
            Boolean retVal = port.inatNetworkGetEnabled(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public void setEnabled(Boolean value)
    {
        try
        {
        port.inatNetworkSetEnabled(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
This is CIDR IPv4 string. Specifying it user defines IPv4 addresses
of gateway (low address + 1) and DHCP server (= low address + 2).
Note: If there are defined IPv4 port-forward rules update of network
will be ignored (because new assignment could break existing rules).
@return String
*/
    public String getNetwork()
    {
        try
        {
            String retVal = port.inatNetworkGetNetwork(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
This is CIDR IPv4 string. Specifying it user defines IPv4 addresses
of gateway (low address + 1) and DHCP server (= low address + 2).
Note: If there are defined IPv4 port-forward rules update of network
will be ignored (because new assignment could break existing rules).
@param value String

*/
    public void setNetwork(String value)
    {
        try
        {
        port.inatNetworkSetNetwork(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
This attribute is read-only. It's recalculated on changing
network attribute (low address of network + 1).
@return String
*/
    public String getGateway()
    {
        try
        {
            String retVal = port.inatNetworkGetGateway(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
This attribute define whether gateway will support IPv6 or not.
@return Boolean
*/
    public Boolean getIPv6Enabled()
    {
        try
        {
            Boolean retVal = port.inatNetworkGetIPv6Enabled(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
This attribute define whether gateway will support IPv6 or not.
@param value Boolean

*/
    public void setIPv6Enabled(Boolean value)
    {
        try
        {
        port.inatNetworkSetIPv6Enabled(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
This a CIDR IPv6 defining prefix for link-local addresses
autoconfiguration within network. Note: ignored if attribute
IPv6Enabled is false.
@return String
*/
    public String getIPv6Prefix()
    {
        try
        {
            String retVal = port.inatNetworkGetIPv6Prefix(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
This a CIDR IPv6 defining prefix for link-local addresses
autoconfiguration within network. Note: ignored if attribute
IPv6Enabled is false.
@param value String

*/
    public void setIPv6Prefix(String value)
    {
        try
        {
        port.inatNetworkSetIPv6Prefix(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public Boolean getAdvertiseDefaultIPv6RouteEnabled()
    {
        try
        {
            Boolean retVal = port.inatNetworkGetAdvertiseDefaultIPv6RouteEnabled(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public void setAdvertiseDefaultIPv6RouteEnabled(Boolean value)
    {
        try
        {
        port.inatNetworkSetAdvertiseDefaultIPv6RouteEnabled(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public Boolean getNeedDhcpServer()
    {
        try
        {
            Boolean retVal = port.inatNetworkGetNeedDhcpServer(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public void setNeedDhcpServer(Boolean value)
    {
        try
        {
        port.inatNetworkSetNeedDhcpServer(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public org.virtualbox_7_0.IEventSource getEventSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.inatNetworkGetEventSource(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IEventSource(retVal, getObjMgr(), port) : null;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        finally
        {
            getObjMgr().allowObjRelease();
        }
    }

/**
Array of NAT port-forwarding rules in string representation,
in the following format:
"name:protocolid:[host ip]:host port:[guest ip]:guest port".
@return List&lt;String&gt;
*/
    public List<String> getPortForwardRules4()
    {
        try
        {
            List<String> retVal = port.inatNetworkGetPortForwardRules4(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Array of mappings (address,offset),e.g. ("127.0.1.1=4") maps 127.0.1.1 to networkid + 4.
@return List&lt;String&gt;
*/
    public List<String> getLocalMappings()
    {
        try
        {
            List<String> retVal = port.inatNetworkGetLocalMappings(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Offset in ipv6 network from network id for address mapped into loopback6 interface of the host.
@return Integer
*/
    public Integer getLoopbackIp6()
    {
        try
        {
            Integer retVal = port.inatNetworkGetLoopbackIp6(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Offset in ipv6 network from network id for address mapped into loopback6 interface of the host.
@param value Integer

*/
    public void setLoopbackIp6(Integer value)
    {
        try
        {
        port.inatNetworkSetLoopbackIp6(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Array of NAT port-forwarding rules in string representation, in the
following format: "name:protocolid:[host ip]:host port:[guest ip]:guest port".
@return List&lt;String&gt;
*/
    public List<String> getPortForwardRules6()
    {
        try
        {
            List<String> retVal = port.inatNetworkGetPortForwardRules6(obj);
            return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public static INATNetwork queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new INATNetwork(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**

*/
    public void addLocalMapping(String hostid, Integer offset)
    {
        try
        {
        port.inatNetworkAddLocalMapping(obj, hostid, offset);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public void addPortForwardRule(Boolean isIpv6, String ruleName, org.virtualbox_7_0.NATProtocol proto, String hostIP, Integer hostPort, String guestIP, Integer guestPort)
    {
        try
        {
        port.inatNetworkAddPortForwardRule(obj, isIpv6, ruleName, org.virtualbox_7_0.jaxws.NATProtocol.fromValue(proto.name()), hostIP, hostPort, guestIP, guestPort);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public void removePortForwardRule(Boolean isIpv6, String ruleName)
    {
        try
        {
        port.inatNetworkRemovePortForwardRule(obj, isIpv6, ruleName);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public void start()
    {
        try
        {
        port.inatNetworkStart(obj);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public void stop()
    {
        try
        {
        port.inatNetworkStop(obj);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
}

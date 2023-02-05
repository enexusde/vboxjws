
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
 * IHostNetworkInterface.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;
import java.util.List;


/**
Represents one of host's network interfaces. IP V6 address and network
mask are strings of 32 hexadecimal digits grouped by four. Groups are
separated by colons.
For example, fe80:0000:0000:0000:021e:c2ff:fed2:b030.

Interface ID: <code>{455F8C45-44A0-A470-BA20-27890B96DBA9}</code>
*/
public class IHostNetworkInterface extends IUnknown
{

    public IHostNetworkInterface(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Returns the host network interface name.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iHostNetworkInterfaceGetName(obj);
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
Returns the host network interface short name.
@return String
*/
    public String getShortName()
    {
        try
        {
            String retVal = port.iHostNetworkInterfaceGetShortName(obj);
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
Returns the interface UUID.
@return String
*/
    public String getId()
    {
        try
        {
            String retVal = port.iHostNetworkInterfaceGetId(obj);
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
Returns the name of a virtual network the interface gets attached to.
@return String
*/
    public String getNetworkName()
    {
        try
        {
            String retVal = port.iHostNetworkInterfaceGetNetworkName(obj);
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
Specifies whether the DHCP is enabled for the interface.
@return Boolean
*/
    public Boolean getDHCPEnabled()
    {
        try
        {
            Boolean retVal = port.iHostNetworkInterfaceGetDHCPEnabled(obj);
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
Returns the IP V4 address of the interface.
@return String
*/
    public String getIPAddress()
    {
        try
        {
            String retVal = port.iHostNetworkInterfaceGetIPAddress(obj);
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
Returns the network mask of the interface.
@return String
*/
    public String getNetworkMask()
    {
        try
        {
            String retVal = port.iHostNetworkInterfaceGetNetworkMask(obj);
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
Specifies whether the IP V6 is supported/enabled for the interface.
@return Boolean
*/
    public Boolean getIPV6Supported()
    {
        try
        {
            Boolean retVal = port.iHostNetworkInterfaceGetIPV6Supported(obj);
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
Returns the IP V6 address of the interface.
@return String
*/
    public String getIPV6Address()
    {
        try
        {
            String retVal = port.iHostNetworkInterfaceGetIPV6Address(obj);
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
Returns the length IP V6 network mask prefix of the interface.
@return Long
*/
    public Long getIPV6NetworkMaskPrefixLength()
    {
        try
        {
            Long retVal = port.iHostNetworkInterfaceGetIPV6NetworkMaskPrefixLength(obj);
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
Returns the hardware address. For Ethernet it is MAC address.
@return String
*/
    public String getHardwareAddress()
    {
        try
        {
            String retVal = port.iHostNetworkInterfaceGetHardwareAddress(obj);
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
Type of protocol encapsulation used.
@return org.virtualbox_7_0.HostNetworkInterfaceMediumType
*/
    public org.virtualbox_7_0.HostNetworkInterfaceMediumType getMediumType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.HostNetworkInterfaceMediumType retVal = port.iHostNetworkInterfaceGetMediumType(obj);
            return org.virtualbox_7_0.HostNetworkInterfaceMediumType.fromValue(retVal.value());
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
Status of the interface.
@return org.virtualbox_7_0.HostNetworkInterfaceStatus
*/
    public org.virtualbox_7_0.HostNetworkInterfaceStatus getStatus()
    {
        try
        {
            org.virtualbox_7_0.jaxws.HostNetworkInterfaceStatus retVal = port.iHostNetworkInterfaceGetStatus(obj);
            return org.virtualbox_7_0.HostNetworkInterfaceStatus.fromValue(retVal.value());
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
specifies the host interface type.
@return org.virtualbox_7_0.HostNetworkInterfaceType
*/
    public org.virtualbox_7_0.HostNetworkInterfaceType getInterfaceType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.HostNetworkInterfaceType retVal = port.iHostNetworkInterfaceGetInterfaceType(obj);
            return org.virtualbox_7_0.HostNetworkInterfaceType.fromValue(retVal.value());
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
Specifies whether the interface is wireless.
@return Boolean
*/
    public Boolean getWireless()
    {
        try
        {
            Boolean retVal = port.iHostNetworkInterfaceGetWireless(obj);
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
    public static IHostNetworkInterface queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IHostNetworkInterface(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
sets and enables the static IP V4 configuration for the given interface.
@param IPAddress IP address.

@param networkMask network mask.

*/
    public void enableStaticIPConfig(String IPAddress, String networkMask)
    {
        try
        {
        port.iHostNetworkInterfaceEnableStaticIPConfig(obj, IPAddress, networkMask);
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
sets and enables the static IP V6 configuration for the given interface.
@param IPV6Address IP address.

@param IPV6NetworkMaskPrefixLength network mask.

*/
    public void enableStaticIPConfigV6(String IPV6Address, Long IPV6NetworkMaskPrefixLength)
    {
        try
        {
        port.iHostNetworkInterfaceEnableStaticIPConfigV6(obj, IPV6Address, IPV6NetworkMaskPrefixLength);
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
enables the dynamic IP configuration.
*/
    public void enableDynamicIPConfig()
    {
        try
        {
        port.iHostNetworkInterfaceEnableDynamicIPConfig(obj);
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
refreshes the IP configuration for DHCP-enabled interface.
*/
    public void DHCPRediscover()
    {
        try
        {
        port.iHostNetworkInterfaceDHCPRediscover(obj);
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

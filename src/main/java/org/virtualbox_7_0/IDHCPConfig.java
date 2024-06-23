
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
 * IDHCPConfig.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;
import java.util.List;


/**
The DHCP server has several configuration levels: global, group and
individual MAC.  This interface implements the settings common to
each level.

Interface ID: <code>{00F4A8DC-0002-4B81-0077-1DCB004571BA}</code>
*/
public class IDHCPConfig extends IUnknown
{

    public IDHCPConfig(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Indicates the kind of config this is (mostly for IDHCPIndividualConfig).
@return org.virtualbox_7_0.DHCPConfigScope
*/
    public org.virtualbox_7_0.DHCPConfigScope getScope()
    {
        try
        {
            org.virtualbox_7_0.jaxws.DHCPConfigScope retVal = port.idhcpConfigGetScope(obj);
            return org.virtualbox_7_0.DHCPConfigScope.fromValue(retVal.value());
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
The minimum lease time in seconds, ignored if zero.
@return Long
*/
    public Long getMinLeaseTime()
    {
        try
        {
            Long retVal = port.idhcpConfigGetMinLeaseTime(obj);
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
The minimum lease time in seconds, ignored if zero.
@param value Long

*/
    public void setMinLeaseTime(Long value)
    {
        try
        {
        port.idhcpConfigSetMinLeaseTime(obj, value);
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
The default lease time in seconds, ignored if zero.
@return Long
*/
    public Long getDefaultLeaseTime()
    {
        try
        {
            Long retVal = port.idhcpConfigGetDefaultLeaseTime(obj);
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
The default lease time in seconds, ignored if zero.
@param value Long

*/
    public void setDefaultLeaseTime(Long value)
    {
        try
        {
        port.idhcpConfigSetDefaultLeaseTime(obj, value);
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
The maximum lease time in seconds, ignored if zero.
@return Long
*/
    public Long getMaxLeaseTime()
    {
        try
        {
            Long retVal = port.idhcpConfigGetMaxLeaseTime(obj);
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
The maximum lease time in seconds, ignored if zero.
@param value Long

*/
    public void setMaxLeaseTime(Long value)
    {
        try
        {
        port.idhcpConfigSetMaxLeaseTime(obj, value);
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
List of DHCP options which should be forced upon the clients in this
config scope when they are available, whether the clients asks for them
or not.
@return List&lt;org.virtualbox_7_0.DHCPOption&gt;
*/
    public List<org.virtualbox_7_0.DHCPOption> getForcedOptions()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.DHCPOption> retVal = port.idhcpConfigGetForcedOptions(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.DHCPOption.class, org.virtualbox_7_0.DHCPOption.class, retVal);
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
List of DHCP options which should be forced upon the clients in this
config scope when they are available, whether the clients asks for them
or not.
@param value List&lt;org.virtualbox_7_0.DHCPOption&gt;

*/
    public void setForcedOptions(List<org.virtualbox_7_0.DHCPOption> value)
    {
        try
        {
        port.idhcpConfigSetForcedOptions(obj, Helper.convertEnums(org.virtualbox_7_0.DHCPOption.class, org.virtualbox_7_0.jaxws.DHCPOption.class, value));
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
List of DHCP options which should not be sent to the clients in
this config scope.  This is intended for cases where one client or a
group of clients shouldn't see one or more (typically global) options.
@return List&lt;org.virtualbox_7_0.DHCPOption&gt;
*/
    public List<org.virtualbox_7_0.DHCPOption> getSuppressedOptions()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.DHCPOption> retVal = port.idhcpConfigGetSuppressedOptions(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.DHCPOption.class, org.virtualbox_7_0.DHCPOption.class, retVal);
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
List of DHCP options which should not be sent to the clients in
this config scope.  This is intended for cases where one client or a
group of clients shouldn't see one or more (typically global) options.
@param value List&lt;org.virtualbox_7_0.DHCPOption&gt;

*/
    public void setSuppressedOptions(List<org.virtualbox_7_0.DHCPOption> value)
    {
        try
        {
        port.idhcpConfigSetSuppressedOptions(obj, Helper.convertEnums(org.virtualbox_7_0.DHCPOption.class, org.virtualbox_7_0.jaxws.DHCPOption.class, value));
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
    public static IDHCPConfig queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IDHCPConfig(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Sets a DHCP option.
@param option The DHCP option.

@param encoding The value encoding.

@param value The DHCP option value.  The exact format depends on the DHCP
option value and  encoding, see see{@link org.virtualbox_7_0.DHCPOption}for the{@link org.virtualbox_7_0.DHCPOptionEncoding#Normal}format.

*/
    public void setOption(org.virtualbox_7_0.DHCPOption option, org.virtualbox_7_0.DHCPOptionEncoding encoding, String value)
    {
        try
        {
        port.idhcpConfigSetOption(obj, org.virtualbox_7_0.jaxws.DHCPOption.fromValue(option.name()), org.virtualbox_7_0.jaxws.DHCPOptionEncoding.fromValue(encoding.name()), value);
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
Removes the given DHCP option.
*/
    public void removeOption(org.virtualbox_7_0.DHCPOption option)
    {
        try
        {
        port.idhcpConfigRemoveOption(obj, org.virtualbox_7_0.jaxws.DHCPOption.fromValue(option.name()));
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
Removes all the options.

One exception here is the DhcpOpt_SubnetMask option in the global scope
that is linked to the{@link org.virtualbox_7_0.IDHCPServer#getNetworkMask()}attribute
and therefore cannot be removed.
*/
    public void removeAllOptions()
    {
        try
        {
        port.idhcpConfigRemoveAllOptions(obj);
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
Gets the value of a single DHCP option.
@param option The DHCP option being sought.

@param encoding The value encoding.

@return The value of the requested DHCP option. The exact format depends on
the DHCP  option value and the  encoding, see{@link org.virtualbox_7_0.DHCPOption}for the{@link org.virtualbox_7_0.DHCPOptionEncoding#Normal}format.

*/
    public String getOption(org.virtualbox_7_0.DHCPOption option, Holder<org.virtualbox_7_0.DHCPOptionEncoding> encoding)
    {
        try
        {
        jakarta.xml.ws.Holder<org.virtualbox_7_0.jaxws.DHCPOptionEncoding> tmp_encoding = new jakarta.xml.ws.Holder<org.virtualbox_7_0.jaxws.DHCPOptionEncoding>();
        jakarta.xml.ws.Holder<String> retVal = new jakarta.xml.ws.Holder<String>();
        port.idhcpConfigGetOption(obj, org.virtualbox_7_0.jaxws.DHCPOption.fromValue(option.name()), tmp_encoding, retVal);
        encoding.value = org.virtualbox_7_0.DHCPOptionEncoding.fromValue(tmp_encoding.value.value());
           return retVal.value;
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
Gets all DHCP options and their values
@param options Array containing the DHCP option numbers.

@param encodings Array of value encodings that runs parallel to  options.

@return Array of values that runs parallel to  options and  encodings.  The
format depends on both of those.

*/
    public List<String> getAllOptions(Holder<List<org.virtualbox_7_0.DHCPOption>> options, Holder<List<org.virtualbox_7_0.DHCPOptionEncoding>> encodings)
    {
        try
        {
        jakarta.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.DHCPOption>> tmp_options = new jakarta.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.DHCPOption>>();
        jakarta.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.DHCPOptionEncoding>> tmp_encodings = new jakarta.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.DHCPOptionEncoding>>();
        jakarta.xml.ws.Holder<List<String>> retVal = new jakarta.xml.ws.Holder<List<String>>();
        port.idhcpConfigGetAllOptions(obj, tmp_options, tmp_encodings, retVal);
        options.value = Helper.convertEnums(org.virtualbox_7_0.jaxws.DHCPOption.class, org.virtualbox_7_0.DHCPOption.class, tmp_options.value);
        encodings.value = Helper.convertEnums(org.virtualbox_7_0.jaxws.DHCPOptionEncoding.class, org.virtualbox_7_0.DHCPOptionEncoding.class, tmp_encodings.value);
           return retVal.value;
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
Remove this group or individual configuration.
Will of course not work on global configurations.
*/
    public void remove()
    {
        try
        {
        port.idhcpConfigRemove(obj);
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

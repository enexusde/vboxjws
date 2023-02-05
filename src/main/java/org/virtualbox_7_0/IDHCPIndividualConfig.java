
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
 * IDHCPIndividualConfig.java
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
Configuration for a single NIC, either given directly by MAC address or by
VM + adaptor slot number.

Interface ID: <code>{C40C2B86-73A5-46CC-8227-93FE57D006A6}</code>
*/
public class IDHCPIndividualConfig extends IDHCPConfig
{

    public IDHCPIndividualConfig(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
The MAC address.  If a{@link org.virtualbox_7_0.DHCPConfigScope#MachineNIC}config, this
will be queried via the VM ID.
@return String
*/
    public String getMACAddress()
    {
        try
        {
            String retVal = port.idhcpIndividualConfigGetMACAddress(obj);
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
The virtual machine ID if a{@link org.virtualbox_7_0.DHCPConfigScope#MachineNIC}config,
null UUID for{@link org.virtualbox_7_0.DHCPConfigScope#MAC}.
@return String
*/
    public String getMachineId()
    {
        try
        {
            String retVal = port.idhcpIndividualConfigGetMachineId(obj);
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
The NIC slot number of the VM if a{@link org.virtualbox_7_0.DHCPConfigScope#MachineNIC}config.
@return Long
*/
    public Long getSlot()
    {
        try
        {
            Long retVal = port.idhcpIndividualConfigGetSlot(obj);
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
Fixed IPv4 address assignment, dynamic if empty.
@return String
*/
    public String getFixedAddress()
    {
        try
        {
            String retVal = port.idhcpIndividualConfigGetFixedAddress(obj);
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
Fixed IPv4 address assignment, dynamic if empty.
@param value String

*/
    public void setFixedAddress(String value)
    {
        try
        {
        port.idhcpIndividualConfigSetFixedAddress(obj, value);
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
    public static IDHCPIndividualConfig queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IDHCPIndividualConfig(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

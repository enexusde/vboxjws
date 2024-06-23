
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
 * IUSBDevice.java
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
The IUSBDevice interface represents a virtual USB device attached to the
virtual machine.

A collection of objects implementing this interface is stored in the{@link org.virtualbox_7_0.IConsole#getUSBDevices()}attribute which lists all USB devices
attached to a running virtual machine's USB controller.

Interface ID: <code>{6DC83C2C-81A9-4005-9D52-FC45A78BF3F5}</code>
*/
public class IUSBDevice extends IUnknown
{

    public IUSBDevice(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Unique USB device ID. This ID is built from #vendorId,
#productId, #revision and #serialNumber.
@return String
*/
    public String getId()
    {
        try
        {
            String retVal = port.iusbDeviceGetId(obj);
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
Vendor ID.
@return Integer
*/
    public Integer getVendorId()
    {
        try
        {
            Integer retVal = port.iusbDeviceGetVendorId(obj);
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
Product ID.
@return Integer
*/
    public Integer getProductId()
    {
        try
        {
            Integer retVal = port.iusbDeviceGetProductId(obj);
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
Product revision number. This is a packed BCD represented as
unsigned short. The high byte is the integer part and the low
byte is the decimal.
@return Integer
*/
    public Integer getRevision()
    {
        try
        {
            Integer retVal = port.iusbDeviceGetRevision(obj);
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
Manufacturer string.
@return String
*/
    public String getManufacturer()
    {
        try
        {
            String retVal = port.iusbDeviceGetManufacturer(obj);
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
Product string.
@return String
*/
    public String getProduct()
    {
        try
        {
            String retVal = port.iusbDeviceGetProduct(obj);
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
Serial number string.
@return String
*/
    public String getSerialNumber()
    {
        try
        {
            String retVal = port.iusbDeviceGetSerialNumber(obj);
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
Host-specific address of the device, uniquely
identifying a physically connected device in the system.
Note that the address of a USB device may change across
device re-plugs and host suspend/resume cycles or reboots.
@return String
*/
    public String getAddress()
    {
        try
        {
            String retVal = port.iusbDeviceGetAddress(obj);
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
Host USB port number on the hub the device is physically
connected to.
@return Integer
*/
    public Integer getPort()
    {
        try
        {
            Integer retVal = port.iusbDeviceGetPort(obj);
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
Host-specific identifier of the port (including hub) the USB
device is physically connected to. Note that hubs may be
dynamically added and removed, and that hub enumeration may not
be consistent across host reboots.
@return String
*/
    public String getPortPath()
    {
        try
        {
            String retVal = port.iusbDeviceGetPortPath(obj);
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
The major USB version of the device - 1, 2 or 3.
@return Integer
*/
    public Integer getVersion()
    {
        try
        {
            Integer retVal = port.iusbDeviceGetVersion(obj);
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
The speed at which the device is currently communicating.
@return org.virtualbox_7_0.USBConnectionSpeed
*/
    public org.virtualbox_7_0.USBConnectionSpeed getSpeed()
    {
        try
        {
            org.virtualbox_7_0.jaxws.USBConnectionSpeed retVal = port.iusbDeviceGetSpeed(obj);
            return org.virtualbox_7_0.USBConnectionSpeed.fromValue(retVal.value());
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
Whether the device is physically connected to a remote VRDE
client or to a local host machine.
@return Boolean
*/
    public Boolean getRemote()
    {
        try
        {
            Boolean retVal = port.iusbDeviceGetRemote(obj);
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
Array of device attributes as single strings.

So far the following are used:
0: The manufacturer string, if the device doesn't expose the ID one is taken
from an internal database or an empty string if none is found.
1: The product string, if the device doesn't expose the ID one is taken
from an internal database or an empty string if none is found.
@return List&lt;String&gt;
*/
    public List<String> getDeviceInfo()
    {
        try
        {
            List<String> retVal = port.iusbDeviceGetDeviceInfo(obj);
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
The backend which will be used to communicate with this device.
@return String
*/
    public String getBackend()
    {
        try
        {
            String retVal = port.iusbDeviceGetBackend(obj);
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
    public static IUSBDevice queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IUSBDevice(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

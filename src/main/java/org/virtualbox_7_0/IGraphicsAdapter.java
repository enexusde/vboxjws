
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
 * IGraphicsAdapter.java
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
The IGraphicsAdapter interface represents the graphics adapter
of the virtual machine.

Interface ID: <code>{F692806F-FEBE-4049-B476-1292A8E45B09}</code>
*/
public class IGraphicsAdapter extends IUnknown
{

    public IGraphicsAdapter(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Graphics controller type.
@return org.virtualbox_7_0.GraphicsControllerType
*/
    public org.virtualbox_7_0.GraphicsControllerType getGraphicsControllerType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.GraphicsControllerType retVal = port.iGraphicsAdapterGetGraphicsControllerType(obj);
            return org.virtualbox_7_0.GraphicsControllerType.fromValue(retVal.value());
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
Graphics controller type.
@param value org.virtualbox_7_0.GraphicsControllerType

*/
    public void setGraphicsControllerType(org.virtualbox_7_0.GraphicsControllerType value)
    {
        try
        {
        port.iGraphicsAdapterSetGraphicsControllerType(obj, org.virtualbox_7_0.jaxws.GraphicsControllerType.fromValue(value.name()));
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
Video memory size in megabytes.
@return Long
*/
    public Long getVRAMSize()
    {
        try
        {
            Long retVal = port.iGraphicsAdapterGetVRAMSize(obj);
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
Video memory size in megabytes.
@param value Long

*/
    public void setVRAMSize(Long value)
    {
        try
        {
        port.iGraphicsAdapterSetVRAMSize(obj, value);
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
This setting determines whether VirtualBox allows this machine to make
use of the 3D graphics support available on the host.
@return Boolean
*/
    public Boolean getAccelerate3DEnabled()
    {
        try
        {
            Boolean retVal = port.iGraphicsAdapterGetAccelerate3DEnabled(obj);
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
This setting determines whether VirtualBox allows this machine to make
use of the 3D graphics support available on the host.
@param value Boolean

*/
    public void setAccelerate3DEnabled(Boolean value)
    {
        try
        {
        port.iGraphicsAdapterSetAccelerate3DEnabled(obj, value);
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
This setting determines whether VirtualBox allows this machine to make
use of the 2D video acceleration support available on the host.
@return Boolean
*/
    public Boolean getAccelerate2DVideoEnabled()
    {
        try
        {
            Boolean retVal = port.iGraphicsAdapterGetAccelerate2DVideoEnabled(obj);
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
This setting determines whether VirtualBox allows this machine to make
use of the 2D video acceleration support available on the host.
@param value Boolean

*/
    public void setAccelerate2DVideoEnabled(Boolean value)
    {
        try
        {
        port.iGraphicsAdapterSetAccelerate2DVideoEnabled(obj, value);
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
Number of virtual monitors.
NOTE: Only effective on Windows XP and later guests with
Guest Additions installed.

@return Long
*/
    public Long getMonitorCount()
    {
        try
        {
            Long retVal = port.iGraphicsAdapterGetMonitorCount(obj);
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
Number of virtual monitors.
NOTE: Only effective on Windows XP and later guests with
Guest Additions installed.

@param value Long

*/
    public void setMonitorCount(Long value)
    {
        try
        {
        port.iGraphicsAdapterSetMonitorCount(obj, value);
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
    public static IGraphicsAdapter queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IGraphicsAdapter(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

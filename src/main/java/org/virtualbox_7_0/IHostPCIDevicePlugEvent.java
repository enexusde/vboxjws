
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
 * IHostPCIDevicePlugEvent.java
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
Notification when host PCI device is plugged/unplugged. Plugging
usually takes place on VM startup, unplug - when{@link org.virtualbox_7_0.IMachine#detachHostPCIDevice(Integer)}is called.
@see org.virtualbox_7_0.IMachine#detachHostPCIDevice(Integer)


Interface ID: <code>{A0BAD6DF-D612-47D3-89D4-DB3992533948}</code>
*/
public class IHostPCIDevicePlugEvent extends IMachineEvent
{

    public IHostPCIDevicePlugEvent(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
If device successfully plugged or unplugged.
@return Boolean
*/
    public Boolean getPlugged()
    {
        try
        {
            Boolean retVal = port.iHostPCIDevicePlugEventGetPlugged(obj);
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
If operation was successful, if false - 'message' attribute
may be of interest.
@return Boolean
*/
    public Boolean getSuccess()
    {
        try
        {
            Boolean retVal = port.iHostPCIDevicePlugEventGetSuccess(obj);
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
Attachment info for this device.
@return org.virtualbox_7_0.IPCIDeviceAttachment
*/
    public org.virtualbox_7_0.IPCIDeviceAttachment getAttachment()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            org.virtualbox_7_0.jaxws.IPCIDeviceAttachment retVal = port.iHostPCIDevicePlugEventGetAttachment(obj);
            return (retVal != null) ? new org.virtualbox_7_0.IPCIDeviceAttachment(retVal, getObjMgr(), port) : null;
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
Optional error message.
@return String
*/
    public String getMessage()
    {
        try
        {
            String retVal = port.iHostPCIDevicePlugEventGetMessage(obj);
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
    public static IHostPCIDevicePlugEvent queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IHostPCIDevicePlugEvent(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

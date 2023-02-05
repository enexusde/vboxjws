
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
 * IHostAudioDevice.java
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
Represents an audio device provided by the host OS.

Interface ID: <code>{CFDE1265-3140-4048-A81F-A1E280DFBD75}</code>
*/
public class IHostAudioDevice extends IUnknown
{

    public IHostAudioDevice(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Unique device ID.
@return String
*/
    public String getId()
    {
        try
        {
            String retVal = port.iHostAudioDeviceGetId(obj);
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
Friendly name of the device.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iHostAudioDeviceGetName(obj);
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
Friendly name of the device.
@param value String

*/
    public void setName(String value)
    {
        try
        {
        port.iHostAudioDeviceSetName(obj, value);
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
Device type.
@return org.virtualbox_7_0.AudioDeviceType
*/
    public org.virtualbox_7_0.AudioDeviceType getType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.AudioDeviceType retVal = port.iHostAudioDeviceGetType(obj);
            return org.virtualbox_7_0.AudioDeviceType.fromValue(retVal.value());
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
Device type.
@param value org.virtualbox_7_0.AudioDeviceType

*/
    public void setType(org.virtualbox_7_0.AudioDeviceType value)
    {
        try
        {
        port.iHostAudioDeviceSetType(obj, org.virtualbox_7_0.jaxws.AudioDeviceType.fromValue(value.name()));
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
Usage type of the device.
@return org.virtualbox_7_0.AudioDirection
*/
    public org.virtualbox_7_0.AudioDirection getUsage()
    {
        try
        {
            org.virtualbox_7_0.jaxws.AudioDirection retVal = port.iHostAudioDeviceGetUsage(obj);
            return org.virtualbox_7_0.AudioDirection.fromValue(retVal.value());
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
Usage type of the device.
@param value org.virtualbox_7_0.AudioDirection

*/
    public void setUsage(org.virtualbox_7_0.AudioDirection value)
    {
        try
        {
        port.iHostAudioDeviceSetUsage(obj, org.virtualbox_7_0.jaxws.AudioDirection.fromValue(value.name()));
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
Whether this device is being marked as the default input
device by the host OS.
@return Boolean
*/
    public Boolean getDefaultIn()
    {
        try
        {
            Boolean retVal = port.iHostAudioDeviceGetDefaultIn(obj);
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
Whether this device is being marked as the default input
device by the host OS.
@param value Boolean

*/
    public void setDefaultIn(Boolean value)
    {
        try
        {
        port.iHostAudioDeviceSetDefaultIn(obj, value);
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
Whether this device is being marked as the default output
device by the host OS.
@return Boolean
*/
    public Boolean getDefaultOut()
    {
        try
        {
            Boolean retVal = port.iHostAudioDeviceGetDefaultOut(obj);
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
Whether this device is being marked as the default output
device by the host OS.
@param value Boolean

*/
    public void setDefaultOut(Boolean value)
    {
        try
        {
        port.iHostAudioDeviceSetDefaultOut(obj, value);
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
Whether this device is being marked as a hotplug device, i.e. can
be removed from the system.
@return Boolean
*/
    public Boolean getIsHotPlug()
    {
        try
        {
            Boolean retVal = port.iHostAudioDeviceGetIsHotPlug(obj);
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
Whether this device is being marked as a hotplug device, i.e. can
be removed from the system.
@param value Boolean

*/
    public void setIsHotPlug(Boolean value)
    {
        try
        {
        port.iHostAudioDeviceSetIsHotPlug(obj, value);
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
Current device state.
@return org.virtualbox_7_0.AudioDeviceState
*/
    public org.virtualbox_7_0.AudioDeviceState getState()
    {
        try
        {
            org.virtualbox_7_0.jaxws.AudioDeviceState retVal = port.iHostAudioDeviceGetState(obj);
            return org.virtualbox_7_0.AudioDeviceState.fromValue(retVal.value());
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
Current device state.
@param value org.virtualbox_7_0.AudioDeviceState

*/
    public void setState(org.virtualbox_7_0.AudioDeviceState value)
    {
        try
        {
        port.iHostAudioDeviceSetState(obj, org.virtualbox_7_0.jaxws.AudioDeviceState.fromValue(value.name()));
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
    public static IHostAudioDevice queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IHostAudioDevice(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Returns an audio specific property string.

If the requested data  key does not exist, this function will
succeed and return an empty string in the  value argument.
@param key Name of the key to get.

@return Value of the requested key.

*/
    public String getProperty(String key)
    {
        try
        {
            String retVal;
        retVal = port.iHostAudioDeviceGetProperty(obj, key);
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
}

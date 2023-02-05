
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
 * IAudioAdapter.java
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
The IAudioAdapter interface represents the virtual audio adapter of
the virtual machine. Used in{@link org.virtualbox_7_0.IAudioSettings#getAdapter()}.

Interface ID: <code>{5155BFD3-7BA7-45A8-B26D-C91AE3754E37}</code>
*/
public class IAudioAdapter extends IUnknown
{

    public IAudioAdapter(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Flag whether the audio adapter is present in the
guest system. If disabled, the virtual guest hardware will
not contain any audio adapter. Can only be changed when
the VM is not running.
@return Boolean
*/
    public Boolean getEnabled()
    {
        try
        {
            Boolean retVal = port.iAudioAdapterGetEnabled(obj);
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
Flag whether the audio adapter is present in the
guest system. If disabled, the virtual guest hardware will
not contain any audio adapter. Can only be changed when
the VM is not running.
@param value Boolean

*/
    public void setEnabled(Boolean value)
    {
        try
        {
        port.iAudioAdapterSetEnabled(obj, value);
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
Flag whether the audio adapter is enabled for audio
input. Only relevant if the adapter is enabled.
@return Boolean
*/
    public Boolean getEnabledIn()
    {
        try
        {
            Boolean retVal = port.iAudioAdapterGetEnabledIn(obj);
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
Flag whether the audio adapter is enabled for audio
input. Only relevant if the adapter is enabled.
@param value Boolean

*/
    public void setEnabledIn(Boolean value)
    {
        try
        {
        port.iAudioAdapterSetEnabledIn(obj, value);
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
Flag whether the audio adapter is enabled for audio
output. Only relevant if the adapter is enabled.
@return Boolean
*/
    public Boolean getEnabledOut()
    {
        try
        {
            Boolean retVal = port.iAudioAdapterGetEnabledOut(obj);
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
Flag whether the audio adapter is enabled for audio
output. Only relevant if the adapter is enabled.
@param value Boolean

*/
    public void setEnabledOut(Boolean value)
    {
        try
        {
        port.iAudioAdapterSetEnabledOut(obj, value);
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
The emulated audio controller.
@return org.virtualbox_7_0.AudioControllerType
*/
    public org.virtualbox_7_0.AudioControllerType getAudioController()
    {
        try
        {
            org.virtualbox_7_0.jaxws.AudioControllerType retVal = port.iAudioAdapterGetAudioController(obj);
            return org.virtualbox_7_0.AudioControllerType.fromValue(retVal.value());
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
The emulated audio controller.
@param value org.virtualbox_7_0.AudioControllerType

*/
    public void setAudioController(org.virtualbox_7_0.AudioControllerType value)
    {
        try
        {
        port.iAudioAdapterSetAudioController(obj, org.virtualbox_7_0.jaxws.AudioControllerType.fromValue(value.name()));
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
The exact variant of audio codec hardware presented
to the guest.
For HDA and SB16, only one variant is available, but for AC'97,
there are several.
@return org.virtualbox_7_0.AudioCodecType
*/
    public org.virtualbox_7_0.AudioCodecType getAudioCodec()
    {
        try
        {
            org.virtualbox_7_0.jaxws.AudioCodecType retVal = port.iAudioAdapterGetAudioCodec(obj);
            return org.virtualbox_7_0.AudioCodecType.fromValue(retVal.value());
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
The exact variant of audio codec hardware presented
to the guest.
For HDA and SB16, only one variant is available, but for AC'97,
there are several.
@param value org.virtualbox_7_0.AudioCodecType

*/
    public void setAudioCodec(org.virtualbox_7_0.AudioCodecType value)
    {
        try
        {
        port.iAudioAdapterSetAudioCodec(obj, org.virtualbox_7_0.jaxws.AudioCodecType.fromValue(value.name()));
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
Audio driver the adapter is connected to. This setting
can only be changed when the VM is not running.
@return org.virtualbox_7_0.AudioDriverType
*/
    public org.virtualbox_7_0.AudioDriverType getAudioDriver()
    {
        try
        {
            org.virtualbox_7_0.jaxws.AudioDriverType retVal = port.iAudioAdapterGetAudioDriver(obj);
            return org.virtualbox_7_0.AudioDriverType.fromValue(retVal.value());
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
Audio driver the adapter is connected to. This setting
can only be changed when the VM is not running.
@param value org.virtualbox_7_0.AudioDriverType

*/
    public void setAudioDriver(org.virtualbox_7_0.AudioDriverType value)
    {
        try
        {
        port.iAudioAdapterSetAudioDriver(obj, org.virtualbox_7_0.jaxws.AudioDriverType.fromValue(value.name()));
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
Array of names of tunable properties, which can be supported by audio driver.
@return List&lt;String&gt;
*/
    public List<String> getPropertiesList()
    {
        try
        {
            List<String> retVal = port.iAudioAdapterGetPropertiesList(obj);
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
    public static IAudioAdapter queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IAudioAdapter(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Sets an audio specific property string.

If you pass  null or empty string as a key  value, the given  key
will be deleted.
@param key Name of the key to set.

@param value Value to assign to the key.

*/
    public void setProperty(String key, String value)
    {
        try
        {
        port.iAudioAdapterSetProperty(obj, key, value);
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
        retVal = port.iAudioAdapterGetProperty(obj, key);
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

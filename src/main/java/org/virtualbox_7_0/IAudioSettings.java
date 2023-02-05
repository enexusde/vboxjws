
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
 * IAudioSettings.java
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
The IAudioSettings interface represents the audio settings for a virtual machine.

Interface ID: <code>{52F40B16-520E-473F-9428-3E69B0D915C3}</code>
*/
public class IAudioSettings extends IUnknown
{

    public IAudioSettings(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Associated audio adapter, always present.
@return org.virtualbox_7_0.IAudioAdapter
*/
    public org.virtualbox_7_0.IAudioAdapter getAdapter()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iAudioSettingsGetAdapter(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IAudioAdapter(retVal, getObjMgr(), port) : null;
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
    public static IAudioSettings queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IAudioSettings(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Returns the machine's current host audio device for the specified usage.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - This method is not implemented yet.</dd>
</dl>

@param usage Usage to retrieve audio device for.

@return Host audio device for the specified direction.

*/
    public org.virtualbox_7_0.IHostAudioDevice getHostAudioDevice(org.virtualbox_7_0.AudioDirection usage)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iAudioSettingsGetHostAudioDevice(obj, org.virtualbox_7_0.jaxws.AudioDirection.fromValue(usage.name()));
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IHostAudioDevice(retVal, getObjMgr(), port) : null;
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
Sets the machine's current host audio device for the specified usage.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - This method is not implemented yet.</dd>
</dl>

@param device Sets the host audio device for the specified usage.

@param usage Usage to set audio device for.

*/
    public void setHostAudioDevice(org.virtualbox_7_0.IHostAudioDevice device, org.virtualbox_7_0.AudioDirection usage)
    {
        try
        {
        port.iAudioSettingsSetHostAudioDevice(obj, ((device == null) ? null :device.getWrapped()), org.virtualbox_7_0.jaxws.AudioDirection.fromValue(usage.name()));
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

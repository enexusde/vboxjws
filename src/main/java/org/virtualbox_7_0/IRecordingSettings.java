
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
 * IRecordingSettings.java
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
The IRecordingSettings interface represents recording settings of the virtual
machine. This is used only in the{@link org.virtualbox_7_0.IMachine#getRecordingSettings()}attribute.

Interface ID: <code>{D88F2A5A-47C7-4A3F-AAE1-1B516817DB41}</code>
*/
public class IRecordingSettings extends IUnknown
{

    public IRecordingSettings(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
This setting determines whether VirtualBox uses recording to record a
VM session.
@return Boolean
*/
    public Boolean getEnabled()
    {
        try
        {
            Boolean retVal = port.iRecordingSettingsGetEnabled(obj);
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
This setting determines whether VirtualBox uses recording to record a
VM session.
@param value Boolean

*/
    public void setEnabled(Boolean value)
    {
        try
        {
        port.iRecordingSettingsSetEnabled(obj, value);
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
This setting returns an array for recording settings of all configured
virtual screens.
@return List&lt;org.virtualbox_7_0.IRecordingScreenSettings&gt;
*/
    public List<org.virtualbox_7_0.IRecordingScreenSettings> getScreens()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iRecordingSettingsGetScreens(obj);
            return Helper.wrap(org.virtualbox_7_0.IRecordingScreenSettings.class, getObjMgr(), port, retVal);
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
    public static IRecordingSettings queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IRecordingSettings(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Returns the recording settings for a particular screen.
@param screenId Screen ID to retrieve recording screen settings for.

@return Recording screen settings for the requested screen.

*/
    public org.virtualbox_7_0.IRecordingScreenSettings getScreenSettings(Long screenId)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iRecordingSettingsGetScreenSettings(obj, screenId);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IRecordingScreenSettings(retVal, getObjMgr(), port) : null;
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
}

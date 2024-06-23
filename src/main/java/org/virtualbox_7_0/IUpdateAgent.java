
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
 * IUpdateAgent.java
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
Abstract parent interface for handling updateable software components.

Interface ID: <code>{C4B1B5F4-8CDF-4923-9EF6-B92476A84109}</code>
*/
public class IUpdateAgent extends IUnknown
{

    public IUpdateAgent(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Name of the update component.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iUpdateAgentGetName(obj);
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
Event source for update agent events.
@return org.virtualbox_7_0.IEventSource
*/
    public org.virtualbox_7_0.IEventSource getEventSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iUpdateAgentGetEventSource(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IEventSource(retVal, getObjMgr(), port) : null;
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
Order hint the update component needs to run at, in conjunction with other update components.
@return Long
*/
    public Long getOrder()
    {
        try
        {
            Long retVal = port.iUpdateAgentGetOrder(obj);
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
Array of other update component names this component depends on before being able to get installed.
@return List&lt;String&gt;
*/
    public List<String> getDependsOn()
    {
        try
        {
            List<String> retVal = port.iUpdateAgentGetDependsOn(obj);
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
Version the update contains.
@return String
*/
    public String getVersion()
    {
        try
        {
            String retVal = port.iUpdateAgentGetVersion(obj);
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
Download URL of the update.
@return String
*/
    public String getDownloadUrl()
    {
        try
        {
            String retVal = port.iUpdateAgentGetDownloadUrl(obj);
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
Web URL of the update.
@return String
*/
    public String getWebUrl()
    {
        try
        {
            String retVal = port.iUpdateAgentGetWebUrl(obj);
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
Release notes of the update.
@return String
*/
    public String getReleaseNotes()
    {
        try
        {
            String retVal = port.iUpdateAgentGetReleaseNotes(obj);
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
Enables or disables the update component.
@return Boolean
*/
    public Boolean getEnabled()
    {
        try
        {
            Boolean retVal = port.iUpdateAgentGetEnabled(obj);
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
Enables or disables the update component.
@param value Boolean

*/
    public void setEnabled(Boolean value)
    {
        try
        {
        port.iUpdateAgentSetEnabled(obj, value);
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
Whether the update component shall be hidden from the user or not.
@return Boolean
*/
    public Boolean getHidden()
    {
        try
        {
            Boolean retVal = port.iUpdateAgentGetHidden(obj);
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
Returns the current update state.
@return org.virtualbox_7_0.UpdateState
*/
    public org.virtualbox_7_0.UpdateState getState()
    {
        try
        {
            org.virtualbox_7_0.jaxws.UpdateState retVal = port.iUpdateAgentGetState(obj);
            return org.virtualbox_7_0.UpdateState.fromValue(retVal.value());
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
The update check frequency (in seconds).
@return Long
*/
    public Long getCheckFrequency()
    {
        try
        {
            Long retVal = port.iUpdateAgentGetCheckFrequency(obj);
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
The update check frequency (in seconds).
@param value Long

*/
    public void setCheckFrequency(Long value)
    {
        try
        {
        port.iUpdateAgentSetCheckFrequency(obj, value);
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
Update channel to use for checking for updates.
@return org.virtualbox_7_0.UpdateChannel
*/
    public org.virtualbox_7_0.UpdateChannel getChannel()
    {
        try
        {
            org.virtualbox_7_0.jaxws.UpdateChannel retVal = port.iUpdateAgentGetChannel(obj);
            return org.virtualbox_7_0.UpdateChannel.fromValue(retVal.value());
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
Update channel to use for checking for updates.
@param value org.virtualbox_7_0.UpdateChannel

*/
    public void setChannel(org.virtualbox_7_0.UpdateChannel value)
    {
        try
        {
        port.iUpdateAgentSetChannel(obj, org.virtualbox_7_0.jaxws.UpdateChannel.fromValue(value.name()));
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
Update repository URL to use for retrieving the update.
@return String
*/
    public String getRepositoryURL()
    {
        try
        {
            String retVal = port.iUpdateAgentGetRepositoryURL(obj);
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
Update repository URL to use for retrieving the update.
@param value String

*/
    public void setRepositoryURL(String value)
    {
        try
        {
        port.iUpdateAgentSetRepositoryURL(obj, value);
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
Date of last update check.
@return String
*/
    public String getLastCheckDate()
    {
        try
        {
            String retVal = port.iUpdateAgentGetLastCheckDate(obj);
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
How many times the update check has happened already.
@return Long
*/
    public Long getCheckCount()
    {
        try
        {
            Long retVal = port.iUpdateAgentGetCheckCount(obj);
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
Returns  TRUE if an update check is needed, or  FALSE if not.
NOTE: Compares the system's current date with the last
update check date and currently set check frequency.

@return Boolean
*/
    public Boolean getIsCheckNeeded()
    {
        try
        {
            Boolean retVal = port.iUpdateAgentGetIsCheckNeeded(obj);
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
Returns a safe array of all supported update channels this agents offers.
@return List&lt;org.virtualbox_7_0.UpdateChannel&gt;
*/
    public List<org.virtualbox_7_0.UpdateChannel> getSupportedChannels()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.UpdateChannel> retVal = port.iUpdateAgentGetSupportedChannels(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.UpdateChannel.class, org.virtualbox_7_0.UpdateChannel.class, retVal);
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
    public static IUpdateAgent queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IUpdateAgent(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Checks for an update.
@return Progress object to track operation completion.

*/
    public org.virtualbox_7_0.IProgress checkFor()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iUpdateAgentCheckFor(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Downloads the update.
@return Progress object to track operation completion.

*/
    public org.virtualbox_7_0.IProgress download()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iUpdateAgentDownload(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Installs the update.
@return Progress object to track operation completion.

*/
    public org.virtualbox_7_0.IProgress install()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iUpdateAgentInstall(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Rolls back installing the update.
*/
    public void rollback()
    {
        try
        {
        port.iUpdateAgentRollback(obj);
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

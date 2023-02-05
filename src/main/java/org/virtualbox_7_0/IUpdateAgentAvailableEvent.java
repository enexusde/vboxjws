
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
 * IUpdateAgentAvailableEvent.java
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
Notification when an update is available.

Interface ID: <code>{243829CB-15B7-42A4-8664-7AA4E34993DA}</code>
*/
public class IUpdateAgentAvailableEvent extends IUpdateAgentEvent
{

    public IUpdateAgentAvailableEvent(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Version of the update.
@return String
*/
    public String getVersion()
    {
        try
        {
            String retVal = port.iUpdateAgentAvailableEventGetVersion(obj);
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
Channel containing the update.
@return org.virtualbox_7_0.UpdateChannel
*/
    public org.virtualbox_7_0.UpdateChannel getChannel()
    {
        try
        {
            org.virtualbox_7_0.jaxws.UpdateChannel retVal = port.iUpdateAgentAvailableEventGetChannel(obj);
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
Severity of the update.
@return org.virtualbox_7_0.UpdateSeverity
*/
    public org.virtualbox_7_0.UpdateSeverity getSeverity()
    {
        try
        {
            org.virtualbox_7_0.jaxws.UpdateSeverity retVal = port.iUpdateAgentAvailableEventGetSeverity(obj);
            return org.virtualbox_7_0.UpdateSeverity.fromValue(retVal.value());
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
    public String getDownloadURL()
    {
        try
        {
            String retVal = port.iUpdateAgentAvailableEventGetDownloadURL(obj);
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
    public String getWebURL()
    {
        try
        {
            String retVal = port.iUpdateAgentAvailableEventGetWebURL(obj);
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
            String retVal = port.iUpdateAgentAvailableEventGetReleaseNotes(obj);
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
    public static IUpdateAgentAvailableEvent queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IUpdateAgentAvailableEvent(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

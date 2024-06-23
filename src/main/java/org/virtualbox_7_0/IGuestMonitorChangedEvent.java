
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
 * IGuestMonitorChangedEvent.java
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
Notification when the guest enables one of its monitors.

Interface ID: <code>{0F7B8A22-C71F-4A36-8E5F-A77D01D76090}</code>
*/
public class IGuestMonitorChangedEvent extends IEvent
{

    public IGuestMonitorChangedEvent(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
What was changed for this guest monitor.
@return org.virtualbox_7_0.GuestMonitorChangedEventType
*/
    public org.virtualbox_7_0.GuestMonitorChangedEventType getChangeType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.GuestMonitorChangedEventType retVal = port.iGuestMonitorChangedEventGetChangeType(obj);
            return org.virtualbox_7_0.GuestMonitorChangedEventType.fromValue(retVal.value());
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
The monitor which was changed.
@return Long
*/
    public Long getScreenId()
    {
        try
        {
            Long retVal = port.iGuestMonitorChangedEventGetScreenId(obj);
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
Physical X origin relative to the primary screen.
Valid for Enabled and NewOrigin.
@return Long
*/
    public Long getOriginX()
    {
        try
        {
            Long retVal = port.iGuestMonitorChangedEventGetOriginX(obj);
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
Physical Y origin relative to the primary screen.
Valid for Enabled and NewOrigin.
@return Long
*/
    public Long getOriginY()
    {
        try
        {
            Long retVal = port.iGuestMonitorChangedEventGetOriginY(obj);
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
Width of the screen.
Valid for Enabled.
@return Long
*/
    public Long getWidth()
    {
        try
        {
            Long retVal = port.iGuestMonitorChangedEventGetWidth(obj);
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
Height of the screen.
Valid for Enabled.
@return Long
*/
    public Long getHeight()
    {
        try
        {
            Long retVal = port.iGuestMonitorChangedEventGetHeight(obj);
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
    public static IGuestMonitorChangedEvent queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IGuestMonitorChangedEvent(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

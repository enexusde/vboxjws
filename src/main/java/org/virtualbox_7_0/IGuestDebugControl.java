
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
 * IGuestDebugControl.java
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
Controls the guest debug settings of one virtual machine.

Interface ID: <code>{1474BB3A-F096-4CD7-A857-8D8E3CEA7331}</code>
*/
public class IGuestDebugControl extends IUnknown
{

    public IGuestDebugControl(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
The currently active debug provider.
@return org.virtualbox_7_0.GuestDebugProvider
*/
    public org.virtualbox_7_0.GuestDebugProvider getDebugProvider()
    {
        try
        {
            org.virtualbox_7_0.jaxws.GuestDebugProvider retVal = port.iGuestDebugControlGetDebugProvider(obj);
            return org.virtualbox_7_0.GuestDebugProvider.fromValue(retVal.value());
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
The currently active debug provider.
@param value org.virtualbox_7_0.GuestDebugProvider

*/
    public void setDebugProvider(org.virtualbox_7_0.GuestDebugProvider value)
    {
        try
        {
        port.iGuestDebugControlSetDebugProvider(obj, org.virtualbox_7_0.jaxws.GuestDebugProvider.fromValue(value.name()));
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
The I/O backend for the selected debug provider.
@return org.virtualbox_7_0.GuestDebugIoProvider
*/
    public org.virtualbox_7_0.GuestDebugIoProvider getDebugIoProvider()
    {
        try
        {
            org.virtualbox_7_0.jaxws.GuestDebugIoProvider retVal = port.iGuestDebugControlGetDebugIoProvider(obj);
            return org.virtualbox_7_0.GuestDebugIoProvider.fromValue(retVal.value());
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
The I/O backend for the selected debug provider.
@param value org.virtualbox_7_0.GuestDebugIoProvider

*/
    public void setDebugIoProvider(org.virtualbox_7_0.GuestDebugIoProvider value)
    {
        try
        {
        port.iGuestDebugControlSetDebugIoProvider(obj, org.virtualbox_7_0.jaxws.GuestDebugIoProvider.fromValue(value.name()));
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
The address to connect to or listen on,
depending on the type.
@return String
*/
    public String getDebugAddress()
    {
        try
        {
            String retVal = port.iGuestDebugControlGetDebugAddress(obj);
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
The address to connect to or listen on,
depending on the type.
@param value String

*/
    public void setDebugAddress(String value)
    {
        try
        {
        port.iGuestDebugControlSetDebugAddress(obj, value);
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
The port to listen on or connect to, depending on the selected I/O
provider. Might be ignored by some providers.
@return Long
*/
    public Long getDebugPort()
    {
        try
        {
            Long retVal = port.iGuestDebugControlGetDebugPort(obj);
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
The port to listen on or connect to, depending on the selected I/O
provider. Might be ignored by some providers.
@param value Long

*/
    public void setDebugPort(Long value)
    {
        try
        {
        port.iGuestDebugControlSetDebugPort(obj, value);
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
    public static IGuestDebugControl queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IGuestDebugControl(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

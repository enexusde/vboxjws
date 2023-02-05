
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
 * ITrustedPlatformModule.java
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
The ITrustedPlatformModule interface represents the settings of the virtual
machine's trusted platform module. This is used only in the{@link org.virtualbox_7_0.IMachine#getTrustedPlatformModule()}attribute.

Interface ID: <code>{CF11D345-0241-4EA9-AC4C-C69ED3D674E3}</code>
*/
public class ITrustedPlatformModule extends IUnknown
{

    public ITrustedPlatformModule(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Type of TPM configured for the virtual machine.
@return org.virtualbox_7_0.TpmType
*/
    public org.virtualbox_7_0.TpmType getType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.TpmType retVal = port.iTrustedPlatformModuleGetType(obj);
            return org.virtualbox_7_0.TpmType.fromValue(retVal.value());
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
Type of TPM configured for the virtual machine.
@param value org.virtualbox_7_0.TpmType

*/
    public void setType(org.virtualbox_7_0.TpmType value)
    {
        try
        {
        port.iTrustedPlatformModuleSetType(obj, org.virtualbox_7_0.jaxws.TpmType.fromValue(value.name()));
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
Location of the TPM. This is only used for the TpmType_Swtpm type of TPM
where the location denotes a<b>hostname:port</b>where to connect to.
@return String
*/
    public String getLocation()
    {
        try
        {
            String retVal = port.iTrustedPlatformModuleGetLocation(obj);
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
Location of the TPM. This is only used for the TpmType_Swtpm type of TPM
where the location denotes a<b>hostname:port</b>where to connect to.
@param value String

*/
    public void setLocation(String value)
    {
        try
        {
        port.iTrustedPlatformModuleSetLocation(obj, value);
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
    public static ITrustedPlatformModule queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new ITrustedPlatformModule(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

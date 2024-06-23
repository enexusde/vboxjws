
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
 * IDHCPGroupConfig.java
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
A configuration that applies to a group of NICs.

Interface ID: <code>{537707F7-EBF9-4D5C-7AEA-877BFC4256BA}</code>
*/
public class IDHCPGroupConfig extends IDHCPConfig
{

    public IDHCPGroupConfig(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
The group name.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.idhcpGroupConfigGetName(obj);
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
The group name.
@param value String

*/
    public void setName(String value)
    {
        try
        {
        port.idhcpGroupConfigSetName(obj, value);
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
Group membership conditions.

Add new conditions by calling{@link org.virtualbox_7_0.IDHCPGroupConfig#addCondition(Boolean,org.virtualbox_7_0.DHCPGroupConditionType,String)}and use{@link org.virtualbox_7_0.IDHCPGroupCondition#remove()}to remove.
@return List&lt;org.virtualbox_7_0.IDHCPGroupCondition&gt;
*/
    public List<org.virtualbox_7_0.IDHCPGroupCondition> getConditions()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.idhcpGroupConfigGetConditions(obj);
            return Helper.wrap(org.virtualbox_7_0.IDHCPGroupCondition.class, getObjMgr(), port, retVal);
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
    public static IDHCPGroupConfig queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IDHCPGroupConfig(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Adds a new condition.
*/
    public org.virtualbox_7_0.IDHCPGroupCondition addCondition(Boolean inclusive, org.virtualbox_7_0.DHCPGroupConditionType type, String value)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.idhcpGroupConfigAddCondition(obj, inclusive, org.virtualbox_7_0.jaxws.DHCPGroupConditionType.fromValue(type.name()), value);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IDHCPGroupCondition(retVal, getObjMgr(), port) : null;
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
Removes all conditions.
*/
    public void removeAllConditions()
    {
        try
        {
        port.idhcpGroupConfigRemoveAllConditions(obj);
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

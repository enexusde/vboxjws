
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
 * IDHCPGroupCondition.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;
import java.util.List;

public class IDHCPGroupCondition extends IUnknown
{

    public IDHCPGroupCondition(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Whether this is an inclusive or exclusive group membership condition
@return Boolean
*/
    public Boolean getInclusive()
    {
        try
        {
            Boolean retVal = port.idhcpGroupConditionGetInclusive(obj);
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
Whether this is an inclusive or exclusive group membership condition
@param value Boolean

*/
    public void setInclusive(Boolean value)
    {
        try
        {
        port.idhcpGroupConditionSetInclusive(obj, value);
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
Defines how the{@link org.virtualbox_7_0.IDHCPGroupCondition#getValue()}is interpreted.
@return org.virtualbox_7_0.DHCPGroupConditionType
*/
    public org.virtualbox_7_0.DHCPGroupConditionType getType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.DHCPGroupConditionType retVal = port.idhcpGroupConditionGetType(obj);
            return org.virtualbox_7_0.DHCPGroupConditionType.fromValue(retVal.value());
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
Defines how the{@link org.virtualbox_7_0.IDHCPGroupCondition#getValue()}is interpreted.
@param value org.virtualbox_7_0.DHCPGroupConditionType

*/
    public void setType(org.virtualbox_7_0.DHCPGroupConditionType value)
    {
        try
        {
        port.idhcpGroupConditionSetType(obj, org.virtualbox_7_0.jaxws.DHCPGroupConditionType.fromValue(value.name()));
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
The condition value.
@return String
*/
    public String getValue()
    {
        try
        {
            String retVal = port.idhcpGroupConditionGetValue(obj);
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
The condition value.
@param value String

*/
    public void setValue(String value)
    {
        try
        {
        port.idhcpGroupConditionSetValue(obj, value);
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
    public static IDHCPGroupCondition queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IDHCPGroupCondition(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Remove this condition from the group.
*/
    public void remove()
    {
        try
        {
        port.idhcpGroupConditionRemove(obj);
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


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
 * IAdditionsFacility.java
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
Structure representing a Guest Additions facility.

Interface ID: <code>{F2F7FAE4-4A06-81FC-A916-78B2DA1FA0E5}</code>
*/
public class IAdditionsFacility
{

    private org.virtualbox_7_0.jaxws.IAdditionsFacility real;
    private VboxPortType port;
    private ObjectRefManager objMgr;

    public IAdditionsFacility(org.virtualbox_7_0.jaxws.IAdditionsFacility real, ObjectRefManager objMgr, VboxPortType port)
    {
        this.real = real;
        this.port = port;
        this.objMgr = objMgr;
    }

    private ObjectRefManager getObjMgr()
    {
        return this.objMgr;
    }

/**
The class this facility is part of.
@return org.virtualbox_7_0.AdditionsFacilityClass
*/
    public org.virtualbox_7_0.AdditionsFacilityClass getClassType()
    {
        org.virtualbox_7_0.jaxws.AdditionsFacilityClass retVal = real.getClassType();
        return org.virtualbox_7_0.AdditionsFacilityClass.fromValue(retVal.value());
    }

/**
Timestamp of the last status update,
in milliseconds since 1970-01-01 UTC.
@return Long
*/
    public Long getLastUpdated()
    {
        Long retVal = real.getLastUpdated();
        return retVal;
    }

/**
The facility's friendly name.
@return String
*/
    public String getName()
    {
        String retVal = real.getName();
        return retVal;
    }

/**
The current status.
@return org.virtualbox_7_0.AdditionsFacilityStatus
*/
    public org.virtualbox_7_0.AdditionsFacilityStatus getStatus()
    {
        org.virtualbox_7_0.jaxws.AdditionsFacilityStatus retVal = real.getStatus();
        return org.virtualbox_7_0.AdditionsFacilityStatus.fromValue(retVal.value());
    }

/**
The facility's type ID.
@return org.virtualbox_7_0.AdditionsFacilityType
*/
    public org.virtualbox_7_0.AdditionsFacilityType getType()
    {
        org.virtualbox_7_0.jaxws.AdditionsFacilityType retVal = real.getType();
        return org.virtualbox_7_0.AdditionsFacilityType.fromValue(retVal.value());
    }
}

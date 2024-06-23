
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
 * IHostDrive.java
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
The IHostDrive interface represents the drive of the physical machine.
It is not a complete medium description and, therefore, it is not IMedium
based. The interface is used to get information about a host drive and
its partitioning.
NOTE: The object operates in limited mode if the user cannot open the drive
and parse the partition table.  In limited mode on the{@link org.virtualbox_7_0.IHostDrive#getDrivePath()}and{@link org.virtualbox_7_0.IHostDrive#getModel()}attributes can be accessed, the rest will fail with E_ACCESSDENIED.


Interface ID: <code>{70E2E0C3-332C-4D72-B822-2DB16E2CB31B}</code>
*/
public class IHostDrive extends IUnknown
{

    public IHostDrive(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
The path of the drive. Platform dependent.
@return String
*/
    public String getDrivePath()
    {
        try
        {
            String retVal = port.iHostDriveGetDrivePath(obj);
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
The scheme of the partitions the disk has.
@return org.virtualbox_7_0.PartitioningType
*/
    public org.virtualbox_7_0.PartitioningType getPartitioningType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.PartitioningType retVal = port.iHostDriveGetPartitioningType(obj);
            return org.virtualbox_7_0.PartitioningType.fromValue(retVal.value());
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
The GUID of the disk.
@return String
*/
    public String getUuid()
    {
        try
        {
            String retVal = port.iHostDriveGetUuid(obj);
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
The size of the sector in bytes.
@return Long
*/
    public Long getSectorSize()
    {
        try
        {
            Long retVal = port.iHostDriveGetSectorSize(obj);
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
The size of the disk in bytes.
@return Long
*/
    public Long getSize()
    {
        try
        {
            Long retVal = port.iHostDriveGetSize(obj);
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
The model string of the drive if available.
@return String
*/
    public String getModel()
    {
        try
        {
            String retVal = port.iHostDriveGetModel(obj);
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
List of partitions available on the host drive.
@return List&lt;org.virtualbox_7_0.IHostDrivePartition&gt;
*/
    public List<org.virtualbox_7_0.IHostDrivePartition> getPartitions()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<org.virtualbox_7_0.jaxws.IHostDrivePartition> retVal = port.iHostDriveGetPartitions(obj);
            return Helper.wrap2(org.virtualbox_7_0.IHostDrivePartition.class, org.virtualbox_7_0.jaxws.IHostDrivePartition.class, objMgr, port, retVal);
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
    public static IHostDrive queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IHostDrive(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

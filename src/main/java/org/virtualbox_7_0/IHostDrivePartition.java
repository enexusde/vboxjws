
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
 * IHostDrivePartition.java
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
The IHostDrivePartition interface represents the partition of the host drive.
To enumerate all available drives partitions in the host, use the{@link org.virtualbox_7_0.IHost#getHostDrives()}attribute.

Interface ID: <code>{4F529A14-ACE3-407C-9C49-066E8E8027F0}</code>
*/
public class IHostDrivePartition
{

    private org.virtualbox_7_0.jaxws.IHostDrivePartition real;
    private VboxPortType port;
    private ObjectRefManager objMgr;

    public IHostDrivePartition(org.virtualbox_7_0.jaxws.IHostDrivePartition real, ObjectRefManager objMgr, VboxPortType port)
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
The number of the partition. Represents the system number of the
partition, e.g. /dev/sdX in the linux, where X is the number
returned.
@return Long
*/
    public Long getNumber()
    {
        Long retVal = real.getNumber();
        return retVal;
    }

/**
The partition size in bytes.
@return Long
*/
    public Long getSize()
    {
        Long retVal = real.getSize();
        return retVal;
    }

/**
The start byte offset of this partition in bytes relative to the
beginning of the hard disk.
@return Long
*/
    public Long getStart()
    {
        Long retVal = real.getStart();
        return retVal;
    }

/**
A translation of{@link org.virtualbox_7_0.IHostDrivePartition#getTypeMBR()}and{@link org.virtualbox_7_0.IHostDrivePartition#getTypeUuid()}when possible, otherwise
set to{@link org.virtualbox_7_0.PartitionType#Unknown}.
@return org.virtualbox_7_0.PartitionType
*/
    public org.virtualbox_7_0.PartitionType getType()
    {
        org.virtualbox_7_0.jaxws.PartitionType retVal = real.getType();
        return org.virtualbox_7_0.PartitionType.fromValue(retVal.value());
    }

/**
The partition is bootable when TRUE.
@return Boolean
*/
    public Boolean getActive()
    {
        Boolean retVal = real.isActive();
        return retVal;
    }

/**
The raw MBR partition type, 0 for non-MBR disks.
@return Long
*/
    public Long getTypeMBR()
    {
        Long retVal = real.getTypeMBR();
        return retVal;
    }

/**
The cylinder (0..1023) of the first sector in the partition on an MBR disk, zero for not an MBR disk.
@return Long
*/
    public Long getStartCylinder()
    {
        Long retVal = real.getStartCylinder();
        return retVal;
    }

/**
The head (0..255) of the first sector in the partition on an MBR disk, zero for not an MBR disk.
@return Long
*/
    public Long getStartHead()
    {
        Long retVal = real.getStartHead();
        return retVal;
    }

/**
The sector (0..63) of the first sector in the partition on an MBR disk, zero for not an MBR disk.
@return Long
*/
    public Long getStartSector()
    {
        Long retVal = real.getStartSector();
        return retVal;
    }

/**
The cylinder (0..1023) of the last sector (inclusive) in the partition on an MBR disk, zero for not an MBR disk.
@return Long
*/
    public Long getEndCylinder()
    {
        Long retVal = real.getEndCylinder();
        return retVal;
    }

/**
The head (0..255) of the last sector (inclusive) in the partition on an MBR disk, zero for not an MBR disk.
@return Long
*/
    public Long getEndHead()
    {
        Long retVal = real.getEndHead();
        return retVal;
    }

/**
The sector (1..63) of the last sector (inclusive) in the partition on an MBR disk, zero for not an MBR disk.
@return Long
*/
    public Long getEndSector()
    {
        Long retVal = real.getEndSector();
        return retVal;
    }

/**
The partition type when GUID partitioning scheme is used, NULL UUID value for not a GPT disks.
@return String
*/
    public String getTypeUuid()
    {
        String retVal = real.getTypeUuid();
        return retVal;
    }

/**
The GUID of the partition when GUID partitioning scheme is used, NULL UUID value for not a GPT disks.
@return String
*/
    public String getUuid()
    {
        String retVal = real.getUuid();
        return retVal;
    }

/**
The name of the partition if GPT partitioning is used, empty if not a GPT disk.
@return String
*/
    public String getName()
    {
        String retVal = real.getName();
        return retVal;
    }
}

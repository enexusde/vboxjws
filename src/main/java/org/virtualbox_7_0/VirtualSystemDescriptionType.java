
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
 * VirtualSystemDescriptionType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Used with{@link org.virtualbox_7_0.IVirtualSystemDescription}to describe the type of
a configuration value.
Interface ID: <code>{247F8B6F-1042-4C15-8910-3E3C64395EB7}</code>
*/
public enum VirtualSystemDescriptionType
{
    Ignore(1),
    OS(2),
    Name(3),
    Product(4),
    Vendor(5),
    Version(6),
    ProductUrl(7),
    VendorUrl(8),
    Description(9),
    License(10),
    Miscellaneous(11),
    CPU(12),
    Memory(13),
    HardDiskControllerIDE(14),
    HardDiskControllerSATA(15),
    HardDiskControllerSCSI(16),
    HardDiskControllerSAS(17),
    HardDiskImage(18),
    Floppy(19),
    CDROM(20),
    NetworkAdapter(21),
    USBController(22),
    SoundCard(23),

/**
Optional, may be unset by the API caller. If this is changed by the
API caller it defines the absolute path of the VM settings file and
therefore also the VM folder with highest priority.
*/
    SettingsFile(24),

/**
Optional, may be unset by the API caller. If set (and{@link org.virtualbox_7_0.VirtualSystemDescriptionType#SettingsFile}is not changed),
defines the VM base folder (taking the primary group into account if
also set).
*/
    BaseFolder(25),

/**
Optional, empty by default and may be unset by the API caller.
Defines the primary group of the VM after import. May influence the
selection of the VM folder. Additional groups may be configured later
using{@link org.virtualbox_7_0.IMachine#getGroups()}, after importing.
*/
    PrimaryGroup(26),
    CloudInstanceShape(27),
    CloudDomain(28),
    CloudBootDiskSize(29),
    CloudBucket(30),
    CloudOCIVCN(31),
    CloudPublicIP(32),
    CloudProfileName(33),
    CloudOCISubnet(34),
    CloudKeepObject(35),
    CloudLaunchInstance(36),
    CloudInstanceId(37),
    CloudImageId(38),
    CloudInstanceState(39),
    CloudImageState(40),
    CloudInstanceDisplayName(41),
    CloudImageDisplayName(42),
    CloudOCILaunchMode(43),
    CloudPrivateIP(44),
    CloudBootVolumeId(45),
    CloudOCIVCNCompartment(46),
    CloudOCISubnetCompartment(47),
    CloudPublicSSHKey(48),
    BootingFirmware(49),
    CloudInitScriptPath(50),
    CloudCompartmentId(51),
    CloudShapeCpus(52),
    CloudShapeMemory(53),
    HardDiskControllerVirtioSCSI(60);

    private final int value;

    VirtualSystemDescriptionType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static VirtualSystemDescriptionType fromValue(long v)
    {
        for (VirtualSystemDescriptionType c: VirtualSystemDescriptionType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static VirtualSystemDescriptionType fromValue(String v)
    {
        return valueOf(VirtualSystemDescriptionType.class, v);
    }
}


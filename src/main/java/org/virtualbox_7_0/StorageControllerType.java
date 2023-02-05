
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
 * StorageControllerType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
The exact variant of storage controller hardware presented
to the guest; see{@link org.virtualbox_7_0.IStorageController#getControllerType()}.
Interface ID: <code>{A77D457D-66A3-4368-B24C-293D0F562A9F}</code>
*/
public enum StorageControllerType
{

/**
null value. Never used by the API.
*/
    Null(0),

/**
A SCSI controller of the LsiLogic variant.
*/
    LsiLogic(1),

/**
A SCSI controller of the BusLogic variant.
*/
    BusLogic(2),

/**
An Intel AHCI SATA controller; this is the only variant for SATA.
*/
    IntelAhci(3),

/**
An IDE controller of the PIIX3 variant.
*/
    PIIX3(4),

/**
An IDE controller of the PIIX4 variant.
*/
    PIIX4(5),

/**
An IDE controller of the ICH6 variant.
*/
    ICH6(6),

/**
A floppy disk controller; this is the only variant for floppy drives.
*/
    I82078(7),

/**
A variant of the LsiLogic controller using SAS.
*/
    LsiLogicSas(8),

/**
Special USB based storage controller.
*/
    USB(9),

/**
An NVMe storage controller.
*/
    NVMe(10),

/**
Virtio SCSI storage controller.
*/
    VirtioSCSI(11);

    private final int value;

    StorageControllerType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static StorageControllerType fromValue(long v)
    {
        for (StorageControllerType c: StorageControllerType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static StorageControllerType fromValue(String v)
    {
        return valueOf(StorageControllerType.class, v);
    }
}


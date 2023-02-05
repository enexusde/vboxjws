
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
 * MediumVariant.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Virtual medium image variant. More than one flag may be set.
@see org.virtualbox_7_0.IMedium

Interface ID: <code>{0282E97F-4EF3-4411-A8E0-47C384803CB6}</code>
*/
public enum MediumVariant
{

/**
No particular variant requested, results in using the backend default.
*/
    Standard(0),

/**
VMDK image split in chunks of less than 2GByte.
*/
    VmdkSplit2G(0x01),

/**
VMDK image representing a raw disk.
*/
    VmdkRawDisk(0x02),

/**
VMDK streamOptimized image. Special import/export format which is
read-only/append-only.
*/
    VmdkStreamOptimized(0x04),

/**
VMDK format variant used on ESX products.
*/
    VmdkESX(0x08),

/**
Fill new blocks with zeroes while expanding image file.
*/
    VdiZeroExpand(0x100),

/**
Fixed image. Only allowed for base images.
*/
    Fixed(0x10000),

/**
Differencing image. Only allowed for child images.
*/
    Diff(0x20000),

/**
Special flag which requests formatting the disk image. Right now
supported for floppy images only.
*/
    Formatted(0x20000000),

/**
Special flag which suppresses automatic creation of the subdirectory.
Only used when passing the medium variant as an input parameter.
*/
    NoCreateDir(0x40000000);

    private final int value;

    MediumVariant(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static MediumVariant fromValue(long v)
    {
        for (MediumVariant c: MediumVariant.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static MediumVariant fromValue(String v)
    {
        return valueOf(MediumVariant.class, v);
    }
}


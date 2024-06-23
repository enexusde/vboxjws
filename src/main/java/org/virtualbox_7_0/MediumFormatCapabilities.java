
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
 * MediumFormatCapabilities.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Medium format capability flags.
Interface ID: <code>{7342BA79-7CE0-4D94-8F86-5ED5A185D9BD}</code>
*/
public enum MediumFormatCapabilities
{

/**
Supports UUIDs as expected by VirtualBox code.
*/
    Uuid(0x01),

/**
Supports creating fixed size images, allocating all space instantly.
*/
    CreateFixed(0x02),

/**
Supports creating dynamically growing images, allocating space on
demand.
*/
    CreateDynamic(0x04),

/**
Supports creating images split in chunks of a bit less than 2 GBytes.
*/
    CreateSplit2G(0x08),

/**
Supports being used as a format for differencing media (see{@link org.virtualbox_7_0.IMedium#createDiffStorage(org.virtualbox_7_0.IMedium,List)}).
*/
    Differencing(0x10),

/**
Supports asynchronous I/O operations for at least some configurations.
*/
    Asynchronous(0x20),

/**
The format backend operates on files (the{@link org.virtualbox_7_0.IMedium#getLocation()}attribute of the medium specifies a file used to store medium
data; for a list of supported file extensions see{@link org.virtualbox_7_0.IMediumFormat#describeFileExtensions(Holder,Holder)}).
*/
    File(0x40),

/**
The format backend uses the property interface to configure the storage
location and properties (the{@link org.virtualbox_7_0.IMediumFormat#describeProperties(Holder,Holder,Holder,Holder,Holder)}method is used to get access to properties supported by the given medium format).
*/
    Properties(0x80),

/**
The format backend uses the TCP networking interface for network access.
*/
    TcpNetworking(0x100),

/**
The format backend supports virtual filesystem functionality.
*/
    VFS(0x200),

/**
The format backend supports discarding blocks.
*/
    Discard(0x400),

/**
Indicates that this is a frequently used format backend.
*/
    Preferred(0x800),
    CapabilityMask(0xFFF);

    private final int value;

    MediumFormatCapabilities(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static MediumFormatCapabilities fromValue(long v)
    {
        for (MediumFormatCapabilities c: MediumFormatCapabilities.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static MediumFormatCapabilities fromValue(String v)
    {
        return valueOf(MediumFormatCapabilities.class, v);
    }
}


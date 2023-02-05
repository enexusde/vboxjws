
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
 * FsObjType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
File system object (file) types.
Interface ID: <code>{34A0D1AA-491E-E209-E150-84964D6CEE5F}</code>
*/
public enum FsObjType
{

/**
Used either if the object has type that is not in this enum, or
if the type has not yet been determined or set.
*/
    Unknown(1),

/**
FIFO or named pipe, depending on the platform/terminology.
*/
    Fifo(2),

/**
Character device.
*/
    DevChar(3),

/**
Directory.
*/
    Directory(4),

/**
Block device.
*/
    DevBlock(5),

/**
Regular file.
*/
    File(6),

/**
Symbolic link.
*/
    Symlink(7),

/**
Socket.
*/
    Socket(8),

/**
A white-out file.  Found in union mounts where it is used for
hiding files after deletion, I think.
*/
    WhiteOut(9);

    private final int value;

    FsObjType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static FsObjType fromValue(long v)
    {
        for (FsObjType c: FsObjType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static FsObjType fromValue(String v)
    {
        return valueOf(FsObjType.class, v);
    }
}


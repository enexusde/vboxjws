
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
 * FileAccessMode.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
File open access mode for use with{@link org.virtualbox_7_0.IGuestSession#fileOpen(String,org.virtualbox_7_0.FileAccessMode,org.virtualbox_7_0.FileOpenAction,Long)}and{@link org.virtualbox_7_0.IGuestSession#fileOpenEx(String,org.virtualbox_7_0.FileAccessMode,org.virtualbox_7_0.FileOpenAction,org.virtualbox_7_0.FileSharingMode,Long,List)}.
Interface ID: <code>{231A578F-47FB-EA30-3B3E-8489558227F0}</code>
*/
public enum FileAccessMode
{

/**
Open the file only with read access.
*/
    ReadOnly(1),

/**
Open the file only with write access.
*/
    WriteOnly(2),

/**
Open the file with both read and write access.
*/
    ReadWrite(3),

/**
Open the file for appending only, no read or seek access.
NOTE: Not yet implemented.

*/
    AppendOnly(4),

/**
Open the file for appending and read.  Writes always goes to the
end of the file while reads are done at the current or specified file
position.
NOTE: Not yet implemented.

*/
    AppendRead(5);

    private final int value;

    FileAccessMode(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static FileAccessMode fromValue(long v)
    {
        for (FileAccessMode c: FileAccessMode.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static FileAccessMode fromValue(String v)
    {
        return valueOf(FileAccessMode.class, v);
    }
}


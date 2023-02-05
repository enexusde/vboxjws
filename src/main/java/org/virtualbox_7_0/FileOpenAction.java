
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
 * FileOpenAction.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
What action{@link org.virtualbox_7_0.IGuestSession#fileOpen(String,org.virtualbox_7_0.FileAccessMode,org.virtualbox_7_0.FileOpenAction,Long)}and{@link org.virtualbox_7_0.IGuestSession#fileOpenEx(String,org.virtualbox_7_0.FileAccessMode,org.virtualbox_7_0.FileOpenAction,org.virtualbox_7_0.FileSharingMode,Long,List)}should take whether the file being opened exists or not.
Interface ID: <code>{12BC97E2-4FC6-A8B4-4F84-0CBF4AB970D2}</code>
*/
public enum FileOpenAction
{

/**
Opens an existing file, fails if no file exists. (Was "oe".)
*/
    OpenExisting(1),

/**
Opens an existing file, creates a new one if no file exists. (Was "oc".)
*/
    OpenOrCreate(2),

/**
Creates a new file is no file exists, fails if there is a file there already. (Was "ce".)
*/
    CreateNew(3),

/**
Creates a new file, replace any existing file. (Was "ca".)
NOTE: Currently undefined whether we will inherit mode and ACLs from the
existing file or replace them.

*/
    CreateOrReplace(4),

/**
Opens and truncate an existing file, fails if no file exists. (Was "ot".)
*/
    OpenExistingTruncated(5),

/**
Opens an existing file and places the file pointer at the end of
the file, creates the file if it does not exist.  This action implies
write access. (Was "oa".)
NOTE: Deprecated. Only here for historical reasons. Do not use!

*/
    AppendOrCreate(99);

    private final int value;

    FileOpenAction(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static FileOpenAction fromValue(long v)
    {
        for (FileOpenAction c: FileOpenAction.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static FileOpenAction fromValue(String v)
    {
        return valueOf(FileOpenAction.class, v);
    }
}


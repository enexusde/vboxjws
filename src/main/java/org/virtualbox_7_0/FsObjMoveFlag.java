
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
 * FsObjMoveFlag.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
File moving flags.
Interface ID: <code>{2450A05D-80C6-4C96-9A17-94D73293FF86}</code>
*/
public enum FsObjMoveFlag
{

/**
No flag set.
*/
    None(0),

/**
Replace the destination file, symlink, etc if it exists, however this
does not allow replacing any directories.
*/
    Replace(1),

/**
Follow symbolic links in the final components or not (only applied to
the given source and target paths, not to anything else).
*/
    FollowLinks(2),

/**
Allow moving directories accross file system boundraries. Because it
is could be a big undertaking, we require extra assurance that we
should do it when requested.
*/
    AllowDirectoryMoves(4);

    private final int value;

    FsObjMoveFlag(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static FsObjMoveFlag fromValue(long v)
    {
        for (FsObjMoveFlag c: FsObjMoveFlag.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static FsObjMoveFlag fromValue(String v)
    {
        return valueOf(FsObjMoveFlag.class, v);
    }
}


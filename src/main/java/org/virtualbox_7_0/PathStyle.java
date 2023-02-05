
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
 * PathStyle.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
The path style of a system.
(Values matches the RTPATH_STR_F_STYLE_XXX defines in iprt/path.h!)
Interface ID: <code>{97303A5B-42E8-0A55-D16F-D2A92C295261}</code>
*/
public enum PathStyle
{

/**
DOS-style paths with forward and backward slashes, drive
letters and UNC.  Known from DOS, OS/2 and Windows.
*/
    DOS(1),

/**
UNIX-style paths with forward slashes only.
*/
    UNIX(2),

/**
The path style is not known, most likely because the Guest Additions
aren't active yet.
*/
    Unknown(8);

    private final int value;

    PathStyle(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static PathStyle fromValue(long v)
    {
        for (PathStyle c: PathStyle.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static PathStyle fromValue(String v)
    {
        return valueOf(PathStyle.class, v);
    }
}


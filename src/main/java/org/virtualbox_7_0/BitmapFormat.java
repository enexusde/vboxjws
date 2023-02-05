
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
 * BitmapFormat.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Format of a bitmap. Generic values for formats used by
the source bitmap, the screen shot or image update APIs.
Interface ID: <code>{AFB2BF39-8B1E-4F9F-8948-D1B887F83EB0}</code>
*/
public enum BitmapFormat
{

/**
Unknown buffer format (the user may not assume any particular format of
the buffer).
*/
    Opaque(0),

/**
Generic BGR format without alpha channel.
Pixel layout depends on the number of bits per pixel:<ul><li><b>32</b>- bits 31:24 undefined, bits 23:16 R, bits 15:8 G, bits 7:0 B.</li><li><b>16</b>- bits 15:11 R, bits 10:5 G, bits 4:0 B.</li></ul>
*/
    BGR(0x20524742),

/**
4 bytes per pixel: B, G, R, 0.
*/
    BGR0(0x30524742),

/**
4 bytes per pixel: B, G, R, A.
*/
    BGRA(0x41524742),

/**
4 bytes per pixel: R, G, B, A.
*/
    RGBA(0x41424752),

/**
PNG image.
*/
    PNG(0x20474E50),

/**
JPEG image.
*/
    JPEG(0x4745504A);

    private final int value;

    BitmapFormat(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static BitmapFormat fromValue(long v)
    {
        for (BitmapFormat c: BitmapFormat.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static BitmapFormat fromValue(String v)
    {
        return valueOf(BitmapFormat.class, v);
    }
}


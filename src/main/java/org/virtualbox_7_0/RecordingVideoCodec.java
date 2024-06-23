
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
 * RecordingVideoCodec.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Recording video codec enumeration.
Interface ID: <code>{93791063-3E8C-4310-987C-DDB43FF03FFE}</code>
*/
public enum RecordingVideoCodec
{

/**
No codec set.
*/
    None(0),

/**
Motion JPEG.
*/
    MJPEG(1),

/**
MPEG-2, Part 2.
*/
    H262(2),

/**
Advanced Video Coding (AVC), MPEG-4 Part 10.
*/
    H264(3),

/**
High Efficiency Video Coding (HEVC), MPEG-H Part 2.
*/
    H265(4),

/**
Versatile Video Coding (VVC), MPEG-I Part 3.
*/
    H266(5),

/**
VP8 codec.
*/
    VP8(6),

/**
VP9 codec.
*/
    VP9(7),

/**
AOMedia Video 1 codec.
*/
    AV1(8),

/**
Other codec.
*/
    Other(9);

    private final int value;

    RecordingVideoCodec(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static RecordingVideoCodec fromValue(long v)
    {
        for (RecordingVideoCodec c: RecordingVideoCodec.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static RecordingVideoCodec fromValue(String v)
    {
        return valueOf(RecordingVideoCodec.class, v);
    }
}


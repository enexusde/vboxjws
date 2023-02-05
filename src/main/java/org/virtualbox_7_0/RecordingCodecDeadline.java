
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
 * RecordingCodecDeadline.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Recording codec deadline.

How (and if at all) this deadline is being implemented depends on the codec being used.
Interface ID: <code>{53627AE1-31CF-4303-9CD5-0C22FD2637CF}</code>
*/
public enum RecordingCodecDeadline
{

/**
Default deadline.
*/
    Default(0),

/**
Realtime quality, often resulting in poor / basic quality.
*/
    Realtime(1),

/**
Balance between realtime and best deadline.
*/
    Good(2),

/**
Best quality, slowest.
*/
    Best(3);

    private final int value;

    RecordingCodecDeadline(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static RecordingCodecDeadline fromValue(long v)
    {
        for (RecordingCodecDeadline c: RecordingCodecDeadline.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static RecordingCodecDeadline fromValue(String v)
    {
        return valueOf(RecordingCodecDeadline.class, v);
    }
}


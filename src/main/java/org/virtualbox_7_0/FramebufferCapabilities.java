
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
 * FramebufferCapabilities.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Framebuffer capability flags.
Interface ID: <code>{CC395839-30FA-4CA5-AE65-E6360E3EDD7A}</code>
*/
public enum FramebufferCapabilities
{

/**
Requires NotifyUpdateImage. NotifyUpdate must not be called.
*/
    UpdateImage(0x01),

/**
Supports VHWA interface. If set, then
IFramebuffer::processVHWACommand can be called.
*/
    VHWA(0x02),

/**
Supports visible region. If set, then
IFramebuffer::setVisibleRegion can be called.
*/
    VisibleRegion(0x04),

/**
This framebuffer implementation can render a pointer cursor itself.  Unless the
MoveCursor capability is also set the cursor will always be rendered at the
location of (and usually using) the host pointer.
*/
    RenderCursor(0x08),

/**
Supports rendering a pointer cursor anywhere within the guest screen.  Implies
RenderCursor.
*/
    MoveCursor(0x10);

    private final int value;

    FramebufferCapabilities(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static FramebufferCapabilities fromValue(long v)
    {
        for (FramebufferCapabilities c: FramebufferCapabilities.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static FramebufferCapabilities fromValue(String v)
    {
        return valueOf(FramebufferCapabilities.class, v);
    }
}


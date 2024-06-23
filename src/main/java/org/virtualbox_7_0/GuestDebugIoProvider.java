
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
 * GuestDebugIoProvider.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
The enabled guest debug I/O provider. This enumeration represents possible
values for the{@link org.virtualbox_7_0.IGuestDebugControl#getDebugIoProvider()}attribute.
Interface ID: <code>{0CF00B1B-2FF7-414C-81C6-6CF410EAEC4A}</code>
*/
public enum GuestDebugIoProvider
{

/**
No connection available (only useful with{@link org.virtualbox_7_0.GuestDebugProvider#None}).
*/
    None(0),

/**
The remote stub is available through a TCP connection.
*/
    TCP(1),

/**
The remote stub is available through a UDP connection.
*/
    UDP(2),

/**
The remote stub is available through a IPC connection,
namely a named pipe on Windows or a unix socket on other hosts.
*/
    IPC(3);

    private final int value;

    GuestDebugIoProvider(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static GuestDebugIoProvider fromValue(long v)
    {
        for (GuestDebugIoProvider c: GuestDebugIoProvider.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static GuestDebugIoProvider fromValue(String v)
    {
        return valueOf(GuestDebugIoProvider.class, v);
    }
}


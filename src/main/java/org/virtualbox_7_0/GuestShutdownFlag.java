
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
 * GuestShutdownFlag.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Guest shutdown flags.
Interface ID: <code>{28D19C9C-5862-4930-B29A-F117712B4864}</code>
*/
public enum GuestShutdownFlag
{

/**
No flag set.
*/
    None(0),

/**
Performs a reboot after shutdown.
*/
    PowerOff(1),

/**
Performs a reboot after shutdown.
*/
    Reboot(2),

/**
Force the system to shutdown/reboot regardless of objecting
application or other stuff. This flag might not be realized on
all systems.
*/
    Force(4);

    private final int value;

    GuestShutdownFlag(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static GuestShutdownFlag fromValue(long v)
    {
        for (GuestShutdownFlag c: GuestShutdownFlag.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static GuestShutdownFlag fromValue(String v)
    {
        return valueOf(GuestShutdownFlag.class, v);
    }
}


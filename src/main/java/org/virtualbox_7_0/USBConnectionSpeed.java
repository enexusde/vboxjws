
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
 * USBConnectionSpeed.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
USB device/port speed state. This enumeration represents speeds at
which a USB device can communicate with the host.

The speed is a function of both the device itself and the port which
it is attached to, including hubs and cables in the path.
NOTE: Due to differences in USB stack implementations on various hosts,
the reported speed may not exactly match the actual speed.

@see org.virtualbox_7_0.IHostUSBDevice

Interface ID: <code>{D2915840-EA26-4FB4-B72A-21EAF6B888FF}</code>
*/
public enum USBConnectionSpeed
{

/**
null value. Never returned by the API.
*/
    Null(0),

/**
Low speed, 1.5 Mbps.
*/
    Low(1),

/**
Full speed, 12 Mbps.
*/
    Full(2),

/**
High speed, 480 Mbps.
*/
    High(3),

/**
SuperSpeed, 5 Gbps.
*/
    Super(4),

/**
SuperSpeedPlus, 10 Gbps.
*/
    SuperPlus(5);

    private final int value;

    USBConnectionSpeed(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static USBConnectionSpeed fromValue(long v)
    {
        for (USBConnectionSpeed c: USBConnectionSpeed.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static USBConnectionSpeed fromValue(String v)
    {
        return valueOf(USBConnectionSpeed.class, v);
    }
}


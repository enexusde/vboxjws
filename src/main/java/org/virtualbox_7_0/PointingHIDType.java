
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
 * PointingHIDType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Type of pointing device used in a virtual machine.
Interface ID: <code>{B3FD8215-6870-4E61-B6D9-2998FA625DE0}</code>
*/
public enum PointingHIDType
{

/**
No mouse.
*/
    None(1),

/**
PS/2 auxiliary device, a.k.a. mouse.
*/
    PS2Mouse(2),

/**
USB mouse (relative pointer).
*/
    USBMouse(3),

/**
USB tablet (absolute pointer).  Also enables a relative USB mouse in
addition.
*/
    USBTablet(4),

/**
Combined device, working as PS/2 or USB mouse, depending on guest
behavior.  Using this device can have negative performance implications.
*/
    ComboMouse(5),

/**
USB multi-touch device, just touchscreen.  It is a specific mode of the
USB tablet and also enables the mouse device.
*/
    USBMultiTouch(6),

/**
USB multi-touch device, touchscreen plus touchpad.  It also enables the
mouse device.
*/
    USBMultiTouchScreenPlusPad(7);

    private final int value;

    PointingHIDType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static PointingHIDType fromValue(long v)
    {
        for (PointingHIDType c: PointingHIDType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static PointingHIDType fromValue(String v)
    {
        return valueOf(PointingHIDType.class, v);
    }
}


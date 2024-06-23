
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
 * AdditionsFacilityType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Guest Additions facility IDs.
Interface ID: <code>{C4B10D74-DD48-4FF4-9A40-785A2A389ADE}</code>
*/
public enum AdditionsFacilityType
{

/**
No/invalid facility.
*/
    None(0),

/**
VirtualBox base driver (VBoxGuest).
*/
    VBoxGuestDriver(20),

/**
Auto-logon modules (VBoxGINA, VBoxCredProv, pam_vbox).
*/
    AutoLogon(90),

/**
VirtualBox system service (VBoxService).
*/
    VBoxService(100),

/**
VirtualBox desktop integration (VBoxTray on Windows, VBoxClient on non-Windows).
*/
    VBoxTrayClient(101),

/**
Seamless guest desktop integration.
*/
    Seamless(1000),

/**
Guest graphics mode. If not enabled, seamless rendering will not work, resize hints
are not immediately acted on and guest display resizes are probably not initiated by
the Guest Additions.
*/
    Graphics(1100),

/**
Guest supports monitor hotplug.
*/
    MonitorAttach(1101),

/**
All facilities selected.
*/
    All(2147483646);

    private final int value;

    AdditionsFacilityType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static AdditionsFacilityType fromValue(long v)
    {
        for (AdditionsFacilityType c: AdditionsFacilityType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static AdditionsFacilityType fromValue(String v)
    {
        return valueOf(AdditionsFacilityType.class, v);
    }
}


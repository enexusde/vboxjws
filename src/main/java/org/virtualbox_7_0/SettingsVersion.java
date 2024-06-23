
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
 * SettingsVersion.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Settings version of VirtualBox settings files. This is written to
the "version" attribute of the root "VirtualBox" element in the settings
file XML and indicates which VirtualBox version wrote the file.
Interface ID: <code>{B4CC23C2-96F2-419D-830B-BD13C1135DFB}</code>
*/
public enum SettingsVersion
{

/**
Null value, indicates invalid version.
*/
    Null(0),

/**
Legacy settings version, not currently supported.
*/
    v1_0(1),

/**
Legacy settings version, not currently supported.
*/
    v1_1(2),

/**
Legacy settings version, not currently supported.
*/
    v1_2(3),

/**
Legacy settings version, not currently supported.
*/
    v1_3pre(4),

/**
Settings version "1.3", written by VirtualBox 2.0.12.
*/
    v1_3(5),

/**
Intermediate settings version, understood by VirtualBox 2.1.x.
*/
    v1_4(6),

/**
Intermediate settings version, understood by VirtualBox 2.1.x.
*/
    v1_5(7),

/**
Settings version "1.6", written by VirtualBox 2.1.4 (at least).
*/
    v1_6(8),

/**
Settings version "1.7", written by VirtualBox 2.2.x and 3.0.x.
*/
    v1_7(9),

/**
Intermediate settings version "1.8", understood by VirtualBox 3.1.x.
*/
    v1_8(10),

/**
Settings version "1.9", written by VirtualBox 3.1.x.
*/
    v1_9(11),

/**
Settings version "1.10", written by VirtualBox 3.2.x.
*/
    v1_10(12),

/**
Settings version "1.11", written by VirtualBox 4.0.x.
*/
    v1_11(13),

/**
Settings version "1.12", written by VirtualBox 4.1.x.
*/
    v1_12(14),

/**
Settings version "1.13", written by VirtualBox 4.2.x.
*/
    v1_13(15),

/**
Settings version "1.14", written by VirtualBox 4.3.x.
*/
    v1_14(16),

/**
Settings version "1.15", written by VirtualBox 5.0.x.
*/
    v1_15(17),

/**
Settings version "1.16", written by VirtualBox 5.1.x.
*/
    v1_16(18),

/**
Settings version "1.17", written by VirtualBox 6.0.x.
*/
    v1_17(19),

/**
Settings version "1.18", written by VirtualBox 6.1.x.
*/
    v1_18(20),

/**
Settings version "1.19", written by VirtualBox 7.0.x.
*/
    v1_19(21),

/**
Settings version greater than "1.19", written by a future VirtualBox version.
*/
    Future(99999);

    private final int value;

    SettingsVersion(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static SettingsVersion fromValue(long v)
    {
        for (SettingsVersion c: SettingsVersion.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static SettingsVersion fromValue(String v)
    {
        return valueOf(SettingsVersion.class, v);
    }
}


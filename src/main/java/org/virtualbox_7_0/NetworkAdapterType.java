
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
 * NetworkAdapterType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Network adapter type.
Interface ID: <code>{3C2281E4-D952-4E87-8C7D-24379CB6A81C}</code>
*/
public enum NetworkAdapterType
{

/**
Null value (never used by the API).
*/
    Null(0),

/**
AMD PCNet-PCI II network card (Am79C970A).
*/
    Am79C970A(1),

/**
AMD PCNet-FAST III network card (Am79C973).
*/
    Am79C973(2),

/**
Intel PRO/1000 MT Desktop network card (82540EM).
*/
    I82540EM(3),

/**
Intel PRO/1000 T Server network card (82543GC).
*/
    I82543GC(4),

/**
Intel PRO/1000 MT Server network card (82545EM).
*/
    I82545EM(5),

/**
Virtio network device.
*/
    Virtio(6),

/**
AMD PCnet-ISA/NE2100 network card (Am79C960).
*/
    Am79C960(7),

/**
Novell NE2000 network card (NE2000).
*/
    NE2000(8),

/**
Novell NE1000 network card (NE1000).
*/
    NE1000(9),

/**
WD/SMC EtherCard Plus 16 network card (WD8013EBT).
*/
    WD8013(10),

/**
WD/SMC EtherCard Plus network card (WD8003E).
*/
    WD8003(11),

/**
3Com EtherLink II network card (3C503).
*/
    ELNK2(12),

/**
3Com EtherLink network card (3C501/3C500).
*/
    ELNK1(13);

    private final int value;

    NetworkAdapterType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static NetworkAdapterType fromValue(long v)
    {
        for (NetworkAdapterType c: NetworkAdapterType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static NetworkAdapterType fromValue(String v)
    {
        return valueOf(NetworkAdapterType.class, v);
    }
}


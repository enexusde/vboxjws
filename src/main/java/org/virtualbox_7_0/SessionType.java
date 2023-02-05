
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
 * SessionType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Session type. This enumeration represents possible values of the{@link org.virtualbox_7_0.ISession#getType()}attribute.
Interface ID: <code>{A13C02CB-0C2C-421E-8317-AC0E8AAA153A}</code>
*/
public enum SessionType
{

/**
Null value (never used by the API).
*/
    Null(0),

/**
Session has acquired an exclusive write lock on a machine
using{@link org.virtualbox_7_0.IMachine#lockMachine(org.virtualbox_7_0.ISession,org.virtualbox_7_0.LockType)}.
*/
    WriteLock(1),

/**
Session has launched a VM process using{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}
*/
    Remote(2),

/**
Session has obtained a link to another session using{@link org.virtualbox_7_0.IMachine#lockMachine(org.virtualbox_7_0.ISession,org.virtualbox_7_0.LockType)}
*/
    Shared(3);

    private final int value;

    SessionType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static SessionType fromValue(long v)
    {
        for (SessionType c: SessionType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static SessionType fromValue(String v)
    {
        return valueOf(SessionType.class, v);
    }
}


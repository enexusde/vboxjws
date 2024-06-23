
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
 * LockType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Used with{@link org.virtualbox_7_0.IMachine#lockMachine(org.virtualbox_7_0.ISession,org.virtualbox_7_0.LockType)}.
Interface ID: <code>{678AAF14-2815-4C3E-B20A-E86ED0216498}</code>
*/
public enum LockType
{

/**
Placeholder value, do not use when obtaining a lock.
*/
    Null(0),

/**
Request only a shared lock for remote-controlling the machine.
Such a lock allows changing certain VM settings which can be safely
modified for a running VM.
*/
    Shared(1),

/**
Lock the machine for writing. This requests an exclusive lock, i.e.
there cannot be any other API client holding any type of lock for this
VM concurrently. Remember that a VM process counts as an API client
which implicitly holds the equivalent of a shared lock during the
entire VM runtime.
*/
    Write(2),

/**
Lock the machine for writing, and create objects necessary for
running a VM in this process.
*/
    VM(3);

    private final int value;

    LockType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static LockType fromValue(long v)
    {
        for (LockType c: LockType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static LockType fromValue(String v)
    {
        return valueOf(LockType.class, v);
    }
}



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
 * VMProcPriority.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Virtual machine process priorities.
Interface ID: <code>{6FA72DD5-19B7-46BA-BC52-F223C98C7D80}</code>
*/
public enum VMProcPriority
{

/**
Invalid priority, do not use.
*/
    Invalid(0),

/**
Default process priority determined by the OS.
*/
    Default(1),

/**
Assumes a scheduling policy which puts the process at the default
priority and with all threads at the same priority
*/
    Flat(2),

/**
Assumes a scheduling policy which puts the process mostly below the
default priority of the host OS.
*/
    Low(3),

/**
Assume a scheduling policy which shares the CPU resources fairly with
other processes running with the default priority of the host OS.
*/
    Normal(5),

/**
Assumes a scheduling policy which puts the task above the default
priority of the host OS. This policy might easily cause other tasks
in the system to starve.
*/
    High(6);

    private final int value;

    VMProcPriority(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static VMProcPriority fromValue(long v)
    {
        for (VMProcPriority c: VMProcPriority.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static VMProcPriority fromValue(String v)
    {
        return valueOf(VMProcPriority.class, v);
    }
}


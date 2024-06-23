
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
 * ProcessStatus.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Process execution statuses.
Interface ID: <code>{4D52368F-5B48-4BFE-B486-ACF89139B52F}</code>
*/
public enum ProcessStatus
{

/**
Process is in an undefined state.
*/
    Undefined(0),

/**
Process is being started.
*/
    Starting(10),

/**
Process has been started.
*/
    Started(100),

/**
Process has been paused.
*/
    Paused(110),

/**
Process is being terminated.
*/
    Terminating(480),

/**
Process terminated normally.
*/
    TerminatedNormally(500),

/**
Process terminated via signal.
*/
    TerminatedSignal(510),

/**
Process terminated abnormally.
*/
    TerminatedAbnormally(511),

/**
Process timed out and was killed.
*/
    TimedOutKilled(512),

/**
Process timed out and was not killed successfully.
*/
    TimedOutAbnormally(513),

/**
Service/OS is stopping, process was killed.
*/
    Down(600),

/**
Something went wrong.
*/
    Error(800);

    private final int value;

    ProcessStatus(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static ProcessStatus fromValue(long v)
    {
        for (ProcessStatus c: ProcessStatus.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static ProcessStatus fromValue(String v)
    {
        return valueOf(ProcessStatus.class, v);
    }
}


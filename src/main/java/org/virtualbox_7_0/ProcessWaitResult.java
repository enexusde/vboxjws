
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
 * ProcessWaitResult.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Process waiting results. Depending on the process waiting flags (for
more information see{@link org.virtualbox_7_0.ProcessWaitForFlag}) the waiting result
can vary based on the processes' current status.

To wait for a guest process to terminate after it has been
created by{@link org.virtualbox_7_0.IGuestSession#processCreate(String,List,List,List,Long)}or{@link org.virtualbox_7_0.IGuestSession#processCreateEx(String,List,List,List,Long,org.virtualbox_7_0.ProcessPriority,List)}one would specify ProcessWaitFor_Terminate.

If a guest process has been started with ProcessCreateFlag_WaitForStdOut
a client can wait with ProcessWaitResult_StdOut for new data to arrive on
stdout; same applies for ProcessCreateFlag_WaitForStdErr and
ProcessWaitResult_StdErr.
Interface ID: <code>{40719CBE-F192-4FE9-A231-6697B3C8E2B4}</code>
*/
public enum ProcessWaitResult
{

/**
No result was returned. Not being used.
*/
    None(0),

/**
The process has been started.
*/
    Start(1),

/**
The process has been terminated.
*/
    Terminate(2),

/**
The process has changed its status. The status then can
be retrieved via{@link org.virtualbox_7_0.IProcess#getStatus()}.
*/
    Status(3),

/**
Error while executing the process.
*/
    Error(4),

/**
The waiting operation timed out. Also use if the guest process has
timed out in the guest side (kill attempted).
*/
    Timeout(5),

/**
The process signalled that stdin became available for writing.
*/
    StdIn(6),

/**
Data on stdout became available for reading.
*/
    StdOut(7),

/**
Data on stderr became available for reading.
*/
    StdErr(8),

/**
A waiting flag specified in the{@link org.virtualbox_7_0.IProcess#waitFor(Long,Long)}call
is not supported by the guest.
*/
    WaitFlagNotSupported(9);

    private final int value;

    ProcessWaitResult(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static ProcessWaitResult fromValue(long v)
    {
        for (ProcessWaitResult c: ProcessWaitResult.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static ProcessWaitResult fromValue(String v)
    {
        return valueOf(ProcessWaitResult.class, v);
    }
}


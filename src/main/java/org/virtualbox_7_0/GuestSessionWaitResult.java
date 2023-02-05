
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
 * GuestSessionWaitResult.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Guest session waiting results. Depending on the session waiting flags (for
more information see{@link org.virtualbox_7_0.GuestSessionWaitForFlag}) the waiting result
can vary based on the session's current status.

To wait for a guest session to terminate after it has been
created by{@link org.virtualbox_7_0.IGuest#createSession(String,String,String,String)}one would specify
GuestSessionWaitResult_Terminate.
Interface ID: <code>{C0F6A8A5-FDB6-42BF-A582-56C6F82BCD2D}</code>
*/
public enum GuestSessionWaitResult
{

/**
No result was returned. Not being used.
*/
    None(0),

/**
The guest session has been started.
*/
    Start(1),

/**
The guest session has been terminated.
*/
    Terminate(2),

/**
The guest session has changed its status. The status then can
be retrieved via{@link org.virtualbox_7_0.IGuestSession#getStatus()}.
*/
    Status(3),

/**
Error while executing the process.
*/
    Error(4),

/**
The waiting operation timed out. This also will happen
when no event has been occurred matching the
current waiting flags in a{@link org.virtualbox_7_0.IGuestSession#waitFor(Long,Long)}call.
*/
    Timeout(5),

/**
A waiting flag specified in the{@link org.virtualbox_7_0.IGuestSession#waitFor(Long,Long)}call
is not supported by the guest.
*/
    WaitFlagNotSupported(6);

    private final int value;

    GuestSessionWaitResult(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static GuestSessionWaitResult fromValue(long v)
    {
        for (GuestSessionWaitResult c: GuestSessionWaitResult.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static GuestSessionWaitResult fromValue(String v)
    {
        return valueOf(GuestSessionWaitResult.class, v);
    }
}


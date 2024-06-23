
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
 * ProcessCreateFlag.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Guest process execution flags.
NOTE: The values are passed to the Guest Additions, so its not possible
to change (move) or reuse values.here. See GUEST_PROC_CREATE_FLAG_XXX
in GuestControlSvc.h.

Interface ID: <code>{C544CD2B-F02D-4886-9901-71C523DB8DC5}</code>
*/
public enum ProcessCreateFlag
{

/**
No flag set.
*/
    None(0),

/**
Only use the specified timeout value to wait for starting the guest process - the guest
process itself then uses an infinite timeout.
*/
    WaitForProcessStartOnly(1),

/**
Do not report an error when executed processes are still alive when VBoxService or the guest OS is shutting down.
*/
    IgnoreOrphanedProcesses(2),

/**
Do not show the started process according to the guest OS guidelines.
*/
    Hidden(4),

/**
Utilize the user's profile data when exeuting a process. Only available for Windows guests at the moment.
*/
    Profile(8),

/**
The guest process waits until all data from stdout is read out.
*/
    WaitForStdOut(16),

/**
The guest process waits until all data from stderr is read out.
*/
    WaitForStdErr(32),

/**
Expands environment variables in process arguments.
NOTE: This is not yet implemented and is currently silently ignored.
We will document the protocolVersion number for this feature once it
appears, so don't use it till then.

*/
    ExpandArguments(64),

/**
Work around for Windows and OS/2 applications not following normal
argument quoting and escaping rules. The arguments are passed to the
application without any extra quoting, just a single space between each.
NOTE: Present since VirtualBox 4.3.28 and 5.0 beta 3.

*/
    UnquotedArguments(128);

    private final int value;

    ProcessCreateFlag(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static ProcessCreateFlag fromValue(long v)
    {
        for (ProcessCreateFlag c: ProcessCreateFlag.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static ProcessCreateFlag fromValue(String v)
    {
        return valueOf(ProcessCreateFlag.class, v);
    }
}


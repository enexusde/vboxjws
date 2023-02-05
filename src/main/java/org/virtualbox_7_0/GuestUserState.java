
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
 * GuestUserState.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
State a guest user has been changed to.
Interface ID: <code>{B2A82B02-FD3D-4FC2-BA84-6BA5AC8BE198}</code>
*/
public enum GuestUserState
{

/**
Unknown state. Not being used.
*/
    Unknown(0),

/**
A guest user has been successfully logged into
the guest OS.
NOTE: This property is not implemented yet!

*/
    LoggedIn(1),

/**
A guest user has been successfully logged out
of the guest OS.
NOTE: This property is not implemented yet!

*/
    LoggedOut(2),

/**
A guest user has locked its account. This might
include running a password-protected screensaver
in the guest.
NOTE: This property is not implemented yet!

*/
    Locked(3),

/**
A guest user has unlocked its account.
NOTE: This property is not implemented yet!

*/
    Unlocked(4),

/**
A guest user has been disabled by the guest OS.
NOTE: This property is not implemented yet!

*/
    Disabled(5),

/**
A guest user currently is not using the guest OS.The event will be triggered if a guest user is not active for
at least 5 seconds. This threshold can be adjusted by either altering
VBoxService's command line in the guest to<pre>--vminfo-user-idle-threshold &lt;ms&gt;</pre>, or by setting the per-VM guest property<pre>/VirtualBox/GuestAdd/VBoxService/--vminfo-user-idle-threshold &lt;ms&gt;</pre>with the RDONLYGUEST flag on the host. In both cases VBoxService needs
to be restarted in order to get the changes applied.
NOTE: Currently only available for Windows guests since
Windows 2000 SP2.

NOTE: On Windows guests this function currently only supports
reporting contiguous idle times up to 49.7 days per user.

*/
    Idle(6),

/**
A guest user continued using the guest OS after
being idle.
*/
    InUse(7),

/**
A guest user has been successfully created.
NOTE: This property is not implemented yet!

*/
    Created(8),

/**
A guest user has been successfully deleted.
NOTE: This property is not implemented yet!

*/
    Deleted(9),

/**
To guest OS has changed the session of a user.
NOTE: This property is not implemented yet!

*/
    SessionChanged(10),

/**
To guest OS has changed the authentication
credentials of a user. This might include changed passwords
and authentication types.
NOTE: This property is not implemented yet!

*/
    CredentialsChanged(11),

/**
To guest OS has changed the role of a user permanently,
e.g. granting / denying administrative rights.
NOTE: This property is not implemented yet!

*/
    RoleChanged(12),

/**
To guest OS has added a user to a specific
user group.
NOTE: This property is not implemented yet!

*/
    GroupAdded(13),

/**
To guest OS has removed a user from a specific
user group.
NOTE: This property is not implemented yet!

*/
    GroupRemoved(14),

/**
To guest OS temporarily has elevated a user
to perform a certain task.
NOTE: This property is not implemented yet!

*/
    Elevated(15);

    private final int value;

    GuestUserState(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static GuestUserState fromValue(long v)
    {
        for (GuestUserState c: GuestUserState.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static GuestUserState fromValue(String v)
    {
        return valueOf(GuestUserState.class, v);
    }
}


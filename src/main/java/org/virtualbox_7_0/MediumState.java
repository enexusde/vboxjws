
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
 * MediumState.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Virtual medium state.
@see org.virtualbox_7_0.IMedium

Interface ID: <code>{EF41E980-E012-43CD-9DEA-479D4EF14D13}</code>
*/
public enum MediumState
{

/**
Associated medium storage does not exist (either was not created yet or
was deleted).
*/
    NotCreated(0),

/**
Associated storage exists and accessible; this gets set if the
accessibility check performed by{@link org.virtualbox_7_0.IMedium#refreshState()}was successful.
*/
    Created(1),

/**
Medium is locked for reading (see{@link org.virtualbox_7_0.IMedium#lockRead()}),
no data modification is possible.
*/
    LockedRead(2),

/**
Medium is locked for writing (see{@link org.virtualbox_7_0.IMedium#lockWrite()}),
no concurrent data reading or modification is possible.
*/
    LockedWrite(3),

/**
Medium accessibility check (see{@link org.virtualbox_7_0.IMedium#refreshState()}) has
not yet been performed, or else, associated medium storage is not
accessible. In the first case,{@link org.virtualbox_7_0.IMedium#getLastAccessError()}is empty, in the second case, it describes the error that occurred.
*/
    Inaccessible(4),

/**
Associated medium storage is being created.
*/
    Creating(5),

/**
Associated medium storage is being deleted.
*/
    Deleting(6);

    private final int value;

    MediumState(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static MediumState fromValue(long v)
    {
        for (MediumState c: MediumState.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static MediumState fromValue(String v)
    {
        return valueOf(MediumState.class, v);
    }
}


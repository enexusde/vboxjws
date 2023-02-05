
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
 * MediumType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Virtual medium type. For each{@link org.virtualbox_7_0.IMedium}, this defines how the medium is
attached to a virtual machine (see{@link org.virtualbox_7_0.IMediumAttachment}) and what happens
when a snapshot (see{@link org.virtualbox_7_0.ISnapshot}) is taken of a virtual machine which has
the medium attached. At the moment DVD and floppy media are always of type "writethrough".
Interface ID: <code>{FE663FB5-C244-4E1B-9D81-C628B417DD04}</code>
*/
public enum MediumType
{

/**
Normal medium (attached directly or indirectly, preserved
when taking snapshots).
*/
    Normal(0),

/**
Immutable medium (attached indirectly, changes are wiped out
the next time the virtual machine is started).
*/
    Immutable(1),

/**
Write through medium (attached directly, ignored when
taking snapshots).
*/
    Writethrough(2),

/**
Allow using this medium concurrently by several machines.
NOTE: Present since VirtualBox 3.2.0, and accepted since 3.2.8.

*/
    Shareable(3),

/**
A readonly medium, which can of course be used by several machines.
NOTE: Present and accepted since VirtualBox 4.0.

*/
    Readonly(4),

/**
A medium which is indirectly attached, so that one base medium can
be used for several VMs which have their own differencing medium to
store their modifications. In some sense a variant of Immutable
with unset AutoReset flag in each differencing medium.
NOTE: Present and accepted since VirtualBox 4.0.

*/
    MultiAttach(5);

    private final int value;

    MediumType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static MediumType fromValue(long v)
    {
        for (MediumType c: MediumType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static MediumType fromValue(String v)
    {
        return valueOf(MediumType.class, v);
    }
}


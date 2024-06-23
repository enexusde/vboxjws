
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
 * ParavirtProvider.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
The paravirtualized guest interface provider. This enumeration represents possible
values for the{@link org.virtualbox_7_0.IMachine#getParavirtProvider()}attribute.
Interface ID: <code>{696453EC-3742-4A05-BEAD-658CCBF2C944}</code>
*/
public enum ParavirtProvider
{

/**
No provider is used.
*/
    None(0),

/**
A default provider is automatically chosen according to the guest OS type.
*/
    Default(1),

/**
Used for VMs which didn't used to have any provider settings. Usually
interpreted as  None for most VMs.
*/
    Legacy(2),

/**
A minimal set of features to expose to the paravirtualized guest.
*/
    Minimal(3),

/**
Microsoft Hyper-V.
*/
    HyperV(4),

/**
Linux KVM.
*/
    KVM(5);

    private final int value;

    ParavirtProvider(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static ParavirtProvider fromValue(long v)
    {
        for (ParavirtProvider c: ParavirtProvider.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static ParavirtProvider fromValue(String v)
    {
        return valueOf(ParavirtProvider.class, v);
    }
}


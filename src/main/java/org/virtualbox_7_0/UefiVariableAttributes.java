
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
 * UefiVariableAttributes.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Possible variable attributes. More than one flag may be set.
@see org.virtualbox_7_0.IUefiVariableStore

Interface ID: <code>{CDA505EC-B444-4AEF-B55C-B687717BDAC5}</code>
*/
public enum UefiVariableAttributes
{

/**
No attributes set.
*/
    None(0),

/**
Variable is stored in non volatile storage.
*/
    NonVolatile(0x01),

/**
Variable can be accessed from the boot services.
*/
    BootServiceAccess(0x02),

/**
Variable can be accessed from the runtime.
*/
    RuntimeAccess(0x04),

/**
Variable contains a hardware error record.
*/
    HwErrorRecord(0x08),

/**
Writing to this variable requires an authenticated source.
*/
    AuthWriteAccess(0x100),

/**
Variable was written with a time based authentication.
*/
    AuthTimeBasedWriteAccess(0x200),

/**
The variable can be appended only.
*/
    AuthAppendWrite(0x400);

    private final int value;

    UefiVariableAttributes(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static UefiVariableAttributes fromValue(long v)
    {
        for (UefiVariableAttributes c: UefiVariableAttributes.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static UefiVariableAttributes fromValue(String v)
    {
        return valueOf(UefiVariableAttributes.class, v);
    }
}


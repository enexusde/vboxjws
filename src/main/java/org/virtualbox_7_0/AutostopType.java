
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
 * AutostopType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Autostop types, used with{@link org.virtualbox_7_0.IMachine#getAutostopType()}.
Interface ID: <code>{6BB96740-CF34-470D-AAB2-2CD48EA2E10E}</code>
*/
public enum AutostopType
{

/**
Stopping the VM during system shutdown is disabled.
*/
    Disabled(1),

/**
The state of the VM will be saved when the system shuts down.
*/
    SaveState(2),

/**
The VM is powered off when the system shuts down.
*/
    PowerOff(3),

/**
An ACPI shutdown event is generated.
*/
    AcpiShutdown(4);

    private final int value;

    AutostopType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static AutostopType fromValue(long v)
    {
        for (AutostopType c: AutostopType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static AutostopType fromValue(String v)
    {
        return valueOf(AutostopType.class, v);
    }
}


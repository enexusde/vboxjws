
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
 * HWVirtExPropertyType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Hardware virtualization property type. This enumeration represents possible values
for the{@link org.virtualbox_7_0.IMachine#getHWVirtExProperty(org.virtualbox_7_0.HWVirtExPropertyType)}and{@link org.virtualbox_7_0.IMachine#setHWVirtExProperty(org.virtualbox_7_0.HWVirtExPropertyType,Boolean)}methods.
Interface ID: <code>{00069D9C-00B5-460C-00DD-64250024F7AA}</code>
*/
public enum HWVirtExPropertyType
{

/**
Null value (never used by the API).
*/
    Null(0),

/**
Whether hardware virtualization (VT-x/AMD-V) is enabled at all. If
such extensions are not available, they will not be used.
*/
    Enabled(1),

/**
Whether VT-x VPID is enabled. If this extension is not available, it will not be used.
*/
    VPID(2),

/**
Whether Nested Paging is enabled. If this extension is not available, it will not be used.
*/
    NestedPaging(3),

/**
Whether VT-x unrestricted execution is enabled. If this feature is not available, it will not be used.
*/
    UnrestrictedExecution(4),

/**
Whether large page allocation is enabled; requires nested paging and a 64-bit host.
*/
    LargePages(5),

/**
Whether the VM should fail to start if hardware virtualization (VT-x/AMD-V) cannot be used. If
not set, there will be an automatic fallback to software virtualization.
*/
    Force(6),

/**
Use the native hypervisor API instead of the VirtualBox one (HM) for VT-X/AMD-V.  This is
ignored if{@link org.virtualbox_7_0.HWVirtExPropertyType#Enabled}isn't set.
*/
    UseNativeApi(7),

/**
Whether AMD-V Virtualized VMSAVE/VMLOAD is enabled. If this feature is not available, it will not
be used.
*/
    VirtVmsaveVmload(8);

    private final int value;

    HWVirtExPropertyType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static HWVirtExPropertyType fromValue(long v)
    {
        for (HWVirtExPropertyType c: HWVirtExPropertyType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static HWVirtExPropertyType fromValue(String v)
    {
        return valueOf(HWVirtExPropertyType.class, v);
    }
}


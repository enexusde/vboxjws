
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
 * ExportOptions.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Export options, used with{@link org.virtualbox_7_0.IAppliance#write(String,List,String)}.
Interface ID: <code>{8F45EB08-FD34-41EE-AF95-A880BDEE5554}</code>
*/
public enum ExportOptions
{

/**
Write the optional manifest file (.mf) which is used for integrity
checks prior import.
*/
    CreateManifest(1),

/**
Export DVD images. Default is not to export them as it is rarely
needed for typical VMs.
*/
    ExportDVDImages(2),

/**
Do not export any MAC address information. Default is to keep them
to avoid losing information which can cause trouble after import, at the
price of risking duplicate MAC addresses, if the import options are used
to keep them.
*/
    StripAllMACs(3),

/**
Do not export any MAC address information, except for adapters
using NAT. Default is to keep them to avoid losing information which can
cause trouble after import, at the price of risking duplicate MAC
addresses, if the import options are used to keep them.
*/
    StripAllNonNATMACs(4);

    private final int value;

    ExportOptions(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static ExportOptions fromValue(long v)
    {
        for (ExportOptions c: ExportOptions.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static ExportOptions fromValue(String v)
    {
        return valueOf(ExportOptions.class, v);
    }
}


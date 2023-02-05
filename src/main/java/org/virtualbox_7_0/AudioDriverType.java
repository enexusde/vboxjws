
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
 * AudioDriverType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Host audio driver type.
Interface ID: <code>{32B4ACFD-79AB-4B7E-9A1C-92E99F4E000B}</code>
*/
public enum AudioDriverType
{

/**
Use the default audio driver automatically determined for the host
that this VirtualBox instance is running on.
Useful for VMs which need to run on different host OSes.
*/
    Default(0),

/**
Null value, also means "dummy audio driver".
*/
    Null(1),

/**
Open Sound System (Linux / Unix hosts only).
*/
    OSS(2),

/**
Advanced Linux Sound Architecture (Linux hosts only).
*/
    ALSA(3),

/**
PulseAudio (Linux hosts only).
*/
    Pulse(4),

/**
Windows multimedia (Windows hosts only, not supported at the moment).
*/
    WinMM(5),

/**
DirectSound (Windows hosts only).
*/
    DirectSound(6),

/**
Windows Audio Session (Windows hosts only).
*/
    WAS(7),

/**
CoreAudio (Mac hosts only).
*/
    CoreAudio(8),

/**
Reserved for historical reasons.
*/
    MMPM(9),

/**
Reserved for historical reasons.
*/
    SolAudio(10);

    private final int value;

    AudioDriverType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static AudioDriverType fromValue(long v)
    {
        for (AudioDriverType c: AudioDriverType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static AudioDriverType fromValue(String v)
    {
        return valueOf(AudioDriverType.class, v);
    }
}


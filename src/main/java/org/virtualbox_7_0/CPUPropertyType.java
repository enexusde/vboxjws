
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
 * CPUPropertyType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;

/**
Virtual CPU property type. This enumeration represents possible values of the
IMachine get- and setCPUProperty methods.
Interface ID: <code>{3FCFE589-CA66-468F-E313-656F9D0B2EB6}</code>
*/
public enum CPUPropertyType
{

/**
Null value (never used by the API).
*/
    Null(0),

/**
This setting determines whether VirtualBox will expose the Physical Address
Extension (PAE) feature of the host CPU to the guest. Note that in case PAE
is not available, it will not be reported.
*/
    PAE(1),

/**
This setting determines whether VirtualBox will advertise long mode
(i.e. 64-bit guest support) and let the guest enter it.
*/
    LongMode(2),

/**
This setting determines whether a triple fault within a guest will
trigger an internal error condition and stop the VM (default) or reset
the virtual CPU/VM and continue execution.
*/
    TripleFaultReset(3),

/**
This setting determines whether an APIC is part of the virtual CPU.
This feature can only be turned off when the X2APIC feature is off.
*/
    APIC(4),

/**
This setting determines whether an x2APIC is part of the virtual CPU.
Since this feature implies that the APIC feature is present, it
automatically enables the APIC feature when set.
*/
    X2APIC(5),

/**
If set, force an indirect branch prediction barrier on VM exits if the
host CPU supports it.  This setting will significantly slow down workloads
causing many VM exits, so it is only recommended for situation where there
is a real need to be paranoid.
*/
    IBPBOnVMExit(6),

/**
If set, force an indirect branch prediction barrier on VM entry if the
host CPU supports it.  This setting will significantly slow down workloads
causing many VM exits, so it is only recommended for situation where there
is a real need to be paranoid.
*/
    IBPBOnVMEntry(7),

/**
Enabled the hardware virtualization (AMD-V/VT-x) feature on the guest CPU.
This requires hardware virtualization on the host CPU.
*/
    HWVirt(8),

/**
If set, the speculation control CPUID bits and MSRs, when available on the
host, are exposed to the guest. Depending on the host CPU and operating
system, this may significantly slow down workloads causing many VM exits.
*/
    SpecCtrl(9),

/**
If set, the speculation controls are managed by the host. This is intended
for guests which do not set the speculation controls themselves.
Note! This has not yet been implemented beyond leaving everything to the host OS.
*/
    SpecCtrlByHost(10),

/**
If set and the host is affected by CVE-2018-3646, flushes the level 1 data
cache when the EMT is scheduled to do ring-0 guest execution.  There could
be a small performance penalty for certain typs of workloads.
For security reasons this setting will be enabled by default.
*/
    L1DFlushOnEMTScheduling(11),

/**
If set and the host is affected by CVE-2018-3646, flushes the level 1 data
on every VM entry.  This setting may significantly slow down workloads
causing many VM exits, so it is only recommended for situation where there
is a real need to be paranoid.
*/
    L1DFlushOnVMEntry(12),

/**
If set and the host is affected by CVE-2018-12126, CVE-2018-12127, or
CVE-2018-12130, clears the relevant MDS buffers when the EMT is scheduled
to do ring-0 guest execution.  There could be a small performance penalty
for certain typs of workloads. For security reasons this setting will be
enabled by default.
*/
    MDSClearOnEMTScheduling(13),

/**
If set and the host is affected by CVE-2018-12126, CVE-2018-12127, or
CVE-2018-12130, clears the relevant MDS buffers on every VM entry.  This
setting may slow down workloads causing many VM exits, so it is only
recommended for situation where there is a real need to be paranoid.
*/
    MDSClearOnVMEntry(14);

    private final int value;

    CPUPropertyType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static CPUPropertyType fromValue(long v)
    {
        for (CPUPropertyType c: CPUPropertyType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static CPUPropertyType fromValue(String v)
    {
        return valueOf(CPUPropertyType.class, v);
    }
}


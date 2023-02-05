
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
 * IPCIDeviceAttachment.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;
import java.util.List;


/**
Information about PCI attachments.

Interface ID: <code>{91F33D6F-E621-4F70-A77E-15F0E3C714D5}</code>
*/
public class IPCIDeviceAttachment
{

    private org.virtualbox_7_0.jaxws.IPCIDeviceAttachment real;
    private VboxPortType port;
    private ObjectRefManager objMgr;

    public IPCIDeviceAttachment(org.virtualbox_7_0.jaxws.IPCIDeviceAttachment real, ObjectRefManager objMgr, VboxPortType port)
    {
        this.real = real;
        this.port = port;
        this.objMgr = objMgr;
    }

    private ObjectRefManager getObjMgr()
    {
        return this.objMgr;
    }

/**
Device name.
@return String
*/
    public String getName()
    {
        String retVal = real.getName();
        return retVal;
    }

/**
If this is physical or virtual device.
@return Boolean
*/
    public Boolean getIsPhysicalDevice()
    {
        Boolean retVal = real.isIsPhysicalDevice();
        return retVal;
    }

/**
Address of device on the host, applicable only to host devices.
@return Integer
*/
    public Integer getHostAddress()
    {
        Integer retVal = real.getHostAddress();
        return retVal;
    }

/**
Address of device in the guest.
@return Integer
*/
    public Integer getGuestAddress()
    {
        Integer retVal = real.getGuestAddress();
        return retVal;
    }
}

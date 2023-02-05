
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
 * IHostUSBDevice.java
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
The IHostUSBDevice interface represents a physical USB device attached
to the host computer.

Besides properties inherited from IUSBDevice, this interface adds the{@link #getState()}property that holds the current state of the USB
device.
@see org.virtualbox_7_0.IHost#getUSBDevices()
@see org.virtualbox_7_0.IHost#getUSBDeviceFilters()


Interface ID: <code>{C19073DD-CC7B-431B-98B2-951FDA8EAB89}</code>
*/
public class IHostUSBDevice extends IUSBDevice
{

    public IHostUSBDevice(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Current state of the device.
@return org.virtualbox_7_0.USBDeviceState
*/
    public org.virtualbox_7_0.USBDeviceState getState()
    {
        try
        {
            org.virtualbox_7_0.jaxws.USBDeviceState retVal = port.iHostUSBDeviceGetState(obj);
            return org.virtualbox_7_0.USBDeviceState.fromValue(retVal.value());
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public static IHostUSBDevice queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IHostUSBDevice(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

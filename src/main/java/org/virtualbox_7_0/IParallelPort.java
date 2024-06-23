
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
 * IParallelPort.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;
import java.util.List;


/**
The IParallelPort interface represents the virtual parallel port device.

The virtual parallel port device acts like an ordinary parallel port
inside the virtual machine. This device communicates to the real
parallel port hardware using the name of the parallel device on the host
computer specified in the #path attribute.

Each virtual parallel port device is assigned a base I/O address and an
IRQ number that will be reported to the guest operating system and used
to operate the given parallel port from within the virtual machine.
@see org.virtualbox_7_0.IMachine#getParallelPort(Long)


Interface ID: <code>{788B87DF-7708-444B-9EEF-C116CE423D39}</code>
*/
public class IParallelPort extends IUnknown
{

    public IParallelPort(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Slot number this parallel port is plugged into. Corresponds to
the value you pass to{@link org.virtualbox_7_0.IMachine#getParallelPort(Long)}to obtain this instance.
@return Long
*/
    public Long getSlot()
    {
        try
        {
            Long retVal = port.iParallelPortGetSlot(obj);
            return retVal;
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

/**
Flag whether the parallel port is enabled. If disabled,
the parallel port will not be reported to the guest OS.
@return Boolean
*/
    public Boolean getEnabled()
    {
        try
        {
            Boolean retVal = port.iParallelPortGetEnabled(obj);
            return retVal;
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

/**
Flag whether the parallel port is enabled. If disabled,
the parallel port will not be reported to the guest OS.
@param value Boolean

*/
    public void setEnabled(Boolean value)
    {
        try
        {
        port.iParallelPortSetEnabled(obj, value);
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

/**
Base I/O address of the parallel port.
@return Long
*/
    public Long getIOBase()
    {
        try
        {
            Long retVal = port.iParallelPortGetIOBase(obj);
            return retVal;
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

/**
Base I/O address of the parallel port.
@param value Long

*/
    public void setIOBase(Long value)
    {
        try
        {
        port.iParallelPortSetIOBase(obj, value);
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

/**
IRQ number of the parallel port.
@return Long
*/
    public Long getIRQ()
    {
        try
        {
            Long retVal = port.iParallelPortGetIRQ(obj);
            return retVal;
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

/**
IRQ number of the parallel port.
@param value Long

*/
    public void setIRQ(Long value)
    {
        try
        {
        port.iParallelPortSetIRQ(obj, value);
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

/**
Host parallel device name. If this parallel port is enabled, setting a
null or an empty string as this attribute's value will result in
the parallel port behaving as if not connected to any device.
@return String
*/
    public String getPath()
    {
        try
        {
            String retVal = port.iParallelPortGetPath(obj);
            return retVal;
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

/**
Host parallel device name. If this parallel port is enabled, setting a
null or an empty string as this attribute's value will result in
the parallel port behaving as if not connected to any device.
@param value String

*/
    public void setPath(String value)
    {
        try
        {
        port.iParallelPortSetPath(obj, value);
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
    public static IParallelPort queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IParallelPort(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

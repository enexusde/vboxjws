
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
 * ISerialPort.java
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
The ISerialPort interface represents the virtual serial port device.

The virtual serial port device acts like an ordinary serial port
inside the virtual machine. This device communicates to the real
serial port hardware in one of two modes: host pipe or host device.

In host pipe mode, the #path attribute specifies the path to the pipe on
the host computer that represents a serial port. The #server attribute
determines if this pipe is created by the virtual machine process at
machine startup or it must already exist before starting machine
execution.

In host device mode, the #path attribute specifies the name of the
serial port device on the host computer.

There is also a third communication mode: the disconnected mode. In this
mode, the guest OS running inside the virtual machine will be able to
detect the serial port, but all port write operations will be discarded
and all port read operations will return no data.
@see org.virtualbox_7_0.IMachine#getSerialPort(Long)


Interface ID: <code>{5587D0F6-A227-4F23-8278-2F675EEA1BB2}</code>
*/
public class ISerialPort extends IUnknown
{

    public ISerialPort(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Slot number this serial port is plugged into. Corresponds to
the value you pass to{@link org.virtualbox_7_0.IMachine#getSerialPort(Long)}to obtain this instance.
@return Long
*/
    public Long getSlot()
    {
        try
        {
            Long retVal = port.iSerialPortGetSlot(obj);
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
Flag whether the serial port is enabled. If disabled,
the serial port will not be reported to the guest OS.
@return Boolean
*/
    public Boolean getEnabled()
    {
        try
        {
            Boolean retVal = port.iSerialPortGetEnabled(obj);
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
Flag whether the serial port is enabled. If disabled,
the serial port will not be reported to the guest OS.
@param value Boolean

*/
    public void setEnabled(Boolean value)
    {
        try
        {
        port.iSerialPortSetEnabled(obj, value);
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
Base I/O address of the serial port.
@return Long
*/
    public Long getIOBase()
    {
        try
        {
            Long retVal = port.iSerialPortGetIOBase(obj);
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
Base I/O address of the serial port.
@param value Long

*/
    public void setIOBase(Long value)
    {
        try
        {
        port.iSerialPortSetIOBase(obj, value);
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
IRQ number of the serial port.
@return Long
*/
    public Long getIRQ()
    {
        try
        {
            Long retVal = port.iSerialPortGetIRQ(obj);
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
IRQ number of the serial port.
@param value Long

*/
    public void setIRQ(Long value)
    {
        try
        {
        port.iSerialPortSetIRQ(obj, value);
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
How is this port connected to the host.
NOTE: Changing this attribute may fail if the conditions for{@link #getPath()}are not met.

@return org.virtualbox_7_0.PortMode
*/
    public org.virtualbox_7_0.PortMode getHostMode()
    {
        try
        {
            org.virtualbox_7_0.jaxws.PortMode retVal = port.iSerialPortGetHostMode(obj);
            return org.virtualbox_7_0.PortMode.fromValue(retVal.value());
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
How is this port connected to the host.
NOTE: Changing this attribute may fail if the conditions for{@link #getPath()}are not met.

@param value org.virtualbox_7_0.PortMode

*/
    public void setHostMode(org.virtualbox_7_0.PortMode value)
    {
        try
        {
        port.iSerialPortSetHostMode(obj, org.virtualbox_7_0.jaxws.PortMode.fromValue(value.name()));
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
Flag whether this serial port acts as a server (creates a new pipe on
the host) or as a client (uses the existing pipe). This attribute is
used only when{@link #getHostMode()}is PortMode_HostPipe or PortMode_TCP.
@return Boolean
*/
    public Boolean getServer()
    {
        try
        {
            Boolean retVal = port.iSerialPortGetServer(obj);
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
Flag whether this serial port acts as a server (creates a new pipe on
the host) or as a client (uses the existing pipe). This attribute is
used only when{@link #getHostMode()}is PortMode_HostPipe or PortMode_TCP.
@param value Boolean

*/
    public void setServer(Boolean value)
    {
        try
        {
        port.iSerialPortSetServer(obj, value);
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
Path to the serial port's pipe on the host when{@link org.virtualbox_7_0.ISerialPort#getHostMode()}is
PortMode_HostPipe, the host serial device name when{@link org.virtualbox_7_0.ISerialPort#getHostMode()}is PortMode_HostDevice or the TCP<b>port</b>(server) or<b>hostname:port</b>(client) when{@link org.virtualbox_7_0.ISerialPort#getHostMode()}is PortMode_TCP.
For those cases, setting a  null or empty string as the attribute's
value is an error. Otherwise, the value of this property is ignored.
@return String
*/
    public String getPath()
    {
        try
        {
            String retVal = port.iSerialPortGetPath(obj);
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
Path to the serial port's pipe on the host when{@link org.virtualbox_7_0.ISerialPort#getHostMode()}is
PortMode_HostPipe, the host serial device name when{@link org.virtualbox_7_0.ISerialPort#getHostMode()}is PortMode_HostDevice or the TCP<b>port</b>(server) or<b>hostname:port</b>(client) when{@link org.virtualbox_7_0.ISerialPort#getHostMode()}is PortMode_TCP.
For those cases, setting a  null or empty string as the attribute's
value is an error. Otherwise, the value of this property is ignored.
@param value String

*/
    public void setPath(String value)
    {
        try
        {
        port.iSerialPortSetPath(obj, value);
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
Selects the emulated UART implementation.
@return org.virtualbox_7_0.UartType
*/
    public org.virtualbox_7_0.UartType getUartType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.UartType retVal = port.iSerialPortGetUartType(obj);
            return org.virtualbox_7_0.UartType.fromValue(retVal.value());
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
Selects the emulated UART implementation.
@param value org.virtualbox_7_0.UartType

*/
    public void setUartType(org.virtualbox_7_0.UartType value)
    {
        try
        {
        port.iSerialPortSetUartType(obj, org.virtualbox_7_0.jaxws.UartType.fromValue(value.name()));
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
    public static ISerialPort queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new ISerialPort(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

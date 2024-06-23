
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
 * IProcess.java
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
Abstract parent interface for processes handled by VirtualBox.

Interface ID: <code>{BC68370C-8A02-45F3-A07D-A67AA72756AA}</code>
*/
public class IProcess extends IUnknown
{

    public IProcess(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
The arguments this process is using for execution.
@return List&lt;String&gt;
*/
    public List<String> getArguments()
    {
        try
        {
            List<String> retVal = port.iProcessGetArguments(obj);
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
The initial process environment.  Not yet implemented.
@return List&lt;String&gt;
*/
    public List<String> getEnvironment()
    {
        try
        {
            List<String> retVal = port.iProcessGetEnvironment(obj);
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
Event source for process events.
@return org.virtualbox_7_0.IEventSource
*/
    public org.virtualbox_7_0.IEventSource getEventSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iProcessGetEventSource(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IEventSource(retVal, getObjMgr(), port) : null;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        finally
        {
            getObjMgr().allowObjRelease();
        }
    }

/**
Full path of the actual executable image.
@return String
*/
    public String getExecutablePath()
    {
        try
        {
            String retVal = port.iProcessGetExecutablePath(obj);
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
The exit code. Only available when the process has been
terminated normally.
@return Integer
*/
    public Integer getExitCode()
    {
        try
        {
            Integer retVal = port.iProcessGetExitCode(obj);
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
The friendly name of this process.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iProcessGetName(obj);
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
The process ID (PID).
@return Long
*/
    public Long getPID()
    {
        try
        {
            Long retVal = port.iProcessGetPID(obj);
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
The current process status; see{@link org.virtualbox_7_0.ProcessStatus}for more information.
@return org.virtualbox_7_0.ProcessStatus
*/
    public org.virtualbox_7_0.ProcessStatus getStatus()
    {
        try
        {
            org.virtualbox_7_0.jaxws.ProcessStatus retVal = port.iProcessGetStatus(obj);
            return org.virtualbox_7_0.ProcessStatus.fromValue(retVal.value());
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
    public static IProcess queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IProcess(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Waits for one or more events to happen.
@param waitFor Specifies what to wait for;
see{@link org.virtualbox_7_0.ProcessWaitForFlag}for more information.

@param timeoutMS Timeout (in ms) to wait for the operation to complete.
Pass 0 for an infinite timeout.

@return The overall wait result;
see{@link org.virtualbox_7_0.ProcessWaitResult}for more information.

*/
    public org.virtualbox_7_0.ProcessWaitResult waitFor(Long waitFor, Long timeoutMS)
    {
        try
        {
            org.virtualbox_7_0.jaxws.ProcessWaitResult retVal;
        retVal = port.iProcessWaitFor(obj, waitFor, timeoutMS);
           return org.virtualbox_7_0.ProcessWaitResult.fromValue(retVal.value());
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
Waits for one or more events to happen.
Scriptable version of{@link #waitFor(Long,Long)}.
@param waitFor Specifies what to wait for;
see{@link org.virtualbox_7_0.ProcessWaitForFlag}for more information.

@param timeoutMS Timeout (in ms) to wait for the operation to complete.
Pass 0 for an infinite timeout.

@return The overall wait result;
see{@link org.virtualbox_7_0.ProcessWaitResult}for more information.

*/
    public org.virtualbox_7_0.ProcessWaitResult waitForArray(List<org.virtualbox_7_0.ProcessWaitForFlag> waitFor, Long timeoutMS)
    {
        try
        {
            org.virtualbox_7_0.jaxws.ProcessWaitResult retVal;
        retVal = port.iProcessWaitForArray(obj, Helper.convertEnums(org.virtualbox_7_0.ProcessWaitForFlag.class, org.virtualbox_7_0.jaxws.ProcessWaitForFlag.class, waitFor), timeoutMS);
           return org.virtualbox_7_0.ProcessWaitResult.fromValue(retVal.value());
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
Reads data from a running process.
@param handle Handle to read from. Usually 0 is stdin.

@param toRead Number of bytes to read.

@param timeoutMS Timeout (in ms) to wait for the operation to complete.
Pass 0 for an infinite timeout.

@return Array of data read.

*/
    public byte[] read(Long handle, Long toRead, Long timeoutMS)
    {
        try
        {
            /*base64*/String retVal;
        retVal = port.iProcessRead(obj, handle, toRead, timeoutMS);
           return Helper.decodeBase64(retVal);
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
Writes data to a running process.
@param handle Handle to write to. Usually 0 is stdin, 1 is stdout and 2 is stderr.

@param flags A combination of{@link org.virtualbox_7_0.ProcessInputFlag}flags.

@param data Array of bytes to write. The size of the array also specifies
how much to write.

@param timeoutMS Timeout (in ms) to wait for the operation to complete.
Pass 0 for an infinite timeout.

@return How many bytes were written.

*/
    public Long write(Long handle, Long flags, byte[] data, Long timeoutMS)
    {
        try
        {
            Long retVal;
        retVal = port.iProcessWrite(obj, handle, flags, Helper.encodeBase64(data), timeoutMS);
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
Writes data to a running process.
Scriptable version of{@link #write(Long,Long,byte[],Long)}.
@param handle Handle to write to. Usually 0 is stdin, 1 is stdout and 2 is stderr.

@param flags A combination of{@link org.virtualbox_7_0.ProcessInputFlag}flags.

@param data Array of bytes to write. The size of the array also specifies
how much to write.

@param timeoutMS Timeout (in ms) to wait for the operation to complete.
Pass 0 for an infinite timeout.

@return How may bytes were written.

*/
    public Long writeArray(Long handle, List<org.virtualbox_7_0.ProcessInputFlag> flags, byte[] data, Long timeoutMS)
    {
        try
        {
            Long retVal;
        retVal = port.iProcessWriteArray(obj, handle, Helper.convertEnums(org.virtualbox_7_0.ProcessInputFlag.class, org.virtualbox_7_0.jaxws.ProcessInputFlag.class, flags), Helper.encodeBase64(data), timeoutMS);
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
Terminates (kills) a running process.
NOTE: It can take up to 30 seconds to get a guest process killed. In
case a guest process could not be killed an appropriate error is
returned.

*/
    public void terminate()
    {
        try
        {
        port.iProcessTerminate(obj);
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
}

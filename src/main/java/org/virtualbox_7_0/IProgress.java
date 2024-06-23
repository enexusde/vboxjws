
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
 * IProgress.java
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
The IProgress interface is used to track and control
asynchronous tasks within VirtualBox.

An instance of this is returned every time VirtualBox starts
an asynchronous task (in other words, a separate thread) which
continues to run after a method call returns. For example,{@link org.virtualbox_7_0.IMachine#saveState()}, which saves the state of
a running virtual machine, can take a long time to complete.
To be able to display a progress bar, a user interface such as
the VirtualBox graphical user interface can use the IProgress
object returned by that method.

Note that IProgress is a "read-only" interface in the sense
that only the VirtualBox internals behind the Main API can
create and manipulate progress objects, whereas client code
can only use the IProgress object to monitor a task's
progress and, if{@link #getCancelable()}is  true,
cancel the task by calling{@link #cancel()}.

A task represented by IProgress consists of either one or
several sub-operations that run sequentially, one by one (see{@link #getOperation()}and{@link #getOperationCount()}).
Every operation is identified by a number (starting from 0)
and has a separate description.

You can find the individual percentage of completion of the current
operation in{@link #getOperationPercent()}and the
percentage of completion of the task as a whole
in{@link #getPercent()}.

Similarly, you can wait for the completion of a particular
operation via{@link #waitForOperationCompletion(Long,Integer)}or
for the completion of the whole task via{@link #waitForCompletion(Integer)}.

Interface ID: <code>{D7B98D2B-30E8-447E-99CB-E31BECAE6AE4}</code>
*/
public class IProgress extends IUnknown
{

    public IProgress(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
ID of the task.
@return String
*/
    public String getId()
    {
        try
        {
            String retVal = port.iProgressGetId(obj);
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
Description of the task.
@return String
*/
    public String getDescription()
    {
        try
        {
            String retVal = port.iProgressGetDescription(obj);
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
Initiator of the task.
@return IUnknown
*/
    public IUnknown getInitiator()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iProgressGetInitiator(obj);
            return (retVal.length() > 0) ? new IUnknown(retVal, getObjMgr(), port) : null;
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
Whether the task can be interrupted.
@return Boolean
*/
    public Boolean getCancelable()
    {
        try
        {
            Boolean retVal = port.iProgressGetCancelable(obj);
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
Current progress value of the task as a whole, in percent.
This value depends on how many operations are already complete.
Returns 100 if{@link #getCompleted()}is  true.
@return Long
*/
    public Long getPercent()
    {
        try
        {
            Long retVal = port.iProgressGetPercent(obj);
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
Estimated remaining time until the task completes, in
seconds. Returns 0 once the task has completed; returns -1
if the remaining time cannot be computed, in particular if
the current progress is 0.

Even if a value is returned, the estimate will be unreliable
for low progress values. It will become more reliable as the
task progresses; it is not recommended to display an ETA
before at least 20% of a task have completed.
@return Integer
*/
    public Integer getTimeRemaining()
    {
        try
        {
            Integer retVal = port.iProgressGetTimeRemaining(obj);
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
Whether the task has been completed.
@return Boolean
*/
    public Boolean getCompleted()
    {
        try
        {
            Boolean retVal = port.iProgressGetCompleted(obj);
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
Whether the task has been canceled.
@return Boolean
*/
    public Boolean getCanceled()
    {
        try
        {
            Boolean retVal = port.iProgressGetCanceled(obj);
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
Result code of the progress task.
Valid only if{@link #getCompleted()}is  true.
@return Integer
*/
    public Integer getResultCode()
    {
        try
        {
            Integer retVal = port.iProgressGetResultCode(obj);
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
Extended information about the unsuccessful result of the
progress operation. May be  null if no extended information
is available.
Valid only if{@link #getCompleted()}is  true and{@link #getResultCode()}indicates a failure.
@return org.virtualbox_7_0.IVirtualBoxErrorInfo
*/
    public org.virtualbox_7_0.IVirtualBoxErrorInfo getErrorInfo()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iProgressGetErrorInfo(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IVirtualBoxErrorInfo(retVal, getObjMgr(), port) : null;
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
Number of sub-operations this task is divided into.
Every task consists of at least one suboperation.
@return Long
*/
    public Long getOperationCount()
    {
        try
        {
            Long retVal = port.iProgressGetOperationCount(obj);
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
Number of the sub-operation being currently executed.
@return Long
*/
    public Long getOperation()
    {
        try
        {
            Long retVal = port.iProgressGetOperation(obj);
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
Description of the sub-operation being currently executed.
@return String
*/
    public String getOperationDescription()
    {
        try
        {
            String retVal = port.iProgressGetOperationDescription(obj);
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
Progress value of the current sub-operation only, in percent.
@return Long
*/
    public Long getOperationPercent()
    {
        try
        {
            Long retVal = port.iProgressGetOperationPercent(obj);
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
Weight value of the current sub-operation only.
@return Long
*/
    public Long getOperationWeight()
    {
        try
        {
            Long retVal = port.iProgressGetOperationWeight(obj);
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
When non-zero, this specifies the number of milliseconds after which
the operation will automatically be canceled. This can only be set on
cancelable objects.
@return Long
*/
    public Long getTimeout()
    {
        try
        {
            Long retVal = port.iProgressGetTimeout(obj);
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
When non-zero, this specifies the number of milliseconds after which
the operation will automatically be canceled. This can only be set on
cancelable objects.
@param value Long

*/
    public void setTimeout(Long value)
    {
        try
        {
        port.iProgressSetTimeout(obj, value);
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
    public org.virtualbox_7_0.IEventSource getEventSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iProgressGetEventSource(obj);
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
    public static IProgress queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IProgress(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Waits until the task is done (including all sub-operations)
with a given timeout in milliseconds; specify -1 for an indefinite wait.

Note that the VirtualBox/XPCOM/COM/native event queues of the calling
thread are not processed while waiting. Neglecting event queues may
have dire consequences (degrade performance, resource hogs,
deadlocks, etc.), this is specially so for the main thread on
platforms using XPCOM. Callers are advised wait for short periods
and service their event queues between calls, or to create a worker
thread to do the waiting.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Failed to wait for task completion.</dd>
</dl>

@param timeout Maximum time in milliseconds to wait or -1 to wait indefinitely.

*/
    public void waitForCompletion(Integer timeout)
    {
        try
        {
        port.iProgressWaitForCompletion(obj, timeout);
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
Waits until the given operation is done with a given timeout in
milliseconds; specify -1 for an indefinite wait.

See{@link #waitForCompletion(Integer)}
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Failed to wait for operation completion.</dd>
</dl>

@param operation Number of the operation to wait for.
Must be less than{@link #getOperationCount()}.

@param timeout Maximum time in milliseconds to wait or -1 to wait indefinitely.

*/
    public void waitForOperationCompletion(Long operation, Integer timeout)
    {
        try
        {
        port.iProgressWaitForOperationCompletion(obj, operation, timeout);
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
Cancels the task.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Operation cannot be canceled.</dd>
</dl>

NOTE: If{@link #getCancelable()}is  false, then this method will fail.

*/
    public void cancel()
    {
        try
        {
        port.iProgressCancel(obj);
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

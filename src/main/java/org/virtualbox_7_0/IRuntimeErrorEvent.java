
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
 * IRuntimeErrorEvent.java
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
Notification when an error happens during the virtual
machine execution.

There are three kinds of runtime errors:<ul><li><i>fatal</i></li><li><i>non-fatal with retry</i></li><li><i>non-fatal warnings</i></li></ul><b>Fatal</b>errors are indicated by the  fatal parameter set
to  true. In case of fatal errors, the virtual machine
execution is always paused before calling this notification, and
the notification handler is supposed either to immediately save
the virtual machine state using{@link org.virtualbox_7_0.IMachine#saveState()}or power it off using{@link org.virtualbox_7_0.IConsole#powerDown()}.
Resuming the execution can lead to unpredictable results.<b>Non-fatal</b>errors and warnings are indicated by the
fatal parameter set to  false. If the virtual machine
is in the Paused state by the time the error notification is
received, it means that the user can<i>try to resume</i>the machine
execution after attempting to solve the problem that caused the
error. In this case, the notification handler is supposed
to show an appropriate message to the user (depending on the
value of the  id parameter) that offers several actions such
as<i>Retry</i>,<i>Save</i>or<i>Power Off</i>. If the user
wants to retry, the notification handler should continue
the machine execution using the{@link org.virtualbox_7_0.IConsole#resume()}call. If the machine execution is not Paused during this
notification, then it means this notification is a<i>warning</i>(for example, about a fatal condition that can happen very soon);
no immediate action is required from the user, the machine
continues its normal execution.

Note that in either case the notification handler<b>must not</b>perform any action directly on a thread
where this notification is called. Everything it is allowed to
do is to post a message to another thread that will then talk
to the user and take the corresponding action.

Currently, the following error identifiers are known:<ul><li><code>"HostMemoryLow"</code></li><li><code>"HostAudioNotResponding"</code></li><li><code>"VDIStorageFull"</code></li><li><code>"3DSupportIncompatibleAdditions"</code></li></ul>

Interface ID: <code>{883DD18B-0721-4CDE-867C-1A82ABAF914C}</code>
*/
public class IRuntimeErrorEvent extends IEvent
{

    public IRuntimeErrorEvent(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Whether the error is fatal or not.
@return Boolean
*/
    public Boolean getFatal()
    {
        try
        {
            Boolean retVal = port.iRuntimeErrorEventGetFatal(obj);
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
Error identifier.
@return String
*/
    public String getId()
    {
        try
        {
            String retVal = port.iRuntimeErrorEventGetId(obj);
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
Optional error message.
@return String
*/
    public String getMessage()
    {
        try
        {
            String retVal = port.iRuntimeErrorEventGetMessage(obj);
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
    public static IRuntimeErrorEvent queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IRuntimeErrorEvent(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

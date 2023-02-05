
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
 * ISession.java
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
The ISession interface represents a client process and allows for locking
virtual machines (represented by IMachine objects) to prevent conflicting
changes to the machine.

Any caller wishing to manipulate a virtual machine needs to create a session
object first, which lives in its own process space. Such session objects are
then associated with{@link org.virtualbox_7_0.IMachine}objects living in the VirtualBox
server process to coordinate such changes.

There are two typical scenarios in which sessions are used:<ul><li>To alter machine settings or control a running virtual machine, one
needs to lock a machine for a given session (client process) by calling{@link org.virtualbox_7_0.IMachine#lockMachine(org.virtualbox_7_0.ISession,org.virtualbox_7_0.LockType)}.

Whereas multiple sessions may control a running virtual machine, only
one process can obtain a write lock on the machine to prevent conflicting
changes. A write lock is also needed if a process wants to actually run a
virtual machine in its own context, such as the VirtualBox GUI or
VBoxHeadless front-ends. They must also lock a machine for their own
sessions before they are allowed to power up the virtual machine.

As a result, no machine settings can be altered while another process is
already using it, either because that process is modifying machine settings
or because the machine is running.</li><li>To start a VM using one of the existing VirtualBox front-ends (e.g. the
VirtualBox GUI or VBoxHeadless), one would use{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}, which also takes a session object
as its first parameter. This session then identifies the caller and lets the
caller control the started machine (for example, pause machine execution or
power it down) as well as be notified about machine execution state changes.</li></ul>How sessions objects are created in a client process depends on whether you use
the Main API via COM or via the webservice:<ul><li>When using the COM API directly, an object of the Session class from the
VirtualBox type library needs to be created. In regular COM C++ client code,
this can be done by calling<code>createLocalObject()</code>, a standard COM API.
This object will then act as a local session object in further calls to open
a session.</li><li>In the webservice, the session manager (IWebsessionManager) instead creates
a session object automatically whenever{@link org.virtualbox_7_0.IWebsessionManager#logon(String,String)}is called. A managed object reference to that session object can be retrieved by
calling{@link org.virtualbox_7_0.IWebsessionManager#getSessionObject(org.virtualbox_7_0.IVirtualBox)}.</li></ul>

Interface ID: <code>{C0447716-FF5A-4795-B57A-ECD5FFFA18A4}</code>
*/
public class ISession extends IUnknown
{

    public ISession(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Current state of this session.
@return org.virtualbox_7_0.SessionState
*/
    public org.virtualbox_7_0.SessionState getState()
    {
        try
        {
            org.virtualbox_7_0.jaxws.SessionState retVal = port.iSessionGetState(obj);
            return org.virtualbox_7_0.SessionState.fromValue(retVal.value());
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
Type of this session. The value of this attribute is valid only
if the session currently has a machine locked (i.e. its{@link #getState()}is Locked), otherwise an error will be returned.
@return org.virtualbox_7_0.SessionType
*/
    public org.virtualbox_7_0.SessionType getType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.SessionType retVal = port.iSessionGetType(obj);
            return org.virtualbox_7_0.SessionType.fromValue(retVal.value());
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
Name of this session. Important only for VM sessions, otherwise it
it will be remembered, but not used for anything significant (and can
be left at the empty string which is the default). The value can only
be changed when the session state is SessionState_Unlocked. Make sure
that you use a descriptive name which does not conflict with the VM
process session names: "GUI/Qt", "GUI/SDL" and "headless".
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iSessionGetName(obj);
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
Name of this session. Important only for VM sessions, otherwise it
it will be remembered, but not used for anything significant (and can
be left at the empty string which is the default). The value can only
be changed when the session state is SessionState_Unlocked. Make sure
that you use a descriptive name which does not conflict with the VM
process session names: "GUI/Qt", "GUI/SDL" and "headless".
@param value String

*/
    public void setName(String value)
    {
        try
        {
        port.iSessionSetName(obj, value);
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
Machine object associated with this session.
@return org.virtualbox_7_0.IMachine
*/
    public org.virtualbox_7_0.IMachine getMachine()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iSessionGetMachine(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IMachine(retVal, getObjMgr(), port) : null;
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
Console object associated with this session. Only sessions
which locked the machine for a VM process have a non-null console.
@return org.virtualbox_7_0.IConsole
*/
    public org.virtualbox_7_0.IConsole getConsole()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iSessionGetConsole(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IConsole(retVal, getObjMgr(), port) : null;
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
    public static ISession queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new ISession(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Unlocks a machine that was previously locked for the current session.

Calling this method is required every time a machine has been locked
for a particular session using the{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}or{@link org.virtualbox_7_0.IMachine#lockMachine(org.virtualbox_7_0.ISession,org.virtualbox_7_0.LockType)}calls. Otherwise the state of
the machine will be set to{@link org.virtualbox_7_0.MachineState#Aborted}on the
server, and changes made to the machine settings will be lost.

Generally, it is recommended to unlock all machines explicitly
before terminating the application (regardless of the reason for
the termination).
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_UNEXPECTED</code> - Session is not locked.</dd>
</dl>

NOTE: Do not expect the session state ({@link org.virtualbox_7_0.ISession#getState()}to return to "Unlocked" immediately after you invoke this method,
particularly if you have started a new VM process. The session
state will automatically return to "Unlocked" once the VM is no
longer executing, which can of course take a very long time.

*/
    public void unlockMachine()
    {
        try
        {
        port.iSessionUnlockMachine(obj);
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

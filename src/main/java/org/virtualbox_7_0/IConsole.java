
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
 * IConsole.java
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
The IConsole interface represents an interface to control virtual
machine execution.

A console object gets created when a machine has been locked for a
particular session (client process) using{@link org.virtualbox_7_0.IMachine#lockMachine(org.virtualbox_7_0.ISession,org.virtualbox_7_0.LockType)}or{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}. The console object can
then be found in the session's{@link org.virtualbox_7_0.ISession#getConsole()}attribute.

Methods of the IConsole interface allow the caller to query the current
virtual machine execution state, pause the machine or power it down, save
the machine state or take a snapshot, attach and detach removable media
and so on.
@see org.virtualbox_7_0.ISession


Interface ID: <code>{6AC83D89-6EE7-4E33-8AE6-B257B2E81BE8}</code>
*/
public class IConsole extends IUnknown
{

    public IConsole(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Machine object for this console session.
NOTE: This is a convenience property, it has the same value as{@link org.virtualbox_7_0.ISession#getMachine()}of the corresponding session
object.

@return org.virtualbox_7_0.IMachine
*/
    public org.virtualbox_7_0.IMachine getMachine()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iConsoleGetMachine(obj);
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
Current execution state of the machine.
NOTE: This property always returns the same value as the corresponding
property of the IMachine object for this console session.
For the process that owns (executes) the VM, this is the
preferable way of querying the VM state, because no IPC
calls are made.

@return org.virtualbox_7_0.MachineState
*/
    public org.virtualbox_7_0.MachineState getState()
    {
        try
        {
            org.virtualbox_7_0.jaxws.MachineState retVal = port.iConsoleGetState(obj);
            return org.virtualbox_7_0.MachineState.fromValue(retVal.value());
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
Guest object.
@return org.virtualbox_7_0.IGuest
*/
    public org.virtualbox_7_0.IGuest getGuest()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iConsoleGetGuest(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuest(retVal, getObjMgr(), port) : null;
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
Virtual keyboard object.
NOTE: If the machine is not running, any attempt to use
the returned object will result in an error.

@return org.virtualbox_7_0.IKeyboard
*/
    public org.virtualbox_7_0.IKeyboard getKeyboard()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iConsoleGetKeyboard(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IKeyboard(retVal, getObjMgr(), port) : null;
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
Virtual mouse object.
NOTE: If the machine is not running, any attempt to use
the returned object will result in an error.

@return org.virtualbox_7_0.IMouse
*/
    public org.virtualbox_7_0.IMouse getMouse()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iConsoleGetMouse(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IMouse(retVal, getObjMgr(), port) : null;
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
Virtual display object.
NOTE: If the machine is not running, any attempt to use
the returned object will result in an error.

@return org.virtualbox_7_0.IDisplay
*/
    public org.virtualbox_7_0.IDisplay getDisplay()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iConsoleGetDisplay(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IDisplay(retVal, getObjMgr(), port) : null;
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
Debugging interface.
@return org.virtualbox_7_0.IMachineDebugger
*/
    public org.virtualbox_7_0.IMachineDebugger getDebugger()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iConsoleGetDebugger(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IMachineDebugger(retVal, getObjMgr(), port) : null;
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
Collection of USB devices currently attached to the virtual
USB controller.
NOTE: The collection is empty if the machine is not running.

@return List&lt;org.virtualbox_7_0.IUSBDevice&gt;
*/
    public List<org.virtualbox_7_0.IUSBDevice> getUSBDevices()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iConsoleGetUSBDevices(obj);
            return Helper.wrap(org.virtualbox_7_0.IUSBDevice.class, getObjMgr(), port, retVal);
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
List of USB devices currently attached to the remote VRDE client.
Once a new device is physically attached to the remote host computer,
it appears in this list and remains there until detached.
@return List&lt;org.virtualbox_7_0.IHostUSBDevice&gt;
*/
    public List<org.virtualbox_7_0.IHostUSBDevice> getRemoteUSBDevices()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iConsoleGetRemoteUSBDevices(obj);
            return Helper.wrap(org.virtualbox_7_0.IHostUSBDevice.class, getObjMgr(), port, retVal);
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
Collection of shared folders for the current session. These folders
are called transient shared folders because they are available to the
guest OS running inside the associated virtual machine only for the
duration of the session (as opposed to{@link org.virtualbox_7_0.IMachine#getSharedFolders()}which represent permanent shared
folders). When the session is closed (e.g. the machine is powered down),
these folders are automatically discarded.

New shared folders are added to the collection using{@link #createSharedFolder(String,String,Boolean,Boolean,String)}. Existing shared folders can be
removed using{@link #removeSharedFolder(String)}.
@return List&lt;org.virtualbox_7_0.ISharedFolder&gt;
*/
    public List<org.virtualbox_7_0.ISharedFolder> getSharedFolders()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iConsoleGetSharedFolders(obj);
            return Helper.wrap(org.virtualbox_7_0.ISharedFolder.class, getObjMgr(), port, retVal);
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
Interface that provides information on Remote Desktop Extension (VRDE) connection.
@return org.virtualbox_7_0.IVRDEServerInfo
*/
    public org.virtualbox_7_0.IVRDEServerInfo getVRDEServerInfo()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            org.virtualbox_7_0.jaxws.IVRDEServerInfo retVal = port.iConsoleGetVRDEServerInfo(obj);
            return (retVal != null) ? new org.virtualbox_7_0.IVRDEServerInfo(retVal, getObjMgr(), port) : null;
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
Event source for console events.
@return org.virtualbox_7_0.IEventSource
*/
    public org.virtualbox_7_0.IEventSource getEventSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iConsoleGetEventSource(obj);
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
Array of PCI devices attached to this machine.
@return List&lt;org.virtualbox_7_0.IPCIDeviceAttachment&gt;
*/
    public List<org.virtualbox_7_0.IPCIDeviceAttachment> getAttachedPCIDevices()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<org.virtualbox_7_0.jaxws.IPCIDeviceAttachment> retVal = port.iConsoleGetAttachedPCIDevices(obj);
            return Helper.wrap2(org.virtualbox_7_0.IPCIDeviceAttachment.class, org.virtualbox_7_0.jaxws.IPCIDeviceAttachment.class, objMgr, port, retVal);
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
Whether the guest clipboard should be connected to the host one or
whether it should only be allowed access to the VRDE clipboard. This
setting may not affect existing guest clipboard connections which
are already connected to the host clipboard.
@return Boolean
*/
    public Boolean getUseHostClipboard()
    {
        try
        {
            Boolean retVal = port.iConsoleGetUseHostClipboard(obj);
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
Whether the guest clipboard should be connected to the host one or
whether it should only be allowed access to the VRDE clipboard. This
setting may not affect existing guest clipboard connections which
are already connected to the host clipboard.
@param value Boolean

*/
    public void setUseHostClipboard(Boolean value)
    {
        try
        {
        port.iConsoleSetUseHostClipboard(obj, value);
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
Interface that manages emulated USB devices.
@return org.virtualbox_7_0.IEmulatedUSB
*/
    public org.virtualbox_7_0.IEmulatedUSB getEmulatedUSB()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iConsoleGetEmulatedUSB(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IEmulatedUSB(retVal, getObjMgr(), port) : null;
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
    public static IConsole queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IConsole(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Starts the virtual machine execution using the current machine
state (that is, its current execution state, current settings and
current storage devices).If the machine is powered off or aborted, the execution will
start from the beginning (as if the real hardware were just
powered on).

If the machine is in the{@link org.virtualbox_7_0.MachineState#Saved}state or the{@link org.virtualbox_7_0.MachineState#AbortedSaved}state it will continue its
execution from the point where the state was saved.

If the machine{@link org.virtualbox_7_0.IMachine#getTeleporterEnabled()}property is
enabled on the machine being powered up, the machine will wait for an
incoming teleportation in the{@link org.virtualbox_7_0.MachineState#TeleportingIn}state. The returned progress object will have at least three
operations where the last three are defined as: (1) powering up and
starting TCP server, (2) waiting for incoming teleportations, and
(3) perform teleportation. These operations will be reflected as the
last three operations of the progress objected returned by{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}as well.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine already running.</dd>
<dd><code>VBOX_E_HOST_ERROR</code> - Host interface does not exist or name not set.</dd>
<dd><code>VBOX_E_FILE_ERROR</code> - Invalid saved state file.</dd>
</dl>

@return Progress object to track the operation completion.

NOTE: This method is only useful for front-ends that want to actually
execute virtual machines in their own process (like the VirtualBox
or VBoxSDL front-ends). Unless you are intending to write such a
front-end, do not call this method. If you simply want to
start virtual machine execution using one of the existing front-ends
(for example the VirtualBox GUI or headless server), use{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}instead; these
front-ends will power up the machine automatically for you.

@see org.virtualbox_7_0.IMachine#saveState()

*/
    public org.virtualbox_7_0.IProgress powerUp()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iConsolePowerUp(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Identical to powerUp except that the VM will enter the{@link org.virtualbox_7_0.MachineState#Paused}state, instead of{@link org.virtualbox_7_0.MachineState#Running}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine already running.</dd>
<dd><code>VBOX_E_HOST_ERROR</code> - Host interface does not exist or name not set.</dd>
<dd><code>VBOX_E_FILE_ERROR</code> - Invalid saved state file.</dd>
</dl>

@return Progress object to track the operation completion.

@see #powerUp()

*/
    public org.virtualbox_7_0.IProgress powerUpPaused()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iConsolePowerUpPaused(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Initiates the power down procedure to stop the virtual machine
execution.

The completion of the power down procedure is tracked using the returned
IProgress object. After the operation is complete, the machine will go
to the PoweredOff state.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine must be Running, Paused or Stuck to be powered down.</dd>
</dl>

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress powerDown()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iConsolePowerDown(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Resets the virtual machine.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine not in Running state.</dd>
<dd><code>VBOX_E_VM_ERROR</code> - Virtual machine error in reset operation.</dd>
</dl>

*/
    public void reset()
    {
        try
        {
        port.iConsoleReset(obj);
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
Pauses the virtual machine execution.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine not in Running state.</dd>
<dd><code>VBOX_E_VM_ERROR</code> - Virtual machine error in suspend operation.</dd>
</dl>

*/
    public void pause()
    {
        try
        {
        port.iConsolePause(obj);
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
Resumes the virtual machine execution.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine not in Paused state.</dd>
<dd><code>VBOX_E_VM_ERROR</code> - Virtual machine error in resume operation.</dd>
</dl>

*/
    public void resume()
    {
        try
        {
        port.iConsoleResume(obj);
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
Sends the ACPI power button event to the guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine not in Running state.</dd>
<dd><code>VBOX_E_PDM_ERROR</code> - Controlled power off failed.</dd>
</dl>

*/
    public void powerButton()
    {
        try
        {
        port.iConsolePowerButton(obj);
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
Sends the ACPI sleep button event to the guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine not in Running state.</dd>
<dd><code>VBOX_E_PDM_ERROR</code> - Sending sleep button event failed.</dd>
</dl>

*/
    public void sleepButton()
    {
        try
        {
        port.iConsoleSleepButton(obj);
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
Checks if the last power button event was handled by guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_PDM_ERROR</code> - Checking if the event was handled by the guest OS failed.</dd>
</dl>

*/
    public Boolean getPowerButtonHandled()
    {
        try
        {
            Boolean retVal;
        retVal = port.iConsoleGetPowerButtonHandled(obj);
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
Checks if the guest entered the ACPI mode G0 (working) or
G1 (sleeping). If this method returns  false, the guest will
most likely not respond to external ACPI events.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine not in Running state.</dd>
</dl>

*/
    public Boolean getGuestEnteredACPIMode()
    {
        try
        {
            Boolean retVal;
        retVal = port.iConsoleGetGuestEnteredACPIMode(obj);
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
Gets the current activity type of given devices or device groups.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Invalid device type.</dd>
</dl>

*/
    public List<org.virtualbox_7_0.DeviceActivity> getDeviceActivity(List<org.virtualbox_7_0.DeviceType> type)
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.DeviceActivity> retVal;
        retVal = port.iConsoleGetDeviceActivity(obj, Helper.convertEnums(org.virtualbox_7_0.DeviceType.class, org.virtualbox_7_0.jaxws.DeviceType.class, type));
           return Helper.convertEnums(org.virtualbox_7_0.jaxws.DeviceActivity.class, org.virtualbox_7_0.DeviceActivity.class, retVal);
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
Attaches a host USB device with the given UUID to the
USB controller of the virtual machine.

The device needs to be in one of the following states:{@link org.virtualbox_7_0.USBDeviceState#Busy},{@link org.virtualbox_7_0.USBDeviceState#Available}or{@link org.virtualbox_7_0.USBDeviceState#Held},
otherwise an error is immediately returned.

When the device state is{@link org.virtualbox_7_0.USBDeviceState#Busy}, an error may also
be returned if the host computer refuses to release it for some reason.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine state neither Running nor Paused.</dd>
<dd><code>VBOX_E_PDM_ERROR</code> - Virtual machine does not have a USB controller.</dd>
</dl>

@param id UUID of the host USB device to attach.

@param captureFilename Filename to capture the USB traffic to.

@see org.virtualbox_7_0.IUSBDeviceFilters#getDeviceFilters()
@see org.virtualbox_7_0.USBDeviceState

*/
    public void attachUSBDevice(String id, String captureFilename)
    {
        try
        {
        port.iConsoleAttachUSBDevice(obj, id, captureFilename);
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
Detaches an USB device with the given UUID from the USB controller
of the virtual machine.

After this method succeeds, the VirtualBox server re-initiates
all USB filters as if the device were just physically attached
to the host, but filters of this machine are ignored to avoid
a possible automatic re-attachment.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_PDM_ERROR</code> - Virtual machine does not have a USB controller.</dd>
<dd><code>E_INVALIDARG</code> - USB device not attached to this virtual machine.</dd>
</dl>

@param id UUID of the USB device to detach.

@return Detached USB device.

@see org.virtualbox_7_0.IUSBDeviceFilters#getDeviceFilters()
@see org.virtualbox_7_0.USBDeviceState

*/
    public org.virtualbox_7_0.IUSBDevice detachUSBDevice(String id)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iConsoleDetachUSBDevice(obj, id);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IUSBDevice(retVal, getObjMgr(), port) : null;
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
Searches for a USB device with the given host address.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - Given  name does not correspond to any USB device.</dd>
</dl>

@param name Address of the USB device (as assigned by the host) to
search for.

@return Found USB device object.

@see org.virtualbox_7_0.IUSBDevice#getAddress()

*/
    public org.virtualbox_7_0.IUSBDevice findUSBDeviceByAddress(String name)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iConsoleFindUSBDeviceByAddress(obj, name);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IUSBDevice(retVal, getObjMgr(), port) : null;
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
Searches for a USB device with the given UUID.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - Given  id does not correspond to any USB device.</dd>
</dl>

@param id UUID of the USB device to search for.

@return Found USB device object.

@see org.virtualbox_7_0.IUSBDevice#getId()

*/
    public org.virtualbox_7_0.IUSBDevice findUSBDeviceById(String id)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iConsoleFindUSBDeviceById(obj, id);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IUSBDevice(retVal, getObjMgr(), port) : null;
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
Creates a transient new shared folder by associating the given logical
name with the given host path, adds it to the collection of shared
folders and starts sharing it. Refer to the description of{@link org.virtualbox_7_0.ISharedFolder}to read more about logical names.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine is in the Saved or AbortedSaved state or currently changing state.</dd>
<dd><code>VBOX_E_FILE_ERROR</code> - Shared folder already exists or not accessible.</dd>
</dl>

@param name Unique logical name of the shared folder.

@param hostPath Full path to the shared folder in the host file system.

@param writable Whether the share is writable or readonly

@param automount Whether the share gets automatically mounted by the guest
or not.

@param autoMountPoint Where the guest should automatically mount the folder, if possible.
For Windows and OS/2 guests this should be a drive letter, while other
guests it should be a absolute directory.

*/
    public void createSharedFolder(String name, String hostPath, Boolean writable, Boolean automount, String autoMountPoint)
    {
        try
        {
        port.iConsoleCreateSharedFolder(obj, name, hostPath, writable, automount, autoMountPoint);
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
Removes a transient shared folder with the given name previously
created by{@link #createSharedFolder(String,String,Boolean,Boolean,String)}from the collection of
shared folders and stops sharing it.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine is in the Saved or AbortedSaved state or currently changing state.</dd>
<dd><code>VBOX_E_FILE_ERROR</code> - Shared folder does not exists.</dd>
</dl>

@param name Logical name of the shared folder to remove.

*/
    public void removeSharedFolder(String name)
    {
        try
        {
        port.iConsoleRemoveSharedFolder(obj, name);
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
Teleport the VM to a different host machine or process.

TODO Explain the details.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine not running or paused.</dd>
</dl>

@param hostname The name or IP of the host to teleport to.

@param tcpport The TCP port to connect to (1..65535).

@param password The password.

@param maxDowntime The maximum allowed downtime given as milliseconds. 0 is not a valid
value. Recommended value: 250 ms.

The higher the value is, the greater the chance for a successful
teleportation. A small value may easily result in the teleportation
process taking hours and eventually fail.

@return Progress object to track the operation completion.

NOTE: The current implementation treats this a guideline, not as an
absolute rule.

*/
    public org.virtualbox_7_0.IProgress teleport(String hostname, Long tcpport, String password, Long maxDowntime)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iConsoleTeleport(obj, hostname, tcpport, password, maxDowntime);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Adds a password used for encryption/decryption.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_PASSWORD_INCORRECT</code> - The password provided wasn't correct for at least one disk using the provided
ID.</dd>
</dl>

@param id The identifier used for the password. Must match the identifier
used when the encrypted medium was created.

@param password The password.

@param clearOnSuspend Flag whether to clear the password on VM suspend (due to a suspending host
for example). The password must be supplied again before the VM can resume.

*/
    public void addEncryptionPassword(String id, String password, Boolean clearOnSuspend)
    {
        try
        {
        port.iConsoleAddEncryptionPassword(obj, id, password, clearOnSuspend);
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
Adds a password used for encryption/decryption.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_PASSWORD_INCORRECT</code> - The password provided wasn't correct for at least one disk using the provided
ID.</dd>
</dl>

@param ids List of identifiers for the passwords. Must match the identifier
used when the encrypted medium was created.

@param passwords List of passwords.

@param clearOnSuspend Flag whether to clear the given passwords on VM suspend (due to a suspending host
for example). The passwords must be supplied again before the VM can resume.

*/
    public void addEncryptionPasswords(List<String> ids, List<String> passwords, Boolean clearOnSuspend)
    {
        try
        {
        port.iConsoleAddEncryptionPasswords(obj, ids, passwords, clearOnSuspend);
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
Removes a password used for hard disk encryption/decryption from
the running VM. As soon as the medium requiring this password
is accessed the VM is paused with an error and the password must be
provided again.
@param id The identifier used for the password. Must match the identifier
used when the encrypted medium was created.

*/
    public void removeEncryptionPassword(String id)
    {
        try
        {
        port.iConsoleRemoveEncryptionPassword(obj, id);
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
Clears all provided supplied encryption passwords.
*/
    public void clearAllEncryptionPasswords()
    {
        try
        {
        port.iConsoleClearAllEncryptionPasswords(obj);
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

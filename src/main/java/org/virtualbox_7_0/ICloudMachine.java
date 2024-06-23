
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
 * ICloudMachine.java
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
Virtual virtual machine (sic) in the cloud.

Reading object attributes returns cached values, use{@link #refresh()}to refresh them.

Interface ID: <code>{147816C8-17E0-11EB-81FA-87CEA6263E1A}</code>
*/
public class ICloudMachine extends IUnknown
{

    public ICloudMachine(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
UUID of the cloud machine.
@return String
*/
    public String getId()
    {
        try
        {
            String retVal = port.iCloudMachineGetId(obj);
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
Whether this virtual machine is currently accessible or not.
TBD...
@return Boolean
*/
    public Boolean getAccessible()
    {
        try
        {
            Boolean retVal = port.iCloudMachineGetAccessible(obj);
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
Error information describing the reason of machine
inaccessibility.

Reading this property is only valid after the last call to{@link #getAccessible()}returned  false (i.e. the
machine is currently inaccessible). Otherwise, a  null
IVirtualBoxErrorInfo object will be returned.
@return org.virtualbox_7_0.IVirtualBoxErrorInfo
*/
    public org.virtualbox_7_0.IVirtualBoxErrorInfo getAccessError()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iCloudMachineGetAccessError(obj);
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
Convenience shortcut to retrieve the name of the cloud
machine.  The name is part of the machine settings that are
hidden behind the settings form (see{@link #getSettingsForm(Holder)}).
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iCloudMachineGetName(obj);
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
Convenience shortcut to retrieve the OS Type id of the cloud
machine.  It is part of the machine settings that are hidden
behind the settings form (see{@link #getSettingsForm(Holder)}).
@return String
*/
    public String getOSTypeId()
    {
        try
        {
            String retVal = port.iCloudMachineGetOSTypeId(obj);
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
Machine state.
@return org.virtualbox_7_0.CloudMachineState
*/
    public org.virtualbox_7_0.CloudMachineState getState()
    {
        try
        {
            org.virtualbox_7_0.jaxws.CloudMachineState retVal = port.iCloudMachineGetState(obj);
            return org.virtualbox_7_0.CloudMachineState.fromValue(retVal.value());
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
The fingerprint of the ssh key that is authorized to access
the machine's console connection.
@return String
*/
    public String getConsoleConnectionFingerprint()
    {
        try
        {
            String retVal = port.iCloudMachineGetConsoleConnectionFingerprint(obj);
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
The shell command to establish ssh connection to the cloud
machine serial console.
@return String
*/
    public String getSerialConsoleCommand()
    {
        try
        {
            String retVal = port.iCloudMachineGetSerialConsoleCommand(obj);
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
The PowerShell command to establish ssh connection to the
cloud machine serial console using PuTTY's plink.
@return String
*/
    public String getSerialConsoleCommandWindows()
    {
        try
        {
            String retVal = port.iCloudMachineGetSerialConsoleCommandWindows(obj);
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
The shell command to establish ssh port forwarding for the
VNC connection to the cloud machine console.
@return String
*/
    public String getVNCConsoleCommand()
    {
        try
        {
            String retVal = port.iCloudMachineGetVNCConsoleCommand(obj);
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
The PowerShell command to establish ssh port forwarding for the
VNC connection to the cloud machine console using PuTTY's plink.
@return String
*/
    public String getVNCConsoleCommandWindows()
    {
        try
        {
            String retVal = port.iCloudMachineGetVNCConsoleCommandWindows(obj);
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
    public static ICloudMachine queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new ICloudMachine(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Refresh information by reading it from the cloud.
@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress refresh()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudMachineRefresh(obj);
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
Obtain a form with the current settings for this cloud
machine.  The form is not editable.
@return A form with the cloud machine settings.

*/
    public org.virtualbox_7_0.IForm getDetailsForm()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudMachineGetDetailsForm(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IForm(retVal, getObjMgr(), port) : null;
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
Obtain a form with settings for this cloud machine.
The form is editable.
@param form A form with the cloud machine settings.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress getSettingsForm(Holder<org.virtualbox_7_0.IForm> form)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        jakarta.xml.ws.Holder<String> tmp_form = new jakarta.xml.ws.Holder<String>();
        jakarta.xml.ws.Holder<String> retVal = new jakarta.xml.ws.Holder<String>();
        port.iCloudMachineGetSettingsForm(obj, tmp_form, retVal);
        form.value = (tmp_form.value.length() > 0) ? new org.virtualbox_7_0.IForm(tmp_form.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
Start cloud virtual machine execution.
@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress powerUp()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudMachinePowerUp(obj);
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
Reboot cloud virtual machine.
@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress reboot()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudMachineReboot(obj);
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
Shutdown cloud virtual machine.
@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress shutdown()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudMachineShutdown(obj);
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
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine must be Running, to be powered down.</dd>
</dl>

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress powerDown()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudMachinePowerDown(obj);
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
Terminate cloud virtual machine.
@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress terminate()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudMachineTerminate(obj);
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
Unregister this cloud machine, but leave the cloud artifacts
intact.
@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress unregister()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudMachineUnregister(obj);
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
Unregister this cloud machine and delete all its cloud artifacts.
@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress remove()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudMachineRemove(obj);
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
Get the backlog of the machine's console.  If you have ever
seen console teletypes, this is like looking at the last few
meters of the paper it spewed.
@param stream Data stream object for reading the console history.  For now
we are abusing/repurposing this interface from the media
convertion API to avoid marshalling a huge string through
xpcom.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress getConsoleHistory(Holder<org.virtualbox_7_0.IDataStream> stream)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        jakarta.xml.ws.Holder<String> tmp_stream = new jakarta.xml.ws.Holder<String>();
        jakarta.xml.ws.Holder<String> retVal = new jakarta.xml.ws.Holder<String>();
        port.iCloudMachineGetConsoleHistory(obj, tmp_stream, retVal);
        stream.value = (tmp_stream.value.length() > 0) ? new org.virtualbox_7_0.IDataStream(tmp_stream.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
    public org.virtualbox_7_0.IProgress createConsoleConnection(String sshPublicKey)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudMachineCreateConsoleConnection(obj, sshPublicKey);
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
    public org.virtualbox_7_0.IProgress deleteConsoleConnection()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudMachineDeleteConsoleConnection(obj);
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
}

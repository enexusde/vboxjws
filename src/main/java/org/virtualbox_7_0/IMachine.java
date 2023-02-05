
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
 * IMachine.java
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
The IMachine interface represents a virtual machine, or guest, created
in VirtualBox.

This interface is used in two contexts. First of all, a collection of
objects implementing this interface is stored in the{@link org.virtualbox_7_0.IVirtualBox#getMachines()}attribute which lists all the virtual
machines that are currently registered with this VirtualBox
installation. Also, once a session has been opened for the given virtual
machine (e.g. the virtual machine is running), the machine object
associated with the open session can be queried from the session object;
see{@link org.virtualbox_7_0.ISession}for details.

The main role of this interface is to expose the settings of the virtual
machine and provide methods to change various aspects of the virtual
machine's configuration. For machine objects stored in the{@link org.virtualbox_7_0.IVirtualBox#getMachines()}collection, all attributes are
read-only unless explicitly stated otherwise in individual attribute
and method descriptions.

In order to change a machine setting, a session for this machine must be
opened using one of the{@link org.virtualbox_7_0.IMachine#lockMachine(org.virtualbox_7_0.ISession,org.virtualbox_7_0.LockType)}or{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}methods. After the
machine has been successfully locked for a session, a mutable machine object
needs to be queried from the session object and then the desired settings
changes can be applied to the returned object using IMachine attributes and
methods. See the{@link org.virtualbox_7_0.ISession}interface description for more
information about sessions.

Note that IMachine does not provide methods to control virtual machine
execution (such as start the machine, or power it down) -- these methods
are grouped in a separate interface called{@link org.virtualbox_7_0.IConsole}.
@see org.virtualbox_7_0.ISession
@see org.virtualbox_7_0.IConsole


Interface ID: <code>{300763AF-5D6B-46E6-AA96-273EAC15538A}</code>
*/
public class IMachine extends IUnknown
{

    public IMachine(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Associated parent object.
@return org.virtualbox_7_0.IVirtualBox
*/
    public org.virtualbox_7_0.IVirtualBox getParent()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMachineGetParent(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IVirtualBox(retVal, getObjMgr(), port) : null;
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
Overridden VM Icon details.
@return byte[]
*/
    public byte[] getIcon()
    {
        try
        {
            /*base64*/String retVal = port.iMachineGetIcon(obj);
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
Overridden VM Icon details.
@param value byte[]

*/
    public void setIcon(byte[] value)
    {
        try
        {
        port.iMachineSetIcon(obj, Helper.encodeBase64(value));
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

A machine is always deemed accessible unless it is registered<i>and</i>its settings file cannot be read or parsed (either because the file itself
is unavailable or has invalid XML contents).

Every time this property is read, the accessibility state of
this machine is re-evaluated. If the returned value is  false,
the{@link #getAccessError()}property may be used to get the
detailed error information describing the reason of
inaccessibility, including XML error messages.

When the machine is inaccessible, only the following properties
can be used on it:<ul><li>{@link #getParent()}</li><li>{@link #getId()}</li><li>{@link #getSettingsFilePath()}</li><li>{@link #getAccessible()}</li><li>{@link #getAccessError()}</li></ul>An attempt to access any other property or method will return
an error.

The only possible action you can perform on an inaccessible
machine is to unregister it using the{@link org.virtualbox_7_0.IMachine#unregister(org.virtualbox_7_0.CleanupMode)}call (or, to check
for the accessibility state once more by querying this
property).
NOTE: In the current implementation, once this property returns
true, the machine will never become inaccessible
later, even if its settings file cannot be successfully
read/written any more (at least, until the VirtualBox
server is restarted). This limitation may be removed in
future releases.

@return Boolean
*/
    public Boolean getAccessible()
    {
        try
        {
            Boolean retVal = port.iMachineGetAccessible(obj);
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
            String retVal = port.iMachineGetAccessError(obj);
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
Name of the virtual machine.

Besides being used for human-readable identification purposes
everywhere in VirtualBox, the virtual machine name is also used
as a name of the machine's settings file and as a name of the
subdirectory this settings file resides in. Thus, every time you
change the value of this property, the settings file will be
renamed once you call{@link #saveSettings()}to confirm the
change. The containing subdirectory will be also renamed, but
only if it has exactly the same name as the settings file
itself prior to changing this property (for backward compatibility
with previous API releases). The above implies the following
limitations:<ul><li>The machine name cannot be empty.</li><li>The machine name can contain only characters that are valid
file name characters according to the rules of the file
system used to store VirtualBox configuration.</li><li>You cannot have two or more machines with the same name
if they use the same subdirectory for storing the machine
settings files.</li><li>You cannot change the name of the machine if it is running,
or if any file in the directory containing the settings file
is being used by another running machine or by any other
process in the host operating system at a time when{@link #saveSettings()}is called.</li></ul>If any of the above limitations are hit,{@link #saveSettings()}will return an appropriate error message explaining the exact
reason and the changes you made to this machine will not be saved.

Starting with VirtualBox 4.0, a ".vbox" extension of the settings
file is recommended, but not enforced. (Previous versions always
used a generic ".xml" extension.)
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iMachineGetName(obj);
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
Name of the virtual machine.

Besides being used for human-readable identification purposes
everywhere in VirtualBox, the virtual machine name is also used
as a name of the machine's settings file and as a name of the
subdirectory this settings file resides in. Thus, every time you
change the value of this property, the settings file will be
renamed once you call{@link #saveSettings()}to confirm the
change. The containing subdirectory will be also renamed, but
only if it has exactly the same name as the settings file
itself prior to changing this property (for backward compatibility
with previous API releases). The above implies the following
limitations:<ul><li>The machine name cannot be empty.</li><li>The machine name can contain only characters that are valid
file name characters according to the rules of the file
system used to store VirtualBox configuration.</li><li>You cannot have two or more machines with the same name
if they use the same subdirectory for storing the machine
settings files.</li><li>You cannot change the name of the machine if it is running,
or if any file in the directory containing the settings file
is being used by another running machine or by any other
process in the host operating system at a time when{@link #saveSettings()}is called.</li></ul>If any of the above limitations are hit,{@link #saveSettings()}will return an appropriate error message explaining the exact
reason and the changes you made to this machine will not be saved.

Starting with VirtualBox 4.0, a ".vbox" extension of the settings
file is recommended, but not enforced. (Previous versions always
used a generic ".xml" extension.)
@param value String

*/
    public void setName(String value)
    {
        try
        {
        port.iMachineSetName(obj, value);
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
Description of the virtual machine.

The description attribute can contain any text and is
typically used to describe the hardware and software
configuration of the virtual machine in detail (i.e. network
settings, versions of the installed software and so on).
@return String
*/
    public String getDescription()
    {
        try
        {
            String retVal = port.iMachineGetDescription(obj);
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
Description of the virtual machine.

The description attribute can contain any text and is
typically used to describe the hardware and software
configuration of the virtual machine in detail (i.e. network
settings, versions of the installed software and so on).
@param value String

*/
    public void setDescription(String value)
    {
        try
        {
        port.iMachineSetDescription(obj, value);
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
UUID of the virtual machine.
@return String
*/
    public String getId()
    {
        try
        {
            String retVal = port.iMachineGetId(obj);
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
Array of machine group names of which this machine is a member.<code>""</code>and<code>"/"</code>are synonyms for the toplevel group. Each
group is only listed once, however they are listed in no particular
order and there is no guarantee that there are no gaps in the group
hierarchy (i.e.<code>"/group"</code>,<code>"/group/subgroup/subsubgroup"</code>is a valid result).
@return List&lt;String&gt;
*/
    public List<String> getGroups()
    {
        try
        {
            List<String> retVal = port.iMachineGetGroups(obj);
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
Array of machine group names of which this machine is a member.<code>""</code>and<code>"/"</code>are synonyms for the toplevel group. Each
group is only listed once, however they are listed in no particular
order and there is no guarantee that there are no gaps in the group
hierarchy (i.e.<code>"/group"</code>,<code>"/group/subgroup/subsubgroup"</code>is a valid result).
@param value List&lt;String&gt;

*/
    public void setGroups(List<String> value)
    {
        try
        {
        port.iMachineSetGroups(obj, value);
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
User-defined identifier of the Guest OS type.
You may use{@link org.virtualbox_7_0.IVirtualBox#getGuestOSType(String)}to obtain
an IGuestOSType object representing details about the given
Guest OS type. All Guest OS types are considered valid, even those
which are not known to{@link org.virtualbox_7_0.IVirtualBox#getGuestOSType(String)}.
NOTE: This value may differ from the value returned by{@link org.virtualbox_7_0.IGuest#getOSTypeId()}if Guest Additions are
installed to the guest OS.

@return String
*/
    public String getOSTypeId()
    {
        try
        {
            String retVal = port.iMachineGetOSTypeId(obj);
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
User-defined identifier of the Guest OS type.
You may use{@link org.virtualbox_7_0.IVirtualBox#getGuestOSType(String)}to obtain
an IGuestOSType object representing details about the given
Guest OS type. All Guest OS types are considered valid, even those
which are not known to{@link org.virtualbox_7_0.IVirtualBox#getGuestOSType(String)}.
NOTE: This value may differ from the value returned by{@link org.virtualbox_7_0.IGuest#getOSTypeId()}if Guest Additions are
installed to the guest OS.

@param value String

*/
    public void setOSTypeId(String value)
    {
        try
        {
        port.iMachineSetOSTypeId(obj, value);
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
Hardware version identifier. Internal use only for now.
@return String
*/
    public String getHardwareVersion()
    {
        try
        {
            String retVal = port.iMachineGetHardwareVersion(obj);
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
Hardware version identifier. Internal use only for now.
@param value String

*/
    public void setHardwareVersion(String value)
    {
        try
        {
        port.iMachineSetHardwareVersion(obj, value);
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
The UUID presented to the guest via memory tables, hardware and guest
properties. For most VMs this is the same as the  id, but for VMs
which have been cloned or teleported it may be the same as the source
VM. The latter is because the guest shouldn't notice that it was
cloned or teleported.
@return String
*/
    public String getHardwareUUID()
    {
        try
        {
            String retVal = port.iMachineGetHardwareUUID(obj);
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
The UUID presented to the guest via memory tables, hardware and guest
properties. For most VMs this is the same as the  id, but for VMs
which have been cloned or teleported it may be the same as the source
VM. The latter is because the guest shouldn't notice that it was
cloned or teleported.
@param value String

*/
    public void setHardwareUUID(String value)
    {
        try
        {
        port.iMachineSetHardwareUUID(obj, value);
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
Number of virtual CPUs in the VM.
@return Long
*/
    public Long getCPUCount()
    {
        try
        {
            Long retVal = port.iMachineGetCPUCount(obj);
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
Number of virtual CPUs in the VM.
@param value Long

*/
    public void setCPUCount(Long value)
    {
        try
        {
        port.iMachineSetCPUCount(obj, value);
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
This setting determines whether VirtualBox allows CPU
hotplugging for this machine.
@return Boolean
*/
    public Boolean getCPUHotPlugEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineGetCPUHotPlugEnabled(obj);
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
This setting determines whether VirtualBox allows CPU
hotplugging for this machine.
@param value Boolean

*/
    public void setCPUHotPlugEnabled(Boolean value)
    {
        try
        {
        port.iMachineSetCPUHotPlugEnabled(obj, value);
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
Means to limit the number of CPU cycles a guest can use. The unit
is percentage of host CPU cycles per second. The valid range
is 1 - 100. 100 (the default) implies no limit.
@return Long
*/
    public Long getCPUExecutionCap()
    {
        try
        {
            Long retVal = port.iMachineGetCPUExecutionCap(obj);
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
Means to limit the number of CPU cycles a guest can use. The unit
is percentage of host CPU cycles per second. The valid range
is 1 - 100. 100 (the default) implies no limit.
@param value Long

*/
    public void setCPUExecutionCap(Long value)
    {
        try
        {
        port.iMachineSetCPUExecutionCap(obj, value);
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
Virtual CPUID portability level, the higher number the fewer newer
or vendor specific CPU feature is reported to the guest (via the CPUID
instruction).  The default level of zero (0) means that all virtualized
features supported by the host is pass thru to the guest.  While the
three (3) is currently the level supressing the most features.

Exactly which of the CPUID features are left out by the VMM at which
level is subject to change with each major version.
@return Long
*/
    public Long getCPUIDPortabilityLevel()
    {
        try
        {
            Long retVal = port.iMachineGetCPUIDPortabilityLevel(obj);
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
Virtual CPUID portability level, the higher number the fewer newer
or vendor specific CPU feature is reported to the guest (via the CPUID
instruction).  The default level of zero (0) means that all virtualized
features supported by the host is pass thru to the guest.  While the
three (3) is currently the level supressing the most features.

Exactly which of the CPUID features are left out by the VMM at which
level is subject to change with each major version.
@param value Long

*/
    public void setCPUIDPortabilityLevel(Long value)
    {
        try
        {
        port.iMachineSetCPUIDPortabilityLevel(obj, value);
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
System memory size in megabytes.
@return Long
*/
    public Long getMemorySize()
    {
        try
        {
            Long retVal = port.iMachineGetMemorySize(obj);
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
System memory size in megabytes.
@param value Long

*/
    public void setMemorySize(Long value)
    {
        try
        {
        port.iMachineSetMemorySize(obj, value);
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
Memory balloon size in megabytes.
@return Long
*/
    public Long getMemoryBalloonSize()
    {
        try
        {
            Long retVal = port.iMachineGetMemoryBalloonSize(obj);
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
Memory balloon size in megabytes.
@param value Long

*/
    public void setMemoryBalloonSize(Long value)
    {
        try
        {
        port.iMachineSetMemoryBalloonSize(obj, value);
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
This setting determines whether VirtualBox allows page
fusion for this machine (64-bit hosts only).
@return Boolean
*/
    public Boolean getPageFusionEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineGetPageFusionEnabled(obj);
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
This setting determines whether VirtualBox allows page
fusion for this machine (64-bit hosts only).
@param value Boolean

*/
    public void setPageFusionEnabled(Boolean value)
    {
        try
        {
        port.iMachineSetPageFusionEnabled(obj, value);
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
Graphics adapter object.
@return org.virtualbox_7_0.IGraphicsAdapter
*/
    public org.virtualbox_7_0.IGraphicsAdapter getGraphicsAdapter()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMachineGetGraphicsAdapter(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IGraphicsAdapter(retVal, getObjMgr(), port) : null;
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
Object containing all BIOS settings.
@return org.virtualbox_7_0.IBIOSSettings
*/
    public org.virtualbox_7_0.IBIOSSettings getBIOSSettings()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMachineGetBIOSSettings(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IBIOSSettings(retVal, getObjMgr(), port) : null;
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
Object containing all TPM settings.
@return org.virtualbox_7_0.ITrustedPlatformModule
*/
    public org.virtualbox_7_0.ITrustedPlatformModule getTrustedPlatformModule()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMachineGetTrustedPlatformModule(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.ITrustedPlatformModule(retVal, getObjMgr(), port) : null;
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
Object to manipulate data in the non volatile storage file.
@return org.virtualbox_7_0.INvramStore
*/
    public org.virtualbox_7_0.INvramStore getNonVolatileStore()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMachineGetNonVolatileStore(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.INvramStore(retVal, getObjMgr(), port) : null;
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
Object containing all recording settings.
@return org.virtualbox_7_0.IRecordingSettings
*/
    public org.virtualbox_7_0.IRecordingSettings getRecordingSettings()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMachineGetRecordingSettings(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IRecordingSettings(retVal, getObjMgr(), port) : null;
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
Type of firmware (such as legacy BIOS or EFI), used for initial
bootstrap in this VM.
@return org.virtualbox_7_0.FirmwareType
*/
    public org.virtualbox_7_0.FirmwareType getFirmwareType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.FirmwareType retVal = port.iMachineGetFirmwareType(obj);
            return org.virtualbox_7_0.FirmwareType.fromValue(retVal.value());
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
Type of firmware (such as legacy BIOS or EFI), used for initial
bootstrap in this VM.
@param value org.virtualbox_7_0.FirmwareType

*/
    public void setFirmwareType(org.virtualbox_7_0.FirmwareType value)
    {
        try
        {
        port.iMachineSetFirmwareType(obj, org.virtualbox_7_0.jaxws.FirmwareType.fromValue(value.name()));
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
Type of pointing HID (such as mouse or tablet) used in this VM.
The default is typically "PS2Mouse" but can vary depending on the
requirements of the guest operating system.
@return org.virtualbox_7_0.PointingHIDType
*/
    public org.virtualbox_7_0.PointingHIDType getPointingHIDType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.PointingHIDType retVal = port.iMachineGetPointingHIDType(obj);
            return org.virtualbox_7_0.PointingHIDType.fromValue(retVal.value());
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
Type of pointing HID (such as mouse or tablet) used in this VM.
The default is typically "PS2Mouse" but can vary depending on the
requirements of the guest operating system.
@param value org.virtualbox_7_0.PointingHIDType

*/
    public void setPointingHIDType(org.virtualbox_7_0.PointingHIDType value)
    {
        try
        {
        port.iMachineSetPointingHIDType(obj, org.virtualbox_7_0.jaxws.PointingHIDType.fromValue(value.name()));
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
Type of keyboard HID used in this VM.
The default is typically "PS2Keyboard" but can vary depending on the
requirements of the guest operating system.
@return org.virtualbox_7_0.KeyboardHIDType
*/
    public org.virtualbox_7_0.KeyboardHIDType getKeyboardHIDType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.KeyboardHIDType retVal = port.iMachineGetKeyboardHIDType(obj);
            return org.virtualbox_7_0.KeyboardHIDType.fromValue(retVal.value());
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
Type of keyboard HID used in this VM.
The default is typically "PS2Keyboard" but can vary depending on the
requirements of the guest operating system.
@param value org.virtualbox_7_0.KeyboardHIDType

*/
    public void setKeyboardHIDType(org.virtualbox_7_0.KeyboardHIDType value)
    {
        try
        {
        port.iMachineSetKeyboardHIDType(obj, org.virtualbox_7_0.jaxws.KeyboardHIDType.fromValue(value.name()));
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
This attribute controls if High Precision Event Timer (HPET) is
enabled in this VM. Use this property if you want to provide guests
with additional time source, or if guest requires HPET to function correctly.
Default is false.
@return Boolean
*/
    public Boolean getHPETEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineGetHPETEnabled(obj);
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
This attribute controls if High Precision Event Timer (HPET) is
enabled in this VM. Use this property if you want to provide guests
with additional time source, or if guest requires HPET to function correctly.
Default is false.
@param value Boolean

*/
    public void setHPETEnabled(Boolean value)
    {
        try
        {
        port.iMachineSetHPETEnabled(obj, value);
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
Chipset type used in this VM.
@return org.virtualbox_7_0.ChipsetType
*/
    public org.virtualbox_7_0.ChipsetType getChipsetType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.ChipsetType retVal = port.iMachineGetChipsetType(obj);
            return org.virtualbox_7_0.ChipsetType.fromValue(retVal.value());
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
Chipset type used in this VM.
@param value org.virtualbox_7_0.ChipsetType

*/
    public void setChipsetType(org.virtualbox_7_0.ChipsetType value)
    {
        try
        {
        port.iMachineSetChipsetType(obj, org.virtualbox_7_0.jaxws.ChipsetType.fromValue(value.name()));
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
IOMMU type used in this VM.
@return org.virtualbox_7_0.IommuType
*/
    public org.virtualbox_7_0.IommuType getIommuType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.IommuType retVal = port.iMachineGetIommuType(obj);
            return org.virtualbox_7_0.IommuType.fromValue(retVal.value());
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
IOMMU type used in this VM.
@param value org.virtualbox_7_0.IommuType

*/
    public void setIommuType(org.virtualbox_7_0.IommuType value)
    {
        try
        {
        port.iMachineSetIommuType(obj, org.virtualbox_7_0.jaxws.IommuType.fromValue(value.name()));
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
Full path to the directory used to store snapshot data
(differencing media and saved state files) of this machine.

The initial value of this property is<code>&lt;</code>{@link #getSettingsFilePath()}<code>&gt;/&lt;</code>{@link #getId()}<code>&gt;</code>.

Currently, it is an error to try to change this property on
a machine that has snapshots (because this would require to
move possibly large files to a different location).
A separate method will be available for this purpose later.
NOTE: Setting this property to  null or to an empty string will restore
the initial value.

NOTE: When setting this property, the specified path can be
absolute (full path) or relative to the directory where the{@link #getSettingsFilePath()}is located. When reading this property, a full path is
always returned.

NOTE: The specified path may not exist, it will be created
when necessary.

@return String
*/
    public String getSnapshotFolder()
    {
        try
        {
            String retVal = port.iMachineGetSnapshotFolder(obj);
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
Full path to the directory used to store snapshot data
(differencing media and saved state files) of this machine.

The initial value of this property is<code>&lt;</code>{@link #getSettingsFilePath()}<code>&gt;/&lt;</code>{@link #getId()}<code>&gt;</code>.

Currently, it is an error to try to change this property on
a machine that has snapshots (because this would require to
move possibly large files to a different location).
A separate method will be available for this purpose later.
NOTE: Setting this property to  null or to an empty string will restore
the initial value.

NOTE: When setting this property, the specified path can be
absolute (full path) or relative to the directory where the{@link #getSettingsFilePath()}is located. When reading this property, a full path is
always returned.

NOTE: The specified path may not exist, it will be created
when necessary.

@param value String

*/
    public void setSnapshotFolder(String value)
    {
        try
        {
        port.iMachineSetSnapshotFolder(obj, value);
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
VirtualBox Remote Desktop Extension (VRDE) server object.
@return org.virtualbox_7_0.IVRDEServer
*/
    public org.virtualbox_7_0.IVRDEServer getVRDEServer()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMachineGetVRDEServer(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IVRDEServer(retVal, getObjMgr(), port) : null;
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
    public Boolean getEmulatedUSBCardReaderEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineGetEmulatedUSBCardReaderEnabled(obj);
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
    public void setEmulatedUSBCardReaderEnabled(Boolean value)
    {
        try
        {
        port.iMachineSetEmulatedUSBCardReaderEnabled(obj, value);
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
Array of media attached to this machine.
@return List&lt;org.virtualbox_7_0.IMediumAttachment&gt;
*/
    public List<org.virtualbox_7_0.IMediumAttachment> getMediumAttachments()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<org.virtualbox_7_0.jaxws.IMediumAttachment> retVal = port.iMachineGetMediumAttachments(obj);
            return Helper.wrap2(org.virtualbox_7_0.IMediumAttachment.class, org.virtualbox_7_0.jaxws.IMediumAttachment.class, objMgr, port, retVal);
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
Array of USB controllers attached to this machine.
NOTE: If USB functionality is not available in the given edition of
VirtualBox, this method will set the result code to  E_NOTIMPL.

@return List&lt;org.virtualbox_7_0.IUSBController&gt;
*/
    public List<org.virtualbox_7_0.IUSBController> getUSBControllers()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iMachineGetUSBControllers(obj);
            return Helper.wrap(org.virtualbox_7_0.IUSBController.class, getObjMgr(), port, retVal);
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
Associated USB device filters object.
NOTE: If USB functionality is not available in the given edition of
VirtualBox, this method will set the result code to  E_NOTIMPL.

@return org.virtualbox_7_0.IUSBDeviceFilters
*/
    public org.virtualbox_7_0.IUSBDeviceFilters getUSBDeviceFilters()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMachineGetUSBDeviceFilters(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IUSBDeviceFilters(retVal, getObjMgr(), port) : null;
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
The machine's audio settings.
@return org.virtualbox_7_0.IAudioSettings
*/
    public org.virtualbox_7_0.IAudioSettings getAudioSettings()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMachineGetAudioSettings(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IAudioSettings(retVal, getObjMgr(), port) : null;
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
Array of storage controllers attached to this machine.
@return List&lt;org.virtualbox_7_0.IStorageController&gt;
*/
    public List<org.virtualbox_7_0.IStorageController> getStorageControllers()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iMachineGetStorageControllers(obj);
            return Helper.wrap(org.virtualbox_7_0.IStorageController.class, getObjMgr(), port, retVal);
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
Full name of the file containing machine settings data.
@return String
*/
    public String getSettingsFilePath()
    {
        try
        {
            String retVal = port.iMachineGetSettingsFilePath(obj);
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
Full name of the file containing auxiliary machine settings data.
@return String
*/
    public String getSettingsAuxFilePath()
    {
        try
        {
            String retVal = port.iMachineGetSettingsAuxFilePath(obj);
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
Whether the settings of this machine have been modified
(but neither yet saved nor discarded).
NOTE: Reading this property is only valid on instances returned
by{@link org.virtualbox_7_0.ISession#getMachine()}and on new machines
created by{@link org.virtualbox_7_0.IVirtualBox#createMachine(String,String,List,String,String,String,String,String)}or opened
by{@link org.virtualbox_7_0.IVirtualBox#openMachine(String,String)}but not
yet registered, or on unregistered machines after calling{@link org.virtualbox_7_0.IMachine#unregister(org.virtualbox_7_0.CleanupMode)}. For all other
cases, the settings can never be modified.

NOTE: For newly created unregistered machines, the value of this
property is always  true until{@link #saveSettings()}is called (no matter if any machine settings have been
changed after the creation or not). For opened machines
the value is set to  false (and then follows to normal rules).

@return Boolean
*/
    public Boolean getSettingsModified()
    {
        try
        {
            Boolean retVal = port.iMachineGetSettingsModified(obj);
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
Current session state for this machine.
@return org.virtualbox_7_0.SessionState
*/
    public org.virtualbox_7_0.SessionState getSessionState()
    {
        try
        {
            org.virtualbox_7_0.jaxws.SessionState retVal = port.iMachineGetSessionState(obj);
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
Name of the session. If{@link #getSessionState()}is
Spawning or Locked, this attribute contains the
same value as passed to the{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}method in the
name parameter. If the session was established with{@link org.virtualbox_7_0.IMachine#lockMachine(org.virtualbox_7_0.ISession,org.virtualbox_7_0.LockType)}, it is the name of the session
(if set, otherwise empty string). If{@link #getSessionState()}is SessionClosed, the value of this
attribute is an empty string.
@return String
*/
    public String getSessionName()
    {
        try
        {
            String retVal = port.iMachineGetSessionName(obj);
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
Identifier of the session process. This attribute contains the
platform-dependent identifier of the process whose session was
used with{@link org.virtualbox_7_0.IMachine#lockMachine(org.virtualbox_7_0.ISession,org.virtualbox_7_0.LockType)}call. The returned
value is only valid if{@link #getSessionState()}is Locked or
Unlocking by the time this property is read.
@return Long
*/
    public Long getSessionPID()
    {
        try
        {
            Long retVal = port.iMachineGetSessionPID(obj);
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
Current execution state of this machine.
@return org.virtualbox_7_0.MachineState
*/
    public org.virtualbox_7_0.MachineState getState()
    {
        try
        {
            org.virtualbox_7_0.jaxws.MachineState retVal = port.iMachineGetState(obj);
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
Timestamp of the last execution state change,
in milliseconds since 1970-01-01 UTC.
@return Long
*/
    public Long getLastStateChange()
    {
        try
        {
            Long retVal = port.iMachineGetLastStateChange(obj);
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
Full path to the file that stores the execution state of
the machine when it is in either the{@link org.virtualbox_7_0.MachineState#Saved}or{@link org.virtualbox_7_0.MachineState#AbortedSaved}state.
NOTE: When the machine is not in the Saved or AbortedSaved state, this
attribute is an empty string.

@return String
*/
    public String getStateFilePath()
    {
        try
        {
            String retVal = port.iMachineGetStateFilePath(obj);
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
Full path to the folder that stores a set of rotated log files
recorded during machine execution. The most recent log file is
named<code>VBox.log</code>, the previous log file is
named<code>VBox.log.1</code>and so on (up to<code>VBox.log.3</code>in the current version).
@return String
*/
    public String getLogFolder()
    {
        try
        {
            String retVal = port.iMachineGetLogFolder(obj);
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
Current snapshot of this machine. This is  null if the machine
currently has no snapshots. If it is not  null, then it was
set by one of{@link #takeSnapshot(String,String,Boolean,Holder)},{@link #deleteSnapshot(String)}or{@link #restoreSnapshot(org.virtualbox_7_0.ISnapshot)}, depending on which was called last.
See{@link org.virtualbox_7_0.ISnapshot}for details.
@return org.virtualbox_7_0.ISnapshot
*/
    public org.virtualbox_7_0.ISnapshot getCurrentSnapshot()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMachineGetCurrentSnapshot(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.ISnapshot(retVal, getObjMgr(), port) : null;
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
Number of snapshots taken on this machine. Zero means the
machine doesn't have any snapshots.
@return Long
*/
    public Long getSnapshotCount()
    {
        try
        {
            Long retVal = port.iMachineGetSnapshotCount(obj);
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
Returns  true if the current state of the machine is not
identical to the state stored in the current snapshot.

The current state is identical to the current snapshot only
directly after one of the following calls are made:<ul><li>{@link #restoreSnapshot(org.virtualbox_7_0.ISnapshot)}</li><li>{@link #takeSnapshot(String,String,Boolean,Holder)}(issued on a "powered off" or "saved"
machine, for which{@link #getSettingsModified()}returns  false)</li></ul>The current state remains identical until one of the following
happens:<ul><li>settings of the machine are changed</li><li>the saved state is deleted</li><li>the current snapshot is deleted</li><li>an attempt to execute the machine is made</li></ul>
NOTE: For machines that don't have snapshots, this property is
always  false.

@return Boolean
*/
    public Boolean getCurrentStateModified()
    {
        try
        {
            Boolean retVal = port.iMachineGetCurrentStateModified(obj);
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
Collection of shared folders for this machine (permanent shared
folders). These folders are shared automatically at machine startup
and available only to the guest OS installed within this machine.

New shared folders are added to the collection using{@link #createSharedFolder(String,String,Boolean,Boolean,String)}. Existing shared folders can be
removed using{@link #removeSharedFolder(String)}.
@return List&lt;org.virtualbox_7_0.ISharedFolder&gt;
*/
    public List<org.virtualbox_7_0.ISharedFolder> getSharedFolders()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iMachineGetSharedFolders(obj);
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
Synchronization mode between the host OS clipboard
and the guest OS clipboard.
@return org.virtualbox_7_0.ClipboardMode
*/
    public org.virtualbox_7_0.ClipboardMode getClipboardMode()
    {
        try
        {
            org.virtualbox_7_0.jaxws.ClipboardMode retVal = port.iMachineGetClipboardMode(obj);
            return org.virtualbox_7_0.ClipboardMode.fromValue(retVal.value());
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
Synchronization mode between the host OS clipboard
and the guest OS clipboard.
@param value org.virtualbox_7_0.ClipboardMode

*/
    public void setClipboardMode(org.virtualbox_7_0.ClipboardMode value)
    {
        try
        {
        port.iMachineSetClipboardMode(obj, org.virtualbox_7_0.jaxws.ClipboardMode.fromValue(value.name()));
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
Sets or retrieves whether clipboard file transfers are allowed or not.

When set to  true, clipboard file transfers between supported
host and guest OSes are allowed.
@return Boolean
*/
    public Boolean getClipboardFileTransfersEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineGetClipboardFileTransfersEnabled(obj);
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
Sets or retrieves whether clipboard file transfers are allowed or not.

When set to  true, clipboard file transfers between supported
host and guest OSes are allowed.
@param value Boolean

*/
    public void setClipboardFileTransfersEnabled(Boolean value)
    {
        try
        {
        port.iMachineSetClipboardFileTransfersEnabled(obj, value);
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
Sets or retrieves the current drag'n drop mode.
@return org.virtualbox_7_0.DnDMode
*/
    public org.virtualbox_7_0.DnDMode getDnDMode()
    {
        try
        {
            org.virtualbox_7_0.jaxws.DnDMode retVal = port.iMachineGetDnDMode(obj);
            return org.virtualbox_7_0.DnDMode.fromValue(retVal.value());
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
Sets or retrieves the current drag'n drop mode.
@param value org.virtualbox_7_0.DnDMode

*/
    public void setDnDMode(org.virtualbox_7_0.DnDMode value)
    {
        try
        {
        port.iMachineSetDnDMode(obj, org.virtualbox_7_0.jaxws.DnDMode.fromValue(value.name()));
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
When set to  true, the virtual machine becomes a target teleporter
the next time it is powered on. This can only set to  true when the
VM is in the  PoweredOff or  Aborted state.
@return Boolean
*/
    public Boolean getTeleporterEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineGetTeleporterEnabled(obj);
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
When set to  true, the virtual machine becomes a target teleporter
the next time it is powered on. This can only set to  true when the
VM is in the  PoweredOff or  Aborted state.
@param value Boolean

*/
    public void setTeleporterEnabled(Boolean value)
    {
        try
        {
        port.iMachineSetTeleporterEnabled(obj, value);
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
The TCP port the target teleporter will listen for incoming
teleportations on.

0 means the port is automatically selected upon power on. The actual
value can be read from this property while the machine is waiting for
incoming teleportations.
@return Long
*/
    public Long getTeleporterPort()
    {
        try
        {
            Long retVal = port.iMachineGetTeleporterPort(obj);
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
The TCP port the target teleporter will listen for incoming
teleportations on.

0 means the port is automatically selected upon power on. The actual
value can be read from this property while the machine is waiting for
incoming teleportations.
@param value Long

*/
    public void setTeleporterPort(Long value)
    {
        try
        {
        port.iMachineSetTeleporterPort(obj, value);
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
The address the target teleporter will listen on. If set to an empty
string, it will listen on all addresses.
@return String
*/
    public String getTeleporterAddress()
    {
        try
        {
            String retVal = port.iMachineGetTeleporterAddress(obj);
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
The address the target teleporter will listen on. If set to an empty
string, it will listen on all addresses.
@param value String

*/
    public void setTeleporterAddress(String value)
    {
        try
        {
        port.iMachineSetTeleporterAddress(obj, value);
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
The password to check for on the target teleporter. This is just a
very basic measure to prevent simple hacks and operators accidentally
beaming a virtual machine to the wrong place.

Note that you SET a plain text password while reading back a HASHED
password. Setting a hashed password is currently not supported.
@return String
*/
    public String getTeleporterPassword()
    {
        try
        {
            String retVal = port.iMachineGetTeleporterPassword(obj);
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
The password to check for on the target teleporter. This is just a
very basic measure to prevent simple hacks and operators accidentally
beaming a virtual machine to the wrong place.

Note that you SET a plain text password while reading back a HASHED
password. Setting a hashed password is currently not supported.
@param value String

*/
    public void setTeleporterPassword(String value)
    {
        try
        {
        port.iMachineSetTeleporterPassword(obj, value);
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
The paravirtualized guest interface provider.
@return org.virtualbox_7_0.ParavirtProvider
*/
    public org.virtualbox_7_0.ParavirtProvider getParavirtProvider()
    {
        try
        {
            org.virtualbox_7_0.jaxws.ParavirtProvider retVal = port.iMachineGetParavirtProvider(obj);
            return org.virtualbox_7_0.ParavirtProvider.fromValue(retVal.value());
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
The paravirtualized guest interface provider.
@param value org.virtualbox_7_0.ParavirtProvider

*/
    public void setParavirtProvider(org.virtualbox_7_0.ParavirtProvider value)
    {
        try
        {
        port.iMachineSetParavirtProvider(obj, org.virtualbox_7_0.jaxws.ParavirtProvider.fromValue(value.name()));
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
When set to  true, the RTC device of the virtual machine will run
in UTC time, otherwise in local time. Especially Unix guests prefer
the time in UTC.
@return Boolean
*/
    public Boolean getRTCUseUTC()
    {
        try
        {
            Boolean retVal = port.iMachineGetRTCUseUTC(obj);
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
When set to  true, the RTC device of the virtual machine will run
in UTC time, otherwise in local time. Especially Unix guests prefer
the time in UTC.
@param value Boolean

*/
    public void setRTCUseUTC(Boolean value)
    {
        try
        {
        port.iMachineSetRTCUseUTC(obj, value);
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
When set to  true, the builtin I/O cache of the virtual machine
will be enabled.
@return Boolean
*/
    public Boolean getIOCacheEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineGetIOCacheEnabled(obj);
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
When set to  true, the builtin I/O cache of the virtual machine
will be enabled.
@param value Boolean

*/
    public void setIOCacheEnabled(Boolean value)
    {
        try
        {
        port.iMachineSetIOCacheEnabled(obj, value);
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
Maximum size of the I/O cache in MB.
@return Long
*/
    public Long getIOCacheSize()
    {
        try
        {
            Long retVal = port.iMachineGetIOCacheSize(obj);
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
Maximum size of the I/O cache in MB.
@param value Long

*/
    public void setIOCacheSize(Long value)
    {
        try
        {
        port.iMachineSetIOCacheSize(obj, value);
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
Array of PCI devices assigned to this machine, to get list of all
PCI devices attached to the machine use{@link org.virtualbox_7_0.IConsole#getAttachedPCIDevices()}attribute, as this attribute
is intended to list only devices additional to what described in
virtual hardware config. Usually, this list keeps host's physical
devices assigned to the particular machine.
@return List&lt;org.virtualbox_7_0.IPCIDeviceAttachment&gt;
*/
    public List<org.virtualbox_7_0.IPCIDeviceAttachment> getPCIDeviceAssignments()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<org.virtualbox_7_0.jaxws.IPCIDeviceAttachment> retVal = port.iMachineGetPCIDeviceAssignments(obj);
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
Bandwidth control manager.
@return org.virtualbox_7_0.IBandwidthControl
*/
    public org.virtualbox_7_0.IBandwidthControl getBandwidthControl()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMachineGetBandwidthControl(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IBandwidthControl(retVal, getObjMgr(), port) : null;
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
Enables the tracing facility in the VMM (including PDM devices +
drivers). The VMM will consume about 0.5MB of more memory when
enabled and there may be some extra overhead from tracepoints that are
always enabled.
@return Boolean
*/
    public Boolean getTracingEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineGetTracingEnabled(obj);
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
Enables the tracing facility in the VMM (including PDM devices +
drivers). The VMM will consume about 0.5MB of more memory when
enabled and there may be some extra overhead from tracepoints that are
always enabled.
@param value Boolean

*/
    public void setTracingEnabled(Boolean value)
    {
        try
        {
        port.iMachineSetTracingEnabled(obj, value);
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
Tracepoint configuration to apply at startup when{@link org.virtualbox_7_0.IMachine#getTracingEnabled()}is true. The string specifies
a space separated of tracepoint group names to enable. The special
group 'all' enables all tracepoints. Check DBGFR3TracingConfig for
more details on available tracepoint groups and such.

Note that on hosts supporting DTrace (or similar), a lot of the
tracepoints may be implemented exclusively as DTrace probes. So, the
effect of the same config may differ between Solaris and Windows for
example.
@return String
*/
    public String getTracingConfig()
    {
        try
        {
            String retVal = port.iMachineGetTracingConfig(obj);
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
Tracepoint configuration to apply at startup when{@link org.virtualbox_7_0.IMachine#getTracingEnabled()}is true. The string specifies
a space separated of tracepoint group names to enable. The special
group 'all' enables all tracepoints. Check DBGFR3TracingConfig for
more details on available tracepoint groups and such.

Note that on hosts supporting DTrace (or similar), a lot of the
tracepoints may be implemented exclusively as DTrace probes. So, the
effect of the same config may differ between Solaris and Windows for
example.
@param value String

*/
    public void setTracingConfig(String value)
    {
        try
        {
        port.iMachineSetTracingConfig(obj, value);
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
Enables tracepoints in PDM devices and drivers to use the VMCPU or VM
structures when firing off trace points. This is especially useful
with DTrace tracepoints, as it allows you to use the VMCPU or VM
pointer to obtain useful information such as guest register state.

This is disabled by default because devices and drivers normally has no
business accessing the VMCPU or VM structures, and are therefore unable
to get any pointers to these.
@return Boolean
*/
    public Boolean getAllowTracingToAccessVM()
    {
        try
        {
            Boolean retVal = port.iMachineGetAllowTracingToAccessVM(obj);
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
Enables tracepoints in PDM devices and drivers to use the VMCPU or VM
structures when firing off trace points. This is especially useful
with DTrace tracepoints, as it allows you to use the VMCPU or VM
pointer to obtain useful information such as guest register state.

This is disabled by default because devices and drivers normally has no
business accessing the VMCPU or VM structures, and are therefore unable
to get any pointers to these.
@param value Boolean

*/
    public void setAllowTracingToAccessVM(Boolean value)
    {
        try
        {
        port.iMachineSetAllowTracingToAccessVM(obj, value);
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
Enables autostart of the VM during system boot.
@return Boolean
*/
    public Boolean getAutostartEnabled()
    {
        try
        {
            Boolean retVal = port.iMachineGetAutostartEnabled(obj);
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
Enables autostart of the VM during system boot.
@param value Boolean

*/
    public void setAutostartEnabled(Boolean value)
    {
        try
        {
        port.iMachineSetAutostartEnabled(obj, value);
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
Number of seconds to wait until the VM should be started during system boot.
@return Long
*/
    public Long getAutostartDelay()
    {
        try
        {
            Long retVal = port.iMachineGetAutostartDelay(obj);
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
Number of seconds to wait until the VM should be started during system boot.
@param value Long

*/
    public void setAutostartDelay(Long value)
    {
        try
        {
        port.iMachineSetAutostartDelay(obj, value);
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
Action type to do when the system is shutting down.
@return org.virtualbox_7_0.AutostopType
*/
    public org.virtualbox_7_0.AutostopType getAutostopType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.AutostopType retVal = port.iMachineGetAutostopType(obj);
            return org.virtualbox_7_0.AutostopType.fromValue(retVal.value());
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
Action type to do when the system is shutting down.
@param value org.virtualbox_7_0.AutostopType

*/
    public void setAutostopType(org.virtualbox_7_0.AutostopType value)
    {
        try
        {
        port.iMachineSetAutostopType(obj, org.virtualbox_7_0.jaxws.AutostopType.fromValue(value.name()));
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
Selects which VM frontend should be used by default when launching
this VM through the{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}method.
Empty or  null strings do not define a particular default, it is up
to{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}to select one. See the
description of{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}for the valid
frontend types.

This per-VM setting overrides the default defined by{@link org.virtualbox_7_0.ISystemProperties#getDefaultFrontend()}attribute, and is
overridden by a frontend type passed to{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}.
@return String
*/
    public String getDefaultFrontend()
    {
        try
        {
            String retVal = port.iMachineGetDefaultFrontend(obj);
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
Selects which VM frontend should be used by default when launching
this VM through the{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}method.
Empty or  null strings do not define a particular default, it is up
to{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}to select one. See the
description of{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}for the valid
frontend types.

This per-VM setting overrides the default defined by{@link org.virtualbox_7_0.ISystemProperties#getDefaultFrontend()}attribute, and is
overridden by a frontend type passed to{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}.
@param value String

*/
    public void setDefaultFrontend(String value)
    {
        try
        {
        port.iMachineSetDefaultFrontend(obj, value);
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
Returns whether there is an USB proxy available.
@return Boolean
*/
    public Boolean getUSBProxyAvailable()
    {
        try
        {
            Boolean retVal = port.iMachineGetUSBProxyAvailable(obj);
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
Sets the priority of the VM process. It is a VM setting which can
be changed both before starting the VM and at runtime.

The default value is 'Default', which selects the default
process priority.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - This attribute is currently not implemented.</dd>
</dl>

@return org.virtualbox_7_0.VMProcPriority
*/
    public org.virtualbox_7_0.VMProcPriority getVMProcessPriority()
    {
        try
        {
            org.virtualbox_7_0.jaxws.VMProcPriority retVal = port.iMachineGetVMProcessPriority(obj);
            return org.virtualbox_7_0.VMProcPriority.fromValue(retVal.value());
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
Sets the priority of the VM process. It is a VM setting which can
be changed both before starting the VM and at runtime.

The default value is 'Default', which selects the default
process priority.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - This attribute is currently not implemented.</dd>
</dl>

@param value org.virtualbox_7_0.VMProcPriority

*/
    public void setVMProcessPriority(org.virtualbox_7_0.VMProcPriority value)
    {
        try
        {
        port.iMachineSetVMProcessPriority(obj, org.virtualbox_7_0.jaxws.VMProcPriority.fromValue(value.name()));
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
Debug parameters for the paravirtualized guest interface provider.
@return String
*/
    public String getParavirtDebug()
    {
        try
        {
            String retVal = port.iMachineGetParavirtDebug(obj);
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
Debug parameters for the paravirtualized guest interface provider.
@param value String

*/
    public void setParavirtDebug(String value)
    {
        try
        {
        port.iMachineSetParavirtDebug(obj, value);
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
Experimental feature to select the guest CPU profile.  The default
is "host", which indicates the host CPU.  All other names are subject
to change.

Use the{@link org.virtualbox_7_0.ISystemProperties#getCPUProfiles(org.virtualbox_7_0.CPUArchitecture,String)}method to get
currently available CPU profiles.
@return String
*/
    public String getCPUProfile()
    {
        try
        {
            String retVal = port.iMachineGetCPUProfile(obj);
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
Experimental feature to select the guest CPU profile.  The default
is "host", which indicates the host CPU.  All other names are subject
to change.

Use the{@link org.virtualbox_7_0.ISystemProperties#getCPUProfiles(org.virtualbox_7_0.CPUArchitecture,String)}method to get
currently available CPU profiles.
@param value String

*/
    public void setCPUProfile(String value)
    {
        try
        {
        port.iMachineSetCPUProfile(obj, value);
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
Key Id of the password used for encrypting the state file.
Internal use only for now.
@return String
*/
    public String getStateKeyId()
    {
        try
        {
            String retVal = port.iMachineGetStateKeyId(obj);
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
Key store used for encrypting the state file.
Internal use only for now.
@return String
*/
    public String getStateKeyStore()
    {
        try
        {
            String retVal = port.iMachineGetStateKeyStore(obj);
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
Key Id of the password used for encrypting the log files.
Internal use only for now.
@return String
*/
    public String getLogKeyId()
    {
        try
        {
            String retVal = port.iMachineGetLogKeyId(obj);
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
Key store used for encrypting the log files.
Internal use only for now.
@return String
*/
    public String getLogKeyStore()
    {
        try
        {
            String retVal = port.iMachineGetLogKeyStore(obj);
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
Guest debugging configuration.
@return org.virtualbox_7_0.IGuestDebugControl
*/
    public org.virtualbox_7_0.IGuestDebugControl getGuestDebugControl()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMachineGetGuestDebugControl(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestDebugControl(retVal, getObjMgr(), port) : null;
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
    public static IMachine queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IMachine(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Locks the machine for the given session to enable the caller
to make changes to the machine or start the VM or control
VM execution.

There are two ways to lock a machine for such uses:<ul><li>If you want to make changes to the machine settings,
you must obtain an exclusive write lock on the machine
by setting  lockType to  Write.

This will only succeed if no other process has locked
the machine to prevent conflicting changes. Only after
an exclusive write lock has been obtained using this method, one
can change all VM settings or execute the VM in the process
space of the session object. (Note that the latter is only of
interest if you actually want to write a new front-end for
virtual machines; but this API gets called internally by
the existing front-ends such as VBoxHeadless and the VirtualBox
GUI to acquire a write lock on the machine that they are running.)

On success, write-locking the machine for a session creates
a second copy of the IMachine object. It is this second object
upon which changes can be made; in VirtualBox terminology, the
second copy is "mutable". It is only this second, mutable machine
object upon which you can call methods that change the
machine state. After having called this method, you can
obtain this second, mutable machine object using the{@link org.virtualbox_7_0.ISession#getMachine()}attribute.</li><li>If you only want to check the machine state or control
machine execution without actually changing machine
settings (e.g. to get access to VM statistics or take
a snapshot or save the machine state), then set the
lockType argument to  Shared.

If no other session has obtained a lock, you will obtain an
exclusive write lock as described above. However, if another
session has already obtained such a lock, then a link to that
existing session will be established which allows you
to control that existing session.

To find out which type of lock was obtained, you can
inspect{@link org.virtualbox_7_0.ISession#getType()}, which will have been
set to either  WriteLock or  Shared.</li></ul>In either case, you can get access to the{@link org.virtualbox_7_0.IConsole}object which controls VM execution.

Also in all of the above cases, one must always call{@link org.virtualbox_7_0.ISession#unlockMachine()}to release the lock on the machine, or
the machine's state will eventually be set to "Aborted".

To change settings on a machine, the following sequence is typically
performed:<ol><li>Call this method to obtain an exclusive write lock for the current session.</li><li>Obtain a mutable IMachine object from{@link org.virtualbox_7_0.ISession#getMachine()}.</li><li>Change the settings of the machine by invoking IMachine methods.</li><li>Call{@link org.virtualbox_7_0.IMachine#saveSettings()}.</li><li>Release the write lock by calling{@link org.virtualbox_7_0.ISession#unlockMachine()}.</li></ol>
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_UNEXPECTED</code> - Virtual machine not registered.</dd>
<dd><code>E_ACCESSDENIED</code> - Process not started by{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Session already open or being opened.</dd>
<dd><code>VBOX_E_VM_ERROR</code> - Failed to assign machine to session.</dd>
</dl>

@param session Session object for which the machine will be locked.

@param lockType If set to  Write, then attempt to acquire an exclusive write lock or fail.
If set to  Shared, then either acquire an exclusive write lock or establish
a link to an existing session.

*/
    public void lockMachine(org.virtualbox_7_0.ISession session, org.virtualbox_7_0.LockType lockType)
    {
        try
        {
        port.iMachineLockMachine(obj, ((session == null) ? null :session.getWrapped()), org.virtualbox_7_0.jaxws.LockType.fromValue(lockType.name()));
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
Spawns a new process that will execute the virtual machine and obtains a shared
lock on the machine for the calling session.

If launching the VM succeeds, the new VM process will create its own session
and write-lock the machine for it, preventing conflicting changes from other
processes. If the machine is already locked (because it is already running or
because another session has a write lock), launching the VM process will therefore
fail. Reversely, future attempts to obtain a write lock will also fail while the
machine is running.

The caller's session object remains separate from the session opened by the new
VM process. It receives its own{@link org.virtualbox_7_0.IConsole}object which can be used
to control machine execution, but it cannot be used to change all VM settings
which would be available after a{@link #lockMachine(org.virtualbox_7_0.ISession,org.virtualbox_7_0.LockType)}call.

The caller must eventually release the session's shared lock by calling{@link org.virtualbox_7_0.ISession#unlockMachine()}on the local session object once this call
has returned. However, the session's state (see{@link org.virtualbox_7_0.ISession#getState()})
will not return to "Unlocked" until the remote session has also unlocked
the machine (i.e. the machine has stopped running).

Launching a VM process can take some time (a new VM is started in a new process,
for which memory and other resources need to be set up). Because of this,
an{@link org.virtualbox_7_0.IProgress}object is returned to allow the caller to wait
for this asynchronous operation to be completed. Until then, the caller's
session object remains in the "Unlocked" state, and its{@link org.virtualbox_7_0.ISession#getMachine()}and{@link org.virtualbox_7_0.ISession#getConsole()}attributes cannot be accessed.
It is recommended to use{@link org.virtualbox_7_0.IProgress#waitForCompletion(Integer)}or
similar calls to wait for completion. Completion is signalled when the VM
is powered on. If launching the VM fails, error messages can be queried
via the progress object, if available.

The progress object will have at least 2 sub-operations. The first
operation covers the period up to the new VM process calls powerUp.
The subsequent operations mirror the{@link org.virtualbox_7_0.IConsole#powerUp()}progress object. Because{@link org.virtualbox_7_0.IConsole#powerUp()}may require
some extra sub-operations, the{@link org.virtualbox_7_0.IProgress#getOperationCount()}may change at the completion of operation.

For details on the teleportation progress operation, see{@link org.virtualbox_7_0.IConsole#powerUp()}.

The  environmentChanges argument is a list of strings where every string contains
environment variable in the putenv style, i.e. "VAR=VALUE" for setting/replacing
and "VAR" for unsetting. These environment variables will be applied to the environment
of the VirtualBox server process. If an environment variable exists both in the server
process and in this list, the value from this list takes precedence over the
server's variable. If the value of the environment variable is omitted, this variable
will be removed from the resulting environment. If the list is empty, the server
environment is inherited by the started process as is.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_UNEXPECTED</code> - Virtual machine not registered.</dd>
<dd><code>E_INVALIDARG</code> - Invalid session type  type.</dd>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - No machine matching  machineId found.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Session already open or being opened.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - Launching process for machine failed.</dd>
<dd><code>VBOX_E_VM_ERROR</code> - Failed to assign machine to session.</dd>
</dl>

@param session Client session object to which the VM process will be connected (this
must be in "Unlocked" state).

@param name Front-end to use for the new VM process. The following are currently supported:<ul><li><code>"gui"</code>: VirtualBox Qt GUI front-end</li><li><code>"headless"</code>: VBoxHeadless (VRDE Server) front-end</li><li><code>"sdl"</code>: VirtualBox SDL front-end</li><li><code>"emergencystop"</code>: reserved value, used for aborting
the currently running VM or session owner. In this case the
session parameter may be  null (if it is non-null it isn't
used in any way), and the  progress return value will be always
null. The operation completes immediately.</li><li><code>""</code>: use the per-VM default frontend if set, otherwise
the global default defined in the system properties. If neither
are set, the API will launch a<code>"gui"</code>session, which may
fail if there is no windowing environment available. See{@link org.virtualbox_7_0.IMachine#getDefaultFrontend()}and{@link org.virtualbox_7_0.ISystemProperties#getDefaultFrontend()}.</li></ul>

@param environmentChanges The list of putenv-style changes to the VM process environment.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress launchVMProcess(org.virtualbox_7_0.ISession session, String name, List<String> environmentChanges)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineLaunchVMProcess(obj, ((session == null) ? null :session.getWrapped()), name, environmentChanges);
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
Puts the given device to the specified position in
the boot order.

To indicate that no device is associated with the given position,{@link org.virtualbox_7_0.DeviceType#Null}should be used.

TODO setHardDiskBootOrder(), setNetworkBootOrder()
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Boot  position out of range.</dd>
<dd><code>E_NOTIMPL</code> - Booting from USB  device currently not supported.</dd>
</dl>

@param position Position in the boot order ( 1 to the total number of
devices the machine can boot from, as returned by{@link org.virtualbox_7_0.ISystemProperties#getMaxBootPosition()}).

@param device The type of the device used to boot at the given position.

*/
    public void setBootOrder(Long position, org.virtualbox_7_0.DeviceType device)
    {
        try
        {
        port.iMachineSetBootOrder(obj, position, org.virtualbox_7_0.jaxws.DeviceType.fromValue(device.name()));
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
Returns the device type that occupies the specified
position in the boot order.

TODO [remove?]
If the machine can have more than one device of the returned type
(such as hard disks), then a separate method should be used to
retrieve the individual device that occupies the given position.

If here are no devices at the given position, then{@link org.virtualbox_7_0.DeviceType#Null}is returned.

TODO getHardDiskBootOrder(), getNetworkBootOrder()
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Boot  position out of range.</dd>
</dl>

@param position Position in the boot order ( 1 to the total number of
devices the machine can boot from, as returned by{@link org.virtualbox_7_0.ISystemProperties#getMaxBootPosition()}).

@return Device at the given position.

*/
    public org.virtualbox_7_0.DeviceType getBootOrder(Long position)
    {
        try
        {
            org.virtualbox_7_0.jaxws.DeviceType retVal;
        retVal = port.iMachineGetBootOrder(obj, position);
           return org.virtualbox_7_0.DeviceType.fromValue(retVal.value());
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
Attaches a device and optionally mounts a medium to the given storage
controller ({@link org.virtualbox_7_0.IStorageController}, identified by  name),
at the indicated port and device.

This method is intended for managing storage devices in general while a
machine is powered off. It can be used to attach and detach fixed
and removable media. The following kind of media can be attached
to a machine:<ul><li>For fixed and removable media, you can pass in a medium that was
previously opened using{@link org.virtualbox_7_0.IVirtualBox#openMedium(String,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.AccessMode,Boolean)}.</li><li>Only for storage devices supporting removable media (such as
DVDs and floppies), you can also specify a null pointer to
indicate an empty drive or one of the medium objects listed
in the{@link org.virtualbox_7_0.IHost#getDVDDrives()}and{@link org.virtualbox_7_0.IHost#getFloppyDrives()}arrays to indicate a host drive.
For removable devices, you can also use{@link org.virtualbox_7_0.IMachine#mountMedium(String,Integer,Integer,org.virtualbox_7_0.IMedium,Boolean)}to change the media while the machine is running.</li></ul>In a VM's default configuration of virtual machines, the secondary
master of the IDE controller is used for a CD/DVD drive.

After calling this returns successfully, a new instance of{@link org.virtualbox_7_0.IMediumAttachment}will appear in the machine's list of medium
attachments (see{@link org.virtualbox_7_0.IMachine#getMediumAttachments()}).

See{@link org.virtualbox_7_0.IMedium}and{@link org.virtualbox_7_0.IMediumAttachment}for more
information about attaching media.

The specified device slot must not have a device attached to it,
or this method will fail.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - SATA device, SATA port, IDE port or IDE slot out of range, or
file or UUID not found.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Machine must be registered before media can be attached.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Invalid machine state.</dd>
<dd><code>VBOX_E_OBJECT_IN_USE</code> - A medium is already attached to this or another virtual machine.</dd>
</dl>

@param name Name of the storage controller to attach the device to.

@param controllerPort Port to attach the device to. For an IDE controller, 0 specifies
the primary controller and 1 specifies the secondary controller.
For a SCSI controller, this must range from 0 to 15; for a SATA controller,
from 0 to 29; for an SAS controller, from 0 to 7.

@param device Device slot in the given port to attach the device to. This is only
relevant for IDE controllers, for which 0 specifies the master device and
1 specifies the slave device. For all other controller types, this must
be 0.

@param type Device type of the attached device. For media opened by{@link org.virtualbox_7_0.IVirtualBox#openMedium(String,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.AccessMode,Boolean)}, this must match the device type
specified there.

@param medium Medium to mount or  null for an empty drive.

NOTE: You cannot attach a device to a newly created machine until
this machine's settings are saved to disk using{@link #saveSettings()}.

NOTE: If the medium is being attached indirectly, a new differencing medium
will implicitly be created for it and attached instead. If the
changes made to the machine settings (including this indirect
attachment) are later cancelled using{@link #discardSettings()},
this implicitly created differencing medium will implicitly
be deleted.

*/
    public void attachDevice(String name, Integer controllerPort, Integer device, org.virtualbox_7_0.DeviceType type, org.virtualbox_7_0.IMedium medium)
    {
        try
        {
        port.iMachineAttachDevice(obj, name, controllerPort, device, org.virtualbox_7_0.jaxws.DeviceType.fromValue(type.name()), ((medium == null) ? null :medium.getWrapped()));
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
Attaches a device and optionally mounts a medium to the given storage
controller ({@link org.virtualbox_7_0.IStorageController}, identified by  name),
at the indicated port and device.

This method is intended for managing storage devices in general while a
machine is powered off. It can be used to attach and detach fixed
and removable media. The following kind of media can be attached
to a machine:<ul><li>For fixed and removable media, you can pass in a medium that was
previously opened using{@link org.virtualbox_7_0.IVirtualBox#openMedium(String,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.AccessMode,Boolean)}.</li><li>Only for storage devices supporting removable media (such as
DVDs and floppies) with an empty drive or one of the medium objects listed
in the{@link org.virtualbox_7_0.IHost#getDVDDrives()}and{@link org.virtualbox_7_0.IHost#getFloppyDrives()}arrays to indicate a host drive.
For removable devices, you can also use{@link org.virtualbox_7_0.IMachine#mountMedium(String,Integer,Integer,org.virtualbox_7_0.IMedium,Boolean)}to change the media while the machine is running.</li></ul>In a VM's default configuration of virtual machines, the secondary
master of the IDE controller is used for a CD/DVD drive.{@link org.virtualbox_7_0.IMediumAttachment}will appear in the machine's list of medium
attachments (see{@link org.virtualbox_7_0.IMachine#getMediumAttachments()}).

See{@link org.virtualbox_7_0.IMedium}and{@link org.virtualbox_7_0.IMediumAttachment}for more
information about attaching media.

The specified device slot must not have a device attached to it,
or this method will fail.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - SATA device, SATA port, IDE port or IDE slot out of range, or
file or UUID not found.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Machine must be registered before media can be attached.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Invalid machine state.</dd>
<dd><code>VBOX_E_OBJECT_IN_USE</code> - A medium is already attached to this or another virtual machine.</dd>
</dl>

@param name Name of the storage controller to attach the device to.

@param controllerPort Port to attach the device to. For an IDE controller, 0 specifies
the primary controller and 1 specifies the secondary controller.
For a SCSI controller, this must range from 0 to 15; for a SATA controller,
from 0 to 29; for an SAS controller, from 0 to 7.

@param device Device slot in the given port to attach the device to. This is only
relevant for IDE controllers, for which 0 specifies the master device and
1 specifies the slave device. For all other controller types, this must
be 0.

@param type Device type of the attached device. For media opened by{@link org.virtualbox_7_0.IVirtualBox#openMedium(String,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.AccessMode,Boolean)}, this must match the device type
specified there.

NOTE: You cannot attach a device to a newly created machine until
this machine's settings are saved to disk using{@link #saveSettings()}.

NOTE: If the medium is being attached indirectly, a new differencing medium
will implicitly be created for it and attached instead. If the
changes made to the machine settings (including this indirect
attachment) are later cancelled using{@link #discardSettings()},
this implicitly created differencing medium will implicitly
be deleted.

*/
    public void attachDeviceWithoutMedium(String name, Integer controllerPort, Integer device, org.virtualbox_7_0.DeviceType type)
    {
        try
        {
        port.iMachineAttachDeviceWithoutMedium(obj, name, controllerPort, device, org.virtualbox_7_0.jaxws.DeviceType.fromValue(type.name()));
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
Detaches the device attached to a device slot of the specified bus.

Detaching the device from the virtual machine is deferred. This means
that the medium remains associated with the machine when this method
returns and gets actually de-associated only after a successful{@link #saveSettings()}call. See{@link org.virtualbox_7_0.IMedium}for more detailed information about attaching media.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Attempt to detach medium from a running virtual machine.</dd>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - No medium attached to given slot/bus.</dd>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Medium format does not support storage deletion (only for implicitly
created differencing media, should not happen).</dd>
</dl>

@param name Name of the storage controller to detach the medium from.

@param controllerPort Port number to detach the medium from.

@param device Device slot number to detach the medium from.

NOTE: You cannot detach a device from a running machine.

NOTE: Detaching differencing media implicitly created by{@link #attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}for the indirect attachment using this
method will<b>not</b>implicitly delete them. The{@link org.virtualbox_7_0.IMedium#deleteStorage()}operation should be
explicitly performed by the caller after the medium is successfully
detached and the settings are saved with{@link #saveSettings()}, if it is the desired action.

*/
    public void detachDevice(String name, Integer controllerPort, Integer device)
    {
        try
        {
        port.iMachineDetachDevice(obj, name, controllerPort, device);
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
Sets the passthrough mode of an existing DVD device. Changing the
setting while the VM is running is forbidden. The setting is only used
if at VM start the device is configured as a host DVD drive, in all
other cases it is ignored. The device must already exist; see{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}for how to attach a new device.

The  controllerPort and  device parameters specify the device slot and
have have the same meaning as with{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - SATA device, SATA port, IDE port or IDE slot out of range.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Attempt to modify an unregistered virtual machine.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Invalid machine state.</dd>
</dl>

@param name Name of the storage controller.

@param controllerPort Storage controller port.

@param device Device slot in the given port.

@param passthrough New value for the passthrough setting.

*/
    public void passthroughDevice(String name, Integer controllerPort, Integer device, Boolean passthrough)
    {
        try
        {
        port.iMachinePassthroughDevice(obj, name, controllerPort, device, passthrough);
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
Sets the behavior for guest-triggered medium eject. In some situations
it is desirable that such ejects update the VM configuration, and in
others the eject should keep the VM configuration. The device must
already exist; see{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}for how to
attach a new device.

The  controllerPort and  device parameters specify the device slot and
have have the same meaning as with{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - SATA device, SATA port, IDE port or IDE slot out of range.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Attempt to modify an unregistered virtual machine.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Invalid machine state.</dd>
</dl>

@param name Name of the storage controller.

@param controllerPort Storage controller port.

@param device Device slot in the given port.

@param temporaryEject New value for the eject behavior.

*/
    public void temporaryEjectDevice(String name, Integer controllerPort, Integer device, Boolean temporaryEject)
    {
        try
        {
        port.iMachineTemporaryEjectDevice(obj, name, controllerPort, device, temporaryEject);
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
Sets a flag in the device information which indicates that the medium
is not based on rotational technology, i.e. that the access times are
more or less independent of the position on the medium. This may or may
not be supported by a particular drive, and is silently ignored in the
latter case. At the moment only hard disks (which is a misnomer in this
context) accept this setting. Changing the setting while the VM is
running is forbidden. The device must already exist; see{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}for how to attach a new device.

The  controllerPort and  device parameters specify the device slot and
have have the same meaning as with{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - SATA device, SATA port, IDE port or IDE slot out of range.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Attempt to modify an unregistered virtual machine.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Invalid machine state.</dd>
</dl>

@param name Name of the storage controller.

@param controllerPort Storage controller port.

@param device Device slot in the given port.

@param nonRotational New value for the non-rotational device flag.

*/
    public void nonRotationalDevice(String name, Integer controllerPort, Integer device, Boolean nonRotational)
    {
        try
        {
        port.iMachineNonRotationalDevice(obj, name, controllerPort, device, nonRotational);
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
Sets a flag in the device information which indicates that the medium
supports discarding unused blocks (called trimming for SATA or unmap
for SCSI devices) .This may or may not be supported by a particular drive,
and is silently ignored in the latter case. At the moment only hard disks
(which is a misnomer in this context) accept this setting. Changing the
setting while the VM is running is forbidden. The device must already
exist; see{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}for how to attach a new
device.

The  controllerPort and  device parameters specify the device slot and
have have the same meaning as with{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - SATA device, SATA port, SCSI port out of range.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Attempt to modify an unregistered virtual machine.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Invalid machine state.</dd>
</dl>

@param name Name of the storage controller.

@param controllerPort Storage controller port.

@param device Device slot in the given port.

@param discard New value for the discard device flag.

*/
    public void setAutoDiscardForDevice(String name, Integer controllerPort, Integer device, Boolean discard)
    {
        try
        {
        port.iMachineSetAutoDiscardForDevice(obj, name, controllerPort, device, discard);
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
Sets a flag in the device information which indicates that the attached
device is hot pluggable or not. This may or may not be supported by a
particular controller and/or drive, and is silently ignored in the
latter case. Changing the setting while the VM is running is forbidden.
The device must already exist; see{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}for how to attach a new device.

The  controllerPort and  device parameters specify the device slot and
have have the same meaning as with{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - SATA device, SATA port, IDE port or IDE slot out of range.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Attempt to modify an unregistered virtual machine.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Invalid machine state.</dd>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Controller doesn't support hot plugging.</dd>
</dl>

@param name Name of the storage controller.

@param controllerPort Storage controller port.

@param device Device slot in the given port.

@param hotPluggable New value for the hot-pluggable device flag.

*/
    public void setHotPluggableForDevice(String name, Integer controllerPort, Integer device, Boolean hotPluggable)
    {
        try
        {
        port.iMachineSetHotPluggableForDevice(obj, name, controllerPort, device, hotPluggable);
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
Sets the bandwidth group of an existing storage device.
The device must already exist; see{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}for how to attach a new device.

The  controllerPort and  device parameters specify the device slot and
have have the same meaning as with{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - SATA device, SATA port, IDE port or IDE slot out of range.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Attempt to modify an unregistered virtual machine.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Invalid machine state.</dd>
</dl>

@param name Name of the storage controller.

@param controllerPort Storage controller port.

@param device Device slot in the given port.

@param bandwidthGroup New value for the bandwidth group or  null for no group.

*/
    public void setBandwidthGroupForDevice(String name, Integer controllerPort, Integer device, org.virtualbox_7_0.IBandwidthGroup bandwidthGroup)
    {
        try
        {
        port.iMachineSetBandwidthGroupForDevice(obj, name, controllerPort, device, ((bandwidthGroup == null) ? null :bandwidthGroup.getWrapped()));
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
Sets no bandwidth group for an existing storage device.
The device must already exist; see{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}for how to attach a new device.
The  controllerPort and  device parameters specify the device slot and
have have the same meaning as with{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - SATA device, SATA port, IDE port or IDE slot out of range.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Attempt to modify an unregistered virtual machine.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Invalid machine state.</dd>
</dl>

@param name Name of the storage controller.

@param controllerPort Storage controller port.

@param device Device slot in the given port.

*/
    public void setNoBandwidthGroupForDevice(String name, Integer controllerPort, Integer device)
    {
        try
        {
        port.iMachineSetNoBandwidthGroupForDevice(obj, name, controllerPort, device);
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
Unmounts any currently mounted medium ({@link org.virtualbox_7_0.IMedium},
identified by the given UUID  id) to the given storage controller
({@link org.virtualbox_7_0.IStorageController}, identified by  name),
at the indicated port and device. The device must already exist;

This method is intended only for managing removable media, where the
device is fixed but media is changeable at runtime (such as DVDs
and floppies). It cannot be used for fixed media such as hard disks.

The  controllerPort and  device parameters specify the device slot
and have have the same meaning as with{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}.

The specified device slot must have a medium mounted, which will be
unmounted. If there is no mounted medium it will do nothing.
See{@link org.virtualbox_7_0.IMedium}for more detailed information about
attaching/unmounting media.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - SATA device, SATA port, IDE port or IDE slot out of range.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Attempt to unmount medium that is not removable - not DVD or floppy.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Invalid machine state.</dd>
<dd><code>VBOX_E_OBJECT_IN_USE</code> - Medium already attached to this or another virtual machine.</dd>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - Medium not attached to specified port, device, controller.</dd>
</dl>

@param name Name of the storage controller to unmount the medium from.

@param controllerPort Port to unmount the medium from.

@param device Device slot in the given port to unmount the medium from.

@param force Allows to force unmount of a medium which is locked by
the device slot in the given port medium is attached to.

*/
    public void unmountMedium(String name, Integer controllerPort, Integer device, Boolean force)
    {
        try
        {
        port.iMachineUnmountMedium(obj, name, controllerPort, device, force);
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
Mounts a medium ({@link org.virtualbox_7_0.IMedium}, identified
by the given UUID  id) to the given storage controller
({@link org.virtualbox_7_0.IStorageController}, identified by  name),
at the indicated port and device. The device must already exist;
see{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}for how to attach a new device.

This method is intended only for managing removable media, where the
device is fixed but media is changeable at runtime (such as DVDs
and floppies). It cannot be used for fixed media such as hard disks.

The  controllerPort and  device parameters specify the device slot and
have have the same meaning as with{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}.

The specified device slot can have a medium mounted, which will be
unmounted first. Specifying a zero UUID (or an empty string) for
medium does just an unmount.

See{@link org.virtualbox_7_0.IMedium}for more detailed information about
attaching media.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - SATA device, SATA port, IDE port or IDE slot out of range.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Attempt to attach medium to an unregistered virtual machine.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Invalid machine state.</dd>
<dd><code>VBOX_E_OBJECT_IN_USE</code> - Medium already attached to this or another virtual machine.</dd>
</dl>

@param name Name of the storage controller to attach the medium to.

@param controllerPort Port to attach the medium to.

@param device Device slot in the given port to attach the medium to.

@param medium Medium to mount or  null for an empty drive.

@param force Allows to force unmount/mount of a medium which is locked by
the device slot in the given port to attach the medium to.

*/
    public void mountMedium(String name, Integer controllerPort, Integer device, org.virtualbox_7_0.IMedium medium, Boolean force)
    {
        try
        {
        port.iMachineMountMedium(obj, name, controllerPort, device, ((medium == null) ? null :medium.getWrapped()), force);
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
Returns the virtual medium attached to a device slot of the specified
bus.

Note that if the medium was indirectly attached by{@link #mountMedium(String,Integer,Integer,org.virtualbox_7_0.IMedium,Boolean)}to the given device slot then this
method will return not the same object as passed to the{@link #mountMedium(String,Integer,Integer,org.virtualbox_7_0.IMedium,Boolean)}call. See{@link org.virtualbox_7_0.IMedium}for
more detailed information about mounting a medium.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - No medium attached to given slot/bus.</dd>
</dl>

@param name Name of the storage controller the medium is attached to.

@param controllerPort Port to query.

@param device Device slot in the given port to query.

@return Attached medium object.

*/
    public org.virtualbox_7_0.IMedium getMedium(String name, Integer controllerPort, Integer device)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineGetMedium(obj, name, controllerPort, device);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IMedium(retVal, getObjMgr(), port) : null;
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
Returns an array of medium attachments which are attached to the
the controller with the given name.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - A storage controller with given name doesn't exist.</dd>
</dl>

*/
    public List<org.virtualbox_7_0.IMediumAttachment> getMediumAttachmentsOfController(String name)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<org.virtualbox_7_0.jaxws.IMediumAttachment> retVal;
        retVal = port.iMachineGetMediumAttachmentsOfController(obj, name);
           return Helper.wrap2(org.virtualbox_7_0.IMediumAttachment.class, org.virtualbox_7_0.jaxws.IMediumAttachment.class, objMgr, port, retVal);
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
Returns a medium attachment which corresponds to the controller with
the given name, on the given port and device slot.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - No attachment exists for the given controller/port/device combination.</dd>
</dl>

*/
    public org.virtualbox_7_0.IMediumAttachment getMediumAttachment(String name, Integer controllerPort, Integer device)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            org.virtualbox_7_0.jaxws.IMediumAttachment retVal;
        retVal = port.iMachineGetMediumAttachment(obj, name, controllerPort, device);
           return (retVal != null) ? new org.virtualbox_7_0.IMediumAttachment(retVal, getObjMgr(), port) : null;
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
Attaches host PCI device with the given (host) PCI address to the
PCI bus of the virtual machine. Please note, that this operation
is two phase, as real attachment will happen when VM will start,
and most information will be delivered as IHostPCIDevicePlugEvent
on IVirtualBox event source.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine state is not stopped (PCI hotplug not yet implemented).</dd>
<dd><code>VBOX_E_PDM_ERROR</code> - Virtual machine does not have a PCI controller allowing attachment of physical devices.</dd>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Hardware or host OS doesn't allow PCI device passthrough.</dd>
</dl>

@param hostAddress Address of the host PCI device.

@param desiredGuestAddress Desired position of this device on guest PCI bus.

@param tryToUnbind If VMM shall try to unbind existing drivers from the
device before attaching it to the guest.

@see org.virtualbox_7_0.IHostPCIDevicePlugEvent

*/
    public void attachHostPCIDevice(Integer hostAddress, Integer desiredGuestAddress, Boolean tryToUnbind)
    {
        try
        {
        port.iMachineAttachHostPCIDevice(obj, hostAddress, desiredGuestAddress, tryToUnbind);
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
Detach host PCI device from the virtual machine.
Also HostPCIDevicePlugEvent on IVirtualBox event source
will be delivered. As currently we don't support hot device
unplug, IHostPCIDevicePlugEvent event is delivered immediately.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine state is not stopped (PCI hotplug not yet implemented).</dd>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - This host device is not attached to this machine.</dd>
<dd><code>VBOX_E_PDM_ERROR</code> - Virtual machine does not have a PCI controller allowing attachment of physical devices.</dd>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Hardware or host OS doesn't allow PCI device passthrough.</dd>
</dl>

@param hostAddress Address of the host PCI device.

@see org.virtualbox_7_0.IHostPCIDevicePlugEvent

*/
    public void detachHostPCIDevice(Integer hostAddress)
    {
        try
        {
        port.iMachineDetachHostPCIDevice(obj, hostAddress);
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
Returns the network adapter associated with the given slot.
Slots are numbered sequentially, starting with zero. The total
number of adapters per machine is defined by the{@link org.virtualbox_7_0.ISystemProperties#getMaxNetworkAdapters(org.virtualbox_7_0.ChipsetType)}property,
so the maximum slot number is one less than that property's value.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Invalid  slot number.</dd>
</dl>

*/
    public org.virtualbox_7_0.INetworkAdapter getNetworkAdapter(Long slot)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineGetNetworkAdapter(obj, slot);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.INetworkAdapter(retVal, getObjMgr(), port) : null;
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
Adds a new storage controller (SCSI, SAS or SATA controller) to the
machine and returns it as an instance of{@link org.virtualbox_7_0.IStorageController}.

name identifies the controller for subsequent calls such as{@link #getStorageControllerByName(String)},{@link #getStorageControllerByInstance(org.virtualbox_7_0.StorageBus,Long)},{@link #removeStorageController(String)},{@link #attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}or{@link #mountMedium(String,Integer,Integer,org.virtualbox_7_0.IMedium,Boolean)}.

After the controller has been added, you can set its exact
type by setting the{@link org.virtualbox_7_0.IStorageController#getControllerType()}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_IN_USE</code> - A storage controller with given name exists already.</dd>
<dd><code>E_INVALIDARG</code> - Invalid  controllerType.</dd>
</dl>

*/
    public org.virtualbox_7_0.IStorageController addStorageController(String name, org.virtualbox_7_0.StorageBus connectionType)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineAddStorageController(obj, name, org.virtualbox_7_0.jaxws.StorageBus.fromValue(connectionType.name()));
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IStorageController(retVal, getObjMgr(), port) : null;
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
Returns a storage controller with the given name.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - A storage controller with given name doesn't exist.</dd>
</dl>

*/
    public org.virtualbox_7_0.IStorageController getStorageControllerByName(String name)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineGetStorageControllerByName(obj, name);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IStorageController(retVal, getObjMgr(), port) : null;
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
Returns a storage controller of a specific storage bus
with the given instance number.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - A storage controller with given instance number doesn't exist.</dd>
</dl>

*/
    public org.virtualbox_7_0.IStorageController getStorageControllerByInstance(org.virtualbox_7_0.StorageBus connectionType, Long instance)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineGetStorageControllerByInstance(obj, org.virtualbox_7_0.jaxws.StorageBus.fromValue(connectionType.name()), instance);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IStorageController(retVal, getObjMgr(), port) : null;
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
Removes a storage controller from the machine with all devices attached to it.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - A storage controller with given name doesn't exist.</dd>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Medium format does not support storage deletion (only for implicitly
created differencing media, should not happen).</dd>
</dl>

*/
    public void removeStorageController(String name)
    {
        try
        {
        port.iMachineRemoveStorageController(obj, name);
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
Sets the bootable flag of the storage controller with the given name.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - A storage controller with given name doesn't exist.</dd>
<dd><code>VBOX_E_OBJECT_IN_USE</code> - Another storage controller is marked as bootable already.</dd>
</dl>

*/
    public void setStorageControllerBootable(String name, Boolean bootable)
    {
        try
        {
        port.iMachineSetStorageControllerBootable(obj, name, bootable);
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
Adds a new USB controller to the machine and returns it as an instance of{@link org.virtualbox_7_0.IUSBController}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_IN_USE</code> - A USB controller with given type exists already.</dd>
<dd><code>E_INVALIDARG</code> - Invalid  controllerType.</dd>
</dl>

*/
    public org.virtualbox_7_0.IUSBController addUSBController(String name, org.virtualbox_7_0.USBControllerType type)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineAddUSBController(obj, name, org.virtualbox_7_0.jaxws.USBControllerType.fromValue(type.name()));
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IUSBController(retVal, getObjMgr(), port) : null;
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
Removes a USB controller from the machine.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - A USB controller with given type doesn't exist.</dd>
</dl>

*/
    public void removeUSBController(String name)
    {
        try
        {
        port.iMachineRemoveUSBController(obj, name);
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
Returns a USB controller with the given type.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - A USB controller with given name doesn't exist.</dd>
</dl>

*/
    public org.virtualbox_7_0.IUSBController getUSBControllerByName(String name)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineGetUSBControllerByName(obj, name);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IUSBController(retVal, getObjMgr(), port) : null;
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
Returns the number of USB controllers of the given type attached to the VM.
*/
    public Long getUSBControllerCountByType(org.virtualbox_7_0.USBControllerType type)
    {
        try
        {
            Long retVal;
        retVal = port.iMachineGetUSBControllerCountByType(obj, org.virtualbox_7_0.jaxws.USBControllerType.fromValue(type.name()));
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
Returns the serial port associated with the given slot.
Slots are numbered sequentially, starting with zero. The total
number of serial ports per machine is defined by the{@link org.virtualbox_7_0.ISystemProperties#getSerialPortCount()}property,
so the maximum slot number is one less than that property's value.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Invalid  slot number.</dd>
</dl>

*/
    public org.virtualbox_7_0.ISerialPort getSerialPort(Long slot)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineGetSerialPort(obj, slot);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.ISerialPort(retVal, getObjMgr(), port) : null;
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
Returns the parallel port associated with the given slot.
Slots are numbered sequentially, starting with zero. The total
number of parallel ports per machine is defined by the{@link org.virtualbox_7_0.ISystemProperties#getParallelPortCount()}property,
so the maximum slot number is one less than that property's value.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Invalid  slot number.</dd>
</dl>

*/
    public org.virtualbox_7_0.IParallelPort getParallelPort(Long slot)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineGetParallelPort(obj, slot);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IParallelPort(retVal, getObjMgr(), port) : null;
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
Returns an array representing the machine-specific extra data keys
which currently have values defined.
@return Array of extra data keys.

*/
    public List<String> getExtraDataKeys()
    {
        try
        {
            List<String> retVal;
        retVal = port.iMachineGetExtraDataKeys(obj);
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
Returns associated machine-specific extra data.

If the requested data  key does not exist, this function will
succeed and return an empty string in the  value argument.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_FILE_ERROR</code> - Settings file not accessible.</dd>
<dd><code>VBOX_E_XML_ERROR</code> - Could not parse the settings file.</dd>
</dl>

@param key Name of the data key to get.

@return Value of the requested data key.

*/
    public String getExtraData(String key)
    {
        try
        {
            String retVal;
        retVal = port.iMachineGetExtraData(obj, key);
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
Sets associated machine-specific extra data.

If you pass  null or an empty string as a key  value, the given
key will be deleted.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_FILE_ERROR</code> - Settings file not accessible.</dd>
<dd><code>VBOX_E_XML_ERROR</code> - Could not parse the settings file.</dd>
<dd><code>E_INVALIDARG</code> - Key contains invalid characters.</dd>
</dl>

@param key Name of the data key to set.

@param value Value to assign to the key.

NOTE: Key must contain printable (non-control) UTF-8 characters only.

NOTE: Before performing the actual data change, this method will ask all
registered event listeners using the{@link org.virtualbox_7_0.IExtraDataCanChangeEvent}notification for a permission. If one of the listeners refuses the
new value, the change will not be performed.

NOTE: On success, the{@link org.virtualbox_7_0.IExtraDataChangedEvent}notification
is called to inform all registered listeners about a successful data
change.

NOTE: This method can be called outside the machine session and therefore
it's a caller's responsibility to handle possible race conditions
when several clients change the same key at the same time.

*/
    public void setExtraData(String key, String value)
    {
        try
        {
        port.iMachineSetExtraData(obj, key, value);
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
Returns the virtual CPU boolean value of the specified property.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Invalid property.</dd>
</dl>

@param property Property type to query.

@return Property value.

*/
    public Boolean getCPUProperty(org.virtualbox_7_0.CPUPropertyType property)
    {
        try
        {
            Boolean retVal;
        retVal = port.iMachineGetCPUProperty(obj, org.virtualbox_7_0.jaxws.CPUPropertyType.fromValue(property.name()));
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
Sets the virtual CPU boolean value of the specified property.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Invalid property.</dd>
</dl>

@param property Property type to query.

@param value Property value.

*/
    public void setCPUProperty(org.virtualbox_7_0.CPUPropertyType property, Boolean value)
    {
        try
        {
        port.iMachineSetCPUProperty(obj, org.virtualbox_7_0.jaxws.CPUPropertyType.fromValue(property.name()), value);
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
Used to enumerate CPUID information override values.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Invalid ordinal number is out of range.</dd>
</dl>

@param ordinal The ordinal number of the leaf to get.

@param idx CPUID leaf index.

@param idxSub CPUID leaf sub-index.

@param valEax CPUID leaf value for register eax.

@param valEbx CPUID leaf value for register ebx.

@param valEcx CPUID leaf value for register ecx.

@param valEdx CPUID leaf value for register edx.

*/
    public void getCPUIDLeafByOrdinal(Long ordinal, Holder<Long> idx, Holder<Long> idxSub, Holder<Long> valEax, Holder<Long> valEbx, Holder<Long> valEcx, Holder<Long> valEdx)
    {
        try
        {
        javax.xml.ws.Holder<Long> tmp_idx = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_idxSub = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_valEax = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_valEbx = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_valEcx = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_valEdx = new javax.xml.ws.Holder<Long>();
        port.iMachineGetCPUIDLeafByOrdinal(obj, ordinal, tmp_idx, tmp_idxSub, tmp_valEax, tmp_valEbx, tmp_valEcx, tmp_valEdx);
        idx.value = tmp_idx.value;
        idxSub.value = tmp_idxSub.value;
        valEax.value = tmp_valEax.value;
        valEbx.value = tmp_valEbx.value;
        valEcx.value = tmp_valEcx.value;
        valEdx.value = tmp_valEdx.value;
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
Returns the virtual CPU cpuid information for the specified leaf.

Currently supported index values for cpuid:
Standard CPUID leaves: 0 - 0x1f
Extended CPUID leaves: 0x80000000 - 0x8000001f
VIA CPUID leaves:      0xc0000000 - 0xc000000f

See the Intel, AMD and VIA programmer's manuals for detailed information
about the CPUID instruction and its leaves.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Invalid index.</dd>
</dl>

@param idx CPUID leaf index.

@param idxSub CPUID leaf sub-index (ECX).  Set to 0xffffffff (or 0) if not applicable.

@param valEax CPUID leaf value for register eax.

@param valEbx CPUID leaf value for register ebx.

@param valEcx CPUID leaf value for register ecx.

@param valEdx CPUID leaf value for register edx.

*/
    public void getCPUIDLeaf(Long idx, Long idxSub, Holder<Long> valEax, Holder<Long> valEbx, Holder<Long> valEcx, Holder<Long> valEdx)
    {
        try
        {
        javax.xml.ws.Holder<Long> tmp_valEax = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_valEbx = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_valEcx = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_valEdx = new javax.xml.ws.Holder<Long>();
        port.iMachineGetCPUIDLeaf(obj, idx, idxSub, tmp_valEax, tmp_valEbx, tmp_valEcx, tmp_valEdx);
        valEax.value = tmp_valEax.value;
        valEbx.value = tmp_valEbx.value;
        valEcx.value = tmp_valEcx.value;
        valEdx.value = tmp_valEdx.value;
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
Sets the virtual CPU cpuid information for the specified leaf. Note that these values
are not passed unmodified. VirtualBox clears features that it doesn't support.

Currently supported index values for cpuid:
Standard CPUID leaves: 0 - 0x1f
Extended CPUID leaves: 0x80000000 - 0x8000001f
VIA CPUID leaves:      0xc0000000 - 0xc000000f

The subleaf index is only applicable to certain leaves (see manuals as this is
subject to change).

See the Intel, AMD and VIA programmer's manuals for detailed information
about the cpuid instruction and its leaves.

Do not use this method unless you know exactly what you're doing. Misuse can lead to
random crashes inside VMs.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Invalid index.</dd>
</dl>

@param idx CPUID leaf index.

@param idxSub CPUID leaf sub-index (ECX).  Set to 0xffffffff (or 0) if not applicable.
The 0xffffffff causes it to remove all other subleaves before adding one
with sub-index 0.

@param valEax CPUID leaf value for register eax.

@param valEbx CPUID leaf value for register ebx.

@param valEcx CPUID leaf value for register ecx.

@param valEdx CPUID leaf value for register edx.

*/
    public void setCPUIDLeaf(Long idx, Long idxSub, Long valEax, Long valEbx, Long valEcx, Long valEdx)
    {
        try
        {
        port.iMachineSetCPUIDLeaf(obj, idx, idxSub, valEax, valEbx, valEcx, valEdx);
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
Removes the virtual CPU cpuid leaf for the specified index
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Invalid index.</dd>
</dl>

@param idx CPUID leaf index.

@param idxSub CPUID leaf sub-index (ECX).  Set to 0xffffffff (or 0) if not applicable.
The 0xffffffff value works like a wildcard.

*/
    public void removeCPUIDLeaf(Long idx, Long idxSub)
    {
        try
        {
        port.iMachineRemoveCPUIDLeaf(obj, idx, idxSub);
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
Removes all the virtual CPU cpuid leaves
*/
    public void removeAllCPUIDLeaves()
    {
        try
        {
        port.iMachineRemoveAllCPUIDLeaves(obj);
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
Returns the value of the specified hardware virtualization boolean property.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Invalid property.</dd>
</dl>

@param property Property type to query.

@return Property value.

*/
    public Boolean getHWVirtExProperty(org.virtualbox_7_0.HWVirtExPropertyType property)
    {
        try
        {
            Boolean retVal;
        retVal = port.iMachineGetHWVirtExProperty(obj, org.virtualbox_7_0.jaxws.HWVirtExPropertyType.fromValue(property.name()));
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
Sets a new value for the specified hardware virtualization boolean property.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Invalid property.</dd>
</dl>

@param property Property type to set.

@param value New property value.

*/
    public void setHWVirtExProperty(org.virtualbox_7_0.HWVirtExPropertyType property, Boolean value)
    {
        try
        {
        port.iMachineSetHWVirtExProperty(obj, org.virtualbox_7_0.jaxws.HWVirtExPropertyType.fromValue(property.name()), value);
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
Currently, it is an error to change this property on any machine.
Later this will allow setting a new path for the settings file, with
automatic relocation of all files (including snapshots and disk images)
which are inside the base directory. This operation is only allowed
when there are no pending unsaved settings.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The operation is not implemented yet.</dd>
</dl>

@param settingsFilePath New settings file path, will be used to determine the new
location for the attached media if it is in the same directory or
below as the original settings file.

@return Progress object to track the operation completion.

NOTE: Setting this property to  null or to an empty string is forbidden.
When setting this property, the specified path must be absolute.
The specified path may not exist, it will be created when necessary.

*/
    public org.virtualbox_7_0.IProgress setSettingsFilePath(String settingsFilePath)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineSetSettingsFilePath(obj, settingsFilePath);
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
Saves any changes to machine settings made since the session
has been opened or a new machine has been created, or since the
last call to{@link #saveSettings()}or{@link #discardSettings()}.
For registered machines, new settings become visible to all
other VirtualBox clients after successful invocation of this
method.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_FILE_ERROR</code> - Settings file not accessible.</dd>
<dd><code>VBOX_E_XML_ERROR</code> - Could not parse the settings file.</dd>
<dd><code>E_ACCESSDENIED</code> - Modification request refused.</dd>
</dl>

NOTE: The method sends{@link org.virtualbox_7_0.IMachineDataChangedEvent}notification event after the configuration has been successfully
saved (only for registered machines).

NOTE: Calling this method is only valid on instances returned
by{@link org.virtualbox_7_0.ISession#getMachine()}and on new machines
created by{@link org.virtualbox_7_0.IVirtualBox#createMachine(String,String,List,String,String,String,String,String)}but not
yet registered, or on unregistered machines after calling{@link org.virtualbox_7_0.IMachine#unregister(org.virtualbox_7_0.CleanupMode)}.

*/
    public void saveSettings()
    {
        try
        {
        port.iMachineSaveSettings(obj);
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
Discards any changes to the machine settings made since the session
has been opened or since the last call to{@link #saveSettings()}or{@link #discardSettings()}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine is not mutable.</dd>
</dl>

NOTE: Calling this method is only valid on instances returned
by{@link org.virtualbox_7_0.ISession#getMachine()}and on new machines
created by{@link org.virtualbox_7_0.IVirtualBox#createMachine(String,String,List,String,String,String,String,String)}or
opened by{@link org.virtualbox_7_0.IVirtualBox#openMachine(String,String)}but not
yet registered, or on unregistered machines after calling{@link org.virtualbox_7_0.IMachine#unregister(org.virtualbox_7_0.CleanupMode)}.

*/
    public void discardSettings()
    {
        try
        {
        port.iMachineDiscardSettings(obj);
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
Unregisters a machine previously registered with{@link org.virtualbox_7_0.IVirtualBox#registerMachine(org.virtualbox_7_0.IMachine)}and optionally do additional
cleanup before the machine is unregistered.

This method does not delete any files. It only changes the machine configuration and
the list of registered machines in the VirtualBox object. To delete the files which
belonged to the machine, including the XML file of the machine itself, call{@link #deleteConfig(List)}, optionally with the array of IMedium objects which was returned
from this method.

How thoroughly this method cleans up the machine configuration before unregistering
the machine depends on the  cleanupMode argument.<ul><li>With "UnregisterOnly", the machine will only be unregistered, but no additional
cleanup will be performed. The call will fail if the machine has any snapshots or
any media attached (see{@link org.virtualbox_7_0.IMediumAttachment}).  It is the responsibility
of the caller to delete all such configuration in this mode.  In this mode, the API
behaves like the former  IVirtualBox::unregisterMachine() API which it replaces.</li><li>With "DetachAllReturnNone", the call will succeed even if the machine is in "Saved"
state or if it has snapshots or media attached. All media attached to the current machine
state or in snapshots will be detached. No medium objects will be returned;
all of the machine's media will remain open.</li><li>With "DetachAllReturnHardDisksOnly", the call will behave like with "DetachAllReturnNone",
except that all the hard disk medium objects which were detached from the machine will
be returned as an array. This allows for quickly passing them to the{@link #deleteConfig(List)}API for closing and deletion.</li><li>With "Full", the call will behave like with "DetachAllReturnHardDisksOnly", except
that all media will be returned in the array, including removable media like DVDs and
floppies. This might be useful if the user wants to inspect in detail which media were
attached to the machine. Be careful when passing the media array to{@link #deleteConfig(List)}in that case because users will typically want to preserve ISO and RAW image files.</li></ul>A typical implementation will use "DetachAllReturnHardDisksOnly" and then pass the
resulting IMedium array to{@link #deleteConfig(List)}. This way, the machine is completely
deleted with all its saved states and hard disk images, but images for removable
drives (such as ISO and RAW files) will remain on disk.

This API does not verify whether the media files returned in the array are still
attached to other machines (i.e. shared between several machines). If such a shared
image is passed to{@link #deleteConfig(List)}however, closing the image will fail there
and the image will be silently skipped.

This API may, however, move media from this machine's media registry to other media
registries (see{@link org.virtualbox_7_0.IMedium}for details on media registries). For machines
created with VirtualBox 4.0 or later, if media from this machine's media registry
are also attached to another machine (shared attachments), each such medium will be
moved to another machine's registry. This is because without this machine's media
registry, the other machine cannot find its media any more and would become inaccessible.

This API implicitly calls{@link #saveSettings()}to save all current machine settings
before unregistering it. It may also silently call{@link #saveSettings()}on other machines
if media are moved to other machines' media registries.

After successful method invocation, the{@link org.virtualbox_7_0.IMachineRegisteredEvent}event
is fired.

The call will fail if the machine is currently locked (see{@link org.virtualbox_7_0.ISession}).
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Machine is currently locked for a session.</dd>
</dl>

@param cleanupMode How to clean up after the machine has been unregistered.

@return List of media detached from the machine, depending on the  cleanupMode parameter.

NOTE: If the given machine is inaccessible (see{@link #getAccessible()}), it
will be unregistered and fully uninitialized right afterwards. As a result,
the returned machine object will be unusable and an attempt to call<b>any</b>method will return the "Object not ready" error.

*/
    public List<org.virtualbox_7_0.IMedium> unregister(org.virtualbox_7_0.CleanupMode cleanupMode)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal;
        retVal = port.iMachineUnregister(obj, org.virtualbox_7_0.jaxws.CleanupMode.fromValue(cleanupMode.name()));
           return Helper.wrap(org.virtualbox_7_0.IMedium.class, getObjMgr(), port, retVal);
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
Deletes the files associated with this machine from disk. If medium objects are passed
in with the  aMedia argument, they are closed and, if closing was successful, their
storage files are deleted as well. For convenience, this array of media files can be
the same as the one returned from a previous{@link #unregister(org.virtualbox_7_0.CleanupMode)}call.

This method must only be called on machines which are either write-locked (i.e. on instances
returned by{@link org.virtualbox_7_0.ISession#getMachine()}) or on unregistered machines (i.e. not yet
registered machines created by{@link org.virtualbox_7_0.IVirtualBox#createMachine(String,String,List,String,String,String,String,String)}or opened by{@link org.virtualbox_7_0.IVirtualBox#openMachine(String,String)}, or after having called{@link #unregister(org.virtualbox_7_0.CleanupMode)}).

The following files will be deleted by this method:<ul><li>If{@link #unregister(org.virtualbox_7_0.CleanupMode)}had been previously called with a  cleanupMode
argument other than "UnregisterOnly", this will delete all saved state files that
the machine had in use; possibly one if the machine was in either the "Saved" or
"AbortedSaved" state and one for each online snapshot that the machine had.</li><li>On each medium object passed in the  aMedia array, this will call{@link org.virtualbox_7_0.IMedium#close()}. If that succeeds, this will attempt to delete the
medium's storage on disk. Since the{@link org.virtualbox_7_0.IMedium#close()}call will fail if the medium is still
in use, e.g. because it is still attached to a second machine; in that case the
storage will not be deleted.</li><li>Finally, the machine's own XML file will be deleted.</li></ul>Since deleting large disk image files can be a time-consuming I/O operation, this
method operates asynchronously and returns an IProgress object to allow the caller
to monitor the progress. There will be one sub-operation for each file that is
being deleted (saved state or medium storage file).
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Machine is registered but not write-locked.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - Could not delete the settings file.</dd>
</dl>

@param media List of media to be closed and whose storage files will be deleted.

@return Progress object to track the operation completion.

NOTE: {@link #getSettingsModified()}will return  true after this
method successfully returns.

*/
    public org.virtualbox_7_0.IProgress deleteConfig(List<org.virtualbox_7_0.IMedium> media)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineDeleteConfig(obj, Helper.unwrap(media));
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
Exports the machine to an OVF appliance. See{@link org.virtualbox_7_0.IAppliance}for the
steps required to export VirtualBox machines to OVF.
@param appliance Appliance to export this machine to.

@param location The target location.

@return VirtualSystemDescription object which is created for this machine.

*/
    public org.virtualbox_7_0.IVirtualSystemDescription exportTo(org.virtualbox_7_0.IAppliance appliance, String location)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineExportTo(obj, ((appliance == null) ? null :appliance.getWrapped()), location);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IVirtualSystemDescription(retVal, getObjMgr(), port) : null;
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
Returns a snapshot of this machine with the given name or UUID.

Returns a snapshot of this machine with the given UUID.
A  null argument can be used to obtain the first snapshot
taken on this machine. To traverse the whole tree of snapshots
starting from the root, inspect the root snapshot's{@link org.virtualbox_7_0.ISnapshot#getChildren()}attribute and recurse over those children.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - Virtual machine has no snapshots or snapshot not found.</dd>
</dl>

@param nameOrId What to search for. Name or UUID of the snapshot to find

@return Snapshot object with the given name.

*/
    public org.virtualbox_7_0.ISnapshot findSnapshot(String nameOrId)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineFindSnapshot(obj, nameOrId);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.ISnapshot(retVal, getObjMgr(), port) : null;
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
Creates a new permanent shared folder by associating the given logical
name with the given host path, adds it to the collection of shared
folders and starts sharing it. Refer to the description of{@link org.virtualbox_7_0.ISharedFolder}to read more about logical names.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_IN_USE</code> - Shared folder already exists.</dd>
<dd><code>VBOX_E_FILE_ERROR</code> - Shared folder  hostPath not accessible.</dd>
</dl>

@param name Unique logical name of the shared folder.

@param hostPath Full path to the shared folder in the host file system.

@param writable Whether the share is writable or read-only.

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
        port.iMachineCreateSharedFolder(obj, name, hostPath, writable, automount, autoMountPoint);
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
Removes the permanent shared folder with the given name previously
created by{@link #createSharedFolder(String,String,Boolean,Boolean,String)}from the collection of
shared folders and stops sharing it.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine is not mutable.</dd>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - Shared folder  name does not exist.</dd>
</dl>

@param name Logical name of the shared folder to remove.

*/
    public void removeSharedFolder(String name)
    {
        try
        {
        port.iMachineRemoveSharedFolder(obj, name);
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
Returns  true if the VM console process can activate the
console window and bring it to foreground on the desktop of
the host PC.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Machine session is not open.</dd>
</dl>

@return true if the console window can be shown and  false otherwise.

NOTE: This method will fail if a session for this machine is not
currently open.

*/
    public Boolean canShowConsoleWindow()
    {
        try
        {
            Boolean retVal;
        retVal = port.iMachineCanShowConsoleWindow(obj);
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
Activates the console window and brings it to foreground on
the desktop of the host PC. Many modern window managers on
many platforms implement some sort of focus stealing
prevention logic, so that it may be impossible to activate
a window without the help of the currently active
application. In this case, this method will return a non-zero
identifier that represents the top-level window of the VM
console process. The caller, if it represents a currently
active process, is responsible to use this identifier (in a
platform-dependent manner) to perform actual window
activation.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Machine session is not open.</dd>
</dl>

@return Platform-dependent identifier of the top-level VM console
window, or zero if this method has performed all actions
necessary to implement the<i>show window</i>semantics for
the given platform and/or VirtualBox front-end.

NOTE: This method will fail if a session for this machine is not
currently open.

*/
    public Long showConsoleWindow()
    {
        try
        {
            Long retVal;
        retVal = port.iMachineShowConsoleWindow(obj);
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
Reads an entry from the machine's guest property store.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Machine session is not open.</dd>
</dl>

@param name The name of the property to read.

@param value The value of the property. If the property does not exist then this
will be empty.

@param timestamp The time at which the property was last modified, as seen by the
server process.

@param flags Additional property parameters, passed as a comma-separated list of
"name=value" type entries.

*/
    public void getGuestProperty(String name, Holder<String> value, Holder<Long> timestamp, Holder<String> flags)
    {
        try
        {
        javax.xml.ws.Holder<String> tmp_value = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<Long> tmp_timestamp = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<String> tmp_flags = new javax.xml.ws.Holder<String>();
        port.iMachineGetGuestProperty(obj, name, tmp_value, tmp_timestamp, tmp_flags);
        value.value = tmp_value.value;
        timestamp.value = tmp_timestamp.value;
        flags.value = tmp_flags.value;
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
Reads a value from the machine's guest property store.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Machine session is not open.</dd>
</dl>

@param property The name of the property to read.

@return The value of the property. If the property does not exist then this
will be empty.

*/
    public String getGuestPropertyValue(String property)
    {
        try
        {
            String retVal;
        retVal = port.iMachineGetGuestPropertyValue(obj, property);
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
Reads a property timestamp from the machine's guest property store.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Machine session is not open.</dd>
</dl>

@param property The name of the property to read.

@return The timestamp. If the property does not exist then this will be
empty.

*/
    public Long getGuestPropertyTimestamp(String property)
    {
        try
        {
            Long retVal;
        retVal = port.iMachineGetGuestPropertyTimestamp(obj, property);
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
Sets, changes or deletes an entry in the machine's guest property
store.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_ACCESSDENIED</code> - Property cannot be changed.</dd>
<dd><code>E_INVALIDARG</code> - Invalid  flags.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine is not mutable or session not open.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Cannot set transient property when machine not running.</dd>
</dl>

@param property The name of the property to set, change or delete.

@param value The new value of the property to set, change or delete. If the
property does not yet exist and value is non-empty, it will be
created. If the value is  null or empty, the property will be
deleted if it exists.

@param flags Additional property parameters, passed as a comma-separated list of
"name=value" type entries.

*/
    public void setGuestProperty(String property, String value, String flags)
    {
        try
        {
        port.iMachineSetGuestProperty(obj, property, value, flags);
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
Sets or changes a value in the machine's guest property
store. The flags field will be left unchanged or created empty for a
new property.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_ACCESSDENIED</code> - Property cannot be changed.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine is not mutable or session not open.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Cannot set transient property when machine not running.</dd>
</dl>

@param property The name of the property to set or change.

@param value The new value of the property to set or change. If the
property does not yet exist and value is non-empty, it will be
created.

*/
    public void setGuestPropertyValue(String property, String value)
    {
        try
        {
        port.iMachineSetGuestPropertyValue(obj, property, value);
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
Deletes an entry from the machine's guest property store.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Machine session is not open.</dd>
</dl>

@param name The name of the property to delete.

*/
    public void deleteGuestProperty(String name)
    {
        try
        {
        port.iMachineDeleteGuestProperty(obj, name);
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
Return a list of the guest properties matching a set of patterns along
with their values, timestamps and flags.
@param patterns The patterns to match the properties against, separated by '|'
characters. If this is empty or  null, all properties will match.

@param names The names of the properties returned.

@param values The values of the properties returned. The array entries match the
corresponding entries in the  name array.

@param timestamps The timestamps of the properties returned. The array entries match
the corresponding entries in the  name array.

@param flags The flags of the properties returned. The array entries match the
corresponding entries in the  name array.

*/
    public void enumerateGuestProperties(String patterns, Holder<List<String>> names, Holder<List<String>> values, Holder<List<Long>> timestamps, Holder<List<String>> flags)
    {
        try
        {
        javax.xml.ws.Holder<List<String>> tmp_names = new javax.xml.ws.Holder<List<String>>();
        javax.xml.ws.Holder<List<String>> tmp_values = new javax.xml.ws.Holder<List<String>>();
        javax.xml.ws.Holder<List<Long>> tmp_timestamps = new javax.xml.ws.Holder<List<Long>>();
        javax.xml.ws.Holder<List<String>> tmp_flags = new javax.xml.ws.Holder<List<String>>();
        port.iMachineEnumerateGuestProperties(obj, patterns, tmp_names, tmp_values, tmp_timestamps, tmp_flags);
        names.value = tmp_names.value;
        values.value = tmp_values.value;
        timestamps.value = tmp_timestamps.value;
        flags.value = tmp_flags.value;
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
Returns the guest dimensions from the saved state.
@param screenId Saved guest screen to query info from.

@param originX The X position of the guest monitor top left corner.

@param originY The Y position of the guest monitor top left corner.

@param width Guest width at the time of the saved state was taken.

@param height Guest height at the time of the saved state was taken.

@param enabled Whether the monitor is enabled in the guest.

*/
    public void querySavedGuestScreenInfo(Long screenId, Holder<Long> originX, Holder<Long> originY, Holder<Long> width, Holder<Long> height, Holder<Boolean> enabled)
    {
        try
        {
        javax.xml.ws.Holder<Long> tmp_originX = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_originY = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_width = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_height = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Boolean> tmp_enabled = new javax.xml.ws.Holder<Boolean>();
        port.iMachineQuerySavedGuestScreenInfo(obj, screenId, tmp_originX, tmp_originY, tmp_width, tmp_height, tmp_enabled);
        originX.value = tmp_originX.value;
        originY.value = tmp_originY.value;
        width.value = tmp_width.value;
        height.value = tmp_height.value;
        enabled.value = tmp_enabled.value;
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
Thumbnail is retrieved to an array of bytes in the requested format.
@param screenId Saved guest screen to read from.

@param bitmapFormat The requested format.

@param width Bitmap width.

@param height Bitmap height.

@return Array with resulting bitmap data.

*/
    public byte[] readSavedThumbnailToArray(Long screenId, org.virtualbox_7_0.BitmapFormat bitmapFormat, Holder<Long> width, Holder<Long> height)
    {
        try
        {
        javax.xml.ws.Holder<Long> tmp_width = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_height = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder</*base64*/String> retVal = new javax.xml.ws.Holder</*base64*/String>();
        port.iMachineReadSavedThumbnailToArray(obj, screenId, org.virtualbox_7_0.jaxws.BitmapFormat.fromValue(bitmapFormat.name()), tmp_width, tmp_height, retVal);
        width.value = tmp_width.value;
        height.value = tmp_height.value;
           return Helper.decodeBase64(retVal.value);
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
Returns available formats and size of the screenshot from saved state.
@param screenId Saved guest screen to query info from.

@param width Image width.

@param height Image height.

@return Formats supported by readSavedScreenshotToArray.

*/
    public List<org.virtualbox_7_0.BitmapFormat> querySavedScreenshotInfo(Long screenId, Holder<Long> width, Holder<Long> height)
    {
        try
        {
        javax.xml.ws.Holder<Long> tmp_width = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_height = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.BitmapFormat>> retVal = new javax.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.BitmapFormat>>();
        port.iMachineQuerySavedScreenshotInfo(obj, screenId, tmp_width, tmp_height, retVal);
        width.value = tmp_width.value;
        height.value = tmp_height.value;
           return Helper.convertEnums(org.virtualbox_7_0.jaxws.BitmapFormat.class, org.virtualbox_7_0.BitmapFormat.class, retVal.value);
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
Screenshot in requested format is retrieved to an array of bytes.
@param screenId Saved guest screen to read from.

@param bitmapFormat The requested format.

@param width Image width.

@param height Image height.

@return Array with resulting image data.

*/
    public byte[] readSavedScreenshotToArray(Long screenId, org.virtualbox_7_0.BitmapFormat bitmapFormat, Holder<Long> width, Holder<Long> height)
    {
        try
        {
        javax.xml.ws.Holder<Long> tmp_width = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_height = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder</*base64*/String> retVal = new javax.xml.ws.Holder</*base64*/String>();
        port.iMachineReadSavedScreenshotToArray(obj, screenId, org.virtualbox_7_0.jaxws.BitmapFormat.fromValue(bitmapFormat.name()), tmp_width, tmp_height, retVal);
        width.value = tmp_width.value;
        height.value = tmp_height.value;
           return Helper.decodeBase64(retVal.value);
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
Plugs a CPU into the machine.
@param cpu The CPU id to insert.

*/
    public void hotPlugCPU(Long cpu)
    {
        try
        {
        port.iMachineHotPlugCPU(obj, cpu);
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
Removes a CPU from the machine.
@param cpu The CPU id to remove.

*/
    public void hotUnplugCPU(Long cpu)
    {
        try
        {
        port.iMachineHotUnplugCPU(obj, cpu);
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
Returns the current status of the given CPU.
@param cpu The CPU id to check for.

@return Status of the CPU.

*/
    public Boolean getCPUStatus(Long cpu)
    {
        try
        {
            Boolean retVal;
        retVal = port.iMachineGetCPUStatus(obj, cpu);
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
Returns the effective paravirtualization provider for this VM.
@return The effective paravirtualization provider for this VM.

*/
    public org.virtualbox_7_0.ParavirtProvider getEffectiveParavirtProvider()
    {
        try
        {
            org.virtualbox_7_0.jaxws.ParavirtProvider retVal;
        retVal = port.iMachineGetEffectiveParavirtProvider(obj);
           return org.virtualbox_7_0.ParavirtProvider.fromValue(retVal.value());
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
Queries for the VM log file name of an given index. Returns an empty
string if a log file with that index doesn't exists.
@param idx Which log file name to query. 0=current log file.

@return On return the full path to the log file or an empty string on error.

*/
    public String queryLogFilename(Long idx)
    {
        try
        {
            String retVal;
        retVal = port.iMachineQueryLogFilename(obj, idx);
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
Reads the VM log file. The chunk size is limited, so even if you
ask for a big piece there might be less data returned.
@param idx Which log file to read. 0=current log file.

@param offset Offset in the log file.

@param size Chunk size to read in the log file.

@return Data read from the log file. A data size of 0 means end of file
if the requested chunk size was not 0. This is the unprocessed
file data, i.e. the line ending style depends on the platform of
the system the server is running on.

*/
    public byte[] readLog(Long idx, Long offset, Long size)
    {
        try
        {
            /*base64*/String retVal;
        retVal = port.iMachineReadLog(obj, idx, offset, size);
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
Creates a clone of this machine, either as a full clone (which means
creating independent copies of the hard disk media, save states and so
on), or as a linked clone (which uses its own differencing media,
sharing the parent media with the source machine).

The target machine object must have been created previously with{@link org.virtualbox_7_0.IVirtualBox#createMachine(String,String,List,String,String,String,String,String)}, and all the settings will be
transferred except the VM name and the hardware UUID. You can set the
VM name and the new hardware UUID when creating the target machine. The
network MAC addresses are newly created for all enabled network
adapters. You can change that behaviour with the options parameter.
The operation is performed asynchronously, so the machine object will
be not be usable until the  progress object signals completion.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - target is  null.</dd>
</dl>

@param target Target machine object.

@param mode Which states should be cloned.

@param options Options for the cloning operation.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress cloneTo(org.virtualbox_7_0.IMachine target, org.virtualbox_7_0.CloneMode mode, List<org.virtualbox_7_0.CloneOptions> options)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineCloneTo(obj, ((target == null) ? null :target.getWrapped()), org.virtualbox_7_0.jaxws.CloneMode.fromValue(mode.name()), Helper.convertEnums(org.virtualbox_7_0.CloneOptions.class, org.virtualbox_7_0.jaxws.CloneOptions.class, options));
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
Move machine on to new place/folder
@param folder Target folder where machine is moved. May be the same folder
where the VM already is located or the empty string, in which
case the machine is kept in this location and the disk images
and other files which are stored elsewhere are moved.

@param type Type of moving.
Possible values:
basic - Only the files which belong solely to this machine
are moved from the original machine's folder to
a new folder.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress moveTo(String folder, String type)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineMoveTo(obj, folder, type);
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
Saves the current execution state of a running virtual machine
and stops its execution.

After this operation completes, the machine will go to the
Saved state. The next time it is powered up this state will
be restored and the machine will continue its execution from
the place where it was saved.

This operation differs from taking a snapshot to the effect
that it doesn't create new differencing media. Also, once
the machine is powered up from the state saved using this method,
the saved state is deleted, so it will be impossible to return
to this state later.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine state neither Running nor Paused.</dd>
<dd><code>VBOX_E_FILE_ERROR</code> - Failed to create directory for saved state file.</dd>
</dl>

@return Progress object to track the operation completion.

NOTE: On success, this method implicitly calls{@link #saveSettings()}to save all current machine
settings (including runtime changes to the DVD medium, etc.).
Together with the impossibility to change any VM settings when it is
in the Saved state, this guarantees adequate hardware
configuration of the machine when it is restored from the saved
state file.

NOTE: The machine must be in the Running or Paused state, otherwise
the operation will fail.

@see #takeSnapshot(String,String,Boolean,Holder)

*/
    public org.virtualbox_7_0.IProgress saveState()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineSaveState(obj);
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
Associates the given saved state file to the virtual machine.

On success, the machine will go to the Saved state. The next time it is
powered up it will be restored from the adopted saved state and
continue execution from the place where the saved state file was
created.

The specified saved state file path may be absolute or relative to the
folder the VM normally saves the state to (usually,{@link #getSnapshotFolder()}).
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine state neither PoweredOff nor Aborted.</dd>
</dl>

@param savedStateFile Path to the saved state file to adopt.

NOTE: It's a caller's responsibility to make sure the given saved state
file is compatible with the settings of this virtual machine that
represent its virtual hardware (memory size, storage disk configuration
etc.). If there is a mismatch, the behavior of the virtual machine
is undefined.

*/
    public void adoptSavedState(String savedStateFile)
    {
        try
        {
        port.iMachineAdoptSavedState(obj, savedStateFile);
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
Forcibly resets the machine to "Powered Off" state if it is
currently in the "Saved" state previously created by{@link #saveState()})
or in the "AbortedSaved" state.  The next time the machine is powered up
a clean boot will occur.If  fRemoveFile is  true, the file in the machine directory
into which the machine state was saved is also deleted. If
this is  false, then the state can be recovered and later
re-inserted into a machine using{@link #adoptSavedState(String)}.
The location of the file can be found in the{@link #getStateFilePath()}attribute.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine not in either the Saved or AbortedSaved state.</dd>
</dl>

@param fRemoveFile Whether to also remove the saved state file.

NOTE: This operation is equivalent to resetting or powering off
the machine without doing a proper shutdown of the guest
operating system; as with resetting a running phyiscal
computer, it can can lead to data loss.

*/
    public void discardSavedState(Boolean fRemoveFile)
    {
        try
        {
        port.iMachineDiscardSavedState(obj, fRemoveFile);
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
Saves the current execution state
and all settings of the machine and creates differencing images
for all normal (non-independent) media.
See{@link org.virtualbox_7_0.ISnapshot}for an introduction to snapshots.

This method can be called for a PoweredOff, Saved (see{@link #saveState()}), AbortedSaved, Running or
Paused virtual machine. When the machine is PoweredOff, an
offline snapshot is created. When the machine is Running a live
snapshot is created, and an online snapshot is created when Paused.

The taken snapshot is always based on the{@link #getCurrentSnapshot()}of the associated virtual machine and becomes a new current snapshot.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine currently changing state.</dd>
</dl>

@param name Short name for the snapshot.

@param description Optional description of the snapshot.

@param pause Whether the VM should be paused while taking the snapshot. Only
relevant when the VM is running, and distinguishes between online
( true) and live ( false) snapshots. When the VM is not running
the result is always an offline snapshot.

@param id UUID of the snapshot which will be created. Useful for follow-up
operations after the snapshot has been created.

@return Progress object to track the operation completion.

NOTE: This method implicitly calls{@link #saveSettings()}to
save all current machine settings before taking an offline snapshot.

*/
    public org.virtualbox_7_0.IProgress takeSnapshot(String name, String description, Boolean pause, Holder<String> id)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        javax.xml.ws.Holder<String> tmp_id = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> retVal = new javax.xml.ws.Holder<String>();
        port.iMachineTakeSnapshot(obj, name, description, pause, tmp_id, retVal);
        id.value = tmp_id.value;
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
Starts deleting the specified snapshot asynchronously.
See{@link org.virtualbox_7_0.ISnapshot}for an introduction to snapshots.

The execution state and settings of the associated machine stored in
the snapshot will be deleted. The contents of all differencing media of
this snapshot will be merged with the contents of their dependent child
media to keep the medium chain valid (in other words, all changes
represented by media being deleted will be propagated to their child
medium). After that, this snapshot's differencing medium will be
deleted. The parent of this snapshot will become a new parent for all
its child snapshots.

If the deleted snapshot is the current one, its parent snapshot will
become a new current snapshot. The current machine state is not directly
affected in this case, except that currently attached differencing
media based on media of the deleted snapshot will be also merged as
described above.

If the deleted snapshot is the first or current snapshot, then the
respective IMachine attributes will be adjusted. Deleting the current
snapshot will also implicitly call{@link #saveSettings()}to make all current machine settings permanent.

Deleting a snapshot has the following preconditions:<ul><li>Child media of all normal media of the deleted snapshot
must be accessible (see{@link org.virtualbox_7_0.IMedium#getState()}) for this
operation to succeed. If only one running VM refers to all images
which participates in merging the operation can be performed while
the VM is running. Otherwise all virtual machines whose media are
directly or indirectly based on the media of deleted snapshot must
be powered off. In any case, online snapshot deleting usually is
slower than the same operation without any running VM.</li><li>You cannot delete the snapshot if a medium attached to it has
more than one child medium (differencing images) because otherwise
merging would be impossible. This might be the case if there is
more than one child snapshot or differencing images were created
for other reason (e.g. implicitly because of multiple machine
attachments).</li></ul>The virtual machine's{@link #getState()}is
changed to "DeletingSnapshot", "DeletingSnapshotOnline" or
"DeletingSnapshotPaused" while this operation is in progress.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - The running virtual machine prevents deleting this snapshot. This
happens only in very specific situations, usually snapshots can be
deleted without trouble while a VM is running. The error message
text explains the reason for the failure.</dd>
</dl>

@param id UUID of the snapshot to delete.

@return Progress object to track the operation completion.

NOTE: Merging medium contents can be very time and disk space
consuming, if these media are big in size and have many
children. However, if the snapshot being deleted is the last
(head) snapshot on the branch, the operation will be rather
quick.

*/
    public org.virtualbox_7_0.IProgress deleteSnapshot(String id)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineDeleteSnapshot(obj, id);
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
Starts deleting the specified snapshot and all its children
asynchronously. See{@link org.virtualbox_7_0.ISnapshot}for an introduction to
snapshots. The conditions and many details are the same as with{@link #deleteSnapshot(String)}.

This operation is very fast if the snapshot subtree does not include
the current state. It is still significantly faster than deleting the
snapshots one by one if the current state is in the subtree and there
are more than one snapshots from current state to the snapshot which
marks the subtree, since it eliminates the incremental image merging.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - The running virtual machine prevents deleting this snapshot. This
happens only in very specific situations, usually snapshots can be
deleted without trouble while a VM is running. The error message
text explains the reason for the failure.</dd>
<dd><code>E_NOTIMPL</code> - The method is not implemented yet.</dd>
</dl>

@param id UUID of the snapshot to delete, including all its children.

@return Progress object to track the operation completion.

NOTE: This API method is right now not implemented!

*/
    public org.virtualbox_7_0.IProgress deleteSnapshotAndAllChildren(String id)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineDeleteSnapshotAndAllChildren(obj, id);
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
Starts deleting the specified snapshot range. This is limited to
linear snapshot lists, which means there may not be any other child
snapshots other than the direct sequence between the start and end
snapshot. If the start and end snapshot point to the same snapshot this
method is completely equivalent to{@link #deleteSnapshot(String)}. See{@link org.virtualbox_7_0.ISnapshot}for an introduction to snapshots. The
conditions and many details are the same as with{@link #deleteSnapshot(String)}.

This operation is generally faster than deleting snapshots one by one
and often also needs less extra disk space before freeing up disk space
by deleting the removed disk images corresponding to the snapshot.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - The running virtual machine prevents deleting this snapshot. This
happens only in very specific situations, usually snapshots can be
deleted without trouble while a VM is running. The error message
text explains the reason for the failure.</dd>
<dd><code>E_NOTIMPL</code> - The method is not implemented yet.</dd>
</dl>

@param startId UUID of the first snapshot to delete.

@param endId UUID of the last snapshot to delete.

@return Progress object to track the operation completion.

NOTE: This API method is right now not implemented!

*/
    public org.virtualbox_7_0.IProgress deleteSnapshotRange(String startId, String endId)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineDeleteSnapshotRange(obj, startId, endId);
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
Starts resetting the machine's current state to the state contained
in the given snapshot, asynchronously. All current settings of the
machine will be reset and changes stored in differencing media
will be lost.
See{@link org.virtualbox_7_0.ISnapshot}for an introduction to snapshots.

After this operation is successfully completed, new empty differencing
media are created for all normal media of the machine.

If the given snapshot is an online snapshot, the machine will go to
the{@link org.virtualbox_7_0.MachineState#Saved}state, so that the
next time it is powered on, the execution state will be restored
from the state of the snapshot.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine is running.</dd>
</dl>

@param snapshot The snapshot to restore the VM state from.

@return Progress object to track the operation completion.

NOTE: The machine must not be running, otherwise the operation will fail.

NOTE: If the machine is in the{@link org.virtualbox_7_0.MachineState#Saved}state prior to this operation, the saved state file will be implicitly
deleted (as if{@link org.virtualbox_7_0.IMachine#discardSavedState(Boolean)}were
called).

*/
    public org.virtualbox_7_0.IProgress restoreSnapshot(org.virtualbox_7_0.ISnapshot snapshot)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineRestoreSnapshot(obj, ((snapshot == null) ? null :snapshot.getWrapped()));
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
Applies the defaults for the configured guest OS type. This is
primarily for getting sane settings straight after creating a
new VM, but it can also be applied later.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_FAIL</code> - General error.</dd>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - The machine is in invalid state.</dd>
<dd><code>VBOX_E_OBJECT_IN_USE</code> - Some of the applied objects already exist. The method has been
called to already configured machine.</dd>
</dl>

@param flags Additional flags, to be defined later.

NOTE: This is primarily a shortcut, centralizing the tedious job of
getting the recommended settings and translating them into
settings updates. The settings are made at the end of the call,
but not saved.

*/
    public void applyDefaults(String flags)
    {
        try
        {
        port.iMachineApplyDefaults(obj, flags);
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
Starts encryption of this VM. This means that the stored data of the VM is encrypted.

Please note that the results can be either returned straight away,
or later as the result of the background operation via the object
returned via the  progress parameter.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Encryption is not supported for various reasons e.g. unsupported cipher.</dd>
</dl>

@param currentPassword The current password the VM is protected with. Use an empty string to indicate
that the VM isn't encrypted.

@param cipher The cipher to use for encryption. An empty string indicates no encryption for the
result.

@param newPassword The new password the VM should be protected with. An empty password and password ID
will result in the VM being encrypted with the current password.

@param newPasswordId The ID of the new password when unlocking the VM.

@param force Force reencryption of the data if just password is changed.
Otherwise, if data already encrypted and cipher doesn't changed
only the password is changed.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress changeEncryption(String currentPassword, String cipher, String newPassword, String newPasswordId, Boolean force)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMachineChangeEncryption(obj, currentPassword, cipher, newPassword, newPasswordId, force);
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
Returns the encryption settings for this VM.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Encryption is not configured for this VM.</dd>
</dl>

@param cipher The cipher used for encryption.

@param passwordId The ID of the password when unlocking the VM.

*/
    public void getEncryptionSettings(Holder<String> cipher, Holder<String> passwordId)
    {
        try
        {
        javax.xml.ws.Holder<String> tmp_cipher = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> tmp_passwordId = new javax.xml.ws.Holder<String>();
        port.iMachineGetEncryptionSettings(obj, tmp_cipher, tmp_passwordId);
        cipher.value = tmp_cipher.value;
        passwordId.value = tmp_passwordId.value;
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
Checks whether the supplied password is correct for the VM.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Encryption is not configured for this VM.</dd>
<dd><code>VBOX_E_PASSWORD_INCORRECT</code> - The given password is incorrect.</dd>
</dl>

@param password The password to check.

*/
    public void checkEncryptionPassword(String password)
    {
        try
        {
        port.iMachineCheckEncryptionPassword(obj, password);
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
Adds a password used for encryption. Updates the accesibility
state if password used the VM encryption.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_PASSWORD_INCORRECT</code> - The password provided wasn't correct for the VM using the provided
ID.</dd>
</dl>

@param id The identifier used for the password. Must match the identifier
used when the encrypted VM was created.

@param password The password.

*/
    public void addEncryptionPassword(String id, String password)
    {
        try
        {
        port.iMachineAddEncryptionPassword(obj, id, password);
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
Adds passwords used for encryption. Updates the accesibility
state if the list contains password used the VM encryption.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_PASSWORD_INCORRECT</code> - The password provided wasn't correct for the VM using the provided
ID.</dd>
<dd><code>E_INVALIDARG</code> - Id and passwords arrays have different size.</dd>
</dl>

@param ids List of identifiers for the passwords. Must match the identifier
used when the encrypted VM was created.

@param passwords List of passwords.

*/
    public void addEncryptionPasswords(List<String> ids, List<String> passwords)
    {
        try
        {
        port.iMachineAddEncryptionPasswords(obj, ids, passwords);
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
Removes a password used for the VM encryption/decryption.
The password can be removed only if the VM is powered off.
Removing the password causes the VM goes to the inaccessible
state and the password must be provided again.
@param id The identifier used for the password. Must match the identifier
used when the encrypted VM was created.

NOTE: If machine becomes inaccessible all passwords are purged.
One has to add required passwords again using either{@link org.virtualbox_7_0.IMachine#addEncryptionPassword(String,String)}or{@link org.virtualbox_7_0.IMachine#addEncryptionPasswords(List,List)}methods.

*/
    public void removeEncryptionPassword(String id)
    {
        try
        {
        port.iMachineRemoveEncryptionPassword(obj, id);
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
Clears all provided VM passwords.
The passwords can be removed only if the VM is powered off.
Removing the passwords causes the VM goes to the inaccessible
state and the password must be provided again.
*/
    public void clearAllEncryptionPasswords()
    {
        try
        {
        port.iMachineClearAllEncryptionPasswords(obj);
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

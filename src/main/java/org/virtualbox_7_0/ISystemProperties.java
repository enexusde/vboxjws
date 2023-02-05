
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
 * ISystemProperties.java
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
The ISystemProperties interface represents global properties of the given
VirtualBox installation.

These properties define limits and default values for various attributes
and parameters. Most of the properties are read-only, but some can be
changed by a user.

Interface ID: <code>{AAC6C7CB-A371-4C58-AB51-0616896B2F2C}</code>
*/
public class ISystemProperties extends IUnknown
{

    public ISystemProperties(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Minimum guest system memory in Megabytes.
@return Long
*/
    public Long getMinGuestRAM()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetMinGuestRAM(obj);
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
Maximum guest system memory in Megabytes.
@return Long
*/
    public Long getMaxGuestRAM()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetMaxGuestRAM(obj);
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
Minimum guest video memory in Megabytes.
@return Long
*/
    public Long getMinGuestVRAM()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetMinGuestVRAM(obj);
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
Maximum guest video memory in Megabytes.
@return Long
*/
    public Long getMaxGuestVRAM()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetMaxGuestVRAM(obj);
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
Minimum CPU count.
@return Long
*/
    public Long getMinGuestCPUCount()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetMinGuestCPUCount(obj);
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
Maximum CPU count.
@return Long
*/
    public Long getMaxGuestCPUCount()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetMaxGuestCPUCount(obj);
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
Maximum of monitors which could be connected.
@return Long
*/
    public Long getMaxGuestMonitors()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetMaxGuestMonitors(obj);
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
Maximum size of a virtual disk image in bytes. Informational value,
does not reflect the limits of any virtual disk image format.
@return Long
*/
    public Long getInfoVDSize()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetInfoVDSize(obj);
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
Maximum number of serial ports associated with every{@link org.virtualbox_7_0.IMachine}instance.
@return Long
*/
    public Long getSerialPortCount()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetSerialPortCount(obj);
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
Maximum number of parallel ports associated with every{@link org.virtualbox_7_0.IMachine}instance.
@return Long
*/
    public Long getParallelPortCount()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetParallelPortCount(obj);
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
Maximum device position in the boot order. This value corresponds
to the total number of devices a machine can boot from, to make it
possible to include all possible devices to the boot list.
@return Long

@see org.virtualbox_7_0.IMachine#setBootOrder(Long,org.virtualbox_7_0.DeviceType)
*/
    public Long getMaxBootPosition()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetMaxBootPosition(obj);
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
Indicates whether VirtualBox was built with raw-mode support.

When this reads as False, the{@link org.virtualbox_7_0.HWVirtExPropertyType#Enabled}setting will be ignored and assumed to be True.
@return Boolean
*/
    public Boolean getRawModeSupported()
    {
        try
        {
            Boolean retVal = port.iSystemPropertiesGetRawModeSupported(obj);
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
Exclusive use of hardware virtualization by VirtualBox. When enabled,
VirtualBox assumes it can obtain full and exclusive access to the VT-x
or AMD-V feature of the host. To share hardware virtualization with
other hypervisors, this property must be disabled.
NOTE: This is ignored on OS X, the kernel mediates hardware
access there.

@return Boolean
*/
    public Boolean getExclusiveHwVirt()
    {
        try
        {
            Boolean retVal = port.iSystemPropertiesGetExclusiveHwVirt(obj);
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
Exclusive use of hardware virtualization by VirtualBox. When enabled,
VirtualBox assumes it can obtain full and exclusive access to the VT-x
or AMD-V feature of the host. To share hardware virtualization with
other hypervisors, this property must be disabled.
NOTE: This is ignored on OS X, the kernel mediates hardware
access there.

@param value Boolean

*/
    public void setExclusiveHwVirt(Boolean value)
    {
        try
        {
        port.iSystemPropertiesSetExclusiveHwVirt(obj, value);
        }
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
Full path to the default directory used to create new or open
existing machines when a machine settings file name contains no
path.

Starting with VirtualBox 4.0, by default, this attribute contains
the full path of folder named "VirtualBox VMs" in the user's
home directory, which depends on the host platform.

When setting this attribute, a full path must be specified.
Setting this property to  null or an empty string or the
special value "Machines" (for compatibility reasons) will restore
that default value.

If the folder specified herein does not exist, it will be created
automatically as needed.
@return String

@see org.virtualbox_7_0.IVirtualBox#createMachine(String,String,List,String,String,String,String,String)
@see org.virtualbox_7_0.IVirtualBox#openMachine(String,String)
*/
    public String getDefaultMachineFolder()
    {
        try
        {
            String retVal = port.iSystemPropertiesGetDefaultMachineFolder(obj);
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
Full path to the default directory used to create new or open
existing machines when a machine settings file name contains no
path.

Starting with VirtualBox 4.0, by default, this attribute contains
the full path of folder named "VirtualBox VMs" in the user's
home directory, which depends on the host platform.

When setting this attribute, a full path must be specified.
Setting this property to  null or an empty string or the
special value "Machines" (for compatibility reasons) will restore
that default value.

If the folder specified herein does not exist, it will be created
automatically as needed.
@param value String

@see org.virtualbox_7_0.IVirtualBox#createMachine(String,String,List,String,String,String,String,String)
@see org.virtualbox_7_0.IVirtualBox#openMachine(String,String)

*/
    public void setDefaultMachineFolder(String value)
    {
        try
        {
        port.iSystemPropertiesSetDefaultMachineFolder(obj, value);
        }
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
Specifies the logging level in current use by VirtualBox.
@return String
*/
    public String getLoggingLevel()
    {
        try
        {
            String retVal = port.iSystemPropertiesGetLoggingLevel(obj);
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
Specifies the logging level in current use by VirtualBox.
@param value String

*/
    public void setLoggingLevel(String value)
    {
        try
        {
        port.iSystemPropertiesSetLoggingLevel(obj, value);
        }
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
List of all medium storage formats supported by this VirtualBox
installation.

Keep in mind that the medium format identifier
({@link org.virtualbox_7_0.IMediumFormat#getId()}) used in other API calls like{@link org.virtualbox_7_0.IVirtualBox#createMedium(String,String,org.virtualbox_7_0.AccessMode,org.virtualbox_7_0.DeviceType)}to refer to a particular
medium format is a case-insensitive string. This means that, for
example, all of the following strings:<pre>"VDI"
"vdi"
"VdI"</pre>refer to the same medium format.

Note that the virtual medium framework is backend-based, therefore
the list of supported formats depends on what backends are currently
installed.
@return List&lt;org.virtualbox_7_0.IMediumFormat&gt;

@see org.virtualbox_7_0.IMediumFormat
*/
    public List<org.virtualbox_7_0.IMediumFormat> getMediumFormats()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iSystemPropertiesGetMediumFormats(obj);
            return Helper.wrap(org.virtualbox_7_0.IMediumFormat.class, getObjMgr(), port, retVal);
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
Identifier of the default medium format used by VirtualBox.

The medium format set by this attribute is used by VirtualBox
when the medium format was not specified explicitly. One example is{@link org.virtualbox_7_0.IVirtualBox#createMedium(String,String,org.virtualbox_7_0.AccessMode,org.virtualbox_7_0.DeviceType)}with the empty
format argument. A more complex example is implicit creation of
differencing media when taking a snapshot of a virtual machine:
this operation will try to use a format of the parent medium first
and if this format does not support differencing media the default
format specified by this argument will be used.

The list of supported medium formats may be obtained by the{@link #getMediumFormats()}call. Note that the default medium
format must have a capability to create differencing media;
otherwise operations that create media implicitly may fail
unexpectedly.

The initial value of this property is<code>"VDI"</code>in the current
version of the VirtualBox product, but may change in the future.
NOTE: Setting this property to  null or empty string will restore the
initial value.

@return String

@see #getMediumFormats()
@see org.virtualbox_7_0.IMediumFormat#getId()
@see org.virtualbox_7_0.IVirtualBox#createMedium(String,String,org.virtualbox_7_0.AccessMode,org.virtualbox_7_0.DeviceType)
*/
    public String getDefaultHardDiskFormat()
    {
        try
        {
            String retVal = port.iSystemPropertiesGetDefaultHardDiskFormat(obj);
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
Identifier of the default medium format used by VirtualBox.

The medium format set by this attribute is used by VirtualBox
when the medium format was not specified explicitly. One example is{@link org.virtualbox_7_0.IVirtualBox#createMedium(String,String,org.virtualbox_7_0.AccessMode,org.virtualbox_7_0.DeviceType)}with the empty
format argument. A more complex example is implicit creation of
differencing media when taking a snapshot of a virtual machine:
this operation will try to use a format of the parent medium first
and if this format does not support differencing media the default
format specified by this argument will be used.

The list of supported medium formats may be obtained by the{@link #getMediumFormats()}call. Note that the default medium
format must have a capability to create differencing media;
otherwise operations that create media implicitly may fail
unexpectedly.

The initial value of this property is<code>"VDI"</code>in the current
version of the VirtualBox product, but may change in the future.
NOTE: Setting this property to  null or empty string will restore the
initial value.

@param value String

@see #getMediumFormats()
@see org.virtualbox_7_0.IMediumFormat#getId()
@see org.virtualbox_7_0.IVirtualBox#createMedium(String,String,org.virtualbox_7_0.AccessMode,org.virtualbox_7_0.DeviceType)

*/
    public void setDefaultHardDiskFormat(String value)
    {
        try
        {
        port.iSystemPropertiesSetDefaultHardDiskFormat(obj, value);
        }
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
Issue a warning if the free disk space is below (or in some disk
intensive operation is expected to go below) the given size in
bytes.
@return Long
*/
    public Long getFreeDiskSpaceWarning()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetFreeDiskSpaceWarning(obj);
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
Issue a warning if the free disk space is below (or in some disk
intensive operation is expected to go below) the given size in
bytes.
@param value Long

*/
    public void setFreeDiskSpaceWarning(Long value)
    {
        try
        {
        port.iSystemPropertiesSetFreeDiskSpaceWarning(obj, value);
        }
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
Issue a warning if the free disk space is below (or in some disk
intensive operation is expected to go below) the given percentage.
@return Long
*/
    public Long getFreeDiskSpacePercentWarning()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetFreeDiskSpacePercentWarning(obj);
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
Issue a warning if the free disk space is below (or in some disk
intensive operation is expected to go below) the given percentage.
@param value Long

*/
    public void setFreeDiskSpacePercentWarning(Long value)
    {
        try
        {
        port.iSystemPropertiesSetFreeDiskSpacePercentWarning(obj, value);
        }
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
Issue an error if the free disk space is below (or in some disk
intensive operation is expected to go below) the given size in
bytes.
@return Long
*/
    public Long getFreeDiskSpaceError()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetFreeDiskSpaceError(obj);
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
Issue an error if the free disk space is below (or in some disk
intensive operation is expected to go below) the given size in
bytes.
@param value Long

*/
    public void setFreeDiskSpaceError(Long value)
    {
        try
        {
        port.iSystemPropertiesSetFreeDiskSpaceError(obj, value);
        }
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
Issue an error if the free disk space is below (or in some disk
intensive operation is expected to go below) the given percentage.
@return Long
*/
    public Long getFreeDiskSpacePercentError()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetFreeDiskSpacePercentError(obj);
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
Issue an error if the free disk space is below (or in some disk
intensive operation is expected to go below) the given percentage.
@param value Long

*/
    public void setFreeDiskSpacePercentError(Long value)
    {
        try
        {
        port.iSystemPropertiesSetFreeDiskSpacePercentError(obj, value);
        }
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
Library that provides authentication for Remote Desktop clients. The library
is used if a virtual machine's authentication type is set to "external"
in the VM RemoteDisplay configuration.

The system library extension (".DLL" or ".so") must be omitted.
A full path can be specified; if not, then the library must reside on the
system's default library path.

The default value of this property is<code>"VBoxAuth"</code>. There is a library
of that name in one of the default VirtualBox library directories.

For details about VirtualBox authentication libraries and how to implement
them, please refer to the VirtualBox manual.
NOTE: Setting this property to  null or empty string will restore the
initial value.

@return String
*/
    public String getVRDEAuthLibrary()
    {
        try
        {
            String retVal = port.iSystemPropertiesGetVRDEAuthLibrary(obj);
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
Library that provides authentication for Remote Desktop clients. The library
is used if a virtual machine's authentication type is set to "external"
in the VM RemoteDisplay configuration.

The system library extension (".DLL" or ".so") must be omitted.
A full path can be specified; if not, then the library must reside on the
system's default library path.

The default value of this property is<code>"VBoxAuth"</code>. There is a library
of that name in one of the default VirtualBox library directories.

For details about VirtualBox authentication libraries and how to implement
them, please refer to the VirtualBox manual.
NOTE: Setting this property to  null or empty string will restore the
initial value.

@param value String

*/
    public void setVRDEAuthLibrary(String value)
    {
        try
        {
        port.iSystemPropertiesSetVRDEAuthLibrary(obj, value);
        }
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
Library that provides authentication for webservice clients. The library
is used if a virtual machine's authentication type is set to "external"
in the VM RemoteDisplay configuration and will be called from
within the{@link org.virtualbox_7_0.IWebsessionManager#logon(String,String)}implementation.

As opposed to{@link org.virtualbox_7_0.ISystemProperties#getVRDEAuthLibrary()},
there is no per-VM setting for this, as the webservice is a global
resource (if it is running). Only for this setting (for the webservice),
setting this value to a literal<code>"null"</code>string disables authentication,
meaning that{@link org.virtualbox_7_0.IWebsessionManager#logon(String,String)}will always succeed,
no matter what user name and password are supplied.

The initial value of this property is<code>"VBoxAuth"</code>,
meaning that the webservice will use the same authentication
library that is used by default for VRDE (again, see{@link org.virtualbox_7_0.ISystemProperties#getVRDEAuthLibrary()}).
The format and calling convention of authentication libraries
is the same for the webservice as it is for VRDE.
NOTE: Setting this property to  null or empty string will restore the
initial value.

@return String
*/
    public String getWebServiceAuthLibrary()
    {
        try
        {
            String retVal = port.iSystemPropertiesGetWebServiceAuthLibrary(obj);
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
Library that provides authentication for webservice clients. The library
is used if a virtual machine's authentication type is set to "external"
in the VM RemoteDisplay configuration and will be called from
within the{@link org.virtualbox_7_0.IWebsessionManager#logon(String,String)}implementation.

As opposed to{@link org.virtualbox_7_0.ISystemProperties#getVRDEAuthLibrary()},
there is no per-VM setting for this, as the webservice is a global
resource (if it is running). Only for this setting (for the webservice),
setting this value to a literal<code>"null"</code>string disables authentication,
meaning that{@link org.virtualbox_7_0.IWebsessionManager#logon(String,String)}will always succeed,
no matter what user name and password are supplied.

The initial value of this property is<code>"VBoxAuth"</code>,
meaning that the webservice will use the same authentication
library that is used by default for VRDE (again, see{@link org.virtualbox_7_0.ISystemProperties#getVRDEAuthLibrary()}).
The format and calling convention of authentication libraries
is the same for the webservice as it is for VRDE.
NOTE: Setting this property to  null or empty string will restore the
initial value.

@param value String

*/
    public void setWebServiceAuthLibrary(String value)
    {
        try
        {
        port.iSystemPropertiesSetWebServiceAuthLibrary(obj, value);
        }
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
The name of the extension pack providing the default VRDE.

This attribute is for choosing between multiple extension packs
providing VRDE. If only one is installed, it will automatically be the
default one. The attribute value can be empty if no VRDE extension
pack is installed.

For details about VirtualBox Remote Desktop Extension and how to
implement one, please refer to the VirtualBox SDK.
@return String
*/
    public String getDefaultVRDEExtPack()
    {
        try
        {
            String retVal = port.iSystemPropertiesGetDefaultVRDEExtPack(obj);
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
The name of the extension pack providing the default VRDE.

This attribute is for choosing between multiple extension packs
providing VRDE. If only one is installed, it will automatically be the
default one. The attribute value can be empty if no VRDE extension
pack is installed.

For details about VirtualBox Remote Desktop Extension and how to
implement one, please refer to the VirtualBox SDK.
@param value String

*/
    public void setDefaultVRDEExtPack(String value)
    {
        try
        {
        port.iSystemPropertiesSetDefaultVRDEExtPack(obj, value);
        }
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
The name of the extension pack providing the default cryptographic support
for full VM encryption.

This attribute is for choosing between multiple extension packs
providing cryptographic support. If only one is installed, it will automatically be the
default one. The attribute value can be empty if no cryptographic extension
pack is installed.
@return String
*/
    public String getDefaultCryptoExtPack()
    {
        try
        {
            String retVal = port.iSystemPropertiesGetDefaultCryptoExtPack(obj);
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
The name of the extension pack providing the default cryptographic support
for full VM encryption.

This attribute is for choosing between multiple extension packs
providing cryptographic support. If only one is installed, it will automatically be the
default one. The attribute value can be empty if no cryptographic extension
pack is installed.
@param value String

*/
    public void setDefaultCryptoExtPack(String value)
    {
        try
        {
        port.iSystemPropertiesSetDefaultCryptoExtPack(obj, value);
        }
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
This value specifies how many old release log files are kept.
@return Long
*/
    public Long getLogHistoryCount()
    {
        try
        {
            Long retVal = port.iSystemPropertiesGetLogHistoryCount(obj);
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
This value specifies how many old release log files are kept.
@param value Long

*/
    public void setLogHistoryCount(Long value)
    {
        try
        {
        port.iSystemPropertiesSetLogHistoryCount(obj, value);
        }
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
This value hold the default audio driver for the current
system.
@return org.virtualbox_7_0.AudioDriverType
*/
    public org.virtualbox_7_0.AudioDriverType getDefaultAudioDriver()
    {
        try
        {
            org.virtualbox_7_0.jaxws.AudioDriverType retVal = port.iSystemPropertiesGetDefaultAudioDriver(obj);
            return org.virtualbox_7_0.AudioDriverType.fromValue(retVal.value());
        }
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
The path to the autostart database. Depending on the host this might
be a filesystem path or something else.
@return String
*/
    public String getAutostartDatabasePath()
    {
        try
        {
            String retVal = port.iSystemPropertiesGetAutostartDatabasePath(obj);
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
The path to the autostart database. Depending on the host this might
be a filesystem path or something else.
@param value String

*/
    public void setAutostartDatabasePath(String value)
    {
        try
        {
        port.iSystemPropertiesSetAutostartDatabasePath(obj, value);
        }
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
The path to the default Guest Additions ISO image. Can be empty if
the location is not known in this installation.
@return String
*/
    public String getDefaultAdditionsISO()
    {
        try
        {
            String retVal = port.iSystemPropertiesGetDefaultAdditionsISO(obj);
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
The path to the default Guest Additions ISO image. Can be empty if
the location is not known in this installation.
@param value String

*/
    public void setDefaultAdditionsISO(String value)
    {
        try
        {
        port.iSystemPropertiesSetDefaultAdditionsISO(obj, value);
        }
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
a VM through the{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}method.
Empty or  null strings do not define a particular default, it is up
to{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}to select one. See the
description of{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}for the valid
frontend types.

This global setting is overridden by the per-VM attribute{@link org.virtualbox_7_0.IMachine#getDefaultFrontend()}or a frontend type
passed to{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}.
@return String
*/
    public String getDefaultFrontend()
    {
        try
        {
            String retVal = port.iSystemPropertiesGetDefaultFrontend(obj);
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
a VM through the{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}method.
Empty or  null strings do not define a particular default, it is up
to{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}to select one. See the
description of{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}for the valid
frontend types.

This global setting is overridden by the per-VM attribute{@link org.virtualbox_7_0.IMachine#getDefaultFrontend()}or a frontend type
passed to{@link org.virtualbox_7_0.IMachine#launchVMProcess(org.virtualbox_7_0.ISession,String,List)}.
@param value String

*/
    public void setDefaultFrontend(String value)
    {
        try
        {
        port.iSystemPropertiesSetDefaultFrontend(obj, value);
        }
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
Supported bitmap formats which can be used with takeScreenShot
and takeScreenShotToArray methods.
@return List&lt;org.virtualbox_7_0.BitmapFormat&gt;
*/
    public List<org.virtualbox_7_0.BitmapFormat> getScreenShotFormats()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.BitmapFormat> retVal = port.iSystemPropertiesGetScreenShotFormats(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.BitmapFormat.class, org.virtualbox_7_0.BitmapFormat.class, retVal);
        }
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
The proxy mode setting: System, NoProxy or Manual.
@return org.virtualbox_7_0.ProxyMode
*/
    public org.virtualbox_7_0.ProxyMode getProxyMode()
    {
        try
        {
            org.virtualbox_7_0.jaxws.ProxyMode retVal = port.iSystemPropertiesGetProxyMode(obj);
            return org.virtualbox_7_0.ProxyMode.fromValue(retVal.value());
        }
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
The proxy mode setting: System, NoProxy or Manual.
@param value org.virtualbox_7_0.ProxyMode

*/
    public void setProxyMode(org.virtualbox_7_0.ProxyMode value)
    {
        try
        {
        port.iSystemPropertiesSetProxyMode(obj, org.virtualbox_7_0.jaxws.ProxyMode.fromValue(value.name()));
        }
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
Proxy server URL for the{@link org.virtualbox_7_0.ProxyMode#Manual}proxy mode.

The format is: [{type}"://"][{userid}[:{password}]@]{server}[":"{port}]

Valid types are: http (default), https, socks4, socks4a, socks5, socks5h and direct.
Please note that these are proxy types defining how the proxy operates rather than
how to proxy any similarly named protocol (i.e. don't confuse a http-proxy with
proxying the http protocol, as a http-proxy usually can proxy https and other protocols too).

The port number defaults to 80 for http, 443 for https and 1080 for the socks ones.An empty string will cause the behavior to be identical to{@link org.virtualbox_7_0.ProxyMode#System}.
For compatibility with libproxy, an URL starting with "direct://" will cause{@link org.virtualbox_7_0.ProxyMode#NoProxy}behavior.
NOTE: The password is currently stored as plain text!  Use the{@link org.virtualbox_7_0.ProxyMode#System}mode if you consider the proxy password to be sensitive.

@return String
*/
    public String getProxyURL()
    {
        try
        {
            String retVal = port.iSystemPropertiesGetProxyURL(obj);
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
Proxy server URL for the{@link org.virtualbox_7_0.ProxyMode#Manual}proxy mode.

The format is: [{type}"://"][{userid}[:{password}]@]{server}[":"{port}]

Valid types are: http (default), https, socks4, socks4a, socks5, socks5h and direct.
Please note that these are proxy types defining how the proxy operates rather than
how to proxy any similarly named protocol (i.e. don't confuse a http-proxy with
proxying the http protocol, as a http-proxy usually can proxy https and other protocols too).

The port number defaults to 80 for http, 443 for https and 1080 for the socks ones.An empty string will cause the behavior to be identical to{@link org.virtualbox_7_0.ProxyMode#System}.
For compatibility with libproxy, an URL starting with "direct://" will cause{@link org.virtualbox_7_0.ProxyMode#NoProxy}behavior.
NOTE: The password is currently stored as plain text!  Use the{@link org.virtualbox_7_0.ProxyMode#System}mode if you consider the proxy password to be sensitive.

@param value String

*/
    public void setProxyURL(String value)
    {
        try
        {
        port.iSystemPropertiesSetProxyURL(obj, value);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.ParavirtProvider},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.ParavirtProvider&gt;
*/
    public List<org.virtualbox_7_0.ParavirtProvider> getSupportedParavirtProviders()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.ParavirtProvider> retVal = port.iSystemPropertiesGetSupportedParavirtProviders(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.ParavirtProvider.class, org.virtualbox_7_0.ParavirtProvider.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.ClipboardMode},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.ClipboardMode&gt;
*/
    public List<org.virtualbox_7_0.ClipboardMode> getSupportedClipboardModes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.ClipboardMode> retVal = port.iSystemPropertiesGetSupportedClipboardModes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.ClipboardMode.class, org.virtualbox_7_0.ClipboardMode.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.DnDMode},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.DnDMode&gt;
*/
    public List<org.virtualbox_7_0.DnDMode> getSupportedDnDModes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.DnDMode> retVal = port.iSystemPropertiesGetSupportedDnDModes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.DnDMode.class, org.virtualbox_7_0.DnDMode.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.FirmwareType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.FirmwareType&gt;
*/
    public List<org.virtualbox_7_0.FirmwareType> getSupportedFirmwareTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.FirmwareType> retVal = port.iSystemPropertiesGetSupportedFirmwareTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.FirmwareType.class, org.virtualbox_7_0.FirmwareType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.PointingHIDType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.PointingHIDType&gt;
*/
    public List<org.virtualbox_7_0.PointingHIDType> getSupportedPointingHIDTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.PointingHIDType> retVal = port.iSystemPropertiesGetSupportedPointingHIDTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.PointingHIDType.class, org.virtualbox_7_0.PointingHIDType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.KeyboardHIDType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.KeyboardHIDType&gt;
*/
    public List<org.virtualbox_7_0.KeyboardHIDType> getSupportedKeyboardHIDTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.KeyboardHIDType> retVal = port.iSystemPropertiesGetSupportedKeyboardHIDTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.KeyboardHIDType.class, org.virtualbox_7_0.KeyboardHIDType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.VFSType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.VFSType&gt;
*/
    public List<org.virtualbox_7_0.VFSType> getSupportedVFSTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.VFSType> retVal = port.iSystemPropertiesGetSupportedVFSTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.VFSType.class, org.virtualbox_7_0.VFSType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.ImportOptions},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.ImportOptions&gt;
*/
    public List<org.virtualbox_7_0.ImportOptions> getSupportedImportOptions()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.ImportOptions> retVal = port.iSystemPropertiesGetSupportedImportOptions(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.ImportOptions.class, org.virtualbox_7_0.ImportOptions.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.ExportOptions},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.ExportOptions&gt;
*/
    public List<org.virtualbox_7_0.ExportOptions> getSupportedExportOptions()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.ExportOptions> retVal = port.iSystemPropertiesGetSupportedExportOptions(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.ExportOptions.class, org.virtualbox_7_0.ExportOptions.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.RecordingFeature},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.RecordingFeature&gt;
*/
    public List<org.virtualbox_7_0.RecordingFeature> getSupportedRecordingFeatures()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.RecordingFeature> retVal = port.iSystemPropertiesGetSupportedRecordingFeatures(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.RecordingFeature.class, org.virtualbox_7_0.RecordingFeature.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.RecordingAudioCodec},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.RecordingAudioCodec&gt;
*/
    public List<org.virtualbox_7_0.RecordingAudioCodec> getSupportedRecordingAudioCodecs()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.RecordingAudioCodec> retVal = port.iSystemPropertiesGetSupportedRecordingAudioCodecs(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.RecordingAudioCodec.class, org.virtualbox_7_0.RecordingAudioCodec.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.RecordingVideoCodec},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.RecordingVideoCodec&gt;
*/
    public List<org.virtualbox_7_0.RecordingVideoCodec> getSupportedRecordingVideoCodecs()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.RecordingVideoCodec> retVal = port.iSystemPropertiesGetSupportedRecordingVideoCodecs(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.RecordingVideoCodec.class, org.virtualbox_7_0.RecordingVideoCodec.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.RecordingVideoScalingMode},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.RecordingVideoScalingMode&gt;
*/
    public List<org.virtualbox_7_0.RecordingVideoScalingMode> getSupportedRecordingVSModes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.RecordingVideoScalingMode> retVal = port.iSystemPropertiesGetSupportedRecordingVSModes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.RecordingVideoScalingMode.class, org.virtualbox_7_0.RecordingVideoScalingMode.class, retVal);
        }
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
Returns an array of officially supported audio codec values for enum{@link org.virtualbox_7_0.RecordingRateControlMode},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.RecordingRateControlMode&gt;
*/
    public List<org.virtualbox_7_0.RecordingRateControlMode> getSupportedRecordingARCModes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.RecordingRateControlMode> retVal = port.iSystemPropertiesGetSupportedRecordingARCModes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.RecordingRateControlMode.class, org.virtualbox_7_0.RecordingRateControlMode.class, retVal);
        }
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
Returns an array of officially supported video codec values for enum{@link org.virtualbox_7_0.RecordingRateControlMode},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.RecordingRateControlMode&gt;
*/
    public List<org.virtualbox_7_0.RecordingRateControlMode> getSupportedRecordingVRCModes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.RecordingRateControlMode> retVal = port.iSystemPropertiesGetSupportedRecordingVRCModes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.RecordingRateControlMode.class, org.virtualbox_7_0.RecordingRateControlMode.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.GraphicsControllerType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.GraphicsControllerType&gt;
*/
    public List<org.virtualbox_7_0.GraphicsControllerType> getSupportedGraphicsControllerTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.GraphicsControllerType> retVal = port.iSystemPropertiesGetSupportedGraphicsControllerTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.GraphicsControllerType.class, org.virtualbox_7_0.GraphicsControllerType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.CloneOptions},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.CloneOptions&gt;
*/
    public List<org.virtualbox_7_0.CloneOptions> getSupportedCloneOptions()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.CloneOptions> retVal = port.iSystemPropertiesGetSupportedCloneOptions(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.CloneOptions.class, org.virtualbox_7_0.CloneOptions.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.AutostopType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.AutostopType&gt;
*/
    public List<org.virtualbox_7_0.AutostopType> getSupportedAutostopTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.AutostopType> retVal = port.iSystemPropertiesGetSupportedAutostopTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.AutostopType.class, org.virtualbox_7_0.AutostopType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.VMProcPriority},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.VMProcPriority&gt;
*/
    public List<org.virtualbox_7_0.VMProcPriority> getSupportedVMProcPriorities()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.VMProcPriority> retVal = port.iSystemPropertiesGetSupportedVMProcPriorities(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.VMProcPriority.class, org.virtualbox_7_0.VMProcPriority.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.NetworkAttachmentType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.NetworkAttachmentType&gt;
*/
    public List<org.virtualbox_7_0.NetworkAttachmentType> getSupportedNetworkAttachmentTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.NetworkAttachmentType> retVal = port.iSystemPropertiesGetSupportedNetworkAttachmentTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.NetworkAttachmentType.class, org.virtualbox_7_0.NetworkAttachmentType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.NetworkAdapterType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.NetworkAdapterType&gt;
*/
    public List<org.virtualbox_7_0.NetworkAdapterType> getSupportedNetworkAdapterTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.NetworkAdapterType> retVal = port.iSystemPropertiesGetSupportedNetworkAdapterTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.NetworkAdapterType.class, org.virtualbox_7_0.NetworkAdapterType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.PortMode},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.PortMode&gt;
*/
    public List<org.virtualbox_7_0.PortMode> getSupportedPortModes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.PortMode> retVal = port.iSystemPropertiesGetSupportedPortModes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.PortMode.class, org.virtualbox_7_0.PortMode.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.UartType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.UartType&gt;
*/
    public List<org.virtualbox_7_0.UartType> getSupportedUartTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.UartType> retVal = port.iSystemPropertiesGetSupportedUartTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.UartType.class, org.virtualbox_7_0.UartType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.USBControllerType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.USBControllerType&gt;
*/
    public List<org.virtualbox_7_0.USBControllerType> getSupportedUSBControllerTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.USBControllerType> retVal = port.iSystemPropertiesGetSupportedUSBControllerTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.USBControllerType.class, org.virtualbox_7_0.USBControllerType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.AudioDriverType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.AudioDriverType&gt;
*/
    public List<org.virtualbox_7_0.AudioDriverType> getSupportedAudioDriverTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.AudioDriverType> retVal = port.iSystemPropertiesGetSupportedAudioDriverTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.AudioDriverType.class, org.virtualbox_7_0.AudioDriverType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.AudioControllerType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.AudioControllerType&gt;
*/
    public List<org.virtualbox_7_0.AudioControllerType> getSupportedAudioControllerTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.AudioControllerType> retVal = port.iSystemPropertiesGetSupportedAudioControllerTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.AudioControllerType.class, org.virtualbox_7_0.AudioControllerType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.StorageBus},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.StorageBus&gt;
*/
    public List<org.virtualbox_7_0.StorageBus> getSupportedStorageBuses()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.StorageBus> retVal = port.iSystemPropertiesGetSupportedStorageBuses(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.StorageBus.class, org.virtualbox_7_0.StorageBus.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.StorageControllerType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.StorageControllerType&gt;
*/
    public List<org.virtualbox_7_0.StorageControllerType> getSupportedStorageControllerTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.StorageControllerType> retVal = port.iSystemPropertiesGetSupportedStorageControllerTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.StorageControllerType.class, org.virtualbox_7_0.StorageControllerType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.ChipsetType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.ChipsetType&gt;
*/
    public List<org.virtualbox_7_0.ChipsetType> getSupportedChipsetTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.ChipsetType> retVal = port.iSystemPropertiesGetSupportedChipsetTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.ChipsetType.class, org.virtualbox_7_0.ChipsetType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.IommuType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.IommuType&gt;
*/
    public List<org.virtualbox_7_0.IommuType> getSupportedIommuTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.IommuType> retVal = port.iSystemPropertiesGetSupportedIommuTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.IommuType.class, org.virtualbox_7_0.IommuType.class, retVal);
        }
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
Returns an array of officially supported values for enum{@link org.virtualbox_7_0.TpmType},
in the sense of what is e.g. worth offering in the VirtualBox GUI.
@return List&lt;org.virtualbox_7_0.TpmType&gt;
*/
    public List<org.virtualbox_7_0.TpmType> getSupportedTpmTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.TpmType> retVal = port.iSystemPropertiesGetSupportedTpmTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.TpmType.class, org.virtualbox_7_0.TpmType.class, retVal);
        }
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
The API language ID used to translate messages to client.
@return String
*/
    public String getLanguageId()
    {
        try
        {
            String retVal = port.iSystemPropertiesGetLanguageId(obj);
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
The API language ID used to translate messages to client.
@param value String

*/
    public void setLanguageId(String value)
    {
        try
        {
        port.iSystemPropertiesSetLanguageId(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public static ISystemProperties queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new ISystemProperties(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Maximum total number of network adapters associated with every{@link org.virtualbox_7_0.IMachine}instance.
@param chipset The chipset type to get the value for.

@return The maximum total number of network adapters allowed.

*/
    public Long getMaxNetworkAdapters(org.virtualbox_7_0.ChipsetType chipset)
    {
        try
        {
            Long retVal;
        retVal = port.iSystemPropertiesGetMaxNetworkAdapters(obj, org.virtualbox_7_0.jaxws.ChipsetType.fromValue(chipset.name()));
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
Maximum number of network adapters of a given attachment type,
associated with every{@link org.virtualbox_7_0.IMachine}instance.
@param chipset The chipset type to get the value for.

@param type Type of attachment.

@return The maximum number of network adapters allowed for
particular chipset and attachment type.

*/
    public Long getMaxNetworkAdaptersOfType(org.virtualbox_7_0.ChipsetType chipset, org.virtualbox_7_0.NetworkAttachmentType type)
    {
        try
        {
            Long retVal;
        retVal = port.iSystemPropertiesGetMaxNetworkAdaptersOfType(obj, org.virtualbox_7_0.jaxws.ChipsetType.fromValue(chipset.name()), org.virtualbox_7_0.jaxws.NetworkAttachmentType.fromValue(type.name()));
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
Returns the maximum number of devices which can be attached to a port
for the given storage bus.
@param bus The storage bus type to get the value for.

@return The maximum number of devices which can be attached to the port for the given
storage bus.

*/
    public Long getMaxDevicesPerPortForStorageBus(org.virtualbox_7_0.StorageBus bus)
    {
        try
        {
            Long retVal;
        retVal = port.iSystemPropertiesGetMaxDevicesPerPortForStorageBus(obj, org.virtualbox_7_0.jaxws.StorageBus.fromValue(bus.name()));
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
Returns the minimum number of ports the given storage bus supports.
@param bus The storage bus type to get the value for.

@return The minimum number of ports for the given storage bus.

*/
    public Long getMinPortCountForStorageBus(org.virtualbox_7_0.StorageBus bus)
    {
        try
        {
            Long retVal;
        retVal = port.iSystemPropertiesGetMinPortCountForStorageBus(obj, org.virtualbox_7_0.jaxws.StorageBus.fromValue(bus.name()));
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
Returns the maximum number of ports the given storage bus supports.
@param bus The storage bus type to get the value for.

@return The maximum number of ports for the given storage bus.

*/
    public Long getMaxPortCountForStorageBus(org.virtualbox_7_0.StorageBus bus)
    {
        try
        {
            Long retVal;
        retVal = port.iSystemPropertiesGetMaxPortCountForStorageBus(obj, org.virtualbox_7_0.jaxws.StorageBus.fromValue(bus.name()));
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
Returns the maximum number of storage bus instances which
can be configured for each VM. This corresponds to the number of
storage controllers one can have. Value may depend on chipset type
used.
@param chipset The chipset type to get the value for.

@param bus The storage bus type to get the value for.

@return The maximum number of instances for the given storage bus.

*/
    public Long getMaxInstancesOfStorageBus(org.virtualbox_7_0.ChipsetType chipset, org.virtualbox_7_0.StorageBus bus)
    {
        try
        {
            Long retVal;
        retVal = port.iSystemPropertiesGetMaxInstancesOfStorageBus(obj, org.virtualbox_7_0.jaxws.ChipsetType.fromValue(chipset.name()), org.virtualbox_7_0.jaxws.StorageBus.fromValue(bus.name()));
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
Returns list of all the supported device types
({@link org.virtualbox_7_0.DeviceType}) for the given type of storage
bus.
@param bus The storage bus type to get the value for.

@return The list of all supported device types for the given storage bus.

*/
    public List<org.virtualbox_7_0.DeviceType> getDeviceTypesForStorageBus(org.virtualbox_7_0.StorageBus bus)
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.DeviceType> retVal;
        retVal = port.iSystemPropertiesGetDeviceTypesForStorageBus(obj, org.virtualbox_7_0.jaxws.StorageBus.fromValue(bus.name()));
           return Helper.convertEnums(org.virtualbox_7_0.jaxws.DeviceType.class, org.virtualbox_7_0.DeviceType.class, retVal);
        }
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
Returns the{@link org.virtualbox_7_0.StorageBus}enum value
for a given storage controller type.
@param storageControllerType The storage controller type to get the value for.

@return The storage bus which is applicable.

*/
    public org.virtualbox_7_0.StorageBus getStorageBusForStorageControllerType(org.virtualbox_7_0.StorageControllerType storageControllerType)
    {
        try
        {
            org.virtualbox_7_0.jaxws.StorageBus retVal;
        retVal = port.iSystemPropertiesGetStorageBusForStorageControllerType(obj, org.virtualbox_7_0.jaxws.StorageControllerType.fromValue(storageControllerType.name()));
           return org.virtualbox_7_0.StorageBus.fromValue(retVal.value());
        }
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
Returns the possible{@link org.virtualbox_7_0.StorageControllerType}enum values
for a given storage bus.
@param storageBus The storage bus type to get the values for.

@return The enum values (sorted by what should be a sensible decreasing
importance of the type) which are valid.

*/
    public List<org.virtualbox_7_0.StorageControllerType> getStorageControllerTypesForStorageBus(org.virtualbox_7_0.StorageBus storageBus)
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.StorageControllerType> retVal;
        retVal = port.iSystemPropertiesGetStorageControllerTypesForStorageBus(obj, org.virtualbox_7_0.jaxws.StorageBus.fromValue(storageBus.name()));
           return Helper.convertEnums(org.virtualbox_7_0.jaxws.StorageControllerType.class, org.virtualbox_7_0.StorageControllerType.class, retVal);
        }
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
Returns the default I/O cache setting for the
given storage controller
@param controllerType The storage controller type to get the setting for.

@return Returned flag indicating the default value

*/
    public Boolean getDefaultIoCacheSettingForStorageController(org.virtualbox_7_0.StorageControllerType controllerType)
    {
        try
        {
            Boolean retVal;
        retVal = port.iSystemPropertiesGetDefaultIoCacheSettingForStorageController(obj, org.virtualbox_7_0.jaxws.StorageControllerType.fromValue(controllerType.name()));
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
Returns whether the given storage controller supports
hot-plugging devices.
@param controllerType The storage controller to check the setting for.

@return Returned flag indicating whether the controller is hotplug capable

*/
    public Boolean getStorageControllerHotplugCapable(org.virtualbox_7_0.StorageControllerType controllerType)
    {
        try
        {
            Boolean retVal;
        retVal = port.iSystemPropertiesGetStorageControllerHotplugCapable(obj, org.virtualbox_7_0.jaxws.StorageControllerType.fromValue(controllerType.name()));
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
Returns the maximum number of USB controller instances which
can be configured for each VM. This corresponds to the number of
USB controllers one can have. Value may depend on chipset type
used.
@param chipset The chipset type to get the value for.

@param type The USB controller type to get the value for.

@return The maximum number of instances for the given USB controller type.

*/
    public Long getMaxInstancesOfUSBControllerType(org.virtualbox_7_0.ChipsetType chipset, org.virtualbox_7_0.USBControllerType type)
    {
        try
        {
            Long retVal;
        retVal = port.iSystemPropertiesGetMaxInstancesOfUSBControllerType(obj, org.virtualbox_7_0.jaxws.ChipsetType.fromValue(chipset.name()), org.virtualbox_7_0.jaxws.USBControllerType.fromValue(type.name()));
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
Returns CPU profiles matching the given criteria.
@param architecture The architecture to get profiles for. Required.

@param namePattern Name pattern. Simple wildcard matching using asterisk (*) and
question mark (?).

@return The matching CPU profiles.

*/
    public List<org.virtualbox_7_0.ICPUProfile> getCPUProfiles(org.virtualbox_7_0.CPUArchitecture architecture, String namePattern)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal;
        retVal = port.iSystemPropertiesGetCPUProfiles(obj, org.virtualbox_7_0.jaxws.CPUArchitecture.fromValue(architecture.name()), namePattern);
           return Helper.wrap(org.virtualbox_7_0.ICPUProfile.class, getObjMgr(), port, retVal);
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

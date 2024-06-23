
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
 * IHost.java
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
The IHost interface represents the physical machine that this VirtualBox
installation runs on.

An object implementing this interface is returned by the{@link org.virtualbox_7_0.IVirtualBox#getHost()}attribute. This interface contains
read-only information about the host's physical hardware (such as what
processors and disks are available, what the host operating system is,
and so on) and also allows for manipulating some of the host's hardware,
such as global USB device filters and host interface networking.

Interface ID: <code>{E54F6256-97A7-4947-8A78-10C013DDF4B8}</code>
*/
public class IHost extends IUnknown
{

    public IHost(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
List of DVD drives available on the host.
@return List&lt;org.virtualbox_7_0.IMedium&gt;
*/
    public List<org.virtualbox_7_0.IMedium> getDVDDrives()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iHostGetDVDDrives(obj);
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
List of floppy drives available on the host.
@return List&lt;org.virtualbox_7_0.IMedium&gt;
*/
    public List<org.virtualbox_7_0.IMedium> getFloppyDrives()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iHostGetFloppyDrives(obj);
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
List of audio devices currently available on the host.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - This attribute is not implemented yet.</dd>
</dl>

@return List&lt;org.virtualbox_7_0.IHostAudioDevice&gt;
*/
    public List<org.virtualbox_7_0.IHostAudioDevice> getAudioDevices()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iHostGetAudioDevices(obj);
            return Helper.wrap(org.virtualbox_7_0.IHostAudioDevice.class, getObjMgr(), port, retVal);
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
List of USB devices currently attached to the host.
Once a new device is physically attached to the host computer,
it appears in this list and remains there until detached.
NOTE: If USB functionality is not available in the given edition of
VirtualBox, this method will set the result code to  E_NOTIMPL.

@return List&lt;org.virtualbox_7_0.IHostUSBDevice&gt;
*/
    public List<org.virtualbox_7_0.IHostUSBDevice> getUSBDevices()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iHostGetUSBDevices(obj);
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
List of USB device filters in action.
When a new device is physically attached to the host computer,
filters from this list are applied to it (in order they are stored
in the list). The first matched filter will determine the{@link org.virtualbox_7_0.IHostUSBDeviceFilter#getAction()}performed on the device.

Unless the device is ignored by these filters, filters of all
currently running virtual machines
({@link org.virtualbox_7_0.IUSBDeviceFilters#getDeviceFilters()}) are applied to it.
NOTE: If USB functionality is not available in the given edition of
VirtualBox, this method will set the result code to  E_NOTIMPL.

@return List&lt;org.virtualbox_7_0.IHostUSBDeviceFilter&gt;

@see org.virtualbox_7_0.IHostUSBDeviceFilter
@see org.virtualbox_7_0.USBDeviceState
*/
    public List<org.virtualbox_7_0.IHostUSBDeviceFilter> getUSBDeviceFilters()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iHostGetUSBDeviceFilters(obj);
            return Helper.wrap(org.virtualbox_7_0.IHostUSBDeviceFilter.class, getObjMgr(), port, retVal);
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
List of host network interfaces currently defined on the host.
@return List&lt;org.virtualbox_7_0.IHostNetworkInterface&gt;
*/
    public List<org.virtualbox_7_0.IHostNetworkInterface> getNetworkInterfaces()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iHostGetNetworkInterfaces(obj);
            return Helper.wrap(org.virtualbox_7_0.IHostNetworkInterface.class, getObjMgr(), port, retVal);
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
The list of nameservers registered in host's name resolving system.
@return List&lt;String&gt;
*/
    public List<String> getNameServers()
    {
        try
        {
            List<String> retVal = port.iHostGetNameServers(obj);
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
Domain name used for name resolving.
@return String
*/
    public String getDomainName()
    {
        try
        {
            String retVal = port.iHostGetDomainName(obj);
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
Search string registered for name resolving.
@return List&lt;String&gt;
*/
    public List<String> getSearchStrings()
    {
        try
        {
            List<String> retVal = port.iHostGetSearchStrings(obj);
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
Number of (logical) CPUs installed in the host system.
@return Long
*/
    public Long getProcessorCount()
    {
        try
        {
            Long retVal = port.iHostGetProcessorCount(obj);
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
Number of (logical) CPUs online in the host system.
@return Long
*/
    public Long getProcessorOnlineCount()
    {
        try
        {
            Long retVal = port.iHostGetProcessorOnlineCount(obj);
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
Number of physical processor cores installed in the host system.
@return Long
*/
    public Long getProcessorCoreCount()
    {
        try
        {
            Long retVal = port.iHostGetProcessorCoreCount(obj);
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
Number of physical processor cores online in the host system.
@return Long
*/
    public Long getProcessorOnlineCoreCount()
    {
        try
        {
            Long retVal = port.iHostGetProcessorOnlineCoreCount(obj);
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
List of the host drive available to use in the VirtualBox.
@return List&lt;org.virtualbox_7_0.IHostDrive&gt;
*/
    public List<org.virtualbox_7_0.IHostDrive> getHostDrives()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iHostGetHostDrives(obj);
            return Helper.wrap(org.virtualbox_7_0.IHostDrive.class, getObjMgr(), port, retVal);
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
Amount of system memory in megabytes installed in the host system.
@return Long
*/
    public Long getMemorySize()
    {
        try
        {
            Long retVal = port.iHostGetMemorySize(obj);
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
Available system memory in the host system.
@return Long
*/
    public Long getMemoryAvailable()
    {
        try
        {
            Long retVal = port.iHostGetMemoryAvailable(obj);
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
Name of the host system's operating system.
@return String
*/
    public String getOperatingSystem()
    {
        try
        {
            String retVal = port.iHostGetOperatingSystem(obj);
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
Host operating system's version string.
@return String
*/
    public String getOSVersion()
    {
        try
        {
            String retVal = port.iHostGetOSVersion(obj);
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
Returns the current host time in milliseconds since 1970-01-01 UTC.
@return Long
*/
    public Long getUTCTime()
    {
        try
        {
            Long retVal = port.iHostGetUTCTime(obj);
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
Returns  true when the host supports 3D hardware acceleration.
@return Boolean
*/
    public Boolean getAcceleration3DAvailable()
    {
        try
        {
            Boolean retVal = port.iHostGetAcceleration3DAvailable(obj);
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
List of currently available host video capture devices.
@return List&lt;org.virtualbox_7_0.IHostVideoInputDevice&gt;
*/
    public List<org.virtualbox_7_0.IHostVideoInputDevice> getVideoInputDevices()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iHostGetVideoInputDevices(obj);
            return Helper.wrap(org.virtualbox_7_0.IHostVideoInputDevice.class, getObjMgr(), port, retVal);
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
Checks for new VirtualBox host versions.
@return org.virtualbox_7_0.IUpdateAgent
*/
    public org.virtualbox_7_0.IUpdateAgent getUpdateHost()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iHostGetUpdateHost(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IUpdateAgent(retVal, getObjMgr(), port) : null;
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
Checks for new VirtualBox Extension Pack versions.
@return org.virtualbox_7_0.IUpdateAgent
*/
    public org.virtualbox_7_0.IUpdateAgent getUpdateExtPack()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iHostGetUpdateExtPack(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IUpdateAgent(retVal, getObjMgr(), port) : null;
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
Checks for new Guest Additions versions.
@return org.virtualbox_7_0.IUpdateAgent
*/
    public org.virtualbox_7_0.IUpdateAgent getUpdateGuestAdditions()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iHostGetUpdateGuestAdditions(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IUpdateAgent(retVal, getObjMgr(), port) : null;
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
    public static IHost queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IHost(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Query the (approximate) maximum speed of a specified host CPU in
Megahertz.
@param cpuId Identifier of the CPU.

@return Speed value. 0 is returned if value is not known or  cpuId is
invalid.

*/
    public Long getProcessorSpeed(Long cpuId)
    {
        try
        {
            Long retVal;
        retVal = port.iHostGetProcessorSpeed(obj, cpuId);
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
Query whether a CPU feature is supported or not.
@param feature CPU Feature identifier.

@return Feature is supported or not.

*/
    public Boolean getProcessorFeature(org.virtualbox_7_0.ProcessorFeature feature)
    {
        try
        {
            Boolean retVal;
        retVal = port.iHostGetProcessorFeature(obj, org.virtualbox_7_0.jaxws.ProcessorFeature.fromValue(feature.name()));
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
Query the model string of a specified host CPU.
@param cpuId Identifier of the CPU.

@return Model string. An empty string is returned if value is not known or
cpuId is invalid.

NOTE: The current implementation might not necessarily return the
description for this exact CPU.

*/
    public String getProcessorDescription(Long cpuId)
    {
        try
        {
            String retVal;
        retVal = port.iHostGetProcessorDescription(obj, cpuId);
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
Returns the CPU cpuid information for the specified leaf.
@param cpuId Identifier of the CPU. The CPU most be online.

@param leaf CPUID leaf index (eax).

@param subLeaf CPUID leaf sub index (ecx). This currently only applies to cache
information on Intel CPUs. Use 0 if retrieving values for{@link org.virtualbox_7_0.IMachine#setCPUIDLeaf(Long,Long,Long,Long,Long,Long)}.

@param valEax CPUID leaf value for register eax.

@param valEbx CPUID leaf value for register ebx.

@param valEcx CPUID leaf value for register ecx.

@param valEdx CPUID leaf value for register edx.

NOTE: The current implementation might not necessarily return the
description for this exact CPU.

*/
    public void getProcessorCPUIDLeaf(Long cpuId, Long leaf, Long subLeaf, Holder<Long> valEax, Holder<Long> valEbx, Holder<Long> valEcx, Holder<Long> valEdx)
    {
        try
        {
        jakarta.xml.ws.Holder<Long> tmp_valEax = new jakarta.xml.ws.Holder<Long>();
        jakarta.xml.ws.Holder<Long> tmp_valEbx = new jakarta.xml.ws.Holder<Long>();
        jakarta.xml.ws.Holder<Long> tmp_valEcx = new jakarta.xml.ws.Holder<Long>();
        jakarta.xml.ws.Holder<Long> tmp_valEdx = new jakarta.xml.ws.Holder<Long>();
        port.iHostGetProcessorCPUIDLeaf(obj, cpuId, leaf, subLeaf, tmp_valEax, tmp_valEbx, tmp_valEcx, tmp_valEdx);
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
Creates a new adapter for Host Only Networking.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Host network interface  name already exists.</dd>
</dl>

@param hostInterface Created host interface object.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress createHostOnlyNetworkInterface(Holder<org.virtualbox_7_0.IHostNetworkInterface> hostInterface)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        jakarta.xml.ws.Holder<String> tmp_hostInterface = new jakarta.xml.ws.Holder<String>();
        jakarta.xml.ws.Holder<String> retVal = new jakarta.xml.ws.Holder<String>();
        port.iHostCreateHostOnlyNetworkInterface(obj, tmp_hostInterface, retVal);
        hostInterface.value = (tmp_hostInterface.value.length() > 0) ? new org.virtualbox_7_0.IHostNetworkInterface(tmp_hostInterface.value, getObjMgr(), port) : null;
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
Removes the given Host Only Networking interface.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - No host network interface matching  id found.</dd>
</dl>

@param id Adapter GUID.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress removeHostOnlyNetworkInterface(String id)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iHostRemoveHostOnlyNetworkInterface(obj, id);
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
Creates a new USB device filter. All attributes except
the filter name are set to empty (any match),<i>active</i>is  false (the filter is not active).

The created filter can be added to the list of filters using{@link #insertUSBDeviceFilter(Long,org.virtualbox_7_0.IHostUSBDeviceFilter)}.
@param name Filter name. See{@link org.virtualbox_7_0.IUSBDeviceFilter#getName()}for more information.

@return Created filter object.

@see #getUSBDeviceFilters()

*/
    public org.virtualbox_7_0.IHostUSBDeviceFilter createUSBDeviceFilter(String name)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iHostCreateUSBDeviceFilter(obj, name);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IHostUSBDeviceFilter(retVal, getObjMgr(), port) : null;
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
Inserts the given USB device to the specified position
in the list of filters.

Positions are numbered starting from  0. If the specified
position is equal to or greater than the number of elements in
the list, the filter is added at the end of the collection.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - USB device filter is not created within this VirtualBox instance.</dd>
<dd><code>E_INVALIDARG</code> - USB device filter already in list.</dd>
</dl>

@param position Position to insert the filter to.

@param filter USB device filter to insert.

NOTE: Duplicates are not allowed, so an attempt to insert a
filter already in the list is an error.

NOTE: If USB functionality is not available in the given edition of
VirtualBox, this method will set the result code to  E_NOTIMPL.

@see #getUSBDeviceFilters()

*/
    public void insertUSBDeviceFilter(Long position, org.virtualbox_7_0.IHostUSBDeviceFilter filter)
    {
        try
        {
        port.iHostInsertUSBDeviceFilter(obj, position, ((filter == null) ? null :filter.getWrapped()));
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Removes a USB device filter from the specified position in the
list of filters.

Positions are numbered starting from  0. Specifying a
position equal to or greater than the number of elements in
the list will produce an error.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - USB device filter list empty or invalid  position.</dd>
</dl>

@param position Position to remove the filter from.

NOTE: If USB functionality is not available in the given edition of
VirtualBox, this method will set the result code to  E_NOTIMPL.

@see #getUSBDeviceFilters()

*/
    public void removeUSBDeviceFilter(Long position)
    {
        try
        {
        port.iHostRemoveUSBDeviceFilter(obj, position);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Searches for a host DVD drive with the given  name.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - Given  name does not correspond to any host drive.</dd>
</dl>

@param name Name of the host drive to search for

@return Found host drive object

*/
    public org.virtualbox_7_0.IMedium findHostDVDDrive(String name)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iHostFindHostDVDDrive(obj, name);
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
Searches for a host floppy drive with the given  name.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - Given  name does not correspond to any host floppy drive.</dd>
</dl>

@param name Name of the host floppy drive to search for

@return Found host floppy drive object

*/
    public org.virtualbox_7_0.IMedium findHostFloppyDrive(String name)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iHostFindHostFloppyDrive(obj, name);
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
Searches through all host network interfaces for an interface with
the given  name.
@param name Name of the host network interface to search for.

@return Found host network interface object.

NOTE: The method returns an error if the given  name does not
correspond to any host network interface.

*/
    public org.virtualbox_7_0.IHostNetworkInterface findHostNetworkInterfaceByName(String name)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iHostFindHostNetworkInterfaceByName(obj, name);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IHostNetworkInterface(retVal, getObjMgr(), port) : null;
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
Searches through all host network interfaces for an interface with
the given GUID.
@param id GUID of the host network interface to search for.

@return Found host network interface object.

NOTE: The method returns an error if the given GUID does not
correspond to any host network interface.

*/
    public org.virtualbox_7_0.IHostNetworkInterface findHostNetworkInterfaceById(String id)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iHostFindHostNetworkInterfaceById(obj, id);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IHostNetworkInterface(retVal, getObjMgr(), port) : null;
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
Searches through all host network interfaces and returns a list of interfaces of the specified type
@param type type of the host network interfaces to search for.

@return Found host network interface objects.

*/
    public List<org.virtualbox_7_0.IHostNetworkInterface> findHostNetworkInterfacesOfType(org.virtualbox_7_0.HostNetworkInterfaceType type)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal;
        retVal = port.iHostFindHostNetworkInterfacesOfType(obj, org.virtualbox_7_0.jaxws.HostNetworkInterfaceType.fromValue(type.name()));
           return Helper.wrap(org.virtualbox_7_0.IHostNetworkInterface.class, getObjMgr(), port, retVal);
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
    public org.virtualbox_7_0.IHostUSBDevice findUSBDeviceById(String id)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iHostFindUSBDeviceById(obj, id);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IHostUSBDevice(retVal, getObjMgr(), port) : null;
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
    public org.virtualbox_7_0.IHostUSBDevice findUSBDeviceByAddress(String name)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iHostFindUSBDeviceByAddress(obj, name);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IHostUSBDevice(retVal, getObjMgr(), port) : null;
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
Generates a valid Ethernet MAC address, 12 hexadecimal characters.
@return New Ethernet MAC address.

*/
    public String generateMACAddress()
    {
        try
        {
            String retVal;
        retVal = port.iHostGenerateMACAddress(obj);
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
Adds a new USB device source.
@param backend The backend to use as the new device source.

@param id Unique ID to identify the source.

@param address Address to use, the format is dependent on the backend.
For USB/IP backends for example the notation is host[:port].

@param propertyNames Array of property names for more detailed configuration. Not used at the moment.

@param propertyValues Array of property values for more detailed configuration. Not used at the moment.

*/
    public void addUSBDeviceSource(String backend, String id, String address, List<String> propertyNames, List<String> propertyValues)
    {
        try
        {
        port.iHostAddUSBDeviceSource(obj, backend, id, address, propertyNames, propertyValues);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Removes a previously added USB device source.
@param id The identifier used when the source was added.

*/
    public void removeUSBDeviceSource(String id)
    {
        try
        {
        port.iHostRemoveUSBDeviceSource(obj, id);
        }
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

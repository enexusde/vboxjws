
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
 * INetworkAdapter.java
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
Represents a virtual network adapter that is attached to a virtual machine.
Each virtual machine has a fixed number of network adapter slots with one
instance of this attached to each of them. Call{@link org.virtualbox_7_0.IMachine#getNetworkAdapter(Long)}to get the network adapter that
is attached to a given slot in a given machine.

Each network adapter can be in one of five attachment modes, which are
represented by the{@link org.virtualbox_7_0.NetworkAttachmentType}enumeration;
see the{@link #getAttachmentType()}attribute.

Interface ID: <code>{DCF47A1D-ED70-4DB8-9A4B-2646BD166905}</code>
*/
public class INetworkAdapter extends IUnknown
{

    public INetworkAdapter(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Type of the virtual network adapter. Depending on this value,
VirtualBox will provide a different virtual network hardware
to the guest.
@return org.virtualbox_7_0.NetworkAdapterType
*/
    public org.virtualbox_7_0.NetworkAdapterType getAdapterType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.NetworkAdapterType retVal = port.iNetworkAdapterGetAdapterType(obj);
            return org.virtualbox_7_0.NetworkAdapterType.fromValue(retVal.value());
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Type of the virtual network adapter. Depending on this value,
VirtualBox will provide a different virtual network hardware
to the guest.
@param value org.virtualbox_7_0.NetworkAdapterType

*/
    public void setAdapterType(org.virtualbox_7_0.NetworkAdapterType value)
    {
        try
        {
        port.iNetworkAdapterSetAdapterType(obj, org.virtualbox_7_0.jaxws.NetworkAdapterType.fromValue(value.name()));
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Slot number this adapter is plugged into. Corresponds to
the value you pass to{@link org.virtualbox_7_0.IMachine#getNetworkAdapter(Long)}to obtain this instance.
@return Long
*/
    public Long getSlot()
    {
        try
        {
            Long retVal = port.iNetworkAdapterGetSlot(obj);
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
Flag whether the network adapter is present in the
guest system. If disabled, the virtual guest hardware will
not contain this network adapter. Can only be changed when
the VM is not running.
@return Boolean
*/
    public Boolean getEnabled()
    {
        try
        {
            Boolean retVal = port.iNetworkAdapterGetEnabled(obj);
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
Flag whether the network adapter is present in the
guest system. If disabled, the virtual guest hardware will
not contain this network adapter. Can only be changed when
the VM is not running.
@param value Boolean

*/
    public void setEnabled(Boolean value)
    {
        try
        {
        port.iNetworkAdapterSetEnabled(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Ethernet MAC address of the adapter, 12 hexadecimal characters. When
setting it to  null or an empty string for an enabled adapter,
VirtualBox will generate a unique MAC address. Disabled adapters can
have an empty MAC address.
@return String
*/
    public String getMACAddress()
    {
        try
        {
            String retVal = port.iNetworkAdapterGetMACAddress(obj);
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
Ethernet MAC address of the adapter, 12 hexadecimal characters. When
setting it to  null or an empty string for an enabled adapter,
VirtualBox will generate a unique MAC address. Disabled adapters can
have an empty MAC address.
@param value String

*/
    public void setMACAddress(String value)
    {
        try
        {
        port.iNetworkAdapterSetMACAddress(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Sets/Gets network attachment type of this network adapter.
@return org.virtualbox_7_0.NetworkAttachmentType
*/
    public org.virtualbox_7_0.NetworkAttachmentType getAttachmentType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.NetworkAttachmentType retVal = port.iNetworkAdapterGetAttachmentType(obj);
            return org.virtualbox_7_0.NetworkAttachmentType.fromValue(retVal.value());
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Sets/Gets network attachment type of this network adapter.
@param value org.virtualbox_7_0.NetworkAttachmentType

*/
    public void setAttachmentType(org.virtualbox_7_0.NetworkAttachmentType value)
    {
        try
        {
        port.iNetworkAdapterSetAttachmentType(obj, org.virtualbox_7_0.jaxws.NetworkAttachmentType.fromValue(value.name()));
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Name of the network interface the VM should be bridged to.
@return String
*/
    public String getBridgedInterface()
    {
        try
        {
            String retVal = port.iNetworkAdapterGetBridgedInterface(obj);
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
Name of the network interface the VM should be bridged to.
@param value String

*/
    public void setBridgedInterface(String value)
    {
        try
        {
        port.iNetworkAdapterSetBridgedInterface(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Name of the host only network interface the VM is attached to.
@return String
*/
    public String getHostOnlyInterface()
    {
        try
        {
            String retVal = port.iNetworkAdapterGetHostOnlyInterface(obj);
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
Name of the host only network interface the VM is attached to.
@param value String

*/
    public void setHostOnlyInterface(String value)
    {
        try
        {
        port.iNetworkAdapterSetHostOnlyInterface(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Name of the host only network the VM is attached to.
@return String
*/
    public String getHostOnlyNetwork()
    {
        try
        {
            String retVal = port.iNetworkAdapterGetHostOnlyNetwork(obj);
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
Name of the host only network the VM is attached to.
@param value String

*/
    public void setHostOnlyNetwork(String value)
    {
        try
        {
        port.iNetworkAdapterSetHostOnlyNetwork(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Name of the internal network the VM is attached to.
@return String
*/
    public String getInternalNetwork()
    {
        try
        {
            String retVal = port.iNetworkAdapterGetInternalNetwork(obj);
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
Name of the internal network the VM is attached to.
@param value String

*/
    public void setInternalNetwork(String value)
    {
        try
        {
        port.iNetworkAdapterSetInternalNetwork(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Name of the NAT network the VM is attached to.
@return String
*/
    public String getNATNetwork()
    {
        try
        {
            String retVal = port.iNetworkAdapterGetNATNetwork(obj);
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
Name of the NAT network the VM is attached to.
@param value String

*/
    public void setNATNetwork(String value)
    {
        try
        {
        port.iNetworkAdapterSetNATNetwork(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Name of the driver to use for the "Generic" network attachment type.
@return String
*/
    public String getGenericDriver()
    {
        try
        {
            String retVal = port.iNetworkAdapterGetGenericDriver(obj);
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
Name of the driver to use for the "Generic" network attachment type.
@param value String

*/
    public void setGenericDriver(String value)
    {
        try
        {
        port.iNetworkAdapterSetGenericDriver(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Name of the cloud network the VM is attached to.
@return String
*/
    public String getCloudNetwork()
    {
        try
        {
            String retVal = port.iNetworkAdapterGetCloudNetwork(obj);
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
Name of the cloud network the VM is attached to.
@param value String

*/
    public void setCloudNetwork(String value)
    {
        try
        {
        port.iNetworkAdapterSetCloudNetwork(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Flag whether the adapter reports the cable as connected or not.
It can be used to report offline situations to a VM.
@return Boolean
*/
    public Boolean getCableConnected()
    {
        try
        {
            Boolean retVal = port.iNetworkAdapterGetCableConnected(obj);
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
Flag whether the adapter reports the cable as connected or not.
It can be used to report offline situations to a VM.
@param value Boolean

*/
    public void setCableConnected(Boolean value)
    {
        try
        {
        port.iNetworkAdapterSetCableConnected(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Line speed reported by custom drivers, in units of 1 kbps.
@return Long
*/
    public Long getLineSpeed()
    {
        try
        {
            Long retVal = port.iNetworkAdapterGetLineSpeed(obj);
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
Line speed reported by custom drivers, in units of 1 kbps.
@param value Long

*/
    public void setLineSpeed(Long value)
    {
        try
        {
        port.iNetworkAdapterSetLineSpeed(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
The promiscuous mode policy of the network adapter when attached to an
internal network, host only network or a bridge.
@return org.virtualbox_7_0.NetworkAdapterPromiscModePolicy
*/
    public org.virtualbox_7_0.NetworkAdapterPromiscModePolicy getPromiscModePolicy()
    {
        try
        {
            org.virtualbox_7_0.jaxws.NetworkAdapterPromiscModePolicy retVal = port.iNetworkAdapterGetPromiscModePolicy(obj);
            return org.virtualbox_7_0.NetworkAdapterPromiscModePolicy.fromValue(retVal.value());
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
The promiscuous mode policy of the network adapter when attached to an
internal network, host only network or a bridge.
@param value org.virtualbox_7_0.NetworkAdapterPromiscModePolicy

*/
    public void setPromiscModePolicy(org.virtualbox_7_0.NetworkAdapterPromiscModePolicy value)
    {
        try
        {
        port.iNetworkAdapterSetPromiscModePolicy(obj, org.virtualbox_7_0.jaxws.NetworkAdapterPromiscModePolicy.fromValue(value.name()));
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Flag whether network traffic from/to the network card should be traced.
Can only be toggled when the VM is turned off.
@return Boolean
*/
    public Boolean getTraceEnabled()
    {
        try
        {
            Boolean retVal = port.iNetworkAdapterGetTraceEnabled(obj);
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
Flag whether network traffic from/to the network card should be traced.
Can only be toggled when the VM is turned off.
@param value Boolean

*/
    public void setTraceEnabled(Boolean value)
    {
        try
        {
        port.iNetworkAdapterSetTraceEnabled(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Filename where a network trace will be stored. If not set, VBox-pid.pcap
will be used.
@return String
*/
    public String getTraceFile()
    {
        try
        {
            String retVal = port.iNetworkAdapterGetTraceFile(obj);
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
Filename where a network trace will be stored. If not set, VBox-pid.pcap
will be used.
@param value String

*/
    public void setTraceFile(String value)
    {
        try
        {
        port.iNetworkAdapterSetTraceFile(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Points to the NAT engine which handles the network address translation
for this interface. This is active only when the interface actually uses
NAT.
@return org.virtualbox_7_0.INATEngine
*/
    public org.virtualbox_7_0.INATEngine getNATEngine()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iNetworkAdapterGetNATEngine(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.INATEngine(retVal, getObjMgr(), port) : null;
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
Network boot priority of the adapter. Priority 1 is highest. If not set,
the priority is considered to be at the lowest possible setting.
@return Long
*/
    public Long getBootPriority()
    {
        try
        {
            Long retVal = port.iNetworkAdapterGetBootPriority(obj);
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
Network boot priority of the adapter. Priority 1 is highest. If not set,
the priority is considered to be at the lowest possible setting.
@param value Long

*/
    public void setBootPriority(Long value)
    {
        try
        {
        port.iNetworkAdapterSetBootPriority(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
The bandwidth group this network adapter is assigned to.
@return org.virtualbox_7_0.IBandwidthGroup
*/
    public org.virtualbox_7_0.IBandwidthGroup getBandwidthGroup()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iNetworkAdapterGetBandwidthGroup(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IBandwidthGroup(retVal, getObjMgr(), port) : null;
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
The bandwidth group this network adapter is assigned to.
@param value org.virtualbox_7_0.IBandwidthGroup

*/
    public void setBandwidthGroup(org.virtualbox_7_0.IBandwidthGroup value)
    {
        try
        {
        port.iNetworkAdapterSetBandwidthGroup(obj, ((value == null) ? null :value.getWrapped()));
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public static INetworkAdapter queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new INetworkAdapter(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Returns the value of the network attachment property with the given name.

If the requested data  key does not exist, this function will
succeed and return an empty string in the  value argument.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - name is  null or empty.</dd>
</dl>

@param key Name of the property to get.

@return Current property value.

*/
    public String getProperty(String key)
    {
        try
        {
            String retVal;
        retVal = port.iNetworkAdapterGetProperty(obj, key);
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
Sets the value of the network attachment property with the given name.

Setting the property value to  null or an empty string is equivalent
to deleting the existing value.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - name is  null or empty.</dd>
</dl>

@param key Name of the property to set.

@param value Property value to set.

*/
    public void setProperty(String key, String value)
    {
        try
        {
        port.iNetworkAdapterSetProperty(obj, key, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Returns values for a group of properties in one call.

The names of the properties to get are specified using the  names
argument which is a list of comma-separated property names or
an empty string if all properties are to be returned.The method returns two arrays, the array of property names corresponding
to the  names argument and the current values of these properties.
Both arrays have the same number of elements with each element at the
given index in the first array corresponds to an element at the same
index in the second array.
@param names Names of properties to get.

@param returnNames Names of returned properties.

@return Values of returned properties.

NOTE: Currently the value of this argument is ignored and the method
always returns all existing properties.

*/
    public List<String> getProperties(String names, Holder<List<String>> returnNames)
    {
        try
        {
        jakarta.xml.ws.Holder<List<String>> tmp_returnNames = new jakarta.xml.ws.Holder<List<String>>();
        jakarta.xml.ws.Holder<List<String>> retVal = new jakarta.xml.ws.Holder<List<String>>();
        port.iNetworkAdapterGetProperties(obj, names, tmp_returnNames, retVal);
        returnNames.value = tmp_returnNames.value;
           return retVal.value;
        }
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

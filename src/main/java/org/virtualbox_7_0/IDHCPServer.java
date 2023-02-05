
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
 * IDHCPServer.java
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
The IDHCPServer interface represents the VirtualBox DHCP server configuration.

To enumerate all the DHCP servers on the host, use the{@link org.virtualbox_7_0.IVirtualBox#getDHCPServers()}attribute.

Interface ID: <code>{CADEF0A2-A1A9-4AC2-8E80-C049AF69DAC8}</code>
*/
public class IDHCPServer extends IUnknown
{

    public IDHCPServer(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }
    public org.virtualbox_7_0.IEventSource getEventSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.idhcpServerGetEventSource(obj);
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
specifies if the DHCP server is enabled
@return Boolean
*/
    public Boolean getEnabled()
    {
        try
        {
            Boolean retVal = port.idhcpServerGetEnabled(obj);
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
specifies if the DHCP server is enabled
@param value Boolean

*/
    public void setEnabled(Boolean value)
    {
        try
        {
        port.idhcpServerSetEnabled(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
specifies server IP
@return String
*/
    public String getIPAddress()
    {
        try
        {
            String retVal = port.idhcpServerGetIPAddress(obj);
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
specifies server network mask
@return String
*/
    public String getNetworkMask()
    {
        try
        {
            String retVal = port.idhcpServerGetNetworkMask(obj);
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
specifies internal network name the server is used for
@return String
*/
    public String getNetworkName()
    {
        try
        {
            String retVal = port.idhcpServerGetNetworkName(obj);
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
specifies from IP address in server address range
@return String
*/
    public String getLowerIP()
    {
        try
        {
            String retVal = port.idhcpServerGetLowerIP(obj);
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
specifies to IP address in server address range
@return String
*/
    public String getUpperIP()
    {
        try
        {
            String retVal = port.idhcpServerGetUpperIP(obj);
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
Global configuration that applies to all clients.
@return org.virtualbox_7_0.IDHCPGlobalConfig
*/
    public org.virtualbox_7_0.IDHCPGlobalConfig getGlobalConfig()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.idhcpServerGetGlobalConfig(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IDHCPGlobalConfig(retVal, getObjMgr(), port) : null;
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
Configuration groups that applies to selected clients, selection is flexible.
@return List&lt;org.virtualbox_7_0.IDHCPGroupConfig&gt;
*/
    public List<org.virtualbox_7_0.IDHCPGroupConfig> getGroupConfigs()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.idhcpServerGetGroupConfigs(obj);
            return Helper.wrap(org.virtualbox_7_0.IDHCPGroupConfig.class, getObjMgr(), port, retVal);
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
Individual NIC configurations either by MAC address or VM + NIC number.
@return List&lt;org.virtualbox_7_0.IDHCPIndividualConfig&gt;
*/
    public List<org.virtualbox_7_0.IDHCPIndividualConfig> getIndividualConfigs()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.idhcpServerGetIndividualConfigs(obj);
            return Helper.wrap(org.virtualbox_7_0.IDHCPIndividualConfig.class, getObjMgr(), port, retVal);
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
    public static IDHCPServer queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IDHCPServer(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
configures the server
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - invalid configuration supplied</dd>
</dl>

@param IPAddress server IP address

@param networkMask server network mask

@param FromIPAddress server From IP address for address range

@param ToIPAddress server To IP address for address range

*/
    public void setConfiguration(String IPAddress, String networkMask, String FromIPAddress, String ToIPAddress)
    {
        try
        {
        port.idhcpServerSetConfiguration(obj, IPAddress, networkMask, FromIPAddress, ToIPAddress);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Starts DHCP server process.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_FAIL</code> - Failed to start the process.</dd>
</dl>

@param trunkName Name of internal network trunk.

@param trunkType Type of internal network trunk.

*/
    public void start(String trunkName, String trunkType)
    {
        try
        {
        port.idhcpServerStart(obj, trunkName, trunkType);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Stops DHCP server process.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_FAIL</code> - Failed to stop the process.</dd>
</dl>

*/
    public void stop()
    {
        try
        {
        port.idhcpServerStop(obj);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Restart running DHCP server process.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_FAIL</code> - Failed to restart the process.</dd>
</dl>

*/
    public void restart()
    {
        try
        {
        port.idhcpServerRestart(obj);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Queries the persistent lease database by MAC address.

This is handy if the host wants to connect to a server running inside
a VM on a host only network.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - If MAC address not in the database.</dd>
<dd><code>VBOX_E_FILE_ERROR</code> - If not able to read the lease database file.</dd>
</dl>

@param mac The MAC address to look up.

@param type Reserved, MBZ.

@param address The assigned address.

@param state The lease state.

@param issued Timestamp of when the lease was issued, in seconds since 1970-01-01 UTC.

@param expire Timestamp of when the lease expires/expired, in seconds since 1970-01-01 UTC.

*/
    public void findLeaseByMAC(String mac, Integer type, Holder<String> address, Holder<String> state, Holder<Long> issued, Holder<Long> expire)
    {
        try
        {
        javax.xml.ws.Holder<String> tmp_address = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> tmp_state = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<Long> tmp_issued = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_expire = new javax.xml.ws.Holder<Long>();
        port.idhcpServerFindLeaseByMAC(obj, mac, type, tmp_address, tmp_state, tmp_issued, tmp_expire);
        address.value = tmp_address.value;
        state.value = tmp_state.value;
        issued.value = tmp_issued.value;
        expire.value = tmp_expire.value;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Gets or adds a configuration.
@param scope The kind of configuration being sought or added.

@param name Meaning depends on the  scope:
- Ignored when the  scope is{@link org.virtualbox_7_0.DHCPConfigScope#Global}.
- A VM name or UUID for{@link org.virtualbox_7_0.DHCPConfigScope#MachineNIC}.
- A MAC address for{@link org.virtualbox_7_0.DHCPConfigScope#MAC}.
- A group name for{@link org.virtualbox_7_0.DHCPConfigScope#Group}.

@param slot The NIC slot when  scope is set to{@link org.virtualbox_7_0.DHCPConfigScope#MachineNIC},
must be zero for all other scope values.

@param mayAdd Set to  TRUE if the configuration should be added if not found.
If set to  FALSE the method will fail with VBOX_E_OBJECT_NOT_FOUND.

@return The requested configuration.

*/
    public org.virtualbox_7_0.IDHCPConfig getConfig(org.virtualbox_7_0.DHCPConfigScope scope, String name, Long slot, Boolean mayAdd)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.idhcpServerGetConfig(obj, org.virtualbox_7_0.jaxws.DHCPConfigScope.fromValue(scope.name()), name, slot, mayAdd);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IDHCPConfig(retVal, getObjMgr(), port) : null;
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

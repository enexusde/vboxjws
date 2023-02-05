
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
 * IGuest.java
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
The IGuest interface represents information about the operating system
running inside the virtual machine. Used in{@link org.virtualbox_7_0.IConsole#getGuest()}.

IGuest provides information about the guest operating system, whether
Guest Additions are installed and other OS-specific virtual machine
properties.

Interface ID: <code>{00892186-A4AF-4627-B21F-FC561CE4473C}</code>
*/
public class IGuest extends IUnknown
{

    public IGuest(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Identifier of the Guest OS type as reported by the Guest
Additions.
You may use{@link org.virtualbox_7_0.IVirtualBox#getGuestOSType(String)}to obtain
an IGuestOSType object representing details about the given
Guest OS type.
NOTE: If Guest Additions are not installed, this value will be
the same as{@link org.virtualbox_7_0.IMachine#getOSTypeId()}.

@return String
*/
    public String getOSTypeId()
    {
        try
        {
            String retVal = port.iGuestGetOSTypeId(obj);
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
Current run level of the installed Guest Additions.
@return org.virtualbox_7_0.AdditionsRunLevelType
*/
    public org.virtualbox_7_0.AdditionsRunLevelType getAdditionsRunLevel()
    {
        try
        {
            org.virtualbox_7_0.jaxws.AdditionsRunLevelType retVal = port.iGuestGetAdditionsRunLevel(obj);
            return org.virtualbox_7_0.AdditionsRunLevelType.fromValue(retVal.value());
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Version of the installed Guest Additions in the same format as{@link org.virtualbox_7_0.IVirtualBox#getVersion()}.
@return String
*/
    public String getAdditionsVersion()
    {
        try
        {
            String retVal = port.iGuestGetAdditionsVersion(obj);
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
The internal build revision number of the installed Guest Additions.

See also{@link org.virtualbox_7_0.IVirtualBox#getRevision()}.
@return Long
*/
    public Long getAdditionsRevision()
    {
        try
        {
            Long retVal = port.iGuestGetAdditionsRevision(obj);
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
Retrieves the drag'n drop source implementation for the guest side, that
is, handling and retrieving drag'n drop data from the guest.
@return org.virtualbox_7_0.IGuestDnDSource
*/
    public org.virtualbox_7_0.IGuestDnDSource getDnDSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iGuestGetDnDSource(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestDnDSource(retVal, getObjMgr(), port) : null;
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
Retrieves the drag'n drop source implementation for the host side. This
will allow the host to handle and initiate a drag'n drop operation to copy
data from the host to the guest.
@return org.virtualbox_7_0.IGuestDnDTarget
*/
    public org.virtualbox_7_0.IGuestDnDTarget getDnDTarget()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iGuestGetDnDTarget(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestDnDTarget(retVal, getObjMgr(), port) : null;
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
Event source for guest events.
@return org.virtualbox_7_0.IEventSource
*/
    public org.virtualbox_7_0.IEventSource getEventSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iGuestGetEventSource(obj);
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
Returns a collection of current known facilities. Only returns facilities where
a status is known, e.g. facilities with an unknown status will not be returned.
@return List&lt;org.virtualbox_7_0.IAdditionsFacility&gt;
*/
    public List<org.virtualbox_7_0.IAdditionsFacility> getFacilities()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<org.virtualbox_7_0.jaxws.IAdditionsFacility> retVal = port.iGuestGetFacilities(obj);
            return Helper.wrap2(org.virtualbox_7_0.IAdditionsFacility.class, org.virtualbox_7_0.jaxws.IAdditionsFacility.class, objMgr, port, retVal);
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
Returns a collection of all opened guest sessions.
@return List&lt;org.virtualbox_7_0.IGuestSession&gt;
*/
    public List<org.virtualbox_7_0.IGuestSession> getSessions()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iGuestGetSessions(obj);
            return Helper.wrap(org.virtualbox_7_0.IGuestSession.class, getObjMgr(), port, retVal);
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
Guest system memory balloon size in megabytes (transient property).
@return Long
*/
    public Long getMemoryBalloonSize()
    {
        try
        {
            Long retVal = port.iGuestGetMemoryBalloonSize(obj);
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
Guest system memory balloon size in megabytes (transient property).
@param value Long

*/
    public void setMemoryBalloonSize(Long value)
    {
        try
        {
        port.iGuestSetMemoryBalloonSize(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Interval to update guest statistics in seconds.
@return Long
*/
    public Long getStatisticsUpdateInterval()
    {
        try
        {
            Long retVal = port.iGuestGetStatisticsUpdateInterval(obj);
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
Interval to update guest statistics in seconds.
@param value Long

*/
    public void setStatisticsUpdateInterval(Long value)
    {
        try
        {
        port.iGuestSetStatisticsUpdateInterval(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public static IGuest queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IGuest(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Internal method; do not use as it might change at any time.
@param cpuUser Percentage of processor time spent in user mode as seen by the guest.

@param cpuKernel Percentage of processor time spent in kernel mode as seen by the guest.

@param cpuIdle Percentage of processor time spent idling as seen by the guest.

@param memTotal Total amount of physical guest RAM.

@param memFree Free amount of physical guest RAM.

@param memBalloon Amount of ballooned physical guest RAM.

@param memShared Amount of shared physical guest RAM.

@param memCache Total amount of guest (disk) cache memory.

@param pagedTotal Total amount of space in the page file.

@param memAllocTotal Total amount of memory allocated by the hypervisor.

@param memFreeTotal Total amount of free memory available in the hypervisor.

@param memBalloonTotal Total amount of memory ballooned by the hypervisor.

@param memSharedTotal Total amount of shared memory in the hypervisor.

*/
    public void internalGetStatistics(Holder<Long> cpuUser, Holder<Long> cpuKernel, Holder<Long> cpuIdle, Holder<Long> memTotal, Holder<Long> memFree, Holder<Long> memBalloon, Holder<Long> memShared, Holder<Long> memCache, Holder<Long> pagedTotal, Holder<Long> memAllocTotal, Holder<Long> memFreeTotal, Holder<Long> memBalloonTotal, Holder<Long> memSharedTotal)
    {
        try
        {
        javax.xml.ws.Holder<Long> tmp_cpuUser = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_cpuKernel = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_cpuIdle = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_memTotal = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_memFree = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_memBalloon = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_memShared = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_memCache = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_pagedTotal = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_memAllocTotal = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_memFreeTotal = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_memBalloonTotal = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<Long> tmp_memSharedTotal = new javax.xml.ws.Holder<Long>();
        port.iGuestInternalGetStatistics(obj, tmp_cpuUser, tmp_cpuKernel, tmp_cpuIdle, tmp_memTotal, tmp_memFree, tmp_memBalloon, tmp_memShared, tmp_memCache, tmp_pagedTotal, tmp_memAllocTotal, tmp_memFreeTotal, tmp_memBalloonTotal, tmp_memSharedTotal);
        cpuUser.value = tmp_cpuUser.value;
        cpuKernel.value = tmp_cpuKernel.value;
        cpuIdle.value = tmp_cpuIdle.value;
        memTotal.value = tmp_memTotal.value;
        memFree.value = tmp_memFree.value;
        memBalloon.value = tmp_memBalloon.value;
        memShared.value = tmp_memShared.value;
        memCache.value = tmp_memCache.value;
        pagedTotal.value = tmp_pagedTotal.value;
        memAllocTotal.value = tmp_memAllocTotal.value;
        memFreeTotal.value = tmp_memFreeTotal.value;
        memBalloonTotal.value = tmp_memBalloonTotal.value;
        memSharedTotal.value = tmp_memSharedTotal.value;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Get the current status of a Guest Additions facility.
@param facility Facility to check status for.

@param timestamp Timestamp (in ms) of last status update seen by the host.

@return The current (latest) facility status.

*/
    public org.virtualbox_7_0.AdditionsFacilityStatus getFacilityStatus(org.virtualbox_7_0.AdditionsFacilityType facility, Holder<Long> timestamp)
    {
        try
        {
        javax.xml.ws.Holder<Long> tmp_timestamp = new javax.xml.ws.Holder<Long>();
        javax.xml.ws.Holder<org.virtualbox_7_0.jaxws.AdditionsFacilityStatus> retVal = new javax.xml.ws.Holder<org.virtualbox_7_0.jaxws.AdditionsFacilityStatus>();
        port.iGuestGetFacilityStatus(obj, org.virtualbox_7_0.jaxws.AdditionsFacilityType.fromValue(facility.name()), tmp_timestamp, retVal);
        timestamp.value = tmp_timestamp.value;
           return org.virtualbox_7_0.AdditionsFacilityStatus.fromValue(retVal.value.value());
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Retrieve the current status of a certain Guest Additions run level.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Wrong status level specified.</dd>
</dl>

@param level Status level to check

@return Flag whether the status level has been reached or not

*/
    public Boolean getAdditionsStatus(org.virtualbox_7_0.AdditionsRunLevelType level)
    {
        try
        {
            Boolean retVal;
        retVal = port.iGuestGetAdditionsStatus(obj, org.virtualbox_7_0.jaxws.AdditionsRunLevelType.fromValue(level.name()));
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
Store login credentials that can be queried by guest operating
systems with Additions installed. The credentials are transient
to the session and the guest may also choose to erase them. Note
that the caller cannot determine whether the guest operating system
has queried or made use of the credentials.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_VM_ERROR</code> - VMM device is not available.</dd>
</dl>

@param userName User name string, can be empty

@param password Password string, can be empty

@param domain Domain name (guest logon scheme specific), can be empty

@param allowInteractiveLogon Flag whether the guest should alternatively allow the user to
interactively specify different credentials. This flag might
not be supported by all versions of the Additions.

*/
    public void setCredentials(String userName, String password, String domain, Boolean allowInteractiveLogon)
    {
        try
        {
        port.iGuestSetCredentials(obj, userName, password, domain, allowInteractiveLogon);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Creates a new guest session for controlling the guest. The new session
will be started asynchronously, meaning on return of this function it is
not guaranteed that the guest session is in a started and/or usable state.
To wait for successful startup, use the{@link org.virtualbox_7_0.IGuestSession#waitFor(Long,Long)}call.

A guest session represents one impersonated user account in the guest, so
every operation will use the same credentials specified when creating
the session object via{@link org.virtualbox_7_0.IGuest#createSession(String,String,String,String)}. Anonymous
sessions, that is, sessions without specifying a valid
user account in the guest are not allowed reasons of security.

There can be a maximum of 32 sessions at once per VM.  An error will
be returned if this has been reached.

For more information please consult{@link org.virtualbox_7_0.IGuestSession}
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error creating guest session.</dd>
<dd><code>VBOX_E_MAXIMUM_REACHED</code> - The maximum of concurrent guest sessions has been reached.</dd>
</dl>

@param user User name this session will be using to control the guest; has to exist
and have the appropriate rights to execute programs in the VM. Must not
be empty.

@param password Password of the user account to be used. Empty passwords are allowed.

@param domain Domain name of the user account to be used if the guest is part of
a domain. Optional. This feature is not implemented yet.

@param sessionName The session's friendly name. Optional, can be empty.

@return The newly created session object.

*/
    public org.virtualbox_7_0.IGuestSession createSession(String user, String password, String domain, String sessionName)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestCreateSession(obj, user, password, domain, sessionName);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestSession(retVal, getObjMgr(), port) : null;
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
Finds guest sessions by their friendly name and returns an interface
array with all found guest sessions.
@param sessionName The session's friendly name to find. Wildcards like ? and * are allowed.

@return Array with all guest sessions found matching the name specified.

*/
    public List<org.virtualbox_7_0.IGuestSession> findSession(String sessionName)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal;
        retVal = port.iGuestFindSession(obj, sessionName);
           return Helper.wrap(org.virtualbox_7_0.IGuestSession.class, getObjMgr(), port, retVal);
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
Shuts down (and optionally halts and/or reboots) the guest.
Needs supported Guest Additions installed.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Guest OS is not supported for shutting down, or the
already installed Guest Additions are not supported.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error while shutting down.</dd>
</dl>

@param flags {@link org.virtualbox_7_0.GuestShutdownFlag}flags.

*/
    public void shutdown(List<org.virtualbox_7_0.GuestShutdownFlag> flags)
    {
        try
        {
        port.iGuestShutdown(obj, Helper.convertEnums(org.virtualbox_7_0.GuestShutdownFlag.class, org.virtualbox_7_0.jaxws.GuestShutdownFlag.class, flags));
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Automatically updates already installed Guest Additions in a VM.

At the moment only Windows and Linux guests are supported.

Because the VirtualBox Guest Additions drivers are not WHQL-certified
yet there might be warning dialogs during the actual Guest Additions
update. These need to be confirmed manually in order to continue the
installation process. This applies to Windows 2000 and Windows XP guests
and therefore these guests can't be updated in a fully automated fashion
without user interaction. However, to start a Guest Additions update for
the mentioned Windows versions anyway, the flag
AdditionsUpdateFlag_WaitForUpdateStartOnly can be specified. See{@link org.virtualbox_7_0.AdditionsUpdateFlag}for more information.

The guest needs to be restarted in order to make use of the updated
Guest Additions.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Guest OS is not supported for automated Guest Additions updates or the
already installed Guest Additions are not ready yet.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error while updating.</dd>
</dl>

@param source Path to the Guest Additions .ISO file to use for the update.

@param arguments Optional command line arguments to use for the Guest Additions
installer. Useful for retrofitting features which weren't installed
before in the guest.

@param flags {@link org.virtualbox_7_0.AdditionsUpdateFlag}flags.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress updateGuestAdditions(String source, List<String> arguments, List<org.virtualbox_7_0.AdditionsUpdateFlag> flags)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestUpdateGuestAdditions(obj, source, arguments, Helper.convertEnums(org.virtualbox_7_0.AdditionsUpdateFlag.class, org.virtualbox_7_0.jaxws.AdditionsUpdateFlag.class, flags));
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

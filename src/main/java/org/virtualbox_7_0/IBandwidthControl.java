
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
 * IBandwidthControl.java
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
Controls the bandwidth groups of one machine used to cap I/O done by a VM.
This includes network and disk I/O.

Interface ID: <code>{48C7F4C0-C9D6-4742-957C-A6FD52E8C4AE}</code>
*/
public class IBandwidthControl extends IUnknown
{

    public IBandwidthControl(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
The current number of existing bandwidth groups managed.
@return Long
*/
    public Long getNumGroups()
    {
        try
        {
            Long retVal = port.iBandwidthControlGetNumGroups(obj);
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
    public static IBandwidthControl queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IBandwidthControl(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Creates a new bandwidth group.
@param name Name of the bandwidth group.

@param type The type of the bandwidth group (network or disk).

@param maxBytesPerSec The maximum number of bytes which can be transfered by all
entities attached to this group during one second.

*/
    public void createBandwidthGroup(String name, org.virtualbox_7_0.BandwidthGroupType type, Long maxBytesPerSec)
    {
        try
        {
        port.iBandwidthControlCreateBandwidthGroup(obj, name, org.virtualbox_7_0.jaxws.BandwidthGroupType.fromValue(type.name()), maxBytesPerSec);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Deletes a new bandwidth group.
@param name Name of the bandwidth group to delete.

*/
    public void deleteBandwidthGroup(String name)
    {
        try
        {
        port.iBandwidthControlDeleteBandwidthGroup(obj, name);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Get a bandwidth group by name.
@param name Name of the bandwidth group to get.

@return Where to store the bandwidth group on success.

*/
    public org.virtualbox_7_0.IBandwidthGroup getBandwidthGroup(String name)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iBandwidthControlGetBandwidthGroup(obj, name);
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
Get all managed bandwidth groups.
@return The array of managed bandwidth groups.

*/
    public List<org.virtualbox_7_0.IBandwidthGroup> getAllBandwidthGroups()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal;
        retVal = port.iBandwidthControlGetAllBandwidthGroups(obj);
           return Helper.wrap(org.virtualbox_7_0.IBandwidthGroup.class, getObjMgr(), port, retVal);
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

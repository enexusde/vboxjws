
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
 * ICloudProvider.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;
import java.util.List;

public class ICloudProvider extends IUnknown
{

    public ICloudProvider(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Returns the long name of the provider. Includes vendor and precise
product name spelled out in the preferred way.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iCloudProviderGetName(obj);
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
Returns the short name of the provider. Less than 8 ASCII chars,
using acronyms. No vendor name, but can contain a hint if it's a 3rd
party implementation for this cloud provider, to keep it unique.
@return String
*/
    public String getShortName()
    {
        try
        {
            String retVal = port.iCloudProviderGetShortName(obj);
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
Returns the UUID of this cloud provider.
@return String
*/
    public String getId()
    {
        try
        {
            String retVal = port.iCloudProviderGetId(obj);
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
Returns all profiles for this cloud provider.
@return List&lt;org.virtualbox_7_0.ICloudProfile&gt;
*/
    public List<org.virtualbox_7_0.ICloudProfile> getProfiles()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iCloudProviderGetProfiles(obj);
            return Helper.wrap(org.virtualbox_7_0.ICloudProfile.class, getObjMgr(), port, retVal);
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
Returns all profile names for this cloud provider.
@return List&lt;String&gt;
*/
    public List<String> getProfileNames()
    {
        try
        {
            List<String> retVal = port.iCloudProviderGetProfileNames(obj);
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
Returns the supported property names.
@return List&lt;String&gt;
*/
    public List<String> getSupportedPropertyNames()
    {
        try
        {
            List<String> retVal = port.iCloudProviderGetSupportedPropertyNames(obj);
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
    public static ICloudProvider queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new ICloudProvider(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
    public String getPropertyDescription(String name)
    {
        try
        {
            String retVal;
        retVal = port.iCloudProviderGetPropertyDescription(obj, name);
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
Creates a new profile.
@param profileName The profile name. Must not exist, otherwise an error is raised.

@param names Names of properties.

@param values Values of set properties.

*/
    public void createProfile(String profileName, List<String> names, List<String> values)
    {
        try
        {
        port.iCloudProviderCreateProfile(obj, profileName, names, values);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Import the profiles from the original source
*/
    public void importProfiles()
    {
        try
        {
        port.iCloudProviderImportProfiles(obj);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Restores the old local profiles if they exist
*/
    public void restoreProfiles()
    {
        try
        {
        port.iCloudProviderRestoreProfiles(obj);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Saves the local profiles
*/
    public void saveProfiles()
    {
        try
        {
        port.iCloudProviderSaveProfiles(obj);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
    public org.virtualbox_7_0.ICloudProfile getProfileByName(String profileName)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudProviderGetProfileByName(obj, profileName);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.ICloudProfile(retVal, getObjMgr(), port) : null;
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
The caller requests the cloud provider to cease operation. Should
return an error if this is currently not possible (due to ongoing
cloud activity, possibly by a different API client). However, this
must not wait for the completion for a larger amount of time (ideally
stays below a second of execution time). If this succeeds it should
leave the cloud provider in a state which does not allow starting new
operations.
*/
    public void prepareUninstall()
    {
        try
        {
        port.iCloudProviderPrepareUninstall(obj);
        }
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

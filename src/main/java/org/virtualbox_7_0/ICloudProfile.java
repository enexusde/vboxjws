
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
 * ICloudProfile.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;
import java.util.List;

public class ICloudProfile extends IUnknown
{

    public ICloudProfile(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Returns the profile name.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iCloudProfileGetName(obj);
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
Returns the profile name.
@param value String

*/
    public void setName(String value)
    {
        try
        {
        port.iCloudProfileSetName(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Returns provider identifier tied with this profile.
@return String
*/
    public String getProviderId()
    {
        try
        {
            String retVal = port.iCloudProfileGetProviderId(obj);
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
    public static ICloudProfile queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new ICloudProfile(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Returns the value of the cloud profile property with the given name.

If the requested data  name does not exist, this function will
succeed and return an empty string in the  value argument.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - name is  null or empty.</dd>
</dl>

@param name Name of the property to get.

@return Current property value.

*/
    public String getProperty(String name)
    {
        try
        {
            String retVal;
        retVal = port.iCloudProfileGetProperty(obj, name);
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
Sets the value of the cloud profile property with the given name.

Setting the property value to  null or an empty string is equivalent
to deleting the existing value.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - name is  null or empty.</dd>
</dl>

@param name Name of the property to set.

@param value Property value to set.

*/
    public void setProperty(String name, String value)
    {
        try
        {
        port.iCloudProfileSetProperty(obj, name, value);
        }
        catch (InvalidObjectFaultMsg e)
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
        javax.xml.ws.Holder<List<String>> tmp_returnNames = new javax.xml.ws.Holder<List<String>>();
        javax.xml.ws.Holder<List<String>> retVal = new javax.xml.ws.Holder<List<String>>();
        port.iCloudProfileGetProperties(obj, names, tmp_returnNames, retVal);
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

/**
Updates profile, changing/adding/removing properties.

The names of the properties to set are passed in the  names
array along with the new values for them in the  values array. Both
arrays have the same number of elements with each element at the given
index in the first array corresponding to an element at the same index
in the second array.

If there is at least one property name in  names that is not valid,
the method will fail before changing the values of any other properties
from the  names array.

Using this method over{@link #setProperty(String,String)}is preferred if you
need to set several properties at once since it is more efficient.

Setting the property value to  null or an empty string is equivalent
to deleting the existing value.
@param names Names of properties.

@param values Values of set properties.

*/
    public void setProperties(List<String> names, List<String> values)
    {
        try
        {
        port.iCloudProfileSetProperties(obj, names, values);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Deletes a profile.
*/
    public void remove()
    {
        try
        {
        port.iCloudProfileRemove(obj);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Creates a cloud client for this cloud profile.
@return The cloud client object reference.

*/
    public org.virtualbox_7_0.ICloudClient createCloudClient()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iCloudProfileCreateCloudClient(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.ICloudClient(retVal, getObjMgr(), port) : null;
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

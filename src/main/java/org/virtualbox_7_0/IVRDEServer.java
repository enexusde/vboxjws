
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
 * IVRDEServer.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;
import java.util.List;

public class IVRDEServer extends IUnknown
{

    public IVRDEServer(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Flag if VRDE server is enabled.
@return Boolean
*/
    public Boolean getEnabled()
    {
        try
        {
            Boolean retVal = port.ivrdeServerGetEnabled(obj);
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
Flag if VRDE server is enabled.
@param value Boolean

*/
    public void setEnabled(Boolean value)
    {
        try
        {
        port.ivrdeServerSetEnabled(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
VRDE authentication method.
@return org.virtualbox_7_0.AuthType
*/
    public org.virtualbox_7_0.AuthType getAuthType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.AuthType retVal = port.ivrdeServerGetAuthType(obj);
            return org.virtualbox_7_0.AuthType.fromValue(retVal.value());
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
VRDE authentication method.
@param value org.virtualbox_7_0.AuthType

*/
    public void setAuthType(org.virtualbox_7_0.AuthType value)
    {
        try
        {
        port.ivrdeServerSetAuthType(obj, org.virtualbox_7_0.jaxws.AuthType.fromValue(value.name()));
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Timeout for guest authentication. Milliseconds.
@return Long
*/
    public Long getAuthTimeout()
    {
        try
        {
            Long retVal = port.ivrdeServerGetAuthTimeout(obj);
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
Timeout for guest authentication. Milliseconds.
@param value Long

*/
    public void setAuthTimeout(Long value)
    {
        try
        {
        port.ivrdeServerSetAuthTimeout(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Flag whether multiple simultaneous connections to the VM are permitted.
Note that this will be replaced by a more powerful mechanism in the future.
@return Boolean
*/
    public Boolean getAllowMultiConnection()
    {
        try
        {
            Boolean retVal = port.ivrdeServerGetAllowMultiConnection(obj);
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
Flag whether multiple simultaneous connections to the VM are permitted.
Note that this will be replaced by a more powerful mechanism in the future.
@param value Boolean

*/
    public void setAllowMultiConnection(Boolean value)
    {
        try
        {
        port.ivrdeServerSetAllowMultiConnection(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Flag whether the existing connection must be dropped and a new connection
must be established by the VRDE server, when a new client connects in single
connection mode.
@return Boolean
*/
    public Boolean getReuseSingleConnection()
    {
        try
        {
            Boolean retVal = port.ivrdeServerGetReuseSingleConnection(obj);
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
Flag whether the existing connection must be dropped and a new connection
must be established by the VRDE server, when a new client connects in single
connection mode.
@param value Boolean

*/
    public void setReuseSingleConnection(Boolean value)
    {
        try
        {
        port.ivrdeServerSetReuseSingleConnection(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
The name of Extension Pack providing VRDE for this VM. Overrides{@link org.virtualbox_7_0.ISystemProperties#getDefaultVRDEExtPack()}.
@return String
*/
    public String getVRDEExtPack()
    {
        try
        {
            String retVal = port.ivrdeServerGetVRDEExtPack(obj);
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
The name of Extension Pack providing VRDE for this VM. Overrides{@link org.virtualbox_7_0.ISystemProperties#getDefaultVRDEExtPack()}.
@param value String

*/
    public void setVRDEExtPack(String value)
    {
        try
        {
        port.ivrdeServerSetVRDEExtPack(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Library used for authentication of RDP clients by this VM. Overrides{@link org.virtualbox_7_0.ISystemProperties#getVRDEAuthLibrary()}.
@return String
*/
    public String getAuthLibrary()
    {
        try
        {
            String retVal = port.ivrdeServerGetAuthLibrary(obj);
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
Library used for authentication of RDP clients by this VM. Overrides{@link org.virtualbox_7_0.ISystemProperties#getVRDEAuthLibrary()}.
@param value String

*/
    public void setAuthLibrary(String value)
    {
        try
        {
        port.ivrdeServerSetAuthLibrary(obj, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Array of names of properties, which are supported by this VRDE server.
@return List&lt;String&gt;
*/
    public List<String> getVRDEProperties()
    {
        try
        {
            List<String> retVal = port.ivrdeServerGetVRDEProperties(obj);
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
    public static IVRDEServer queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IVRDEServer(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Sets a VRDE specific property string.

If you pass  null or empty string as a key  value, the given  key
will be deleted.
@param key Name of the key to set.

@param value Value to assign to the key.

*/
    public void setVRDEProperty(String key, String value)
    {
        try
        {
        port.ivrdeServerSetVRDEProperty(obj, key, value);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Returns a VRDE specific property string.

If the requested data  key does not exist, this function will
succeed and return an empty string in the  value argument.
@param key Name of the key to get.

@return Value of the requested key.

*/
    public String getVRDEProperty(String key)
    {
        try
        {
            String retVal;
        retVal = port.ivrdeServerGetVRDEProperty(obj, key);
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
}

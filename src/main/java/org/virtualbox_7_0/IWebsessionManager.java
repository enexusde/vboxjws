
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
 * IWebsessionManager.java
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
Websession manager. This provides essential services
to webservice clients.

Interface ID: <code>{930C8FEA-453A-4A65-ACA9-19ED9A872F88}</code>
*/
public class IWebsessionManager extends IUnknown
{

    public IWebsessionManager(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }
    public static IWebsessionManager queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IWebsessionManager(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Logs a new client onto the webservice and returns a managed object reference to
the IVirtualBox instance, which the client can then use as a basis to further
queries, since all calls to the VirtualBox API are based on the IVirtualBox
interface, in one way or the other.
*/
    public org.virtualbox_7_0.IVirtualBox logon(String username, String password)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iWebsessionManagerLogon(username, password);
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
Returns a managed object reference to a new ISession object for every
call to this method.
@see org.virtualbox_7_0.ISession

*/
    public org.virtualbox_7_0.ISession getSessionObject(org.virtualbox_7_0.IVirtualBox refIVirtualBox)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iWebsessionManagerGetSessionObject(((refIVirtualBox == null) ? null :refIVirtualBox.getWrapped()));
           return (retVal.length() > 0) ? new org.virtualbox_7_0.ISession(retVal, getObjMgr(), port) : null;
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
Logs off the client who has previously logged on with{@link org.virtualbox_7_0.IWebsessionManager#logon(String,String)}and destroys all resources associated with the websession (most
importantly, all managed objects created in the server while the
websession was active).
*/
    public void logoff(org.virtualbox_7_0.IVirtualBox refIVirtualBox)
    {
        try
        {
        port.iWebsessionManagerLogoff(((refIVirtualBox == null) ? null :refIVirtualBox.getWrapped()));
        }
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

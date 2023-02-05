
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
 * IManagedObjectRef.java
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
Managed object reference.

Only within the webservice, a managed object reference (which is really
an opaque number) allows a webservice client to address an object
that lives in the address space of the webservice server.

Behind each managed object reference, there is a COM object that lives
in the webservice server's address space. The COM object is not freed
until the managed object reference is released, either by an explicit
call to{@link org.virtualbox_7_0.IManagedObjectRef#release()}or by logging off from
the webservice ({@link org.virtualbox_7_0.IWebsessionManager#logoff(org.virtualbox_7_0.IVirtualBox)}), which releases
all objects created during the webservice session.

Whenever a method call of the VirtualBox API returns a COM object, the
webservice representation of that method will instead return a
managed object reference, which can then be used to invoke methods
on that object.

Interface ID: <code>{9474D09D-2313-46DE-B568-A42B8718E8ED}</code>
*/
public class IManagedObjectRef extends IUnknown
{

    public IManagedObjectRef(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }
    public static IManagedObjectRef queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IManagedObjectRef(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Returns the name of the interface that this managed object represents,
for example, "IMachine", as a string.
*/
    public String getInterfaceName()
    {
        try
        {
            String retVal;
        retVal = port.iManagedObjectRefGetInterfaceName(obj);
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
Releases this managed object reference and frees the resources that
were allocated for it in the webservice server process. After calling
this method, the identifier of the reference can no longer be used.
*/
    public void release()
    {
        try
        {
        port.iManagedObjectRefRelease(obj);
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


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
 * IToken.java
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
The IToken interface represents a token passed to an API client, which
triggers cleanup actions when it is explicitly released by calling the{@link #abandon()}method (preferred, as it is accurately defined
when the release happens), or when the object reference count drops
to 0. The latter way is implicitly used when an API client crashes,
however the discovery that there was a crash can take rather long,
depending on the platform (COM needs 6 minutes). So better don't rely
on the crash behavior too much.

Interface ID: <code>{20479EAF-D8ED-44CF-85AC-C83A26C95A4D}</code>
*/
public class IToken extends IUnknown
{

    public IToken(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }
    public static IToken queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IToken(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Releases this token. Cannot be undone in any way, and makes the
token object unusable (even the{@link #dummy()}method will return
an error), ready for releasing. It is a more defined way than just
letting the reference count drop to 0, because the latter (depending
on the platform) can trigger asynchronous cleanup activity.
*/
    public void abandon()
    {
        try
        {
        port.iTokenAbandon(obj);
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
Purely a NOOP. Useful when using proxy type API bindings (e.g. the
webservice) which manage objects on behalf of the actual client, using
an object reference expiration time based garbage collector.
*/
    public void dummy()
    {
        try
        {
        port.iTokenDummy(obj);
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

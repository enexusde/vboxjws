
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
 * INetworkAdapterChangedEvent.java
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
Notification when a property of one of the
virtual{@link org.virtualbox_7_0.IMachine#getNetworkAdapter(Long)}changes. Interested callees should use INetworkAdapter methods and
attributes to find out what has changed.

Interface ID: <code>{08889892-1EC6-4883-801D-77F56CFD0103}</code>
*/
public class INetworkAdapterChangedEvent extends IEvent
{

    public INetworkAdapterChangedEvent(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Network adapter that is subject to change.
@return org.virtualbox_7_0.INetworkAdapter
*/
    public org.virtualbox_7_0.INetworkAdapter getNetworkAdapter()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iNetworkAdapterChangedEventGetNetworkAdapter(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.INetworkAdapter(retVal, getObjMgr(), port) : null;
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
    public static INetworkAdapterChangedEvent queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new INetworkAdapterChangedEvent(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

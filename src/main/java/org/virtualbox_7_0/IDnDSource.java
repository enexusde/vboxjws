
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
 * IDnDSource.java
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
Abstract interface for handling drag'n drop sources.

Interface ID: <code>{D23A9CA3-42DA-C94B-8AEC-21968E08355D}</code>
*/
public class IDnDSource extends IDnDBase
{

    public IDnDSource(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }
    public static IDnDSource queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IDnDSource(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Ask the source if there is any drag and drop operation pending.
If no drag and drop operation is pending currently, DnDAction_Ignore is returned.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_VM_ERROR</code> - VMM device is not available.</dd>
</dl>

@param screenId The screen ID where the drag and drop event occurred.

@param formats On return the supported mime types.

@param allowedActions On return the actions which are allowed.

@return On return the default action to use.

*/
    public org.virtualbox_7_0.DnDAction dragIsPending(Long screenId, Holder<List<String>> formats, Holder<List<org.virtualbox_7_0.DnDAction>> allowedActions)
    {
        try
        {
        javax.xml.ws.Holder<List<String>> tmp_formats = new javax.xml.ws.Holder<List<String>>();
        javax.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.DnDAction>> tmp_allowedActions = new javax.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.DnDAction>>();
        javax.xml.ws.Holder<org.virtualbox_7_0.jaxws.DnDAction> retVal = new javax.xml.ws.Holder<org.virtualbox_7_0.jaxws.DnDAction>();
        port.iDnDSourceDragIsPending(obj, screenId, tmp_formats, tmp_allowedActions, retVal);
        formats.value = tmp_formats.value;
        allowedActions.value = Helper.convertEnums(org.virtualbox_7_0.jaxws.DnDAction.class, org.virtualbox_7_0.DnDAction.class, tmp_allowedActions.value);
           return org.virtualbox_7_0.DnDAction.fromValue(retVal.value.value());
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
Informs the source that a drop event occurred for a pending
drag and drop operation.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_VM_ERROR</code> - VMM device is not available.</dd>
</dl>

@param format The mime type the data must be in.

@param action The action to use.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress drop(String format, org.virtualbox_7_0.DnDAction action)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iDnDSourceDrop(obj, format, org.virtualbox_7_0.jaxws.DnDAction.fromValue(action.name()));
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

/**
Receive the data of a previously drag and drop event from the source.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_VM_ERROR</code> - VMM device is not available.</dd>
</dl>

@return The actual data.

*/
    public byte[] receiveData()
    {
        try
        {
            /*base64*/String retVal;
        retVal = port.iDnDSourceReceiveData(obj);
           return Helper.decodeBase64(retVal);
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

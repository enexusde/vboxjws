
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
 * IDnDTarget.java
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
Abstract interface for handling drag'n drop targets.

Interface ID: <code>{FF5BEFC3-4BA3-7903-2AA4-43988BA11554}</code>
*/
public class IDnDTarget extends IDnDBase
{

    public IDnDTarget(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }
    public static IDnDTarget queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IDnDTarget(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Informs the target about a drag and drop enter event.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_VM_ERROR</code> - VMM device is not available.</dd>
</dl>

@param screenId The screen ID where the drag and drop event occurred.

@param y Y-position of the event.

@param x X-position of the event.

@param defaultAction The default action to use.

@param allowedActions The actions which are allowed.

@param formats The supported MIME types.

@return The resulting action of this event.

*/
    public org.virtualbox_7_0.DnDAction enter(Long screenId, Long y, Long x, org.virtualbox_7_0.DnDAction defaultAction, List<org.virtualbox_7_0.DnDAction> allowedActions, List<String> formats)
    {
        try
        {
            org.virtualbox_7_0.jaxws.DnDAction retVal;
        retVal = port.iDnDTargetEnter(obj, screenId, y, x, org.virtualbox_7_0.jaxws.DnDAction.fromValue(defaultAction.name()), Helper.convertEnums(org.virtualbox_7_0.DnDAction.class, org.virtualbox_7_0.jaxws.DnDAction.class, allowedActions), formats);
           return org.virtualbox_7_0.DnDAction.fromValue(retVal.value());
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
Informs the target about a drag and drop move event.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_VM_ERROR</code> - VMM device is not available.</dd>
</dl>

@param screenId The screen ID where the drag and drop event occurred.

@param x X-position of the event.

@param y Y-position of the event.

@param defaultAction The default action to use.

@param allowedActions The actions which are allowed.

@param formats The supported MIME types.

@return The resulting action of this event.

*/
    public org.virtualbox_7_0.DnDAction move(Long screenId, Long x, Long y, org.virtualbox_7_0.DnDAction defaultAction, List<org.virtualbox_7_0.DnDAction> allowedActions, List<String> formats)
    {
        try
        {
            org.virtualbox_7_0.jaxws.DnDAction retVal;
        retVal = port.iDnDTargetMove(obj, screenId, x, y, org.virtualbox_7_0.jaxws.DnDAction.fromValue(defaultAction.name()), Helper.convertEnums(org.virtualbox_7_0.DnDAction.class, org.virtualbox_7_0.jaxws.DnDAction.class, allowedActions), formats);
           return org.virtualbox_7_0.DnDAction.fromValue(retVal.value());
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
Informs the target about a drag and drop leave event.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_VM_ERROR</code> - VMM device is not available.</dd>
</dl>

@param screenId The screen ID where the drag and drop event occurred.

*/
    public void leave(Long screenId)
    {
        try
        {
        port.iDnDTargetLeave(obj, screenId);
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
Informs the target about a drop event.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_VM_ERROR</code> - VMM device is not available.</dd>
</dl>

@param screenId The screen ID where the Drag and Drop event occurred.

@param x X-position of the event.

@param y Y-position of the event.

@param defaultAction The default action to use.

@param allowedActions The actions which are allowed.

@param formats The supported MIME types.

@param format The resulting format of this event.

@return The resulting action of this event.

*/
    public org.virtualbox_7_0.DnDAction drop(Long screenId, Long x, Long y, org.virtualbox_7_0.DnDAction defaultAction, List<org.virtualbox_7_0.DnDAction> allowedActions, List<String> formats, Holder<String> format)
    {
        try
        {
        jakarta.xml.ws.Holder<String> tmp_format = new jakarta.xml.ws.Holder<String>();
        jakarta.xml.ws.Holder<org.virtualbox_7_0.jaxws.DnDAction> retVal = new jakarta.xml.ws.Holder<org.virtualbox_7_0.jaxws.DnDAction>();
        port.iDnDTargetDrop(obj, screenId, x, y, org.virtualbox_7_0.jaxws.DnDAction.fromValue(defaultAction.name()), Helper.convertEnums(org.virtualbox_7_0.DnDAction.class, org.virtualbox_7_0.jaxws.DnDAction.class, allowedActions), formats, tmp_format, retVal);
        format.value = tmp_format.value;
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
Initiates sending data to the target.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_VM_ERROR</code> - VMM device is not available.</dd>
</dl>

@param screenId The screen ID where the drag and drop event occurred.

@param format The MIME type the data is in.

@param data The actual data.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress sendData(Long screenId, String format, byte[] data)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iDnDTargetSendData(obj, screenId, format, Helper.encodeBase64(data));
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
Requests cancelling the current operation. The target can veto
the request in case the operation is not cancelable at the moment.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_VM_ERROR</code> - VMM device is not available.</dd>
</dl>

@return Whether the target has vetoed cancelling the operation.

*/
    public Boolean cancel()
    {
        try
        {
            Boolean retVal;
        retVal = port.iDnDTargetCancel(obj);
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

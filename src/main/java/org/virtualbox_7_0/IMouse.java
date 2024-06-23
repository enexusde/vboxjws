
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
 * IMouse.java
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
The IMouse interface represents the virtual machine's mouse. Used in{@link org.virtualbox_7_0.IConsole#getMouse()}.

Through this interface, the virtual machine's virtual mouse can be
controlled.

Interface ID: <code>{25360A74-55E5-4F14-AC2A-F5CF8E62E4AF}</code>
*/
public class IMouse extends IUnknown
{

    public IMouse(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Whether the guest OS supports absolute mouse pointer positioning
or not.
NOTE: You can use the{@link org.virtualbox_7_0.IMouseCapabilityChangedEvent}event to be instantly informed about changes of this attribute
during virtual machine execution.

@return Boolean

@see #putMouseEventAbsolute(Integer,Integer,Integer,Integer,Integer)
*/
    public Boolean getAbsoluteSupported()
    {
        try
        {
            Boolean retVal = port.iMouseGetAbsoluteSupported(obj);
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
Whether the guest OS supports relative mouse pointer positioning
or not.
NOTE: You can use the{@link org.virtualbox_7_0.IMouseCapabilityChangedEvent}event to be instantly informed about changes of this attribute
during virtual machine execution.

@return Boolean

@see #putMouseEvent(Integer,Integer,Integer,Integer,Integer)
*/
    public Boolean getRelativeSupported()
    {
        try
        {
            Boolean retVal = port.iMouseGetRelativeSupported(obj);
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
Whether the guest OS has enabled the multi-touch reporting device,
touchscreen variant.
NOTE: You can use the{@link org.virtualbox_7_0.IMouseCapabilityChangedEvent}event to be instantly informed about changes of this attribute
during virtual machine execution.

@return Boolean

@see #putMouseEvent(Integer,Integer,Integer,Integer,Integer)
*/
    public Boolean getTouchScreenSupported()
    {
        try
        {
            Boolean retVal = port.iMouseGetTouchScreenSupported(obj);
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
Whether the guest OS has enabled the multi-touch reporting device,
touchpad variant.
NOTE: You can use the{@link org.virtualbox_7_0.IMouseCapabilityChangedEvent}event to be instantly informed about changes of this attribute
during virtual machine execution.

@return Boolean

@see #putMouseEvent(Integer,Integer,Integer,Integer,Integer)
*/
    public Boolean getTouchPadSupported()
    {
        try
        {
            Boolean retVal = port.iMouseGetTouchPadSupported(obj);
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
Whether the guest OS can currently switch to drawing it's own mouse
cursor on demand.
NOTE: You can use the{@link org.virtualbox_7_0.IMouseCapabilityChangedEvent}event to be instantly informed about changes of this attribute
during virtual machine execution.

@return Boolean

@see #putMouseEvent(Integer,Integer,Integer,Integer,Integer)
*/
    public Boolean getNeedsHostCursor()
    {
        try
        {
            Boolean retVal = port.iMouseGetNeedsHostCursor(obj);
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
The current mouse pointer used by the guest.
@return org.virtualbox_7_0.IMousePointerShape
*/
    public org.virtualbox_7_0.IMousePointerShape getPointerShape()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMouseGetPointerShape(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IMousePointerShape(retVal, getObjMgr(), port) : null;
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
Event source for mouse events.
@return org.virtualbox_7_0.IEventSource
*/
    public org.virtualbox_7_0.IEventSource getEventSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMouseGetEventSource(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IEventSource(retVal, getObjMgr(), port) : null;
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
    public static IMouse queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IMouse(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Initiates a mouse event using relative pointer movements
along x and y axis.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_ACCESSDENIED</code> - Console not powered up.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - Could not send mouse event to virtual mouse.</dd>
</dl>

@param dx Amount of pixels the mouse should move to the right.
Negative values move the mouse to the left.

@param dy Amount of pixels the mouse should move downwards.
Negative values move the mouse upwards.

@param dz Amount of mouse wheel moves.
Positive values describe clockwise wheel rotations,
negative values describe counterclockwise rotations.

@param dw Amount of horizontal mouse wheel moves.
Positive values describe a movement to the left,
negative values describe a movement to the right.

@param buttonState The current state of mouse buttons. Every bit represents
a mouse button as follows:<dl><dt>Bit 0 (<code>0x01</code>)</dt><dd>left mouse button</dd><dt>Bit 1 (<code>0x02</code>)</dt><dd>right mouse button</dd><dt>Bit 2 (<code>0x04</code>)</dt><dd>middle mouse button</dd></dl>A value of  1 means the corresponding button is pressed.
otherwise it is released.

*/
    public void putMouseEvent(Integer dx, Integer dy, Integer dz, Integer dw, Integer buttonState)
    {
        try
        {
        port.iMousePutMouseEvent(obj, dx, dy, dz, dw, buttonState);
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
Positions the mouse pointer using absolute x and y coordinates.
These coordinates are expressed in pixels and
start from<code>[1,1]</code>which corresponds to the top left
corner of the virtual display.  The values<code>[-1,-1]</code>and<code>[0x7fffffff,0x7fffffff]</code>have special meanings as
respectively "no data" (to signal that the host wishes to report
absolute pointer data in future) and "out of range" (the host
pointer is outside of all guest windows).
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_ACCESSDENIED</code> - Console not powered up.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - Could not send mouse event to virtual mouse.</dd>
</dl>

@param x X coordinate of the pointer in pixels, starting from  1.

@param y Y coordinate of the pointer in pixels, starting from  1.

@param dz Amount of mouse wheel moves.
Positive values describe clockwise wheel rotations,
negative values describe counterclockwise rotations.

@param dw Amount of horizontal mouse wheel moves.
Positive values describe a movement to the left,
negative values describe a movement to the right.

@param buttonState The current state of mouse buttons. Every bit represents
a mouse button as follows:<dl><dt>Bit 0 (<code>0x01</code>)</dt><dd>left mouse button</dd><dt>Bit 1 (<code>0x02</code>)</dt><dd>right mouse button</dd><dt>Bit 2 (<code>0x04</code>)</dt><dd>middle mouse button</dd></dl>A value of  1 means the corresponding button is pressed.
otherwise it is released.

NOTE: This method will have effect only if absolute mouse
positioning is supported by the guest OS.

@see #getAbsoluteSupported()

*/
    public void putMouseEventAbsolute(Integer x, Integer y, Integer dz, Integer dw, Integer buttonState)
    {
        try
        {
        port.iMousePutMouseEventAbsolute(obj, x, y, dz, dw, buttonState);
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
Sends a multi-touch pointer event. For touchscreen events the
coordinates are expressed in pixels and start from<code>[1,1]</code>which
corresponds to the top left corner of the virtual display, for
touchpad events the coordinates are normalized to the range 0..0xffff.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_ACCESSDENIED</code> - Console not powered up.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - Could not send event to virtual device.</dd>
</dl>

@param count Number of contacts in the event.

@param contacts Each array element contains packed information about one contact.
Bits 0..15: X coordinate in pixels or normalized X position.
Bits 16..31: Y coordinate in pixels or normalized Y position.
Bits 32..39: contact identifier.
Bit 40: "in contact" flag, which indicates that there is a contact with the touch surface.
Bit 41: "in range" flag, the contact is close enough to the touch surface.
All other bits are reserved for future use and must be set to 0.

@param isTouchScreen Distinguishes between touchscreen and touchpad events.

@param scanTime Timestamp of the event in milliseconds. Only relative time between events is important.

NOTE: The guest may not understand or may choose to ignore this event.

@see #getTouchScreenSupported()
@see #getTouchPadSupported()

*/
    public void putEventMultiTouch(Integer count, List<Long> contacts, Boolean isTouchScreen, Long scanTime)
    {
        try
        {
        port.iMousePutEventMultiTouch(obj, count, contacts, isTouchScreen, scanTime);
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

@param contacts Contains information about all contacts:
"id1,x1,y1,inContact1,inRange1;...;idN,xN,yN,inContactN,inRangeN".
For example for two contacts: "0,10,20,1,1;1,30,40,1,1"

@param isTouchScreen Distinguishes between touchscreen and touchpad events.

@see #putEventMultiTouch(Integer,List,Boolean,Long)

*/
    public void putEventMultiTouchString(Integer count, String contacts, Boolean isTouchScreen, Long scanTime)
    {
        try
        {
        port.iMousePutEventMultiTouchString(obj, count, contacts, isTouchScreen, scanTime);
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

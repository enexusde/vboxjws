
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
 * IFramebuffer.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;
import java.util.List;

public class IFramebuffer extends IUnknown
{

    public IFramebuffer(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Frame buffer width, in pixels.
@return Long
*/
    public Long getWidth()
    {
        try
        {
            Long retVal = port.iFramebufferGetWidth(obj);
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
Frame buffer height, in pixels.
@return Long
*/
    public Long getHeight()
    {
        try
        {
            Long retVal = port.iFramebufferGetHeight(obj);
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
Color depth, in bits per pixel.
@return Long
*/
    public Long getBitsPerPixel()
    {
        try
        {
            Long retVal = port.iFramebufferGetBitsPerPixel(obj);
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
Scan line size, in bytes.
@return Long
*/
    public Long getBytesPerLine()
    {
        try
        {
            Long retVal = port.iFramebufferGetBytesPerLine(obj);
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
Frame buffer pixel format. It's one of the values defined by{@link org.virtualbox_7_0.BitmapFormat}.
NOTE: This attribute must never (and will never) return{@link org.virtualbox_7_0.BitmapFormat#Opaque}-- the format of the frame
buffer must be always known.

@return org.virtualbox_7_0.BitmapFormat
*/
    public org.virtualbox_7_0.BitmapFormat getPixelFormat()
    {
        try
        {
            org.virtualbox_7_0.jaxws.BitmapFormat retVal = port.iFramebufferGetPixelFormat(obj);
            return org.virtualbox_7_0.BitmapFormat.fromValue(retVal.value());
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
Hint from the frame buffer about how much of the standard
screen height it wants to use for itself. This information is
exposed to the guest through the VESA BIOS and VMMDev interface
so that it can use it for determining its video mode table. It
is not guaranteed that the guest respects the value.
@return Long
*/
    public Long getHeightReduction()
    {
        try
        {
            Long retVal = port.iFramebufferGetHeightReduction(obj);
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
An alpha-blended overlay which is superposed over the frame buffer.
The initial purpose is to allow the display of icons providing
information about the VM state, including disk activity, in front
ends which do not have other means of doing that. The overlay is
designed to controlled exclusively by IDisplay. It has no locking
of its own, and any changes made to it are not guaranteed to be
visible until the affected portion of IFramebuffer is updated. The
overlay can be created lazily the first time it is requested. This
attribute can also return  null to signal that the overlay is not
implemented.
@return org.virtualbox_7_0.IFramebufferOverlay
*/
    public org.virtualbox_7_0.IFramebufferOverlay getOverlay()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iFramebufferGetOverlay(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IFramebufferOverlay(retVal, getObjMgr(), port) : null;
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
    // Skipping attribute winId for it is suppressed

/**
Capabilities of the framebuffer instance.

For the meaning of individual capability flags see{@link org.virtualbox_7_0.FramebufferCapabilities}.
@return List&lt;org.virtualbox_7_0.FramebufferCapabilities&gt;
*/
    public List<org.virtualbox_7_0.FramebufferCapabilities> getCapabilities()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.FramebufferCapabilities> retVal = port.iFramebufferGetCapabilities(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.FramebufferCapabilities.class, org.virtualbox_7_0.FramebufferCapabilities.class, retVal);
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
    public static IFramebuffer queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IFramebuffer(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Informs about an update.
Gets called by the display object where this buffer is
registered.
@param x X position of update.

@param y Y position of update.

@param width Width of update.

@param height Height of update.

*/
    public void notifyUpdate(Long x, Long y, Long width, Long height)
    {
        try
        {
        port.iFramebufferNotifyUpdate(obj, x, y, width, height);
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
Informs about an update and provides 32bpp bitmap.
@param x X position of update.

@param y Y position of update.

@param width Width of update.

@param height Height of update.

@param image Array with 32BPP image data.

*/
    public void notifyUpdateImage(Long x, Long y, Long width, Long height, byte[] image)
    {
        try
        {
        port.iFramebufferNotifyUpdateImage(obj, x, y, width, height, Helper.encodeBase64(image));
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
Requests a size change.
@param screenId Logical guest screen number.

@param xOrigin Location of the screen in the guest.

@param yOrigin Location of the screen in the guest.

@param width Width of the guest display, in pixels.

@param height Height of the guest display, in pixels.

*/
    public void notifyChange(Long screenId, Long xOrigin, Long yOrigin, Long width, Long height)
    {
        try
        {
        port.iFramebufferNotifyChange(obj, screenId, xOrigin, yOrigin, width, height);
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
Returns whether the frame buffer implementation is willing to
support a given video mode. In case it is not able to render
the video mode (or for some reason not willing), it should
return  false. Usually this method is called when the guest
asks the VMM device whether a given video mode is supported
so the information returned is directly exposed to the guest.
It is important that this method returns very quickly.
*/
    public Boolean videoModeSupported(Long width, Long height, Long bpp)
    {
        try
        {
            Boolean retVal;
        retVal = port.iFramebufferVideoModeSupported(obj, width, height, bpp);
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
    // Skipping method getVisibleRegion for it has parameters with suppressed types
    // Skipping method setVisibleRegion for it has parameters with suppressed types
    // Skipping method processVHWACommand for it has parameters with suppressed types

/**
Notifies framebuffer about 3D backend event.
@param type event type. VBOX3D_NOTIFY_TYPE_* in VBoxVideo3D.h

@param data event-specific data, depends on the supplied event type

*/
    public void notify3DEvent(Long type, byte[] data)
    {
        try
        {
        port.iFramebufferNotify3DEvent(obj, type, Helper.encodeBase64(data));
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

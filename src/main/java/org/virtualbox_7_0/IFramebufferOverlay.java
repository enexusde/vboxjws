
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
 * IFramebufferOverlay.java
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
The IFramebufferOverlay interface represents an alpha blended overlay
for displaying status icons above an IFramebuffer. It is always created
not visible, so that it must be explicitly shown. It only covers a
portion of the IFramebuffer, determined by its width, height and
co-ordinates. It is always in packed pixel little-endian 32bit ARGB (in
that order) format, and may be written to directly. Do re-read the
width though, after setting it, as it may be adjusted (increased) to
make it more suitable for the front end.

Interface ID: <code>{AF398A9A-6B76-4805-8FAB-00A9DCF4732B}</code>
*/
public class IFramebufferOverlay extends IFramebuffer
{

    public IFramebufferOverlay(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
X position of the overlay, relative to the frame buffer.
@return Long
*/
    public Long getX()
    {
        try
        {
            Long retVal = port.iFramebufferOverlayGetX(obj);
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
Y position of the overlay, relative to the frame buffer.
@return Long
*/
    public Long getY()
    {
        try
        {
            Long retVal = port.iFramebufferOverlayGetY(obj);
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
Whether the overlay is currently visible.
@return Boolean
*/
    public Boolean getVisible()
    {
        try
        {
            Boolean retVal = port.iFramebufferOverlayGetVisible(obj);
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
Whether the overlay is currently visible.
@param value Boolean

*/
    public void setVisible(Boolean value)
    {
        try
        {
        port.iFramebufferOverlaySetVisible(obj, value);
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
The global alpha value for the overlay. This may or may not be
supported by a given front end.
@return Long
*/
    public Long getAlpha()
    {
        try
        {
            Long retVal = port.iFramebufferOverlayGetAlpha(obj);
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
The global alpha value for the overlay. This may or may not be
supported by a given front end.
@param value Long

*/
    public void setAlpha(Long value)
    {
        try
        {
        port.iFramebufferOverlaySetAlpha(obj, value);
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
    public static IFramebufferOverlay queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IFramebufferOverlay(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Changes the overlay's position relative to the IFramebuffer.
*/
    public void move(Long x, Long y)
    {
        try
        {
        port.iFramebufferOverlayMove(obj, x, y);
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

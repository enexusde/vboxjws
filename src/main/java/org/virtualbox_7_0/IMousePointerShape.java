
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
 * IMousePointerShape.java
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
The guest mouse pointer description.

Interface ID: <code>{1E775EA3-9070-4F9C-B0D5-53054496DBE0}</code>
*/
public class IMousePointerShape extends IUnknown
{

    public IMousePointerShape(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Flag whether the pointer is visible.
@return Boolean
*/
    public Boolean getVisible()
    {
        try
        {
            Boolean retVal = port.iMousePointerShapeGetVisible(obj);
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
Flag whether the pointer has an alpha channel.
@return Boolean
*/
    public Boolean getAlpha()
    {
        try
        {
            Boolean retVal = port.iMousePointerShapeGetAlpha(obj);
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
The pointer hot spot X coordinate.
@return Long
*/
    public Long getHotX()
    {
        try
        {
            Long retVal = port.iMousePointerShapeGetHotX(obj);
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
The pointer hot spot Y coordinate.
@return Long
*/
    public Long getHotY()
    {
        try
        {
            Long retVal = port.iMousePointerShapeGetHotY(obj);
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
Width of the pointer shape in pixels.
@return Long
*/
    public Long getWidth()
    {
        try
        {
            Long retVal = port.iMousePointerShapeGetWidth(obj);
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
Height of the pointer shape in pixels.
@return Long
*/
    public Long getHeight()
    {
        try
        {
            Long retVal = port.iMousePointerShapeGetHeight(obj);
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
Shape bitmaps.

The  shape buffer contains a 1bpp (bits per pixel) AND mask
followed by a 32bpp XOR (color) mask.

For pointers without alpha channel the XOR mask pixels are
32 bit values: (lsb)BGR0(msb). For pointers with alpha channel
the XOR mask consists of (lsb)BGRA(msb) 32 bit values.

An AND mask is provided for pointers with alpha channel, so if the
client does not support alpha, the pointer could be
displayed as a normal color pointer.

The AND mask is a 1bpp bitmap with byte aligned scanlines. The
size of the AND mask therefore is<code>cbAnd = (width + 7) / 8 *
height</code>. The padding bits at the end of each scanline are
undefined.

The XOR mask follows the AND mask on the next 4-byte aligned
offset:<code>uint8_t *pu8Xor = pu8And + (cbAnd + 3) &amp; ~3</code>.
Bytes in the gap between the AND and the XOR mask are undefined.
The XOR mask scanlines have no gap between them and the size of
the XOR mask is:<code>cbXor = width * 4 * height</code>.
NOTE: If  shape size is 0, then the shape is not known or did not change.
This can happen if only the pointer visibility is changed.

@return byte[]
*/
    public byte[] getShape()
    {
        try
        {
            /*base64*/String retVal = port.iMousePointerShapeGetShape(obj);
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
    public static IMousePointerShape queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IMousePointerShape(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

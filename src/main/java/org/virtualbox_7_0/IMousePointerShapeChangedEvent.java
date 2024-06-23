
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
 * IMousePointerShapeChangedEvent.java
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
Notification when the guest mouse pointer shape has
changed. The new shape data is given.

Interface ID: <code>{A6DCF6E8-416B-4181-8C4A-45EC95177AEF}</code>
*/
public class IMousePointerShapeChangedEvent extends IEvent
{

    public IMousePointerShapeChangedEvent(String wrapped, ObjectRefManager objMgr, VboxPortType port)
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
            Boolean retVal = port.iMousePointerShapeChangedEventGetVisible(obj);
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
            Boolean retVal = port.iMousePointerShapeChangedEventGetAlpha(obj);
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
    public Long getXhot()
    {
        try
        {
            Long retVal = port.iMousePointerShapeChangedEventGetXhot(obj);
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
    public Long getYhot()
    {
        try
        {
            Long retVal = port.iMousePointerShapeChangedEventGetYhot(obj);
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
            Long retVal = port.iMousePointerShapeChangedEventGetWidth(obj);
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
            Long retVal = port.iMousePointerShapeChangedEventGetHeight(obj);
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
Shape buffer arrays.

The  shape buffer contains a 1-bpp (bits per pixel) AND mask
followed by a 32-bpp XOR (color) mask.

For pointers without alpha channel the XOR mask pixels are
32-bit values: (lsb)BGR0(msb). For pointers with alpha channel
the XOR mask consists of (lsb)BGRA(msb) 32-bit values.

An AND mask is used for pointers with alpha channel, so if the
callback does not support alpha, the pointer could be
displayed as a normal color pointer.

The AND mask is a 1-bpp bitmap with byte aligned scanlines. The
size of the AND mask therefore is<code>cbAnd = (width + 7) / 8 *
height</code>. The padding bits at the end of each scanline are
undefined.

The XOR mask follows the AND mask on the next 4-byte aligned
offset:<code>uint8_t *pXor = pAnd + (cbAnd + 3) &amp; ~3</code>.
Bytes in the gap between the AND and the XOR mask are undefined.
The XOR mask scanlines have no gap between them and the size of
the XOR mask is:<code>cXor = width * 4 * height</code>.
NOTE: If  shape is 0, only the pointer visibility is changed.

@return byte[]
*/
    public byte[] getShape()
    {
        try
        {
            /*base64*/String retVal = port.iMousePointerShapeChangedEventGetShape(obj);
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
    public static IMousePointerShapeChangedEvent queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IMousePointerShapeChangedEvent(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

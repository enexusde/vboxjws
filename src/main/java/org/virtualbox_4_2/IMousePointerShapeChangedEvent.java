
/*
 *  Copyright (C) 2010-2011 Oracle Corporation
 *
 *  This file is part of the VirtualBox SDK, as available from
 *  http://www.virtualbox.org.  This library is free software; you can
 *  redistribute it and/or modify it under the terms of the GNU Lesser General
 *  Public License as published by the Free Software Foundation, in version 2.1
 *  as it comes in the "COPYING.LIB" file of the VirtualBox SDK distribution.
 *  This library is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 *  License for more details.
 *
 * IMousePointerShapeChangedEvent.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.InvalidObjectFaultMsg;
import org.virtualbox_4_2.jaxws.RuntimeFaultMsg;
import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Notification when the guest mouse pointer shape has changed. The new shape
 * data is given.
 * 
 * Interface ID: <tt>{A6DCF6E8-416B-4181-8C4A-45EC95177AEF}</tt>
 */
public class IMousePointerShapeChangedEvent extends IEvent {

	public IMousePointerShapeChangedEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Flag whether the pointer is visible.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getVisible() {
		try {
			Boolean retVal = port.iMousePointerShapeChangedEventGetVisible(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether the pointer has an alpha channel.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getAlpha() {
		try {
			Boolean retVal = port.iMousePointerShapeChangedEventGetAlpha(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The pointer hot spot X coordinate.
	 * 
	 * @return Long
	 * 
	 */
	public Long getXhot() {
		try {
			Long retVal = port.iMousePointerShapeChangedEventGetXhot(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The pointer hot spot Y coordinate.
	 * 
	 * @return Long
	 * 
	 */
	public Long getYhot() {
		try {
			Long retVal = port.iMousePointerShapeChangedEventGetYhot(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Width of the pointer shape in pixels.
	 * 
	 * @return Long
	 * 
	 */
	public Long getWidth() {
		try {
			Long retVal = port.iMousePointerShapeChangedEventGetWidth(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Height of the pointer shape in pixels.
	 * 
	 * @return Long
	 * 
	 */
	public Long getHeight() {
		try {
			Long retVal = port.iMousePointerShapeChangedEventGetHeight(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Shape buffer arrays.
	 * 
	 * The shape buffer contains a 1-bpp (bits per pixel) AND mask followed by a
	 * 32-bpp XOR (color) mask.
	 * 
	 * For pointers without alpha channel the XOR mask pixels are 32 bit values:
	 * (lsb)BGR0(msb). For pointers with alpha channel the XOR mask consists of
	 * (lsb)BGRA(msb) 32 bit values.
	 * 
	 * An AND mask is used for pointers with alpha channel, so if the callback does
	 * not support alpha, the pointer could be displayed as a normal color pointer.
	 * 
	 * The AND mask is a 1-bpp bitmap with byte aligned scanlines. The size of the
	 * AND mask therefore is <tt>cbAnd = (width + 7) / 8 *
	   height</tt>. The padding bits at the end of each scanline are undefined.
	 * 
	 * The XOR mask follows the AND mask on the next 4-byte aligned offset:
	 * <tt>uint8_t *pXor = pAnd + (cbAnd + 3) & ~3</tt>. Bytes in the gap between
	 * the AND and the XOR mask are undefined. The XOR mask scanlines have no gap
	 * between them and the size of the XOR mask is:
	 * <tt>cXor = width * 4 * height</tt>.
	 * 
	 * 
	 * NOTE: If shape is 0, only the pointer visibility is changed.
	 * 
	 * 
	 * @return byte[]
	 * 
	 */
	public byte[] getShape() {
		try {
			/* base64 */String retVal = port.iMousePointerShapeChangedEventGetShape(obj);
			return Helper.decodeBase64(retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IMousePointerShapeChangedEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IMousePointerShapeChangedEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}
}


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
 * FramebufferPixelFormat.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Format of the video memory buffer. Constants represented by this enum can be
 * used to test for particular values of
 * {@link org.virtualbox_4_2.IFramebuffer#getPixelFormat()}. See also
 * {@link org.virtualbox_4_2.IFramebuffer#requestResize(Long,Long,byte,Long,Long,Long,Long)}.
 * 
 * See also www.fourcc.org for more information about FOURCC pixel formats.
 * 
 * Interface ID: <tt>{7ACFD5ED-29E3-45E3-8136-73C9224F3D2D}</tt>
 */
public enum FramebufferPixelFormat {

	/**
	 * 
	 * Unknown buffer format (the user may not assume any particular format of the
	 * buffer).
	 * 
	 */
	Opaque(0),
	/**
	 * 
	 * Basic RGB format ({@link org.virtualbox_4_2.IFramebuffer#getBitsPerPixel()}
	 * determines the bit layout).
	 * 
	 */
	FOURCC_RGB(0x32424752);

	private final int value;

	FramebufferPixelFormat(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static FramebufferPixelFormat fromValue(long v) {
		for (FramebufferPixelFormat c : FramebufferPixelFormat.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static FramebufferPixelFormat fromValue(String v) {
		return valueOf(FramebufferPixelFormat.class, v);
	}
}

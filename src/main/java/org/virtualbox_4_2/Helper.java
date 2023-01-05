
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
 * Helper.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.virtualbox_4_2.jaxws.VboxPortType;

public class Helper {
	public static <T> List<T> wrap(Class<T> wrapperClass, VboxPortType pt, List<String> thisPtrs) {
		try {
			if (thisPtrs == null)
				return null;

			Constructor<T> c = wrapperClass.getConstructor(String.class, VboxPortType.class);
			List<T> ret = new ArrayList<T>(thisPtrs.size());
			for (String thisPtr : thisPtrs) {
				ret.add(c.newInstance(thisPtr, pt));
			}
			return ret;
		} catch (NoSuchMethodException e) {
			throw new AssertionError(e);
		} catch (InstantiationException e) {
			throw new AssertionError(e);
		} catch (IllegalAccessException e) {
			throw new AssertionError(e);
		} catch (InvocationTargetException e) {
			throw new AssertionError(e);
		}
	}

	public static <T1, T2> List<T1> wrap2(Class<T1> wrapperClass1, Class<T2> wrapperClass2, VboxPortType pt,
			List<T2> thisPtrs) {
		try {
			if (thisPtrs == null)
				return null;

			Constructor<T1> c = wrapperClass1.getConstructor(wrapperClass2, VboxPortType.class);
			List<T1> ret = new ArrayList<T1>(thisPtrs.size());
			for (T2 thisPtr : thisPtrs) {
				ret.add(c.newInstance(thisPtr, pt));
			}
			return ret;
		} catch (NoSuchMethodException e) {
			throw new AssertionError(e);
		} catch (InstantiationException e) {
			throw new AssertionError(e);
		} catch (IllegalAccessException e) {
			throw new AssertionError(e);
		} catch (InvocationTargetException e) {
			throw new AssertionError(e);
		}
	}

	public static <T extends IUnknown> List<String> unwrap(List<T> thisPtrs) {
		if (thisPtrs == null)
			return null;

		List<String> ret = new ArrayList<String>(thisPtrs.size());
		for (T obj : thisPtrs) {
			ret.add(obj.getWrapped());
		}
		return ret;
	}

	@SuppressWarnings("unchecked")
	public static <T1 extends Enum<T1>, T2 extends Enum<T2>> List<T2> convertEnums(Class<T1> fromClass,
			Class<T2> toClass, List<T1> values) {
		try {
			if (values == null)
				return null;
			java.lang.reflect.Method fromValue = toClass.getMethod("fromValue", String.class);
			List<T2> ret = new ArrayList<T2>(values.size());
			for (T1 v : values) {
				// static method is called with null this
				ret.add((T2) fromValue.invoke(null, v.name()));
			}
			return ret;
		} catch (NoSuchMethodException e) {
			throw new AssertionError(e);
		} catch (IllegalAccessException e) {
			throw new AssertionError(e);
		} catch (InvocationTargetException e) {
			throw new AssertionError(e);
		}
	}

	/* Pretty naive Base64 encoder/decoder. */
	private static final char[] valToChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
			.toCharArray();
	private static final int[] charToVal = new int[256];

	/* Initialize recoding alphabet. */
	static {
		for (int i = 0; i < charToVal.length; i++)
			charToVal[i] = -1;

		for (int i = 0; i < valToChar.length; i++)
			charToVal[valToChar[i]] = i;

		charToVal['='] = 0;
	}

	public static String encodeBase64(byte[] data) {
		if (data == null)
			return null;

		if (data.length == 0)
			return "";

		int fullTriplets = data.length / 3;
		int resultLen = ((data.length - 1) / 3 + 1) * 4;
		char[] result = new char[resultLen];
		int dataIndex = 0, stringIndex = 0;

		for (int i = 0; i < fullTriplets; i++) {
			int ch1 = data[dataIndex++] & 0xff;
			result[stringIndex++] = valToChar[ch1 >> 2];
			int ch2 = data[dataIndex++] & 0xff;
			result[stringIndex++] = valToChar[((ch1 << 4) & 0x3f) | (ch2 >> 4)];
			int ch3 = data[dataIndex++] & 0xff;
			result[stringIndex++] = valToChar[((ch2 << 2) & 0x3f) | (ch3 >> 6)];
			result[stringIndex++] = valToChar[ch3 & 0x3f];
		}

		switch (data.length - dataIndex) {
		case 0:
			// do nothing
			break;
		case 1: {
			int ch1 = data[dataIndex++] & 0xff;
			result[stringIndex++] = valToChar[ch1 >> 2];
			result[stringIndex++] = valToChar[(ch1 << 4) & 0x3f];
			result[stringIndex++] = '=';
			result[stringIndex++] = '=';
			break;
		}
		case 2: {
			int ch1 = data[dataIndex++] & 0xff;
			result[stringIndex++] = valToChar[ch1 >> 2];
			int ch2 = data[dataIndex++] & 0xff;
			result[stringIndex++] = valToChar[((ch1 << 4) & 0x3f) | (ch2 >> 4)];
			result[stringIndex++] = valToChar[(ch2 << 2) & 0x3f];
			result[stringIndex++] = '=';
			break;
		}
		default:
			throw new RuntimeException("bug!");
		}

		return new String(result);
	}

	private static int skipInvalid(String str, int stringIndex) {
		while (charToVal[str.charAt(stringIndex)] < 0)
			stringIndex++;

		return stringIndex;
	}

	public static byte[] decodeBase64(String str) {
		if (str == null)
			return null;

		int stringLength = str.length();
		if (stringLength == 0)
			return new byte[0];

		int validChars = 0, padChars = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (charToVal[ch] >= 0)
				validChars++;

			if (ch == '=')
				padChars++;
		}

		if ((validChars * 3 % 4) != 0)
			throw new RuntimeException("invalid encoded string " + str);

		int resultLength = validChars * 3 / 4 - padChars;
		byte[] result = new byte[resultLength];

		int dataIndex = 0, stringIndex = 0;
		int quadraplets = validChars / 4;

		for (int i = 0; i < quadraplets; i++) {
			stringIndex = skipInvalid(str, stringIndex);
			int ch1 = str.charAt(stringIndex++);
			stringIndex = skipInvalid(str, stringIndex);
			int ch2 = str.charAt(stringIndex++);
			stringIndex = skipInvalid(str, stringIndex);
			int ch3 = str.charAt(stringIndex++);
			stringIndex = skipInvalid(str, stringIndex);
			int ch4 = str.charAt(stringIndex++);

			result[dataIndex++] = (byte) (((charToVal[ch1] << 2) | charToVal[ch2] >> 4) & 0xff);
			/* we check this to ensure that we don't override data with '=' padding. */
			if (dataIndex < result.length)
				result[dataIndex++] = (byte) (((charToVal[ch2] << 4) | charToVal[ch3] >> 2) & 0xff);
			if (dataIndex < result.length)
				result[dataIndex++] = (byte) (((charToVal[ch3] << 6) | charToVal[ch4]) & 0xff);
		}

		return result;
	}
}


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
 * Helper.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;

public class Helper
{
    public static <T> List<T> wrap(Class<T> wrapperClass, ObjectRefManager objMgr, VboxPortType pt, List<String> values)
    {
        try
        {
            if (values == null)
                return null;

            Constructor<T> c = wrapperClass.getConstructor(String.class, ObjectRefManager.class, VboxPortType.class);
            List<T> ret = new ArrayList<T>(values.size());
            for (String v : values)
            {
                ret.add(c.newInstance(v, objMgr, pt));
            }
            return ret;
        }
        catch (NoSuchMethodException e)
        {
            throw new AssertionError(e);
        }
        catch (InstantiationException e)
        {
            throw new AssertionError(e);
        }
        catch (IllegalAccessException e)
        {
            throw new AssertionError(e);
        }
        catch (InvocationTargetException e)
        {
            throw new AssertionError(e);
        }
    }

    public static <T1, T2> List<T1> wrap2(Class<T1> wrapperClass1, Class<T2> wrapperClass2, ObjectRefManager objMgr, VboxPortType pt, List<T2> values)
    {
        try
        {
            if (values == null)
                return null;

            Constructor<T1> c = wrapperClass1.getConstructor(wrapperClass2, ObjectRefManager.class, VboxPortType.class);
            List<T1> ret = new ArrayList<T1>(values.size());
            for (T2 v : values)
            {
                ret.add(c.newInstance(v, objMgr, pt));
            }
            return ret;
        }
        catch (NoSuchMethodException e)
        {
            throw new AssertionError(e);
        }
        catch (InstantiationException e)
        {
            throw new AssertionError(e);
        }
        catch (IllegalAccessException e)
        {
            throw new AssertionError(e);
        }
        catch (InvocationTargetException e)
        {
            throw new AssertionError(e);
        }
    }

    public static <T extends IUnknown> List<String> unwrap(List<T> values)
    {
        if (values == null)
            return null;

        List<String> ret = new ArrayList<String>(values.size());
        for (T obj : values)
        {
          ret.add(obj.getWrapped());
        }
        return ret;
    }

    @SuppressWarnings("unchecked" )
    public static <T1 extends Enum <T1>, T2 extends Enum <T2>> List<T2> convertEnums(Class<T1> fromClass,
                                                                                     Class<T2> toClass,
                                                                                     List<T1> values)
                                                                                     {
        try
        {
            if (values == null)
                return null;
            List<T2> ret = new ArrayList<T2>(values.size());
            for (T1 v : values)
            {
                // Ordinal based enum conversion, as JAX-WS "invents" its own
                // enum names and has string values with the expected content.
                int enumOrdinal = v.ordinal();
                T2 convEnum = toClass.getEnumConstants()[enumOrdinal];
                ret.add(convEnum);
            }
            return ret;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            throw new AssertionError(e);
        }
    }

    /* Pretty naive Base64 encoder/decoder. */
    private static final char[] valToChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    private static final int[] charToVal = new int[256];

    /* Initialize recoding alphabet. */
    static
    {
        for (int i = 0; i < charToVal.length; i++)
            charToVal[i] = -1;

        for (int i = 0; i < valToChar.length; i++)
            charToVal[valToChar[i]] = i;

        charToVal['='] = 0;
    }

    public static String encodeBase64(byte[] data)
    {
        if (data == null)
            return null;

        if (data.length == 0)
            return "";

        int fullTriplets = data.length / 3;
        int resultLen = ((data.length - 1) / 3 + 1) * 4;
        char[] result = new char[resultLen];
        int dataIndex = 0, stringIndex = 0;

        for (int i = 0; i < fullTriplets; i++)
        {
            int ch1 = data[dataIndex++] & 0xff;
            result[stringIndex++] = valToChar[ch1 >> 2];
            int ch2 = data[dataIndex++] & 0xff;
            result[stringIndex++] = valToChar[((ch1 << 4) & 0x3f) | (ch2 >> 4)];
            int ch3 = data[dataIndex++] & 0xff;
            result[stringIndex++] = valToChar[((ch2 << 2) & 0x3f) | (ch3 >> 6)];
            result[stringIndex++] = valToChar[ch3 & 0x3f];
        }

        switch (data.length - dataIndex)
        {
            case 0:
                // do nothing
                break;
            case 1:
            {
                int ch1 = data[dataIndex++] & 0xff;
                result[stringIndex++] = valToChar[ch1 >> 2];
                result[stringIndex++] = valToChar[(ch1 << 4) & 0x3f];
                result[stringIndex++] = '=';
                result[stringIndex++] = '=';
                break;
            }
            case 2:
            {
                int ch1 = data[dataIndex++] & 0xff;
                result[stringIndex++] = valToChar[ch1 >> 2];
                int ch2 = data[dataIndex++] & 0xff;
                result[stringIndex++] = valToChar[((ch1 << 4) & 0x3f) | (ch2 >> 4)];
                result[stringIndex++] = valToChar[(ch2 << 2) & 0x3f];
                result[stringIndex++] = '=';
                break;
            }
            default:
                throw new VBoxException("bug!");
        }

        return new String(result);
    }

    private static int skipInvalid(String str, int stringIndex)
    {
        while (charToVal[str.charAt(stringIndex)] < 0)
            stringIndex++;

        return stringIndex;
    }

    public static byte[] decodeBase64(String str)
    {
        if (str == null)
            return null;

        int stringLength = str.length();
        if (stringLength == 0)
            return new byte[0];

        int validChars = 0, padChars = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (charToVal[ch] >= 0)
                validChars++;

            if (ch == '=')
                padChars++;
        }

        if ((validChars * 3 % 4) != 0)
            throw new VBoxException("invalid base64 encoded string " + str);

        int resultLength = validChars * 3 / 4 - padChars;
        byte[] result = new byte[resultLength];

        int dataIndex = 0, stringIndex = 0;
        int quadraplets = validChars / 4;

        for (int i = 0; i < quadraplets; i++)
        {
            stringIndex = skipInvalid(str, stringIndex);
            int ch1 = str.charAt(stringIndex++);
            stringIndex = skipInvalid(str, stringIndex);
            int ch2 = str.charAt(stringIndex++);
            stringIndex = skipInvalid(str, stringIndex);
            int ch3 = str.charAt(stringIndex++);
            stringIndex = skipInvalid(str, stringIndex);
            int ch4 = str.charAt(stringIndex++);

            result[dataIndex++] = (byte)(((charToVal[ch1] << 2) | charToVal[ch2] >> 4) & 0xff);
            /* we check this to ensure that we don't override data with '=' padding. */
            if (dataIndex < result.length)
                result[dataIndex++] = (byte)(((charToVal[ch2] << 4) | charToVal[ch3] >> 2) & 0xff);
            if (dataIndex < result.length)
                result[dataIndex++] = (byte)(((charToVal[ch3] << 6) | charToVal[ch4]) & 0xff);
        }

        return result;
    }
}

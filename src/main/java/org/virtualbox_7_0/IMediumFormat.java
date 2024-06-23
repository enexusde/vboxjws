
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
 * IMediumFormat.java
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
The IMediumFormat interface represents a medium format.

Each medium format has an associated backend which is used to handle
media stored in this format. This interface provides information
about the properties of the associated backend.

Each medium format is identified by a string represented by the{@link #getId()}attribute. This string is used in calls like{@link org.virtualbox_7_0.IVirtualBox#createMedium(String,String,org.virtualbox_7_0.AccessMode,org.virtualbox_7_0.DeviceType)}to specify the desired
format.

The list of all supported medium formats can be obtained using{@link org.virtualbox_7_0.ISystemProperties#getMediumFormats()}.
@see org.virtualbox_7_0.IMedium


Interface ID: <code>{11BE93C7-A862-4DC9-8C89-BF4BA74A886A}</code>
*/
public class IMediumFormat extends IUnknown
{

    public IMediumFormat(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Identifier of this format.

The format identifier is a non- null non-empty ASCII string. Note that
this string is case-insensitive. This means that, for example, all of
the following strings:<pre>"VDI"
"vdi"
"VdI"</pre>refer to the same medium format.

This string is used in methods of other interfaces where it is necessary
to specify a medium format, such as{@link org.virtualbox_7_0.IVirtualBox#createMedium(String,String,org.virtualbox_7_0.AccessMode,org.virtualbox_7_0.DeviceType)}.
@return String
*/
    public String getId()
    {
        try
        {
            String retVal = port.iMediumFormatGetId(obj);
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
Human readable description of this format.

Mainly for use in file open dialogs.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iMediumFormatGetName(obj);
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
Capabilities of the format as an array of the flags.

For the meaning of individual capability flags see{@link org.virtualbox_7_0.MediumFormatCapabilities}.
@return List&lt;org.virtualbox_7_0.MediumFormatCapabilities&gt;
*/
    public List<org.virtualbox_7_0.MediumFormatCapabilities> getCapabilities()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.MediumFormatCapabilities> retVal = port.iMediumFormatGetCapabilities(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.MediumFormatCapabilities.class, org.virtualbox_7_0.MediumFormatCapabilities.class, retVal);
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
    public static IMediumFormat queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IMediumFormat(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Returns two arrays describing the supported file extensions.

The first array contains the supported extensions and the seconds one
the type each extension supports. Both have the same size.

Note that some backends do not work on files, so this array may be
empty.
@param extensions The array of supported extensions.

@param types The array which indicates the device type for every given extension.

@see org.virtualbox_7_0.IMediumFormat#getCapabilities()

*/
    public void describeFileExtensions(Holder<List<String>> extensions, Holder<List<org.virtualbox_7_0.DeviceType>> types)
    {
        try
        {
        jakarta.xml.ws.Holder<List<String>> tmp_extensions = new jakarta.xml.ws.Holder<List<String>>();
        jakarta.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.DeviceType>> tmp_types = new jakarta.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.DeviceType>>();
        port.iMediumFormatDescribeFileExtensions(obj, tmp_extensions, tmp_types);
        extensions.value = tmp_extensions.value;
        types.value = Helper.convertEnums(org.virtualbox_7_0.jaxws.DeviceType.class, org.virtualbox_7_0.DeviceType.class, tmp_types.value);
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
Returns several arrays describing the properties supported by this
format.

An element with the given index in each array describes one
property. Thus, the number of elements in each returned array is the
same and corresponds to the number of supported properties.

The returned arrays are filled in only if the{@link org.virtualbox_7_0.MediumFormatCapabilities#Properties}flag is set.
All arguments must be non- null.
@param names Array of property names.

@param descriptions Array of property descriptions.

@param types Array of property types.

@param flags Array of property flags.

@param defaults Array of default property values.

@see org.virtualbox_7_0.DataType
@see org.virtualbox_7_0.DataFlags

*/
    public void describeProperties(Holder<List<String>> names, Holder<List<String>> descriptions, Holder<List<org.virtualbox_7_0.DataType>> types, Holder<List<Long>> flags, Holder<List<String>> defaults)
    {
        try
        {
        jakarta.xml.ws.Holder<List<String>> tmp_names = new jakarta.xml.ws.Holder<List<String>>();
        jakarta.xml.ws.Holder<List<String>> tmp_descriptions = new jakarta.xml.ws.Holder<List<String>>();
        jakarta.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.DataType>> tmp_types = new jakarta.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.DataType>>();
        jakarta.xml.ws.Holder<List<Long>> tmp_flags = new jakarta.xml.ws.Holder<List<Long>>();
        jakarta.xml.ws.Holder<List<String>> tmp_defaults = new jakarta.xml.ws.Holder<List<String>>();
        port.iMediumFormatDescribeProperties(obj, tmp_names, tmp_descriptions, tmp_types, tmp_flags, tmp_defaults);
        names.value = tmp_names.value;
        descriptions.value = tmp_descriptions.value;
        types.value = Helper.convertEnums(org.virtualbox_7_0.jaxws.DataType.class, org.virtualbox_7_0.DataType.class, tmp_types.value);
        flags.value = tmp_flags.value;
        defaults.value = tmp_defaults.value;
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

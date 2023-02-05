
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
 * IUSBDeviceFilter.java
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
The IUSBDeviceFilter interface represents an USB device filter used
to perform actions on a group of USB devices.

This type of filters is used by running virtual machines to
automatically capture selected USB devices once they are physically
attached to the host computer.

A USB device is matched to the given device filter if and only if all
attributes of the device match the corresponding attributes of the
filter (that is, attributes are joined together using the logical AND
operation). On the other hand, all together, filters in the list of
filters carry the semantics of the logical OR operation. So if it is
desirable to create a match like "this vendor id OR this product id",
one needs to create two filters and specify "any match" (see below)
for unused attributes.

All filter attributes used for matching are strings. Each string
is an expression representing a set of values of the corresponding
device attribute, that will match the given filter. Currently, the
following filtering expressions are supported:<ul><li><i>Interval filters</i>. Used to specify valid intervals for
integer device attributes (Vendor ID, Product ID and Revision).
The format of the string is:<code>int:((m)|([m]-[n]))(,(m)|([m]-[n]))*</code>where<code>m</code>and<code>n</code>are integer numbers, either in octal
(starting from<code>0</code>), hexadecimal (starting from<code>0x</code>)
or decimal (otherwise) form, so that<code>m &lt; n</code>. If<code>m</code>is omitted before a dash (<code>-</code>), the minimum possible integer
is assumed; if<code>n</code>is omitted after a dash, the maximum
possible integer is assumed.</li><li><i>Boolean filters</i>. Used to specify acceptable values for
boolean device attributes. The format of the string is:<code>true|false|yes|no|0|1</code></li><li><i>Exact match</i>. Used to specify a single value for the given
device attribute. Any string that doesn't start with<code>int:</code>represents the exact match. String device attributes are compared to
this string including case of symbols. Integer attributes are first
converted to a string (see individual filter attributes) and then
compared ignoring case.</li><li><i>Any match</i>. Any value of the corresponding device attribute
will match the given filter. An empty or  null string is
used to construct this type of filtering expressions.</li></ul>
NOTE: On the Windows host platform, interval filters are not currently
available. Also all string filter attributes
({@link #getManufacturer()},{@link #getProduct()},{@link #getSerialNumber()}) are ignored, so they behave as<i>any match</i>no matter what string expression is specified.

@see org.virtualbox_7_0.IUSBDeviceFilters#getDeviceFilters()
@see org.virtualbox_7_0.IHostUSBDeviceFilter


Interface ID: <code>{45587218-4289-EF4E-8E6A-E5B07816B631}</code>
*/
public class IUSBDeviceFilter extends IUnknown
{

    public IUSBDeviceFilter(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Visible name for this filter.
This name is used to visually distinguish one filter from another,
so it can neither be  null nor an empty string.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iusbDeviceFilterGetName(obj);
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
Visible name for this filter.
This name is used to visually distinguish one filter from another,
so it can neither be  null nor an empty string.
@param value String

*/
    public void setName(String value)
    {
        try
        {
        port.iusbDeviceFilterSetName(obj, value);
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
Whether this filter active or has been temporarily disabled.
@return Boolean
*/
    public Boolean getActive()
    {
        try
        {
            Boolean retVal = port.iusbDeviceFilterGetActive(obj);
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
Whether this filter active or has been temporarily disabled.
@param value Boolean

*/
    public void setActive(Boolean value)
    {
        try
        {
        port.iusbDeviceFilterSetActive(obj, value);
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
{@link org.virtualbox_7_0.IUSBDevice#getVendorId()}filter.
The string representation for the<i>exact matching</i>has the form<code>XXXX</code>, where<code>X</code>is the hex digit
(including leading zeroes).
@return String
*/
    public String getVendorId()
    {
        try
        {
            String retVal = port.iusbDeviceFilterGetVendorId(obj);
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
{@link org.virtualbox_7_0.IUSBDevice#getVendorId()}filter.
The string representation for the<i>exact matching</i>has the form<code>XXXX</code>, where<code>X</code>is the hex digit
(including leading zeroes).
@param value String

*/
    public void setVendorId(String value)
    {
        try
        {
        port.iusbDeviceFilterSetVendorId(obj, value);
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
{@link org.virtualbox_7_0.IUSBDevice#getProductId()}filter.
The string representation for the<i>exact matching</i>has the form<code>XXXX</code>, where<code>X</code>is the hex digit
(including leading zeroes).
@return String
*/
    public String getProductId()
    {
        try
        {
            String retVal = port.iusbDeviceFilterGetProductId(obj);
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
{@link org.virtualbox_7_0.IUSBDevice#getProductId()}filter.
The string representation for the<i>exact matching</i>has the form<code>XXXX</code>, where<code>X</code>is the hex digit
(including leading zeroes).
@param value String

*/
    public void setProductId(String value)
    {
        try
        {
        port.iusbDeviceFilterSetProductId(obj, value);
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
{@link org.virtualbox_7_0.IUSBDevice#getProductId()}filter. The string representation for the<i>exact matching</i>has the form<code>IIFF</code>, where<code>I</code>is the decimal digit
of the integer part of the revision, and<code>F</code>is the
decimal digit of its fractional part (including leading and
trailing zeros).
Note that for interval filters, it's best to use the hexadecimal
form, because the revision is stored as a 16 bit packed BCD value;
so the expression<code>int:0x0100-0x0199</code>will match any
revision from<code>1.0</code>to<code>1.99</code>.
@return String
*/
    public String getRevision()
    {
        try
        {
            String retVal = port.iusbDeviceFilterGetRevision(obj);
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
{@link org.virtualbox_7_0.IUSBDevice#getProductId()}filter. The string representation for the<i>exact matching</i>has the form<code>IIFF</code>, where<code>I</code>is the decimal digit
of the integer part of the revision, and<code>F</code>is the
decimal digit of its fractional part (including leading and
trailing zeros).
Note that for interval filters, it's best to use the hexadecimal
form, because the revision is stored as a 16 bit packed BCD value;
so the expression<code>int:0x0100-0x0199</code>will match any
revision from<code>1.0</code>to<code>1.99</code>.
@param value String

*/
    public void setRevision(String value)
    {
        try
        {
        port.iusbDeviceFilterSetRevision(obj, value);
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
{@link org.virtualbox_7_0.IUSBDevice#getManufacturer()}filter.
@return String
*/
    public String getManufacturer()
    {
        try
        {
            String retVal = port.iusbDeviceFilterGetManufacturer(obj);
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
{@link org.virtualbox_7_0.IUSBDevice#getManufacturer()}filter.
@param value String

*/
    public void setManufacturer(String value)
    {
        try
        {
        port.iusbDeviceFilterSetManufacturer(obj, value);
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
{@link org.virtualbox_7_0.IUSBDevice#getProduct()}filter.
@return String
*/
    public String getProduct()
    {
        try
        {
            String retVal = port.iusbDeviceFilterGetProduct(obj);
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
{@link org.virtualbox_7_0.IUSBDevice#getProduct()}filter.
@param value String

*/
    public void setProduct(String value)
    {
        try
        {
        port.iusbDeviceFilterSetProduct(obj, value);
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
{@link org.virtualbox_7_0.IUSBDevice#getSerialNumber()}filter.
@return String
*/
    public String getSerialNumber()
    {
        try
        {
            String retVal = port.iusbDeviceFilterGetSerialNumber(obj);
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
{@link org.virtualbox_7_0.IUSBDevice#getSerialNumber()}filter.
@param value String

*/
    public void setSerialNumber(String value)
    {
        try
        {
        port.iusbDeviceFilterSetSerialNumber(obj, value);
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
{@link org.virtualbox_7_0.IUSBDevice#getPort()}filter.
@return String
*/
    public String getPort()
    {
        try
        {
            String retVal = port.iusbDeviceFilterGetPort(obj);
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
{@link org.virtualbox_7_0.IUSBDevice#getPort()}filter.
@param value String

*/
    public void setPort(String value)
    {
        try
        {
        port.iusbDeviceFilterSetPort(obj, value);
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
{@link org.virtualbox_7_0.IUSBDevice#getRemote()}filter.
NOTE: This filter makes sense only for machine USB filters,
i.e. it is ignored by IHostUSBDeviceFilter objects.

@return String
*/
    public String getRemote()
    {
        try
        {
            String retVal = port.iusbDeviceFilterGetRemote(obj);
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
{@link org.virtualbox_7_0.IUSBDevice#getRemote()}filter.
NOTE: This filter makes sense only for machine USB filters,
i.e. it is ignored by IHostUSBDeviceFilter objects.

@param value String

*/
    public void setRemote(String value)
    {
        try
        {
        port.iusbDeviceFilterSetRemote(obj, value);
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
This is an advanced option for hiding one or more USB interfaces
from the guest. The value is a bit mask where the bits that are set
means the corresponding USB interface should be hidden, masked off
if you like.
This feature only works on Linux hosts.
@return Long
*/
    public Long getMaskedInterfaces()
    {
        try
        {
            Long retVal = port.iusbDeviceFilterGetMaskedInterfaces(obj);
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
This is an advanced option for hiding one or more USB interfaces
from the guest. The value is a bit mask where the bits that are set
means the corresponding USB interface should be hidden, masked off
if you like.
This feature only works on Linux hosts.
@param value Long

*/
    public void setMaskedInterfaces(Long value)
    {
        try
        {
        port.iusbDeviceFilterSetMaskedInterfaces(obj, value);
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
    public static IUSBDeviceFilter queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IUSBDeviceFilter(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}


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
 * IUSBDeviceFilters.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;
import java.util.List;

public class IUSBDeviceFilters extends IUnknown
{

    public IUSBDeviceFilters(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
List of USB device filters associated with the machine.

If the machine is currently running, these filters are activated
every time a new (supported) USB device is attached to the host
computer that was not ignored by global filters
({@link org.virtualbox_7_0.IHost#getUSBDeviceFilters()}).

These filters are also activated when the machine is powered up.
They are run against a list of all currently available USB
devices (in states{@link org.virtualbox_7_0.USBDeviceState#Available},{@link org.virtualbox_7_0.USBDeviceState#Busy},{@link org.virtualbox_7_0.USBDeviceState#Held}) that were not previously
ignored by global filters.

If at least one filter matches the USB device in question, this
device is automatically captured (attached to) the virtual USB
controller of this machine.
@return List&lt;org.virtualbox_7_0.IUSBDeviceFilter&gt;

@see org.virtualbox_7_0.IUSBDeviceFilter
@see org.virtualbox_7_0.IUSBController
*/
    public List<org.virtualbox_7_0.IUSBDeviceFilter> getDeviceFilters()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iusbDeviceFiltersGetDeviceFilters(obj);
            return Helper.wrap(org.virtualbox_7_0.IUSBDeviceFilter.class, getObjMgr(), port, retVal);
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
    public static IUSBDeviceFilters queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IUSBDeviceFilters(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Creates a new USB device filter. All attributes except
the filter name are set to empty (any match),<i>active</i>is  false (the filter is not active).

The created filter can then be added to the list of filters using{@link #insertDeviceFilter(Long,org.virtualbox_7_0.IUSBDeviceFilter)}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - The virtual machine is not mutable.</dd>
</dl>

@param name Filter name. See{@link org.virtualbox_7_0.IUSBDeviceFilter#getName()}for more info.

@return Created filter object.

@see #getDeviceFilters()

*/
    public org.virtualbox_7_0.IUSBDeviceFilter createDeviceFilter(String name)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iusbDeviceFiltersCreateDeviceFilter(obj, name);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IUSBDeviceFilter(retVal, getObjMgr(), port) : null;
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

/**
Inserts the given USB device to the specified position
in the list of filters.

Positions are numbered starting from<code>0</code>. If the specified
position is equal to or greater than the number of elements in
the list, the filter is added to the end of the collection.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine is not mutable.</dd>
<dd><code>E_INVALIDARG</code> - USB device filter not created within this VirtualBox instance.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - USB device filter already in list.</dd>
</dl>

@param position Position to insert the filter to.

@param filter USB device filter to insert.

NOTE: Duplicates are not allowed, so an attempt to insert a
filter that is already in the collection, will return an
error.

@see #getDeviceFilters()

*/
    public void insertDeviceFilter(Long position, org.virtualbox_7_0.IUSBDeviceFilter filter)
    {
        try
        {
        port.iusbDeviceFiltersInsertDeviceFilter(obj, position, ((filter == null) ? null :filter.getWrapped()));
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
Removes a USB device filter from the specified position in the
list of filters.

Positions are numbered starting from<code>0</code>. Specifying a
position equal to or greater than the number of elements in
the list will produce an error.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine is not mutable.</dd>
<dd><code>E_INVALIDARG</code> - USB device filter list empty or invalid  position.</dd>
</dl>

@param position Position to remove the filter from.

@return Removed USB device filter.

@see #getDeviceFilters()

*/
    public org.virtualbox_7_0.IUSBDeviceFilter removeDeviceFilter(Long position)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iusbDeviceFiltersRemoveDeviceFilter(obj, position);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IUSBDeviceFilter(retVal, getObjMgr(), port) : null;
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
}

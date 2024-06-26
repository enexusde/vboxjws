
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
 * IStorageController.java
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
Represents a storage controller that is attached to a virtual machine
({@link org.virtualbox_7_0.IMachine}). Just as drives (hard disks, DVDs, FDs) are
attached to storage controllers in a real computer, virtual drives
(represented by{@link org.virtualbox_7_0.IMediumAttachment}) are attached to virtual
storage controllers, represented by this interface.

As opposed to physical hardware, VirtualBox has a very generic concept
of a storage controller, and for purposes of the Main API, all virtual
storage is attached to virtual machines via instances of this interface.
There are five types of such virtual storage controllers: IDE, SCSI, SATA,
SAS and Floppy (see{@link #getBus()}). Depending on which of these four
is used, certain sub-types may be available and can be selected in{@link #getControllerType()}.

Depending on these settings, the guest operating system might see
significantly different virtual hardware.

Interface ID: <code>{DDCA7247-BF98-47FB-AB2F-B5177533F493}</code>
*/
public class IStorageController extends IUnknown
{

    public IStorageController(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Name of the storage controller, as originally specified with{@link org.virtualbox_7_0.IMachine#addStorageController(String,org.virtualbox_7_0.StorageBus)}. This then uniquely
identifies this controller with other method calls such as{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}and{@link org.virtualbox_7_0.IMachine#mountMedium(String,Integer,Integer,org.virtualbox_7_0.IMedium,Boolean)}.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iStorageControllerGetName(obj);
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
Name of the storage controller, as originally specified with{@link org.virtualbox_7_0.IMachine#addStorageController(String,org.virtualbox_7_0.StorageBus)}. This then uniquely
identifies this controller with other method calls such as{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}and{@link org.virtualbox_7_0.IMachine#mountMedium(String,Integer,Integer,org.virtualbox_7_0.IMedium,Boolean)}.
@param value String

*/
    public void setName(String value)
    {
        try
        {
        port.iStorageControllerSetName(obj, value);
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
Maximum number of devices which can be attached to one port.
@return Long
*/
    public Long getMaxDevicesPerPortCount()
    {
        try
        {
            Long retVal = port.iStorageControllerGetMaxDevicesPerPortCount(obj);
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
Minimum number of ports that{@link org.virtualbox_7_0.IStorageController#getPortCount()}can be set to.
@return Long
*/
    public Long getMinPortCount()
    {
        try
        {
            Long retVal = port.iStorageControllerGetMinPortCount(obj);
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
Maximum number of ports that{@link org.virtualbox_7_0.IStorageController#getPortCount()}can be set to.
@return Long
*/
    public Long getMaxPortCount()
    {
        try
        {
            Long retVal = port.iStorageControllerGetMaxPortCount(obj);
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
The instance number of the device in the running VM.
@return Long
*/
    public Long getInstance()
    {
        try
        {
            Long retVal = port.iStorageControllerGetInstance(obj);
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
The instance number of the device in the running VM.
@param value Long

*/
    public void setInstance(Long value)
    {
        try
        {
        port.iStorageControllerSetInstance(obj, value);
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
The number of currently usable ports on the controller.
The minimum and maximum number of ports for one controller are
stored in{@link org.virtualbox_7_0.IStorageController#getMinPortCount()}and{@link org.virtualbox_7_0.IStorageController#getMaxPortCount()}.
@return Long
*/
    public Long getPortCount()
    {
        try
        {
            Long retVal = port.iStorageControllerGetPortCount(obj);
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
The number of currently usable ports on the controller.
The minimum and maximum number of ports for one controller are
stored in{@link org.virtualbox_7_0.IStorageController#getMinPortCount()}and{@link org.virtualbox_7_0.IStorageController#getMaxPortCount()}.
@param value Long

*/
    public void setPortCount(Long value)
    {
        try
        {
        port.iStorageControllerSetPortCount(obj, value);
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
The bus type of the storage controller (IDE, SATA, SCSI, SAS or Floppy).
@return org.virtualbox_7_0.StorageBus
*/
    public org.virtualbox_7_0.StorageBus getBus()
    {
        try
        {
            org.virtualbox_7_0.jaxws.StorageBus retVal = port.iStorageControllerGetBus(obj);
            return org.virtualbox_7_0.StorageBus.fromValue(retVal.value());
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
The exact variant of storage controller hardware presented
to the guest.
Depending on this value, VirtualBox will provide a different
virtual storage controller hardware to the guest.
For SATA, SAS and floppy controllers, only one variant is
available, but for IDE and SCSI, there are several.

For SCSI controllers, the default type is LsiLogic.
@return org.virtualbox_7_0.StorageControllerType
*/
    public org.virtualbox_7_0.StorageControllerType getControllerType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.StorageControllerType retVal = port.iStorageControllerGetControllerType(obj);
            return org.virtualbox_7_0.StorageControllerType.fromValue(retVal.value());
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
The exact variant of storage controller hardware presented
to the guest.
Depending on this value, VirtualBox will provide a different
virtual storage controller hardware to the guest.
For SATA, SAS and floppy controllers, only one variant is
available, but for IDE and SCSI, there are several.

For SCSI controllers, the default type is LsiLogic.
@param value org.virtualbox_7_0.StorageControllerType

*/
    public void setControllerType(org.virtualbox_7_0.StorageControllerType value)
    {
        try
        {
        port.iStorageControllerSetControllerType(obj, org.virtualbox_7_0.jaxws.StorageControllerType.fromValue(value.name()));
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
If true, the storage controller emulation will use a dedicated I/O thread, enable the host I/O
caches and use synchronous file APIs on the host. This was the only option in the API before
VirtualBox 3.2 and is still the default for IDE controllers.

If false, the host I/O cache will be disabled for image files attached to this storage controller.
Instead, the storage controller emulation will use asynchronous I/O APIs on the host. This makes
it possible to turn off the host I/O caches because the emulation can handle unaligned access to
the file. This should be used on OS X and Linux hosts if a high I/O load is expected or many
virtual machines are running at the same time to prevent I/O cache related hangs.
This option new with the API of VirtualBox 3.2 and is now the default for non-IDE storage controllers.
@return Boolean
*/
    public Boolean getUseHostIOCache()
    {
        try
        {
            Boolean retVal = port.iStorageControllerGetUseHostIOCache(obj);
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
If true, the storage controller emulation will use a dedicated I/O thread, enable the host I/O
caches and use synchronous file APIs on the host. This was the only option in the API before
VirtualBox 3.2 and is still the default for IDE controllers.

If false, the host I/O cache will be disabled for image files attached to this storage controller.
Instead, the storage controller emulation will use asynchronous I/O APIs on the host. This makes
it possible to turn off the host I/O caches because the emulation can handle unaligned access to
the file. This should be used on OS X and Linux hosts if a high I/O load is expected or many
virtual machines are running at the same time to prevent I/O cache related hangs.
This option new with the API of VirtualBox 3.2 and is now the default for non-IDE storage controllers.
@param value Boolean

*/
    public void setUseHostIOCache(Boolean value)
    {
        try
        {
        port.iStorageControllerSetUseHostIOCache(obj, value);
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
Returns whether it is possible to boot from disks attached to this controller.
@return Boolean
*/
    public Boolean getBootable()
    {
        try
        {
            Boolean retVal = port.iStorageControllerGetBootable(obj);
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
    public static IStorageController queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IStorageController(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

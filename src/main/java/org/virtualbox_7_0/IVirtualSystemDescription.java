
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
 * IVirtualSystemDescription.java
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
Represents one virtual system (machine) in an appliance. This interface is used in
the{@link org.virtualbox_7_0.IAppliance#getVirtualSystemDescriptions()}array. After{@link org.virtualbox_7_0.IAppliance#interpret()}has been called, that array contains information
about how the virtual systems described in the OVF should best be imported into
VirtualBox virtual machines. See{@link org.virtualbox_7_0.IAppliance}for the steps required to
import an OVF into VirtualBox.

Interface ID: <code>{01510F40-C196-4D26-B8DB-4C8C389F1F82}</code>
*/
public class IVirtualSystemDescription extends IUnknown
{

    public IVirtualSystemDescription(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Return the number of virtual system description entries.
@return Long
*/
    public Long getCount()
    {
        try
        {
            Long retVal = port.iVirtualSystemDescriptionGetCount(obj);
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
    public static IVirtualSystemDescription queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IVirtualSystemDescription(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Returns information about the virtual system as arrays of instruction items. In each array, the
items with the same indices correspond and jointly represent an import instruction for VirtualBox.

The list below identifies the value sets that are possible depending on the{@link org.virtualbox_7_0.VirtualSystemDescriptionType}enum value in the array item in  aTypes[]. In each case,
the array item with the same index in  OVFValues[] will contain the original value as contained
in the OVF file (just for informational purposes), and the corresponding item in  aVBoxValues[]
will contain a suggested value to be used for VirtualBox. Depending on the description type,
the  aExtraConfigValues[] array item may also be used.<ul><li>"OS": the guest operating system type. There must be exactly one such array item on import. The
corresponding item in  aVBoxValues[] contains the suggested guest operating system for VirtualBox.
This will be one of the values listed in{@link org.virtualbox_7_0.IVirtualBox#getGuestOSTypes()}. The corresponding
item in  OVFValues[] will contain a numerical value that described the operating system in the OVF.</li><li>"Name": the name to give to the new virtual machine. There can be at most one such array item;
if none is present on import, then an automatic name will be created from the operating system
type. The corresponding item im  OVFValues[] will contain the suggested virtual machine name
from the OVF file, and  aVBoxValues[] will contain a suggestion for a unique VirtualBox{@link org.virtualbox_7_0.IMachine}name that does not exist yet.</li><li>"Description": an arbitrary description.</li><li>"License": the EULA section from the OVF, if present. It is the responsibility of the calling
code to display such a license for agreement; the Main API does not enforce any such policy.</li><li>Miscellaneous: reserved for future use.</li><li>"CPU": the number of CPUs. There can be at most one such item, which will presently be ignored.</li><li>"Memory": the amount of guest RAM, in bytes. There can be at most one such array item; if none
is present on import, then VirtualBox will set a meaningful default based on the operating system
type.</li><li>"HardDiskControllerIDE": an IDE hard disk controller. There can be at most two such items.
An optional value in  OVFValues[] and  aVBoxValues[] can be "PIIX3" or "PIIX4" to specify
the type of IDE controller; this corresponds to the ResourceSubType element which VirtualBox
writes into the OVF.
The matching item in the  aRefs[] array will contain an integer that items of the "Harddisk"
type can use to specify which hard disk controller a virtual disk should be connected to.
Note that in OVF, an IDE controller has two channels, corresponding to "master" and "slave"
in traditional terminology, whereas the IDE storage controller that VirtualBox supports in
its virtual machines supports four channels (primary master, primary slave, secondary master,
secondary slave) and thus maps to two IDE controllers in the OVF sense.</li><li>"HardDiskControllerSATA": an SATA hard disk controller. There can be at most one such item. This
has no value in  OVFValues[] or  aVBoxValues[].
The matching item in the  aRefs[] array will be used as with IDE controllers (see above).</li><li>"HardDiskControllerSCSI": a SCSI hard disk controller. There can be at most one such item.
The items in  OVFValues[] and  aVBoxValues[] will either be "LsiLogic", "BusLogic" or
"LsiLogicSas". (Note that in OVF, the LsiLogicSas controller is treated as a SCSI controller
whereas VirtualBox considers it a class of storage controllers of its own; see{@link org.virtualbox_7_0.StorageControllerType}).
The matching item in the  aRefs[] array will be used as with IDE controllers (see above).</li><li>"HardDiskImage": a virtual hard disk, most probably as a reference to an image file. There can be an
arbitrary number of these items, one for each virtual disk image that accompanies the OVF.

The array item in  OVFValues[] will contain the file specification from the OVF file (without
a path since the image file should be in the same location as the OVF file itself), whereas the
item in  aVBoxValues[] will contain a qualified path specification to where VirtualBox uses the
hard disk image. This means that on import the image will be copied and converted from the
"ovf" location to the "vbox" location; on export, this will be handled the other way round.

The matching item in the  aExtraConfigValues[] array must contain a string of the following
format: "controller=&lt;index&gt;;channel=&lt;c&gt;"
In this string, &lt;index&gt; must be an integer specifying the hard disk controller to connect
the image to. That number must be the index of an array item with one of the hard disk controller
types (HardDiskControllerSCSI, HardDiskControllerSATA, HardDiskControllerIDE).
In addition, &lt;c&gt; must specify the channel to use on that controller. For IDE controllers,
this can be 0 or 1 for master or slave, respectively. For compatibility with VirtualBox versions
before 3.2, the values 2 and 3 (for secondary master and secondary slave) are also supported, but
no longer exported. For SATA and SCSI controllers, the channel can range from 0-29.</li><li>"CDROM": a virtual CD-ROM drive. The matching item in  aExtraConfigValue[] contains the same
attachment information as with "HardDiskImage" items.</li><li>"CDROM": a virtual floppy drive. The matching item in  aExtraConfigValue[] contains the same
attachment information as with "HardDiskImage" items.</li><li>"NetworkAdapter": a network adapter. The array item in  aVBoxValues[] will specify the hardware
for the network adapter, whereas the array item in  aExtraConfigValues[] will have a string
of the "type=&lt;X&gt;" format, where &lt;X&gt; must be either "NAT" or "Bridged".</li><li>"USBController": a USB controller. There can be at most one such item. If, and only if, such an
item is present, USB support will be enabled for the new virtual machine.</li><li>"SoundCard": a sound card. There can be at most one such item. If and only if such an item is
present, sound support will be enabled for the new virtual machine. Note that the virtual
machine in VirtualBox will always be presented with the standard VirtualBox soundcard, which
may be different from the virtual soundcard expected by the appliance.</li></ul>
*/
    public void getDescription(Holder<List<org.virtualbox_7_0.VirtualSystemDescriptionType>> types, Holder<List<String>> refs, Holder<List<String>> OVFValues, Holder<List<String>> VBoxValues, Holder<List<String>> extraConfigValues)
    {
        try
        {
        javax.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.VirtualSystemDescriptionType>> tmp_types = new javax.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.VirtualSystemDescriptionType>>();
        javax.xml.ws.Holder<List<String>> tmp_refs = new javax.xml.ws.Holder<List<String>>();
        javax.xml.ws.Holder<List<String>> tmp_OVFValues = new javax.xml.ws.Holder<List<String>>();
        javax.xml.ws.Holder<List<String>> tmp_VBoxValues = new javax.xml.ws.Holder<List<String>>();
        javax.xml.ws.Holder<List<String>> tmp_extraConfigValues = new javax.xml.ws.Holder<List<String>>();
        port.iVirtualSystemDescriptionGetDescription(obj, tmp_types, tmp_refs, tmp_OVFValues, tmp_VBoxValues, tmp_extraConfigValues);
        types.value = Helper.convertEnums(org.virtualbox_7_0.jaxws.VirtualSystemDescriptionType.class, org.virtualbox_7_0.VirtualSystemDescriptionType.class, tmp_types.value);
        refs.value = tmp_refs.value;
        OVFValues.value = tmp_OVFValues.value;
        VBoxValues.value = tmp_VBoxValues.value;
        extraConfigValues.value = tmp_extraConfigValues.value;
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
This is the same as{@link #getDescription(Holder,Holder,Holder,Holder,Holder)}except that you can specify which types
should be returned.
*/
    public void getDescriptionByType(org.virtualbox_7_0.VirtualSystemDescriptionType type, Holder<List<org.virtualbox_7_0.VirtualSystemDescriptionType>> types, Holder<List<String>> refs, Holder<List<String>> OVFValues, Holder<List<String>> VBoxValues, Holder<List<String>> extraConfigValues)
    {
        try
        {
        javax.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.VirtualSystemDescriptionType>> tmp_types = new javax.xml.ws.Holder<List<org.virtualbox_7_0.jaxws.VirtualSystemDescriptionType>>();
        javax.xml.ws.Holder<List<String>> tmp_refs = new javax.xml.ws.Holder<List<String>>();
        javax.xml.ws.Holder<List<String>> tmp_OVFValues = new javax.xml.ws.Holder<List<String>>();
        javax.xml.ws.Holder<List<String>> tmp_VBoxValues = new javax.xml.ws.Holder<List<String>>();
        javax.xml.ws.Holder<List<String>> tmp_extraConfigValues = new javax.xml.ws.Holder<List<String>>();
        port.iVirtualSystemDescriptionGetDescriptionByType(obj, org.virtualbox_7_0.jaxws.VirtualSystemDescriptionType.fromValue(type.name()), tmp_types, tmp_refs, tmp_OVFValues, tmp_VBoxValues, tmp_extraConfigValues);
        types.value = Helper.convertEnums(org.virtualbox_7_0.jaxws.VirtualSystemDescriptionType.class, org.virtualbox_7_0.VirtualSystemDescriptionType.class, tmp_types.value);
        refs.value = tmp_refs.value;
        OVFValues.value = tmp_OVFValues.value;
        VBoxValues.value = tmp_VBoxValues.value;
        extraConfigValues.value = tmp_extraConfigValues.value;
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
Delete all records which are equal to the passed type from the list
*/
    public void removeDescriptionByType(org.virtualbox_7_0.VirtualSystemDescriptionType type)
    {
        try
        {
        port.iVirtualSystemDescriptionRemoveDescriptionByType(obj, org.virtualbox_7_0.jaxws.VirtualSystemDescriptionType.fromValue(type.name()));
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
This is the same as{@link #getDescriptionByType(org.virtualbox_7_0.VirtualSystemDescriptionType,Holder,Holder,Holder,Holder,Holder)}except that you can specify which
value types should be returned. See{@link org.virtualbox_7_0.VirtualSystemDescriptionValueType}for possible
values.
*/
    public List<String> getValuesByType(org.virtualbox_7_0.VirtualSystemDescriptionType type, org.virtualbox_7_0.VirtualSystemDescriptionValueType which)
    {
        try
        {
            List<String> retVal;
        retVal = port.iVirtualSystemDescriptionGetValuesByType(obj, org.virtualbox_7_0.jaxws.VirtualSystemDescriptionType.fromValue(type.name()), org.virtualbox_7_0.jaxws.VirtualSystemDescriptionValueType.fromValue(which.name()));
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
This method allows the appliance's user to change the configuration for the virtual
system descriptions. For each array item returned from{@link #getDescription(Holder,Holder,Holder,Holder,Holder)},
you must pass in one boolean value and one configuration value.

Each item in the boolean array determines whether the particular configuration item
should be enabled.
You can only disable items of the types HardDiskControllerIDE, HardDiskControllerSATA,
HardDiskControllerSCSI, HardDiskImage, CDROM, Floppy, NetworkAdapter, USBController
and SoundCard.

For the "vbox" and "extra configuration" values, if you pass in the same arrays
as returned in the aVBoxValues and aExtraConfigValues arrays from{@link #getDescription(Holder,Holder,Holder,Holder,Holder)},
the configuration remains unchanged. Please see the documentation for{@link #getDescription(Holder,Holder,Holder,Holder,Holder)}for valid configuration values for the individual array item types. If the
corresponding item in the aEnabled array is  false, the configuration value is ignored.
*/
    public void setFinalValues(List<Boolean> enabled, List<String> VBoxValues, List<String> extraConfigValues)
    {
        try
        {
        port.iVirtualSystemDescriptionSetFinalValues(obj, enabled, VBoxValues, extraConfigValues);
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
This method adds an additional description entry to the stack of already
available descriptions for this virtual system. This is handy for writing
values which aren't directly supported by VirtualBox. One example would
be the License type of{@link org.virtualbox_7_0.VirtualSystemDescriptionType}.
*/
    public void addDescription(org.virtualbox_7_0.VirtualSystemDescriptionType type, String VBoxValue, String extraConfigValue)
    {
        try
        {
        port.iVirtualSystemDescriptionAddDescription(obj, org.virtualbox_7_0.jaxws.VirtualSystemDescriptionType.fromValue(type.name()), VBoxValue, extraConfigValue);
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

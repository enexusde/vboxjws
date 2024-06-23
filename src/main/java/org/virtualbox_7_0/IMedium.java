
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
 * IMedium.java
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
The IMedium interface represents virtual storage for a machine's
hard disks, CD/DVD or floppy drives. It will typically represent
a disk image on the host, for example a VDI or VMDK file representing
a virtual hard disk, or an ISO or RAW file representing virtual
removable media, but can also point to a network location (e.g.
for iSCSI targets).

Instances of IMedium are connected to virtual machines by way of medium
attachments, which link the storage medium to a particular device slot
of a storage controller of the virtual machine.
In the VirtualBox API, virtual storage is therefore always represented
by the following chain of object links:<ul><li>{@link org.virtualbox_7_0.IMachine#getStorageControllers()}contains an array of
storage controllers (IDE, SATA, SCSI, SAS or a floppy controller;
these are instances of{@link org.virtualbox_7_0.IStorageController}).</li><li>{@link org.virtualbox_7_0.IMachine#getMediumAttachments()}contains an array of
medium attachments (instances of{@link org.virtualbox_7_0.IMediumAttachment}created by{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}),
each containing a storage controller from the above array, a
port/device specification, and an instance of IMedium representing
the medium storage (image file).

For removable media, the storage medium is optional; a medium
attachment with no medium represents a CD/DVD or floppy drive
with no medium inserted. By contrast, hard disk attachments
will always have an IMedium object attached.</li><li>Each IMedium in turn points to a storage unit (such as a file
on the host computer or a network resource) that holds actual
data. This location is represented by the{@link #getLocation()}attribute.</li></ul>Existing media are opened using{@link org.virtualbox_7_0.IVirtualBox#openMedium(String,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.AccessMode,Boolean)};
new hard disk media can be created with the VirtualBox API using the{@link org.virtualbox_7_0.IVirtualBox#createMedium(String,String,org.virtualbox_7_0.AccessMode,org.virtualbox_7_0.DeviceType)}method. Differencing hard
disks (see below) are usually implicitly created by VirtualBox as
needed, but may also be created explicitly using{@link #createDiffStorage(org.virtualbox_7_0.IMedium,List)}.
VirtualBox cannot create CD/DVD or floppy images (ISO and RAW files); these
should be created with external tools and then opened from within VirtualBox.

Only for CD/DVDs and floppies, an IMedium instance can also represent a host
drive. In that case the{@link #getId()}attribute contains the UUID of
one of the drives in{@link org.virtualbox_7_0.IHost#getDVDDrives()}or{@link org.virtualbox_7_0.IHost#getFloppyDrives()}.<h2>Media registries</h2>When a medium has been opened or created using one of the aforementioned
APIs, it becomes "known" to VirtualBox. Known media can be attached
to virtual machines and re-found through{@link org.virtualbox_7_0.IVirtualBox#openMedium(String,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.AccessMode,Boolean)}.
They also appear in the global{@link org.virtualbox_7_0.IVirtualBox#getHardDisks()},{@link org.virtualbox_7_0.IVirtualBox#getDVDImages()}and{@link org.virtualbox_7_0.IVirtualBox#getFloppyImages()}arrays.

Prior to VirtualBox 4.0, opening a medium added it to a global media registry
in the VirtualBox.xml file, which was shared between all machines and made
transporting machines and their media from one host to another difficult.

Starting with VirtualBox 4.0, media are only added to a registry when they are<i>attached</i>to a machine using{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}. For
backwards compatibility, which registry a medium is added to depends on which
VirtualBox version created a machine:<ul><li>If the medium has first been attached to a machine which was created by
VirtualBox 4.0 or later, it is added to that machine's media registry in
the machine XML settings file. This way all information about a machine's
media attachments is contained in a single file and can be transported
easily.</li><li>For older media attachments (i.e. if the medium was first attached to a
machine which was created with a VirtualBox version before 4.0), media
continue to be registered in the global VirtualBox settings file, for
backwards compatibility.</li></ul>See{@link org.virtualbox_7_0.IVirtualBox#openMedium(String,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.AccessMode,Boolean)}for more information.

Media are removed from media registries by the{@link org.virtualbox_7_0.IMedium#close()},{@link #deleteStorage()}and{@link #mergeTo(org.virtualbox_7_0.IMedium)}methods.<h2>Accessibility checks</h2>VirtualBox defers media accessibility checks until the{@link #refreshState()}method is called explicitly on a medium. This is done to make the VirtualBox object
ready for serving requests as fast as possible and let the end-user
application decide if it needs to check media accessibility right away or not.

As a result, when VirtualBox starts up (e.g. the VirtualBox
object gets created for the first time), all known media are in the
"Inaccessible" state, but the value of the{@link #getLastAccessError()}attribute is an empty string because no actual accessibility check has
been made yet.

After calling{@link #refreshState()}, a medium is considered<i>accessible</i>if its storage unit can be read. In that case, the{@link #getState()}attribute has a value of "Created". If the storage
unit cannot be read (for example, because it is located on a disconnected
network resource, or was accidentally deleted outside VirtualBox),
the medium is considered<i>inaccessible</i>, which is indicated by the
"Inaccessible" state. The exact reason why the medium is inaccessible can be
obtained by reading the{@link #getLastAccessError()}attribute.<h2>Medium types</h2>There are five types of medium behavior which are stored in the{@link #getType()}attribute (see{@link org.virtualbox_7_0.MediumType}) and
which define the medium's behavior with attachments and snapshots.

All media can be also divided in two groups:<i>base</i>media and<i>differencing</i>media. A base medium contains all sectors of the
medium data in its own storage and therefore can be used independently.
In contrast, a differencing medium is a "delta" to some other medium and
contains only those sectors which differ from that other medium, which is
then called a<i>parent</i>. The differencing medium is said to be<i>linked to</i>that parent. The parent may be itself a differencing
medium, thus forming a chain of linked media. The last element in that
chain must always be a base medium. Note that several differencing
media may be linked to the same parent medium.

Differencing media can be distinguished from base media by querying the{@link #getParent()}attribute: base media do not have parents they would
depend on, so the value of this attribute is always  null for them.
Using this attribute, it is possible to walk up the medium tree (from the
child medium to its parent). It is also possible to walk down the tree
using the{@link #getChildren()}attribute.

Note that the type of all differencing media is "normal"; all other
values are meaningless for them. Base media may be of any type.<h2>Automatic composition of the file name part</h2>Another extension to the{@link org.virtualbox_7_0.IMedium#getLocation()}attribute is that
there is a possibility to cause VirtualBox to compose a unique value for
the file name part of the location using the UUID of the hard disk. This
applies only to hard disks in{@link org.virtualbox_7_0.MediumState#NotCreated}state,
e.g. before the storage unit is created, and works as follows. You set the
value of the{@link org.virtualbox_7_0.IMedium#getLocation()}attribute to a location
specification which only contains the path specification but not the file
name part and ends with either a forward slash or a backslash character.
In response, VirtualBox will generate a new UUID for the hard disk and
compose the file name using the following pattern:<pre>&lt;path&gt;/{&lt;uuid&gt;}.&lt;ext&gt;</pre>where<code>&lt;path&gt;</code>is the supplied path specification,<code>&lt;uuid&gt;</code>is the newly generated UUID and<code>&lt;ext&gt;</code>is the default extension for the storage format of this hard disk. After
that, you may call any of the methods that create a new hard disk storage
unit and they will use the generated UUID and file name.

Interface ID: <code>{AD47AD09-787B-44AB-B343-A082A3F2DFB1}</code>
*/
public class IMedium extends IUnknown
{

    public IMedium(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
UUID of the medium. For a newly created medium, this value is a randomly
generated UUID.
NOTE: For media in one of MediumState_NotCreated, MediumState_Creating or
MediumState_Deleting states, the value of this property is undefined
and will most likely be an empty UUID.

@return String
*/
    public String getId()
    {
        try
        {
            String retVal = port.iMediumGetId(obj);
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
Optional description of the medium. For a newly created medium the value
of this attribute is an empty string.

Medium types that don't support this attribute will return E_NOTIMPL in
attempt to get or set this attribute's value.
NOTE: For some storage types, reading this attribute may return an outdated
(last known) value when{@link #getState()}is{@link org.virtualbox_7_0.MediumState#Inaccessible}or{@link org.virtualbox_7_0.MediumState#LockedWrite}because the value of this attribute is
stored within the storage unit itself. Also note that changing the
attribute value is not possible in such case, as well as when the
medium is the{@link org.virtualbox_7_0.MediumState#LockedRead}state.

@return String
*/
    public String getDescription()
    {
        try
        {
            String retVal = port.iMediumGetDescription(obj);
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
Optional description of the medium. For a newly created medium the value
of this attribute is an empty string.

Medium types that don't support this attribute will return E_NOTIMPL in
attempt to get or set this attribute's value.
NOTE: For some storage types, reading this attribute may return an outdated
(last known) value when{@link #getState()}is{@link org.virtualbox_7_0.MediumState#Inaccessible}or{@link org.virtualbox_7_0.MediumState#LockedWrite}because the value of this attribute is
stored within the storage unit itself. Also note that changing the
attribute value is not possible in such case, as well as when the
medium is the{@link org.virtualbox_7_0.MediumState#LockedRead}state.

@param value String

*/
    public void setDescription(String value)
    {
        try
        {
        port.iMediumSetDescription(obj, value);
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
Returns the current medium state, which is the last state set by
the accessibility check performed by{@link #refreshState()}.
If that method has not yet been called on the medium, the state
is "Inaccessible"; as opposed to truly inaccessible media, the
value of{@link #getLastAccessError()}will be an empty string in
that case.
NOTE: As of version 3.1, this no longer performs an accessibility check
automatically; call{@link #refreshState()}for that.

@return org.virtualbox_7_0.MediumState
*/
    public org.virtualbox_7_0.MediumState getState()
    {
        try
        {
            org.virtualbox_7_0.jaxws.MediumState retVal = port.iMediumGetState(obj);
            return org.virtualbox_7_0.MediumState.fromValue(retVal.value());
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
Returns the storage format variant information for this medium
as an array of the flags described at{@link org.virtualbox_7_0.MediumVariant}.
Before{@link #refreshState()}is called this method returns
an undefined value.
@return List&lt;org.virtualbox_7_0.MediumVariant&gt;
*/
    public List<org.virtualbox_7_0.MediumVariant> getVariant()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.MediumVariant> retVal = port.iMediumGetVariant(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.MediumVariant.class, org.virtualbox_7_0.MediumVariant.class, retVal);
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
Location of the storage unit holding medium data.

The format of the location string is medium type specific. For medium
types using regular files in a host's file system, the location
string is the full file name.
@return String
*/
    public String getLocation()
    {
        try
        {
            String retVal = port.iMediumGetLocation(obj);
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
Location of the storage unit holding medium data.

The format of the location string is medium type specific. For medium
types using regular files in a host's file system, the location
string is the full file name.
@param value String

*/
    public void setLocation(String value)
    {
        try
        {
        port.iMediumSetLocation(obj, value);
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
Name of the storage unit holding medium data.

The returned string is a short version of the{@link #getLocation()}attribute that is suitable for representing the medium in situations
where the full location specification is too long (such as lists
and comboboxes in GUI frontends). This string is also used by frontends
to sort the media list alphabetically when needed.

For example, for locations that are regular files in the host's file
system, the value of this attribute is just the file name (+ extension),
without the path specification.

Note that as opposed to the{@link #getLocation()}attribute, the name
attribute will not necessary be unique for a list of media of the
given type and format.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iMediumGetName(obj);
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
Kind of device (DVD/Floppy/HardDisk) which is applicable to this
medium.
@return org.virtualbox_7_0.DeviceType
*/
    public org.virtualbox_7_0.DeviceType getDeviceType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.DeviceType retVal = port.iMediumGetDeviceType(obj);
            return org.virtualbox_7_0.DeviceType.fromValue(retVal.value());
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
True if this corresponds to a drive on the host.
@return Boolean
*/
    public Boolean getHostDrive()
    {
        try
        {
            Boolean retVal = port.iMediumGetHostDrive(obj);
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
Physical size of the storage unit used to hold medium data (in bytes).
NOTE: For media whose{@link #getState()}is{@link org.virtualbox_7_0.MediumState#Inaccessible}, the value of this property is the
last known size. For{@link org.virtualbox_7_0.MediumState#NotCreated}media,
the returned value is zero.

@return Long
*/
    public Long getSize()
    {
        try
        {
            Long retVal = port.iMediumGetSize(obj);
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
Storage format of this medium.

The value of this attribute is a string that specifies a backend used
to store medium data. The storage format is defined when you create a
new medium or automatically detected when you open an existing medium,
and cannot be changed later.

The list of all storage formats supported by this VirtualBox
installation can be obtained using{@link org.virtualbox_7_0.ISystemProperties#getMediumFormats()}.
@return String
*/
    public String getFormat()
    {
        try
        {
            String retVal = port.iMediumGetFormat(obj);
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
Storage medium format object corresponding to this medium.

The value of this attribute is a reference to the medium format object
that specifies the backend properties used to store medium data. The
storage format is defined when you create a new medium or automatically
detected when you open an existing medium, and cannot be changed later.
NOTE: null is returned if there is no associated medium format
object. This can e.g. happen for medium objects representing host
drives and other special medium objects.

@return org.virtualbox_7_0.IMediumFormat
*/
    public org.virtualbox_7_0.IMediumFormat getMediumFormat()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMediumGetMediumFormat(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IMediumFormat(retVal, getObjMgr(), port) : null;
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
Type (role) of this medium.

The following constraints apply when changing the value of this
attribute:<ul><li>If a medium is attached to a virtual machine (either in the
current state or in one of the snapshots), its type cannot be
changed.</li><li>As long as the medium has children, its type cannot be set
to{@link org.virtualbox_7_0.MediumType#Writethrough}.</li><li>The type of all differencing media is{@link org.virtualbox_7_0.MediumType#Normal}and cannot be changed.</li></ul>The type of a newly created or opened medium is set to{@link org.virtualbox_7_0.MediumType#Normal}, except for DVD and floppy media,
which have a type of{@link org.virtualbox_7_0.MediumType#Writethrough}.
@return org.virtualbox_7_0.MediumType
*/
    public org.virtualbox_7_0.MediumType getType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.MediumType retVal = port.iMediumGetType(obj);
            return org.virtualbox_7_0.MediumType.fromValue(retVal.value());
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
Type (role) of this medium.

The following constraints apply when changing the value of this
attribute:<ul><li>If a medium is attached to a virtual machine (either in the
current state or in one of the snapshots), its type cannot be
changed.</li><li>As long as the medium has children, its type cannot be set
to{@link org.virtualbox_7_0.MediumType#Writethrough}.</li><li>The type of all differencing media is{@link org.virtualbox_7_0.MediumType#Normal}and cannot be changed.</li></ul>The type of a newly created or opened medium is set to{@link org.virtualbox_7_0.MediumType#Normal}, except for DVD and floppy media,
which have a type of{@link org.virtualbox_7_0.MediumType#Writethrough}.
@param value org.virtualbox_7_0.MediumType

*/
    public void setType(org.virtualbox_7_0.MediumType value)
    {
        try
        {
        port.iMediumSetType(obj, org.virtualbox_7_0.jaxws.MediumType.fromValue(value.name()));
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
Returns which medium types can selected for this medium.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - This attribute is not implemented at the moment.</dd>
</dl>

@return List&lt;org.virtualbox_7_0.MediumType&gt;
*/
    public List<org.virtualbox_7_0.MediumType> getAllowedTypes()
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.MediumType> retVal = port.iMediumGetAllowedTypes(obj);
            return Helper.convertEnums(org.virtualbox_7_0.jaxws.MediumType.class, org.virtualbox_7_0.MediumType.class, retVal);
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
Parent of this medium (the medium this medium is directly based
on).

Only differencing media have parents. For base (non-differencing)
media,  null is returned.
@return org.virtualbox_7_0.IMedium
*/
    public org.virtualbox_7_0.IMedium getParent()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMediumGetParent(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IMedium(retVal, getObjMgr(), port) : null;
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
Children of this medium (all differencing media directly based
on this medium). A  null array is returned if this medium
does not have any children.
@return List&lt;org.virtualbox_7_0.IMedium&gt;
*/
    public List<org.virtualbox_7_0.IMedium> getChildren()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iMediumGetChildren(obj);
            return Helper.wrap(org.virtualbox_7_0.IMedium.class, getObjMgr(), port, retVal);
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
Base medium of this medium.

If this is a differencing medium, its base medium is the medium
the given medium branch starts from. For all other types of media, this
property returns the medium object itself (i.e. the same object this
property is read on).
@return org.virtualbox_7_0.IMedium
*/
    public org.virtualbox_7_0.IMedium getBase()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMediumGetBase(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IMedium(retVal, getObjMgr(), port) : null;
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
Returns  true if this medium is read-only and  false otherwise.

A medium is considered to be read-only when its contents cannot be
modified without breaking the integrity of other parties that depend on
this medium such as its child media or snapshots of virtual machines
where this medium is attached to these machines. If there are no
children and no such snapshots then there is no dependency and the
medium is not read-only.

The value of this attribute can be used to determine the kind of the
attachment that will take place when attaching this medium to a
virtual machine. If the value is  false then the medium will
be attached directly. If the value is  true then the medium
will be attached indirectly by creating a new differencing child
medium for that. See the interface description for more information.

Note that all{@link org.virtualbox_7_0.MediumType#Immutable}media
are always read-only while all{@link org.virtualbox_7_0.MediumType#Writethrough}media are
always not.
NOTE: The read-only condition represented by this attribute is related to
the medium type and usage, not to the current{@link org.virtualbox_7_0.IMedium#getState()}and not to the read-only
state of the storage unit.

@return Boolean
*/
    public Boolean getReadOnly()
    {
        try
        {
            Boolean retVal = port.iMediumGetReadOnly(obj);
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
Logical size of this medium (in bytes), as reported to the
guest OS running inside the virtual machine this medium is
attached to. The logical size is defined when the medium is created
and cannot be changed later.
NOTE: For media whose state is{@link #getState()}is{@link org.virtualbox_7_0.MediumState#Inaccessible}, the value of this property is the
last known logical size. For{@link org.virtualbox_7_0.MediumState#NotCreated}media, the returned value is zero.

@return Long
*/
    public Long getLogicalSize()
    {
        try
        {
            Long retVal = port.iMediumGetLogicalSize(obj);
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
Whether this differencing medium will be automatically reset each
time a virtual machine it is attached to is powered up. This
attribute is automatically set to  true for the last
differencing image of an "immutable" medium (see{@link org.virtualbox_7_0.MediumType}).

See{@link #reset()}for more information about resetting
differencing media.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - This is not a differencing medium (when changing the attribute
value).</dd>
</dl>

NOTE: Reading this property on a base (non-differencing) medium will
always  false. Changing the value of this property in this
case is not supported.

@return Boolean
*/
    public Boolean getAutoReset()
    {
        try
        {
            Boolean retVal = port.iMediumGetAutoReset(obj);
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
Whether this differencing medium will be automatically reset each
time a virtual machine it is attached to is powered up. This
attribute is automatically set to  true for the last
differencing image of an "immutable" medium (see{@link org.virtualbox_7_0.MediumType}).

See{@link #reset()}for more information about resetting
differencing media.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - This is not a differencing medium (when changing the attribute
value).</dd>
</dl>

NOTE: Reading this property on a base (non-differencing) medium will
always  false. Changing the value of this property in this
case is not supported.

@param value Boolean

*/
    public void setAutoReset(Boolean value)
    {
        try
        {
        port.iMediumSetAutoReset(obj, value);
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
Text message that represents the result of the last accessibility
check performed by{@link #refreshState()}.

An empty string is returned if the last accessibility check
was successful or has not yet been called. As a result, if{@link #getState()}is "Inaccessible" and this attribute is empty,
then{@link #refreshState()}has yet to be called; this is the
default value of media after VirtualBox initialization.
A non-empty string indicates a failure and should normally describe
a reason of the failure (for example, a file read error).
@return String
*/
    public String getLastAccessError()
    {
        try
        {
            String retVal = port.iMediumGetLastAccessError(obj);
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
Array of UUIDs of all machines this medium is attached to.

A  null array is returned if this medium is not attached to any
machine or to any machine's snapshot.
NOTE: The returned array will include a machine even if this medium is not
attached to that machine in the current state but attached to it in
one of the machine's snapshots. See{@link #getSnapshotIds(String)}for
details.

@return List&lt;String&gt;
*/
    public List<String> getMachineIds()
    {
        try
        {
            List<String> retVal = port.iMediumGetMachineIds(obj);
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
    public static IMedium queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IMedium(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Changes the UUID and parent UUID for a hard disk medium.
@param setImageId Select whether a new image UUID is set or not.

@param imageId New UUID for the image. If an empty string is passed, then a new
UUID is automatically created, provided that  setImageId is  true.
Specifying a zero UUID is not allowed.

@param setParentId Select whether a new parent UUID is set or not.

@param parentId New parent UUID for the image. If an empty string is passed, then a
new UUID is automatically created, provided  setParentId is
true. A zero UUID is valid.

*/
    public void setIds(Boolean setImageId, String imageId, Boolean setParentId, String parentId)
    {
        try
        {
        port.iMediumSetIds(obj, setImageId, imageId, setParentId, parentId);
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
If the current medium state (see{@link org.virtualbox_7_0.MediumState}) is one of
"Created", "Inaccessible" or "LockedRead", then this performs an
accessibility check on the medium and sets the value of the{@link #getState()}attribute accordingly; that value is also returned for convenience.

For all other state values, this does not perform a refresh but returns
the state only.

The refresh, if performed, may take a long time (several seconds or even
minutes, depending on the storage unit location and format) because it performs an
accessibility check of the storage unit. This check may cause a significant
delay if the storage unit of the given medium is, for example, a file located
on a network share which is not currently accessible due to connectivity
problems. In that case, the call will not return until a timeout
interval defined by the host OS for this operation expires. For this reason,
it is recommended to never read this attribute on the main UI thread to avoid
making the UI unresponsive.

If the last known state of the medium is "Created" and the accessibility
check fails, then the state would be set to "Inaccessible", and{@link #getLastAccessError()}may be used to get more details about the
failure. If the state of the medium is "LockedRead", then it remains the
same, and a non-empty value of{@link #getLastAccessError()}will
indicate a failed accessibility check in this case.

Note that not all medium states are applicable to all medium types.
@return New medium state.

*/
    public org.virtualbox_7_0.MediumState refreshState()
    {
        try
        {
            org.virtualbox_7_0.jaxws.MediumState retVal;
        retVal = port.iMediumRefreshState(obj);
           return org.virtualbox_7_0.MediumState.fromValue(retVal.value());
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
Returns an array of UUIDs of all snapshots of the given machine where
this medium is attached to.

If the medium is attached to the machine in the current state, then the
first element in the array will always be the ID of the queried machine
(i.e. the value equal to the  machineId argument), followed by
snapshot IDs (if any).

If the medium is not attached to the machine in the current state, then
the array will contain only snapshot IDs.

The returned array may be  null if this medium is not attached
to the given machine at all, neither in the current state nor in one of
the snapshots.
@param machineId UUID of the machine to query.

@return Array of snapshot UUIDs of the given machine using this medium.

*/
    public List<String> getSnapshotIds(String machineId)
    {
        try
        {
            List<String> retVal;
        retVal = port.iMediumGetSnapshotIds(obj, machineId);
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
Locks this medium for reading.

A read lock is shared: many clients can simultaneously lock the
same medium for reading unless it is already locked for writing (see{@link #lockWrite()}) in which case an error is returned.

When the medium is locked for reading, it cannot be modified
from within VirtualBox. This means that any method that changes
the properties of this medium or contents of the storage unit
will return an error (unless explicitly stated otherwise). That
includes an attempt to start a virtual machine that wants to
write to the medium.

When the virtual machine is started up, it locks for reading all
media it uses in read-only mode. If some medium cannot be locked
for reading, the startup procedure will fail.
A medium is typically locked for reading while it is used by a running
virtual machine but has a depending differencing image that receives
the actual write operations. This way one base medium can have
multiple child differencing images which can be written to
simultaneously. Read-only media such as DVD and floppy images are
also locked for reading only (so they can be in use by multiple
machines simultaneously).

A medium is also locked for reading when it is the source of a
write operation such as{@link #cloneTo(org.virtualbox_7_0.IMedium,List,org.virtualbox_7_0.IMedium)}or{@link #mergeTo(org.virtualbox_7_0.IMedium)}.

The medium locked for reading must be unlocked by abandoning the
returned token object, see{@link org.virtualbox_7_0.IToken}. Calls to{@link #lockRead()}can be nested and the lock is actually released
when all callers have abandoned the token.

This method sets the medium state (see{@link #getState()}) to
"LockedRead" on success. The medium's previous state must be
one of "Created", "Inaccessible" or "LockedRead".

Locking an inaccessible medium is not an error; this method performs
a logical lock that prevents modifications of this medium through
the VirtualBox API, not a physical file-system lock of the underlying
storage unit.

This method returns the current state of the medium<i>before</i>the operation.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Invalid medium state (e.g. not created, locked, inaccessible,
creating, deleting).</dd>
</dl>

@return Token object, when this is released (reference count reaches 0) then
the lock count is decreased. The lock is released when the lock count
reaches 0.

*/
    public org.virtualbox_7_0.IToken lockRead()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumLockRead(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IToken(retVal, getObjMgr(), port) : null;
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
Locks this medium for writing.

A write lock, as opposed to{@link #lockRead()}, is
exclusive: there may be only one client holding a write lock,
and there may be no read locks while the write lock is held.
As a result, read-locking fails if a write lock is held, and
write-locking fails if either a read or another write lock is held.

When a medium is locked for writing, it cannot be modified
from within VirtualBox, and it is not guaranteed that the values
of its properties are up-to-date. Any method that changes the
properties of this medium or contents of the storage unit will
return an error (unless explicitly stated otherwise).

When a virtual machine is started up, it locks for writing all
media it uses to write data to. If any medium could not be locked
for writing, the startup procedure will fail. If a medium has
differencing images, then while the machine is running, only
the last ("leaf") differencing image is locked for writing,
whereas its parents are locked for reading only.

A medium is also locked for writing when it is the target of a
write operation such as{@link #cloneTo(org.virtualbox_7_0.IMedium,List,org.virtualbox_7_0.IMedium)}or{@link #mergeTo(org.virtualbox_7_0.IMedium)}.

The medium locked for writing must be unlocked by abandoning the
returned token object, see{@link org.virtualbox_7_0.IToken}. Write locks<i>cannot</i>be nested.

This method sets the medium state (see{@link #getState()}) to
"LockedWrite" on success. The medium's previous state must be
either "Created" or "Inaccessible".

Locking an inaccessible medium is not an error; this method performs
a logical lock that prevents modifications of this medium through
the VirtualBox API, not a physical file-system lock of the underlying
storage unit.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Invalid medium state (e.g. not created, locked, inaccessible,
creating, deleting).</dd>
</dl>

@return Token object, when this is released (reference count reaches 0) then
the lock is released.

*/
    public org.virtualbox_7_0.IToken lockWrite()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumLockWrite(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IToken(retVal, getObjMgr(), port) : null;
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
Closes this medium.

The medium must not be attached to any known virtual machine
and must not have any known child media, otherwise the
operation will fail.

When the medium is successfully closed, it is removed from
the list of registered media, but its storage unit is not
deleted. In particular, this means that this medium can
later be opened again using the{@link org.virtualbox_7_0.IVirtualBox#openMedium(String,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.AccessMode,Boolean)}call.

Note that after this method successfully returns, the given medium
object becomes uninitialized. This means that any attempt
to call any of its methods or attributes will fail with the<code>"Object not ready" (E_ACCESSDENIED)</code>error.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Invalid medium state (other than not created, created or
inaccessible).</dd>
<dd><code>VBOX_E_OBJECT_IN_USE</code> - Medium attached to virtual machine.</dd>
<dd><code>VBOX_E_FILE_ERROR</code> - Settings file not accessible.</dd>
<dd><code>VBOX_E_XML_ERROR</code> - Could not parse the settings file.</dd>
</dl>

*/
    public void close()
    {
        try
        {
        port.iMediumClose(obj);
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
Returns the value of the custom medium property with the given name.

The list of all properties supported by the given medium format can
be obtained with{@link org.virtualbox_7_0.IMediumFormat#describeProperties(Holder,Holder,Holder,Holder,Holder)}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - Requested property does not exist (not supported by the format).</dd>
<dd><code>E_INVALIDARG</code> - name is  null or empty.</dd>
</dl>

@param name Name of the property to get.

@return Current property value.

NOTE: If this method returns an empty string in  value, the requested
property is supported but currently not assigned any value.

*/
    public String getProperty(String name)
    {
        try
        {
            String retVal;
        retVal = port.iMediumGetProperty(obj, name);
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
Sets the value of the custom medium property with the given name.

The list of all properties supported by the given medium format can
be obtained with{@link org.virtualbox_7_0.IMediumFormat#describeProperties(Holder,Holder,Holder,Holder,Holder)}.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - Requested property does not exist (not supported by the format).</dd>
<dd><code>E_INVALIDARG</code> - name is  null or empty.</dd>
</dl>

@param name Name of the property to set.

@param value Property value to set.

NOTE: Setting the property value to  null or an empty string is
equivalent to deleting the existing value. A default value (if it is
defined for this property) will be used by the format backend in this
case.

*/
    public void setProperty(String name, String value)
    {
        try
        {
        port.iMediumSetProperty(obj, name, value);
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
Returns values for a group of properties in one call.

The names of the properties to get are specified using the  names
argument which is a list of comma-separated property names or
an empty string if all properties are to be returned.The list of all properties supported by the given medium format can
be obtained with{@link org.virtualbox_7_0.IMediumFormat#describeProperties(Holder,Holder,Holder,Holder,Holder)}.

The method returns two arrays, the array of property names corresponding
to the  names argument and the current values of these properties.
Both arrays have the same number of elements with each element at the
given index in the first array corresponds to an element at the same
index in the second array.

For properties that do not have assigned values, an empty string is
returned at the appropriate index in the  returnValues array.
@param names Names of properties to get.

@param returnNames Names of returned properties.

@return Values of returned properties.

NOTE: Currently the value of this argument is ignored and the method
always returns all existing properties.

*/
    public List<String> getProperties(String names, Holder<List<String>> returnNames)
    {
        try
        {
        jakarta.xml.ws.Holder<List<String>> tmp_returnNames = new jakarta.xml.ws.Holder<List<String>>();
        jakarta.xml.ws.Holder<List<String>> retVal = new jakarta.xml.ws.Holder<List<String>>();
        port.iMediumGetProperties(obj, names, tmp_returnNames, retVal);
        returnNames.value = tmp_returnNames.value;
           return retVal.value;
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
Sets values for a group of properties in one call.

The names of the properties to set are passed in the  names
array along with the new values for them in the  values array. Both
arrays have the same number of elements with each element at the given
index in the first array corresponding to an element at the same index
in the second array.

If there is at least one property name in  names that is not valid,
the method will fail before changing the values of any other properties
from the  names array.

Using this method over{@link #setProperty(String,String)}is preferred if you
need to set several properties at once since it is more efficient.

The list of all properties supported by the given medium format can
be obtained with{@link org.virtualbox_7_0.IMediumFormat#describeProperties(Holder,Holder,Holder,Holder,Holder)}.

Setting the property value to  null or an empty string is equivalent
to deleting the existing value. A default value (if it is defined for
this property) will be used by the format backend in this case.
@param names Names of properties to set.

@param values Values of properties to set.

*/
    public void setProperties(List<String> names, List<String> values)
    {
        try
        {
        port.iMediumSetProperties(obj, names, values);
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
Starts creating a hard disk storage unit (fixed/dynamic, according
to the variant flags) in the background. The previous storage unit
created for this object, if any, must first be deleted using{@link #deleteStorage()}, otherwise the operation will fail.

Before the operation starts, the medium is placed in{@link org.virtualbox_7_0.MediumState#Creating}state. If the create operation
fails, the medium will be placed back in{@link org.virtualbox_7_0.MediumState#NotCreated}state.

After the returned progress object reports that the operation has
successfully completed, the medium state will be set to{@link org.virtualbox_7_0.MediumState#Created}, the medium will be remembered by this
VirtualBox installation and may be attached to virtual machines.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - The variant of storage creation operation is not supported. See{@link org.virtualbox_7_0.IMediumFormat#getCapabilities()}.</dd>
</dl>

@param logicalSize Maximum logical size of the medium in bytes.

@param variant Exact image variant which should be created (as a combination of{@link org.virtualbox_7_0.MediumVariant}flags).

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress createBaseStorage(Long logicalSize, List<org.virtualbox_7_0.MediumVariant> variant)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumCreateBaseStorage(obj, logicalSize, Helper.convertEnums(org.virtualbox_7_0.MediumVariant.class, org.virtualbox_7_0.jaxws.MediumVariant.class, variant));
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Starts deleting the storage unit of this medium.

The medium must not be attached to any known virtual machine and must
not have any known child media, otherwise the operation will fail.
It will also fail if there is no storage unit to delete or if deletion
is already in progress, or if the medium is being in use (locked for
read or for write) or inaccessible. Therefore, the only valid state for
this operation to succeed is{@link org.virtualbox_7_0.MediumState#Created}.

Before the operation starts, the medium is placed in{@link org.virtualbox_7_0.MediumState#Deleting}state and gets removed from the list
of remembered hard disks (media registry). If the delete operation
fails, the medium will be remembered again and placed back to{@link org.virtualbox_7_0.MediumState#Created}state.

After the returned progress object reports that the operation is
complete, the medium state will be set to{@link org.virtualbox_7_0.MediumState#NotCreated}and you will be able to use one of
the storage creation methods to create it again.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_IN_USE</code> - Medium is attached to a virtual machine.</dd>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Storage deletion is not allowed because neither of storage creation
operations are supported. See{@link org.virtualbox_7_0.IMediumFormat#getCapabilities()}.</dd>
</dl>

@return Progress object to track the operation completion.

NOTE: If the deletion operation fails, it is not guaranteed that the storage
unit still exists. You may check the{@link org.virtualbox_7_0.IMedium#getState()}value
to answer this question.

@see #close()

*/
    public org.virtualbox_7_0.IProgress deleteStorage()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumDeleteStorage(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Starts creating an empty differencing storage unit based on this
medium in the format and at the location defined by the  target
argument.

The target medium must be in{@link org.virtualbox_7_0.MediumState#NotCreated}state (i.e. must not have an existing storage unit). Upon successful
completion, this operation will set the type of the target medium to{@link org.virtualbox_7_0.MediumType#Normal}and create a storage unit necessary to
represent the differencing medium data in the given format (according
to the storage format of the target object).

After the returned progress object reports that the operation is
successfully complete, the target medium gets remembered by this
VirtualBox installation and may be attached to virtual machines.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_IN_USE</code> - Medium not in  NotCreated state.</dd>
</dl>

@param target Target medium.

@param variant Exact image variant which should be created (as a combination of{@link org.virtualbox_7_0.MediumVariant}flags).

@return Progress object to track the operation completion.

NOTE: The medium will be set to{@link org.virtualbox_7_0.MediumState#LockedRead}state for the duration of this operation.

*/
    public org.virtualbox_7_0.IProgress createDiffStorage(org.virtualbox_7_0.IMedium target, List<org.virtualbox_7_0.MediumVariant> variant)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumCreateDiffStorage(obj, ((target == null) ? null :target.getWrapped()), Helper.convertEnums(org.virtualbox_7_0.MediumVariant.class, org.virtualbox_7_0.jaxws.MediumVariant.class, variant));
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Starts merging the contents of this medium and all intermediate
differencing media in the chain to the given target medium.

The target medium must be either a descendant of this medium or
its ancestor (otherwise this method will immediately return a failure).
It follows that there are two logical directions of the merge operation:
from ancestor to descendant (<i>forward merge</i>) and from descendant to
ancestor (<i>backward merge</i>). Let us consider the following medium
chain:<pre>Base &lt;- Diff_1 &lt;- Diff_2</pre>Here, calling this method on the<code>Base</code>medium object with<code>Diff_2</code>as an argument will be a forward merge; calling it on<code>Diff_2</code>with<code>Base</code>as an argument will be a backward
merge. Note that in both cases the contents of the resulting medium
will be the same, the only difference is the medium object that takes
the result of the merge operation. In case of the forward merge in the
above example, the result will be written to<code>Diff_2</code>; in case of
the backward merge, the result will be written to<code>Base</code>. In
other words, the result of the operation is always stored in the target
medium.

Upon successful operation completion, the storage units of all media in
the chain between this (source) medium and the target medium, including
the source medium itself, will be automatically deleted and the
relevant medium objects (including this medium) will become
uninitialized. This means that any attempt to call any of
their methods or attributes will fail with the<code>"Object not ready" (E_ACCESSDENIED)</code>error. Applied to the above
example, the forward merge of<code>Base</code>to<code>Diff_2</code>will
delete and uninitialize both<code>Base</code>and<code>Diff_1</code>media.
Note that<code>Diff_2</code>in this case will become a base medium
itself since it will no longer be based on any other medium.

Considering the above, all of the following conditions must be met in
order for the merge operation to succeed:<ul><li>Neither this (source) medium nor any intermediate
differencing medium in the chain between it and the target
medium is attached to any virtual machine.</li><li>Neither the source medium nor the target medium is an{@link org.virtualbox_7_0.MediumType#Immutable}medium.</li><li>The part of the medium tree from the source medium to the
target medium is a linear chain, i.e. all medium in this
chain have exactly one child which is the next medium in this
chain. The only exception from this rule is the target medium in
the forward merge operation; it is allowed to have any number of
child media because the merge operation will not change its
logical contents (as it is seen by the guest OS or by children).</li><li>None of the involved media are in{@link org.virtualbox_7_0.MediumState#LockedRead}or{@link org.virtualbox_7_0.MediumState#LockedWrite}state.</li></ul>
@param target Target medium.

@return Progress object to track the operation completion.

NOTE: This (source) medium and all intermediates will be placed to{@link org.virtualbox_7_0.MediumState#Deleting}state and the target medium will be
placed to{@link org.virtualbox_7_0.MediumState#LockedWrite}state and for the
duration of this operation.

*/
    public org.virtualbox_7_0.IProgress mergeTo(org.virtualbox_7_0.IMedium target)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumMergeTo(obj, ((target == null) ? null :target.getWrapped()));
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Starts creating a clone of this medium in the format and at the
location defined by the  target argument.

The target medium must be either in{@link org.virtualbox_7_0.MediumState#NotCreated}state (i.e. must not have an existing storage unit) or in{@link org.virtualbox_7_0.MediumState#Created}state (i.e. created and not locked, and
big enough to hold the data or else the copy will be partial). Upon
successful completion, the cloned medium will contain exactly the
same sector data as the medium being cloned, except that in the
first case a new UUID for the clone will be randomly generated, and in
the second case the UUID will remain unchanged.

The  parent argument defines which medium will be the parent
of the clone. Passing a  null reference indicates that the clone will
be a base image, i.e. completely independent. It is possible to specify
an arbitrary medium for this parameter, including the parent of the
medium which is being cloned. Even cloning to a child of the source
medium is possible. Note that when cloning to an existing image, the
parent argument is ignored.

After the returned progress object reports that the operation is
successfully complete, the target medium gets remembered by this
VirtualBox installation and may be attached to virtual machines.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The specified cloning variant is not supported at the moment.</dd>
</dl>

@param target Target medium.

@param variant Exact image variant which should be created (as a combination of{@link org.virtualbox_7_0.MediumVariant}flags).

@param parent Parent of the cloned medium.

@return Progress object to track the operation completion.

NOTE: This medium will be placed to{@link org.virtualbox_7_0.MediumState#LockedRead}state for the duration of this operation.

*/
    public org.virtualbox_7_0.IProgress cloneTo(org.virtualbox_7_0.IMedium target, List<org.virtualbox_7_0.MediumVariant> variant, org.virtualbox_7_0.IMedium parent)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumCloneTo(obj, ((target == null) ? null :target.getWrapped()), Helper.convertEnums(org.virtualbox_7_0.MediumVariant.class, org.virtualbox_7_0.jaxws.MediumVariant.class, variant), ((parent == null) ? null :parent.getWrapped()));
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Starts creating a clone of this medium in the format and at the
location defined by the  target argument.

The target medium must be either in{@link org.virtualbox_7_0.MediumState#NotCreated}state (i.e. must not have an existing storage unit) or in{@link org.virtualbox_7_0.MediumState#Created}state (i.e. created and not locked, and
big enough to hold the data or else the copy will be partial). Upon
successful completion, the cloned medium will contain exactly the
same sector data as the medium being cloned, except that in the
first case a new UUID for the clone will be randomly generated, and in
the second case the UUID will remain unchanged.

The  parent argument defines which medium will be the parent
of the clone. In this case the clone will be a base image, i.e.
completely independent. It is possible to specify an arbitrary
medium for this parameter, including the parent of the
medium which is being cloned. Even cloning to a child of the source
medium is possible. Note that when cloning to an existing image, the
parent argument is ignored.

After the returned progress object reports that the operation is
successfully complete, the target medium gets remembered by this
VirtualBox installation and may be attached to virtual machines.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The specified cloning variant is not supported at the moment.</dd>
</dl>

@param target Target medium.

@param variant {@link org.virtualbox_7_0.MediumVariant}flags).

@return Progress object to track the operation completion.

NOTE: This medium will be placed to{@link org.virtualbox_7_0.MediumState#LockedRead}state for the duration of this operation.

*/
    public org.virtualbox_7_0.IProgress cloneToBase(org.virtualbox_7_0.IMedium target, List<org.virtualbox_7_0.MediumVariant> variant)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumCloneToBase(obj, ((target == null) ? null :target.getWrapped()), Helper.convertEnums(org.virtualbox_7_0.MediumVariant.class, org.virtualbox_7_0.jaxws.MediumVariant.class, variant));
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Changes the location of this medium. Some medium types may support
changing the storage unit location by simply changing the value of the
associated property. In this case the operation is performed
immediately, and  progress is returning a  null reference.
Otherwise on success there is a progress object returned, which
signals progress and completion of the operation. This distinction is
necessary because for some formats the operation is very fast, while
for others it can be very slow (moving the image file by copying all
data), and in the former case it'd be a waste of resources to create
a progress object which will immediately signal completion.

When setting a location for a medium which corresponds to a/several
regular file(s) in the host's file system, the given file name may be
either relative to the{@link org.virtualbox_7_0.IVirtualBox#getHomeFolder()}or absolute. Note that if the given location
specification does not contain the file extension part then a proper
default extension will be automatically appended by the implementation
depending on the medium type.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The operation is not implemented yet.</dd>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Medium format does not support changing the location.</dd>
</dl>

@param location New location.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress moveTo(String location)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumMoveTo(obj, location);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Starts compacting of this medium. This means that the medium is
transformed into a possibly more compact storage representation.
This potentially creates temporary images, which can require a
substantial amount of additional disk space.

This medium will be placed to{@link org.virtualbox_7_0.MediumState#LockedWrite}state and all its parent media (if any) will be placed to{@link org.virtualbox_7_0.MediumState#LockedRead}state for the duration of this
operation.

Please note that the results can be either returned straight away,
or later as the result of the background operation via the object
returned via the  progress parameter.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Medium format does not support compacting (but potentially
needs it).</dd>
</dl>

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress compact()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumCompact(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Starts resizing this medium. This means that the nominal size of the
medium is set to the new value. Both increasing and decreasing the
size is possible, and there are no safety checks, since VirtualBox
does not make any assumptions about the medium contents.

Resizing usually needs additional disk space, and possibly also
some temporary disk space. Note that resize does not create a full
temporary copy of the medium, so the additional disk space requirement
is usually much lower than using the clone operation.

This medium will be placed to{@link org.virtualbox_7_0.MediumState#LockedWrite}state for the duration of this operation.

Please note that the results can be either returned straight away,
or later as the result of the background operation via the object
returned via the  progress parameter.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Medium format does not support resizing.</dd>
</dl>

@param logicalSize New nominal capacity of the medium in bytes.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress resize(Long logicalSize)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumResize(obj, logicalSize);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Starts erasing the contents of this differencing medium.

This operation will reset the differencing medium to its initial
state when it does not contain any sector data and any read operation is
redirected to its parent medium. This automatically gets called
during VM power-up for every medium whose{@link #getAutoReset()}attribute is  true.

The medium will be write-locked for the duration of this operation (see{@link #lockWrite()}).
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - This is not a differencing medium.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Medium is not in{@link org.virtualbox_7_0.MediumState#Created}or{@link org.virtualbox_7_0.MediumState#Inaccessible}state.</dd>
</dl>

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress reset()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumReset(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Starts encryption of this medium. This means that the stored data in the
medium is encrypted.

This medium will be placed to{@link org.virtualbox_7_0.MediumState#LockedWrite}state.

Please note that the results can be either returned straight away,
or later as the result of the background operation via the object
returned via the  progress parameter.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Encryption is not supported for this medium because it is attached to more than one VM
or has children.</dd>
</dl>

@param currentPassword The current password the medium is protected with. Use an empty string to indicate
that the medium isn't encrypted.

@param cipher The cipher to use for encryption. An empty string indicates no encryption for the
result.

@param newPassword The new password the medium should be protected with. An empty password and password ID
will result in the medium being encrypted with the current password.

@param newPasswordId The ID of the new password when unlocking the medium.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress changeEncryption(String currentPassword, String cipher, String newPassword, String newPasswordId)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumChangeEncryption(obj, currentPassword, cipher, newPassword, newPasswordId);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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
Returns the encryption settings for this medium.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Encryption is not configured for this medium.</dd>
</dl>

@param cipher The cipher used for encryption.

@return The ID of the password when unlocking the medium.

*/
    public String getEncryptionSettings(Holder<String> cipher)
    {
        try
        {
        jakarta.xml.ws.Holder<String> tmp_cipher = new jakarta.xml.ws.Holder<String>();
        jakarta.xml.ws.Holder<String> retVal = new jakarta.xml.ws.Holder<String>();
        port.iMediumGetEncryptionSettings(obj, tmp_cipher, retVal);
        cipher.value = tmp_cipher.value;
           return retVal.value;
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
Checks whether the supplied password is correct for the medium.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - Encryption is not configured for this medium.</dd>
<dd><code>VBOX_E_PASSWORD_INCORRECT</code> - The given password is incorrect.</dd>
</dl>

@param password The password to check.

*/
    public void checkEncryptionPassword(String password)
    {
        try
        {
        port.iMediumCheckEncryptionPassword(obj, password);
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
Open the medium for I/O.
@param writable Set this to open the medium for both reading and writing.  When
not set the medium is opened readonly.

@param password Password for accessing an encrypted medium. Must be empty if not encrypted.

@return Medium I/O object.

*/
    public org.virtualbox_7_0.IMediumIO openForIO(Boolean writable, String password)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumOpenForIO(obj, writable, password);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IMediumIO(retVal, getObjMgr(), port) : null;
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
This is a helper function that combines the functionality of{@link org.virtualbox_7_0.IMedium#cloneTo(org.virtualbox_7_0.IMedium,List,org.virtualbox_7_0.IMedium)}and{@link org.virtualbox_7_0.IMedium#resize(Long)}. The target medium will take the
contents of the calling medium.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The specified cloning variant is not supported at the moment.</dd>
</dl>

@param target Target medium.

@param logicalSize New nominal capacity of the medium in bytes.

@param variant Exact image variant which should be created (as a combination of{@link org.virtualbox_7_0.MediumVariant}flags).

@param parent Parent of the cloned medium.

@return Progress object to track the operation completion.

NOTE: Method will be moved to appropriate location at the next major API release.

*/
    public org.virtualbox_7_0.IProgress resizeAndCloneTo(org.virtualbox_7_0.IMedium target, Long logicalSize, List<org.virtualbox_7_0.MediumVariant> variant, org.virtualbox_7_0.IMedium parent)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iMediumResizeAndCloneTo(obj, ((target == null) ? null :target.getWrapped()), logicalSize, Helper.convertEnums(org.virtualbox_7_0.MediumVariant.class, org.virtualbox_7_0.jaxws.MediumVariant.class, variant), ((parent == null) ? null :parent.getWrapped()));
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal, getObjMgr(), port) : null;
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

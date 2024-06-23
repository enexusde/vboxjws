
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
 * IMediumAttachment.java
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
The IMediumAttachment interface links storage media to virtual machines.
For each medium ({@link org.virtualbox_7_0.IMedium}) which has been attached to a
storage controller ({@link org.virtualbox_7_0.IStorageController}) of a machine
({@link org.virtualbox_7_0.IMachine}) via the{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}method, one instance of IMediumAttachment is added to the machine's{@link org.virtualbox_7_0.IMachine#getMediumAttachments()}array attribute.

Each medium attachment specifies the storage controller as well as a
port and device number and the IMedium instance representing a virtual
hard disk or floppy or DVD image.

For removable media (DVDs or floppies), there are two additional
options. For one, the IMedium instance can be  null to represent
an empty drive with no media inserted (see{@link org.virtualbox_7_0.IMachine#mountMedium(String,Integer,Integer,org.virtualbox_7_0.IMedium,Boolean)});
secondly, the medium can be one of the pseudo-media for host drives
listed in{@link org.virtualbox_7_0.IHost#getDVDDrives()}or{@link org.virtualbox_7_0.IHost#getFloppyDrives()}.<h2>Attaching Hard Disks</h2>Hard disks are attached to virtual machines using the{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}method and detached using the{@link org.virtualbox_7_0.IMachine#detachDevice(String,Integer,Integer)}method. Depending on a medium's
type (see{@link org.virtualbox_7_0.IMedium#getType()}), hard disks are attached either<i>directly</i>or<i>indirectly</i>.

When a hard disk is being attached directly, it is associated with the
virtual machine and used for hard disk operations when the machine is
running. When a hard disk is being attached indirectly, a new differencing
hard disk linked to it is implicitly created and this differencing hard
disk is associated with the machine and used for hard disk operations.
This also means that if{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}performs
a direct attachment then the same hard disk will be returned in response
to the subsequent{@link org.virtualbox_7_0.IMachine#getMedium(String,Integer,Integer)}call; however if
an indirect attachment is performed then{@link org.virtualbox_7_0.IMachine#getMedium(String,Integer,Integer)}will return the implicitly created
differencing hard disk, not the original one passed to{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}. In detail:<ul><li><b>Normal base</b>hard disks that do not have children (i.e.
differencing hard disks linked to them) and that are not already
attached to virtual machines in snapshots are attached<b>directly</b>.
Otherwise, they are attached<b>indirectly</b>because having
dependent children or being part of the snapshot makes it impossible
to modify hard disk contents without breaking the integrity of the
dependent party. The{@link org.virtualbox_7_0.IMedium#getReadOnly()}attribute allows to
quickly determine the kind of the attachment for the given hard
disk. Note that if a normal base hard disk is to be indirectly
attached to a virtual machine with snapshots then a special
procedure called<i>smart attachment</i>is performed (see below).</li><li><b>Normal differencing</b>hard disks are like normal base hard disks:
they are attached<b>directly</b>if they do not have children and are
not attached to virtual machines in snapshots, and<b>indirectly</b>otherwise. Note that the smart attachment procedure is never performed
for differencing hard disks.</li><li><b>Immutable</b>hard disks are always attached<b>indirectly</b>because
they are designed to be non-writable. If an immutable hard disk is
attached to a virtual machine with snapshots then a special
procedure called smart attachment is performed (see below).</li><li><b>Writethrough</b>hard disks are always attached<b>directly</b>,
also as designed. This also means that writethrough hard disks cannot
have other hard disks linked to them at all.</li><li><b>Shareable</b>hard disks are always attached<b>directly</b>,
also as designed. This also means that shareable hard disks cannot
have other hard disks linked to them at all. They behave almost
like writethrough hard disks, except that shareable hard disks can
be attached to several virtual machines which are running, allowing
concurrent accesses. You need special cluster software running in
the virtual machines to make use of such disks.</li></ul>Note that the same hard disk, regardless of its type, may be attached to
more than one virtual machine at a time. In this case, the machine that is
started first gains exclusive access to the hard disk and attempts to
start other machines having this hard disk attached will fail until the
first machine is powered down.

Detaching hard disks is performed in a<i>deferred</i>fashion. This means
that the given hard disk remains associated with the given machine after a
successful{@link org.virtualbox_7_0.IMachine#detachDevice(String,Integer,Integer)}call until{@link org.virtualbox_7_0.IMachine#saveSettings()}is called to save all changes to
machine settings to disk. This deferring is necessary to guarantee that
the hard disk configuration may be restored at any time by a call to{@link org.virtualbox_7_0.IMachine#discardSettings()}before the settings
are saved (committed).

Note that if{@link org.virtualbox_7_0.IMachine#discardSettings()}is called after
indirectly attaching some hard disks to the machine but before a call to{@link org.virtualbox_7_0.IMachine#saveSettings()}is made, it will implicitly delete
all differencing hard disks implicitly created by{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}for these indirect attachments.
Such implicitly created hard disks will also be immediately deleted when
detached explicitly using the{@link org.virtualbox_7_0.IMachine#detachDevice(String,Integer,Integer)}call if it is made before{@link org.virtualbox_7_0.IMachine#saveSettings()}. This
implicit deletion is safe because newly created differencing hard
disks do not contain any user data.

However, keep in mind that detaching differencing hard disks that were
implicitly created by{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}before the last{@link org.virtualbox_7_0.IMachine#saveSettings()}call will<b>not</b>implicitly delete them as they may already contain some data
(for example, as a result of virtual machine execution). If these hard
disks are no more necessary, the caller can always delete them explicitly
using{@link org.virtualbox_7_0.IMedium#deleteStorage()}after they are actually de-associated
from this machine by the{@link org.virtualbox_7_0.IMachine#saveSettings()}call.<h2>Smart Attachment</h2>When normal base or immutable hard disks are indirectly attached to a
virtual machine then some additional steps are performed to make sure the
virtual machine will have the most recent "view" of the hard disk being
attached. These steps include walking through the machine's snapshots
starting from the current one and going through ancestors up to the first
snapshot. Hard disks attached to the virtual machine in all
of the encountered snapshots are checked whether they are descendants of
the given normal base or immutable hard disk. The first found child (which
is the differencing hard disk) will be used instead of the normal base or
immutable hard disk as a parent for creating a new differencing hard disk
that will be actually attached to the machine. And only if no descendants
are found or if the virtual machine does not have any snapshots then the
normal base or immutable hard disk will be used itself as a parent for
this differencing hard disk.

It is easier to explain what smart attachment does using the
following example:<pre>BEFORE attaching B.vdi:       AFTER attaching B.vdi:

Snapshot 1 (B.vdi)            Snapshot 1 (B.vdi)
Snapshot 2 (D1-&gt;B.vdi)        Snapshot 2 (D1-&gt;B.vdi)
Snapshot 3 (D2-&gt;D1.vdi)       Snapshot 3 (D2-&gt;D1.vdi)
Snapshot 4 (none)             Snapshot 4 (none)
CurState   (none)             CurState   (D3-&gt;D2.vdi)

NOT
...
CurState   (D3-&gt;B.vdi)</pre>The first column is the virtual machine configuration before the base hard
disk<code>B.vdi</code>is attached, the second column shows the machine after
this hard disk is attached. Constructs like<code>D1-&gt;B.vdi</code>and similar
mean that the hard disk that is actually attached to the machine is a
differencing hard disk,<code>D1.vdi</code>, which is linked to (based on)
another hard disk,<code>B.vdi</code>.

As we can see from the example, the hard disk<code>B.vdi</code>was detached
from the machine before taking Snapshot 4. Later, after Snapshot 4 was
taken, the user decides to attach<code>B.vdi</code>again.<code>B.vdi</code>has
dependent child hard disks (<code>D1.vdi</code>,<code>D2.vdi</code>), therefore
it cannot be attached directly and needs an indirect attachment (i.e.
implicit creation of a new differencing hard disk). Due to the smart
attachment procedure, the new differencing hard disk
(<code>D3.vdi</code>) will be based on<code>D2.vdi</code>, not on<code>B.vdi</code>itself, since<code>D2.vdi</code>is the most recent view of<code>B.vdi</code>existing for this snapshot branch of the given virtual
machine.

Note that if there is more than one descendant hard disk of the given base
hard disk found in a snapshot, and there is an exact device, channel and
bus match, then this exact match will be used. Otherwise, the youngest
descendant will be picked up.

There is one more important aspect of the smart attachment procedure which
is not related to snapshots at all. Before walking through the snapshots
as described above, the backup copy of the current list of hard disk
attachment is searched for descendants. This backup copy is created when
the hard disk configuration is changed for the first time after the last{@link org.virtualbox_7_0.IMachine#saveSettings()}call and used by{@link org.virtualbox_7_0.IMachine#discardSettings()}to undo the recent hard disk
changes. When such a descendant is found in this backup copy, it will be
simply re-attached back, without creating a new differencing hard disk for
it. This optimization is necessary to make it possible to re-attach the
base or immutable hard disk to a different bus, channel or device slot
without losing the contents of the differencing hard disk actually
attached to the machine in place of it.

Interface ID: <code>{8D095CB0-0126-43E0-B05D-326E74ABB356}</code>
*/
public class IMediumAttachment
{

    private org.virtualbox_7_0.jaxws.IMediumAttachment real;
    private VboxPortType port;
    private ObjectRefManager objMgr;
    private org.virtualbox_7_0.IMachine machine;
    private org.virtualbox_7_0.IMedium medium;
    private org.virtualbox_7_0.IBandwidthGroup bandwidthGroup;

    public IMediumAttachment(org.virtualbox_7_0.jaxws.IMediumAttachment real, ObjectRefManager objMgr, VboxPortType port)
    {
        this.real = real;
        this.port = port;
        this.objMgr = objMgr;
        machine = (real.getMachine().length() > 0) ? new org.virtualbox_7_0.IMachine(real.getMachine(), getObjMgr(), port) : null;
        medium = (real.getMedium().length() > 0) ? new org.virtualbox_7_0.IMedium(real.getMedium(), getObjMgr(), port) : null;
        bandwidthGroup = (real.getBandwidthGroup().length() > 0) ? new org.virtualbox_7_0.IBandwidthGroup(real.getBandwidthGroup(), getObjMgr(), port) : null;
    }

    private ObjectRefManager getObjMgr()
    {
        return this.objMgr;
    }

/**
Machine object for this medium attachment.
@return org.virtualbox_7_0.IMachine
*/
    public org.virtualbox_7_0.IMachine getMachine()
    {
        return machine;
    }

/**
Medium object associated with this attachment; it
can be  null for removable devices.
@return org.virtualbox_7_0.IMedium
*/
    public org.virtualbox_7_0.IMedium getMedium()
    {
        return medium;
    }

/**
Name of the storage controller of this attachment; this
refers to one of the controllers in{@link org.virtualbox_7_0.IMachine#getStorageControllers()}by name.
@return String
*/
    public String getController()
    {
        String retVal = real.getController();
        return retVal;
    }

/**
Port number of this attachment.
See{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}for the meaning of this value for the different controller types.
@return Integer
*/
    public Integer getPort()
    {
        Integer retVal = real.getPort();
        return retVal;
    }

/**
Device slot number of this attachment.
See{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}for the meaning of this value for the different controller types.
@return Integer
*/
    public Integer getDevice()
    {
        Integer retVal = real.getDevice();
        return retVal;
    }

/**
Device type of this attachment.
@return org.virtualbox_7_0.DeviceType
*/
    public org.virtualbox_7_0.DeviceType getType()
    {
        org.virtualbox_7_0.jaxws.DeviceType retVal = real.getType();
        return org.virtualbox_7_0.DeviceType.fromValue(retVal.value());
    }

/**
Pass I/O requests through to a device on the host.
@return Boolean
*/
    public Boolean getPassthrough()
    {
        Boolean retVal = real.isPassthrough();
        return retVal;
    }

/**
Whether guest-triggered eject results in unmounting the medium.
@return Boolean
*/
    public Boolean getTemporaryEject()
    {
        Boolean retVal = real.isTemporaryEject();
        return retVal;
    }

/**
Signals that the removable medium has been ejected. This is not
necessarily equivalent to having a  null medium association.
@return Boolean
*/
    public Boolean getIsEjected()
    {
        Boolean retVal = real.isIsEjected();
        return retVal;
    }

/**
Whether the associated medium is non-rotational.
@return Boolean
*/
    public Boolean getNonRotational()
    {
        Boolean retVal = real.isNonRotational();
        return retVal;
    }

/**
Whether the associated medium supports discarding unused blocks.
@return Boolean
*/
    public Boolean getDiscard()
    {
        Boolean retVal = real.isDiscard();
        return retVal;
    }

/**
Whether this attachment is hot pluggable or not.
@return Boolean
*/
    public Boolean getHotPluggable()
    {
        Boolean retVal = real.isHotPluggable();
        return retVal;
    }

/**
The bandwidth group this medium attachment is assigned to.
@return org.virtualbox_7_0.IBandwidthGroup
*/
    public org.virtualbox_7_0.IBandwidthGroup getBandwidthGroup()
    {
        return bandwidthGroup;
    }
}

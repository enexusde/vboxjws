
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
 * IMediumAttachment.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * The IMediumAttachment interface links storage media to virtual machines. For
 * each medium ({@link org.virtualbox_4_2.IMedium}) which has been attached to a
 * storage controller ({@link org.virtualbox_4_2.IStorageController}) of a
 * machine ({@link org.virtualbox_4_2.IMachine}) via the
 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
 * method, one instance of IMediumAttachment is added to the machine's
 * {@link org.virtualbox_4_2.IMachine#getMediumAttachments()} array attribute.
 * 
 * Each medium attachment specifies the storage controller as well as a port and
 * device number and the IMedium instance representing a virtual hard disk or
 * floppy or DVD image.
 * 
 * For removable media (DVDs or floppies), there are two additional options. For
 * one, the IMedium instance can be null to represent an empty drive with no
 * media inserted (see
 * {@link org.virtualbox_4_2.IMachine#mountMedium(String,Integer,Integer,org.virtualbox_4_2.IMedium,Boolean)});
 * secondly, the medium can be one of the pseudo-media for host drives listed in
 * {@link org.virtualbox_4_2.IHost#getDVDDrives()} or
 * {@link org.virtualbox_4_2.IHost#getFloppyDrives()}.
 * 
 * <h3>Attaching Hard Disks</h3>
 * 
 * Hard disks are attached to virtual machines using the
 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
 * method and detached using the
 * {@link org.virtualbox_4_2.IMachine#detachDevice(String,Integer,Integer)}
 * method. Depending on a medium's type (see
 * {@link org.virtualbox_4_2.IMedium#getType()}), hard disks are attached either
 * <i>directly</i> or <i>indirectly</i>.
 * 
 * When a hard disk is being attached directly, it is associated with the
 * virtual machine and used for hard disk operations when the machine is
 * running. When a hard disk is being attached indirectly, a new differencing
 * hard disk linked to it is implicitly created and this differencing hard disk
 * is associated with the machine and used for hard disk operations. This also
 * means that if
 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
 * performs a direct attachment then the same hard disk will be returned in
 * response to the subsequent
 * {@link org.virtualbox_4_2.IMachine#getMedium(String,Integer,Integer)} call;
 * however if an indirect attachment is performed then
 * {@link org.virtualbox_4_2.IMachine#getMedium(String,Integer,Integer)} will
 * return the implicitly created differencing hard disk, not the original one
 * passed to
 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}.
 * In detail:
 * 
 * <ul>
 * <li><b>Normal base</b> hard disks that do not have children (i.e.
 * differencing hard disks linked to them) and that are not already attached to
 * virtual machines in snapshots are attached <b>directly</b>. Otherwise, they
 * are attached <b>indirectly</b> because having dependent children or being
 * part of the snapshot makes it impossible to modify hard disk contents without
 * breaking the integrity of the dependent party. The
 * {@link org.virtualbox_4_2.IMedium#getReadOnly()} attribute allows to quickly
 * determine the kind of the attachment for the given hard disk. Note that if a
 * normal base hard disk is to be indirectly attached to a virtual machine with
 * snapshots then a special procedure called <i>smart attachment</i> is
 * performed (see below).</li>
 * <li><b>Normal differencing</b> hard disks are like normal base hard disks:
 * they are attached <b>directly</b> if they do not have children and are not
 * attached to virtual machines in snapshots, and <b>indirectly</b> otherwise.
 * Note that the smart attachment procedure is never performed for differencing
 * hard disks.</li>
 * <li><b>Immutable</b> hard disks are always attached <b>indirectly</b> because
 * they are designed to be non-writable. If an immutable hard disk is attached
 * to a virtual machine with snapshots then a special procedure called smart
 * attachment is performed (see below).</li>
 * <li><b>Writethrough</b> hard disks are always attached <b>directly</b>, also
 * as designed. This also means that writethrough hard disks cannot have other
 * hard disks linked to them at all.</li>
 * <li><b>Shareable</b> hard disks are always attached <b>directly</b>, also as
 * designed. This also means that shareable hard disks cannot have other hard
 * disks linked to them at all. They behave almost like writethrough hard disks,
 * except that shareable hard disks can be attached to several virtual machines
 * which are running, allowing concurrent accesses. You need special cluster
 * software running in the virtual machines to make use of such disks.</li>
 * </ul>
 * 
 * Note that the same hard disk, regardless of its type, may be attached to more
 * than one virtual machine at a time. In this case, the machine that is started
 * first gains exclusive access to the hard disk and attempts to start other
 * machines having this hard disk attached will fail until the first machine is
 * powered down.
 * 
 * Detaching hard disks is performed in a <i>deferred</i> fashion. This means
 * that the given hard disk remains associated with the given machine after a
 * successful
 * {@link org.virtualbox_4_2.IMachine#detachDevice(String,Integer,Integer)} call
 * until {@link org.virtualbox_4_2.IMachine#saveSettings()} is called to save
 * all changes to machine settings to disk. This deferring is necessary to
 * guarantee that the hard disk configuration may be restored at any time by a
 * call to {@link org.virtualbox_4_2.IMachine#discardSettings()} before the
 * settings are saved (committed).
 * 
 * Note that if {@link org.virtualbox_4_2.IMachine#discardSettings()} is called
 * after indirectly attaching some hard disks to the machine but before a call
 * to {@link org.virtualbox_4_2.IMachine#saveSettings()} is made, it will
 * implicitly delete all differencing hard disks implicitly created by
 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
 * for these indirect attachments. Such implicitly created hard disks will also
 * be immediately deleted when detached explicitly using the
 * {@link org.virtualbox_4_2.IMachine#detachDevice(String,Integer,Integer)} call
 * if it is made before {@link org.virtualbox_4_2.IMachine#saveSettings()}. This
 * implicit deletion is safe because newly created differencing hard disks do
 * not contain any user data.
 * 
 * However, keep in mind that detaching differencing hard disks that were
 * implicitly created by
 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}
 * before the last {@link org.virtualbox_4_2.IMachine#saveSettings()} call will
 * <b>not</b> implicitly delete them as they may already contain some data (for
 * example, as a result of virtual machine execution). If these hard disks are
 * no more necessary, the caller can always delete them explicitly using
 * {@link org.virtualbox_4_2.IMedium#deleteStorage()} after they are actually
 * de-associated from this machine by the
 * {@link org.virtualbox_4_2.IMachine#saveSettings()} call.
 * 
 * <h3>Smart Attachment</h3>
 * 
 * When normal base or immutable hard disks are indirectly attached to a virtual
 * machine then some additional steps are performed to make sure the virtual
 * machine will have the most recent "view" of the hard disk being attached.
 * These steps include walking through the machine's snapshots starting from the
 * current one and going through ancestors up to the first snapshot. Hard disks
 * attached to the virtual machine in all of the encountered snapshots are
 * checked whether they are descendants of the given normal base or immutable
 * hard disk. The first found child (which is the differencing hard disk) will
 * be used instead of the normal base or immutable hard disk as a parent for
 * creating a new differencing hard disk that will be actually attached to the
 * machine. And only if no descendants are found or if the virtual machine does
 * not have any snapshots then the normal base or immutable hard disk will be
 * used itself as a parent for this differencing hard disk.
 * 
 * It is easier to explain what smart attachment does using the following
 * example:
 * 
 * <pre>
BEFORE attaching B.vdi:       AFTER attaching B.vdi:

Snapshot 1 (B.vdi)            Snapshot 1 (B.vdi)
Snapshot 2 (D1->B.vdi)        Snapshot 2 (D1->B.vdi)
Snapshot 3 (D2->D1.vdi)       Snapshot 3 (D2->D1.vdi)
Snapshot 4 (none)             Snapshot 4 (none)
CurState   (none)             CurState   (D3->D2.vdi)

                         NOT
                            ...
                             CurState   (D3->B.vdi)
 * </pre>
 * 
 * The first column is the virtual machine configuration before the base hard
 * disk <tt>B.vdi</tt> is attached, the second column shows the machine after
 * this hard disk is attached. Constructs like <tt>D1->B.vdi</tt> and similar
 * mean that the hard disk that is actually attached to the machine is a
 * differencing hard disk, <tt>D1.vdi</tt>, which is linked to (based on)
 * another hard disk, <tt>B.vdi</tt>.
 * 
 * As we can see from the example, the hard disk <tt>B.vdi</tt> was detached
 * from the machine before taking Snapshot 4. Later, after Snapshot 4 was taken,
 * the user decides to attach <tt>B.vdi</tt> again. <tt>B.vdi</tt> has dependent
 * child hard disks (<tt>D1.vdi</tt>, <tt>D2.vdi</tt>), therefore it cannot be
 * attached directly and needs an indirect attachment (i.e. implicit creation of
 * a new differencing hard disk). Due to the smart attachment procedure, the new
 * differencing hard disk (<tt>D3.vdi</tt>) will be based on <tt>D2.vdi</tt>,
 * not on <tt>B.vdi</tt> itself, since <tt>D2.vdi</tt> is the most recent view
 * of <tt>B.vdi</tt> existing for this snapshot branch of the given virtual
 * machine.
 * 
 * Note that if there is more than one descendant hard disk of the given base
 * hard disk found in a snapshot, and there is an exact device, channel and bus
 * match, then this exact match will be used. Otherwise, the youngest descendant
 * will be picked up.
 * 
 * There is one more important aspect of the smart attachment procedure which is
 * not related to snapshots at all. Before walking through the snapshots as
 * described above, the backup copy of the current list of hard disk attachment
 * is searched for descendants. This backup copy is created when the hard disk
 * configuration is changed for the first time after the last
 * {@link org.virtualbox_4_2.IMachine#saveSettings()} call and used by
 * {@link org.virtualbox_4_2.IMachine#discardSettings()} to undo the recent hard
 * disk changes. When such a descendant is found in this backup copy, it will be
 * simply re-attached back, without creating a new differencing hard disk for
 * it. This optimization is necessary to make it possible to re-attach the base
 * or immutable hard disk to a different bus, channel or device slot without
 * losing the contents of the differencing hard disk actually attached to the
 * machine in place of it.
 * 
 * 
 * Interface ID: <tt>{5EE464D6-0613-4331-B154-7CE12170EF9F}</tt>
 */
public class IMediumAttachment {

	private org.virtualbox_4_2.jaxws.IMediumAttachment real;
	private VboxPortType port;

	public IMediumAttachment(org.virtualbox_4_2.jaxws.IMediumAttachment real, VboxPortType port) {
		this.real = real;
		this.port = port;
	}

	public org.virtualbox_4_2.IMedium getMedium() {
		String retVal = real.getMedium();
		return (retVal.length() > 0) ? new org.virtualbox_4_2.IMedium(retVal, port) : null;
	}

	public String getController() {
		String retVal = real.getController();
		return retVal;
	}

	public Integer getPort() {
		Integer retVal = real.getPort();
		return retVal;
	}

	public Integer getDevice() {
		Integer retVal = real.getDevice();
		return retVal;
	}

	public org.virtualbox_4_2.DeviceType getType() {
		org.virtualbox_4_2.jaxws.DeviceType retVal = real.getType();
		return org.virtualbox_4_2.DeviceType.fromValue(retVal.value());
	}

	public Boolean getPassthrough() {
		Boolean retVal = real.isPassthrough();
		return retVal;
	}

	public Boolean getTemporaryEject() {
		Boolean retVal = real.isTemporaryEject();
		return retVal;
	}

	public Boolean getIsEjected() {
		Boolean retVal = real.isIsEjected();
		return retVal;
	}

	public Boolean getNonRotational() {
		Boolean retVal = real.isNonRotational();
		return retVal;
	}

	public Boolean getDiscard() {
		Boolean retVal = real.isDiscard();
		return retVal;
	}

	public org.virtualbox_4_2.IBandwidthGroup getBandwidthGroup() {
		String retVal = real.getBandwidthGroup();
		return (retVal.length() > 0) ? new org.virtualbox_4_2.IBandwidthGroup(retVal, port) : null;
	}
}

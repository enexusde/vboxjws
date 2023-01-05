
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
 * VBoxEventType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import java.util.List;

/**
 * 
 * Type of an event. See {@link org.virtualbox_4_2.IEvent} for an introduction
 * to VirtualBox event handling.
 * 
 * Interface ID: <tt>{0D67E79E-B7B1-4919-AAB3-B36866075515}</tt>
 */
public enum VBoxEventType {

	/**
	 * 
	 * Invalid event, must be first.
	 * 
	 */
	Invalid(0),
	/**
	 * 
	 * Wildcard for all events. Events of this type are never delivered, and only
	 * used in
	 * {@link org.virtualbox_4_2.IEventSource#registerListener(org.virtualbox_4_2.IEventListener,List,Boolean)}
	 * call to simplify registration.
	 * 
	 */
	Any(1),
	/**
	 * 
	 * Wildcard for all vetoable events. Events of this type are never delivered,
	 * and only used in
	 * {@link org.virtualbox_4_2.IEventSource#registerListener(org.virtualbox_4_2.IEventListener,List,Boolean)}
	 * call to simplify registration.
	 * 
	 */
	Vetoable(2),
	/**
	 * 
	 * Wildcard for all machine events. Events of this type are never delivered, and
	 * only used in
	 * {@link org.virtualbox_4_2.IEventSource#registerListener(org.virtualbox_4_2.IEventListener,List,Boolean)}
	 * call to simplify registration.
	 * 
	 */
	MachineEvent(3),
	/**
	 * 
	 * Wildcard for all snapshot events. Events of this type are never delivered,
	 * and only used in
	 * {@link org.virtualbox_4_2.IEventSource#registerListener(org.virtualbox_4_2.IEventListener,List,Boolean)}
	 * call to simplify registration.
	 * 
	 */
	SnapshotEvent(4),
	/**
	 * 
	 * Wildcard for all input device (keyboard, mouse) events. Events of this type
	 * are never delivered, and only used in
	 * {@link org.virtualbox_4_2.IEventSource#registerListener(org.virtualbox_4_2.IEventListener,List,Boolean)}
	 * call to simplify registration.
	 * 
	 */
	InputEvent(5),
	/**
	 * 
	 * Last wildcard.
	 * 
	 */
	LastWildcard(31),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IMachineStateChangedEvent}.
	 * 
	 */
	OnMachineStateChanged(32),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IMachineDataChangedEvent}.
	 * 
	 */
	OnMachineDataChanged(33),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IExtraDataChangedEvent}.
	 * 
	 */
	OnExtraDataChanged(34),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IExtraDataCanChangeEvent}.
	 * 
	 */
	OnExtraDataCanChange(35),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IMediumRegisteredEvent}.
	 * 
	 */
	OnMediumRegistered(36),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IMachineRegisteredEvent}.
	 * 
	 */
	OnMachineRegistered(37),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.ISessionStateChangedEvent}.
	 * 
	 */
	OnSessionStateChanged(38),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.ISnapshotTakenEvent}.
	 * 
	 */
	OnSnapshotTaken(39),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.ISnapshotDeletedEvent}.
	 * 
	 */
	OnSnapshotDeleted(40),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.ISnapshotChangedEvent}.
	 * 
	 */
	OnSnapshotChanged(41),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IGuestPropertyChangedEvent}.
	 * 
	 */
	OnGuestPropertyChanged(42),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IMousePointerShapeChangedEvent}.
	 * 
	 */
	OnMousePointerShapeChanged(43),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IMouseCapabilityChangedEvent}.
	 * 
	 */
	OnMouseCapabilityChanged(44),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IKeyboardLedsChangedEvent}.
	 * 
	 */
	OnKeyboardLedsChanged(45),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IStateChangedEvent}.
	 * 
	 */
	OnStateChanged(46),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IAdditionsStateChangedEvent}.
	 * 
	 */
	OnAdditionsStateChanged(47),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.INetworkAdapterChangedEvent}.
	 * 
	 */
	OnNetworkAdapterChanged(48),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.ISerialPortChangedEvent}.
	 * 
	 */
	OnSerialPortChanged(49),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IParallelPortChangedEvent}.
	 * 
	 */
	OnParallelPortChanged(50),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IStorageControllerChangedEvent}.
	 * 
	 */
	OnStorageControllerChanged(51),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IMediumChangedEvent}.
	 * 
	 */
	OnMediumChanged(52),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IVRDEServerChangedEvent}.
	 * 
	 */
	OnVRDEServerChanged(53),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IUSBControllerChangedEvent}.
	 * 
	 */
	OnUSBControllerChanged(54),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IUSBDeviceStateChangedEvent}.
	 * 
	 */
	OnUSBDeviceStateChanged(55),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.ISharedFolderChangedEvent}.
	 * 
	 */
	OnSharedFolderChanged(56),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IRuntimeErrorEvent}.
	 * 
	 */
	OnRuntimeError(57),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.ICanShowWindowEvent}.
	 * 
	 */
	OnCanShowWindow(58),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IShowWindowEvent}.
	 * 
	 */
	OnShowWindow(59),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.ICPUChangedEvent}.
	 * 
	 */
	OnCPUChanged(60),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IVRDEServerInfoChangedEvent}.
	 * 
	 */
	OnVRDEServerInfoChanged(61),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IEventSourceChangedEvent}.
	 * 
	 */
	OnEventSourceChanged(62),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.ICPUExecutionCapChangedEvent}.
	 * 
	 */
	OnCPUExecutionCapChanged(63),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IGuestKeyboardEvent}.
	 * 
	 */
	OnGuestKeyboard(64),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IGuestMouseEvent}.
	 * 
	 */
	OnGuestMouse(65),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.INATRedirectEvent}.
	 * 
	 */
	OnNATRedirect(66),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IHostPCIDevicePlugEvent}.
	 * 
	 */
	OnHostPCIDevicePlug(67),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IVBoxSVCAvailabilityChangedEvent}.
	 * 
	 */
	OnVBoxSVCAvailabilityChanged(68),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IBandwidthGroupChangedEvent}.
	 * 
	 */
	OnBandwidthGroupChanged(69),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IGuestMonitorChangedEvent}.
	 * 
	 */
	OnGuestMonitorChanged(70),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IStorageDeviceChangedEvent}.
	 * 
	 */
	OnStorageDeviceChanged(71),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IClipboardModeChangedEvent}.
	 * 
	 */
	OnClipboardModeChanged(72),
	/**
	 * 
	 * See {@link org.virtualbox_4_2.IDragAndDropModeChangedEvent}.
	 * 
	 */
	OnDragAndDropModeChanged(73),
	/**
	 * 
	 * Must be last event, used for iterations and structures relying on numerical
	 * event values.
	 * 
	 */
	Last(74);

	private final int value;

	VBoxEventType(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static VBoxEventType fromValue(long v) {
		for (VBoxEventType c : VBoxEventType.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static VBoxEventType fromValue(String v) {
		return valueOf(VBoxEventType.class, v);
	}
}

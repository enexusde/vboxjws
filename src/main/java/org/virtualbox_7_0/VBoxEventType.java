
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
 * VBoxEventType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**
Type of an event.
See{@link org.virtualbox_7_0.IEvent}for an introduction to VirtualBox event handling.
Interface ID: <code>{E4C5252D-7D1A-4051-8CFB-5B2D7A73D992}</code>
*/
public enum VBoxEventType
{

/**
Invalid event, must be first.
*/
    Invalid(0),

/**
Wildcard for all events.
Events of this type are never delivered, and only used in{@link org.virtualbox_7_0.IEventSource#registerListener(org.virtualbox_7_0.IEventListener,List,Boolean)}call to simplify registration.
*/
    Any(1),

/**
Wildcard for all vetoable events. Events of this type are never delivered, and only
used in{@link org.virtualbox_7_0.IEventSource#registerListener(org.virtualbox_7_0.IEventListener,List,Boolean)}call to simplify registration.
*/
    Vetoable(2),

/**
Wildcard for all machine events. Events of this type are never delivered, and only used in{@link org.virtualbox_7_0.IEventSource#registerListener(org.virtualbox_7_0.IEventListener,List,Boolean)}call to simplify registration.
*/
    MachineEvent(3),

/**
Wildcard for all snapshot events. Events of this type are never delivered, and only used in{@link org.virtualbox_7_0.IEventSource#registerListener(org.virtualbox_7_0.IEventListener,List,Boolean)}call to simplify registration.
*/
    SnapshotEvent(4),

/**
Wildcard for all input device (keyboard, mouse) events.
Events of this type are never delivered, and only used in{@link org.virtualbox_7_0.IEventSource#registerListener(org.virtualbox_7_0.IEventListener,List,Boolean)}call to simplify registration.
*/
    InputEvent(5),

/**
Last wildcard.
*/
    LastWildcard(31),

/**
See{@link org.virtualbox_7_0.IMachineStateChangedEvent}.
*/
    OnMachineStateChanged(32),

/**
See{@link org.virtualbox_7_0.IMachineDataChangedEvent}.
*/
    OnMachineDataChanged(33),

/**
See{@link org.virtualbox_7_0.IExtraDataChangedEvent}.
*/
    OnExtraDataChanged(34),

/**
See{@link org.virtualbox_7_0.IExtraDataCanChangeEvent}.
*/
    OnExtraDataCanChange(35),

/**
See{@link org.virtualbox_7_0.IMediumRegisteredEvent}.
*/
    OnMediumRegistered(36),

/**
See{@link org.virtualbox_7_0.IMachineRegisteredEvent}.
*/
    OnMachineRegistered(37),

/**
See{@link org.virtualbox_7_0.ISessionStateChangedEvent}.
*/
    OnSessionStateChanged(38),

/**
See{@link org.virtualbox_7_0.ISnapshotTakenEvent}.
*/
    OnSnapshotTaken(39),

/**
See{@link org.virtualbox_7_0.ISnapshotDeletedEvent}.
*/
    OnSnapshotDeleted(40),

/**
See{@link org.virtualbox_7_0.ISnapshotChangedEvent}.
*/
    OnSnapshotChanged(41),

/**
See{@link org.virtualbox_7_0.IGuestPropertyChangedEvent}.
*/
    OnGuestPropertyChanged(42),

/**
See{@link org.virtualbox_7_0.IMousePointerShapeChangedEvent}.
*/
    OnMousePointerShapeChanged(43),

/**
See{@link org.virtualbox_7_0.IMouseCapabilityChangedEvent}.
*/
    OnMouseCapabilityChanged(44),

/**
See{@link org.virtualbox_7_0.IKeyboardLedsChangedEvent}.
*/
    OnKeyboardLedsChanged(45),

/**
See{@link org.virtualbox_7_0.IStateChangedEvent}.
*/
    OnStateChanged(46),

/**
See{@link org.virtualbox_7_0.IAdditionsStateChangedEvent}.
*/
    OnAdditionsStateChanged(47),

/**
See{@link org.virtualbox_7_0.INetworkAdapterChangedEvent}.
*/
    OnNetworkAdapterChanged(48),

/**
See{@link org.virtualbox_7_0.ISerialPortChangedEvent}.
*/
    OnSerialPortChanged(49),

/**
See{@link org.virtualbox_7_0.IParallelPortChangedEvent}.
*/
    OnParallelPortChanged(50),

/**
See{@link org.virtualbox_7_0.IStorageControllerChangedEvent}.
*/
    OnStorageControllerChanged(51),

/**
See{@link org.virtualbox_7_0.IMediumChangedEvent}.
*/
    OnMediumChanged(52),

/**
See{@link org.virtualbox_7_0.IVRDEServerChangedEvent}.
*/
    OnVRDEServerChanged(53),

/**
See{@link org.virtualbox_7_0.IUSBControllerChangedEvent}.
*/
    OnUSBControllerChanged(54),

/**
See{@link org.virtualbox_7_0.IUSBDeviceStateChangedEvent}.
*/
    OnUSBDeviceStateChanged(55),

/**
See{@link org.virtualbox_7_0.ISharedFolderChangedEvent}.
*/
    OnSharedFolderChanged(56),

/**
See{@link org.virtualbox_7_0.IRuntimeErrorEvent}.
*/
    OnRuntimeError(57),

/**
See{@link org.virtualbox_7_0.ICanShowWindowEvent}.
*/
    OnCanShowWindow(58),

/**
See{@link org.virtualbox_7_0.IShowWindowEvent}.
*/
    OnShowWindow(59),

/**
See{@link org.virtualbox_7_0.ICPUChangedEvent}.
*/
    OnCPUChanged(60),

/**
See{@link org.virtualbox_7_0.IVRDEServerInfoChangedEvent}.
*/
    OnVRDEServerInfoChanged(61),

/**
See{@link org.virtualbox_7_0.IEventSourceChangedEvent}.
*/
    OnEventSourceChanged(62),

/**
See{@link org.virtualbox_7_0.ICPUExecutionCapChangedEvent}.
*/
    OnCPUExecutionCapChanged(63),

/**
See{@link org.virtualbox_7_0.IGuestKeyboardEvent}.
*/
    OnGuestKeyboard(64),

/**
See{@link org.virtualbox_7_0.IGuestMouseEvent}.
*/
    OnGuestMouse(65),

/**
See{@link org.virtualbox_7_0.INATRedirectEvent}.
*/
    OnNATRedirect(66),

/**
See{@link org.virtualbox_7_0.IHostPCIDevicePlugEvent}.
*/
    OnHostPCIDevicePlug(67),

/**
See{@link org.virtualbox_7_0.IVBoxSVCAvailabilityChangedEvent}.
*/
    OnVBoxSVCAvailabilityChanged(68),

/**
See{@link org.virtualbox_7_0.IBandwidthGroupChangedEvent}.
*/
    OnBandwidthGroupChanged(69),

/**
See{@link org.virtualbox_7_0.IGuestMonitorChangedEvent}.
*/
    OnGuestMonitorChanged(70),

/**
See{@link org.virtualbox_7_0.IStorageDeviceChangedEvent}.
*/
    OnStorageDeviceChanged(71),

/**
See{@link org.virtualbox_7_0.IClipboardModeChangedEvent}.
*/
    OnClipboardModeChanged(72),

/**
See{@link org.virtualbox_7_0.IDnDModeChangedEvent}.
*/
    OnDnDModeChanged(73),

/**
See{@link org.virtualbox_7_0.INATNetworkChangedEvent}.
*/
    OnNATNetworkChanged(74),

/**
See{@link org.virtualbox_7_0.INATNetworkStartStopEvent}.
*/
    OnNATNetworkStartStop(75),

/**
See{@link org.virtualbox_7_0.INATNetworkAlterEvent}.
*/
    OnNATNetworkAlter(76),

/**
See{@link org.virtualbox_7_0.INATNetworkCreationDeletionEvent}.
*/
    OnNATNetworkCreationDeletion(77),

/**
See{@link org.virtualbox_7_0.INATNetworkSettingEvent}.
*/
    OnNATNetworkSetting(78),

/**
See{@link org.virtualbox_7_0.INATNetworkPortForwardEvent}.
*/
    OnNATNetworkPortForward(79),

/**
See{@link org.virtualbox_7_0.IGuestSessionStateChangedEvent}.
*/
    OnGuestSessionStateChanged(80),

/**
See{@link org.virtualbox_7_0.IGuestSessionRegisteredEvent}.
*/
    OnGuestSessionRegistered(81),

/**
See{@link org.virtualbox_7_0.IGuestProcessRegisteredEvent}.
*/
    OnGuestProcessRegistered(82),

/**
See{@link org.virtualbox_7_0.IGuestProcessStateChangedEvent}.
*/
    OnGuestProcessStateChanged(83),

/**
See{@link org.virtualbox_7_0.IGuestProcessInputNotifyEvent}.
*/
    OnGuestProcessInputNotify(84),

/**
See{@link org.virtualbox_7_0.IGuestProcessOutputEvent}.
*/
    OnGuestProcessOutput(85),

/**
See{@link org.virtualbox_7_0.IGuestFileRegisteredEvent}.
*/
    OnGuestFileRegistered(86),

/**
See{@link org.virtualbox_7_0.IGuestFileStateChangedEvent}.
*/
    OnGuestFileStateChanged(87),

/**
See{@link org.virtualbox_7_0.IGuestFileOffsetChangedEvent}.
*/
    OnGuestFileOffsetChanged(88),

/**
See{@link org.virtualbox_7_0.IGuestFileReadEvent}.
*/
    OnGuestFileRead(89),

/**
See{@link org.virtualbox_7_0.IGuestFileWriteEvent}.
*/
    OnGuestFileWrite(90),

/**
See{@link org.virtualbox_7_0.IRecordingChangedEvent}.
*/
    OnRecordingChanged(91),

/**
See{@link org.virtualbox_7_0.IGuestUserStateChangedEvent}.
*/
    OnGuestUserStateChanged(92),

/**
See{@link org.virtualbox_7_0.IGuestMultiTouchEvent}.
*/
    OnGuestMultiTouch(93),

/**
See{@link org.virtualbox_7_0.IHostNameResolutionConfigurationChangeEvent}.
*/
    OnHostNameResolutionConfigurationChange(94),

/**
See{@link org.virtualbox_7_0.ISnapshotRestoredEvent}.
*/
    OnSnapshotRestored(95),

/**
See{@link org.virtualbox_7_0.IMediumConfigChangedEvent}.
*/
    OnMediumConfigChanged(96),

/**
See{@link org.virtualbox_7_0.IAudioAdapterChangedEvent}.
*/
    OnAudioAdapterChanged(97),

/**
See{@link org.virtualbox_7_0.IProgressPercentageChangedEvent}.
*/
    OnProgressPercentageChanged(98),

/**
See{@link org.virtualbox_7_0.IProgressTaskCompletedEvent}.
*/
    OnProgressTaskCompleted(99),

/**
See{@link org.virtualbox_7_0.ICursorPositionChangedEvent}.
*/
    OnCursorPositionChanged(100),

/**
See{@link org.virtualbox_7_0.IGuestAdditionsStatusChangedEvent}.
*/
    OnGuestAdditionsStatusChanged(101),

/**
See{@link org.virtualbox_7_0.IGuestMonitorInfoChangedEvent}.
*/
    OnGuestMonitorInfoChanged(102),

/**
See{@link org.virtualbox_7_0.IGuestFileSizeChangedEvent}.
*/
    OnGuestFileSizeChanged(103),

/**
See{@link org.virtualbox_7_0.IClipboardFileTransferModeChangedEvent}.
*/
    OnClipboardFileTransferModeChanged(104),

/**
See{@link org.virtualbox_7_0.ICloudProviderListChangedEvent}.
*/
    OnCloudProviderListChanged(105),

/**
See{@link org.virtualbox_7_0.ICloudProviderRegisteredEvent}.
*/
    OnCloudProviderRegistered(106),

/**
See{@link org.virtualbox_7_0.ICloudProviderUninstallEvent}.
*/
    OnCloudProviderUninstall(107),

/**
See{@link org.virtualbox_7_0.ICloudProfileRegisteredEvent}.
*/
    OnCloudProfileRegistered(108),

/**
See{@link org.virtualbox_7_0.ICloudProfileChangedEvent}.
*/
    OnCloudProfileChanged(109),

/**
See{@link org.virtualbox_7_0.IProgressCreatedEvent}.
*/
    OnProgressCreated(110),

/**
See{@link org.virtualbox_7_0.ILanguageChangedEvent}.
*/
    OnLanguageChanged(111),

/**
See{@link org.virtualbox_7_0.IUpdateAgentAvailableEvent}.
*/
    OnUpdateAgentAvailable(112),

/**
See{@link org.virtualbox_7_0.IUpdateAgentErrorEvent}.
*/
    OnUpdateAgentError(113),

/**
See{@link org.virtualbox_7_0.IUpdateAgentSettingsChangedEvent}.
*/
    OnUpdateAgentSettingsChanged(114),

/**
See{@link org.virtualbox_7_0.IUpdateAgentStateChangedEvent}.
*/
    OnUpdateAgentStateChanged(115),

/**
See{@link org.virtualbox_7_0.IHostAudioDeviceChangedEvent}.
*/
    OnHostAudioDeviceChanged(116),

/**
See{@link org.virtualbox_7_0.IGuestDebugControlChangedEvent}.
*/
    OnGuestDebugControlChanged(117),

/**
See{@link org.virtualbox_7_0.IMachineGroupsChangedEvent}.
*/
    OnMachineGroupsChanged(118),

/**
Must be last event, used for iterations and structures relying on numerical event values.
*/
    End(119);

    private final int value;

    VBoxEventType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static VBoxEventType fromValue(long v)
    {
        for (VBoxEventType c: VBoxEventType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static VBoxEventType fromValue(String v)
    {
        return valueOf(VBoxEventType.class, v);
    }
}



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
 * USBDeviceState.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * USB device state. This enumeration represents all possible states of the USB
 * device physically attached to the host computer regarding its state on the
 * host computer and availability to guest computers (all currently running
 * virtual machines).
 * 
 * Once a supported USB device is attached to the host, global USB filters
 * ({@link org.virtualbox_4_2.IHost#getUSBDeviceFilters()}) are activated. They
 * can either ignore the device, or put it to USBDeviceState_Held state, or do
 * nothing. Unless the device is ignored by global filters, filters of all
 * currently running guests
 * ({@link org.virtualbox_4_2.IUSBController#getDeviceFilters()}) are activated
 * that can put it to USBDeviceState_Captured state.
 * 
 * If the device was ignored by global filters, or didn't match any filters at
 * all (including guest ones), it is handled by the host in a normal way. In
 * this case, the device state is determined by the host and can be one of
 * USBDeviceState_Unavailable, USBDeviceState_Busy or USBDeviceState_Available,
 * depending on the current device usage.
 * 
 * Besides auto-capturing based on filters, the device can be manually captured
 * by guests ({@link org.virtualbox_4_2.IConsole#attachUSBDevice(String)}) if
 * its state is USBDeviceState_Busy, USBDeviceState_Available or
 * USBDeviceState_Held.
 * 
 * 
 * NOTE: Due to differences in USB stack implementations in Linux and Win32,
 * states USBDeviceState_Busy and USBDeviceState_Unavailable are applicable only
 * to the Linux version of the product. This also means that
 * ({@link org.virtualbox_4_2.IConsole#attachUSBDevice(String)}) can only
 * succeed on Win32 if the device state is USBDeviceState_Held.
 * 
 * 
 * @see org.virtualbox_4_2.IHostUSBDevice
 * @see org.virtualbox_4_2.IHostUSBDeviceFilter
 * 
 *      Interface ID: <tt>{B99A2E65-67FB-4882-82FD-F3E5E8193AB4}</tt>
 */
public enum USBDeviceState {

	/**
	 * 
	 * Not supported by the VirtualBox server, not available to guests.
	 * 
	 */
	NotSupported(0),
	/**
	 * 
	 * Being used by the host computer exclusively, not available to guests.
	 * 
	 */
	Unavailable(1),
	/**
	 * 
	 * Being used by the host computer, potentially available to guests.
	 * 
	 */
	Busy(2),
	/**
	 * 
	 * Not used by the host computer, available to guests (the host computer can
	 * also start using the device at any time).
	 * 
	 */
	Available(3),
	/**
	 * 
	 * Held by the VirtualBox server (ignored by the host computer), available to
	 * guests.
	 * 
	 */
	Held(4),
	/**
	 * 
	 * Captured by one of the guest computers, not available to anybody else.
	 * 
	 */
	Captured(5);

	private final int value;

	USBDeviceState(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static USBDeviceState fromValue(long v) {
		for (USBDeviceState c : USBDeviceState.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static USBDeviceState fromValue(String v) {
		return valueOf(USBDeviceState.class, v);
	}
}

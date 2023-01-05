
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
 * IBIOSSettings.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.InvalidObjectFaultMsg;
import org.virtualbox_4_2.jaxws.RuntimeFaultMsg;
import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * The IBIOSSettings interface represents BIOS settings of the virtual machine.
 * This is used only in the
 * {@link org.virtualbox_4_2.IMachine#getBIOSSettings()} attribute.
 * 
 * Interface ID: <tt>{38B54279-DC35-4F5E-A431-835B867C6B5E}</tt>
 */
public class IBIOSSettings extends IUnknown {

	public IBIOSSettings(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * Fade in flag for BIOS logo animation.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getLogoFadeIn() {
		try {
			Boolean retVal = port.ibiosSettingsGetLogoFadeIn(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Fade in flag for BIOS logo animation.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setLogoFadeIn(Boolean value) {
		try {
			port.ibiosSettingsSetLogoFadeIn(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Fade out flag for BIOS logo animation.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getLogoFadeOut() {
		try {
			Boolean retVal = port.ibiosSettingsGetLogoFadeOut(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Fade out flag for BIOS logo animation.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setLogoFadeOut(Boolean value) {
		try {
			port.ibiosSettingsSetLogoFadeOut(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * BIOS logo display time in milliseconds (0 = default).
	 * 
	 * @return Long
	 * 
	 */
	public Long getLogoDisplayTime() {
		try {
			Long retVal = port.ibiosSettingsGetLogoDisplayTime(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * BIOS logo display time in milliseconds (0 = default).
	 * 
	 * @param value Long
	 * 
	 */
	public void setLogoDisplayTime(Long value) {
		try {
			port.ibiosSettingsSetLogoDisplayTime(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Local file system path for external BIOS splash image. Empty string means the
	 * default image is shown on boot.
	 * 
	 * @return String
	 * 
	 */
	public String getLogoImagePath() {
		try {
			String retVal = port.ibiosSettingsGetLogoImagePath(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Local file system path for external BIOS splash image. Empty string means the
	 * default image is shown on boot.
	 * 
	 * @param value String
	 * 
	 */
	public void setLogoImagePath(String value) {
		try {
			port.ibiosSettingsSetLogoImagePath(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Mode of the BIOS boot device menu.
	 * 
	 * @return org.virtualbox_4_2.BIOSBootMenuMode
	 * 
	 */
	public org.virtualbox_4_2.BIOSBootMenuMode getBootMenuMode() {
		try {
			org.virtualbox_4_2.jaxws.BIOSBootMenuMode retVal = port.ibiosSettingsGetBootMenuMode(obj);
			return org.virtualbox_4_2.BIOSBootMenuMode.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Mode of the BIOS boot device menu.
	 * 
	 * @param value org.virtualbox_4_2.BIOSBootMenuMode
	 * 
	 */
	public void setBootMenuMode(org.virtualbox_4_2.BIOSBootMenuMode value) {
		try {
			port.ibiosSettingsSetBootMenuMode(obj, org.virtualbox_4_2.jaxws.BIOSBootMenuMode.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * ACPI support flag.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getACPIEnabled() {
		try {
			Boolean retVal = port.ibiosSettingsGetACPIEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * ACPI support flag.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setACPIEnabled(Boolean value) {
		try {
			port.ibiosSettingsSetACPIEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * IO APIC support flag. If set, VirtualBox will provide an IO APIC and support
	 * IRQs above 15.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getIOAPICEnabled() {
		try {
			Boolean retVal = port.ibiosSettingsGetIOAPICEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * IO APIC support flag. If set, VirtualBox will provide an IO APIC and support
	 * IRQs above 15.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setIOAPICEnabled(Boolean value) {
		try {
			port.ibiosSettingsSetIOAPICEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Offset in milliseconds from the host system time. This allows for guests
	 * running with a different system date/time than the host. It is equivalent to
	 * setting the system date/time in the BIOS except it is not an absolute value
	 * but a relative one. Guest Additions time synchronization honors this offset.
	 * 
	 * @return Long
	 * 
	 */
	public Long getTimeOffset() {
		try {
			Long retVal = port.ibiosSettingsGetTimeOffset(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Offset in milliseconds from the host system time. This allows for guests
	 * running with a different system date/time than the host. It is equivalent to
	 * setting the system date/time in the BIOS except it is not an absolute value
	 * but a relative one. Guest Additions time synchronization honors this offset.
	 * 
	 * @param value Long
	 * 
	 */
	public void setTimeOffset(Long value) {
		try {
			port.ibiosSettingsSetTimeOffset(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * PXE debug logging flag. If set, VirtualBox will write extensive PXE trace
	 * information to the release log.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getPXEDebugEnabled() {
		try {
			Boolean retVal = port.ibiosSettingsGetPXEDebugEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * PXE debug logging flag. If set, VirtualBox will write extensive PXE trace
	 * information to the release log.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setPXEDebugEnabled(Boolean value) {
		try {
			port.ibiosSettingsSetPXEDebugEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IBIOSSettings queryInterface(IUnknown obj) {
		return obj == null ? null : new IBIOSSettings(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

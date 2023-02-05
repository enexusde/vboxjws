
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
 * IBIOSSettings.java
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
The IBIOSSettings interface represents BIOS settings of the virtual
machine. This is used only in the{@link org.virtualbox_7_0.IMachine#getBIOSSettings()}attribute.

Interface ID: <code>{A0A7F210-B857-4468-BE26-C29F36A84345}</code>
*/
public class IBIOSSettings extends IUnknown
{

    public IBIOSSettings(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Fade in flag for BIOS logo animation.
@return Boolean
*/
    public Boolean getLogoFadeIn()
    {
        try
        {
            Boolean retVal = port.ibiosSettingsGetLogoFadeIn(obj);
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
Fade in flag for BIOS logo animation.
@param value Boolean

*/
    public void setLogoFadeIn(Boolean value)
    {
        try
        {
        port.ibiosSettingsSetLogoFadeIn(obj, value);
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
Fade out flag for BIOS logo animation.
@return Boolean
*/
    public Boolean getLogoFadeOut()
    {
        try
        {
            Boolean retVal = port.ibiosSettingsGetLogoFadeOut(obj);
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
Fade out flag for BIOS logo animation.
@param value Boolean

*/
    public void setLogoFadeOut(Boolean value)
    {
        try
        {
        port.ibiosSettingsSetLogoFadeOut(obj, value);
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
BIOS logo display time in milliseconds (0 = default).
@return Long
*/
    public Long getLogoDisplayTime()
    {
        try
        {
            Long retVal = port.ibiosSettingsGetLogoDisplayTime(obj);
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
BIOS logo display time in milliseconds (0 = default).
@param value Long

*/
    public void setLogoDisplayTime(Long value)
    {
        try
        {
        port.ibiosSettingsSetLogoDisplayTime(obj, value);
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
Local file system path for external BIOS splash image. Empty string
means the default image is shown on boot.
@return String
*/
    public String getLogoImagePath()
    {
        try
        {
            String retVal = port.ibiosSettingsGetLogoImagePath(obj);
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
Local file system path for external BIOS splash image. Empty string
means the default image is shown on boot.
@param value String

*/
    public void setLogoImagePath(String value)
    {
        try
        {
        port.ibiosSettingsSetLogoImagePath(obj, value);
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
Mode of the BIOS boot device menu.
@return org.virtualbox_7_0.BIOSBootMenuMode
*/
    public org.virtualbox_7_0.BIOSBootMenuMode getBootMenuMode()
    {
        try
        {
            org.virtualbox_7_0.jaxws.BIOSBootMenuMode retVal = port.ibiosSettingsGetBootMenuMode(obj);
            return org.virtualbox_7_0.BIOSBootMenuMode.fromValue(retVal.value());
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
Mode of the BIOS boot device menu.
@param value org.virtualbox_7_0.BIOSBootMenuMode

*/
    public void setBootMenuMode(org.virtualbox_7_0.BIOSBootMenuMode value)
    {
        try
        {
        port.ibiosSettingsSetBootMenuMode(obj, org.virtualbox_7_0.jaxws.BIOSBootMenuMode.fromValue(value.name()));
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
ACPI support flag.
@return Boolean
*/
    public Boolean getACPIEnabled()
    {
        try
        {
            Boolean retVal = port.ibiosSettingsGetACPIEnabled(obj);
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
ACPI support flag.
@param value Boolean

*/
    public void setACPIEnabled(Boolean value)
    {
        try
        {
        port.ibiosSettingsSetACPIEnabled(obj, value);
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
I/O-APIC support flag. If set, VirtualBox will provide an I/O-APIC
and support IRQs above 15.
@return Boolean
*/
    public Boolean getIOAPICEnabled()
    {
        try
        {
            Boolean retVal = port.ibiosSettingsGetIOAPICEnabled(obj);
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
I/O-APIC support flag. If set, VirtualBox will provide an I/O-APIC
and support IRQs above 15.
@param value Boolean

*/
    public void setIOAPICEnabled(Boolean value)
    {
        try
        {
        port.ibiosSettingsSetIOAPICEnabled(obj, value);
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
APIC mode to set up by the firmware.
@return org.virtualbox_7_0.APICMode
*/
    public org.virtualbox_7_0.APICMode getAPICMode()
    {
        try
        {
            org.virtualbox_7_0.jaxws.APICMode retVal = port.ibiosSettingsGetAPICMode(obj);
            return org.virtualbox_7_0.APICMode.fromValue(retVal.value());
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
APIC mode to set up by the firmware.
@param value org.virtualbox_7_0.APICMode

*/
    public void setAPICMode(org.virtualbox_7_0.APICMode value)
    {
        try
        {
        port.ibiosSettingsSetAPICMode(obj, org.virtualbox_7_0.jaxws.APICMode.fromValue(value.name()));
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
Offset in milliseconds from the host system time. This allows for
guests running with a different system date/time than the host.
It is equivalent to setting the system date/time in the BIOS except
it is not an absolute value but a relative one. Guest Additions
time synchronization honors this offset.
@return Long
*/
    public Long getTimeOffset()
    {
        try
        {
            Long retVal = port.ibiosSettingsGetTimeOffset(obj);
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
Offset in milliseconds from the host system time. This allows for
guests running with a different system date/time than the host.
It is equivalent to setting the system date/time in the BIOS except
it is not an absolute value but a relative one. Guest Additions
time synchronization honors this offset.
@param value Long

*/
    public void setTimeOffset(Long value)
    {
        try
        {
        port.ibiosSettingsSetTimeOffset(obj, value);
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
PXE debug logging flag. If set, VirtualBox will write extensive
PXE trace information to the release log.
@return Boolean
*/
    public Boolean getPXEDebugEnabled()
    {
        try
        {
            Boolean retVal = port.ibiosSettingsGetPXEDebugEnabled(obj);
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
PXE debug logging flag. If set, VirtualBox will write extensive
PXE trace information to the release log.
@param value Boolean

*/
    public void setPXEDebugEnabled(Boolean value)
    {
        try
        {
        port.ibiosSettingsSetPXEDebugEnabled(obj, value);
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
Flag to control whether the SMBIOS system UUID is presented in little endian
form to the guest as mandated by the SMBIOS spec chapter 7.2.1.
Before VirtualBox version 6.1 it was always presented in big endian form
and to retain the old behavior this flag was introduced so it can be changed.
VMs created with VBox 6.1 will default to true for this flag.
@return Boolean
*/
    public Boolean getSMBIOSUuidLittleEndian()
    {
        try
        {
            Boolean retVal = port.ibiosSettingsGetSMBIOSUuidLittleEndian(obj);
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
Flag to control whether the SMBIOS system UUID is presented in little endian
form to the guest as mandated by the SMBIOS spec chapter 7.2.1.
Before VirtualBox version 6.1 it was always presented in big endian form
and to retain the old behavior this flag was introduced so it can be changed.
VMs created with VBox 6.1 will default to true for this flag.
@param value Boolean

*/
    public void setSMBIOSUuidLittleEndian(Boolean value)
    {
        try
        {
        port.ibiosSettingsSetSMBIOSUuidLittleEndian(obj, value);
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
    public static IBIOSSettings queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IBIOSSettings(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

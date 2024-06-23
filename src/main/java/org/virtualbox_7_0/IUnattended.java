
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
 * IUnattended.java
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
The IUnattended interface represents the pipeline for preparing
the Guest OS for fully automated install.

The typical workflow is:<ol><li>Call{@link org.virtualbox_7_0.IVirtualBox#createUnattendedInstaller()}to create the object</li><li>Set{@link org.virtualbox_7_0.IUnattended#getIsoPath()}and call{@link org.virtualbox_7_0.IUnattended#detectIsoOS()}</li><li>Create, configure and register a machine according to{@link org.virtualbox_7_0.IUnattended#getDetectedOSTypeId()}and the other detectedOS* attributes.</li><li>Set{@link org.virtualbox_7_0.IUnattended#getMachine()}to the new IMachine instance.</li><li>Set the other IUnattended attributes as desired.</li><li>Call{@link org.virtualbox_7_0.IUnattended#prepare()}for the object to check the
attribute values and create an internal installer instance.</li><li>Call{@link org.virtualbox_7_0.IUnattended#constructMedia()}to create additional
media files (ISO/floppy) needed.</li><li>Call{@link org.virtualbox_7_0.IUnattended#reconfigureVM()}to reconfigure the VM
with the installation ISO, additional media files and whatnot</li><li>Optionally call{@link org.virtualbox_7_0.IUnattended#done()}to destroy the internal
installer and allow restarting from the second step.</li></ol>Note! Step two is currently not implemented.

Interface ID: <code>{6F89464F-7773-436A-A4DF-592E4E537FA0}</code>
*/
public class IUnattended extends IUnknown
{

    public IUnattended(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Guest operating system ISO image
@return String
*/
    public String getIsoPath()
    {
        try
        {
            String retVal = port.iUnattendedGetIsoPath(obj);
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
Guest operating system ISO image
@param value String

*/
    public void setIsoPath(String value)
    {
        try
        {
        port.iUnattendedSetIsoPath(obj, value);
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
The associated machine object.

This must be set before{@link org.virtualbox_7_0.IUnattended#prepare()}is called.
The VM must be registered.
@return org.virtualbox_7_0.IMachine
*/
    public org.virtualbox_7_0.IMachine getMachine()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iUnattendedGetMachine(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IMachine(retVal, getObjMgr(), port) : null;
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
The associated machine object.

This must be set before{@link org.virtualbox_7_0.IUnattended#prepare()}is called.
The VM must be registered.
@param value org.virtualbox_7_0.IMachine

*/
    public void setMachine(org.virtualbox_7_0.IMachine value)
    {
        try
        {
        port.iUnattendedSetMachine(obj, ((value == null) ? null :value.getWrapped()));
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
Assign an user login name.
@return String
*/
    public String getUser()
    {
        try
        {
            String retVal = port.iUnattendedGetUser(obj);
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
Assign an user login name.
@param value String

*/
    public void setUser(String value)
    {
        try
        {
        port.iUnattendedSetUser(obj, value);
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
Assign a password to the user. The password is the same for both
normal user and for Administrator / 'root' accounts.
@return String
*/
    public String getPassword()
    {
        try
        {
            String retVal = port.iUnattendedGetPassword(obj);
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
Assign a password to the user. The password is the same for both
normal user and for Administrator / 'root' accounts.
@param value String

*/
    public void setPassword(String value)
    {
        try
        {
        port.iUnattendedSetPassword(obj, value);
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
The full name of the user.  This is optional and defaults to{@link org.virtualbox_7_0.IUnattended#getUser()}.  Please note that not all guests picks
up this attribute.
@return String
*/
    public String getFullUserName()
    {
        try
        {
            String retVal = port.iUnattendedGetFullUserName(obj);
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
The full name of the user.  This is optional and defaults to{@link org.virtualbox_7_0.IUnattended#getUser()}.  Please note that not all guests picks
up this attribute.
@param value String

*/
    public void setFullUserName(String value)
    {
        try
        {
        port.iUnattendedSetFullUserName(obj, value);
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
Any key which is used as authorization of access to install genuine OS
@return String
*/
    public String getProductKey()
    {
        try
        {
            String retVal = port.iUnattendedGetProductKey(obj);
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
Any key which is used as authorization of access to install genuine OS
@param value String

*/
    public void setProductKey(String value)
    {
        try
        {
        port.iUnattendedSetProductKey(obj, value);
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
Guest Additions ISO image path.  This defaults to{@link org.virtualbox_7_0.ISystemProperties#getDefaultAdditionsISO()}when the Unattended
object is instantiated.

This property is ignored when{@link org.virtualbox_7_0.IUnattended#getInstallGuestAdditions()}is false.
@return String
*/
    public String getAdditionsIsoPath()
    {
        try
        {
            String retVal = port.iUnattendedGetAdditionsIsoPath(obj);
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
Guest Additions ISO image path.  This defaults to{@link org.virtualbox_7_0.ISystemProperties#getDefaultAdditionsISO()}when the Unattended
object is instantiated.

This property is ignored when{@link org.virtualbox_7_0.IUnattended#getInstallGuestAdditions()}is false.
@param value String

*/
    public void setAdditionsIsoPath(String value)
    {
        try
        {
        port.iUnattendedSetAdditionsIsoPath(obj, value);
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
Indicates whether the Guest Additions should be installed or not.

Setting this to false does not affect additions shipped with the linux
distribution, only the installation of additions pointed to by{@link org.virtualbox_7_0.IUnattended#getAdditionsIsoPath()}.
@return Boolean
*/
    public Boolean getInstallGuestAdditions()
    {
        try
        {
            Boolean retVal = port.iUnattendedGetInstallGuestAdditions(obj);
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
Indicates whether the Guest Additions should be installed or not.

Setting this to false does not affect additions shipped with the linux
distribution, only the installation of additions pointed to by{@link org.virtualbox_7_0.IUnattended#getAdditionsIsoPath()}.
@param value Boolean

*/
    public void setInstallGuestAdditions(Boolean value)
    {
        try
        {
        port.iUnattendedSetInstallGuestAdditions(obj, value);
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
VirtualBox ValidationKit ISO image path.  This is used when{@link org.virtualbox_7_0.IUnattended#getInstallTestExecService()}is set to true.
@return String
*/
    public String getValidationKitIsoPath()
    {
        try
        {
            String retVal = port.iUnattendedGetValidationKitIsoPath(obj);
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
VirtualBox ValidationKit ISO image path.  This is used when{@link org.virtualbox_7_0.IUnattended#getInstallTestExecService()}is set to true.
@param value String

*/
    public void setValidationKitIsoPath(String value)
    {
        try
        {
        port.iUnattendedSetValidationKitIsoPath(obj, value);
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
Indicates whether the test execution service (TXS) from the VBox
ValidationKit should be installed.

The TXS binary will be taken from the ISO indicated by{@link org.virtualbox_7_0.IUnattended#getValidationKitIsoPath()}.
@return Boolean
*/
    public Boolean getInstallTestExecService()
    {
        try
        {
            Boolean retVal = port.iUnattendedGetInstallTestExecService(obj);
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
Indicates whether the test execution service (TXS) from the VBox
ValidationKit should be installed.

The TXS binary will be taken from the ISO indicated by{@link org.virtualbox_7_0.IUnattended#getValidationKitIsoPath()}.
@param value Boolean

*/
    public void setInstallTestExecService(Boolean value)
    {
        try
        {
        port.iUnattendedSetInstallTestExecService(obj, value);
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
The guest time zone specifier.

This is unfortunately guest OS specific.

Windows XP and earlier takes the index number from this table:
https://support.microsoft.com/en-gb/help/973627/microsoft-time-zone-index-values

Windows Vista and later takes the time zone string from this table:
https://technet.microsoft.com/en-us/library/cc749073(v=ws.10).aspx

Linux usually takes the TZ string from this table:
https://en.wikipedia.org/wiki/List_of_tz_database_time_zones

The default is currently UTC/GMT, but this may change to be same as
the host later.

TODO: Investigate automatic mapping between linux and the two windows
time zone formats.
TODO: Take default from host (this requires mapping).
@return String
*/
    public String getTimeZone()
    {
        try
        {
            String retVal = port.iUnattendedGetTimeZone(obj);
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
The guest time zone specifier.

This is unfortunately guest OS specific.

Windows XP and earlier takes the index number from this table:
https://support.microsoft.com/en-gb/help/973627/microsoft-time-zone-index-values

Windows Vista and later takes the time zone string from this table:
https://technet.microsoft.com/en-us/library/cc749073(v=ws.10).aspx

Linux usually takes the TZ string from this table:
https://en.wikipedia.org/wiki/List_of_tz_database_time_zones

The default is currently UTC/GMT, but this may change to be same as
the host later.

TODO: Investigate automatic mapping between linux and the two windows
time zone formats.
TODO: Take default from host (this requires mapping).
@param value String

*/
    public void setTimeZone(String value)
    {
        try
        {
        port.iUnattendedSetTimeZone(obj, value);
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
The 5 letter locale identifier, no codesets or such.

The format is two lower case language letters (ISO 639-1), underscore ('_'),
and two upper case country letters (ISO 3166-1 alpha-2).  For instance
'en_US', 'de_DE', or 'ny_NO'.

The default is taken from the host if possible, with 'en_US' as fallback.
@return String
*/
    public String getLocale()
    {
        try
        {
            String retVal = port.iUnattendedGetLocale(obj);
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
The 5 letter locale identifier, no codesets or such.

The format is two lower case language letters (ISO 639-1), underscore ('_'),
and two upper case country letters (ISO 3166-1 alpha-2).  For instance
'en_US', 'de_DE', or 'ny_NO'.

The default is taken from the host if possible, with 'en_US' as fallback.
@param value String

*/
    public void setLocale(String value)
    {
        try
        {
        port.iUnattendedSetLocale(obj, value);
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
This is more or less a Windows specific setting for choosing the UI language
setting of the installer.

The value should be from the list available via{@link org.virtualbox_7_0.IUnattended#getDetectedOSLanguages()}.
The typical format is {language-code}-{COUNTRY} but windows may also use
{16-bit code}:{32-bit code} or insert another component between the language
and country codes.  We consider the format guest OS specific.

Note that it is crucial that this is correctly specified for Windows
installations.  If an unsupported value is given the installer will ask
for an installation language and wait for user input.  Best to leave it
to the default value.

The default is the first one from{@link org.virtualbox_7_0.IUnattended#getDetectedOSLanguages()}.
@return String
*/
    public String getLanguage()
    {
        try
        {
            String retVal = port.iUnattendedGetLanguage(obj);
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
This is more or less a Windows specific setting for choosing the UI language
setting of the installer.

The value should be from the list available via{@link org.virtualbox_7_0.IUnattended#getDetectedOSLanguages()}.
The typical format is {language-code}-{COUNTRY} but windows may also use
{16-bit code}:{32-bit code} or insert another component between the language
and country codes.  We consider the format guest OS specific.

Note that it is crucial that this is correctly specified for Windows
installations.  If an unsupported value is given the installer will ask
for an installation language and wait for user input.  Best to leave it
to the default value.

The default is the first one from{@link org.virtualbox_7_0.IUnattended#getDetectedOSLanguages()}.
@param value String

*/
    public void setLanguage(String value)
    {
        try
        {
        port.iUnattendedSetLanguage(obj, value);
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
The 2 upper case letter country identifier, ISO 3166-1 alpha-2.

This is used for mirrors and such.

The default is taken from the host when possible, falling back on{@link org.virtualbox_7_0.IUnattended#getLocale()}.
@return String
*/
    public String getCountry()
    {
        try
        {
            String retVal = port.iUnattendedGetCountry(obj);
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
The 2 upper case letter country identifier, ISO 3166-1 alpha-2.

This is used for mirrors and such.

The default is taken from the host when possible, falling back on{@link org.virtualbox_7_0.IUnattended#getLocale()}.
@param value String

*/
    public void setCountry(String value)
    {
        try
        {
        port.iUnattendedSetCountry(obj, value);
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
Proxy incantation to pass on to the guest OS installer.

This is important to get right if the guest OS installer is of the type
that goes online to fetch the packages (e.g. debian-*-netinst.iso) or
to fetch updates during the install process.

Format: [schema=]schema://[login[:password]@]proxy[:port][;...]

The default is taken from the host proxy configuration (once implemented).
@return String
*/
    public String getProxy()
    {
        try
        {
            String retVal = port.iUnattendedGetProxy(obj);
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
Proxy incantation to pass on to the guest OS installer.

This is important to get right if the guest OS installer is of the type
that goes online to fetch the packages (e.g. debian-*-netinst.iso) or
to fetch updates during the install process.

Format: [schema=]schema://[login[:password]@]proxy[:port][;...]

The default is taken from the host proxy configuration (once implemented).
@param value String

*/
    public void setProxy(String value)
    {
        try
        {
        port.iUnattendedSetProxy(obj, value);
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
Guest OS specific package selection adjustments.

This is a semicolon separated list of keywords, and later maybe guest OS
package specifiers.  Currently the 'minimal' is the only recognized value,
and this only works with a selection of linux installers.
@return String
*/
    public String getPackageSelectionAdjustments()
    {
        try
        {
            String retVal = port.iUnattendedGetPackageSelectionAdjustments(obj);
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
Guest OS specific package selection adjustments.

This is a semicolon separated list of keywords, and later maybe guest OS
package specifiers.  Currently the 'minimal' is the only recognized value,
and this only works with a selection of linux installers.
@param value String

*/
    public void setPackageSelectionAdjustments(String value)
    {
        try
        {
        port.iUnattendedSetPackageSelectionAdjustments(obj, value);
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
The fully qualified guest hostname.

This defaults to machine-name + ".myguest.virtualbox.org", though it may
change to the host domain name later.
@return String
*/
    public String getHostname()
    {
        try
        {
            String retVal = port.iUnattendedGetHostname(obj);
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
The fully qualified guest hostname.

This defaults to machine-name + ".myguest.virtualbox.org", though it may
change to the host domain name later.
@param value String

*/
    public void setHostname(String value)
    {
        try
        {
        port.iUnattendedSetHostname(obj, value);
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
The path + basename for auxiliary files generated by the unattended
installation.  This defaults to the VM folder + Unattended + VM UUID.

The files which gets generated depends on the OS being installed.  When
installing Windows there is currently only a auxiliaryBasePath + "floppy.img"
being created.  But for linux, a "cdrom.viso" and one or more configuration
files are generate generated.
@return String
*/
    public String getAuxiliaryBasePath()
    {
        try
        {
            String retVal = port.iUnattendedGetAuxiliaryBasePath(obj);
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
The path + basename for auxiliary files generated by the unattended
installation.  This defaults to the VM folder + Unattended + VM UUID.

The files which gets generated depends on the OS being installed.  When
installing Windows there is currently only a auxiliaryBasePath + "floppy.img"
being created.  But for linux, a "cdrom.viso" and one or more configuration
files are generate generated.
@param value String

*/
    public void setAuxiliaryBasePath(String value)
    {
        try
        {
        port.iUnattendedSetAuxiliaryBasePath(obj, value);
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
The image index on installation CD/DVD used to install. This index should be
one of the indices of{@link org.virtualbox_7_0.IUnattended#getDetectedImageIndices()}.

Changing this after ISO detection may cause{@link org.virtualbox_7_0.IUnattended#getDetectedOSTypeId()},{@link org.virtualbox_7_0.IUnattended#getDetectedOSVersion()},{@link org.virtualbox_7_0.IUnattended#getDetectedOSFlavor()},{@link org.virtualbox_7_0.IUnattended#getDetectedOSLanguages()},
and{@link org.virtualbox_7_0.IUnattended#getDetectedOSHints()}to be updated with values
specific to the selected image.

Used only with Windows installation CD/DVD:
https://technet.microsoft.com/en-us/library/cc766022%28v=ws.10%29.aspx
@return Long
*/
    public Long getImageIndex()
    {
        try
        {
            Long retVal = port.iUnattendedGetImageIndex(obj);
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
The image index on installation CD/DVD used to install. This index should be
one of the indices of{@link org.virtualbox_7_0.IUnattended#getDetectedImageIndices()}.

Changing this after ISO detection may cause{@link org.virtualbox_7_0.IUnattended#getDetectedOSTypeId()},{@link org.virtualbox_7_0.IUnattended#getDetectedOSVersion()},{@link org.virtualbox_7_0.IUnattended#getDetectedOSFlavor()},{@link org.virtualbox_7_0.IUnattended#getDetectedOSLanguages()},
and{@link org.virtualbox_7_0.IUnattended#getDetectedOSHints()}to be updated with values
specific to the selected image.

Used only with Windows installation CD/DVD:
https://technet.microsoft.com/en-us/library/cc766022%28v=ws.10%29.aspx
@param value Long

*/
    public void setImageIndex(Long value)
    {
        try
        {
        port.iUnattendedSetImageIndex(obj, value);
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
The unattended installation script template file.

The template default is based on the guest OS type and is determined by the
internal installer when when{@link org.virtualbox_7_0.IUnattended#prepare()}is invoked.
Most users will want the defaults.

After{@link org.virtualbox_7_0.IUnattended#prepare()}is called, it can be read to see
which file is being used.
@return String
*/
    public String getScriptTemplatePath()
    {
        try
        {
            String retVal = port.iUnattendedGetScriptTemplatePath(obj);
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
The unattended installation script template file.

The template default is based on the guest OS type and is determined by the
internal installer when when{@link org.virtualbox_7_0.IUnattended#prepare()}is invoked.
Most users will want the defaults.

After{@link org.virtualbox_7_0.IUnattended#prepare()}is called, it can be read to see
which file is being used.
@param value String

*/
    public void setScriptTemplatePath(String value)
    {
        try
        {
        port.iUnattendedSetScriptTemplatePath(obj, value);
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
The post installation (shell/batch) script template file.

The template default is based on the guest OS type and is determined by the
internal installer when when{@link org.virtualbox_7_0.IUnattended#prepare()}is invoked.
Most users will want the defaults.

After{@link org.virtualbox_7_0.IUnattended#prepare()}is called, it can be read to see
which file is being used.
@return String
*/
    public String getPostInstallScriptTemplatePath()
    {
        try
        {
            String retVal = port.iUnattendedGetPostInstallScriptTemplatePath(obj);
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
The post installation (shell/batch) script template file.

The template default is based on the guest OS type and is determined by the
internal installer when when{@link org.virtualbox_7_0.IUnattended#prepare()}is invoked.
Most users will want the defaults.

After{@link org.virtualbox_7_0.IUnattended#prepare()}is called, it can be read to see
which file is being used.
@param value String

*/
    public void setPostInstallScriptTemplatePath(String value)
    {
        try
        {
        port.iUnattendedSetPostInstallScriptTemplatePath(obj, value);
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
Custom post installation command.

Exactly what is expected as input here depends on the guest OS installer
and the post installation script template (see{@link org.virtualbox_7_0.IUnattended#getPostInstallScriptTemplatePath()}).
Most users will not need to set this attribute.
@return String
*/
    public String getPostInstallCommand()
    {
        try
        {
            String retVal = port.iUnattendedGetPostInstallCommand(obj);
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
Custom post installation command.

Exactly what is expected as input here depends on the guest OS installer
and the post installation script template (see{@link org.virtualbox_7_0.IUnattended#getPostInstallScriptTemplatePath()}).
Most users will not need to set this attribute.
@param value String

*/
    public void setPostInstallCommand(String value)
    {
        try
        {
        port.iUnattendedSetPostInstallCommand(obj, value);
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
Extra kernel arguments passed to the install kernel of some guests.

This is currently only picked up by linux guests.  The exact parameters
are specific to the guest OS being installed of course.

After{@link org.virtualbox_7_0.IUnattended#prepare()}is called, it can be read to see
which parameters are being used.
@return String
*/
    public String getExtraInstallKernelParameters()
    {
        try
        {
            String retVal = port.iUnattendedGetExtraInstallKernelParameters(obj);
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
Extra kernel arguments passed to the install kernel of some guests.

This is currently only picked up by linux guests.  The exact parameters
are specific to the guest OS being installed of course.

After{@link org.virtualbox_7_0.IUnattended#prepare()}is called, it can be read to see
which parameters are being used.
@param value String

*/
    public void setExtraInstallKernelParameters(String value)
    {
        try
        {
        port.iUnattendedSetExtraInstallKernelParameters(obj, value);
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
The detected OS type ID ({@link org.virtualbox_7_0.IGuestOSType#getId()}).

Set by{@link org.virtualbox_7_0.IUnattended#detectIsoOS()}or{@link org.virtualbox_7_0.IUnattended#prepare()}.

Not yet implemented.
@return String
*/
    public String getDetectedOSTypeId()
    {
        try
        {
            String retVal = port.iUnattendedGetDetectedOSTypeId(obj);
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
The detected OS version string.

Set by{@link org.virtualbox_7_0.IUnattended#detectIsoOS()}or{@link org.virtualbox_7_0.IUnattended#prepare()}.

Not yet implemented.
@return String
*/
    public String getDetectedOSVersion()
    {
        try
        {
            String retVal = port.iUnattendedGetDetectedOSVersion(obj);
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
The detected OS flavor (e.g. server, desktop, etc)

Set by{@link org.virtualbox_7_0.IUnattended#detectIsoOS()}or{@link org.virtualbox_7_0.IUnattended#prepare()}.

Not yet implemented.
@return String
*/
    public String getDetectedOSFlavor()
    {
        try
        {
            String retVal = port.iUnattendedGetDetectedOSFlavor(obj);
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
The space separated list of (Windows) installation UI languages we detected (lang.ini).

The language specifier format is specific to the guest OS.  They are
used to set{@link org.virtualbox_7_0.IUnattended#getLanguage()}.

Set by{@link org.virtualbox_7_0.IUnattended#detectIsoOS()}or{@link org.virtualbox_7_0.IUnattended#prepare()}.

Partially implemented.
@return String
*/
    public String getDetectedOSLanguages()
    {
        try
        {
            String retVal = port.iUnattendedGetDetectedOSLanguages(obj);
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
Space separated list of other stuff detected about the OS and the
installation ISO.

Set by{@link org.virtualbox_7_0.IUnattended#detectIsoOS()}or{@link org.virtualbox_7_0.IUnattended#prepare()}.

Not yet implemented.
@return String
*/
    public String getDetectedOSHints()
    {
        try
        {
            String retVal = port.iUnattendedGetDetectedOSHints(obj);
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
A list of names of the images detected from install.wim file of a Windows Vista
or later ISO. This array is parallel to{@link org.virtualbox_7_0.IUnattended#getDetectedImageIndices()}.
This will be empty for older Windows ISOs and non-Windows ISOs.
@return List&lt;String&gt;
*/
    public List<String> getDetectedImageNames()
    {
        try
        {
            List<String> retVal = port.iUnattendedGetDetectedImageNames(obj);
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
A list of image indexes detected from install.wim file of a Windows ISO. This array
is parallel to{@link org.virtualbox_7_0.IUnattended#getDetectedImageNames()}.{@link org.virtualbox_7_0.IUnattended#getImageIndex()}should be set to one of these indices for Vista and later Windows ISOs.
@return List&lt;Long&gt;
*/
    public List<Long> getDetectedImageIndices()
    {
        try
        {
            List<Long> retVal = port.iUnattendedGetDetectedImageIndices(obj);
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
Checks the detected OS type and version against a set of rules and returns
whether unattended install is supported or not. Note that failing detecting
OS type from the ISO causes this attribute to be false by default.
@return Boolean
*/
    public Boolean getIsUnattendedInstallSupported()
    {
        try
        {
            Boolean retVal = port.iUnattendedGetIsUnattendedInstallSupported(obj);
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
When set to true installation is configured to abstain from
using network to update/get data. Especially useful when network
is not available (as in our test boxes).
@return Boolean
*/
    public Boolean getAvoidUpdatesOverNetwork()
    {
        try
        {
            Boolean retVal = port.iUnattendedGetAvoidUpdatesOverNetwork(obj);
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
When set to true installation is configured to abstain from
using network to update/get data. Especially useful when network
is not available (as in our test boxes).
@param value Boolean

*/
    public void setAvoidUpdatesOverNetwork(Boolean value)
    {
        try
        {
        port.iUnattendedSetAvoidUpdatesOverNetwork(obj, value);
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
    public static IUnattended queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IUnattended(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Detects the OS on the ISO given by{@link org.virtualbox_7_0.IUnattended#getIsoPath()}and sets{@link org.virtualbox_7_0.IUnattended#getDetectedOSTypeId()},{@link org.virtualbox_7_0.IUnattended#getDetectedOSVersion()}{@link org.virtualbox_7_0.IUnattended#getDetectedOSFlavor()},{@link org.virtualbox_7_0.IUnattended#getDetectedOSLanguages()},{@link org.virtualbox_7_0.IUnattended#getDetectedOSHints()},{@link org.virtualbox_7_0.IUnattended#getDetectedImageNames()},
and{@link org.virtualbox_7_0.IUnattended#getDetectedImageIndices()},

Not really yet implemented.
*/
    public void detectIsoOS()
    {
        try
        {
        port.iUnattendedDetectIsoOS(obj);
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
Prepare for running the unattended process of installation.

This will perform{@link org.virtualbox_7_0.IUnattended#detectIsoOS()}if not yet called on the
current{@link org.virtualbox_7_0.IUnattended#getIsoPath()}value.  It may then may cause{@link org.virtualbox_7_0.IUnattended#getDetectedOSTypeId()},{@link org.virtualbox_7_0.IUnattended#getDetectedOSVersion()},{@link org.virtualbox_7_0.IUnattended#getDetectedOSFlavor()},{@link org.virtualbox_7_0.IUnattended#getDetectedOSLanguages()},
and{@link org.virtualbox_7_0.IUnattended#getDetectedOSHints()}to be updated with values
specific to the image selected by{@link org.virtualbox_7_0.IUnattended#getImageIndex()}if the ISO
contains images.

This method will then instantiate the installer based on the detected guest type
(see{@link org.virtualbox_7_0.IUnattended#getDetectedOSTypeId()}).
*/
    public void prepare()
    {
        try
        {
        port.iUnattendedPrepare(obj);
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
Constructors the necessary ISO/VISO/Floppy images, with unattended scripts
and all necessary bits on them.
*/
    public void constructMedia()
    {
        try
        {
        port.iUnattendedConstructMedia(obj);
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
Reconfigures the machine to start the installation.

This involves mounting the ISOs and floppy images created by{@link org.virtualbox_7_0.IUnattended#constructMedia()}, attaching new DVD and floppy
drives as necessary, and possibly modifying the boot order.
*/
    public void reconfigureVM()
    {
        try
        {
        port.iUnattendedReconfigureVM(obj);
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
Done - time to start the VM.

This deletes the internal installer instance that{@link org.virtualbox_7_0.IUnattended#prepare()}created.  Before done() is called, it is not possible to start over again
from{@link org.virtualbox_7_0.IUnattended#prepare()}.
*/
    public void done()
    {
        try
        {
        port.iUnattendedDone(obj);
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

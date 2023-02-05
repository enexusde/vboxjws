
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
 * IVirtualBox.java
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
The IVirtualBox interface represents the main interface exposed by the
product that provides virtual machine management.

An instance of IVirtualBox is required for the product to do anything
useful. Even though the interface does not expose this, internally,
IVirtualBox is implemented as a singleton and actually lives in the
process of the VirtualBox server (VBoxSVC.exe). This makes sure that
IVirtualBox can track the state of all virtual machines on a particular
host, regardless of which frontend started them.

To enumerate all the virtual machines on the host, use the{@link org.virtualbox_7_0.IVirtualBox#getMachines()}attribute.

Error information handling is a bit special with IVirtualBox: creating
an instance will always succeed. The return of the actual error
code/information is postponed to any attribute or method call. The
reason for this is that COM likes to mutilate the error code and lose
the detailed error information returned by instance creation.

Interface ID: <code>{7682D5EB-F00E-44F1-8CA2-99D08B1CD607}</code>
*/
public class IVirtualBox extends IUnknown
{

    public IVirtualBox(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
A string representing the version number of the product. The
format is 3 integer numbers divided by dots (e.g. 1.0.1). The
last number represents the build number and will frequently change.

This may be followed by a _ALPHA[0-9]*, _BETA[0-9]* or _RC[0-9]* tag
in prerelease builds. Non-Oracle builds may (/shall) also have a
publisher tag, at the end. The publisher tag starts with an underscore
just like the prerelease build type tag.
@return String
*/
    public String getVersion()
    {
        try
        {
            String retVal = port.iVirtualBoxGetVersion(obj);
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
A string representing the version number of the product,
without the publisher information (but still with other tags).
See{@link #getVersion()}.
@return String
*/
    public String getVersionNormalized()
    {
        try
        {
            String retVal = port.iVirtualBoxGetVersionNormalized(obj);
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
The internal build revision number of the product.
@return Long
*/
    public Long getRevision()
    {
        try
        {
            Long retVal = port.iVirtualBoxGetRevision(obj);
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
A string representing the package type of this product. The
format is OS_ARCH_DIST where OS is either WINDOWS, LINUX,
SOLARIS, DARWIN. ARCH is either 32BITS or 64BITS. DIST
is either GENERIC, UBUNTU_606, UBUNTU_710, or something like
this.
@return String
*/
    public String getPackageType()
    {
        try
        {
            String retVal = port.iVirtualBoxGetPackageType(obj);
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
A string representing the VirtualBox API version number. The format is
2 integer numbers divided by an underscore (e.g. 1_0). After the
first public release of packages with a particular API version the
API will not be changed in an incompatible way. Note that this
guarantee does not apply to development builds, and also there is no
guarantee that this version is identical to the first two integer
numbers of the package version.
@return String
*/
    public String getAPIVersion()
    {
        try
        {
            String retVal = port.iVirtualBoxGetAPIVersion(obj);
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
This is mainly intended for the VBox Validation Kit so it can fluently
deal with incompatible API changes and new functionality during
development (i.e. on trunk).

The high 7 bits (62:56) is the major version number, the next 8 bits
(55:48) are the minor version number, the next 8 bits (47:40) are the
build number, and the rest (39:0) is the API revision number.

The API revision number is manually increased on trunk when making
incompatible changes that the validation kit or others needs to be able
to detect and cope with dynamically.  It can also be used to indicate
the presence of new features on both trunk and branches.
@return Long
*/
    public Long getAPIRevision()
    {
        try
        {
            Long retVal = port.iVirtualBoxGetAPIRevision(obj);
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
Full path to the directory where the global settings file,<code>VirtualBox.xml</code>, is stored.

In this version of VirtualBox, the value of this property is
always<code>&lt;user_dir&gt;/.VirtualBox</code>(where<code>&lt;user_dir&gt;</code>is the path to the user directory,
as determined by the host OS), and cannot be changed.

This path is also used as the base to resolve relative paths in
places where relative paths are allowed (unless otherwise
expressly indicated).
@return String
*/
    public String getHomeFolder()
    {
        try
        {
            String retVal = port.iVirtualBoxGetHomeFolder(obj);
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
Full name of the global settings file.
The value of this property corresponds to the value of{@link #getHomeFolder()}plus<code>/VirtualBox.xml</code>.
@return String
*/
    public String getSettingsFilePath()
    {
        try
        {
            String retVal = port.iVirtualBoxGetSettingsFilePath(obj);
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
Associated host object.
@return org.virtualbox_7_0.IHost
*/
    public org.virtualbox_7_0.IHost getHost()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iVirtualBoxGetHost(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IHost(retVal, getObjMgr(), port) : null;
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
Associated system information object.
@return org.virtualbox_7_0.ISystemProperties
*/
    public org.virtualbox_7_0.ISystemProperties getSystemProperties()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iVirtualBoxGetSystemProperties(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.ISystemProperties(retVal, getObjMgr(), port) : null;
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
Array of machine objects registered within this VirtualBox instance.
@return List&lt;org.virtualbox_7_0.IMachine&gt;
*/
    public List<org.virtualbox_7_0.IMachine> getMachines()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iVirtualBoxGetMachines(obj);
            return Helper.wrap(org.virtualbox_7_0.IMachine.class, getObjMgr(), port, retVal);
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
Array of all machine group names which are used by the machines which
are accessible. Each group is only listed once, however they are listed
in no particular order and there is no guarantee that there are no gaps
in the group hierarchy (i.e.<code>"/"</code>,<code>"/group/subgroup"</code>is a valid result).
@return List&lt;String&gt;
*/
    public List<String> getMachineGroups()
    {
        try
        {
            List<String> retVal = port.iVirtualBoxGetMachineGroups(obj);
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
Array of medium objects known to this VirtualBox installation.

This array contains only base media. All differencing
media of the given base medium can be enumerated using{@link org.virtualbox_7_0.IMedium#getChildren()}.
@return List&lt;org.virtualbox_7_0.IMedium&gt;
*/
    public List<org.virtualbox_7_0.IMedium> getHardDisks()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iVirtualBoxGetHardDisks(obj);
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
Array of CD/DVD image objects currently in use by this VirtualBox instance.
@return List&lt;org.virtualbox_7_0.IMedium&gt;
*/
    public List<org.virtualbox_7_0.IMedium> getDVDImages()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iVirtualBoxGetDVDImages(obj);
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
Array of floppy image objects currently in use by this VirtualBox instance.
@return List&lt;org.virtualbox_7_0.IMedium&gt;
*/
    public List<org.virtualbox_7_0.IMedium> getFloppyImages()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iVirtualBoxGetFloppyImages(obj);
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
    public List<org.virtualbox_7_0.IProgress> getProgressOperations()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iVirtualBoxGetProgressOperations(obj);
            return Helper.wrap(org.virtualbox_7_0.IProgress.class, getObjMgr(), port, retVal);
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
    public List<org.virtualbox_7_0.IGuestOSType> getGuestOSTypes()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<org.virtualbox_7_0.jaxws.IGuestOSType> retVal = port.iVirtualBoxGetGuestOSTypes(obj);
            return Helper.wrap2(org.virtualbox_7_0.IGuestOSType.class, org.virtualbox_7_0.jaxws.IGuestOSType.class, objMgr, port, retVal);
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
Collection of global shared folders. Global shared folders are
available to all virtual machines.

New shared folders are added to the collection using{@link #createSharedFolder(String,String,Boolean,Boolean,String)}. Existing shared folders can be
removed using{@link #removeSharedFolder(String)}.
NOTE: In the current version of the product, global shared folders are not
implemented and therefore this collection is always empty.

@return List&lt;org.virtualbox_7_0.ISharedFolder&gt;
*/
    public List<org.virtualbox_7_0.ISharedFolder> getSharedFolders()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iVirtualBoxGetSharedFolders(obj);
            return Helper.wrap(org.virtualbox_7_0.ISharedFolder.class, getObjMgr(), port, retVal);
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
Associated performance collector object.
@return org.virtualbox_7_0.IPerformanceCollector
*/
    public org.virtualbox_7_0.IPerformanceCollector getPerformanceCollector()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iVirtualBoxGetPerformanceCollector(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IPerformanceCollector(retVal, getObjMgr(), port) : null;
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
DHCP servers.
@return List&lt;org.virtualbox_7_0.IDHCPServer&gt;
*/
    public List<org.virtualbox_7_0.IDHCPServer> getDHCPServers()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iVirtualBoxGetDHCPServers(obj);
            return Helper.wrap(org.virtualbox_7_0.IDHCPServer.class, getObjMgr(), port, retVal);
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
    public List<org.virtualbox_7_0.INATNetwork> getNATNetworks()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iVirtualBoxGetNATNetworks(obj);
            return Helper.wrap(org.virtualbox_7_0.INATNetwork.class, getObjMgr(), port, retVal);
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
Event source for VirtualBox events.
@return org.virtualbox_7_0.IEventSource
*/
    public org.virtualbox_7_0.IEventSource getEventSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iVirtualBoxGetEventSource(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.IEventSource(retVal, getObjMgr(), port) : null;
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
  // Skipping attribute extensionPackManager of suppressed type IExtPackManager


/**
Names of all internal networks.
@return List&lt;String&gt;
*/
    public List<String> getInternalNetworks()
    {
        try
        {
            List<String> retVal = port.iVirtualBoxGetInternalNetworks(obj);
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
Names of all host-only networks.
@return List&lt;org.virtualbox_7_0.IHostOnlyNetwork&gt;
*/
    public List<org.virtualbox_7_0.IHostOnlyNetwork> getHostOnlyNetworks()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iVirtualBoxGetHostOnlyNetworks(obj);
            return Helper.wrap(org.virtualbox_7_0.IHostOnlyNetwork.class, getObjMgr(), port, retVal);
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
Names of all generic network drivers.
@return List&lt;String&gt;
*/
    public List<String> getGenericNetworkDrivers()
    {
        try
        {
            List<String> retVal = port.iVirtualBoxGetGenericNetworkDrivers(obj);
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
Names of all configured cloud networks.
@return List&lt;org.virtualbox_7_0.ICloudNetwork&gt;
*/
    public List<org.virtualbox_7_0.ICloudNetwork> getCloudNetworks()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iVirtualBoxGetCloudNetworks(obj);
            return Helper.wrap(org.virtualbox_7_0.ICloudNetwork.class, getObjMgr(), port, retVal);
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
The cloud provider manager (singleton).
@return org.virtualbox_7_0.ICloudProviderManager
*/
    public org.virtualbox_7_0.ICloudProviderManager getCloudProviderManager()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iVirtualBoxGetCloudProviderManager(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.ICloudProviderManager(retVal, getObjMgr(), port) : null;
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
    public static IVirtualBox queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IVirtualBox(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Returns a recommended full path of the settings file name for a new virtual
machine.

This API serves two purposes:<ul><li>It gets called by{@link #createMachine(String,String,List,String,String,String,String,String)}if  null or
empty string (which is recommended) is specified for the
settingsFile argument there, which means that API should use
a recommended default file name.</li><li>It can be called manually by a client software before creating a machine,
e.g. if that client wants to pre-create the machine directory to create
virtual hard disks in that directory together with the new machine
settings file. In that case, the file name should be stripped from the
full settings file path returned by this function to obtain the
machine directory.</li></ul>See{@link org.virtualbox_7_0.IMachine#getName()}and{@link #createMachine(String,String,List,String,String,String,String,String)}for more
details about the machine name.

groupName defines which additional subdirectory levels should be
included. It must be either a valid group name or  null or empty
string which designates that the machine will not be related to a
machine group.

If  baseFolder is a  null or empty string (which is recommended), the
default machine settings folder
(see{@link org.virtualbox_7_0.ISystemProperties#getDefaultMachineFolder()}) will be used as
a base folder for the created machine, resulting in a file name like
"/home/user/VirtualBox VMs/name/name.vbox". Otherwise the given base folder
will be used.

This method does not access the host disks. In particular, it does not check
for whether a machine with this name already exists.
@param name Suggested machine name.

@param group Machine group name for the new machine or machine group. It is
used to determine the right subdirectory.

@param createFlags Machine creation flags, see{@link #createMachine(String,String,List,String,String,String,String,String)}(optional).

@param baseFolder Base machine folder (optional).

@return Fully qualified path where the machine would be created.

*/
    public String composeMachineFilename(String name, String group, String createFlags, String baseFolder)
    {
        try
        {
            String retVal;
        retVal = port.iVirtualBoxComposeMachineFilename(obj, name, group, createFlags, baseFolder);
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
Creates a new virtual machine by creating a machine settings file at
the given location.

VirtualBox machine settings files use a custom XML dialect. Starting
with VirtualBox 4.0, a ".vbox" extension is recommended, but not enforced,
and machine files can be created at arbitrary locations.

However, it is recommended that machines are created in the default
machine folder (e.g. "/home/user/VirtualBox VMs/name/name.vbox"; see{@link org.virtualbox_7_0.ISystemProperties#getDefaultMachineFolder()}). If you specify
null or empty string (which is recommended) for the  settingsFile
argument,{@link #composeMachineFilename(String,String,String,String)}is called automatically
to have such a recommended name composed based on the machine name
given in the  name argument and the primary group.

If the resulting settings file already exists, this method will fail,
unless the forceOverwrite flag is set.

The new machine is created unregistered, with the initial configuration
set according to the specified guest OS type. A typical sequence of
actions to create a new virtual machine is as follows:<ol><li>Call this method to have a new machine created. The returned machine
object will be "mutable" allowing to change any machine property.</li><li>Configure the machine using the appropriate attributes and methods.</li><li>Call{@link org.virtualbox_7_0.IMachine#saveSettings()}to write the settings
to the machine's XML settings file. The configuration of the newly
created machine will not be saved to disk until this method is
called.</li><li>Call{@link #registerMachine(org.virtualbox_7_0.IMachine)}to add the machine to the list
of machines known to VirtualBox.</li></ol>The specified guest OS type identifier must match an ID of one of known
guest OS types listed in the{@link org.virtualbox_7_0.IVirtualBox#getGuestOSTypes()}array.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - osTypeId is invalid.</dd>
<dd><code>VBOX_E_FILE_ERROR</code> - Resulting settings file name is invalid or the settings file already
exists or could not be created due to an I/O error.</dd>
<dd><code>E_INVALIDARG</code> - name is empty or  null.</dd>
</dl>

@param settingsFile Fully qualified path where the settings file should be created,
empty string or  null for a default folder and file based on the
name argument and the primary group.
(see{@link #composeMachineFilename(String,String,String,String)}).

@param name Machine name.

@param groups Array of group names.  null or an empty array have the same
meaning as an array with just the empty string or<code>"/"</code>, i.e.
create a machine without group association.

@param osTypeId Guest OS Type ID.

@param flags Additional property parameters, passed as a comma-separated list of
"name=value" type entries. The following ones are recognized:<code>forceOverwrite=1</code>to overwrite an existing machine settings
file,<code>UUID=&lt;uuid&gt;</code>to specify a machine UUID and<code>directoryIncludesUUID=1</code>to switch to a special VM directory
naming scheme which should not be used unless necessary.

@param cipher The cipher. It should be empty if encryption is not required.

@param passwordId The password id. It should be empty if encryption is not required.

@param password The password. It should be empty if encryption is not required.

@return Created machine object.

NOTE: {@link org.virtualbox_7_0.IMachine#getSettingsModified()}will return
false for the created machine, until any of machine settings
are changed.

NOTE: There is no way to change the name of the settings file or
subfolder of the created machine directly.

*/
    public org.virtualbox_7_0.IMachine createMachine(String settingsFile, String name, List<String> groups, String osTypeId, String flags, String cipher, String passwordId, String password)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxCreateMachine(obj, settingsFile, name, groups, osTypeId, flags, cipher, passwordId, password);
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
Opens a virtual machine from the existing settings file.
The opened machine remains unregistered until you call{@link #registerMachine(org.virtualbox_7_0.IMachine)}.

The specified settings file name must be fully qualified.
The file must exist and be a valid machine XML settings file
whose contents will be used to construct the machine object.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_FILE_ERROR</code> - Settings file name invalid, not found or sharing violation.</dd>
</dl>

@param settingsFile Name of the machine settings file.

@param password The password. If the machine is not encrypted the parameter is
ignored.

@return Opened machine object.

NOTE: If the VM is encrypted and password is incorrect
the method returns success allowing you to register the
encrypted machine but it remains in inaccessible state. You
can check{@link org.virtualbox_7_0.IMachine#getAccessible()}and{@link org.virtualbox_7_0.IMachine#getAccessError()}properties to determine the
real machine state.

NOTE: {@link org.virtualbox_7_0.IMachine#getSettingsModified()}will return
false for the opened machine, until any of machine settings
are changed.

*/
    public org.virtualbox_7_0.IMachine openMachine(String settingsFile, String password)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxOpenMachine(obj, settingsFile, password);
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
Registers the machine previously created using{@link #createMachine(String,String,List,String,String,String,String,String)}or opened using{@link #openMachine(String,String)}within this VirtualBox installation. After
successful method invocation, the{@link org.virtualbox_7_0.IMachineRegisteredEvent}event is fired.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - No matching virtual machine found.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Virtual machine was not created within this VirtualBox instance.</dd>
</dl>

NOTE: This method implicitly calls{@link org.virtualbox_7_0.IMachine#saveSettings()}to save all current machine settings before registering it.

*/
    public void registerMachine(org.virtualbox_7_0.IMachine machine)
    {
        try
        {
        port.iVirtualBoxRegisterMachine(obj, ((machine == null) ? null :machine.getWrapped()));
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
Attempts to find a virtual machine given its name or UUID.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - Could not find registered machine matching  nameOrId.</dd>
</dl>

@param nameOrId What to search for. This can either be the UUID or the name of a virtual machine.

@return Machine object, if found.

NOTE: Inaccessible machines cannot be found by name, only by UUID, because their name
cannot safely be determined.

*/
    public org.virtualbox_7_0.IMachine findMachine(String nameOrId)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxFindMachine(obj, nameOrId);
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
Gets all machine references which are in one of the specified groups.
@param groups What groups to match. The usual group list rules apply, i.e.
passing an empty list will match VMs in the toplevel group, likewise
the empty string.

@return All machines which matched.

*/
    public List<org.virtualbox_7_0.IMachine> getMachinesByGroups(List<String> groups)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal;
        retVal = port.iVirtualBoxGetMachinesByGroups(obj, groups);
           return Helper.wrap(org.virtualbox_7_0.IMachine.class, getObjMgr(), port, retVal);
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
Gets the state of several machines in a single operation.
@param machines Array with the machine references.

@return Machine states, corresponding to the machines.

*/
    public List<org.virtualbox_7_0.MachineState> getMachineStates(List<org.virtualbox_7_0.IMachine> machines)
    {
        try
        {
            List<org.virtualbox_7_0.jaxws.MachineState> retVal;
        retVal = port.iVirtualBoxGetMachineStates(obj, Helper.unwrap(machines));
           return Helper.convertEnums(org.virtualbox_7_0.jaxws.MachineState.class, org.virtualbox_7_0.MachineState.class, retVal);
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
Creates a new appliance object, which represents an appliance in the Open Virtual Machine
Format (OVF). This can then be used to import an OVF appliance into VirtualBox or to export
machines as an OVF appliance; see the documentation for{@link org.virtualbox_7_0.IAppliance}for details.
@return New appliance.

*/
    public org.virtualbox_7_0.IAppliance createAppliance()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxCreateAppliance(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IAppliance(retVal, getObjMgr(), port) : null;
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
Creates a new{@link org.virtualbox_7_0.IUnattended}guest installation object.  This can be used to
analyze an installation ISO to create and configure a new machine for it to be installed
on.  It can also be used to (re)install an existing machine.
@return New unattended object.

*/
    public org.virtualbox_7_0.IUnattended createUnattendedInstaller()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxCreateUnattendedInstaller(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IUnattended(retVal, getObjMgr(), port) : null;
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
Creates a new base medium object that will use the given storage
format and location for medium data.

The actual storage unit is not created by this method. In order to
do it, and before you are able to attach the created medium to
virtual machines, you must call one of the following methods to
allocate a format-specific storage unit at the specified location:<ul><li>{@link org.virtualbox_7_0.IMedium#createBaseStorage(Long,List)}</li><li>{@link org.virtualbox_7_0.IMedium#createDiffStorage(org.virtualbox_7_0.IMedium,List)}</li></ul>Some medium attributes, such as{@link org.virtualbox_7_0.IMedium#getId()}, may
remain uninitialized until the medium storage unit is successfully
created by one of the above methods.

Depending on the given device type, the file at the storage location
must be in one of the media formats understood by VirtualBox:<ul><li>With a "HardDisk" device type, the file must be a hard disk image
in one of the formats supported by VirtualBox (see{@link org.virtualbox_7_0.ISystemProperties#getMediumFormats()}).
After the storage unit is successfully created and this method succeeds,
if the medium is a base medium, it
will be added to the{@link #getHardDisks()}array attribute.</li><li>With a "DVD" device type, the file must be an ISO 9960 CD/DVD image.
After this method succeeds, the medium will be added to the{@link #getDVDImages()}array attribute.</li><li>With a "Floppy" device type, the file must be an RAW floppy image.
After this method succeeds, the medium will be added to the{@link #getFloppyImages()}array attribute.</li></ul>The list of all storage formats supported by this VirtualBox
installation can be obtained using{@link org.virtualbox_7_0.ISystemProperties#getMediumFormats()}. If the  format
attribute is empty or  null then the default storage format
specified by{@link org.virtualbox_7_0.ISystemProperties#getDefaultHardDiskFormat()}will
be used for disks r creating a storage unit of the medium.

Note that the format of the location string is storage format specific.
See{@link org.virtualbox_7_0.IMedium#getLocation()}and IMedium for more details.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - format identifier is invalid. See{@link org.virtualbox_7_0.ISystemProperties#getMediumFormats()}.</dd>
<dd><code>VBOX_E_FILE_ERROR</code> - location is a not valid file name (for file-based formats only).</dd>
</dl>

@param format Identifier of the storage format to use for the new medium.

@param location Location of the storage unit for the new medium.

@param accessMode Whether to open the image in read/write or read-only mode. For
a "DVD" device type, this is ignored and read-only mode is always assumed.

@param aDeviceTypeType Must be one of "HardDisk", "DVD" or "Floppy".

@return Created medium object.

*/
    public org.virtualbox_7_0.IMedium createMedium(String format, String location, org.virtualbox_7_0.AccessMode accessMode, org.virtualbox_7_0.DeviceType aDeviceTypeType)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxCreateMedium(obj, format, location, org.virtualbox_7_0.jaxws.AccessMode.fromValue(accessMode.name()), org.virtualbox_7_0.jaxws.DeviceType.fromValue(aDeviceTypeType.name()));
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
Finds existing media or opens a medium from an existing storage location.

Once a medium has been opened, it can be passed to other VirtualBox
methods, in particular to{@link org.virtualbox_7_0.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_7_0.DeviceType,org.virtualbox_7_0.IMedium)}.

Depending on the given device type, the file at the storage location
must be in one of the media formats understood by VirtualBox:<ul><li>With a "HardDisk" device type, the file must be a hard disk image
in one of the formats supported by VirtualBox (see{@link org.virtualbox_7_0.ISystemProperties#getMediumFormats()}).
After this method succeeds, if the medium is a base medium, it
will be added to the{@link #getHardDisks()}array attribute.</li><li>With a "DVD" device type, the file must be an ISO 9960 CD/DVD image.
After this method succeeds, the medium will be added to the{@link #getDVDImages()}array attribute.</li><li>With a "Floppy" device type, the file must be an RAW floppy image.
After this method succeeds, the medium will be added to the{@link #getFloppyImages()}array attribute.</li></ul>After having been opened, the medium can be re-found by this method
and can be attached to virtual machines. See{@link org.virtualbox_7_0.IMedium}for
more details.

The UUID of the newly opened medium will either be retrieved from the
storage location, if the format supports it (e.g. for hard disk images),
or a new UUID will be randomly generated (e.g. for ISO and RAW files).
If for some reason you need to change the medium's UUID, use{@link org.virtualbox_7_0.IMedium#setIds(Boolean,String,Boolean,String)}.

If a differencing hard disk medium is to be opened by this method, the
operation will succeed only if its parent medium and all ancestors,
if any, are already known to this VirtualBox installation (for example,
were opened by this method before).

This method attempts to guess the storage format of the specified medium
by reading medium data at the specified location.

If  accessMode is ReadWrite (which it should be for hard disks and floppies),
the image is opened for read/write access and must have according permissions,
as VirtualBox may actually write status information into the disk's metadata
sections.

Note that write access is required for all typical hard disk usage in VirtualBox,
since VirtualBox may need to write metadata such as a UUID into the image.
The only exception is opening a source image temporarily for copying and
cloning (see{@link org.virtualbox_7_0.IMedium#cloneTo(org.virtualbox_7_0.IMedium,List,org.virtualbox_7_0.IMedium)}when the image will be closed
again soon.

The format of the location string is storage format specific. See{@link org.virtualbox_7_0.IMedium#getLocation()}and IMedium for more details.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_FILE_ERROR</code> - Invalid medium storage file location or could not find the medium
at the specified location.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - Could not get medium storage format.</dd>
<dd><code>E_INVALIDARG</code> - Invalid medium storage format.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - Medium has already been added to a media registry.</dd>
</dl>

@param location Location of the storage unit that contains medium data in one of
the supported storage formats.

@param deviceType Must be one of "HardDisk", "DVD" or "Floppy".

@param accessMode Whether to open the image in read/write or read-only mode. For
a "DVD" device type, this is ignored and read-only mode is always assumed.

@param forceNewUuid Allows the caller to request a completely new medium UUID for
the image which is to be opened. Useful if one intends to open an exact
copy of a previously opened image, as this would normally fail due to
the duplicate UUID.

@return Opened medium object.

*/
    public org.virtualbox_7_0.IMedium openMedium(String location, org.virtualbox_7_0.DeviceType deviceType, org.virtualbox_7_0.AccessMode accessMode, Boolean forceNewUuid)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxOpenMedium(obj, location, org.virtualbox_7_0.jaxws.DeviceType.fromValue(deviceType.name()), org.virtualbox_7_0.jaxws.AccessMode.fromValue(accessMode.name()), forceNewUuid);
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
Returns an object describing the specified guest OS type.

The requested guest OS type is specified using a string which is a
mnemonic identifier of the guest operating system, such as<code>"win31"</code>or<code>"ubuntu"</code>. The guest OS type ID of a
particular virtual machine can be read or set using the{@link org.virtualbox_7_0.IMachine#getOSTypeId()}attribute.

The{@link org.virtualbox_7_0.IVirtualBox#getGuestOSTypes()}collection contains all
available guest OS type objects. Each object has an{@link org.virtualbox_7_0.IGuestOSType#getId()}attribute which contains an identifier of
the guest OS this object describes.

While this function returns an error for unknown guest OS types, they
can be still used without serious problems (if one accepts the fact
that there is no default VM config information).
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - id is not a valid Guest OS type.</dd>
</dl>

@param id Guest OS type ID string.

@return Guest OS type object.

*/
    public org.virtualbox_7_0.IGuestOSType getGuestOSType(String id)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            org.virtualbox_7_0.jaxws.IGuestOSType retVal;
        retVal = port.iVirtualBoxGetGuestOSType(obj, id);
           return (retVal != null) ? new org.virtualbox_7_0.IGuestOSType(retVal, getObjMgr(), port) : null;
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
Creates a new global shared folder by associating the given logical
name with the given host path, adds it to the collection of shared
folders and starts sharing it. Refer to the description of{@link org.virtualbox_7_0.ISharedFolder}to read more about logical names.
@param name Unique logical name of the shared folder.

@param hostPath Full path to the shared folder in the host file system.

@param writable Whether the share is writable or readonly

@param automount Whether the share gets automatically mounted by the guest
or not.

@param autoMountPoint Where the guest should automatically mount the folder, if possible.
For Windows and OS/2 guests this should be a drive letter, while other
guests it should be a absolute directory.

NOTE: In the current implementation, this operation is not
implemented.

*/
    public void createSharedFolder(String name, String hostPath, Boolean writable, Boolean automount, String autoMountPoint)
    {
        try
        {
        port.iVirtualBoxCreateSharedFolder(obj, name, hostPath, writable, automount, autoMountPoint);
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
Removes the global shared folder with the given name previously
created by{@link #createSharedFolder(String,String,Boolean,Boolean,String)}from the collection of
shared folders and stops sharing it.
@param name Logical name of the shared folder to remove.

NOTE: In the current implementation, this operation is not
implemented.

*/
    public void removeSharedFolder(String name)
    {
        try
        {
        port.iVirtualBoxRemoveSharedFolder(obj, name);
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
Returns an array representing the global extra data keys which currently
have values defined.
@return Array of extra data keys.

*/
    public List<String> getExtraDataKeys()
    {
        try
        {
            List<String> retVal;
        retVal = port.iVirtualBoxGetExtraDataKeys(obj);
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
Returns associated global extra data.

If the requested data  key does not exist, this function will
succeed and return an empty string in the  value argument.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_FILE_ERROR</code> - Settings file not accessible.</dd>
<dd><code>VBOX_E_XML_ERROR</code> - Could not parse the settings file.</dd>
</dl>

@param key Name of the data key to get.

@return Value of the requested data key.

*/
    public String getExtraData(String key)
    {
        try
        {
            String retVal;
        retVal = port.iVirtualBoxGetExtraData(obj, key);
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
Sets associated global extra data.

If you pass  null or an empty string as a key  value, the given
key will be deleted.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_FILE_ERROR</code> - Settings file not accessible.</dd>
<dd><code>VBOX_E_XML_ERROR</code> - Could not parse the settings file.</dd>
<dd><code>E_ACCESSDENIED</code> - Modification request refused.</dd>
<dd><code>E_INVALIDARG</code> - Key contains invalid characters.</dd>
</dl>

@param key Name of the data key to set.

@param value Value to assign to the key.

NOTE: Key must contain printable (non-control) UTF-8 characters only.

NOTE: Before performing the actual data change, this method will ask all
registered event listeners using the{@link org.virtualbox_7_0.IExtraDataCanChangeEvent}notification for a permission. If one of the listeners refuses the
new value, the change will not be performed.

NOTE: On success, the{@link org.virtualbox_7_0.IExtraDataChangedEvent}notification
is called to inform all registered listeners about a successful data
change.

*/
    public void setExtraData(String key, String value)
    {
        try
        {
        port.iVirtualBoxSetExtraData(obj, key, value);
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
Unlocks the secret data by passing the unlock password to the
server. The server will cache the password for that machine.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_INVALID_VM_STATE</code> - Virtual machine is not mutable.</dd>
</dl>

@param password The cipher key.

*/
    public void setSettingsSecret(String password)
    {
        try
        {
        port.iVirtualBoxSetSettingsSecret(obj, password);
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
Creates a DHCP server settings to be used for the given internal network name
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Host network interface  name already exists.</dd>
</dl>

@param name server name

@return DHCP server settings

*/
    public org.virtualbox_7_0.IDHCPServer createDHCPServer(String name)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxCreateDHCPServer(obj, name);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IDHCPServer(retVal, getObjMgr(), port) : null;
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
Searches a DHCP server settings to be used for the given internal network name
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Host network interface  name already exists.</dd>
</dl>

@param name server name

@return DHCP server settings

*/
    public org.virtualbox_7_0.IDHCPServer findDHCPServerByNetworkName(String name)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxFindDHCPServerByNetworkName(obj, name);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IDHCPServer(retVal, getObjMgr(), port) : null;
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
Removes the DHCP server settings
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_INVALIDARG</code> - Host network interface  name already exists.</dd>
</dl>

@param server DHCP server settings to be removed

*/
    public void removeDHCPServer(org.virtualbox_7_0.IDHCPServer server)
    {
        try
        {
        port.iVirtualBoxRemoveDHCPServer(obj, ((server == null) ? null :server.getWrapped()));
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
    public org.virtualbox_7_0.INATNetwork createNATNetwork(String networkName)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxCreateNATNetwork(obj, networkName);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.INATNetwork(retVal, getObjMgr(), port) : null;
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
    public org.virtualbox_7_0.INATNetwork findNATNetworkByName(String networkName)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxFindNATNetworkByName(obj, networkName);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.INATNetwork(retVal, getObjMgr(), port) : null;
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
    public void removeNATNetwork(org.virtualbox_7_0.INATNetwork network)
    {
        try
        {
        port.iVirtualBoxRemoveNATNetwork(obj, ((network == null) ? null :network.getWrapped()));
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
    public org.virtualbox_7_0.IHostOnlyNetwork createHostOnlyNetwork(String networkName)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxCreateHostOnlyNetwork(obj, networkName);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IHostOnlyNetwork(retVal, getObjMgr(), port) : null;
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
    public org.virtualbox_7_0.IHostOnlyNetwork findHostOnlyNetworkByName(String networkName)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxFindHostOnlyNetworkByName(obj, networkName);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IHostOnlyNetwork(retVal, getObjMgr(), port) : null;
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
Searches through all host networks for one with
the given GUID.
@param id GUID of the host-only network to search for.

@return Found host-only network object.

NOTE: The method returns an error if the given GUID does not
correspond to any host network.

*/
    public org.virtualbox_7_0.IHostOnlyNetwork findHostOnlyNetworkById(String id)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxFindHostOnlyNetworkById(obj, id);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IHostOnlyNetwork(retVal, getObjMgr(), port) : null;
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
    public void removeHostOnlyNetwork(org.virtualbox_7_0.IHostOnlyNetwork network)
    {
        try
        {
        port.iVirtualBoxRemoveHostOnlyNetwork(obj, ((network == null) ? null :network.getWrapped()));
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
    public org.virtualbox_7_0.ICloudNetwork createCloudNetwork(String networkName)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxCreateCloudNetwork(obj, networkName);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.ICloudNetwork(retVal, getObjMgr(), port) : null;
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
    public org.virtualbox_7_0.ICloudNetwork findCloudNetworkByName(String networkName)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxFindCloudNetworkByName(obj, networkName);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.ICloudNetwork(retVal, getObjMgr(), port) : null;
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
    public void removeCloudNetwork(org.virtualbox_7_0.ICloudNetwork network)
    {
        try
        {
        port.iVirtualBoxRemoveCloudNetwork(obj, ((network == null) ? null :network.getWrapped()));
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
Check if this VirtualBox installation has a firmware
of the given type available, either system-wide or per-user.
Optionally, this may return a hint where this firmware can be
downloaded from.
@param firmwareType Type of firmware to check.

@param version Expected version number, usually empty string (presently ignored).

@param url Suggested URL to download this firmware from.

@param file Filename of firmware, only valid if result == TRUE.

@return If firmware of this type and version is available.

*/
    public Boolean checkFirmwarePresent(org.virtualbox_7_0.FirmwareType firmwareType, String version, Holder<String> url, Holder<String> file)
    {
        try
        {
        javax.xml.ws.Holder<String> tmp_url = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> tmp_file = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<Boolean> retVal = new javax.xml.ws.Holder<Boolean>();
        port.iVirtualBoxCheckFirmwarePresent(obj, org.virtualbox_7_0.jaxws.FirmwareType.fromValue(firmwareType.name()), version, tmp_url, tmp_file, retVal);
        url.value = tmp_url.value;
        file.value = tmp_file.value;
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
Searches through all progress objects known to VBoxSVC for an
instance with the given GUID.
@param id GUID of the progress object to search for.

@return Found progress object.

NOTE: The method returns an error if the given GUID does not
correspond to any currently known progress object.

*/
    public org.virtualbox_7_0.IProgress findProgressById(String id)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iVirtualBoxFindProgressById(obj, id);
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

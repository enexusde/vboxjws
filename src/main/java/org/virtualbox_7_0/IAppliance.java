
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
 * IAppliance.java
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
Represents a platform-independent appliance in OVF format. An instance of this is returned
by{@link org.virtualbox_7_0.IVirtualBox#createAppliance()}, which can then be used to import and export
virtual machines within an appliance with VirtualBox.

The OVF standard suggests two different physical file formats:<ol><li>If the appliance is distributed as a set of files, there must be at least one XML descriptor
file that conforms to the OVF standard and carries an<code>.ovf</code>file extension. If
this descriptor file references other files such as disk images, as OVF appliances typically
do, those additional files must be in the same directory as the descriptor file.</li><li>If the appliance is distributed as a single file, it must be in TAR format and have the<code>.ova</code>file extension. This TAR file must then contain at least the OVF descriptor
files and optionally other files.

At this time, VirtualBox does not not yet support the packed (TAR) variant; support will
be added with a later version.</li></ol><b>Importing</b>an OVF appliance into VirtualBox as instances of{@link org.virtualbox_7_0.IMachine}involves the following sequence of API calls:<ol><li>Call{@link org.virtualbox_7_0.IVirtualBox#createAppliance()}. This will create an empty IAppliance object.</li><li>On the new object, call{@link #read(String)}with the full path of the OVF file you
would like to import. So long as this file is syntactically valid, this will succeed
and fill the appliance object with the parsed data from the OVF file.</li><li>Next, call{@link #interpret()}, which analyzes the OVF data and sets up the
contents of the IAppliance attributes accordingly. These can be inspected by a
VirtualBox front-end such as the GUI, and the suggestions can be displayed to the
user. In particular, the{@link #getVirtualSystemDescriptions()}array contains
instances of{@link org.virtualbox_7_0.IVirtualSystemDescription}which represent the virtual
systems (machines) in the OVF, which in turn describe the virtual hardware prescribed
by the OVF (network and hardware adapters, virtual disk images, memory size and so on).
The GUI can then give the user the option to confirm and/or change these suggestions.</li><li>If desired, call{@link org.virtualbox_7_0.IVirtualSystemDescription#setFinalValues(List,List,List)}for each
virtual system (machine) to override the suggestions made by the{@link #interpret()}routine.</li><li>Finally, call{@link #importMachines(List)}to create virtual machines in
VirtualBox as instances of{@link org.virtualbox_7_0.IMachine}that match the information in the
virtual system descriptions. After this call succeeded, the UUIDs of the machines created
can be found in the{@link #getMachines()}array attribute.</li></ol><b>Exporting</b>VirtualBox machines into an OVF appliance involves the following steps:<ol><li>As with importing, first call{@link org.virtualbox_7_0.IVirtualBox#createAppliance()}to create
an empty IAppliance object.</li><li>For each machine you would like to export, call{@link org.virtualbox_7_0.IMachine#exportTo(org.virtualbox_7_0.IAppliance,String)}with the IAppliance object you just created. Each such call creates one instance of{@link org.virtualbox_7_0.IVirtualSystemDescription}inside the appliance.</li><li>If desired, call{@link org.virtualbox_7_0.IVirtualSystemDescription#setFinalValues(List,List,List)}for each
virtual system (machine) to override the suggestions made by the{@link org.virtualbox_7_0.IMachine#exportTo(org.virtualbox_7_0.IAppliance,String)}routine.</li><li>Finally, call{@link #write(String,List,String)}with a path specification to have the OVF
file written.</li></ol>

Interface ID: <code>{86A98347-7619-41AA-AECE-B21AC5C1A7E6}</code>
*/
public class IAppliance extends IUnknown
{

    public IAppliance(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Path to the main file of the OVF appliance, which is either the<code>.ovf</code>or
the<code>.ova</code>file passed to{@link #read(String)}(for import) or{@link #write(String,List,String)}(for export).
This attribute is empty until one of these methods has been called.
@return String
*/
    public String getPath()
    {
        try
        {
            String retVal = port.iApplianceGetPath(obj);
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
Array of virtual disk definitions. One such description exists for each
disk definition in the OVF; each string array item represents one such piece of
disk information, with the information fields separated by tab (\\t) characters.

The caller should be prepared for additional fields being appended to
this string in future versions of VirtualBox and therefore check for
the number of tabs in the strings returned.

In the current version, the following eight fields are returned per string
in the array:<ol><li>Disk ID (unique string identifier given to disk)</li><li>Capacity (unsigned integer indicating the maximum capacity of the disk)</li><li>Populated size (optional unsigned integer indicating the current size of the
disk; can be approximate; -1 if unspecified)</li><li>Format (string identifying the disk format, typically
"http://www.vmware.com/specifications/vmdk.html#sparse")</li><li>Reference (where to find the disk image, typically a file name; if empty,
then the disk should be created on import)</li><li>Image size (optional unsigned integer indicating the size of the image,
which need not necessarily be the same as the values specified above, since
the image may be compressed or sparse; -1 if not specified)</li><li>Chunk size (optional unsigned integer if the image is split into chunks;
presently unsupported and always -1)</li><li>Compression (optional string equaling "gzip" if the image is gzip-compressed)</li></ol>
@return List&lt;String&gt;
*/
    public List<String> getDisks()
    {
        try
        {
            List<String> retVal = port.iApplianceGetDisks(obj);
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
Array of virtual system descriptions. One such description is created
for each virtual system (machine) found in the OVF.
This array is empty until either{@link #interpret()}(for import) or{@link org.virtualbox_7_0.IMachine#exportTo(org.virtualbox_7_0.IAppliance,String)}(for export) has been called.
@return List&lt;org.virtualbox_7_0.IVirtualSystemDescription&gt;
*/
    public List<org.virtualbox_7_0.IVirtualSystemDescription> getVirtualSystemDescriptions()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iApplianceGetVirtualSystemDescriptions(obj);
            return Helper.wrap(org.virtualbox_7_0.IVirtualSystemDescription.class, getObjMgr(), port, retVal);
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
Contains the UUIDs of the machines created from the information in this appliances. This is only
relevant for the import case, and will only contain data after a call to{@link #importMachines(List)}succeeded.
@return List&lt;String&gt;
*/
    public List<String> getMachines()
    {
        try
        {
            List<String> retVal = port.iApplianceGetMachines(obj);
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
The X.509 signing certificate, if the imported OVF was signed,  null
if not signed.  This is available after calling{@link #read(String)}.
@return org.virtualbox_7_0.ICertificate
*/
    public org.virtualbox_7_0.ICertificate getCertificate()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iApplianceGetCertificate(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.ICertificate(retVal, getObjMgr(), port) : null;
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
    public static IAppliance queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IAppliance(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Reads an OVF file into the appliance object.

This method succeeds if the OVF is syntactically valid and, by itself, without errors. The
mere fact that this method returns successfully does not mean that VirtualBox supports all
features requested by the appliance; this can only be examined after a call to{@link #interpret()}.
@param file Name of appliance file to open (either with an<code>.ovf</code>or<code>.ova</code>extension, depending
on whether the appliance is distributed as a set of files or as a single file, respectively).

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress read(String file)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iApplianceRead(obj, file);
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
Interprets the OVF data that was read when the appliance was constructed. After
calling this method, one can inspect the{@link #getVirtualSystemDescriptions()}array attribute, which will then contain
one{@link org.virtualbox_7_0.IVirtualSystemDescription}for each virtual machine found in
the appliance.

Calling this method is the second step of importing an appliance into VirtualBox;
see{@link org.virtualbox_7_0.IAppliance}for an overview.

After calling this method, one should call{@link #getWarnings()}to find out
if problems were encountered during the processing which might later lead to
errors.
*/
    public void interpret()
    {
        try
        {
        port.iApplianceInterpret(obj);
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
Imports the appliance into VirtualBox by creating instances of{@link org.virtualbox_7_0.IMachine}and other interfaces that match the information contained in the appliance as
closely as possible, as represented by the import instructions in the{@link #getVirtualSystemDescriptions()}array.

Calling this method is the final step of importing an appliance into VirtualBox;
see{@link org.virtualbox_7_0.IAppliance}for an overview.

Since importing the appliance will most probably involve copying and converting
disk images, which can take a long time, this method operates asynchronously and
returns an IProgress object to allow the caller to monitor the progress.

After the import succeeded, the UUIDs of the IMachine instances created can be
retrieved from the{@link #getMachines()}array attribute.
@param options Options for the importing operation.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress importMachines(List<org.virtualbox_7_0.ImportOptions> options)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iApplianceImportMachines(obj, Helper.convertEnums(org.virtualbox_7_0.ImportOptions.class, org.virtualbox_7_0.jaxws.ImportOptions.class, options));
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
Returns a{@link org.virtualbox_7_0.IVFSExplorer}object for the given URI.
@param URI The URI describing the file system to use.

*/
    public org.virtualbox_7_0.IVFSExplorer createVFSExplorer(String URI)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iApplianceCreateVFSExplorer(obj, URI);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IVFSExplorer(retVal, getObjMgr(), port) : null;
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
Writes the contents of the appliance exports into a new OVF file.

Calling this method is the final step of exporting an appliance from VirtualBox;
see{@link org.virtualbox_7_0.IAppliance}for an overview.

Since exporting the appliance will most probably involve copying and converting
disk images, which can take a long time, this method operates asynchronously and
returns an IProgress object to allow the caller to monitor the progress.
@param format Output format, as a string. Currently supported formats are "ovf-0.9", "ovf-1.0",
"ovf-2.0" and "opc-1.0"; future versions of VirtualBox may support additional formats.
The "opc-1.0" format is for creating tarballs for the Oracle Public Cloud.

@param options Options for the exporting operation.

@param path Name of appliance file to create.  There are certain restrictions with regard
to the file name suffix.  If the format parameter is "opc-1.0" a<code>.tar.gz</code>suffix is required.  Otherwise the suffix must either be<code>.ovf</code>or<code>.ova</code>, depending on whether the appliance is distributed as a set of
files or as a single file, respectively.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress write(String format, List<org.virtualbox_7_0.ExportOptions> options, String path)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iApplianceWrite(obj, format, Helper.convertEnums(org.virtualbox_7_0.ExportOptions.class, org.virtualbox_7_0.jaxws.ExportOptions.class, options), path);
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
Returns textual warnings which occurred during execution of{@link #interpret()}.
*/
    public List<String> getWarnings()
    {
        try
        {
            List<String> retVal;
        retVal = port.iApplianceGetWarnings(obj);
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
Returns a list of password identifiers which must be supplied to import or export
encrypted virtual machines.
@return The list of password identifiers required for export on success.

*/
    public List<String> getPasswordIds()
    {
        try
        {
            List<String> retVal;
        retVal = port.iApplianceGetPasswordIds(obj);
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
Returns a list of medium identifiers which use the given password identifier.
@param passwordId The password identifier to get the medium identifiers for.

@return The list of medium identifiers returned on success.

*/
    public List<String> getMediumIdsForPasswordId(String passwordId)
    {
        try
        {
            List<String> retVal;
        retVal = port.iApplianceGetMediumIdsForPasswordId(obj, passwordId);
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
Adds a list of passwords required to import or export encrypted virtual
machines.
@param identifiers List of identifiers.

@param passwords List of matching passwords.

*/
    public void addPasswords(List<String> identifiers, List<String> passwords)
    {
        try
        {
        port.iApplianceAddPasswords(obj, identifiers, passwords);
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
Creates a number of{@link org.virtualbox_7_0.IVirtualSystemDescription}objects and store them
in the{@link #getVirtualSystemDescriptions()}array.
@param requested Requested number of new virtual system description objects

@return Actually created number of virtual system description objects

*/
    public Long createVirtualSystemDescriptions(Long requested)
    {
        try
        {
            Long retVal;
        retVal = port.iApplianceCreateVirtualSystemDescriptions(obj, requested);
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
}

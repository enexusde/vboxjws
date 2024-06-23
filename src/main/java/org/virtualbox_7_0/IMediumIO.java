
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
 * IMediumIO.java
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
The IMediumIO interface is used to access and modify the content of a
medium.  It is returned by{@link org.virtualbox_7_0.IMedium#openForIO(Boolean,String)}.

Interface ID: <code>{E4B301A9-5F86-4D65-AD1B-87CA284FB1C8}</code>
*/
public class IMediumIO extends IUnknown
{

    public IMediumIO(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
The open medium.
@return org.virtualbox_7_0.IMedium
*/
    public org.virtualbox_7_0.IMedium getMedium()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMediumIOGetMedium(obj);
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
Whether the medium can be written to. (It can always be read from.)
@return Boolean
*/
    public Boolean getWritable()
    {
        try
        {
            Boolean retVal = port.iMediumIOGetWritable(obj);
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
Returns the virtual file system explorer for the medium.

This will attempt to recognize the format of the medium content and
present it as a virtual directory structure to the API user.

A FAT floppy image will be represented will a single root subdir 'fat12'
that gives access to the file system content.

A ISO-9660 image will have one subdir in the root for each format present
in the image, so the API user can select which data view to access (iso9660,
rockridge, joliet, udf, hfs, ...).

A partitioned harddisk image will have subdirs for each partition.  The
the filesystem content of each partition can be accessed thru the subdirs
if we have a file system interpreter for it.  There will also be raw files
for each subdirectory, to provide a simple way of accessing raw partition
data from an API client.

Please note that the explorer may show inconsistent information if
the API user modifies the raw image content after it was opened.
@return org.virtualbox_7_0.IVFSExplorer
*/
    public org.virtualbox_7_0.IVFSExplorer getExplorer()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iMediumIOGetExplorer(obj);
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
    public static IMediumIO queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IMediumIO(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Read data from the medium.
@param offset The byte offset into the medium to start reading at.

@param size How many bytes to try read.

@return Array of data read. This may be shorter than the specified size.

*/
    public byte[] read(Long offset, Long size)
    {
        try
        {
            /*base64*/String retVal;
        retVal = port.iMediumIORead(obj, offset, size);
           return Helper.decodeBase64(retVal);
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
Write data to the medium.
@param offset The byte offset into the medium to start reading at.

@param data Array of data to write.

@return How many bytes were actually written.

*/
    public Long write(Long offset, byte[] data)
    {
        try
        {
            Long retVal;
        retVal = port.iMediumIOWrite(obj, offset, Helper.encodeBase64(data));
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
Formats the medium as FAT.  Generally only useful for floppy images as
no partition table will be created.
@param quick Quick format it when set.

*/
    public void formatFAT(Boolean quick)
    {
        try
        {
        port.iMediumIOFormatFAT(obj, quick);
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
Writes an empty partition table to the disk.
@param format The partition table format.

@param wholeDiskInOneEntry When  true a partition table entry for the whole disk is created.
Otherwise the partition table is empty.

*/
    public void initializePartitionTable(org.virtualbox_7_0.PartitionTableType format, Boolean wholeDiskInOneEntry)
    {
        try
        {
        port.iMediumIOInitializePartitionTable(obj, org.virtualbox_7_0.jaxws.PartitionTableType.fromValue(format.name()), wholeDiskInOneEntry);
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
Converts the currently opened image into a stream of the specified
image type/variant. It is sufficient to open the image in read-only
mode. Only few types and variants are supported due to the inherent
restrictions of the output style.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - The requested format/variant combination cannot handle stream output.</dd>
<dd><code>VBOX_E_FILE_ERROR</code> - An error occurred during the conversion.</dd>
</dl>

@param format Identifier of the storage format to use for output.

@param variant The partition table format.

@param bufferSize Requested buffer size (in bytes) for efficient conversion. Sizes
which are too small or too large are silently truncated to suitable
values. Tens to hundreds of Megabytes are a good choice.

@param stream Data stream object for reading the target image.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress convertToStream(String format, List<org.virtualbox_7_0.MediumVariant> variant, Long bufferSize, Holder<org.virtualbox_7_0.IDataStream> stream)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
        jakarta.xml.ws.Holder<String> tmp_stream = new jakarta.xml.ws.Holder<String>();
        jakarta.xml.ws.Holder<String> retVal = new jakarta.xml.ws.Holder<String>();
        port.iMediumIOConvertToStream(obj, format, Helper.convertEnums(org.virtualbox_7_0.MediumVariant.class, org.virtualbox_7_0.jaxws.MediumVariant.class, variant), bufferSize, tmp_stream, retVal);
        stream.value = (tmp_stream.value.length() > 0) ? new org.virtualbox_7_0.IDataStream(tmp_stream.value, getObjMgr(), port) : null;
           return (retVal.value.length() > 0) ? new org.virtualbox_7_0.IProgress(retVal.value, getObjMgr(), port) : null;
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
Explictly close the medium I/O rather than waiting for garbage
collection and the destructor.

This will wait for any pending reads and writes to complete and then
close down the I/O access without regard for open explorer instances or
anything like that.
*/
    public void close()
    {
        try
        {
        port.iMediumIOClose(obj);
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

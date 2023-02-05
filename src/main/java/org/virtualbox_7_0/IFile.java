
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
 * IFile.java
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
Abstract parent interface for files handled by VirtualBox.

Interface ID: <code>{59A235AC-2F1A-4D6C-81FC-E3FA843F49AE}</code>
*/
public class IFile extends IUnknown
{

    public IFile(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Event source for file events.
@return org.virtualbox_7_0.IEventSource
*/
    public org.virtualbox_7_0.IEventSource getEventSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iFileGetEventSource(obj);
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

/**
The ID VirtualBox internally assigned to the open file.
@return Long
*/
    public Long getId()
    {
        try
        {
            Long retVal = port.iFileGetId(obj);
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
The initial size in bytes when opened.
@return Long
*/
    public Long getInitialSize()
    {
        try
        {
            Long retVal = port.iFileGetInitialSize(obj);
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
The current file position.

The file current position always applies to the{@link org.virtualbox_7_0.IFile#read(Long,Long)}method, which updates it upon return.  Same goes for the{@link org.virtualbox_7_0.IFile#write(byte[],Long)}method except when{@link org.virtualbox_7_0.IFile#getAccessMode()}is{@link org.virtualbox_7_0.FileAccessMode#AppendOnly}or{@link org.virtualbox_7_0.FileAccessMode#AppendRead}, where it will always write
to the end of the file and will leave this attribute unchanged.

The{@link org.virtualbox_7_0.IFile#seek(Long,org.virtualbox_7_0.FileSeekOrigin)}is used to change this attribute without
transfering any file data like read and write does.
NOTE: This will not always be correct with older Guest Additions
(version 5.2.30 and earlier, as well as versions 6.0.0 thru 6.0.8)
after a calling{@link org.virtualbox_7_0.IFile#readAt(Long,Long,Long)}or{@link org.virtualbox_7_0.IFile#writeAt(Long,byte[],Long)},
or after calling{@link org.virtualbox_7_0.IFile#write(byte[],Long)}on a file in append mode.
The correct file offset can be obtained using{@link org.virtualbox_7_0.IFile#seek(Long,org.virtualbox_7_0.FileSeekOrigin)}.

@return Long
*/
    public Long getOffset()
    {
        try
        {
            Long retVal = port.iFileGetOffset(obj);
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
Current file status.
@return org.virtualbox_7_0.FileStatus
*/
    public org.virtualbox_7_0.FileStatus getStatus()
    {
        try
        {
            org.virtualbox_7_0.jaxws.FileStatus retVal = port.iFileGetStatus(obj);
            return org.virtualbox_7_0.FileStatus.fromValue(retVal.value());
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
Full path of the actual file name of this file.
@return String
*/
    public String getFilename()
    {
        try
        {
            String retVal = port.iFileGetFilename(obj);
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
The UNIX-style creation mode specified when opening the file.
@return Long
*/
    public Long getCreationMode()
    {
        try
        {
            Long retVal = port.iFileGetCreationMode(obj);
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
The opening action specified when opening the file.
@return org.virtualbox_7_0.FileOpenAction
*/
    public org.virtualbox_7_0.FileOpenAction getOpenAction()
    {
        try
        {
            org.virtualbox_7_0.jaxws.FileOpenAction retVal = port.iFileGetOpenAction(obj);
            return org.virtualbox_7_0.FileOpenAction.fromValue(retVal.value());
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
The file access mode.
@return org.virtualbox_7_0.FileAccessMode
*/
    public org.virtualbox_7_0.FileAccessMode getAccessMode()
    {
        try
        {
            org.virtualbox_7_0.jaxws.FileAccessMode retVal = port.iFileGetAccessMode(obj);
            return org.virtualbox_7_0.FileAccessMode.fromValue(retVal.value());
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
    public static IFile queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IFile(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Closes this file. After closing operations like reading data,
writing data or querying information will not be possible anymore.
*/
    public void close()
    {
        try
        {
        port.iFileClose(obj);
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
Queries information about this file.
@return Object information of this file. Also see{@link org.virtualbox_7_0.IFsObjInfo}.

*/
    public org.virtualbox_7_0.IFsObjInfo queryInfo()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iFileQueryInfo(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IFsObjInfo(retVal, getObjMgr(), port) : null;
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
Queries the current file size.
@return Queried file size.

*/
    public Long querySize()
    {
        try
        {
            Long retVal;
        retVal = port.iFileQuerySize(obj);
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
Reads data from this file.

The file current position ({@link org.virtualbox_7_0.IFile#getOffset()}) is updated on success.
@param toRead Number of bytes to read.

@param timeoutMS Timeout (in ms) to wait for the operation to complete.
Pass 0 for an infinite timeout.

@return Array of data read.

*/
    public byte[] read(Long toRead, Long timeoutMS)
    {
        try
        {
            /*base64*/String retVal;
        retVal = port.iFileRead(obj, toRead, timeoutMS);
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
Reads data from an offset of this file.

The file current position ({@link org.virtualbox_7_0.IFile#getOffset()}) is updated on success.
@param offset Offset in bytes to start reading.

@param toRead Number of bytes to read.

@param timeoutMS Timeout (in ms) to wait for the operation to complete.
Pass 0 for an infinite timeout.

@return Array of data read.

*/
    public byte[] readAt(Long offset, Long toRead, Long timeoutMS)
    {
        try
        {
            /*base64*/String retVal;
        retVal = port.iFileReadAt(obj, offset, toRead, timeoutMS);
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
Changes the current file position of this file.

The file current position always applies to the{@link org.virtualbox_7_0.IFile#read(Long,Long)}method.  Same for the{@link org.virtualbox_7_0.IFile#write(byte[],Long)}method it except when
the{@link org.virtualbox_7_0.IFile#getAccessMode()}is{@link org.virtualbox_7_0.FileAccessMode#AppendOnly}or{@link org.virtualbox_7_0.FileAccessMode#AppendRead}.
@param offset Offset to seek relative to the position specified by  whence.

@param whence One of the{@link org.virtualbox_7_0.FileSeekOrigin}seek starting points.

@return The new file offset after the seek operation.

*/
    public Long seek(Long offset, org.virtualbox_7_0.FileSeekOrigin whence)
    {
        try
        {
            Long retVal;
        retVal = port.iFileSeek(obj, offset, org.virtualbox_7_0.jaxws.FileSeekOrigin.fromValue(whence.name()));
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
Sets the ACL of this file.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The method is not implemented yet.</dd>
</dl>

@param acl The ACL specification string. To-be-defined.

@param mode UNIX-style mode mask to use if  acl is empty. As mention in{@link org.virtualbox_7_0.IGuestSession#directoryCreate(String,Long,List)}this is realized on
a best effort basis and the exact behavior depends on the Guest OS.

*/
    public void setACL(String acl, Long mode)
    {
        try
        {
        port.iFileSetACL(obj, acl, mode);
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
Changes the file size.
@param size The new file size.

*/
    public void setSize(Long size)
    {
        try
        {
        port.iFileSetSize(obj, size);
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
Writes bytes to this file.

The file current position ({@link org.virtualbox_7_0.IFile#getOffset()}) is updated on success.
@param data Array of bytes to write. The size of the array also specifies
how much to write.

@param timeoutMS Timeout (in ms) to wait for the operation to complete.
Pass 0 for an infinite timeout.

@return How many bytes were written.

*/
    public Long write(byte[] data, Long timeoutMS)
    {
        try
        {
            Long retVal;
        retVal = port.iFileWrite(obj, Helper.encodeBase64(data), timeoutMS);
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
Writes bytes at a certain offset to this file.

The file current position ({@link org.virtualbox_7_0.IFile#getOffset()}) is updated on success.
@param offset Offset in bytes to start writing.  If the file was opened with the{@link org.virtualbox_7_0.IFile#getAccessMode()}set to{@link org.virtualbox_7_0.FileAccessMode#AppendOnly}or{@link org.virtualbox_7_0.FileAccessMode#AppendRead}, the offset is ignored and the
write always goes to the end of the file.

@param data Array of bytes to write. The size of the array also specifies
how much to write.

@param timeoutMS Timeout (in ms) to wait for the operation to complete.
Pass 0 for an infinite timeout.

@return How many bytes were written.

*/
    public Long writeAt(Long offset, byte[] data, Long timeoutMS)
    {
        try
        {
            Long retVal;
        retVal = port.iFileWriteAt(obj, offset, Helper.encodeBase64(data), timeoutMS);
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

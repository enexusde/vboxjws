
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
 * IFsObjInfo.java
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
Abstract parent interface for VirtualBox file system object information.
This can be information about a file or a directory, for example.

Interface ID: <code>{081FC833-C6FA-430E-6020-6A505D086387}</code>
*/
public class IFsObjInfo extends IUnknown
{

    public IFsObjInfo(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
The object's name.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iFsObjInfoGetName(obj);
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
The object type. See{@link org.virtualbox_7_0.FsObjType}for more.
@return org.virtualbox_7_0.FsObjType
*/
    public org.virtualbox_7_0.FsObjType getType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.FsObjType retVal = port.iFsObjInfoGetType(obj);
            return org.virtualbox_7_0.FsObjType.fromValue(retVal.value());
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
File attributes. Not implemented yet.
@return String
*/
    public String getFileAttributes()
    {
        try
        {
            String retVal = port.iFsObjInfoGetFileAttributes(obj);
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
The logical size (st_size). For normal files this is the size of the file.
For symbolic links, this is the length of the path name contained in the
symbolic link. For other objects this fields needs to be specified.
@return Long
*/
    public Long getObjectSize()
    {
        try
        {
            Long retVal = port.iFsObjInfoGetObjectSize(obj);
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
Disk allocation size (st_blocks * DEV_BSIZE).
@return Long
*/
    public Long getAllocatedSize()
    {
        try
        {
            Long retVal = port.iFsObjInfoGetAllocatedSize(obj);
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
Time of last access (st_atime).
@return Long
*/
    public Long getAccessTime()
    {
        try
        {
            Long retVal = port.iFsObjInfoGetAccessTime(obj);
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
Time of file birth (st_birthtime).
@return Long
*/
    public Long getBirthTime()
    {
        try
        {
            Long retVal = port.iFsObjInfoGetBirthTime(obj);
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
Time of last status change (st_ctime).
@return Long
*/
    public Long getChangeTime()
    {
        try
        {
            Long retVal = port.iFsObjInfoGetChangeTime(obj);
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
Time of last data modification (st_mtime).
@return Long
*/
    public Long getModificationTime()
    {
        try
        {
            Long retVal = port.iFsObjInfoGetModificationTime(obj);
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
The user owning the filesystem object (st_uid).  This is -1 if not available.
@return Integer
*/
    public Integer getUID()
    {
        try
        {
            Integer retVal = port.iFsObjInfoGetUID(obj);
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
The user name.
@return String
*/
    public String getUserName()
    {
        try
        {
            String retVal = port.iFsObjInfoGetUserName(obj);
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
The group the filesystem object is assigned (st_gid).  This is -1 if not available.
@return Integer
*/
    public Integer getGID()
    {
        try
        {
            Integer retVal = port.iFsObjInfoGetGID(obj);
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
The group name.
@return String
*/
    public String getGroupName()
    {
        try
        {
            String retVal = port.iFsObjInfoGetGroupName(obj);
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
The unique identifier (within the filesystem) of this filesystem object (st_ino).
This is zero if not availalbe.
@return Long
*/
    public Long getNodeId()
    {
        try
        {
            Long retVal = port.iFsObjInfoGetNodeId(obj);
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
The device number of the device which this filesystem object resides on (st_dev).
@return Long
*/
    public Long getNodeIdDevice()
    {
        try
        {
            Long retVal = port.iFsObjInfoGetNodeIdDevice(obj);
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
Number of hard links to this filesystem object (st_nlink).
@return Long
*/
    public Long getHardLinks()
    {
        try
        {
            Long retVal = port.iFsObjInfoGetHardLinks(obj);
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
The device number of a character or block device type object (st_rdev).
@return Long
*/
    public Long getDeviceNumber()
    {
        try
        {
            Long retVal = port.iFsObjInfoGetDeviceNumber(obj);
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
The current generation number (st_gen).
@return Long
*/
    public Long getGenerationId()
    {
        try
        {
            Long retVal = port.iFsObjInfoGetGenerationId(obj);
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
User flags (st_flags).
@return Long
*/
    public Long getUserFlags()
    {
        try
        {
            Long retVal = port.iFsObjInfoGetUserFlags(obj);
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
    public static IFsObjInfo queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IFsObjInfo(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

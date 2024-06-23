
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
 * IFsInfo.java
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
Abstract parent interface for VirtualBox file system information.
This can be information about a host or guest file system, for example.

Interface ID: <code>{3DB2AB1A-6CF7-42F1-8BF5-E1C0553E0B30}</code>
*/
public class IFsInfo extends IUnknown
{

    public IFsInfo(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Remaining free space (in bytes) of the filesystem.
@return Long
*/
    public Long getFreeSize()
    {
        try
        {
            Long retVal = port.iFsInfoGetFreeSize(obj);
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
Total space (in bytes) of the filesystem.
@return Long
*/
    public Long getTotalSize()
    {
        try
        {
            Long retVal = port.iFsInfoGetTotalSize(obj);
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
Block size (in bytes) of the filesystem.
@return Long
*/
    public Long getBlockSize()
    {
        try
        {
            Long retVal = port.iFsInfoGetBlockSize(obj);
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
Sector size (in bytes) of the filesystem.
@return Long
*/
    public Long getSectorSize()
    {
        try
        {
            Long retVal = port.iFsInfoGetSectorSize(obj);
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
Serial number of the filesystem.
@return Long
*/
    public Long getSerialNumber()
    {
        try
        {
            Long retVal = port.iFsInfoGetSerialNumber(obj);
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
TRUE if the filesystem is remote,  FALSE if the filesystem is local.
@return Boolean
*/
    public Boolean getIsRemote()
    {
        try
        {
            Boolean retVal = port.iFsInfoGetIsRemote(obj);
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
TRUE if the filesystem is case sensitive,  FALSE if the filesystem is case insensitive.
@return Boolean
*/
    public Boolean getIsCaseSensitive()
    {
        try
        {
            Boolean retVal = port.iFsInfoGetIsCaseSensitive(obj);
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
TRUE if the filesystem is mounted read only,  FALSE if the filesystem is mounted read write.
@return Boolean
*/
    public Boolean getIsReadOnly()
    {
        try
        {
            Boolean retVal = port.iFsInfoGetIsReadOnly(obj);
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
TRUE if the filesystem is compressed,  FALSE if it isn't or we don't know.
@return Boolean
*/
    public Boolean getIsCompressed()
    {
        try
        {
            Boolean retVal = port.iFsInfoGetIsCompressed(obj);
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
TRUE if the filesystem compresses of individual files,  FALSE if it doesn't or we don't know.
@return Boolean
*/
    public Boolean getSupportsFileCompression()
    {
        try
        {
            Boolean retVal = port.iFsInfoGetSupportsFileCompression(obj);
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
The maximum size of a filesystem object name.
@return Long
*/
    public Long getMaxComponent()
    {
        try
        {
            Long retVal = port.iFsInfoGetMaxComponent(obj);
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
Name of the filesystem.
@return String
*/
    public String getType()
    {
        try
        {
            String retVal = port.iFsInfoGetType(obj);
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
Label of the filesystem.
@return String
*/
    public String getLabel()
    {
        try
        {
            String retVal = port.iFsInfoGetLabel(obj);
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
Mount point of the filesystem.
@return String
*/
    public String getMountPoint()
    {
        try
        {
            String retVal = port.iFsInfoGetMountPoint(obj);
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
    public static IFsInfo queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IFsInfo(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

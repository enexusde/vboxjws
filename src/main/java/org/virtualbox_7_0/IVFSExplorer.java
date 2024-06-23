
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
 * IVFSExplorer.java
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
The VFSExplorer interface unifies access to different file system
types. This includes local file systems as well remote file systems like
S3. For a list of supported types see{@link org.virtualbox_7_0.VFSType}.
An instance of this is returned by{@link org.virtualbox_7_0.IAppliance#createVFSExplorer(String)}.

Interface ID: <code>{FB220201-2FD3-47E2-A5DC-2C2431D833CC}</code>
*/
public class IVFSExplorer extends IUnknown
{

    public IVFSExplorer(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Returns the current path in the virtual file system.
@return String
*/
    public String getPath()
    {
        try
        {
            String retVal = port.ivfsExplorerGetPath(obj);
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
Returns the file system type which is currently in use.
@return org.virtualbox_7_0.VFSType
*/
    public org.virtualbox_7_0.VFSType getType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.VFSType retVal = port.ivfsExplorerGetType(obj);
            return org.virtualbox_7_0.VFSType.fromValue(retVal.value());
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
    public static IVFSExplorer queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IVFSExplorer(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Updates the internal list of files/directories from the
current directory level. Use{@link #entryList(Holder,Holder,Holder,Holder)}to get the full list
after a call to this method.
@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress update()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.ivfsExplorerUpdate(obj);
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
Change the current directory level.
@param dir The name of the directory to go in.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress cd(String dir)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.ivfsExplorerCd(obj, dir);
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
Go one directory upwards from the current directory level.
@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress cdUp()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.ivfsExplorerCdUp(obj);
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
Returns a list of files/directories after a call to{@link #update()}. The user is responsible for keeping this internal
list up do date.
@param names The list of names for the entries.

@param types The list of types for the entries.{@link org.virtualbox_7_0.FsObjType}

@param sizes The list of sizes (in bytes) for the entries.

@param modes The list of file modes (in octal form) for the entries.

*/
    public void entryList(Holder<List<String>> names, Holder<List<Long>> types, Holder<List<Long>> sizes, Holder<List<Long>> modes)
    {
        try
        {
        jakarta.xml.ws.Holder<List<String>> tmp_names = new jakarta.xml.ws.Holder<List<String>>();
        jakarta.xml.ws.Holder<List<Long>> tmp_types = new jakarta.xml.ws.Holder<List<Long>>();
        jakarta.xml.ws.Holder<List<Long>> tmp_sizes = new jakarta.xml.ws.Holder<List<Long>>();
        jakarta.xml.ws.Holder<List<Long>> tmp_modes = new jakarta.xml.ws.Holder<List<Long>>();
        port.ivfsExplorerEntryList(obj, tmp_names, tmp_types, tmp_sizes, tmp_modes);
        names.value = tmp_names.value;
        types.value = tmp_types.value;
        sizes.value = tmp_sizes.value;
        modes.value = tmp_modes.value;
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
Checks if the given file list exists in the current directory
level.
@param names The names to check.

@return The names which exist.

*/
    public List<String> exists(List<String> names)
    {
        try
        {
            List<String> retVal;
        retVal = port.ivfsExplorerExists(obj, names);
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
Deletes the given files in the current directory level.
@param names The names to remove.

@return Progress object to track the operation completion.

*/
    public org.virtualbox_7_0.IProgress remove(List<String> names)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.ivfsExplorerRemove(obj, names);
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

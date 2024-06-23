
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
 * ISharedFolder.java
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
The ISharedFolder interface represents a folder in the host computer's
file system accessible from the guest OS running inside a virtual
machine using an associated logical name.

There are three types of shared folders:<ul><li><i>Global</i>({@link org.virtualbox_7_0.IVirtualBox#getSharedFolders()}), shared
folders available to all virtual machines.</li><li><i>Permanent</i>({@link org.virtualbox_7_0.IMachine#getSharedFolders()}),
VM-specific shared folders available to the given virtual machine at
startup.</li><li><i>Transient</i>({@link org.virtualbox_7_0.IConsole#getSharedFolders()}),
VM-specific shared folders created in the session context (for
example, when the virtual machine is running) and automatically
discarded when the session is closed (the VM is powered off).</li></ul>Logical names of shared folders must be unique within the given scope
(global, permanent or transient). However, they do not need to be unique
across scopes. In this case, the definition of the shared folder in a
more specific scope takes precedence over definitions in all other
scopes. The order of precedence is (more specific to more general):<ol><li>Transient definitions</li><li>Permanent definitions</li><li>Global definitions</li></ol>For example, if MyMachine has a shared folder named<code>C_DRIVE</code>(that points to<code>C:\\</code>), then creating a
transient shared folder named<code>C_DRIVE</code>(that points
to<code>C:\\\\WINDOWS</code>) will change the definition
of<code>C_DRIVE</code>in the guest OS so
that<code>\\\\VBOXSVR\\C_DRIVE</code>will give access
to<code>C:\\WINDOWS</code>instead of<code>C:\\</code>on the host
PC. Removing the transient shared folder<code>C_DRIVE</code>will restore
the previous (permanent) definition of<code>C_DRIVE</code>that points
to<code>C:\\</code>if it still exists.

Note that permanent and transient shared folders of different machines
are in different name spaces, so they don't overlap and don't need to
have unique logical names.
NOTE: Global shared folders are not implemented in the current version of the
product.


Interface ID: <code>{9622225A-5409-414B-BD16-77DF7BA3451E}</code>
*/
public class ISharedFolder extends IUnknown
{

    public ISharedFolder(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Logical name of the shared folder.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iSharedFolderGetName(obj);
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
Full path to the shared folder in the host file system.
@return String
*/
    public String getHostPath()
    {
        try
        {
            String retVal = port.iSharedFolderGetHostPath(obj);
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
Whether the folder defined by the host path is currently
accessible or not.

For example, the folder can be inaccessible if it is placed
on the network share that is not available by the time
this property is read.
@return Boolean
*/
    public Boolean getAccessible()
    {
        try
        {
            Boolean retVal = port.iSharedFolderGetAccessible(obj);
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
Whether the folder defined by the host path is writable or
not.
@return Boolean
*/
    public Boolean getWritable()
    {
        try
        {
            Boolean retVal = port.iSharedFolderGetWritable(obj);
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
Whether the folder defined by the host path is writable or
not.
@param value Boolean

*/
    public void setWritable(Boolean value)
    {
        try
        {
        port.iSharedFolderSetWritable(obj, value);
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
Whether the folder gets automatically mounted by the guest or not.
@return Boolean
*/
    public Boolean getAutoMount()
    {
        try
        {
            Boolean retVal = port.iSharedFolderGetAutoMount(obj);
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
Whether the folder gets automatically mounted by the guest or not.
@param value Boolean

*/
    public void setAutoMount(Boolean value)
    {
        try
        {
        port.iSharedFolderSetAutoMount(obj, value);
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
Desired mount point in the guest for automatically mounting the folder
when{@link org.virtualbox_7_0.ISharedFolder#getAutoMount()}is set.  For Windows and
OS/2 guests this should be a drive letter, while other guests it should
be a absolute directory.  It is possible to combine the two, e.g.
"T:/mnt/testrsrc" will be attached to "T:" by windows and OS/2 while
the unixy guests will mount it at "/mnt/testrsrc".

When empty the guest will choose a mount point.  The guest may do so
too should the specified mount point be in use or otherwise unusable.
@return String
*/
    public String getAutoMountPoint()
    {
        try
        {
            String retVal = port.iSharedFolderGetAutoMountPoint(obj);
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
Desired mount point in the guest for automatically mounting the folder
when{@link org.virtualbox_7_0.ISharedFolder#getAutoMount()}is set.  For Windows and
OS/2 guests this should be a drive letter, while other guests it should
be a absolute directory.  It is possible to combine the two, e.g.
"T:/mnt/testrsrc" will be attached to "T:" by windows and OS/2 while
the unixy guests will mount it at "/mnt/testrsrc".

When empty the guest will choose a mount point.  The guest may do so
too should the specified mount point be in use or otherwise unusable.
@param value String

*/
    public void setAutoMountPoint(String value)
    {
        try
        {
        port.iSharedFolderSetAutoMountPoint(obj, value);
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
Text message that represents the result of the last accessibility
check.

Accessibility checks are performed each time the{@link #getAccessible()}attribute is read. An empty string is returned if the last
accessibility check was successful. A non-empty string indicates a
failure and should normally describe a reason of the failure (for
example, a file read error).
@return String
*/
    public String getLastAccessError()
    {
        try
        {
            String retVal = port.iSharedFolderGetLastAccessError(obj);
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
    public static ISharedFolder queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new ISharedFolder(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

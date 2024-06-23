
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
 * ISnapshot.java
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
The ISnapshot interface represents a snapshot of the virtual
machine.

Together with the differencing media that are created
when a snapshot is taken, a machine can be brought back to
the exact state it was in when the snapshot was taken.

The ISnapshot interface has no methods, only attributes; snapshots
are controlled through methods of the{@link org.virtualbox_7_0.IMachine}interface
which also manage the media associated with the snapshot.
The following operations exist:<ul><li>{@link org.virtualbox_7_0.IMachine#takeSnapshot(String,String,Boolean,Holder)}creates a new snapshot
by creating new, empty differencing images for the machine's
media and saving the VM settings and (if the VM is running)
the current VM state in the snapshot.

The differencing images will then receive all data written to
the machine's media, while their parent (base) images
remain unmodified after the snapshot has been taken (see{@link org.virtualbox_7_0.IMedium}for details about differencing images).
This simplifies restoring a machine to the state of a snapshot:
only the differencing images need to be deleted.

The current machine state is not changed by taking a snapshot
except that{@link org.virtualbox_7_0.IMachine#getCurrentSnapshot()}is set to
the newly created snapshot, which is also added to the machine's
snapshots tree.</li><li>{@link org.virtualbox_7_0.IMachine#restoreSnapshot(org.virtualbox_7_0.ISnapshot)}resets a machine to
the state of a previous snapshot by deleting the differencing
image of each of the machine's media and setting the machine's
settings and state to the state that was saved in the snapshot (if any).

This destroys the machine's current state. After calling this,{@link org.virtualbox_7_0.IMachine#getCurrentSnapshot()}points to the snapshot
that was restored.</li><li>{@link org.virtualbox_7_0.IMachine#deleteSnapshot(String)}deletes a snapshot
without affecting the current machine state.

This does not change the current machine state, but instead frees the
resources allocated when the snapshot was taken: the settings and machine
state file are deleted (if any), and the snapshot's differencing image for
each of the machine's media gets merged with its parent image.

Neither the current machine state nor other snapshots are affected
by this operation, except that parent media will be modified
to contain the disk data associated with the snapshot being deleted.

When deleting the current snapshot, the{@link org.virtualbox_7_0.IMachine#getCurrentSnapshot()}attribute is set to the current snapshot's parent or  null if it
has no parent. Otherwise the attribute is unchanged.</li></ul>Each snapshot contains a copy of virtual machine's settings (hardware
configuration etc.). This copy is contained in an immutable (read-only)
instance of{@link org.virtualbox_7_0.IMachine}which is available from the snapshot's{@link #getMachine()}attribute. When restoring the snapshot, these
settings are copied back to the original machine.

In addition, if the machine was running when the
snapshot was taken ({@link org.virtualbox_7_0.IMachine#getState()}is{@link org.virtualbox_7_0.MachineState#Running}),
the current VM state is saved in the snapshot (similarly to what happens
when a VM's state is saved). The snapshot is then said to be<i>online</i>because when restoring it, the VM will be running.

If the machine was in the{@link org.virtualbox_7_0.MachineState#Saved}or{@link org.virtualbox_7_0.MachineState#AbortedSaved}state, the snapshot
receives a copy of the execution state file ({@link org.virtualbox_7_0.IMachine#getStateFilePath()}).

Otherwise, if the machine was not running ({@link org.virtualbox_7_0.MachineState#PoweredOff}or{@link org.virtualbox_7_0.MachineState#Aborted}), the snapshot is<i>offline</i>;
it then contains a so-called "zero execution state", representing a
machine that is powered off.

Interface ID: <code>{6CC49055-DAD4-4496-85CF-3F76BCB3B5FA}</code>
*/
public class ISnapshot extends IUnknown
{

    public ISnapshot(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
UUID of the snapshot.
@return String
*/
    public String getId()
    {
        try
        {
            String retVal = port.iSnapshotGetId(obj);
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
Short name of the snapshot.
NOTE: Setting this attribute causes{@link org.virtualbox_7_0.IMachine#saveSettings()}to
be called implicitly.

@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iSnapshotGetName(obj);
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
Short name of the snapshot.
NOTE: Setting this attribute causes{@link org.virtualbox_7_0.IMachine#saveSettings()}to
be called implicitly.

@param value String

*/
    public void setName(String value)
    {
        try
        {
        port.iSnapshotSetName(obj, value);
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
Optional description of the snapshot.
NOTE: Setting this attribute causes{@link org.virtualbox_7_0.IMachine#saveSettings()}to
be called implicitly.

@return String
*/
    public String getDescription()
    {
        try
        {
            String retVal = port.iSnapshotGetDescription(obj);
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
Optional description of the snapshot.
NOTE: Setting this attribute causes{@link org.virtualbox_7_0.IMachine#saveSettings()}to
be called implicitly.

@param value String

*/
    public void setDescription(String value)
    {
        try
        {
        port.iSnapshotSetDescription(obj, value);
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
Timestamp of the snapshot, in milliseconds since 1970-01-01 UTC.
@return Long
*/
    public Long getTimeStamp()
    {
        try
        {
            Long retVal = port.iSnapshotGetTimeStamp(obj);
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
true if this snapshot is an online snapshot and  false otherwise.

When this attribute is  true, the{@link org.virtualbox_7_0.IMachine#getStateFilePath()}attribute of the{@link #getMachine()}object associated with this snapshot
will point to the saved state file. Otherwise, it will be
an empty string.
@return Boolean
*/
    public Boolean getOnline()
    {
        try
        {
            Boolean retVal = port.iSnapshotGetOnline(obj);
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
Virtual machine this snapshot is taken on. This object
stores all settings the machine had when taking this snapshot.
NOTE: The returned machine object is immutable, i.e. no
any settings can be changed.

@return org.virtualbox_7_0.IMachine
*/
    public org.virtualbox_7_0.IMachine getMachine()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iSnapshotGetMachine(obj);
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
Parent snapshot (a snapshot this one is based on), or
null if the snapshot has no parent (i.e. is the first snapshot).
@return org.virtualbox_7_0.ISnapshot
*/
    public org.virtualbox_7_0.ISnapshot getParent()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iSnapshotGetParent(obj);
            return (retVal.length() > 0) ? new org.virtualbox_7_0.ISnapshot(retVal, getObjMgr(), port) : null;
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
Child snapshots (all snapshots having this one as a parent).
By inspecting this attribute starting with a machine's root snapshot
(which can be obtained by calling{@link org.virtualbox_7_0.IMachine#findSnapshot(String)}with a  null UUID), a machine's snapshots tree can be iterated over.
@return List&lt;org.virtualbox_7_0.ISnapshot&gt;
*/
    public List<org.virtualbox_7_0.ISnapshot> getChildren()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iSnapshotGetChildren(obj);
            return Helper.wrap(org.virtualbox_7_0.ISnapshot.class, getObjMgr(), port, retVal);
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
Returns the number of direct children of this snapshot.
@return Long
*/
    public Long getChildrenCount()
    {
        try
        {
            Long retVal = port.iSnapshotGetChildrenCount(obj);
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
    public static ISnapshot queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new ISnapshot(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }
}

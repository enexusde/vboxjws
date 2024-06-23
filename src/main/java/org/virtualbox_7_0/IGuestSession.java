
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
 * IGuestSession.java
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
A guest session represents one impersonated user account in the guest, so
every operation will use the same credentials specified when creating
the session object via{@link org.virtualbox_7_0.IGuest#createSession(String,String,String,String)}.

There can be a maximum of 32 sessions at once per VM, whereas session 0
always is reserved for the root session (the root session is part of that
limit).

This root session is controlling all other guest sessions and also is
responsible for actions which require system level privileges.

Each guest session keeps track of the guest directories and files that
it opened as well as guest processes it has created.  To work on guest
files or directories a guest session offers methods to open or create
such objects (see{@link org.virtualbox_7_0.IGuestSession#fileOpen(String,org.virtualbox_7_0.FileAccessMode,org.virtualbox_7_0.FileOpenAction,Long)}or{@link org.virtualbox_7_0.IGuestSession#directoryOpen(String,String,List)}for instance).  Similarly,
there a methods for creating guest processes.

There can be up to 2048 objects (guest processes, files and directories)
a time per guest session.  Exceeding the limit will result in an error (see
the corresponding functions for more).

When done with either of these objects, including the guest session itself,
use the appropriate close() method to let the object do its cleanup work.

Closing a session via{@link org.virtualbox_7_0.IGuestSession#close()}will try to close
all the mentioned objects above unless these objects are still used by
a client.

A set of environment variables changes is associated with each session
({@link org.virtualbox_7_0.IGuestSession#getEnvironmentChanges()}).  These are applied to
the base environment of the impersonated guest user when creating a new
guest process.  For additional flexibility the{@link org.virtualbox_7_0.IGuestSession#processCreate(String,List,List,List,Long)}and{@link org.virtualbox_7_0.IGuestSession#processCreateEx(String,List,List,List,Long,org.virtualbox_7_0.ProcessPriority,List)}methods allows you to
specify individual environment changes for each process you create.
With newer guest addition versions, the base environment is also made
available via{@link org.virtualbox_7_0.IGuestSession#getEnvironmentBase()}.  (One reason
for why we record changes to a base environment instead of working
directly on an environment block is that we need to be compatible
with older Guest Additions.  Another reason is that this way it is always
possible to undo all the changes you've scheduled.)

Interface ID: <code>{234F0627-866D-48C2-91A5-4C9D50F04928}</code>
*/
public class IGuestSession extends IUnknown
{

    public IGuestSession(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Returns the user name used by this session to impersonate
users in the guest.
@return String
*/
    public String getUser()
    {
        try
        {
            String retVal = port.iGuestSessionGetUser(obj);
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
Returns the domain name used by this session to impersonate
users in the guest.
@return String
*/
    public String getDomain()
    {
        try
        {
            String retVal = port.iGuestSessionGetDomain(obj);
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
Returns the session's friendly name.
@return String
*/
    public String getName()
    {
        try
        {
            String retVal = port.iGuestSessionGetName(obj);
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
Returns the internal session ID.
@return Long
*/
    public Long getId()
    {
        try
        {
            Long retVal = port.iGuestSessionGetId(obj);
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
Returns the session timeout (in ms).
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - This attribute is not implemented yet.</dd>
</dl>

@return Long
*/
    public Long getTimeout()
    {
        try
        {
            Long retVal = port.iGuestSessionGetTimeout(obj);
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
Returns the session timeout (in ms).
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - This attribute is not implemented yet.</dd>
</dl>

@param value Long

*/
    public void setTimeout(Long value)
    {
        try
        {
        port.iGuestSessionSetTimeout(obj, value);
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
Returns the protocol version which is used by this session to
communicate with the guest.
@return Long
*/
    public Long getProtocolVersion()
    {
        try
        {
            Long retVal = port.iGuestSessionGetProtocolVersion(obj);
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
Returns the current session status.
@return org.virtualbox_7_0.GuestSessionStatus
*/
    public org.virtualbox_7_0.GuestSessionStatus getStatus()
    {
        try
        {
            org.virtualbox_7_0.jaxws.GuestSessionStatus retVal = port.iGuestSessionGetStatus(obj);
            return org.virtualbox_7_0.GuestSessionStatus.fromValue(retVal.value());
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
The set of scheduled environment changes to the base environment of the
session.  They are in putenv format, i.e. "VAR=VALUE" for setting and
"VAR" for unsetting.  One entry per variable (change).  The changes are
applied when creating new guest processes.

This is writable, so to undo all the scheduled changes, assign it an
empty array.
@return List&lt;String&gt;
*/
    public List<String> getEnvironmentChanges()
    {
        try
        {
            List<String> retVal = port.iGuestSessionGetEnvironmentChanges(obj);
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
The set of scheduled environment changes to the base environment of the
session.  They are in putenv format, i.e. "VAR=VALUE" for setting and
"VAR" for unsetting.  One entry per variable (change).  The changes are
applied when creating new guest processes.

This is writable, so to undo all the scheduled changes, assign it an
empty array.
@param value List&lt;String&gt;

*/
    public void setEnvironmentChanges(List<String> value)
    {
        try
        {
        port.iGuestSessionSetEnvironmentChanges(obj, value);
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
The base environment of the session.  They are on the "VAR=VALUE" form,
one array entry per variable.Access fails with VBOX_E_NOT_SUPPORTED if the Guest Additions does not
support the session base environment feature.  Support for this was
introduced with protocol version XXXX.

Access fails with VBOX_E_INVALID_OBJECT_STATE if the Guest Additions
has yet to report the session base environment.
@return List&lt;String&gt;
*/
    public List<String> getEnvironmentBase()
    {
        try
        {
            List<String> retVal = port.iGuestSessionGetEnvironmentBase(obj);
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
Returns all current guest processes.
@return List&lt;org.virtualbox_7_0.IGuestProcess&gt;
*/
    public List<org.virtualbox_7_0.IGuestProcess> getProcesses()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iGuestSessionGetProcesses(obj);
            return Helper.wrap(org.virtualbox_7_0.IGuestProcess.class, getObjMgr(), port, retVal);
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
The style of paths used by the guest.  Handy for giving the right kind
of path specifications to{@link org.virtualbox_7_0.IGuestSession#fileOpen(String,org.virtualbox_7_0.FileAccessMode,org.virtualbox_7_0.FileOpenAction,Long)}and similar methods.
@return org.virtualbox_7_0.PathStyle
*/
    public org.virtualbox_7_0.PathStyle getPathStyle()
    {
        try
        {
            org.virtualbox_7_0.jaxws.PathStyle retVal = port.iGuestSessionGetPathStyle(obj);
            return org.virtualbox_7_0.PathStyle.fromValue(retVal.value());
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
Gets or sets the current directory of the session.  Guest path style.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - This attribute is not implemented yet.</dd>
</dl>

@return String
*/
    public String getCurrentDirectory()
    {
        try
        {
            String retVal = port.iGuestSessionGetCurrentDirectory(obj);
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
Gets or sets the current directory of the session.  Guest path style.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - This attribute is not implemented yet.</dd>
</dl>

@param value String

*/
    public void setCurrentDirectory(String value)
    {
        try
        {
        port.iGuestSessionSetCurrentDirectory(obj, value);
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
Returns the user's home / profile directory.  Guest path style.
@return String
*/
    public String getUserHome()
    {
        try
        {
            String retVal = port.iGuestSessionGetUserHome(obj);
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
Returns the user's documents directory.  Guest path style.
@return String
*/
    public String getUserDocuments()
    {
        try
        {
            String retVal = port.iGuestSessionGetUserDocuments(obj);
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
Returns all currently opened guest directories.
@return List&lt;org.virtualbox_7_0.IGuestDirectory&gt;
*/
    public List<org.virtualbox_7_0.IGuestDirectory> getDirectories()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iGuestSessionGetDirectories(obj);
            return Helper.wrap(org.virtualbox_7_0.IGuestDirectory.class, getObjMgr(), port, retVal);
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
Returns all currently opened guest files.
@return List&lt;org.virtualbox_7_0.IGuestFile&gt;
*/
    public List<org.virtualbox_7_0.IGuestFile> getFiles()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            List<String> retVal = port.iGuestSessionGetFiles(obj);
            return Helper.wrap(org.virtualbox_7_0.IGuestFile.class, getObjMgr(), port, retVal);
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
Event source for guest session events.
@return org.virtualbox_7_0.IEventSource
*/
    public org.virtualbox_7_0.IEventSource getEventSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iGuestSessionGetEventSource(obj);
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
    public static IGuestSession queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IGuestSession(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Closes this session. All opened guest directories, files and
processes which are not referenced by clients anymore will be
closed. Guest processes which fall into this category and still
are running in the guest will be terminated automatically.
*/
    public void close()
    {
        try
        {
        port.iGuestSessionClose(obj);
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
Copies directories and/or files from guest to the host.

This function requires several parallel arrays to be supplied, one
set for each source.
@param sources Paths to directories and/or files on the guest side that should be
copied to the host. If the path ends with a path delimiter, only
the directory's content is being copied. Guest path style.

@param filters Array of source filters. This uses the
DOS/NT style wildcard characters '?' and '*'.

@param flags Array of comma-separated list of source flags.

The following flags are available:<dl><dt><code>CopyIntoExisting</code></dt><dd>Allow copying into an existing destination directory.</dd><dt><code>NoReplace</code></dt><dd>Do not replace any existing destination files on
the destination.</dd><dt><code>FollowLinks</code></dt><dd>Follows (and handles) (symbolic) links.</dd><dt><code>Update</code></dt><dd>Only copy when the source file is newer than the destination
file or when the destination file is missing.</dd></dl>

@param destination Where to put the sources on the host. Host path style.

@return Progress object to track the operation to completion.

*/
    public org.virtualbox_7_0.IProgress copyFromGuest(List<String> sources, List<String> filters, List<String> flags, String destination)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionCopyFromGuest(obj, sources, filters, flags, destination);
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
Copies directories and/or files from host to the guest.

This function requires several parallel arrays to be supplied, one
set for each source.
@param sources Paths to directories and/or files on the host side that should be
copied to the guest. If the path ends with a path delimiter, only
the directory's content is being copied. Host path style.

@param filters Array of source filters. This uses the
DOS/NT style wildcard characters '?' and '*'.

@param flags Array of comma-separated list of source flags.

The following flags are available:<dl><dt><code>CopyIntoExisting</code></dt><dd>Allow copying into an existing destination directory.</dd><dt><code>NoReplace</code></dt><dd>Do not replace any existing destination files on
the destination.</dd><dt><code>FollowLinks</code></dt><dd>Follows (and handles) (symbolic) links.</dd><dt><code>Update</code></dt><dd>Only copy when the source file is newer than the destination
file or when the destination file is missing.</dd></dl>

@param destination Where to put the sources on the guest. Guest path style.

@return Progress object to track the operation to completion.

*/
    public org.virtualbox_7_0.IProgress copyToGuest(List<String> sources, List<String> filters, List<String> flags, String destination)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionCopyToGuest(obj, sources, filters, flags, destination);
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
Recursively copies a directory from one guest location to another.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - Not yet implemented.</dd>
</dl>

@param source The path to the directory to copy (in the guest).  Guest path style.

@param destination The path to the target directory (in the guest).  Unless the{@link org.virtualbox_7_0.DirectoryCopyFlag#CopyIntoExisting}flag is given, the
directory shall not already exist.  Guest path style.

@param flags Zero or more{@link org.virtualbox_7_0.DirectoryCopyFlag}values.

@return Progress object to track the operation to completion.

*/
    public org.virtualbox_7_0.IProgress directoryCopy(String source, String destination, List<org.virtualbox_7_0.DirectoryCopyFlag> flags)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionDirectoryCopy(obj, source, destination, Helper.convertEnums(org.virtualbox_7_0.DirectoryCopyFlag.class, org.virtualbox_7_0.jaxws.DirectoryCopyFlag.class, flags));
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
Recursively copies a directory from the guest to the host.
@param source Path to the directory on the guest side that should be copied to
the host. Guest path style.

@param destination Where to put the directory on the host.  Unless the{@link org.virtualbox_7_0.DirectoryCopyFlag#CopyIntoExisting}flag is given, the
directory shall not already exist.  Host path style.

@param flags Zero or more{@link org.virtualbox_7_0.DirectoryCopyFlag}values.

@return Progress object to track the operation to completion.

*/
    public org.virtualbox_7_0.IProgress directoryCopyFromGuest(String source, String destination, List<org.virtualbox_7_0.DirectoryCopyFlag> flags)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionDirectoryCopyFromGuest(obj, source, destination, Helper.convertEnums(org.virtualbox_7_0.DirectoryCopyFlag.class, org.virtualbox_7_0.jaxws.DirectoryCopyFlag.class, flags));
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
Recursively copies a directory from the host to the guest.
@param source Path to the directory on the host side that should be copied to
the guest.  Host path style.

@param destination Where to put the file in the guest. Unless the{@link org.virtualbox_7_0.DirectoryCopyFlag#CopyIntoExisting}flag is given, the
directory shall not already exist. Guest style path.

@param flags Zero or more{@link org.virtualbox_7_0.DirectoryCopyFlag}values.

@return Progress object to track the operation to completion.

*/
    public org.virtualbox_7_0.IProgress directoryCopyToGuest(String source, String destination, List<org.virtualbox_7_0.DirectoryCopyFlag> flags)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionDirectoryCopyToGuest(obj, source, destination, Helper.convertEnums(org.virtualbox_7_0.DirectoryCopyFlag.class, org.virtualbox_7_0.jaxws.DirectoryCopyFlag.class, flags));
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
Creates a directory in the guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error while creating the directory.</dd>
</dl>

@param path Path to the directory directory to be created. Guest path style.

@param mode The UNIX-style access mode mask to create the directory with.
Whether/how all three access groups and associated access rights are
realized is guest OS dependent.  The API does the best it can on each
OS.

@param flags Zero or more{@link org.virtualbox_7_0.DirectoryCreateFlag}flags.

*/
    public void directoryCreate(String path, Long mode, List<org.virtualbox_7_0.DirectoryCreateFlag> flags)
    {
        try
        {
        port.iGuestSessionDirectoryCreate(obj, path, mode, Helper.convertEnums(org.virtualbox_7_0.DirectoryCreateFlag.class, org.virtualbox_7_0.jaxws.DirectoryCreateFlag.class, flags));
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
Creates a temporary directory in the guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - The operation is not possible as requested on this particular
guest type.</dd>
<dd><code>E_INVALIDARG</code> - Invalid argument. This includes an incorrectly formatted template,
or a non-absolute path.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - The temporary directory could not be created. Possible reasons
include a non-existing path or an insecure path when the secure
option was requested.</dd>
</dl>

@param templateName Template for the name of the directory to create. This must
contain at least one 'X' character. The first group of consecutive
'X' characters in the template will be replaced by a random
alphanumeric string to produce a unique name.

@param mode The UNIX-style access mode mask to create the directory with.
Whether/how all three access groups and associated access rights are
realized is guest OS dependent.  The API does the best it can on each
OS.

This parameter is ignored if the  secure parameter is set to  true.

@param path The path to the directory in which the temporary directory should
be created. Guest path style.

@param secure Whether to fail if the directory can not be securely created.
Currently this means that another unprivileged user cannot
manipulate the path specified or remove the temporary directory
after it has been created. Also causes the mode specified to be
ignored. May not be supported on all guest types.

@return On success this will contain the full path to the created
directory. Guest path style.

NOTE: It is strongly recommended to use 0700.

*/
    public String directoryCreateTemp(String templateName, Long mode, String path, Boolean secure)
    {
        try
        {
            String retVal;
        retVal = port.iGuestSessionDirectoryCreateTemp(obj, templateName, mode, path, secure);
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
Checks whether a directory exists in the guest or not.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error while checking existence of the directory specified.</dd>
</dl>

@param path Path to the directory to check if exists. Guest path style.

@param followSymlinks If  true, symbolic links in the final component will be followed
and the existance of the symlink target made the question for this method.
If  false, a symbolic link in the final component will make the
method return  false (because a symlink isn't a directory).

@return Returns  true if the directory exists,  false if not, or is not a directory.

*/
    public Boolean directoryExists(String path, Boolean followSymlinks)
    {
        try
        {
            Boolean retVal;
        retVal = port.iGuestSessionDirectoryExists(obj, path, followSymlinks);
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
Opens a directory in the guest and creates a{@link org.virtualbox_7_0.IGuestDirectory}object that can be used for further operations.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - Directory to open was not found.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error while opening the directory.</dd>
<dd><code>VBOX_E_MAXIMUM_REACHED</code> - The maximum of concurrent guest directories has been reached.</dd>
</dl>

@param path Path to the directory to open. Guest path style.

@param filter Optional directory listing filter to apply.  This uses the DOS/NT
style wildcard characters '?' and '*'.

@param flags Zero or more{@link org.virtualbox_7_0.DirectoryOpenFlag}flags.

@return {@link org.virtualbox_7_0.IGuestDirectory}object containing the opened directory.

NOTE: This method follows symbolic links by default at the moment, this
may change in the future.

NOTE: One idiosyncrasy of the current implementation is that you will NOT
get VBOX_E_OBJECT_NOT_FOUND returned here if the directory doesn't exist.
Instead the read function will fail with VBOX_E_IPRT_ERROR.  This will
be fixed soon.

*/
    public org.virtualbox_7_0.IGuestDirectory directoryOpen(String path, String filter, List<org.virtualbox_7_0.DirectoryOpenFlag> flags)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionDirectoryOpen(obj, path, filter, Helper.convertEnums(org.virtualbox_7_0.DirectoryOpenFlag.class, org.virtualbox_7_0.jaxws.DirectoryOpenFlag.class, flags));
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestDirectory(retVal, getObjMgr(), port) : null;
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
Removes a guest directory if empty.
@param path Path to the directory that should be removed. Guest path style.

NOTE: Symbolic links in the final component will not be followed,
instead an not-a-directory error is reported.

*/
    public void directoryRemove(String path)
    {
        try
        {
        port.iGuestSessionDirectoryRemove(obj, path);
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
Removes a guest directory recursively.
@param path Path of the directory that is to be removed recursively. Guest
path style.

@param flags Zero or more{@link org.virtualbox_7_0.DirectoryRemoveRecFlag}flags.

@return Progress object to track the operation completion. This is not implemented
yet and therefore this method call will block until deletion is completed.

NOTE: WARNING!! THE FLAGS ARE NOT CURRENTLY IMPLEMENTED.  THE IMPLEMENTATION
WORKS AS IF FLAGS WAS SET TO{@link org.virtualbox_7_0.DirectoryRemoveRecFlag#ContentAndDir}.

NOTE: If the final path component is a symbolic link, this method will
fail as it can only be applied to directories.

NOTE: WARNING! SPECIFYING{@link org.virtualbox_7_0.DirectoryRemoveRecFlag#ContentAndDir}IS
MANDATORY AT THE MOMENT!!

*/
    public org.virtualbox_7_0.IProgress directoryRemoveRecursive(String path, List<org.virtualbox_7_0.DirectoryRemoveRecFlag> flags)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionDirectoryRemoveRecursive(obj, path, Helper.convertEnums(org.virtualbox_7_0.DirectoryRemoveRecFlag.class, org.virtualbox_7_0.jaxws.DirectoryRemoveRecFlag.class, flags));
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
Schedules setting an environment variable when creating the next guest
process.  This affects the{@link org.virtualbox_7_0.IGuestSession#getEnvironmentChanges()}attribute.
@param name Name of the environment variable to set.  This cannot be empty
nor can it contain any equal signs.

@param value Value to set the session environment variable to.

*/
    public void environmentScheduleSet(String name, String value)
    {
        try
        {
        port.iGuestSessionEnvironmentScheduleSet(obj, name, value);
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
Schedules unsetting (removing) an environment variable when creating
the next guest process.  This affects the{@link org.virtualbox_7_0.IGuestSession#getEnvironmentChanges()}attribute.
@param name Name of the environment variable to unset.  This cannot be empty
nor can it contain any equal signs.

*/
    public void environmentScheduleUnset(String name)
    {
        try
        {
        port.iGuestSessionEnvironmentScheduleUnset(obj, name);
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
Gets an environment variable from the session's base environment
({@link org.virtualbox_7_0.IGuestSession#getEnvironmentBase()}).
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - If the Guest Additions does not
support the session base environment feature.  Support for this was
introduced with protocol version XXXX.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - If the Guest Additions has
yet to report the session base environment.</dd>
</dl>

@param name Name of the environment variable to   get.This cannot be empty
nor can it contain any equal signs.

@return The value of the variable.  Empty if not found.  To deal with
variables that may have empty values, use{@link org.virtualbox_7_0.IGuestSession#environmentDoesBaseVariableExist(String)}.

*/
    public String environmentGetBaseVariable(String name)
    {
        try
        {
            String retVal;
        retVal = port.iGuestSessionEnvironmentGetBaseVariable(obj, name);
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
Checks if the given environment variable exists in the session's base
environment ({@link org.virtualbox_7_0.IGuestSession#getEnvironmentBase()}).
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - If the Guest Additions does not
support the session base environment feature.  Support for this was
introduced with protocol version XXXX.</dd>
<dd><code>VBOX_E_INVALID_OBJECT_STATE</code> - If the Guest Additions has
yet to report the session base environment.</dd>
</dl>

@param name Name of the environment variable to look for.  This cannot be
empty nor can it contain any equal signs.

@return TRUE if the variable exists, FALSE if not.

*/
    public Boolean environmentDoesBaseVariableExist(String name)
    {
        try
        {
            Boolean retVal;
        retVal = port.iGuestSessionEnvironmentDoesBaseVariableExist(obj, name);
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
Copies a file from one guest location to another.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - Not yet implemented.</dd>
</dl>

@param source The path to the file to copy (in the guest).  Guest path style.

@param destination The path to the target file (in the guest).  This cannot be a
directory.  Guest path style.

@param flags Zero or more{@link org.virtualbox_7_0.FileCopyFlag}values.

@return Progress object to track the operation to completion.

NOTE: Will overwrite the destination file unless{@link org.virtualbox_7_0.FileCopyFlag#NoReplace}is specified.

*/
    public org.virtualbox_7_0.IProgress fileCopy(String source, String destination, List<org.virtualbox_7_0.FileCopyFlag> flags)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionFileCopy(obj, source, destination, Helper.convertEnums(org.virtualbox_7_0.FileCopyFlag.class, org.virtualbox_7_0.jaxws.FileCopyFlag.class, flags));
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
Copies a file from the guest to the host.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error starting the copy operation.</dd>
</dl>

@param source Path to the file on the guest side that should be copied to the
host.  Guest path style.

@param destination Where to put the file on the host (file, not directory). Host
path style.

@param flags Zero or more{@link org.virtualbox_7_0.FileCopyFlag}values.

@return Progress object to track the operation to completion.

NOTE: Will overwrite the destination file unless{@link org.virtualbox_7_0.FileCopyFlag#NoReplace}is specified.

*/
    public org.virtualbox_7_0.IProgress fileCopyFromGuest(String source, String destination, List<org.virtualbox_7_0.FileCopyFlag> flags)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionFileCopyFromGuest(obj, source, destination, Helper.convertEnums(org.virtualbox_7_0.FileCopyFlag.class, org.virtualbox_7_0.jaxws.FileCopyFlag.class, flags));
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
Copies a file from the host to the guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error starting the copy operation.</dd>
</dl>

@param source Path to the file on the host side that should be copied to the
guest.  Host path style.

@param destination Where to put the file in the guest (file, not directory).  Guest
style path.

@param flags Zero or more{@link org.virtualbox_7_0.FileCopyFlag}values.

@return Progress object to track the operation to completion.

NOTE: Will overwrite the destination file unless{@link org.virtualbox_7_0.FileCopyFlag#NoReplace}is specified.

*/
    public org.virtualbox_7_0.IProgress fileCopyToGuest(String source, String destination, List<org.virtualbox_7_0.FileCopyFlag> flags)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionFileCopyToGuest(obj, source, destination, Helper.convertEnums(org.virtualbox_7_0.FileCopyFlag.class, org.virtualbox_7_0.jaxws.FileCopyFlag.class, flags));
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
Creates a temporary file in the guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_NOT_SUPPORTED</code> - The operation is not possible as requested on this particular
guest OS.</dd>
<dd><code>E_INVALIDARG</code> - Invalid argument. This includes an incorrectly formatted template,
or a non-absolute path.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - The temporary file could not be created. Possible reasons include
a non-existing path or an insecure path when the secure
option was requested.</dd>
</dl>

@param templateName Template for the name of the file to create. This must contain
at least one 'X' character. The first group of consecutive 'X'
characters in the template will be replaced by a random
alphanumeric string to produce a unique name.

@param mode The UNIX-style access mode mask to create the file with.
Whether/how all three access groups and associated access rights are
realized is guest OS dependent.  The API does the best it can on each
OS.

This parameter is ignore if the  secure parameter is set to  true.

@param path The path to the directory in which the temporary file should be
created.

@param secure Whether to fail if the file can not be securely created.
Currently this means that another unprivileged user cannot
manipulate the path specified or remove the temporary file after
it has been created. Also causes the mode specified to be ignored.
May not be supported on all guest types.

@return On success this will contain an open file object for the new
temporary file.

NOTE: It is strongly recommended to use 0600.

*/
    public org.virtualbox_7_0.IGuestFile fileCreateTemp(String templateName, Long mode, String path, Boolean secure)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionFileCreateTemp(obj, templateName, mode, path, secure);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestFile(retVal, getObjMgr(), port) : null;
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
Checks whether a regular file exists in the guest or not.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error while checking existence of the file specified.</dd>
</dl>

@param path Path to the alleged regular file.  Guest path style.

@param followSymlinks If  true, symbolic links in the final component will be followed
and the existance of the symlink target made the question for this method.
If  false, a symbolic link in the final component will make the
method return  false (because a symlink isn't a regular file).

@return Returns  true if the file exists,  false if not.   false is
also return if this  path does not point to a file object.

*/
    public Boolean fileExists(String path, Boolean followSymlinks)
    {
        try
        {
            Boolean retVal;
        retVal = port.iGuestSessionFileExists(obj, path, followSymlinks);
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
Opens a file and creates a{@link org.virtualbox_7_0.IGuestFile}object that
can be used for further operations.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - File to open was not found.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error while opening the file.</dd>
<dd><code>VBOX_E_MAXIMUM_REACHED</code> - The maximum of concurrent guest files has been reached.</dd>
</dl>

@param path Path to file to open.  Guest path style.

@param accessMode The file access mode (read, write and/or append).
See{@link org.virtualbox_7_0.FileAccessMode}for details.

@param openAction What action to take depending on whether the file exists or not.
See{@link org.virtualbox_7_0.FileOpenAction}for details.

@param creationMode The UNIX-style access mode mask to create the file with if  openAction
requested the file to be created (otherwise ignored).  Whether/how all
three access groups and associated access rights are realized is guest
OS dependent.  The API does the best it can on each OS.

@return {@link org.virtualbox_7_0.IGuestFile}object representing the opened file.

*/
    public org.virtualbox_7_0.IGuestFile fileOpen(String path, org.virtualbox_7_0.FileAccessMode accessMode, org.virtualbox_7_0.FileOpenAction openAction, Long creationMode)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionFileOpen(obj, path, org.virtualbox_7_0.jaxws.FileAccessMode.fromValue(accessMode.name()), org.virtualbox_7_0.jaxws.FileOpenAction.fromValue(openAction.name()), creationMode);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestFile(retVal, getObjMgr(), port) : null;
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
Opens a file and creates a{@link org.virtualbox_7_0.IGuestFile}object that
can be used for further operations, extended version.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - File to open was not found.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error while opening the file.</dd>
</dl>

@param path Path to file to open.  Guest path style.

@param accessMode The file access mode (read, write and/or append).
See{@link org.virtualbox_7_0.FileAccessMode}for details.

@param openAction What action to take depending on whether the file exists or not.
See{@link org.virtualbox_7_0.FileOpenAction}for details.

@param sharingMode The file sharing mode in the guest. This parameter is currently
ignore for all guest OSes.  It will in the future be implemented for
Windows, OS/2 and maybe Solaris guests only, the others will ignore it.
Use{@link org.virtualbox_7_0.FileSharingMode#All}.

@param creationMode The UNIX-style access mode mask to create the file with if  openAction
requested the file to be created (otherwise ignored).  Whether/how all
three access groups and associated access rights are realized is guest
OS dependent.  The API does the best it can on each OS.

@param flags Zero or more{@link org.virtualbox_7_0.FileOpenExFlag}values.

@return {@link org.virtualbox_7_0.IGuestFile}object representing the opened file.

*/
    public org.virtualbox_7_0.IGuestFile fileOpenEx(String path, org.virtualbox_7_0.FileAccessMode accessMode, org.virtualbox_7_0.FileOpenAction openAction, org.virtualbox_7_0.FileSharingMode sharingMode, Long creationMode, List<org.virtualbox_7_0.FileOpenExFlag> flags)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionFileOpenEx(obj, path, org.virtualbox_7_0.jaxws.FileAccessMode.fromValue(accessMode.name()), org.virtualbox_7_0.jaxws.FileOpenAction.fromValue(openAction.name()), org.virtualbox_7_0.jaxws.FileSharingMode.fromValue(sharingMode.name()), creationMode, Helper.convertEnums(org.virtualbox_7_0.FileOpenExFlag.class, org.virtualbox_7_0.jaxws.FileOpenExFlag.class, flags));
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestFile(retVal, getObjMgr(), port) : null;
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
Queries the size of a regular file in the guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - File to was not found.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error querying file size.</dd>
</dl>

@param path Path to the file which size is requested.  Guest path style.

@param followSymlinks It  true, symbolic links in the final path component will be
followed to their target, and the size of the target is returned.
If  false, symbolic links in the final path component will make
the method call fail (symblink is not a regular file).

@return Queried file size.

*/
    public Long fileQuerySize(String path, Boolean followSymlinks)
    {
        try
        {
            Long retVal;
        retVal = port.iGuestSessionFileQuerySize(obj, path, followSymlinks);
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
Checks whether a file system object (file, directory, etc) exists in
the guest or not.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error while checking existence of the file specified.</dd>
</dl>

@param path Path to the file system object to check the existance of.  Guest
path style.

@param followSymlinks If  true, symbolic links in the final component will be followed
and the method will instead check if the target exists.
If  false, symbolic links in the final component will satisfy the
method and it will return  true in  exists.

@return Returns  true if the file exists,  false if not.

*/
    public Boolean fsObjExists(String path, Boolean followSymlinks)
    {
        try
        {
            Boolean retVal;
        retVal = port.iGuestSessionFsObjExists(obj, path, followSymlinks);
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
Queries information about a file system object (file, directory, etc)
in the guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - The file system object was not found.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error while querying information.</dd>
</dl>

@param path Path to the file system object to gather information about.
Guest path style.

@param followSymlinks Information about symbolic links is returned if  false.  Otherwise,
symbolic links are followed and the returned information concerns
itself with the symlink target if  true.

@return {@link org.virtualbox_7_0.IGuestFsObjInfo}object containing the information.

*/
    public org.virtualbox_7_0.IGuestFsObjInfo fsObjQueryInfo(String path, Boolean followSymlinks)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionFsObjQueryInfo(obj, path, followSymlinks);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestFsObjInfo(retVal, getObjMgr(), port) : null;
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
Removes a file system object (file, symlink, etc) in the guest.  Will
not work on directories, use{@link org.virtualbox_7_0.IGuestSession#directoryRemove(String)}to remove directories.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The method has not been implemented yet.</dd>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - The file system object was not found.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - For most other errors. We know this is unhelpful, will fix shortly...</dd>
</dl>

@param path Path to the file system object to remove.  Guest style path.

NOTE: This method will remove symbolic links in the final path
component, not follow them.

*/
    public void fsObjRemove(String path)
    {
        try
        {
        port.iGuestSessionFsObjRemove(obj, path);
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
Removes multiple file system objects (files, directories, symlinks, etc)
in the guest. Use with caution.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The method has not been implemented yet.</dd>
</dl>

@param path Array of paths to the file system objects to remove.  Guest style path.

@return Progress object to track the operation to completion.

NOTE: This method is not implemented yet and will return E_NOTIMPL.

NOTE: This method will remove symbolic links in the final path
component, not follow them.

*/
    public org.virtualbox_7_0.IProgress fsObjRemoveArray(List<String> path)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionFsObjRemoveArray(obj, path);
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
Renames a file system object (file, directory, symlink, etc) in the
guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - The file system object was not found.</dd>
<dd><code>VBOX_E_IPRT_ERROR</code> - For most other errors. We know this is unhelpful, will fix shortly...</dd>
</dl>

@param oldPath The current path to the object.  Guest path style.

@param newPath The new path to the object.  Guest path style.

@param flags Zero or more{@link org.virtualbox_7_0.FsObjRenameFlag}values.

*/
    public void fsObjRename(String oldPath, String newPath, List<org.virtualbox_7_0.FsObjRenameFlag> flags)
    {
        try
        {
        port.iGuestSessionFsObjRename(obj, oldPath, newPath, Helper.convertEnums(org.virtualbox_7_0.FsObjRenameFlag.class, org.virtualbox_7_0.jaxws.FsObjRenameFlag.class, flags));
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
Moves a file system object (file, directory, symlink, etc) from one
guest location to another.

This differs from{@link org.virtualbox_7_0.IGuestSession#fsObjRename(String,String,List)}in that it
can move accross file system boundraries.  In that case it will
perform a copy and then delete the original.  For directories, this
can take a while and is subject to races.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - Not yet implemented.</dd>
</dl>

@param source Path to the file to move.  Guest path style.

@param destination Where to move the file to (file, not directory).  Guest path
style.

@param flags Zero or more{@link org.virtualbox_7_0.FsObjMoveFlag}values.

@return Progress object to track the operation to completion.

*/
    public org.virtualbox_7_0.IProgress fsObjMove(String source, String destination, List<org.virtualbox_7_0.FsObjMoveFlag> flags)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionFsObjMove(obj, source, destination, Helper.convertEnums(org.virtualbox_7_0.FsObjMoveFlag.class, org.virtualbox_7_0.jaxws.FsObjMoveFlag.class, flags));
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
Moves file system objects (files, directories, symlinks, etc) from one
guest location to another.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - Not yet implemented.</dd>
</dl>

@param source Array of paths to the file system objects to move.  Guest style path.

@param destination Where to move the file system objects to (directory).  Guest path
style.

@param flags Zero or more{@link org.virtualbox_7_0.FsObjMoveFlag}values.

@return Progress object to track the operation to completion.

*/
    public org.virtualbox_7_0.IProgress fsObjMoveArray(List<String> source, String destination, List<org.virtualbox_7_0.FsObjMoveFlag> flags)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionFsObjMoveArray(obj, source, destination, Helper.convertEnums(org.virtualbox_7_0.FsObjMoveFlag.class, org.virtualbox_7_0.jaxws.FsObjMoveFlag.class, flags));
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
Copies file system objects (files, directories, symlinks, etc) from one
guest location to another.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - Not yet implemented.</dd>
</dl>

@param source Array of paths to the file system objects to copy.  Guest style path.

@param destination Where to copy the file system objects to (directory).  Guest path
style.

@param flags Zero or more{@link org.virtualbox_7_0.FileCopyFlag}values.

@return Progress object to track the operation to completion.

*/
    public org.virtualbox_7_0.IProgress fsObjCopyArray(List<String> source, String destination, List<org.virtualbox_7_0.FileCopyFlag> flags)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionFsObjCopyArray(obj, source, destination, Helper.convertEnums(org.virtualbox_7_0.FileCopyFlag.class, org.virtualbox_7_0.jaxws.FileCopyFlag.class, flags));
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
Sets the access control list (ACL) of a file system object (file,
directory, etc) in the guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The method is not implemented yet.</dd>
</dl>

@param path Full path of the file system object which ACL to set.

@param followSymlinks If  true symbolic links in the final component will be followed,
otherwise, if  false, the method will work directly on a symbolic
link in the final component.

@param acl The ACL specification string. To-be-defined.

@param mode UNIX-style mode mask to use if  acl is empty. As mention in{@link org.virtualbox_7_0.IGuestSession#directoryCreate(String,Long,List)}this is realized on
a best effort basis and the exact behavior depends on the Guest OS.

*/
    public void fsObjSetACL(String path, Boolean followSymlinks, String acl, Long mode)
    {
        try
        {
        port.iGuestSessionFsObjSetACL(obj, path, followSymlinks, acl, mode);
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
Returns the free space (in bytes) of a given path.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The method is not implemented yet.</dd>
</dl>

@param path Full path to return the free space for.

@return Free space (in bytes).

*/
    public Long fsQueryFreeSpace(String path)
    {
        try
        {
            Long retVal;
        retVal = port.iGuestSessionFsQueryFreeSpace(obj, path);
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
Returns file system information for a given path.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The method is not implemented yet.</dd>
</dl>

@param path Full path to return file system information for.

@return IGuestFsInfo object containing the information.

*/
    public org.virtualbox_7_0.IGuestFsInfo fsQueryInfo(String path)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionFsQueryInfo(obj, path);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestFsInfo(retVal, getObjMgr(), port) : null;
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
Creates a new process running in the guest. The new process will be
started asynchronously, meaning on return of this function it is not
be guaranteed that the guest process is in a started state. To wait for
successful startup, use the{@link org.virtualbox_7_0.IProcess#waitFor(Long,Long)}call.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_IPRT_ERROR</code> - Error creating guest process.</dd>
<dd><code>VBOX_E_MAXIMUM_REACHED</code> - The maximum of concurrent guest processes has been reached.</dd>
</dl>

@param executable Full path to the file to execute in the guest.  The file has to
exists in the guest VM with executable right to the session user in
order to succeed.  If empty/null, the first entry in the
arguments array will be used instead (i.e. argv[0]).

@param arguments Array of arguments passed to the new process.

@param environmentChanges Set of environment changes to complement{@link org.virtualbox_7_0.IGuestSession#getEnvironmentChanges()}.  Takes precedence
over the session ones.  The changes are in putenv format, i.e.
"VAR=VALUE" for setting and "VAR" for unsetting.

The changes are applied to the base environment of the impersonated
guest user ({@link org.virtualbox_7_0.IGuestSession#getEnvironmentBase()}) when
creating the process.  (This is done on the guest side of things in
order to be compatible with older Guest Additions.  That is one of
the motivations for not passing in the whole environment here.)

@param flags Process creation flags;
see{@link org.virtualbox_7_0.ProcessCreateFlag}for more information.

@param timeoutMS Timeout (in ms) for limiting the guest process' running time.
Pass 0 for an infinite timeout. On timeout the guest process will be
killed and its status will be put to an appropriate value. See{@link org.virtualbox_7_0.ProcessStatus}for more information.

@return Guest process object of the newly created process.

NOTE: Starting at VirtualBox 4.2 guest process execution by is default limited
to serve up to 255 guest processes at a time. If all 255 guest processes
are active and running, creating a new guest process will result in an
error.

If ProcessCreateFlag_WaitForStdOut and/or ProcessCreateFlag_WaitForStdErr
are set, the guest process will not enter the terminated state until
all data from the specified streams have been read read.

NOTE: Starting with VirtualBox 5.0 this array starts with argument 0
instead of argument 1 as in previous versions.  Whether the zeroth
argument can be passed to the guest depends on the VBoxService
version running there.  If you depend on this, check that the{@link org.virtualbox_7_0.IGuestSession#getProtocolVersion()}is 3 or higher.

*/
    public org.virtualbox_7_0.IGuestProcess processCreate(String executable, List<String> arguments, List<String> environmentChanges, List<org.virtualbox_7_0.ProcessCreateFlag> flags, Long timeoutMS)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionProcessCreate(obj, executable, arguments, environmentChanges, Helper.convertEnums(org.virtualbox_7_0.ProcessCreateFlag.class, org.virtualbox_7_0.jaxws.ProcessCreateFlag.class, flags), timeoutMS);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestProcess(retVal, getObjMgr(), port) : null;
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
Creates a new process running in the guest with the extended options
for setting the process priority and affinity.

See{@link org.virtualbox_7_0.IGuestSession#processCreate(String,List,List,List,Long)}for more information.
@param executable Full path to the file to execute in the guest.  The file has to
exists in the guest VM with executable right to the session user in
order to succeed.  If empty/null, the first entry in the
arguments array will be used instead (i.e. argv[0]).

@param arguments Array of arguments passed to the new process.

@param environmentChanges Set of environment changes to complement{@link org.virtualbox_7_0.IGuestSession#getEnvironmentChanges()}.  Takes precedence
over the session ones.  The changes are in putenv format, i.e.
"VAR=VALUE" for setting and "VAR" for unsetting.

The changes are applied to the base environment of the impersonated
guest user ({@link org.virtualbox_7_0.IGuestSession#getEnvironmentBase()}) when
creating the process.  (This is done on the guest side of things in
order to be compatible with older Guest Additions.  That is one of
the motivations for not passing in the whole environment here.)

@param flags Process creation flags, see{@link org.virtualbox_7_0.ProcessCreateFlag}for
detailed description of available flags.

@param timeoutMS Timeout (in ms) for limiting the guest process' running time.
Pass 0 for an infinite timeout. On timeout the guest process will be
killed and its status will be put to an appropriate value. See{@link org.virtualbox_7_0.ProcessStatus}for more information.

@param priority Process priority to use for execution, see{@link org.virtualbox_7_0.ProcessPriority}for available priority levels.

@param affinity Processor affinity to set for the new process.  This is a list of
guest CPU numbers the process is allowed to run on.

@return Guest process object of the newly created process.

NOTE: Starting with VirtualBox 5.0 this array starts with argument 0
instead of argument 1 as in previous versions.  Whether the zeroth
argument can be passed to the guest depends on the VBoxService
version running there.  If you depend on this, check that the{@link org.virtualbox_7_0.IGuestSession#getProtocolVersion()}is 3 or higher.

NOTE: This is silently ignored if not supported by Guest Additions.

NOTE: This is silently ignored if the guest does not support setting the
affinity of processes, or if the Guest Additions does not implemet
this feature.

*/
    public org.virtualbox_7_0.IGuestProcess processCreateEx(String executable, List<String> arguments, List<String> environmentChanges, List<org.virtualbox_7_0.ProcessCreateFlag> flags, Long timeoutMS, org.virtualbox_7_0.ProcessPriority priority, List<Integer> affinity)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionProcessCreateEx(obj, executable, arguments, environmentChanges, Helper.convertEnums(org.virtualbox_7_0.ProcessCreateFlag.class, org.virtualbox_7_0.jaxws.ProcessCreateFlag.class, flags), timeoutMS, org.virtualbox_7_0.jaxws.ProcessPriority.fromValue(priority.name()), affinity);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestProcess(retVal, getObjMgr(), port) : null;
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
Gets a certain guest process by its process ID (PID).
@param pid Process ID (PID) to get guest process for.

@return Guest process of specified process ID (PID).

*/
    public org.virtualbox_7_0.IGuestProcess processGet(Long pid)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iGuestSessionProcessGet(obj, pid);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IGuestProcess(retVal, getObjMgr(), port) : null;
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
Creates a symbolic link in the guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The method is not implemented yet.</dd>
</dl>

@param symlink Path to the symbolic link that should be created.  Guest path
style.

@param target The path to the symbolic link target.  If not an absolute, this will
be relative to the  symlink location at access time.  Guest path
style.

@param type The symbolic link type (mainly for Windows). See{@link org.virtualbox_7_0.SymlinkType}for more information.

*/
    public void symlinkCreate(String symlink, String target, org.virtualbox_7_0.SymlinkType type)
    {
        try
        {
        port.iGuestSessionSymlinkCreate(obj, symlink, target, org.virtualbox_7_0.jaxws.SymlinkType.fromValue(type.name()));
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
Checks whether a symbolic link exists in the guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The method is not implemented yet.</dd>
</dl>

@param symlink Path to the alleged symbolic link.  Guest path style.

@return Returns  true if the symbolic link exists.  Returns  false if it
does not exist, if the file system object identified by the path is
not a symbolic link, or if the object type is inaccessible to the
user, or if the  symlink argument is empty.

*/
    public Boolean symlinkExists(String symlink)
    {
        try
        {
            Boolean retVal;
        retVal = port.iGuestSessionSymlinkExists(obj, symlink);
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
Reads the target value of a symbolic link in the guest.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>E_NOTIMPL</code> - The method is not implemented yet.</dd>
</dl>

@param symlink Path to the symbolic link to read.

@param flags Zero or more{@link org.virtualbox_7_0.SymlinkReadFlag}values.

@return Target value of the symbolic link.  Guest path style.

*/
    public String symlinkRead(String symlink, List<org.virtualbox_7_0.SymlinkReadFlag> flags)
    {
        try
        {
            String retVal;
        retVal = port.iGuestSessionSymlinkRead(obj, symlink, Helper.convertEnums(org.virtualbox_7_0.SymlinkReadFlag.class, org.virtualbox_7_0.jaxws.SymlinkReadFlag.class, flags));
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
Waits for one or more events to happen.
@param waitFor Specifies what to wait for;
see{@link org.virtualbox_7_0.GuestSessionWaitForFlag}for more information.

@param timeoutMS Timeout (in ms) to wait for the operation to complete.
Pass 0 for an infinite timeout.

@return The overall wait result;
see{@link org.virtualbox_7_0.GuestSessionWaitResult}for more information.

*/
    public org.virtualbox_7_0.GuestSessionWaitResult waitFor(Long waitFor, Long timeoutMS)
    {
        try
        {
            org.virtualbox_7_0.jaxws.GuestSessionWaitResult retVal;
        retVal = port.iGuestSessionWaitFor(obj, waitFor, timeoutMS);
           return org.virtualbox_7_0.GuestSessionWaitResult.fromValue(retVal.value());
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
Waits for one or more events to happen.
Scriptable version of{@link #waitFor(Long,Long)}.
@param waitFor Specifies what to wait for;
see{@link org.virtualbox_7_0.GuestSessionWaitForFlag}for more information.

@param timeoutMS Timeout (in ms) to wait for the operation to complete.
Pass 0 for an infinite timeout.

@return The overall wait result;
see{@link org.virtualbox_7_0.GuestSessionWaitResult}for more information.

*/
    public org.virtualbox_7_0.GuestSessionWaitResult waitForArray(List<org.virtualbox_7_0.GuestSessionWaitForFlag> waitFor, Long timeoutMS)
    {
        try
        {
            org.virtualbox_7_0.jaxws.GuestSessionWaitResult retVal;
        retVal = port.iGuestSessionWaitForArray(obj, Helper.convertEnums(org.virtualbox_7_0.GuestSessionWaitForFlag.class, org.virtualbox_7_0.jaxws.GuestSessionWaitForFlag.class, waitFor), timeoutMS);
           return org.virtualbox_7_0.GuestSessionWaitResult.fromValue(retVal.value());
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

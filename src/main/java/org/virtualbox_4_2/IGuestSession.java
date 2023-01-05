
/*
 *  Copyright (C) 2010-2011 Oracle Corporation
 *
 *  This file is part of the VirtualBox SDK, as available from
 *  http://www.virtualbox.org.  This library is free software; you can
 *  redistribute it and/or modify it under the terms of the GNU Lesser General
 *  Public License as published by the Free Software Foundation, in version 2.1
 *  as it comes in the "COPYING.LIB" file of the VirtualBox SDK distribution.
 *  This library is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 *  License for more details.
 *
 * IGuestSession.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import java.util.List;

import org.virtualbox_4_2.jaxws.InvalidObjectFaultMsg;
import org.virtualbox_4_2.jaxws.RuntimeFaultMsg;
import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * A guest session represents one impersonated user account on the guest, so
 * every operation will use the same credentials specified when creating the
 * session object via
 * {@link org.virtualbox_4_2.IGuest#createSession(String,String,String,String)}.
 * 
 * There can be a maximum of 32 sessions at once per VM. Each session keeps
 * track of its started guest processes, opened guest files or guest
 * directories. To work on guest files or directories a guest session offers
 * methods to open or create such objects (see
 * {@link org.virtualbox_4_2.IGuestSession#fileOpen(String,String,String,Long,Long)}
 * or {@link org.virtualbox_4_2.IGuestSession#directoryOpen(String,String,List)}
 * for example).
 * 
 * When done with either of these objects, including the guest session itself,
 * use the appropriate close() method to let the object do its cleanup work.
 * 
 * Every guest session has its own environment variable block which gets
 * automatically applied when starting a new guest process via
 * {@link org.virtualbox_4_2.IGuestSession#processCreate(String,List,List,List,Long)}
 * or
 * {@link org.virtualbox_4_2.IGuestSession#processCreateEx(String,List,List,List,Long,org.virtualbox_4_2.ProcessPriority,List)}.
 * To override (or unset) certain environment variables already set by the guest
 * session, one can specify a per-process environment block when using one of
 * the both above mentioned process creation calls.
 * 
 * Interface ID: <tt>{57EB82A8-822B-42C1-9D1C-5C54BC3D3250}</tt>
 */
public class IGuestSession extends IUnknown {

	public IGuestSession(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * Returns the user name used by this session to impersonate users on the guest.
	 * 
	 * @return String
	 * 
	 */
	public String getUser() {
		try {
			String retVal = port.iGuestSessionGetUser(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the domain name used by this session to impersonate users on the
	 * guest.
	 * 
	 * @return String
	 * 
	 */
	public String getDomain() {
		try {
			String retVal = port.iGuestSessionGetDomain(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the session's friendly name.
	 * 
	 * @return String
	 * 
	 */
	public String getName() {
		try {
			String retVal = port.iGuestSessionGetName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns the internal session ID.
	 * 
	 * @return Long
	 * 
	 */
	public Long getId() {
		try {
			Long retVal = port.iGuestSessionGetId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the session timeout (in ms).
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>E_NOTIMPL</td>
	 * <td>The method is not implemented yet.</td>
	 * <tr>
	 * </table>
	 * 
	 * @return Long
	 * 
	 */
	public Long getTimeout() {
		try {
			Long retVal = port.iGuestSessionGetTimeout(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the session timeout (in ms).
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>E_NOTIMPL</td>
	 * <td>The method is not implemented yet.</td>
	 * <tr>
	 * </table>
	 * 
	 * @param value Long
	 * 
	 */
	public void setTimeout(Long value) {
		try {
			port.iGuestSessionSetTimeout(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the current session environment.
	 * 
	 * @return List<String>
	 * 
	 */
	public List<String> getEnvironment() {
		try {
			List<String> retVal = port.iGuestSessionGetEnvironment(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns the current session environment.
	 * 
	 * @param value List<String>
	 * 
	 */
	public void setEnvironment(List<String> value) {
		try {
			port.iGuestSessionSetEnvironment(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns all current guest processes.
	 * 
	 * @return List<org.virtualbox_4_2.IGuestProcess>
	 * 
	 */
	public List<org.virtualbox_4_2.IGuestProcess> getProcesses() {
		try {
			List<String> retVal = port.iGuestSessionGetProcesses(obj);
			return Helper.wrap(org.virtualbox_4_2.IGuestProcess.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns all currently opened guest directories.
	 * 
	 * @return List<org.virtualbox_4_2.IGuestDirectory>
	 * 
	 */
	public List<org.virtualbox_4_2.IGuestDirectory> getDirectories() {
		try {
			List<String> retVal = port.iGuestSessionGetDirectories(obj);
			return Helper.wrap(org.virtualbox_4_2.IGuestDirectory.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns all currently opened guest files.
	 * 
	 * @return List<org.virtualbox_4_2.IGuestFile>
	 * 
	 */
	public List<org.virtualbox_4_2.IGuestFile> getFiles() {
		try {
			List<String> retVal = port.iGuestSessionGetFiles(obj);
			return Helper.wrap(org.virtualbox_4_2.IGuestFile.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IGuestSession queryInterface(IUnknown obj) {
		return obj == null ? null : new IGuestSession(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Closes this session. All opened guest directories, files and processes which
	 * are not referenced by clients anymore will be uninitialized.
	 * 
	 */
	public void close() {
		try {
			port.iGuestSessionClose(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Copies a file from guest to the host.
	 * 
	 * 
	 * @param source Source file on the guest to copy to the host.
	 * 
	 * @param dest   Destination file name on the host.
	 * 
	 * @param flags  Copy flags; see {@link org.virtualbox_4_2.CopyFileFlag} for
	 *               more information.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Error starting the copy operation.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IProgress copyFrom(String source, String dest,
			List<org.virtualbox_4_2.CopyFileFlag> flags) {
		try {
			String retVal;
			retVal = port.iGuestSessionCopyFrom(obj, source, dest, Helper.convertEnums(
					org.virtualbox_4_2.CopyFileFlag.class, org.virtualbox_4_2.jaxws.CopyFileFlag.class, flags));
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Copies a file from host to the guest.
	 * 
	 * 
	 * @param source Source file on the host to copy to the guest.
	 * 
	 * @param dest   Destination file name on the guest.
	 * 
	 * @param flags  Copy flags; see {@link org.virtualbox_4_2.CopyFileFlag} for
	 *               more information.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Error starting the copy operation.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IProgress copyTo(String source, String dest,
			List<org.virtualbox_4_2.CopyFileFlag> flags) {
		try {
			String retVal;
			retVal = port.iGuestSessionCopyTo(obj, source, dest, Helper.convertEnums(
					org.virtualbox_4_2.CopyFileFlag.class, org.virtualbox_4_2.jaxws.CopyFileFlag.class, flags));
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Create a directory on the guest.
	 * 
	 * 
	 * @param path  Full path of directory to create.
	 * 
	 * @param mode  File creation mode.
	 * 
	 * @param flags Creation flags; see
	 *              {@link org.virtualbox_4_2.DirectoryCreateFlag} for more
	 *              information.
	 * 
	 *              Expected result codes:
	 *              <table>
	 *              <tr>
	 *              <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *              <td>Error while creating the directory.</td>
	 *              <tr>
	 *              </table>
	 * 
	 */
	public void directoryCreate(String path, Long mode, List<org.virtualbox_4_2.DirectoryCreateFlag> flags) {
		try {
			port.iGuestSessionDirectoryCreate(obj, path, mode,
					Helper.convertEnums(org.virtualbox_4_2.DirectoryCreateFlag.class,
							org.virtualbox_4_2.jaxws.DirectoryCreateFlag.class, flags));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Create a temporary directory on the guest.
	 * 
	 * 
	 * @param templateName Template for the name of the directory to create. This
	 *                     must contain at least one 'X' character. The first group
	 *                     of consecutive 'X' characters in the template will be
	 *                     replaced by a random alphanumeric string to produce a
	 *                     unique name.
	 * 
	 * @param mode         The mode of the directory to create. Use 0700 unless
	 *                     there are reasons not to. This parameter is ignored if
	 *                     "secure" is specified.
	 * 
	 * 
	 * @param path         The absolute path to create the temporary directory in.
	 * 
	 * @param secure       Whether to fail if the directory can not be securely
	 *                     created. Currently this means that another unprivileged
	 *                     user cannot manipulate the path specified or remove the
	 *                     temporary directory after it has been created. Also
	 *                     causes the mode specified to be ignored. May not be
	 *                     supported on all guest types.
	 * 
	 * @return On success this will contain the name of the directory created with
	 *         full path.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_NOT_SUPPORTED VBOX_E_NOT_SUPPORTED</td>
	 *         <td>The operation is not possible as requested on this particular
	 *         guest type.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>Invalid argument. This includes an incorrectly formatted
	 *         template, or a non-absolute path.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>The temporary directory could not be created. Possible reasons
	 *         include a non-existing path or an insecure path when the secure
	 *         option was requested.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public String directoryCreateTemp(String templateName, Long mode, String path, Boolean secure) {
		try {
			String retVal;
			retVal = port.iGuestSessionDirectoryCreateTemp(obj, templateName, mode, path, secure);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Checks whether a directory exists on the guest or not.
	 * 
	 * 
	 * @param path Directory to check existence for.
	 * 
	 * @return Returns true if the directory exists, false if not.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Error while checking existence of the directory specified.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public Boolean directoryExists(String path) {
		try {
			Boolean retVal;
			retVal = port.iGuestSessionDirectoryExists(obj, path);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Opens a directory and creates a {@link org.virtualbox_4_2.IGuestDirectory}
	 * object that can be used for further operations.
	 * 
	 * 
	 * @param path   Full path to file to open.
	 * 
	 * @param filter Open filter to apply. This can include wildcards like ? and *.
	 * 
	 * @param flags  Open flags; see {@link org.virtualbox_4_2.DirectoryOpenFlag}
	 *               for more information.
	 * 
	 * @return {@link org.virtualbox_4_2.IGuestDirectory} object containing the
	 *         opened directory.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>Directory to open was not found.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Error while opening the directory.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IGuestDirectory directoryOpen(String path, String filter,
			List<org.virtualbox_4_2.DirectoryOpenFlag> flags) {
		try {
			String retVal;
			retVal = port.iGuestSessionDirectoryOpen(obj, path, filter,
					Helper.convertEnums(org.virtualbox_4_2.DirectoryOpenFlag.class,
							org.virtualbox_4_2.jaxws.DirectoryOpenFlag.class, flags));
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IGuestDirectory(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Queries information of a directory on the guest.
	 * 
	 * 
	 * @param path Directory to query information for.
	 * 
	 * @return {@link org.virtualbox_4_2.IGuestFsObjInfo} object containing the
	 *         queried information.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>Directory to query information for was not found.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Error querying information.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IGuestFsObjInfo directoryQueryInfo(String path) {
		try {
			String retVal;
			retVal = port.iGuestSessionDirectoryQueryInfo(obj, path);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IGuestFsObjInfo(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes a guest directory if not empty.
	 * 
	 * 
	 * @param path Full path of directory to remove.
	 * 
	 *             Expected result codes:
	 *             <table>
	 *             <tr>
	 *             <td>E_NOTIMPL</td>
	 *             <td>The method is not implemented yet.</td>
	 *             <tr>
	 *             </table>
	 * 
	 */
	public void directoryRemove(String path) {
		try {
			port.iGuestSessionDirectoryRemove(obj, path);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes a guest directory recursively.
	 * 
	 * 
	 * @param path  Full path of directory to remove recursively.
	 * 
	 * @param flags Remove flags; see
	 *              {@link org.virtualbox_4_2.DirectoryRemoveRecFlag} for more
	 *              information.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_NOTIMPL</td>
	 *         <td>The method is not implemented yet.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IProgress directoryRemoveRecursive(String path,
			List<org.virtualbox_4_2.DirectoryRemoveRecFlag> flags) {
		try {
			String retVal;
			retVal = port.iGuestSessionDirectoryRemoveRecursive(obj, path,
					Helper.convertEnums(org.virtualbox_4_2.DirectoryRemoveRecFlag.class,
							org.virtualbox_4_2.jaxws.DirectoryRemoveRecFlag.class, flags));
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Renames a directory on the guest.
	 * 
	 * 
	 * @param source Source directory to rename.
	 * 
	 * @param dest   Destination directory to rename the source to.
	 * 
	 * @param flags  Rename flags; see {@link org.virtualbox_4_2.PathRenameFlag} for
	 *               more information.
	 * 
	 *               Expected result codes:
	 *               <table>
	 *               <tr>
	 *               <td>E_NOTIMPL</td>
	 *               <td>The method is not implemented yet.</td>
	 *               <tr>
	 *               </table>
	 * 
	 */
	public void directoryRename(String source, String dest, List<org.virtualbox_4_2.PathRenameFlag> flags) {
		try {
			port.iGuestSessionDirectoryRename(obj, source, dest, Helper.convertEnums(
					org.virtualbox_4_2.PathRenameFlag.class, org.virtualbox_4_2.jaxws.PathRenameFlag.class, flags));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets the ACL (Access Control List) of a guest directory.
	 * 
	 * 
	 * @param path Full path of directory to set the ACL for.
	 * 
	 * @param acl  Actual ACL string to set. Must comply with the guest OS.
	 * 
	 *             Expected result codes:
	 *             <table>
	 *             <tr>
	 *             <td>E_NOTIMPL</td>
	 *             <td>The method is not implemented yet.</td>
	 *             <tr>
	 *             </table>
	 * 
	 */
	public void directorySetACL(String path, String acl) {
		try {
			port.iGuestSessionDirectorySetACL(obj, path, acl);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Clears (deletes) all session environment variables.
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 * <td>Error while clearing the session environment variables.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public void environmentClear() {
		try {
			port.iGuestSessionEnvironmentClear(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Gets the value of a session environment variable.
	 * 
	 * 
	 * @param name Name of session environment variable to get the value for.
	 * 
	 * @return Value of the session environment variable specified. If this variable
	 *         does not exist and empty value will be returned.
	 * 
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Error while getting the value of the session environment
	 *         variable.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public String environmentGet(String name) {
		try {
			String retVal;
			retVal = port.iGuestSessionEnvironmentGet(obj, name);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets a session environment variable.
	 * 
	 * 
	 * @param name  Name of session environment variable to set.
	 * 
	 * @param value Value to set the session environment variable to.
	 * 
	 *              Expected result codes:
	 *              <table>
	 *              <tr>
	 *              <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *              <td>Error while setting the session environment variable.</td>
	 *              <tr>
	 *              </table>
	 * 
	 */
	public void environmentSet(String name, String value) {
		try {
			port.iGuestSessionEnvironmentSet(obj, name, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Unsets session environment variable.
	 * 
	 * 
	 * @param name Name of session environment variable to unset (clear).
	 * 
	 *             Expected result codes:
	 *             <table>
	 *             <tr>
	 *             <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *             <td>Error while unsetting the session environment variable.</td>
	 *             <tr>
	 *             </table>
	 * 
	 */
	public void environmentUnset(String name) {
		try {
			port.iGuestSessionEnvironmentUnset(obj, name);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Creates a temporary file on the guest.
	 * 
	 * 
	 * @param templateName Template for the name of the file to create. This must
	 *                     contain at least one 'X' character. The first group of
	 *                     consecutive 'X' characters in the template will be
	 *                     replaced by a random alphanumeric string to produce a
	 *                     unique name.
	 * 
	 * 
	 * @param mode         The mode of the file to create. Use 0700 unless there are
	 *                     reasons not to. This parameter is ignored if "secure" is
	 *                     specified.
	 * 
	 * 
	 * @param path         The absolute path to create the temporary file in.
	 * 
	 * @param secure       Whether to fail if the file can not be securely created.
	 *                     Currently this means that another unprivileged user
	 *                     cannot manipulate the path specified or remove the
	 *                     temporary file after it has been created. Also causes the
	 *                     mode specified to be ignored. May not be supported on all
	 *                     guest types.
	 * 
	 * @return On success this will contain an open file object for the new
	 *         temporary file.
	 * 
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_NOT_SUPPORTED VBOX_E_NOT_SUPPORTED</td>
	 *         <td>The operation is not possible as requested on this particular
	 *         guest type.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>Invalid argument. This includes an incorrectly formatted
	 *         template, or a non-absolute path.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>The temporary file could not be created. Possible reasons include
	 *         a non-existing path or an insecure path when the secure option was
	 *         requested.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IGuestFile fileCreateTemp(String templateName, Long mode, String path, Boolean secure) {
		try {
			String retVal;
			retVal = port.iGuestSessionFileCreateTemp(obj, templateName, mode, path, secure);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IGuestFile(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Checks whether a file exists on the guest or not.
	 * 
	 * 
	 * @param path File to check existence for.
	 * 
	 * @return Returns true if the file exists, false if not.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Error while checking existence of the file specified.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public Boolean fileExists(String path) {
		try {
			Boolean retVal;
			retVal = port.iGuestSessionFileExists(obj, path);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes a single file on the guest.
	 * 
	 * 
	 * @param path Path to the file to remove.
	 * 
	 *             Expected result codes:
	 *             <table>
	 *             <tr>
	 *             <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *             <td>File to remove was not found.</td>
	 *             <tr>
	 *             <tr>
	 *             <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *             <td>Error while removing the file.</td>
	 *             <tr>
	 *             </table>
	 * 
	 */
	public void fileRemove(String path) {
		try {
			port.iGuestSessionFileRemove(obj, path);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Opens a file and creates a {@link org.virtualbox_4_2.IGuestFile} object that
	 * can be used for further operations.
	 * 
	 * 
	 * @param path         Full path to file to open.
	 * 
	 * @param openMode     The file open mode.
	 * 
	 * @param disposition  The file disposition.
	 * 
	 * @param creationMode The file creation mode.
	 * 
	 * @param offset       The initial read/write offset.
	 * 
	 * @return {@link org.virtualbox_4_2.IGuestFile} object representing the opened
	 *         file.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>File to open was not found.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Error while opening the file.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IGuestFile fileOpen(String path, String openMode, String disposition, Long creationMode,
			Long offset) {
		try {
			String retVal;
			retVal = port.iGuestSessionFileOpen(obj, path, openMode, disposition, creationMode, offset);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IGuestFile(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Queries information of a file on the guest.
	 * 
	 * 
	 * @param path File to query information for.
	 * 
	 * @return {@link org.virtualbox_4_2.IGuestFsObjInfo} object containing the
	 *         queried information.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>File to query information for was not found.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Error querying information.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IGuestFsObjInfo fileQueryInfo(String path) {
		try {
			String retVal;
			retVal = port.iGuestSessionFileQueryInfo(obj, path);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IGuestFsObjInfo(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Queries the size of a file on the guest.
	 * 
	 * 
	 * @param path File to query the size for.
	 * 
	 * @return Queried file size.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>File to rename was not found.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Error querying file size.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public Long fileQuerySize(String path) {
		try {
			Long retVal;
			retVal = port.iGuestSessionFileQuerySize(obj, path);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Renames a file on the guest.
	 * 
	 * 
	 * @param source Source file to rename.
	 * 
	 * @param dest   Destination file to rename the source to.
	 * 
	 * @param flags  Rename flags; see {@link org.virtualbox_4_2.PathRenameFlag} for
	 *               more information.
	 * 
	 *               Expected result codes:
	 *               <table>
	 *               <tr>
	 *               <td>E_NOTIMPL</td>
	 *               <td>The method is not implemented yet.</td>
	 *               <tr>
	 *               </table>
	 * 
	 */
	public void fileRename(String source, String dest, List<org.virtualbox_4_2.PathRenameFlag> flags) {
		try {
			port.iGuestSessionFileRename(obj, source, dest, Helper.convertEnums(org.virtualbox_4_2.PathRenameFlag.class,
					org.virtualbox_4_2.jaxws.PathRenameFlag.class, flags));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets the ACL (Access Control List) of a file on the guest.
	 * 
	 * 
	 * @param file Full path of file to set the ACL for.
	 * 
	 * @param acl  Actual ACL string to set. Must comply with the guest OS.
	 * 
	 *             Expected result codes:
	 *             <table>
	 *             <tr>
	 *             <td>E_NOTIMPL</td>
	 *             <td>The method is not implemented yet.</td>
	 *             <tr>
	 *             </table>
	 * 
	 */
	public void fileSetACL(String file, String acl) {
		try {
			port.iGuestSessionFileSetACL(obj, file, acl);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Executes an existing program inside the guest VM.
	 * 
	 * 
	 * @param command     Full path name of the command to execute on the guest; the
	 *                    commands has to exists in the guest VM in order to be
	 *                    executed.
	 * 
	 * 
	 * @param arguments   Array of arguments passed to the execution command.
	 * 
	 * @param environment Environment variables that can be set while the command is
	 *                    being executed, in form of "NAME=VALUE"; one pair per
	 *                    entry. To unset a variable just set its name ("NAME")
	 *                    without a value.
	 * 
	 *                    This parameter can be used to override environment
	 *                    variables set by the guest session, which will be applied
	 *                    to the newly started process in any case.
	 * 
	 * 
	 * @param flags       Process creation flags; see
	 *                    {@link org.virtualbox_4_2.ProcessCreateFlag} for more
	 *                    information.
	 * 
	 * 
	 * @param timeoutMS   Timeout (in ms) to wait for the operation to complete.
	 *                    Pass 0 for an infinite timeout.
	 * 
	 * 
	 * @return Guest process object of the newly created process.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Could not create process.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: Starting at VirtualBox 4.2 guest process execution by default
	 *         is limited to serve up to 255 guest processes at a time. If all 255
	 *         guest processes are still active and running, starting a new guest
	 *         process will result in an appropriate error message.
	 * 
	 *         If ProcessCreateFlag_WaitForStdOut and / or respectively
	 *         ProcessCreateFlag_WaitForStdErr is / are set, the guest process will
	 *         not exit until all data from the specified stream(s) is / are read
	 *         out.
	 * 
	 *         To raise or lower the guest process execution limit, either the guest
	 *         property "/VirtualBox/GuestAdd/VBoxService/--control-procs-max-kept"
	 *         or VBoxService' command line by specifying "--control-procs-max-kept"
	 *         needs to be modified. A restart of the guest OS is required
	 *         afterwards. To serve unlimited guest processes, a value of "0" needs
	 *         to be set (not recommended).
	 * 
	 * 
	 */
	public org.virtualbox_4_2.IGuestProcess processCreate(String command, List<String> arguments,
			List<String> environment, List<org.virtualbox_4_2.ProcessCreateFlag> flags, Long timeoutMS) {
		try {
			String retVal;
			retVal = port.iGuestSessionProcessCreate(obj, command, arguments, environment,
					Helper.convertEnums(org.virtualbox_4_2.ProcessCreateFlag.class,
							org.virtualbox_4_2.jaxws.ProcessCreateFlag.class, flags),
					timeoutMS);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IGuestProcess(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Executes an existing program inside the guest VM. Extended version for also
	 * setting the process priority and affinity.
	 * 
	 * 
	 * @param command     Full path name of the command to execute on the guest; the
	 *                    commands has to exists in the guest VM in order to be
	 *                    executed.
	 * 
	 * 
	 * @param arguments   Array of arguments passed to the execution command.
	 * 
	 * @param environment Environment variables that can be set while the command is
	 *                    being executed, in form of "NAME=VALUE"; one pair per
	 *                    entry. To unset a variable just set its name ("NAME")
	 *                    without a value.
	 * 
	 *                    This parameter can be used to override environment
	 *                    variables set by the guest session, which will be applied
	 *                    to the newly started process in any case.
	 * 
	 * 
	 * @param flags       Process creation flags; see
	 *                    {@link org.virtualbox_4_2.ProcessCreateFlag} for more
	 *                    information.
	 * 
	 * 
	 * @param timeoutMS   Timeout (in ms) to wait for the operation to complete.
	 *                    Pass 0 for an infinite timeout.
	 * 
	 * 
	 * @param priority    Process priority to use for execution; see see
	 *                    {@link org.virtualbox_4_2.ProcessPriority} for more
	 *                    information.
	 * 
	 * @param affinity    Process affinity to use for execution. This parameter is
	 *                    not implemented yet.
	 * 
	 * 
	 * @return Guest process object of the newly created process.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Could not create process.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: Starting at VirtualBox 4.2 guest process execution by default
	 *         is limited to serve up to 255 guest processes at a time. If all 255
	 *         guest processes are still active and running, starting a new guest
	 *         process will result in an appropriate error message.
	 * 
	 *         If ProcessCreateFlag_WaitForStdOut and / or respectively
	 *         ProcessCreateFlag_WaitForStdErr is / are set, the guest process will
	 *         not exit until all data from the specified stream(s) is / are read
	 *         out.
	 * 
	 *         To raise or lower the guest process execution limit, either the guest
	 *         property "/VirtualBox/GuestAdd/VBoxService/--control-procs-max-kept"
	 *         or VBoxService' command line by specifying "--control-procs-max-kept"
	 *         needs to be modified. A restart of the guest OS is required
	 *         afterwards. To serve unlimited guest processes, a value of "0" needs
	 *         to be set (not recommended).
	 * 
	 * 
	 */
	public org.virtualbox_4_2.IGuestProcess processCreateEx(String command, List<String> arguments,
			List<String> environment, List<org.virtualbox_4_2.ProcessCreateFlag> flags, Long timeoutMS,
			org.virtualbox_4_2.ProcessPriority priority, List<Integer> affinity) {
		try {
			String retVal;
			retVal = port.iGuestSessionProcessCreateEx(obj, command, arguments, environment,
					Helper.convertEnums(org.virtualbox_4_2.ProcessCreateFlag.class,
							org.virtualbox_4_2.jaxws.ProcessCreateFlag.class, flags),
					timeoutMS, org.virtualbox_4_2.jaxws.ProcessPriority.fromValue(priority.name()), affinity);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IGuestProcess(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Gets a certain guest process by its process ID (PID).
	 * 
	 * @param pid Process ID (PID) to get guest process for.
	 * 
	 * @return Guest process of specified process ID (PID).
	 * 
	 */
	public org.virtualbox_4_2.IGuestProcess processGet(Long pid) {
		try {
			String retVal;
			retVal = port.iGuestSessionProcessGet(obj, pid);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IGuestProcess(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Creates a symbolic link on the guest.
	 * 
	 * 
	 * @param source The name of the symbolic link.
	 * 
	 * @param target The path to the symbolic link target.
	 * 
	 * @param type   The symbolic link type; see
	 *               {@link org.virtualbox_4_2.SymlinkReadFlag} for more
	 *               information.
	 * 
	 * 
	 *               Expected result codes:
	 *               <table>
	 *               <tr>
	 *               <td>E_NOTIMPL</td>
	 *               <td>The method is not implemented yet.</td>
	 *               <tr>
	 *               </table>
	 * 
	 */
	public void symlinkCreate(String source, String target, org.virtualbox_4_2.SymlinkType type) {
		try {
			port.iGuestSessionSymlinkCreate(obj, source, target,
					org.virtualbox_4_2.jaxws.SymlinkType.fromValue(type.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Checks whether a symbolic link exists on the guest or not.
	 * 
	 * 
	 * @param symlink Symbolic link to check existence for.
	 * 
	 * @return Returns true if the symbolic link exists, false if not.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_NOTIMPL</td>
	 *         <td>The method is not implemented yet.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public Boolean symlinkExists(String symlink) {
		try {
			Boolean retVal;
			retVal = port.iGuestSessionSymlinkExists(obj, symlink);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Reads a symbolic link on the guest.
	 * 
	 * 
	 * @param symlink Full path to symbolic link to read.
	 * 
	 * @param flags   Read flags; see {@link org.virtualbox_4_2.SymlinkReadFlag} for
	 *                more information.
	 * 
	 * 
	 * @return Target of the symbolic link pointing to, if found.
	 * 
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>E_NOTIMPL</td>
	 *         <td>The method is not implemented yet.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public String symlinkRead(String symlink, List<org.virtualbox_4_2.SymlinkReadFlag> flags) {
		try {
			String retVal;
			retVal = port.iGuestSessionSymlinkRead(obj, symlink, Helper.convertEnums(
					org.virtualbox_4_2.SymlinkReadFlag.class, org.virtualbox_4_2.jaxws.SymlinkReadFlag.class, flags));
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes a symbolic link on the guest if it's a directory.
	 * 
	 * 
	 * @param path Symbolic link to remove.
	 * 
	 *             Expected result codes:
	 *             <table>
	 *             <tr>
	 *             <td>E_NOTIMPL</td>
	 *             <td>The method is not implemented yet.</td>
	 *             <tr>
	 *             </table>
	 * 
	 */
	public void symlinkRemoveDirectory(String path) {
		try {
			port.iGuestSessionSymlinkRemoveDirectory(obj, path);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes a symbolic link on the guest if it's a file.
	 * 
	 * 
	 * @param file Symbolic link to remove.
	 * 
	 *             Expected result codes:
	 *             <table>
	 *             <tr>
	 *             <td>E_NOTIMPL</td>
	 *             <td>The method is not implemented yet.</td>
	 *             <tr>
	 *             </table>
	 * 
	 */
	public void symlinkRemoveFile(String file) {
		try {
			port.iGuestSessionSymlinkRemoveFile(obj, file);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}


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
 * IFile.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.InvalidObjectFaultMsg;
import org.virtualbox_4_2.jaxws.RuntimeFaultMsg;
import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Abstract parent interface for files handled by VirtualBox.
 * 
 * Interface ID: <tt>{B702A560-6139-4A8E-A892-BBF14B97BF97}</tt>
 */
public class IFile extends IUnknown {

	public IFile(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * The creation mode.
	 * 
	 * @return Long
	 * 
	 */
	public Long getCreationMode() {
		try {
			Long retVal = port.iFileGetCreationMode(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The disposition mode.
	 * 
	 * @return Long
	 * 
	 */
	public Long getDisposition() {
		try {
			Long retVal = port.iFileGetDisposition(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Full path of the actual file name of this file.
	 * 
	 * @return String
	 * 
	 */
	public String getFileName() {
		try {
			String retVal = port.iFileGetFileName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The initial size in bytes when opened.
	 * 
	 * @return Long
	 * 
	 */
	public Long getInitialSize() {
		try {
			Long retVal = port.iFileGetInitialSize(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The open mode.
	 * 
	 * @return Long
	 * 
	 */
	public Long getOpenMode() {
		try {
			Long retVal = port.iFileGetOpenMode(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Current read/write offset in bytes.
	 * 
	 * @return Long
	 * 
	 */
	public Long getOffset() {
		try {
			Long retVal = port.iFileGetOffset(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IFile queryInterface(IUnknown obj) {
		return obj == null ? null : new IFile(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Closes this file. After closing operations like reading data, writing data or
	 * querying information will not be possible anymore.
	 * 
	 */
	public void close() {
		try {
			port.iFileClose(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Queries information about this file.
	 * 
	 * 
	 * @return Object information of this file. Also see
	 *         {@link org.virtualbox_4_2.IFsObjInfo}.
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
	public org.virtualbox_4_2.IFsObjInfo queryInfo() {
		try {
			String retVal;
			retVal = port.iFileQueryInfo(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IFsObjInfo(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Reads data from this file.
	 * 
	 * 
	 * @param toRead    Number of bytes to read.
	 * 
	 * @param timeoutMS Timeout (in ms) to wait for the operation to complete. Pass
	 *                  0 for an infinite timeout.
	 * 
	 * 
	 * @return Array of data read.
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
	public byte[] read(Long toRead, Long timeoutMS) {
		try {
			/* base64 */String retVal;
			retVal = port.iFileRead(obj, toRead, timeoutMS);
			return Helper.decodeBase64(retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Reads data from an offset of this file.
	 * 
	 * 
	 * @param offset    Offset in bytes to start reading.
	 * 
	 * @param toRead    Number of bytes to read.
	 * 
	 * @param timeoutMS Timeout (in ms) to wait for the operation to complete. Pass
	 *                  0 for an infinite timeout.
	 * 
	 * 
	 * @return Array of data read.
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
	public byte[] readAt(Long offset, Long toRead, Long timeoutMS) {
		try {
			/* base64 */String retVal;
			retVal = port.iFileReadAt(obj, offset, toRead, timeoutMS);
			return Helper.decodeBase64(retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Changes the read and write position of this file.
	 * 
	 * 
	 * @param offset Offset to seek.
	 * 
	 * @param whence Seek mode; see {@link org.virtualbox_4_2.FileSeekType} for more
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
	public void seek(Long offset, org.virtualbox_4_2.FileSeekType whence) {
		try {
			port.iFileSeek(obj, offset, org.virtualbox_4_2.jaxws.FileSeekType.fromValue(whence.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Sets the ACL of this file.
	 * 
	 * 
	 * @param acl ACL string to set.
	 * 
	 *            Expected result codes:
	 *            <table>
	 *            <tr>
	 *            <td>E_NOTIMPL</td>
	 *            <td>The method is not implemented yet.</td>
	 *            <tr>
	 *            </table>
	 * 
	 */
	public void setACL(String acl) {
		try {
			port.iFileSetACL(obj, acl);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Writes bytes to this file.
	 * 
	 * @param data      Array of bytes to write. The size of the array also
	 *                  specifies how much to write.
	 * 
	 * 
	 * @param timeoutMS Timeout (in ms) to wait for the operation to complete. Pass
	 *                  0 for an infinite timeout.
	 * 
	 * 
	 * @return How much bytes were written.
	 * 
	 */
	public Long write(byte[] data, Long timeoutMS) {
		try {
			Long retVal;
			retVal = port.iFileWrite(obj, Helper.encodeBase64(data), timeoutMS);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Writes bytes at a certain offset to this file.
	 * 
	 * 
	 * @param offset    Offset in bytes to start writing.
	 * 
	 * @param data      Array of bytes to write. The size of the array also
	 *                  specifies how much to write.
	 * 
	 * 
	 * @param timeoutMS Timeout (in ms) to wait for the operation to complete. Pass
	 *                  0 for an infinite timeout.
	 * 
	 * 
	 * @return How much bytes were written.
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
	public Long writeAt(Long offset, byte[] data, Long timeoutMS) {
		try {
			Long retVal;
			retVal = port.iFileWriteAt(obj, offset, Helper.encodeBase64(data), timeoutMS);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

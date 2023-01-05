
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
 * IProcess.java
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
 * Abstract parent interface for processes handled by VirtualBox.
 * 
 * Interface ID: <tt>{08864D56-96AB-418B-ADBC-5A679532AEB0}</tt>
 */
public class IProcess extends IUnknown {

	public IProcess(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * The process ID (PID).
	 * 
	 * @return Long
	 * 
	 */
	public Long getPID() {
		try {
			Long retVal = port.iProcessGetPID(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The current process status; see {@link org.virtualbox_4_2.ProcessStatus} for
	 * more information.
	 * 
	 * @return org.virtualbox_4_2.ProcessStatus
	 * 
	 */
	public org.virtualbox_4_2.ProcessStatus getStatus() {
		try {
			org.virtualbox_4_2.jaxws.ProcessStatus retVal = port.iProcessGetStatus(obj);
			return org.virtualbox_4_2.ProcessStatus.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The exit code. Only available when the process has been terminated normally.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getExitCode() {
		try {
			Integer retVal = port.iProcessGetExitCode(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The environment block this process is using during execution.
	 * 
	 * @return List<String>
	 * 
	 */
	public List<String> getEnvironment() {
		try {
			List<String> retVal = port.iProcessGetEnvironment(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The arguments this process is using for execution.
	 * 
	 * @return List<String>
	 * 
	 */
	public List<String> getArguments() {
		try {
			List<String> retVal = port.iProcessGetArguments(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Full path of the actual executable image.
	 * 
	 * @return String
	 * 
	 */
	public String getExecutablePath() {
		try {
			String retVal = port.iProcessGetExecutablePath(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * The friendly name of this process.
	 * 
	 * @return String
	 * 
	 */
	public String getName() {
		try {
			String retVal = port.iProcessGetName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IProcess queryInterface(IUnknown obj) {
		return obj == null ? null : new IProcess(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Waits for one more events to happen.
	 * 
	 * @param waitFor   Specifies what to wait for; see
	 *                  {@link org.virtualbox_4_2.ProcessWaitForFlag} for more
	 *                  information.
	 * 
	 * 
	 * @param timeoutMS Timeout (in ms) to wait for the operation to complete. Pass
	 *                  0 for an infinite timeout.
	 * 
	 * 
	 * @return The overall wait result; see
	 *         {@link org.virtualbox_4_2.ProcessWaitResult} for more information.
	 * 
	 * 
	 */
	public org.virtualbox_4_2.ProcessWaitResult waitFor(Long waitFor, Long timeoutMS) {
		try {
			org.virtualbox_4_2.jaxws.ProcessWaitResult retVal;
			retVal = port.iProcessWaitFor(obj, waitFor, timeoutMS);
			return org.virtualbox_4_2.ProcessWaitResult.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Waits for one more events to happen. Scriptable version of
	 * {@link #waitFor(Long,Long)}.
	 * 
	 * @param waitFor   Specifies what to wait for; see
	 *                  {@link org.virtualbox_4_2.ProcessWaitForFlag} for more
	 *                  information.
	 * 
	 * 
	 * @param timeoutMS Timeout (in ms) to wait for the operation to complete. Pass
	 *                  0 for an infinite timeout.
	 * 
	 * 
	 * @return The overall wait result; see
	 *         {@link org.virtualbox_4_2.ProcessWaitResult} for more information.
	 * 
	 * 
	 */
	public org.virtualbox_4_2.ProcessWaitResult waitForArray(List<org.virtualbox_4_2.ProcessWaitForFlag> waitFor,
			Long timeoutMS) {
		try {
			org.virtualbox_4_2.jaxws.ProcessWaitResult retVal;
			retVal = port.iProcessWaitForArray(obj, Helper.convertEnums(org.virtualbox_4_2.ProcessWaitForFlag.class,
					org.virtualbox_4_2.jaxws.ProcessWaitForFlag.class, waitFor), timeoutMS);
			return org.virtualbox_4_2.ProcessWaitResult.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Reads data from a running process.
	 * 
	 * @param handle    Handle to read from. Usually 0 is stdin.
	 * 
	 * @param toRead    Number of bytes to read.
	 * 
	 * @param timeoutMS Timeout (in ms) to wait for the operation to complete. Pass
	 *                  0 for an infinite timeout.
	 * 
	 * 
	 * @return Array of data read.
	 * 
	 */
	public byte[] read(Long handle, Long toRead, Long timeoutMS) {
		try {
			/* base64 */String retVal;
			retVal = port.iProcessRead(obj, handle, toRead, timeoutMS);
			return Helper.decodeBase64(retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Writes data to a running process.
	 * 
	 * @param handle    Handle to write to. Usually 0 is stdin, 1 is stdout and 2 is
	 *                  stderr.
	 * 
	 * @param flags     A combination of {@link org.virtualbox_4_2.ProcessInputFlag}
	 *                  flags.
	 * 
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
	public Long write(Long handle, Long flags, byte[] data, Long timeoutMS) {
		try {
			Long retVal;
			retVal = port.iProcessWrite(obj, handle, flags, Helper.encodeBase64(data), timeoutMS);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Writes data to a running process. Scriptable version of
	 * {@link #write(Long,Long,byte[],Long)}.
	 * 
	 * @param handle    Handle to write to. Usually 0 is stdin, 1 is stdout and 2 is
	 *                  stderr.
	 * 
	 * @param flags     A combination of {@link org.virtualbox_4_2.ProcessInputFlag}
	 *                  flags.
	 * 
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
	public Long writeArray(Long handle, List<org.virtualbox_4_2.ProcessInputFlag> flags, byte[] data, Long timeoutMS) {
		try {
			Long retVal;
			retVal = port.iProcessWriteArray(obj, handle,
					Helper.convertEnums(org.virtualbox_4_2.ProcessInputFlag.class,
							org.virtualbox_4_2.jaxws.ProcessInputFlag.class, flags),
					Helper.encodeBase64(data), timeoutMS);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Terminates (kills) a running process.
	 * 
	 */
	public void terminate() {
		try {
			port.iProcessTerminate(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

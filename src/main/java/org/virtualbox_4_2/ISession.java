
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
 * ISession.java
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
 * The ISession interface represents a client process and allows for locking
 * virtual machines (represented by IMachine objects) to prevent conflicting
 * changes to the machine.
 * 
 * Any caller wishing to manipulate a virtual machine needs to create a session
 * object first, which lives in its own process space. Such session objects are
 * then associated with {@link org.virtualbox_4_2.IMachine} objects living in
 * the VirtualBox server process to coordinate such changes.
 * 
 * There are two typical scenarios in which sessions are used:
 * 
 * <ul>
 * <li>To alter machine settings or control a running virtual machine, one needs
 * to lock a machine for a given session (client process) by calling
 * {@link org.virtualbox_4_2.IMachine#lockMachine(org.virtualbox_4_2.ISession,org.virtualbox_4_2.LockType)}.
 * 
 * Whereas multiple sessions may control a running virtual machine, only one
 * process can obtain a write lock on the machine to prevent conflicting
 * changes. A write lock is also needed if a process wants to actually run a
 * virtual machine in its own context, such as the VirtualBox GUI or
 * VBoxHeadless front-ends. They must also lock a machine for their own sessions
 * before they are allowed to power up the virtual machine.
 * 
 * As a result, no machine settings can be altered while another process is
 * already using it, either because that process is modifying machine settings
 * or because the machine is running.</li>
 * <li>To start a VM using one of the existing VirtualBox front-ends (e.g. the
 * VirtualBox GUI or VBoxHeadless), one would use
 * {@link org.virtualbox_4_2.IMachine#launchVMProcess(org.virtualbox_4_2.ISession,String,String)},
 * which also takes a session object as its first parameter. This session then
 * identifies the caller and lets the caller control the started machine (for
 * example, pause machine execution or power it down) as well as be notified
 * about machine execution state changes.</li>
 * </ul>
 * 
 * How sessions objects are created in a client process depends on whether you
 * use the Main API via COM or via the webservice:
 * 
 * <ul>
 * <li>When using the COM API directly, an object of the Session class from the
 * VirtualBox type library needs to be created. In regular COM C++ client code,
 * this can be done by calling <tt>createLocalObject()</tt>, a standard COM API.
 * This object will then act as a local session object in further calls to open
 * a session.</li>
 * <li>In the webservice, the session manager (IWebsessionManager) instead
 * creates a session object automatically whenever
 * {@link org.virtualbox_4_2.IWebsessionManager#logon(String,String)} is called.
 * A managed object reference to that session object can be retrieved by calling
 * {@link org.virtualbox_4_2.IWebsessionManager#getSessionObject(org.virtualbox_4_2.IVirtualBox)}.
 * </li>
 * </ul>
 * Interface ID: <tt>{12F4DCDB-12B2-4EC1-B7CD-DDD9F6C5BF4D}</tt>
 */
public class ISession extends IUnknown {

	public ISession(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * Current state of this session.
	 * 
	 * @return org.virtualbox_4_2.SessionState
	 * 
	 */
	public org.virtualbox_4_2.SessionState getState() {
		try {
			org.virtualbox_4_2.jaxws.SessionState retVal = port.iSessionGetState(obj);
			return org.virtualbox_4_2.SessionState.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Type of this session. The value of this attribute is valid only if the
	 * session currently has a machine locked (i.e. its {@link #getState()} is
	 * Locked), otherwise an error will be returned.
	 * 
	 * @return org.virtualbox_4_2.SessionType
	 * 
	 */
	public org.virtualbox_4_2.SessionType getType() {
		try {
			org.virtualbox_4_2.jaxws.SessionType retVal = port.iSessionGetType(obj);
			return org.virtualbox_4_2.SessionType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Machine object associated with this session.
	 * 
	 * @return org.virtualbox_4_2.IMachine
	 * 
	 */
	public org.virtualbox_4_2.IMachine getMachine() {
		try {
			String retVal = port.iSessionGetMachine(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IMachine(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Console object associated with this session.
	 * 
	 * @return org.virtualbox_4_2.IConsole
	 * 
	 */
	public org.virtualbox_4_2.IConsole getConsole() {
		try {
			String retVal = port.iSessionGetConsole(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IConsole(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static ISession queryInterface(IUnknown obj) {
		return obj == null ? null : new ISession(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Unlocks a machine that was previously locked for the current session.
	 * 
	 * Calling this method is required every time a machine has been locked for a
	 * particular session using the
	 * {@link org.virtualbox_4_2.IMachine#launchVMProcess(org.virtualbox_4_2.ISession,String,String)}
	 * or
	 * {@link org.virtualbox_4_2.IMachine#lockMachine(org.virtualbox_4_2.ISession,org.virtualbox_4_2.LockType)}
	 * calls. Otherwise the state of the machine will be set to
	 * {@link org.virtualbox_4_2.MachineState#Aborted} on the server, and changes
	 * made to the machine settings will be lost.
	 * 
	 * Generally, it is recommended to unlock all machines explicitly before
	 * terminating the application (regardless of the reason for the termination).
	 * 
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>E_UNEXPECTED</td>
	 * <td>Session is not locked.</td>
	 * <tr>
	 * </table>
	 * 
	 * NOTE: Do not expect the session state
	 * ({@link org.virtualbox_4_2.ISession#getState()} to return to "Unlocked"
	 * immediately after you invoke this method, particularly if you have started a
	 * new VM process. The session state will automatically return to "Unlocked"
	 * once the VM is no longer executing, which can of course take a very long
	 * time.
	 * 
	 * 
	 */
	public void unlockMachine() {
		try {
			port.iSessionUnlockMachine(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

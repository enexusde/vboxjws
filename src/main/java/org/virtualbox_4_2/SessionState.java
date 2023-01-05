
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
 * SessionState.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Session state. This enumeration represents possible values of
 * {@link org.virtualbox_4_2.IMachine#getSessionState()} and
 * {@link org.virtualbox_4_2.ISession#getState()} attributes.
 * 
 * Interface ID: <tt>{CF2700C0-EA4B-47AE-9725-7810114B94D8}</tt>
 */
public enum SessionState {

	/**
	 * Null value (never used by the API).
	 */
	Null(0),
	/**
	 * 
	 * In {@link org.virtualbox_4_2.IMachine#getSessionState()}, this means that the
	 * machine is not locked for any sessions.
	 * 
	 * In {@link org.virtualbox_4_2.ISession#getState()}, this means that no machine
	 * is currently locked for this session.
	 * 
	 */
	Unlocked(1),
	/**
	 * 
	 * In {@link org.virtualbox_4_2.IMachine#getSessionState()}, this means that the
	 * machine is currently locked for a session, whose process identifier can then
	 * be found in the {@link org.virtualbox_4_2.IMachine#getSessionPID()}
	 * attribute.
	 * 
	 * In {@link org.virtualbox_4_2.ISession#getState()}, this means that a machine
	 * is currently locked for this session, and the mutable machine object can be
	 * found in the {@link org.virtualbox_4_2.ISession#getMachine()} attribute (see
	 * {@link org.virtualbox_4_2.IMachine#lockMachine(org.virtualbox_4_2.ISession,org.virtualbox_4_2.LockType)}
	 * for details).
	 * 
	 */
	Locked(2),
	/**
	 * 
	 * A new process is being spawned for the machine as a result of
	 * {@link org.virtualbox_4_2.IMachine#launchVMProcess(org.virtualbox_4_2.ISession,String,String)}
	 * call. This state also occurs as a short transient state during an
	 * {@link org.virtualbox_4_2.IMachine#lockMachine(org.virtualbox_4_2.ISession,org.virtualbox_4_2.LockType)}
	 * call.
	 * 
	 */
	Spawning(3),
	/**
	 * 
	 * The session is being unlocked.
	 * 
	 */
	Unlocking(4);

	private final int value;

	SessionState(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static SessionState fromValue(long v) {
		for (SessionState c : SessionState.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static SessionState fromValue(String v) {
		return valueOf(SessionState.class, v);
	}
}

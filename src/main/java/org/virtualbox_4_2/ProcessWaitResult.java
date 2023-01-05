
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
 * ProcessWaitResult.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import java.util.List;

/**
 * 
 * Process waiting results. Depending on the process waiting flags (for more
 * information see {@link org.virtualbox_4_2.ProcessWaitForFlag}) the waiting
 * result can vary based on the processes' current status.
 * 
 * To wait for a gust process to terminate after it has been created by
 * {@link org.virtualbox_4_2.IGuestSession#processCreate(String,List,List,List,Long)}
 * or
 * {@link org.virtualbox_4_2.IGuestSession#processCreateEx(String,List,List,List,Long,org.virtualbox_4_2.ProcessPriority,List)}
 * one would specify ProcessWaitResult_Terminate.
 * 
 * If a guest process has been started with ProcessCreateFlag_WaitForStdOut a
 * client can wait with ProcessWaitResult_StdOut for new data to arrive on
 * stdout; same applies for ProcessCreateFlag_WaitForStdErr and
 * ProcessWaitResult_StdErr.
 * 
 * Interface ID: <tt>{40719CBE-F192-4FE9-A231-6697B3C8E2B4}</tt>
 */
public enum ProcessWaitResult {

	/**
	 * No result was returned. Not being used.
	 */
	None(0),
	/**
	 * The process has been started.
	 */
	Start(1),
	/**
	 * The process has been terminated.
	 */
	Terminate(2),
	/**
	 * 
	 * The process has changed its status. The status then can be retrieved via
	 * {@link org.virtualbox_4_2.IProcess#getStatus()}.
	 * 
	 */
	Status(3),
	/**
	 * Error while executing the process.
	 */
	Error(4),
	/**
	 * 
	 * The waiting operation timed out. This also will happen when no event has been
	 * occured matching the current waiting flags in a
	 * {@link org.virtualbox_4_2.IProcess#waitFor(Long,Long)} call.
	 * 
	 */
	Timeout(5),
	/**
	 * 
	 * The process signalled that stdin became available for writing and that the
	 * process awaits input now.
	 */
	StdIn(6),
	/**
	 * Data on stdout became available for reading.
	 */
	StdOut(7),
	/**
	 * Data on stderr became available for reading.
	 */
	StdErr(8),
	/**
	 * 
	 * A waiting flag specified in the
	 * {@link org.virtualbox_4_2.IProcess#waitFor(Long,Long)} call is not supported
	 * by the guest.
	 * 
	 */
	WaitFlagNotSupported(9);

	private final int value;

	ProcessWaitResult(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static ProcessWaitResult fromValue(long v) {
		for (ProcessWaitResult c : ProcessWaitResult.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static ProcessWaitResult fromValue(String v) {
		return valueOf(ProcessWaitResult.class, v);
	}
}

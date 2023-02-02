
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
 * MachineState.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

/**
 * 
 * Virtual machine execution state.
 * 
 * This enumeration represents possible values of the
 * {@link org.virtualbox_4_2.IMachine#getState()} attribute.
 * 
 * Below is the basic virtual machine state diagram. It shows how the state
 * changes during virtual machine execution. The text in square braces shows a
 * method of the IConsole interface that performs the given state transition.
 * 
 * <pre>
       +---------[powerDown()] <- Stuck <--[failure]-+
       V                                             |
+-> PoweredOff --+-->[powerUp()]--> Starting --+      | +-----[resume()]-----+
|                |                             |      | V                    |
|   Aborted -----+                             +--> Running --[pause()]--> Paused
|                                              |      ^ |                   ^ |
|   Saved -----------[powerUp()]--> Restoring -+      | |                   | |
|     ^                                               | |                   | |
|     |     +-----------------------------------------+-|-------------------+ +
|     |     |                                           |                     |
|     |     +-- Saving <--------[takeSnapshot()]<-------+---------------------+
|     |                                                 |                     |
|     +-------- Saving <--------[saveState()]<----------+---------------------+
|                                                       |                     |
+-------------- Stopping -------[powerDown()]<----------+---------------------+
 * </pre>
 * 
 * Note that states to the right from PoweredOff, Aborted and Saved in the above
 * diagram are called <i>online VM states</i>. These states represent the
 * virtual machine which is being executed in a dedicated process (usually with
 * a GUI window attached to it where you can see the activity of the virtual
 * machine and interact with it). There are two special pseudo-states,
 * FirstOnline and LastOnline, that can be used in relational expressions to
 * detect if the given machine state is online or not:
 * 
 * <pre>
   if (machine.GetState() >= MachineState_FirstOnline &&
       machine.GetState() <= MachineState_LastOnline)
   {
       ...the machine is being executed...
   }
 * </pre>
 * 
 * When the virtual machine is in one of the online VM states (that is, being
 * executed), only a few machine settings can be modified. Methods working with
 * such settings contain an explicit note about that. An attempt to change any
 * other setting or perform a modifying operation during this time will result
 * in the VBOX_E_INVALID_VM_STATE error.
 * 
 * All online states except Running, Paused and Stuck are transitional: they
 * represent temporary conditions of the virtual machine that will last as long
 * as the operation that initiated such a condition.
 * 
 * The Stuck state is a special case. It means that execution of the machine has
 * reached the "Guru Meditation" condition. This condition indicates an internal
 * VMM (virtual machine manager) failure which may happen as a result of either
 * an unhandled low-level virtual hardware exception or one of the recompiler
 * exceptions (such as the <i>too-many-traps</i> condition).
 * 
 * Note also that any online VM state may transit to the Aborted state. This
 * happens if the process that is executing the virtual machine terminates
 * unexpectedly (for example, crashes). Other than that, the Aborted state is
 * equivalent to PoweredOff.
 * 
 * There are also a few additional state diagrams that do not deal with virtual
 * machine execution and therefore are shown separately. The states shown on
 * these diagrams are called <i>offline VM states</i> (this includes PoweredOff,
 * Aborted and Saved too).
 * 
 * The first diagram shows what happens when a lengthy setup operation is being
 * executed (such as
 * {@link org.virtualbox_4_2.IMachine#attachDevice(String,Integer,Integer,org.virtualbox_4_2.DeviceType,org.virtualbox_4_2.IMedium)}).
 * 
 * <pre>
+----------------------------------(same state as before the call)------+
|                                                                       |
+-> PoweredOff --+                                                      |
|                |                                                      |
|-> Aborted -----+-->[lengthy VM configuration call] --> SettingUp -----+
|                |
+-> Saved -------+
 * </pre>
 * 
 * The next two diagrams demonstrate the process of taking a snapshot of a
 * powered off virtual machine, restoring the state to that as of a snapshot or
 * deleting a snapshot, respectively.
 * 
 * <pre>
+----------------------------------(same state as before the call)------+
|                                                                       |
+-> PoweredOff --+                                                      |
|                +-->[takeSnapshot()] -------------------> Saving ------+
+-> Aborted -----+

+-> PoweredOff --+
|                |
|   Aborted -----+-->[restoreSnapshot()    ]-------> RestoringSnapshot -+
|                |   [deleteSnapshot()     ]-------> DeletingSnapshot --+
+-> Saved -------+                                                      |
|                                                                       |
+---(Saved if restored from an online snapshot, PoweredOff otherwise)---+
 * </pre>
 * 
 * Note that the Saving state is present in both the offline state group and
 * online state group. Currently, the only way to determine what group is
 * assumed in a particular case is to remember the previous machine state: if it
 * was Running or Paused, then Saving is an online state, otherwise it is an
 * offline state. This inconsistency may be removed in one of the future
 * versions of VirtualBox by adding a new state.
 * 
 * 
 * Interface ID: <tt>{EC6C6A9E-113D-4FF4-B44F-0B69F21C97FE}</tt>
 */
public enum MachineState {

	/**
	 * Null value (never used by the API).
	 */
	Null(0),
	/**
	 * 
	 * The machine is not running and has no saved execution state; it has either
	 * never been started or been shut down successfully.
	 * 
	 */
	PoweredOff(1),
	/**
	 * 
	 * The machine is not currently running, but the execution state of the machine
	 * has been saved to an external file when it was running, from where it can be
	 * resumed.
	 * 
	 */
	Saved(2),
	/**
	 * 
	 * The machine was teleported to a different host (or process) and then powered
	 * off. Take care when powering it on again may corrupt resources it shares with
	 * the teleportation target (e.g. disk and network).
	 * 
	 */
	Teleported(3),
	/**
	 * 
	 * The process running the machine has terminated abnormally. This may indicate
	 * a crash of the VM process in host execution context, or the VM process has
	 * been terminated externally.
	 * 
	 */
	Aborted(4),
	/**
	 * 
	 * The machine is currently being executed.
	 * 
	 */
	Running(5),
	/**
	 * 
	 * Execution of the machine has been paused.
	 * 
	 */
	Paused(6),
	/**
	 * 
	 * Execution of the machine has reached the "Guru Meditation" condition. This
	 * indicates a severe error in the hypervisor itself.
	 * 
	 */
	Stuck(7),
	/**
	 * 
	 * The machine is about to be teleported to a different host or process. It is
	 * possible to pause a machine in this state, but it will go to the
	 * TeleportingPausedVM state and it will not be possible to resume it again
	 * unless the teleportation fails.
	 * 
	 */
	Teleporting(8),
	/**
	 * 
	 * A live snapshot is being taken. The machine is running normally, but some of
	 * the runtime configuration options are inaccessible. Also, if paused while in
	 * this state it will transition to Saving and it will not be resume the
	 * execution until the snapshot operation has completed.
	 * 
	 */
	LiveSnapshotting(9),
	/**
	 * 
	 * Machine is being started after powering it on from a zero execution state.
	 * 
	 */
	Starting(10),
	/**
	 * 
	 * Machine is being normally stopped powering it off, or after the guest OS has
	 * initiated a shutdown sequence.
	 * 
	 */
	Stopping(11),
	/**
	 * 
	 * Machine is saving its execution state to a file, or an online snapshot of the
	 * machine is being taken.
	 * 
	 */
	Saving(12),
	/**
	 * 
	 * Execution state of the machine is being restored from a file after powering
	 * it on from the saved execution state.
	 * 
	 */
	Restoring(13),
	/**
	 * 
	 * The machine is being teleported to another host or process, but it is not
	 * running. This is the paused variant of the state.
	 * 
	 */
	TeleportingPausedVM(14),
	/**
	 * 
	 * Teleporting the machine state in from another host or process.
	 * 
	 */
	TeleportingIn(15),
	/**
	 * 
	 * The machine is being synced with a fault tolerant VM running elsewhere.
	 * 
	 */
	FaultTolerantSyncing(16),
	/**
	 * 
	 * Like DeletingSnapshot, but the merging of media is ongoing in the background
	 * while the machine is running.
	 * 
	 */
	DeletingSnapshotOnline(17),
	/**
	 * 
	 * Like DeletingSnapshotOnline, but the machine was paused when the merging of
	 * differencing media was started.
	 * 
	 */
	DeletingSnapshotPaused(18),
	/**
	 * 
	 * A machine snapshot is being restored; this typically does not take long.
	 * 
	 */
	RestoringSnapshot(19),
	/**
	 * 
	 * A machine snapshot is being deleted; this can take a long time since this may
	 * require merging differencing media. This value indicates that the machine is
	 * not running while the snapshot is being deleted.
	 * 
	 */
	DeletingSnapshot(20),
	/**
	 * 
	 * Lengthy setup operation is in progress.
	 * 
	 */
	SettingUp(21),
	/**
	 * 
	 * Pseudo-state: first online state (for use in relational expressions).
	 * 
	 */
	FirstOnline(5),
	/**
	 * 
	 * Pseudo-state: last online state (for use in relational expressions).
	 * 
	 */
	LastOnline(18),
	/**
	 * 
	 * Pseudo-state: first transient state (for use in relational expressions).
	 * 
	 */
	FirstTransient(8),
	/**
	 * 
	 * Pseudo-state: last transient state (for use in relational expressions).
	 * 
	 */
	LastTransient(21);

	private final int value;

	MachineState(int v) {
		value = v;
	}

	public int value() {
		return value;
	}

	public static MachineState fromValue(long v) {
		for (MachineState c : MachineState.values()) {
			if (c.value == (int) v) {
				return c;
			}
		}
		throw new IllegalArgumentException(Long.toString(v));
	}

	public static MachineState fromValue(String v) {
		for (MachineState machineState : MachineState.values()) {
			if (machineState.name().equals(v)) {
				return machineState;
			}
		}
		for (MachineState machineState : MachineState.values()) {
			if (machineState.name().equalsIgnoreCase(v)) {
				return machineState;
			}
		}
		return valueOf(MachineState.class, v);
	}
}

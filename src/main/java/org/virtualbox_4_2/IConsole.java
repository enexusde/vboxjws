
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
 * IConsole.java
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
 * The IConsole interface represents an interface to control virtual machine
 * execution.
 * 
 * A console object gets created when a machine has been locked for a particular
 * session (client process) using
 * {@link org.virtualbox_4_2.IMachine#lockMachine(org.virtualbox_4_2.ISession,org.virtualbox_4_2.LockType)}
 * or
 * {@link org.virtualbox_4_2.IMachine#launchVMProcess(org.virtualbox_4_2.ISession,String,String)}.
 * The console object can then be found in the session's
 * {@link org.virtualbox_4_2.ISession#getConsole()} attribute.
 * 
 * Methods of the IConsole interface allow the caller to query the current
 * virtual machine execution state, pause the machine or power it down, save the
 * machine state or take a snapshot, attach and detach removable media and so
 * on.
 * 
 * 
 * @see org.virtualbox_4_2.ISession
 * 
 *      Interface ID: <tt>{DB7AB4CA-2A3F-4183-9243-C1208DA92392}</tt>
 */
public class IConsole extends IUnknown {

	public IConsole(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Machine object for this console session.
	 * 
	 * NOTE: This is a convenience property, it has the same value as
	 * {@link org.virtualbox_4_2.ISession#getMachine()} of the corresponding session
	 * object.
	 * 
	 * 
	 * @return org.virtualbox_4_2.IMachine
	 * 
	 */
	public org.virtualbox_4_2.IMachine getMachine() {
		try {
			String retVal = port.iConsoleGetMachine(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IMachine(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Current execution state of the machine.
	 * 
	 * NOTE: This property always returns the same value as the corresponding
	 * property of the IMachine object for this console session. For the process
	 * that owns (executes) the VM, this is the preferable way of querying the VM
	 * state, because no IPC calls are made.
	 * 
	 * 
	 * @return org.virtualbox_4_2.MachineState
	 * 
	 */
	public org.virtualbox_4_2.MachineState getState() {
		try {
			org.virtualbox_4_2.jaxws.MachineState retVal = port.iConsoleGetState(obj);
			return org.virtualbox_4_2.MachineState.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Guest object.
	 * 
	 * @return org.virtualbox_4_2.IGuest
	 * 
	 */
	public org.virtualbox_4_2.IGuest getGuest() {
		try {
			String retVal = port.iConsoleGetGuest(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IGuest(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Virtual keyboard object.
	 * 
	 * NOTE: If the machine is not running, any attempt to use the returned object
	 * will result in an error.
	 * 
	 * 
	 * @return org.virtualbox_4_2.IKeyboard
	 * 
	 */
	public org.virtualbox_4_2.IKeyboard getKeyboard() {
		try {
			String retVal = port.iConsoleGetKeyboard(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IKeyboard(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Virtual mouse object.
	 * 
	 * NOTE: If the machine is not running, any attempt to use the returned object
	 * will result in an error.
	 * 
	 * 
	 * @return org.virtualbox_4_2.IMouse
	 * 
	 */
	public org.virtualbox_4_2.IMouse getMouse() {
		try {
			String retVal = port.iConsoleGetMouse(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IMouse(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Virtual display object.
	 * 
	 * NOTE: If the machine is not running, any attempt to use the returned object
	 * will result in an error.
	 * 
	 * 
	 * @return org.virtualbox_4_2.IDisplay
	 * 
	 */
	public org.virtualbox_4_2.IDisplay getDisplay() {
		try {
			String retVal = port.iConsoleGetDisplay(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IDisplay(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
	// skip attribute debugger of suppressed type IMachineDebugger

	/**
	 * 
	 * Collection of USB devices currently attached to the virtual USB controller.
	 * 
	 * NOTE: The collection is empty if the machine is not running.
	 * 
	 * 
	 * @return List<org.virtualbox_4_2.IUSBDevice>
	 * 
	 */
	public List<org.virtualbox_4_2.IUSBDevice> getUSBDevices() {
		try {
			List<String> retVal = port.iConsoleGetUSBDevices(obj);
			return Helper.wrap(org.virtualbox_4_2.IUSBDevice.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * List of USB devices currently attached to the remote VRDE client. Once a new
	 * device is physically attached to the remote host computer, it appears in this
	 * list and remains there until detached.
	 * 
	 * @return List<org.virtualbox_4_2.IHostUSBDevice>
	 * 
	 */
	public List<org.virtualbox_4_2.IHostUSBDevice> getRemoteUSBDevices() {
		try {
			List<String> retVal = port.iConsoleGetRemoteUSBDevices(obj);
			return Helper.wrap(org.virtualbox_4_2.IHostUSBDevice.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Collection of shared folders for the current session. These folders are
	 * called transient shared folders because they are available to the guest OS
	 * running inside the associated virtual machine only for the duration of the
	 * session (as opposed to {@link org.virtualbox_4_2.IMachine#getSharedFolders()}
	 * which represent permanent shared folders). When the session is closed (e.g.
	 * the machine is powered down), these folders are automatically discarded.
	 * 
	 * New shared folders are added to the collection using
	 * {@link #createSharedFolder(String,String,Boolean,Boolean)}. Existing shared
	 * folders can be removed using {@link #removeSharedFolder(String)}.
	 * 
	 * @return List<org.virtualbox_4_2.ISharedFolder>
	 * 
	 */
	public List<org.virtualbox_4_2.ISharedFolder> getSharedFolders() {
		try {
			List<org.virtualbox_4_2.jaxws.ISharedFolder> retVal = port.iConsoleGetSharedFolders(obj);
			return Helper.wrap2(org.virtualbox_4_2.ISharedFolder.class, org.virtualbox_4_2.jaxws.ISharedFolder.class,
					port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Interface that provides information on Remote Desktop Extension (VRDE)
	 * connection.
	 * 
	 * @return org.virtualbox_4_2.IVRDEServerInfo
	 * 
	 */
	public org.virtualbox_4_2.IVRDEServerInfo getVRDEServerInfo() {
		try {
			org.virtualbox_4_2.jaxws.IVRDEServerInfo retVal = port.iConsoleGetVRDEServerInfo(obj);
			return (retVal != null) ? new org.virtualbox_4_2.IVRDEServerInfo(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Event source for console events.
	 * 
	 * @return org.virtualbox_4_2.IEventSource
	 * 
	 */
	public org.virtualbox_4_2.IEventSource getEventSource() {
		try {
			String retVal = port.iConsoleGetEventSource(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IEventSource(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Array of PCI devices attached to this machine.
	 * 
	 * @return List<org.virtualbox_4_2.IPCIDeviceAttachment>
	 * 
	 */
	public List<org.virtualbox_4_2.IPCIDeviceAttachment> getAttachedPCIDevices() {
		try {
			List<org.virtualbox_4_2.jaxws.IPCIDeviceAttachment> retVal = port.iConsoleGetAttachedPCIDevices(obj);
			return Helper.wrap2(org.virtualbox_4_2.IPCIDeviceAttachment.class,
					org.virtualbox_4_2.jaxws.IPCIDeviceAttachment.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Whether the guest clipboard should be connected to the host one or whether it
	 * should only be allowed access to the VRDE clipboard. This setting may not
	 * affect existing guest clipboard connections which are already connected to
	 * the host clipboard.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getUseHostClipboard() {
		try {
			Boolean retVal = port.iConsoleGetUseHostClipboard(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Whether the guest clipboard should be connected to the host one or whether it
	 * should only be allowed access to the VRDE clipboard. This setting may not
	 * affect existing guest clipboard connections which are already connected to
	 * the host clipboard.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setUseHostClipboard(Boolean value) {
		try {
			port.iConsoleSetUseHostClipboard(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IConsole queryInterface(IUnknown obj) {
		return obj == null ? null : new IConsole(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Starts the virtual machine execution using the current machine state (that
	 * is, its current execution state, current settings and current storage
	 * devices).
	 * 
	 * 
	 * 
	 * If the machine is powered off or aborted, the execution will start from the
	 * beginning (as if the real hardware were just powered on).
	 * 
	 * If the machine is in the {@link org.virtualbox_4_2.MachineState#Saved} state,
	 * it will continue its execution the point where the state has been saved.
	 * 
	 * If the machine {@link org.virtualbox_4_2.IMachine#getTeleporterEnabled()}
	 * property is enabled on the machine being powered up, the machine will wait
	 * for an incoming teleportation in the
	 * {@link org.virtualbox_4_2.MachineState#TeleportingIn} state. The returned
	 * progress object will have at least three operations where the last three are
	 * defined as: (1) powering up and starting TCP server, (2) waiting for incoming
	 * teleportations, and (3) perform teleportation. These operations will be
	 * reflected as the last three operations of the progress objected returned by
	 * {@link org.virtualbox_4_2.IMachine#launchVMProcess(org.virtualbox_4_2.ISession,String,String)}
	 * as well.
	 * 
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>Virtual machine already running.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_HOST_ERROR VBOX_E_HOST_ERROR</td>
	 *         <td>Host interface does not exist or name not set.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_FILE_ERROR VBOX_E_FILE_ERROR</td>
	 *         <td>Invalid saved state file.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: This method is only useful for front-ends that want to actually
	 *         execute virtual machines in their own process (like the VirtualBox or
	 *         VBoxSDL front-ends). Unless you are intending to write such a
	 *         front-end, do not call this method. If you simply want to start
	 *         virtual machine execution using one of the existing front-ends (for
	 *         example the VirtualBox GUI or headless server), use
	 *         {@link org.virtualbox_4_2.IMachine#launchVMProcess(org.virtualbox_4_2.ISession,String,String)}
	 *         instead; these front-ends will power up the machine automatically for
	 *         you.
	 * 
	 * 
	 * @see #saveState()
	 * 
	 */
	public org.virtualbox_4_2.IProgress powerUp() {
		try {
			String retVal;
			retVal = port.iConsolePowerUp(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Identical to powerUp except that the VM will enter the
	 * {@link org.virtualbox_4_2.MachineState#Paused} state, instead of
	 * {@link org.virtualbox_4_2.MachineState#Running}.
	 * 
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>Virtual machine already running.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_HOST_ERROR VBOX_E_HOST_ERROR</td>
	 *         <td>Host interface does not exist or name not set.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_FILE_ERROR VBOX_E_FILE_ERROR</td>
	 *         <td>Invalid saved state file.</td>
	 *         <tr>
	 *         </table>
	 * 
	 * @see #powerUp()
	 * 
	 */
	public org.virtualbox_4_2.IProgress powerUpPaused() {
		try {
			String retVal;
			retVal = port.iConsolePowerUpPaused(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Initiates the power down procedure to stop the virtual machine execution.
	 * 
	 * The completion of the power down procedure is tracked using the returned
	 * IProgress object. After the operation is complete, the machine will go to the
	 * PoweredOff state.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>Virtual machine must be Running, Paused or Stuck to be powered
	 *         down.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IProgress powerDown() {
		try {
			String retVal;
			retVal = port.iConsolePowerDown(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Resets the virtual machine.
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 * <td>Virtual machine not in Running state.</td>
	 * <tr>
	 * <tr>
	 * <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 * <td>Virtual machine error in reset operation.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public void reset() {
		try {
			port.iConsoleReset(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Pauses the virtual machine execution.
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 * <td>Virtual machine not in Running state.</td>
	 * <tr>
	 * <tr>
	 * <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 * <td>Virtual machine error in suspend operation.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public void pause() {
		try {
			port.iConsolePause(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Resumes the virtual machine execution.
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 * <td>Virtual machine not in Paused state.</td>
	 * <tr>
	 * <tr>
	 * <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 * <td>Virtual machine error in resume operation.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public void resume() {
		try {
			port.iConsoleResume(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Sends the ACPI power button event to the guest.
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 * <td>Virtual machine not in Running state.</td>
	 * <tr>
	 * <tr>
	 * <td>@link ::VBOX_E_PDM_ERROR VBOX_E_PDM_ERROR</td>
	 * <td>Controlled power off failed.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public void powerButton() {
		try {
			port.iConsolePowerButton(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Sends the ACPI sleep button event to the guest.
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 * <td>Virtual machine not in Running state.</td>
	 * <tr>
	 * <tr>
	 * <td>@link ::VBOX_E_PDM_ERROR VBOX_E_PDM_ERROR</td>
	 * <td>Sending sleep button event failed.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public void sleepButton() {
		try {
			port.iConsoleSleepButton(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Checks if the last power button event was handled by guest.
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_PDM_ERROR VBOX_E_PDM_ERROR</td>
	 * <td>Checking if the event was handled by the guest OS failed.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public Boolean getPowerButtonHandled() {
		try {
			Boolean retVal;
			retVal = port.iConsoleGetPowerButtonHandled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Checks if the guest entered the ACPI mode G0 (working) or G1 (sleeping). If
	 * this method returns false, the guest will most likely not respond to external
	 * ACPI events.
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 * <td>Virtual machine not in Running state.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public Boolean getGuestEnteredACPIMode() {
		try {
			Boolean retVal;
			retVal = port.iConsoleGetGuestEnteredACPIMode(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Saves the current execution state of a running virtual machine and stops its
	 * execution.
	 * 
	 * After this operation completes, the machine will go to the Saved state. Next
	 * time it is powered up, this state will be restored and the machine will
	 * continue its execution from the place where it was saved.
	 * 
	 * This operation differs from taking a snapshot to the effect that it doesn't
	 * create new differencing media. Also, once the machine is powered up from the
	 * state saved using this method, the saved state is deleted, so it will be
	 * impossible to return to this state later.
	 * 
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>Virtual machine state neither Running nor Paused.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_FILE_ERROR VBOX_E_FILE_ERROR</td>
	 *         <td>Failed to create directory for saved state file.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: On success, this method implicitly calls
	 *         {@link org.virtualbox_4_2.IMachine#saveSettings()} to save all
	 *         current machine settings (including runtime changes to the DVD
	 *         medium, etc.). Together with the impossibility to change any VM
	 *         settings when it is in the Saved state, this guarantees adequate
	 *         hardware configuration of the machine when it is restored from the
	 *         saved state file.
	 * 
	 * 
	 *         NOTE: The machine must be in the Running or Paused state, otherwise
	 *         the operation will fail.
	 * 
	 * 
	 * @see #takeSnapshot(String,String)
	 * 
	 */
	public org.virtualbox_4_2.IProgress saveState() {
		try {
			String retVal;
			retVal = port.iConsoleSaveState(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Associates the given saved state file to the virtual machine.
	 * 
	 * On success, the machine will go to the Saved state. Next time it is powered
	 * up, it will be restored from the adopted saved state and continue execution
	 * from the place where the saved state file was created.
	 * 
	 * The specified saved state file path may be absolute or relative to the folder
	 * the VM normally saves the state to (usually,
	 * {@link org.virtualbox_4_2.IMachine#getSnapshotFolder()}).
	 * 
	 * 
	 * @param savedStateFile Path to the saved state file to adopt.
	 * 
	 *                       Expected result codes:
	 *                       <table>
	 *                       <tr>
	 *                       <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                       VBOX_E_INVALID_VM_STATE</td>
	 *                       <td>Virtual machine state neither PoweredOff nor
	 *                       Aborted.</td>
	 *                       <tr>
	 *                       </table>
	 * 
	 *                       NOTE: It's a caller's responsibility to make sure the
	 *                       given saved state file is compatible with the settings
	 *                       of this virtual machine that represent its virtual
	 *                       hardware (memory size, storage disk configuration
	 *                       etc.). If there is a mismatch, the behavior of the
	 *                       virtual machine is undefined.
	 * 
	 * 
	 */
	public void adoptSavedState(String savedStateFile) {
		try {
			port.iConsoleAdoptSavedState(obj, savedStateFile);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Forcibly resets the machine to "Powered Off" state if it is currently in the
	 * "Saved" state (previously created by {@link #saveState()}). Next time the
	 * machine is powered up, a clean boot will occur.
	 * 
	 * If fRemoveFile is true, the file in the machine directory into which the
	 * machine state was saved is also deleted. If this is false, then the state can
	 * be recovered and later re-inserted into a machine using
	 * {@link #adoptSavedState(String)}. The location of the file can be found in
	 * the {@link org.virtualbox_4_2.IMachine#getStateFilePath()} attribute.
	 * 
	 * @param fRemoveFile Whether to also remove the saved state file.
	 * 
	 *                    Expected result codes:
	 *                    <table>
	 *                    <tr>
	 *                    <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                    VBOX_E_INVALID_VM_STATE</td>
	 *                    <td>Virtual machine not in state Saved.</td>
	 *                    <tr>
	 *                    </table>
	 * 
	 *                    NOTE: This operation is equivalent to resetting or
	 *                    powering off the machine without doing a proper shutdown
	 *                    of the guest operating system; as with resetting a running
	 *                    phyiscal computer, it can can lead to data loss.
	 * 
	 * 
	 */
	public void discardSavedState(Boolean fRemoveFile) {
		try {
			port.iConsoleDiscardSavedState(obj, fRemoveFile);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Gets the current activity type of a given device or device group.
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>E_INVALIDARG</td>
	 * <td>Invalid device type.</td>
	 * <tr>
	 * </table>
	 * 
	 */
	public org.virtualbox_4_2.DeviceActivity getDeviceActivity(org.virtualbox_4_2.DeviceType type) {
		try {
			org.virtualbox_4_2.jaxws.DeviceActivity retVal;
			retVal = port.iConsoleGetDeviceActivity(obj, org.virtualbox_4_2.jaxws.DeviceType.fromValue(type.name()));
			return org.virtualbox_4_2.DeviceActivity.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Attaches a host USB device with the given UUID to the USB controller of the
	 * virtual machine.
	 * 
	 * The device needs to be in one of the following states:
	 * {@link org.virtualbox_4_2.USBDeviceState#Busy},
	 * {@link org.virtualbox_4_2.USBDeviceState#Available} or
	 * {@link org.virtualbox_4_2.USBDeviceState#Held}, otherwise an error is
	 * immediately returned.
	 * 
	 * When the device state is {@link org.virtualbox_4_2.USBDeviceState#Busy}, an
	 * error may also be returned if the host computer refuses to release it for
	 * some reason.
	 * 
	 * 
	 * @param id UUID of the host USB device to attach.
	 * 
	 *           Expected result codes:
	 *           <table>
	 *           <tr>
	 *           <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *           <td>Virtual machine state neither Running nor Paused.</td>
	 *           <tr>
	 *           <tr>
	 *           <td>@link ::VBOX_E_PDM_ERROR VBOX_E_PDM_ERROR</td>
	 *           <td>Virtual machine does not have a USB controller.</td>
	 *           <tr>
	 *           </table>
	 * 
	 * @see org.virtualbox_4_2.IUSBController#getDeviceFilters()
	 * @see org.virtualbox_4_2.USBDeviceState
	 * 
	 */
	public void attachUSBDevice(String id) {
		try {
			port.iConsoleAttachUSBDevice(obj, id);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Detaches an USB device with the given UUID from the USB controller of the
	 * virtual machine.
	 * 
	 * After this method succeeds, the VirtualBox server re-initiates all USB
	 * filters as if the device were just physically attached to the host, but
	 * filters of this machine are ignored to avoid a possible automatic
	 * re-attachment.
	 * 
	 * 
	 * @param id UUID of the USB device to detach.
	 * 
	 * @return Detached USB device.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_PDM_ERROR VBOX_E_PDM_ERROR</td>
	 *         <td>Virtual machine does not have a USB controller.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>E_INVALIDARG</td>
	 *         <td>USB device not attached to this virtual machine.</td>
	 *         <tr>
	 *         </table>
	 * 
	 * @see org.virtualbox_4_2.IUSBController#getDeviceFilters()
	 * @see org.virtualbox_4_2.USBDeviceState
	 * 
	 */
	public org.virtualbox_4_2.IUSBDevice detachUSBDevice(String id) {
		try {
			String retVal;
			retVal = port.iConsoleDetachUSBDevice(obj, id);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IUSBDevice(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Searches for a USB device with the given host address.
	 * 
	 * 
	 * @param name Address of the USB device (as assigned by the host) to search
	 *             for.
	 * 
	 * 
	 * @return Found USB device object.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>Given name does not correspond to any USB device.</td>
	 *         <tr>
	 *         </table>
	 * 
	 * @see org.virtualbox_4_2.IUSBDevice#getAddress()
	 * 
	 */
	public org.virtualbox_4_2.IUSBDevice findUSBDeviceByAddress(String name) {
		try {
			String retVal;
			retVal = port.iConsoleFindUSBDeviceByAddress(obj, name);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IUSBDevice(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Searches for a USB device with the given UUID.
	 * 
	 * 
	 * @param id UUID of the USB device to search for.
	 * 
	 * @return Found USB device object.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>Given id does not correspond to any USB device.</td>
	 *         <tr>
	 *         </table>
	 * 
	 * @see org.virtualbox_4_2.IUSBDevice#getId()
	 * 
	 */
	public org.virtualbox_4_2.IUSBDevice findUSBDeviceById(String id) {
		try {
			String retVal;
			retVal = port.iConsoleFindUSBDeviceById(obj, id);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IUSBDevice(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Creates a transient new shared folder by associating the given logical name
	 * with the given host path, adds it to the collection of shared folders and
	 * starts sharing it. Refer to the description of
	 * {@link org.virtualbox_4_2.ISharedFolder} to read more about logical names.
	 * 
	 * 
	 * @param name      Unique logical name of the shared folder.
	 * 
	 * @param hostPath  Full path to the shared folder in the host file system.
	 * 
	 * @param writable  Whether the share is writable or readonly
	 * 
	 * @param automount Whether the share gets automatically mounted by the guest or
	 *                  not.
	 * 
	 *                  Expected result codes:
	 *                  <table>
	 *                  <tr>
	 *                  <td>@link ::VBOX_E_INVALID_VM_STATE
	 *                  VBOX_E_INVALID_VM_STATE</td>
	 *                  <td>Virtual machine in Saved state or currently changing
	 *                  state.</td>
	 *                  <tr>
	 *                  <tr>
	 *                  <td>@link ::VBOX_E_FILE_ERROR VBOX_E_FILE_ERROR</td>
	 *                  <td>Shared folder already exists or not accessible.</td>
	 *                  <tr>
	 *                  </table>
	 * 
	 */
	public void createSharedFolder(String name, String hostPath, Boolean writable, Boolean automount) {
		try {
			port.iConsoleCreateSharedFolder(obj, name, hostPath, writable, automount);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Removes a transient shared folder with the given name previously created by
	 * {@link #createSharedFolder(String,String,Boolean,Boolean)} from the
	 * collection of shared folders and stops sharing it.
	 * 
	 * @param name Logical name of the shared folder to remove.
	 * 
	 *             Expected result codes:
	 *             <table>
	 *             <tr>
	 *             <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *             <td>Virtual machine in Saved state or currently changing state.
	 *             </td>
	 *             <tr>
	 *             <tr>
	 *             <td>@link ::VBOX_E_FILE_ERROR VBOX_E_FILE_ERROR</td>
	 *             <td>Shared folder does not exists.</td>
	 *             <tr>
	 *             </table>
	 * 
	 */
	public void removeSharedFolder(String name) {
		try {
			port.iConsoleRemoveSharedFolder(obj, name);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Saves the current execution state and all settings of the machine and creates
	 * differencing images for all normal (non-independent) media. See
	 * {@link org.virtualbox_4_2.ISnapshot} for an introduction to snapshots.
	 * 
	 * This method can be called for a PoweredOff, Saved (see {@link #saveState()}),
	 * Running or Paused virtual machine. When the machine is PoweredOff, an offline
	 * snapshot is created. When the machine is Running a live snapshot is created,
	 * and an online snapshot is created when Paused.
	 * 
	 * The taken snapshot is always based on the
	 * {@link org.virtualbox_4_2.IMachine#getCurrentSnapshot()} of the associated
	 * virtual machine and becomes a new current snapshot.
	 * 
	 * 
	 * @param name        Short name for the snapshot.
	 * 
	 * @param description Optional description of the snapshot.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>Virtual machine currently changing state.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: This method implicitly calls
	 *         {@link org.virtualbox_4_2.IMachine#saveSettings()} to save all
	 *         current machine settings before taking an offline snapshot.
	 * 
	 * 
	 */
	public org.virtualbox_4_2.IProgress takeSnapshot(String name, String description) {
		try {
			String retVal;
			retVal = port.iConsoleTakeSnapshot(obj, name, description);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Starts deleting the specified snapshot asynchronously. See
	 * {@link org.virtualbox_4_2.ISnapshot} for an introduction to snapshots.
	 * 
	 * The execution state and settings of the associated machine stored in the
	 * snapshot will be deleted. The contents of all differencing media of this
	 * snapshot will be merged with the contents of their dependent child media to
	 * keep the medium chain valid (in other words, all changes represented by media
	 * being deleted will be propagated to their child medium). After that, this
	 * snapshot's differencing medium will be deleted. The parent of this snapshot
	 * will become a new parent for all its child snapshots.
	 * 
	 * If the deleted snapshot is the current one, its parent snapshot will become a
	 * new current snapshot. The current machine state is not directly affected in
	 * this case, except that currently attached differencing media based on media
	 * of the deleted snapshot will be also merged as described above.
	 * 
	 * If the deleted snapshot is the first or current snapshot, then the respective
	 * IMachine attributes will be adjusted. Deleting the current snapshot will also
	 * implicitly call {@link org.virtualbox_4_2.IMachine#saveSettings()} to make
	 * all current machine settings permanent.
	 * 
	 * Deleting a snapshot has the following preconditions:
	 * 
	 * <ul>
	 * <li>Child media of all normal media of the deleted snapshot must be
	 * accessible (see {@link org.virtualbox_4_2.IMedium#getState()}) for this
	 * operation to succeed. If only one running VM refers to all images which
	 * participates in merging the operation can be performed while the VM is
	 * running. Otherwise all virtual machines whose media are directly or
	 * indirectly based on the media of deleted snapshot must be powered off. In any
	 * case, online snapshot deleting usually is slower than the same operation
	 * without any running VM.</li>
	 * <li>You cannot delete the snapshot if a medium attached to it has more than
	 * one child medium (differencing images) because otherwise merging would be
	 * impossible. This might be the case if there is more than one child snapshot
	 * or differencing images were created for other reason (e.g. implicitly because
	 * of multiple machine attachments).</li>
	 * </ul>
	 * 
	 * The virtual machine's {@link org.virtualbox_4_2.IMachine#getState()} is
	 * changed to "DeletingSnapshot", "DeletingSnapshotOnline" or
	 * "DeletingSnapshotPaused" while this operation is in progress.
	 * 
	 * 
	 * @param id UUID of the snapshot to delete.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>The running virtual machine prevents deleting this snapshot. This
	 *         happens only in very specific situations, usually snapshots can be
	 *         deleted without trouble while a VM is running. The error message text
	 *         explains the reason for the failure.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: Merging medium contents can be very time and disk space
	 *         consuming, if these media are big in size and have many children.
	 *         However, if the snapshot being deleted is the last (head) snapshot on
	 *         the branch, the operation will be rather quick.
	 * 
	 * 
	 */
	public org.virtualbox_4_2.IProgress deleteSnapshot(String id) {
		try {
			String retVal;
			retVal = port.iConsoleDeleteSnapshot(obj, id);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Starts deleting the specified snapshot and all its children asynchronously.
	 * See {@link org.virtualbox_4_2.ISnapshot} for an introduction to snapshots.
	 * The conditions and many details are the same as with
	 * {@link #deleteSnapshot(String)}.
	 * 
	 * This operation is very fast if the snapshot subtree does not include the
	 * current state. It is still significantly faster than deleting the snapshots
	 * one by one if the current state is in the subtree and there are more than one
	 * snapshots from current state to the snapshot which marks the subtree, since
	 * it eliminates the incremental image merging.
	 * 
	 * 
	 * @param id UUID of the snapshot to delete, including all its children.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>The running virtual machine prevents deleting this snapshot. This
	 *         happens only in very specific situations, usually snapshots can be
	 *         deleted without trouble while a VM is running. The error message text
	 *         explains the reason for the failure.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>E_NOTIMPL</td>
	 *         <td>The method is not implemented yet.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: This API method is right now not implemented!
	 * 
	 */
	public org.virtualbox_4_2.IProgress deleteSnapshotAndAllChildren(String id) {
		try {
			String retVal;
			retVal = port.iConsoleDeleteSnapshotAndAllChildren(obj, id);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Starts deleting the specified snapshot range. This is limited to linear
	 * snapshot lists, which means there may not be any other child snapshots other
	 * than the direct sequence between the start and end snapshot. If the start and
	 * end snapshot point to the same snapshot this method is completely equivalent
	 * to {@link #deleteSnapshot(String)}. See {@link org.virtualbox_4_2.ISnapshot}
	 * for an introduction to snapshots. The conditions and many details are the
	 * same as with {@link #deleteSnapshot(String)}.
	 * 
	 * This operation is generally faster than deleting snapshots one by one and
	 * often also needs less extra disk space before freeing up disk space by
	 * deleting the removed disk images corresponding to the snapshot.
	 * 
	 * 
	 * @param startId UUID of the first snapshot to delete.
	 * 
	 * @param endId   UUID of the last snapshot to delete.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>The running virtual machine prevents deleting this snapshot. This
	 *         happens only in very specific situations, usually snapshots can be
	 *         deleted without trouble while a VM is running. The error message text
	 *         explains the reason for the failure.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>E_NOTIMPL</td>
	 *         <td>The method is not implemented yet.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: This API method is right now not implemented!
	 * 
	 */
	public org.virtualbox_4_2.IProgress deleteSnapshotRange(String startId, String endId) {
		try {
			String retVal;
			retVal = port.iConsoleDeleteSnapshotRange(obj, startId, endId);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Starts resetting the machine's current state to the state contained in the
	 * given snapshot, asynchronously. All current settings of the machine will be
	 * reset and changes stored in differencing media will be lost. See
	 * {@link org.virtualbox_4_2.ISnapshot} for an introduction to snapshots.
	 * 
	 * After this operation is successfully completed, new empty differencing media
	 * are created for all normal media of the machine.
	 * 
	 * If the given snapshot is an online snapshot, the machine will go to the
	 * {@link org.virtualbox_4_2.MachineState#Saved}, so that the next time it is
	 * powered on, the execution state will be restored from the state of the
	 * snapshot.
	 * 
	 * 
	 * @param snapshot The snapshot to restore the VM state from.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>Virtual machine is running.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: The machine must not be running, otherwise the operation will
	 *         fail.
	 * 
	 * 
	 *         NOTE: If the machine state is
	 *         {@link org.virtualbox_4_2.MachineState#Saved} prior to this
	 *         operation, the saved state file will be implicitly deleted (as if
	 *         {@link org.virtualbox_4_2.IConsole#discardSavedState(Boolean)} were
	 *         called).
	 * 
	 * 
	 */
	public org.virtualbox_4_2.IProgress restoreSnapshot(org.virtualbox_4_2.ISnapshot snapshot) {
		try {
			String retVal;
			retVal = port.iConsoleRestoreSnapshot(obj, ((snapshot == null) ? null : snapshot.getWrapped()));
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Teleport the VM to a different host machine or process.
	 * 
	 * TODO explain the details.
	 * 
	 * 
	 * @param hostname    The name or IP of the host to teleport to.
	 * 
	 * @param tcpport     The TCP port to connect to (1..65535).
	 * 
	 * @param password    The password.
	 * 
	 * @param maxDowntime The maximum allowed downtime given as milliseconds. 0 is
	 *                    not a valid value. Recommended value: 250 ms.
	 * 
	 *                    The higher the value is, the greater the chance for a
	 *                    successful teleportation. A small value may easily result
	 *                    in the teleportation process taking hours and eventually
	 *                    fail.
	 * 
	 * 
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_INVALID_VM_STATE VBOX_E_INVALID_VM_STATE</td>
	 *         <td>Virtual machine not running or paused.</td>
	 *         <tr>
	 *         </table>
	 * 
	 *         NOTE: The current implementation treats this a guideline, not as an
	 *         absolute rule.
	 * 
	 * 
	 */
	public org.virtualbox_4_2.IProgress teleport(String hostname, Long tcpport, String password, Long maxDowntime) {
		try {
			String retVal;
			retVal = port.iConsoleTeleport(obj, hostname, tcpport, password, maxDowntime);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

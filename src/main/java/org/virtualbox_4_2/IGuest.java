
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
 * IGuest.java
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
 * The IGuest interface represents information about the operating system
 * running inside the virtual machine. Used in
 * {@link org.virtualbox_4_2.IConsole#getGuest()}.
 * 
 * IGuest provides information about the guest operating system, whether Guest
 * Additions are installed and other OS-specific virtual machine properties.
 * 
 * Interface ID: <tt>{19C32350-0618-4EDE-B0C3-2B4311BF0D9B}</tt>
 */
public class IGuest extends IUnknown {

	public IGuest(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Identifier of the Guest OS type as reported by the Guest Additions. You may
	 * use {@link org.virtualbox_4_2.IVirtualBox#getGuestOSType(String)} to obtain
	 * an IGuestOSType object representing details about the given Guest OS type.
	 * 
	 * NOTE: If Guest Additions are not installed, this value will be the same as
	 * {@link org.virtualbox_4_2.IMachine#getOSTypeId()}.
	 * 
	 * 
	 * @return String
	 * 
	 */
	public String getOSTypeId() {
		try {
			String retVal = port.iGuestGetOSTypeId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Current run level of the Guest Additions.
	 * 
	 * @return org.virtualbox_4_2.AdditionsRunLevelType
	 * 
	 */
	public org.virtualbox_4_2.AdditionsRunLevelType getAdditionsRunLevel() {
		try {
			org.virtualbox_4_2.jaxws.AdditionsRunLevelType retVal = port.iGuestGetAdditionsRunLevel(obj);
			return org.virtualbox_4_2.AdditionsRunLevelType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Version of the Guest Additions in the same format as
	 * {@link org.virtualbox_4_2.IVirtualBox#getVersion()}.
	 * 
	 * @return String
	 * 
	 */
	public String getAdditionsVersion() {
		try {
			String retVal = port.iGuestGetAdditionsVersion(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The internal build revision number of the additions.
	 * 
	 * See also {@link org.virtualbox_4_2.IVirtualBox#getRevision()}.
	 * 
	 * @return Long
	 * 
	 */
	public Long getAdditionsRevision() {
		try {
			Long retVal = port.iGuestGetAdditionsRevision(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Array of current known facilities. Only returns facilities where a status is
	 * known, e.g. facilities with an unknown status will not be returned.
	 * 
	 * @return List<org.virtualbox_4_2.IAdditionsFacility>
	 * 
	 */
	public List<org.virtualbox_4_2.IAdditionsFacility> getFacilities() {
		try {
			List<org.virtualbox_4_2.jaxws.IAdditionsFacility> retVal = port.iGuestGetFacilities(obj);
			return Helper.wrap2(org.virtualbox_4_2.IAdditionsFacility.class,
					org.virtualbox_4_2.jaxws.IAdditionsFacility.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Returns a collection of all opened guest sessions.
	 * 
	 * @return List<org.virtualbox_4_2.IGuestSession>
	 * 
	 */
	public List<org.virtualbox_4_2.IGuestSession> getSessions() {
		try {
			List<String> retVal = port.iGuestGetSessions(obj);
			return Helper.wrap(org.virtualbox_4_2.IGuestSession.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Guest system memory balloon size in megabytes (transient property).
	 * 
	 * @return Long
	 * 
	 */
	public Long getMemoryBalloonSize() {
		try {
			Long retVal = port.iGuestGetMemoryBalloonSize(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Guest system memory balloon size in megabytes (transient property).
	 * 
	 * @param value Long
	 * 
	 */
	public void setMemoryBalloonSize(Long value) {
		try {
			port.iGuestSetMemoryBalloonSize(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Interval to update guest statistics in seconds.
	 * 
	 * @return Long
	 * 
	 */
	public Long getStatisticsUpdateInterval() {
		try {
			Long retVal = port.iGuestGetStatisticsUpdateInterval(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Interval to update guest statistics in seconds.
	 * 
	 * @param value Long
	 * 
	 */
	public void setStatisticsUpdateInterval(Long value) {
		try {
			port.iGuestSetStatisticsUpdateInterval(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IGuest queryInterface(IUnknown obj) {
		return obj == null ? null : new IGuest(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Internal method; do not use as it might change at any time.
	 * 
	 * @param cpuUser         Percentage of processor time spent in user mode as
	 *                        seen by the guest.
	 * 
	 * @param cpuKernel       Percentage of processor time spent in kernel mode as
	 *                        seen by the guest.
	 * 
	 * @param cpuIdle         Percentage of processor time spent idling as seen by
	 *                        the guest.
	 * 
	 * @param memTotal        Total amount of physical guest RAM.
	 * 
	 * @param memFree         Free amount of physical guest RAM.
	 * 
	 * @param memBalloon      Amount of ballooned physical guest RAM.
	 * 
	 * @param memShared       Amount of shared physical guest RAM.
	 * 
	 * @param memCache        Total amount of guest (disk) cache memory.
	 * 
	 * @param pagedTotal      Total amount of space in the page file.
	 * 
	 * @param memAllocTotal   Total amount of memory allocated by the hypervisor.
	 * 
	 * @param memFreeTotal    Total amount of free memory available in the
	 *                        hypervisor.
	 * 
	 * @param memBalloonTotal Total amount of memory ballooned by the hypervisor.
	 * 
	 * @param memSharedTotal  Total amount of shared memory in the hypervisor.
	 * 
	 */
	public void internalGetStatistics(Holder<Long> cpuUser, Holder<Long> cpuKernel, Holder<Long> cpuIdle,
			Holder<Long> memTotal, Holder<Long> memFree, Holder<Long> memBalloon, Holder<Long> memShared,
			Holder<Long> memCache, Holder<Long> pagedTotal, Holder<Long> memAllocTotal, Holder<Long> memFreeTotal,
			Holder<Long> memBalloonTotal, Holder<Long> memSharedTotal) {
		try {
			javax.xml.ws.Holder<Long> tmp_cpuUser = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_cpuKernel = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_cpuIdle = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_memTotal = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_memFree = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_memBalloon = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_memShared = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_memCache = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_pagedTotal = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_memAllocTotal = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_memFreeTotal = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_memBalloonTotal = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<Long> tmp_memSharedTotal = new javax.xml.ws.Holder<Long>();
			port.iGuestInternalGetStatistics(obj, tmp_cpuUser, tmp_cpuKernel, tmp_cpuIdle, tmp_memTotal, tmp_memFree,
					tmp_memBalloon, tmp_memShared, tmp_memCache, tmp_pagedTotal, tmp_memAllocTotal, tmp_memFreeTotal,
					tmp_memBalloonTotal, tmp_memSharedTotal);
			cpuUser.value = tmp_cpuUser.value;
			cpuKernel.value = tmp_cpuKernel.value;
			cpuIdle.value = tmp_cpuIdle.value;
			memTotal.value = tmp_memTotal.value;
			memFree.value = tmp_memFree.value;
			memBalloon.value = tmp_memBalloon.value;
			memShared.value = tmp_memShared.value;
			memCache.value = tmp_memCache.value;
			pagedTotal.value = tmp_pagedTotal.value;
			memAllocTotal.value = tmp_memAllocTotal.value;
			memFreeTotal.value = tmp_memFreeTotal.value;
			memBalloonTotal.value = tmp_memBalloonTotal.value;
			memSharedTotal.value = tmp_memSharedTotal.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Get the current status of a Guest Additions facility.
	 * 
	 * @param facility  Facility to check status for.
	 * 
	 * @param timestamp Timestamp (in ms) of last status update seen by the host.
	 * 
	 * @return The current (latest) facility status.
	 * 
	 */
	public org.virtualbox_4_2.AdditionsFacilityStatus getFacilityStatus(
			org.virtualbox_4_2.AdditionsFacilityType facility, Holder<Long> timestamp) {
		try {
			javax.xml.ws.Holder<Long> tmp_timestamp = new javax.xml.ws.Holder<Long>();
			javax.xml.ws.Holder<org.virtualbox_4_2.jaxws.AdditionsFacilityStatus> retVal = new javax.xml.ws.Holder<org.virtualbox_4_2.jaxws.AdditionsFacilityStatus>();
			port.iGuestGetFacilityStatus(obj, org.virtualbox_4_2.jaxws.AdditionsFacilityType.fromValue(facility.name()),
					tmp_timestamp, retVal);
			timestamp.value = tmp_timestamp.value;
			return org.virtualbox_4_2.AdditionsFacilityStatus.fromValue(retVal.value.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Retrieve the current status of a certain Guest Additions run level.
	 * 
	 * 
	 * @param level Status level to check
	 * 
	 * @return Flag whether the status level has been reached or not
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_NOT_SUPPORTED VBOX_E_NOT_SUPPORTED</td>
	 *         <td>Wrong status level specified.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public Boolean getAdditionsStatus(org.virtualbox_4_2.AdditionsRunLevelType level) {
		try {
			Boolean retVal;
			retVal = port.iGuestGetAdditionsStatus(obj,
					org.virtualbox_4_2.jaxws.AdditionsRunLevelType.fromValue(level.name()));
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Store login credentials that can be queried by guest operating systems with
	 * Additions installed. The credentials are transient to the session and the
	 * guest may also choose to erase them. Note that the caller cannot determine
	 * whether the guest operating system has queried or made use of the
	 * credentials.
	 * 
	 * 
	 * @param userName              User name string, can be empty
	 * 
	 * @param password              Password string, can be empty
	 * 
	 * @param domain                Domain name (guest logon scheme specific), can
	 *                              be empty
	 * 
	 * @param allowInteractiveLogon Flag whether the guest should alternatively
	 *                              allow the user to interactively specify
	 *                              different credentials. This flag might not be
	 *                              supported by all versions of the Additions.
	 * 
	 * 
	 *                              Expected result codes:
	 *                              <table>
	 *                              <tr>
	 *                              <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 *                              <td>VMM device is not available.</td>
	 *                              <tr>
	 *                              </table>
	 * 
	 */
	public void setCredentials(String userName, String password, String domain, Boolean allowInteractiveLogon) {
		try {
			port.iGuestSetCredentials(obj, userName, password, domain, allowInteractiveLogon);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Informs the guest about a Drag and Drop enter event.
	 * 
	 * This is used in Host - Guest direction.
	 * 
	 * 
	 * @param screenId       The screen id where the Drag and Drop event occured.
	 * 
	 * @param y              y-position of the event.
	 * 
	 * @param x              x-position of the event.
	 * 
	 * @param defaultAction  The default action to use.
	 * 
	 * @param allowedActions The actions which are allowed.
	 * 
	 * @param formats        The supported mime types.
	 * 
	 * @return The resulting action of this event.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 *         <td>VMM device is not available.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.DragAndDropAction dragHGEnter(Long screenId, Long y, Long x,
			org.virtualbox_4_2.DragAndDropAction defaultAction,
			List<org.virtualbox_4_2.DragAndDropAction> allowedActions, List<String> formats) {
		try {
			org.virtualbox_4_2.jaxws.DragAndDropAction retVal;
			retVal = port.iGuestDragHGEnter(obj, screenId, y, x,
					org.virtualbox_4_2.jaxws.DragAndDropAction.fromValue(defaultAction.name()),
					Helper.convertEnums(org.virtualbox_4_2.DragAndDropAction.class,
							org.virtualbox_4_2.jaxws.DragAndDropAction.class, allowedActions),
					formats);
			return org.virtualbox_4_2.DragAndDropAction.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Informs the guest about a Drag and Drop move event.
	 * 
	 * This is used in Host - Guest direction.
	 * 
	 * 
	 * @param screenId       The screen id where the Drag and Drop event occured.
	 * 
	 * @param x              x-position of the event.
	 * 
	 * @param y              y-position of the event.
	 * 
	 * @param defaultAction  The default action to use.
	 * 
	 * @param allowedActions The actions which are allowed.
	 * 
	 * @param formats        The supported mime types.
	 * 
	 * @return The resulting action of this event.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 *         <td>VMM device is not available.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.DragAndDropAction dragHGMove(Long screenId, Long x, Long y,
			org.virtualbox_4_2.DragAndDropAction defaultAction,
			List<org.virtualbox_4_2.DragAndDropAction> allowedActions, List<String> formats) {
		try {
			org.virtualbox_4_2.jaxws.DragAndDropAction retVal;
			retVal = port.iGuestDragHGMove(obj, screenId, x, y,
					org.virtualbox_4_2.jaxws.DragAndDropAction.fromValue(defaultAction.name()),
					Helper.convertEnums(org.virtualbox_4_2.DragAndDropAction.class,
							org.virtualbox_4_2.jaxws.DragAndDropAction.class, allowedActions),
					formats);
			return org.virtualbox_4_2.DragAndDropAction.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Informs the guest about a Drag and Drop leave event.
	 * 
	 * This is used in Host - Guest direction.
	 * 
	 * 
	 * @param screenId The screen id where the Drag and Drop event occured.
	 * 
	 *                 Expected result codes:
	 *                 <table>
	 *                 <tr>
	 *                 <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 *                 <td>VMM device is not available.</td>
	 *                 <tr>
	 *                 </table>
	 * 
	 */
	public void dragHGLeave(Long screenId) {
		try {
			port.iGuestDragHGLeave(obj, screenId);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Informs the guest about a drop event.
	 * 
	 * This is used in Host - Guest direction.
	 * 
	 * 
	 * @param screenId       The screen id where the Drag and Drop event occured.
	 * 
	 * @param x              x-position of the event.
	 * 
	 * @param y              y-position of the event.
	 * 
	 * @param defaultAction  The default action to use.
	 * 
	 * @param allowedActions The actions which are allowed.
	 * 
	 * @param formats        The supported mime types.
	 * 
	 * @param format         The resulting format of this event.
	 * 
	 * @return The resulting action of this event.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 *         <td>VMM device is not available.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.DragAndDropAction dragHGDrop(Long screenId, Long x, Long y,
			org.virtualbox_4_2.DragAndDropAction defaultAction,
			List<org.virtualbox_4_2.DragAndDropAction> allowedActions, List<String> formats, Holder<String> format) {
		try {
			javax.xml.ws.Holder<String> tmp_format = new javax.xml.ws.Holder<String>();
			javax.xml.ws.Holder<org.virtualbox_4_2.jaxws.DragAndDropAction> retVal = new javax.xml.ws.Holder<org.virtualbox_4_2.jaxws.DragAndDropAction>();
			port.iGuestDragHGDrop(obj, screenId, x, y,
					org.virtualbox_4_2.jaxws.DragAndDropAction.fromValue(defaultAction.name()),
					Helper.convertEnums(org.virtualbox_4_2.DragAndDropAction.class,
							org.virtualbox_4_2.jaxws.DragAndDropAction.class, allowedActions),
					formats, tmp_format, retVal);
			format.value = tmp_format.value;
			return org.virtualbox_4_2.DragAndDropAction.fromValue(retVal.value.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Informs the guest about a drop data event.
	 * 
	 * This is used in Host - Guest direction.
	 * 
	 * 
	 * @param screenId The screen id where the Drag and Drop event occured.
	 * 
	 * @param format   The mime type the data is in.
	 * 
	 * @param data     The actual data.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 *         <td>VMM device is not available.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IProgress dragHGPutData(Long screenId, String format, byte[] data) {
		try {
			String retVal;
			retVal = port.iGuestDragHGPutData(obj, screenId, format, Helper.encodeBase64(data));
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Ask the guest if there is any Drag and Drop operation pending in the guest.
	 * 
	 * If no Drag and Drop operation is pending currently, Ignore is returned.
	 * 
	 * This is used in Guest - Host direction.
	 * 
	 * 
	 * @param screenId       The screen id where the Drag and Drop event occured.
	 * 
	 * @param format         On return the supported mime types.
	 * 
	 * @param allowedActions On return the actions which are allowed.
	 * 
	 * @return On return the default action to use.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 *         <td>VMM device is not available.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.DragAndDropAction dragGHPending(Long screenId, Holder<List<String>> format,
			Holder<List<org.virtualbox_4_2.DragAndDropAction>> allowedActions) {
		try {
			javax.xml.ws.Holder<List<String>> tmp_format = new javax.xml.ws.Holder<List<String>>();
			javax.xml.ws.Holder<List<org.virtualbox_4_2.jaxws.DragAndDropAction>> tmp_allowedActions = new javax.xml.ws.Holder<List<org.virtualbox_4_2.jaxws.DragAndDropAction>>();
			javax.xml.ws.Holder<org.virtualbox_4_2.jaxws.DragAndDropAction> retVal = new javax.xml.ws.Holder<org.virtualbox_4_2.jaxws.DragAndDropAction>();
			port.iGuestDragGHPending(obj, screenId, tmp_format, tmp_allowedActions, retVal);
			format.value = tmp_format.value;
			allowedActions.value = Helper.convertEnums(org.virtualbox_4_2.jaxws.DragAndDropAction.class,
					org.virtualbox_4_2.DragAndDropAction.class, tmp_allowedActions.value);
			return org.virtualbox_4_2.DragAndDropAction.fromValue(retVal.value.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Informs the guest that a drop event occured for a pending Drag and Drop
	 * event.
	 * 
	 * This is used in Guest - Host direction.
	 * 
	 * 
	 * @param format The mime type the data must be in.
	 * 
	 * @param action The action to use.
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 *         <td>VMM device is not available.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IProgress dragGHDropped(String format, org.virtualbox_4_2.DragAndDropAction action) {
		try {
			String retVal;
			retVal = port.iGuestDragGHDropped(obj, format,
					org.virtualbox_4_2.jaxws.DragAndDropAction.fromValue(action.name()));
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Fetch the data of a previously Drag and Drop event from the guest.
	 * 
	 * This is used in Guest - Host direction.
	 * 
	 * 
	 * @return The actual data.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_VM_ERROR VBOX_E_VM_ERROR</td>
	 *         <td>VMM device is not available.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public byte[] dragGHGetData() {
		try {
			/* base64 */String retVal;
			retVal = port.iGuestDragGHGetData(obj);
			return Helper.decodeBase64(retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Creates a new guest session for controlling the guest.
	 * 
	 * A guest session represents one impersonated user account on the guest, so
	 * every operation will use the same credentials specified when creating the
	 * session object via
	 * {@link org.virtualbox_4_2.IGuest#createSession(String,String,String,String)}.
	 * Anonymous sessions, that is, sessions without specifying a valid user account
	 * on the guest are not allowed due to security reasons.
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
	 * Closing a session via {@link org.virtualbox_4_2.IGuestSession#close()} will
	 * try to close all the mentioned objects above unless these objects are still
	 * used by a client.
	 * 
	 * @param user        User name this session will be using to control the guest;
	 *                    has to exist and have the appropriate rights to execute
	 *                    programs in the VM. Must not be empty.
	 * 
	 * 
	 * @param password    Password of the user account to be used. Empty passwords
	 *                    are allowed.
	 * 
	 * 
	 * @param domain      Domain name of the user account to be used if the guest is
	 *                    part of a domain. Optional. This feature is not
	 *                    implemented yet.
	 * 
	 * 
	 * @param sessionName The session's friendly name. Optional, can be empty.
	 * 
	 * 
	 * @return The newly created session object.
	 * 
	 * 
	 */
	public org.virtualbox_4_2.IGuestSession createSession(String user, String password, String domain,
			String sessionName) {
		try {
			String retVal;
			retVal = port.iGuestCreateSession(obj, user, password, domain, sessionName);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IGuestSession(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Finds guest sessions by their friendly name and returns an interface array
	 * with all found guest sessions.
	 * 
	 * @param sessionName The session's friendly name to find. Wildcards like ? and
	 *                    * are allowed.
	 * 
	 * 
	 * @return Array with all guest sessions found matching the name specified.
	 * 
	 * 
	 */
	public List<org.virtualbox_4_2.IGuestSession> findSession(String sessionName) {
		try {
			List<String> retVal;
			retVal = port.iGuestFindSession(obj, sessionName);
			return Helper.wrap(org.virtualbox_4_2.IGuestSession.class, port, retVal);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Automatically updates already installed Guest Additions in a VM.
	 * 
	 * At the moment only Windows guests are supported.
	 * 
	 * Because the VirtualBox Guest Additions drivers are not WHQL-certified yet
	 * there might be warning dialogs during the actual Guest Additions update.
	 * These need to be confirmed manually in order to continue the installation
	 * process. This applies to Windows 2000 and Windows XP guests and therefore
	 * these guests can't be updated in a fully automated fashion without user
	 * interaction. However, to start a Guest Additions update for the mentioned
	 * Windows versions anyway, the flag AdditionsUpdateFlag_WaitForUpdateStartOnly
	 * can be specified. See {@link org.virtualbox_4_2.AdditionsUpdateFlag} for more
	 * information.
	 * 
	 * 
	 * @param source Path to the Guest Additions .ISO file to use for the upate.
	 * 
	 * 
	 * @param flags  {@link org.virtualbox_4_2.AdditionsUpdateFlag} flags.
	 * 
	 * 
	 * @return Progress object to track the operation completion.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_NOT_SUPPORTED VBOX_E_NOT_SUPPORTED</td>
	 *         <td>Guest OS is not supported for automated Guest Additions updates
	 *         or the already installed Guest Additions are not ready yet.</td>
	 *         <tr>
	 *         <tr>
	 *         <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *         <td>Error while updating.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IProgress updateGuestAdditions(String source,
			List<org.virtualbox_4_2.AdditionsUpdateFlag> flags) {
		try {
			String retVal;
			retVal = port.iGuestUpdateGuestAdditions(obj, source,
					Helper.convertEnums(org.virtualbox_4_2.AdditionsUpdateFlag.class,
							org.virtualbox_4_2.jaxws.AdditionsUpdateFlag.class, flags));
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IProgress(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

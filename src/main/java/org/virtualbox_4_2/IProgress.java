
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
 * IProgress.java
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
 * The IProgress interface is used to track and control asynchronous tasks
 * within VirtualBox.
 * 
 * An instance of this is returned every time VirtualBox starts an asynchronous
 * task (in other words, a separate thread) which continues to run after a
 * method call returns. For example,
 * {@link org.virtualbox_4_2.IConsole#saveState()}, which saves the state of a
 * running virtual machine, can take a long time to complete. To be able to
 * display a progress bar, a user interface such as the VirtualBox graphical
 * user interface can use the IProgress object returned by that method.
 * 
 * Note that IProgress is a "read-only" interface in the sense that only the
 * VirtualBox internals behind the Main API can create and manipulate progress
 * objects, whereas client code can only use the IProgress object to monitor a
 * task's progress and, if {@link #getCancelable()} is true, cancel the task by
 * calling {@link #cancel()}.
 * 
 * A task represented by IProgress consists of either one or several
 * sub-operations that run sequentially, one by one (see {@link #getOperation()}
 * and {@link #getOperationCount()}). Every operation is identified by a number
 * (starting from 0) and has a separate description.
 * 
 * You can find the individual percentage of completion of the current operation
 * in {@link #getOperationPercent()} and the percentage of completion of the
 * task as a whole in {@link #getPercent()}.
 * 
 * Similarly, you can wait for the completion of a particular operation via
 * {@link #waitForOperationCompletion(Long,Integer)} or for the completion of
 * the whole task via {@link #waitForCompletion(Integer)}.
 * 
 * Interface ID: <tt>{C20238E4-3221-4D3F-8891-81CE92D9F913}</tt>
 */
public class IProgress extends IUnknown {

	public IProgress(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * ID of the task.
	 * 
	 * @return String
	 * 
	 */
	public String getId() {
		try {
			String retVal = port.iProgressGetId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Description of the task.
	 * 
	 * @return String
	 * 
	 */
	public String getDescription() {
		try {
			String retVal = port.iProgressGetDescription(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Initiator of the task.
	 * 
	 * @return IUnknown
	 * 
	 */
	public IUnknown getInitiator() {
		try {
			String retVal = port.iProgressGetInitiator(obj);
			return (retVal.length() > 0) ? new IUnknown(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Whether the task can be interrupted.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getCancelable() {
		try {
			Boolean retVal = port.iProgressGetCancelable(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Current progress value of the task as a whole, in percent. This value depends
	 * on how many operations are already complete. Returns 100 if
	 * {@link #getCompleted()} is true.
	 * 
	 * @return Long
	 * 
	 */
	public Long getPercent() {
		try {
			Long retVal = port.iProgressGetPercent(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Estimated remaining time until the task completes, in seconds. Returns 0 once
	 * the task has completed; returns -1 if the remaining time cannot be computed,
	 * in particular if the current progress is 0.
	 * 
	 * Even if a value is returned, the estimate will be unreliable for low progress
	 * values. It will become more reliable as the task progresses; it is not
	 * recommended to display an ETA before at least 20% of a task have completed.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getTimeRemaining() {
		try {
			Integer retVal = port.iProgressGetTimeRemaining(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Whether the task has been completed.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getCompleted() {
		try {
			Boolean retVal = port.iProgressGetCompleted(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Whether the task has been canceled.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getCanceled() {
		try {
			Boolean retVal = port.iProgressGetCanceled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Result code of the progress task. Valid only if {@link #getCompleted()} is
	 * true.
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getResultCode() {
		try {
			Integer retVal = port.iProgressGetResultCode(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Extended information about the unsuccessful result of the progress operation.
	 * May be null if no extended information is available. Valid only if
	 * {@link #getCompleted()} is true and {@link #getResultCode()} indicates a
	 * failure.
	 * 
	 * @return org.virtualbox_4_2.IVirtualBoxErrorInfo
	 * 
	 */
	public org.virtualbox_4_2.IVirtualBoxErrorInfo getErrorInfo() {
		try {
			String retVal = port.iProgressGetErrorInfo(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IVirtualBoxErrorInfo(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Number of sub-operations this task is divided into. Every task consists of at
	 * least one suboperation.
	 * 
	 * @return Long
	 * 
	 */
	public Long getOperationCount() {
		try {
			Long retVal = port.iProgressGetOperationCount(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Number of the sub-operation being currently executed.
	 * 
	 * @return Long
	 * 
	 */
	public Long getOperation() {
		try {
			Long retVal = port.iProgressGetOperation(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Description of the sub-operation being currently executed.
	 * 
	 * @return String
	 * 
	 */
	public String getOperationDescription() {
		try {
			String retVal = port.iProgressGetOperationDescription(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Progress value of the current sub-operation only, in percent.
	 * 
	 * @return Long
	 * 
	 */
	public Long getOperationPercent() {
		try {
			Long retVal = port.iProgressGetOperationPercent(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Weight value of the current sub-operation only.
	 * 
	 * @return Long
	 * 
	 */
	public Long getOperationWeight() {
		try {
			Long retVal = port.iProgressGetOperationWeight(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * When non-zero, this specifies the number of milliseconds after which the
	 * operation will automatically be canceled. This can only be set on cancelable
	 * objects.
	 * 
	 * @return Long
	 * 
	 */
	public Long getTimeout() {
		try {
			Long retVal = port.iProgressGetTimeout(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * When non-zero, this specifies the number of milliseconds after which the
	 * operation will automatically be canceled. This can only be set on cancelable
	 * objects.
	 * 
	 * @param value Long
	 * 
	 */
	public void setTimeout(Long value) {
		try {
			port.iProgressSetTimeout(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IProgress queryInterface(IUnknown obj) {
		return obj == null ? null : new IProgress(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * Internal method, not to be called externally.
	 */
	public void setCurrentOperationProgress(Long percent) {
		try {
			port.iProgressSetCurrentOperationProgress(obj, percent);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * Internal method, not to be called externally.
	 */
	public void setNextOperation(String nextOperationDescription, Long nextOperationsWeight) {
		try {
			port.iProgressSetNextOperation(obj, nextOperationDescription, nextOperationsWeight);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Waits until the task is done (including all sub-operations) with a given
	 * timeout in milliseconds; specify -1 for an indefinite wait.
	 * 
	 * Note that the VirtualBox/XPCOM/COM/native event queues of the calling thread
	 * are not processed while waiting. Neglecting event queues may have dire
	 * consequences (degrade performance, resource hogs, deadlocks, etc.), this is
	 * specially so for the main thread on platforms using XPCOM. Callers are
	 * adviced wait for short periods and service their event queues between calls,
	 * or to create a worker thread to do the waiting.
	 * 
	 * 
	 * @param timeout Maximum time in milliseconds to wait or -1 to wait
	 *                indefinitely.
	 * 
	 * 
	 *                Expected result codes:
	 *                <table>
	 *                <tr>
	 *                <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *                <td>Failed to wait for task completion.</td>
	 *                <tr>
	 *                </table>
	 * 
	 */
	public void waitForCompletion(Integer timeout) {
		try {
			port.iProgressWaitForCompletion(obj, timeout);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Waits until the given operation is done with a given timeout in milliseconds;
	 * specify -1 for an indefinite wait.
	 * 
	 * See {@link #waitForCompletion(Integer)}
	 * 
	 * @param operation Number of the operation to wait for. Must be less than
	 *                  {@link #getOperationCount()}.
	 * 
	 * 
	 * @param timeout   Maximum time in milliseconds to wait or -1 to wait
	 *                  indefinitely.
	 * 
	 * 
	 *                  Expected result codes:
	 *                  <table>
	 *                  <tr>
	 *                  <td>@link ::VBOX_E_IPRT_ERROR VBOX_E_IPRT_ERROR</td>
	 *                  <td>Failed to wait for operation completion.</td>
	 *                  <tr>
	 *                  </table>
	 * 
	 */
	public void waitForOperationCompletion(Long operation, Integer timeout) {
		try {
			port.iProgressWaitForOperationCompletion(obj, operation, timeout);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Waits until the other task is completed (including all sub-operations) and
	 * forward all changes from the other progress to this progress. This means
	 * sub-operation number, description, percent and so on.
	 * 
	 * You have to take care on setting up at least the same count on sub-operations
	 * in this progress object like there are in the other progress object.
	 * 
	 * If the other progress object supports cancel and this object gets any cancel
	 * request (when here enabled as well), it will be forwarded to the other
	 * progress object.
	 * 
	 * If there is an error in the other progress, this error isn't automatically
	 * transfered to this progress object. So you have to check any operation error
	 * within the other progress object, after this method returns.
	 * 
	 * @param pProgressAsync The progress object of the asynchrony process.
	 * 
	 * 
	 */
	public void waitForAsyncProgressCompletion(org.virtualbox_4_2.IProgress pProgressAsync) {
		try {
			port.iProgressWaitForAsyncProgressCompletion(obj,
					((pProgressAsync == null) ? null : pProgressAsync.getWrapped()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Cancels the task.
	 * 
	 * Expected result codes:
	 * <table>
	 * <tr>
	 * <td>@link ::VBOX_E_INVALID_OBJECT_STATE VBOX_E_INVALID_OBJECT_STATE</td>
	 * <td>Operation cannot be canceled.</td>
	 * <tr>
	 * </table>
	 * 
	 * NOTE: If {@link #getCancelable()} is false, then this method will fail.
	 * 
	 * 
	 */
	public void cancel() {
		try {
			port.iProgressCancel(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

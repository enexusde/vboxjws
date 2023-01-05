
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
 * IEventSource.java
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
 * Event source. Generally, any object which could generate events can be an
 * event source, or aggregate one. To simplify using one-way protocols such as
 * webservices running on top of HTTP(S), an event source can work with
 * listeners in either active or passive mode. In active mode it is up to the
 * IEventSource implementation to call
 * {@link org.virtualbox_4_2.IEventListener#handleEvent(org.virtualbox_4_2.IEvent)},
 * in passive mode the event source keeps track of pending events for each
 * listener and returns available events on demand.
 * 
 * See {@link org.virtualbox_4_2.IEvent} for an introduction to VirtualBox event
 * handling.
 * 
 * Interface ID: <tt>{9B6E1AEE-35F3-4F4D-B5BB-ED0ECEFD8538}</tt>
 */
public class IEventSource extends IUnknown {

	public IEventSource(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	public static IEventSource queryInterface(IUnknown obj) {
		return obj == null ? null : new IEventSource(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Creates a new listener object, useful for passive mode.
	 * 
	 */
	public org.virtualbox_4_2.IEventListener createListener() {
		try {
			String retVal;
			retVal = port.iEventSourceCreateListener(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IEventListener(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Creates an aggregator event source, collecting events from multiple sources.
	 * This way a single listener can listen for events coming from multiple
	 * sources, using a single blocking
	 * {@link #getEvent(org.virtualbox_4_2.IEventListener,Integer)} on the returned
	 * aggregator.
	 * 
	 * @param subordinates Subordinate event source this one aggregatres.
	 * 
	 * 
	 * @return Event source aggregating passed sources.
	 * 
	 * 
	 */
	public org.virtualbox_4_2.IEventSource createAggregator(List<org.virtualbox_4_2.IEventSource> subordinates) {
		try {
			String retVal;
			retVal = port.iEventSourceCreateAggregator(obj, Helper.unwrap(subordinates));
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IEventSource(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Register an event listener.
	 * 
	 * 
	 * @param listener    Listener to register.
	 * 
	 * @param interesting Event types listener is interested in. One can use
	 *                    wildcards like -
	 *                    {@link org.virtualbox_4_2.VBoxEventType#Any} to specify
	 *                    wildcards, matching more than one event.
	 * 
	 * 
	 * @param active      Which mode this listener is operating in. In active mode,
	 *                    {@link org.virtualbox_4_2.IEventListener#handleEvent(org.virtualbox_4_2.IEvent)}
	 *                    is called directly. In passive mode, an internal event
	 *                    queue is created for this this IEventListener. For each
	 *                    event coming in, it is added to queues for all interested
	 *                    registered passive listeners. It is then up to the
	 *                    external code to call the listener's
	 *                    {@link org.virtualbox_4_2.IEventListener#handleEvent(org.virtualbox_4_2.IEvent)}
	 *                    method. When done with an event, the external code must
	 *                    call
	 *                    {@link #eventProcessed(org.virtualbox_4_2.IEventListener,org.virtualbox_4_2.IEvent)}.
	 * 
	 * 
	 *                    NOTE: To avoid system overload, the VirtualBox server
	 *                    process checks if passive event listeners call
	 *                    {@link org.virtualbox_4_2.IEventSource#getEvent(org.virtualbox_4_2.IEventListener,Integer)}
	 *                    frequently enough. In the current implementation, if more
	 *                    than 500 pending events are detected for a passive event
	 *                    listener, it is forcefully unregistered by the system, and
	 *                    further
	 *                    {@link #getEvent(org.virtualbox_4_2.IEventListener,Integer)}
	 *                    calls will return VBOX_E_OBJECT_NOT_FOUND.
	 * 
	 * 
	 */
	public void registerListener(org.virtualbox_4_2.IEventListener listener,
			List<org.virtualbox_4_2.VBoxEventType> interesting, Boolean active) {
		try {
			port.iEventSourceRegisterListener(obj, ((listener == null) ? null : listener.getWrapped()),
					Helper.convertEnums(org.virtualbox_4_2.VBoxEventType.class,
							org.virtualbox_4_2.jaxws.VBoxEventType.class, interesting),
					active);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Unregister an event listener. If listener is passive, and some waitable
	 * events are still in queue they are marked as processed automatically.
	 * 
	 * @param listener Listener to unregister.
	 * 
	 */
	public void unregisterListener(org.virtualbox_4_2.IEventListener listener) {
		try {
			port.iEventSourceUnregisterListener(obj, ((listener == null) ? null : listener.getWrapped()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Fire an event for this source.
	 * 
	 * @param event   Event to deliver.
	 * 
	 * @param timeout Maximum time to wait for event processing (if event is
	 *                waitable), in ms; 0 = no wait, -1 = indefinite wait.
	 * 
	 * 
	 * @return true if an event was delivered to all targets, or is non-waitable.
	 * 
	 */
	public Boolean fireEvent(org.virtualbox_4_2.IEvent event, Integer timeout) {
		try {
			Boolean retVal;
			retVal = port.iEventSourceFireEvent(obj, ((event == null) ? null : event.getWrapped()), timeout);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Get events from this peer's event queue (for passive mode). Calling this
	 * method regularly is required for passive event listeners to avoid system
	 * overload; see
	 * {@link org.virtualbox_4_2.IEventSource#registerListener(org.virtualbox_4_2.IEventListener,List,Boolean)}
	 * for details.
	 * 
	 * 
	 * @param listener Which listener to get data for.
	 * 
	 * @param timeout  Maximum time to wait for events, in ms; 0 = no wait, -1 =
	 *                 indefinite wait.
	 * 
	 * 
	 * @return Event retrieved, or null if none available.
	 * 
	 *         Expected result codes:
	 *         <table>
	 *         <tr>
	 *         <td>@link ::VBOX_E_OBJECT_NOT_FOUND VBOX_E_OBJECT_NOT_FOUND</td>
	 *         <td>Listener is not registered, or autounregistered.</td>
	 *         <tr>
	 *         </table>
	 * 
	 */
	public org.virtualbox_4_2.IEvent getEvent(org.virtualbox_4_2.IEventListener listener, Integer timeout) {
		try {
			String retVal;
			retVal = port.iEventSourceGetEvent(obj, ((listener == null) ? null : listener.getWrapped()), timeout);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IEvent(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Must be called for waitable events after a particular listener finished its
	 * event processing. When all listeners of a particular event have called this
	 * method, the system will then call
	 * {@link org.virtualbox_4_2.IEvent#setProcessed()}.
	 * 
	 * @param listener Which listener processed event.
	 * 
	 * @param event    Which event.
	 * 
	 */
	public void eventProcessed(org.virtualbox_4_2.IEventListener listener, org.virtualbox_4_2.IEvent event) {
		try {
			port.iEventSourceEventProcessed(obj, ((listener == null) ? null : listener.getWrapped()),
					((event == null) ? null : event.getWrapped()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

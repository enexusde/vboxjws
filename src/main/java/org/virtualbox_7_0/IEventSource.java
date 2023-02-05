
/*
 * Copyright (C) 2010-2022 Oracle and/or its affiliates.
 *
 * This file is part of a free software library; you can redistribute
 * it and/or modify it under the terms of the GNU Lesser General
 * Public License version 2.1 as published by the Free Software
 * Foundation and shipped in the \"COPYING.LIB\" file with this library.
 * The library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY of any kind.
 *
 * Oracle LGPL Disclaimer: For the avoidance of doubt, except that if
 * any license choice other than GPL or LGPL is available it will
 * apply instead, Oracle elects to use only the Lesser General Public
 * License version 2.1 (LGPLv2) at this time for any software where
 * a choice of LGPL license versions is made available with the
 * language indicating that LGPLv2 or any later version may be used,
 * or where a choice of which version of the LGPL is applied is
 * otherwise unspecified.

 * http://www.virtualbox.org.  This library is free software; you can
 * redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, in version 2.1
 * as it comes in the "COPYING.LIB" file of the VirtualBox SDK distribution.
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 * License for more details.
 *
 * SPDX-License-Identifier: LGPL-2.1-only
 */

/*
 * IEventSource.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import javax.xml.ws.*;
import java.util.List;


/**
Event source. Generally, any object which could generate events can be an event source,
or aggregate one. To simplify using one-way protocols such as webservices running on top of HTTP(S),
an event source can work with listeners in either active or passive mode. In active mode it is up to
the IEventSource implementation to call{@link org.virtualbox_7_0.IEventListener#handleEvent(org.virtualbox_7_0.IEvent)}, in passive mode the
event source keeps track of pending events for each listener and returns available events on demand.

See{@link org.virtualbox_7_0.IEvent}for an introduction to VirtualBox event handling.

Interface ID: <code>{9B6E1AEE-35F3-4F4D-B5BB-ED0ECEFD8538}</code>
*/
public class IEventSource extends IUnknown
{

    public IEventSource(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }
    public static IEventSource queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IEventSource(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Creates a new listener object, useful for passive mode.
*/
    public org.virtualbox_7_0.IEventListener createListener()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iEventSourceCreateListener(obj);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IEventListener(retVal, getObjMgr(), port) : null;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        finally
        {
            getObjMgr().allowObjRelease();
        }
    }

/**
Creates an aggregator event source, collecting events from multiple sources.
This way a single listener can listen for events coming from multiple sources,
using a single blocking{@link #getEvent(org.virtualbox_7_0.IEventListener,Integer)}on the returned aggregator.
@param subordinates Subordinate event source this one aggregates.

@return Event source aggregating passed sources.

*/
    public org.virtualbox_7_0.IEventSource createAggregator(List<org.virtualbox_7_0.IEventSource> subordinates)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iEventSourceCreateAggregator(obj, Helper.unwrap(subordinates));
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IEventSource(retVal, getObjMgr(), port) : null;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        finally
        {
            getObjMgr().allowObjRelease();
        }
    }

/**
Register an event listener.
@param listener Listener to register.

@param interesting Event types listener is interested in. One can use wildcards like -{@link org.virtualbox_7_0.VBoxEventType#Any}to specify wildcards, matching more
than one event.

@param active Which mode this listener is operating in.
In active mode,{@link org.virtualbox_7_0.IEventListener#handleEvent(org.virtualbox_7_0.IEvent)}is called directly.
In passive mode, an internal event queue is created for this this IEventListener.
For each event coming in, it is added to queues for all interested registered passive
listeners. It is then up to the external code to call the listener's{@link org.virtualbox_7_0.IEventListener#handleEvent(org.virtualbox_7_0.IEvent)}method. When done with an event, the
external code must call{@link #eventProcessed(org.virtualbox_7_0.IEventListener,org.virtualbox_7_0.IEvent)}.

NOTE: To avoid system overload, the VirtualBox server process checks if passive event
listeners call{@link org.virtualbox_7_0.IEventSource#getEvent(org.virtualbox_7_0.IEventListener,Integer)}frequently enough. In the
current implementation, if more than 500 pending events are detected for a passive
event listener, it is forcefully unregistered by the system, and further{@link #getEvent(org.virtualbox_7_0.IEventListener,Integer)}calls will return  VBOX_E_OBJECT_NOT_FOUND.

*/
    public void registerListener(org.virtualbox_7_0.IEventListener listener, List<org.virtualbox_7_0.VBoxEventType> interesting, Boolean active)
    {
        try
        {
        port.iEventSourceRegisterListener(obj, ((listener == null) ? null :listener.getWrapped()), Helper.convertEnums(org.virtualbox_7_0.VBoxEventType.class, org.virtualbox_7_0.jaxws.VBoxEventType.class, interesting), active);
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Unregister an event listener. If listener is passive, and some waitable events are still
in queue they are marked as processed automatically.
@param listener Listener to unregister.

*/
    public void unregisterListener(org.virtualbox_7_0.IEventListener listener)
    {
        try
        {
        port.iEventSourceUnregisterListener(obj, ((listener == null) ? null :listener.getWrapped()));
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Fire an event for this source.
@param event Event to deliver.

@param timeout Maximum time to wait for event processing (if event is waitable), in ms;
0 = no wait, -1 = indefinite wait.

@return true if an event was delivered to all targets, or is non-waitable.

*/
    public Boolean fireEvent(org.virtualbox_7_0.IEvent event, Integer timeout)
    {
        try
        {
            Boolean retVal;
        retVal = port.iEventSourceFireEvent(obj, ((event == null) ? null :event.getWrapped()), timeout);
           return retVal;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }

/**
Get events from this peer's event queue (for passive mode). Calling this method
regularly is required for passive event listeners to avoid system overload;
see{@link org.virtualbox_7_0.IEventSource#registerListener(org.virtualbox_7_0.IEventListener,List,Boolean)}for details.
<p></p><dl><dt><b>Expected result codes:</b></dt>
<dd><code>VBOX_E_OBJECT_NOT_FOUND</code> - Listener is not registered, or autounregistered.</dd>
</dl>

@param listener Which listener to get data for.

@param timeout Maximum time to wait for events, in ms;
0 = no wait, -1 = indefinite wait.

@return Event retrieved, or null if none available.

*/
    public org.virtualbox_7_0.IEvent getEvent(org.virtualbox_7_0.IEventListener listener, Integer timeout)
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal;
        retVal = port.iEventSourceGetEvent(obj, ((listener == null) ? null :listener.getWrapped()), timeout);
           return (retVal.length() > 0) ? new org.virtualbox_7_0.IEvent(retVal, getObjMgr(), port) : null;
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        finally
        {
            getObjMgr().allowObjRelease();
        }
    }

/**
Must be called for waitable events after a particular listener finished its
event processing. When all listeners of a particular event have called this
method, the system will then call{@link org.virtualbox_7_0.IEvent#setProcessed()}.
@param listener Which listener processed event.

@param event Which event.

*/
    public void eventProcessed(org.virtualbox_7_0.IEventListener listener, org.virtualbox_7_0.IEvent event)
    {
        try
        {
        port.iEventSourceEventProcessed(obj, ((listener == null) ? null :listener.getWrapped()), ((event == null) ? null :event.getWrapped()));
        }
        catch (InvalidObjectFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
        catch (RuntimeFaultMsg e)
        {
            throw new VBoxException(e.getMessage(), e, this.getObjMgr(), this.port);
        }
    }
}

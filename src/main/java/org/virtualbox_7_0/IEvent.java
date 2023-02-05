
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
 * IEvent.java
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
Abstract parent interface for VirtualBox events. Actual events will typically implement
a more specific interface which derives from this (see below).<b>Introduction to VirtualBox events</b>Generally speaking, an event (represented by this interface) signals that something
happened, while an event listener (see{@link org.virtualbox_7_0.IEventListener}) represents an
entity that is interested in certain events. In order for this to work with
unidirectional protocols (i.e. web services), the concepts of passive and active
listener are used.

Event consumers can register themselves as listeners, providing an array of
events they are interested in (see{@link org.virtualbox_7_0.IEventSource#registerListener(org.virtualbox_7_0.IEventListener,List,Boolean)}).
When an event triggers, the listener is notified about the event. The exact
mechanism of the notification depends on whether the listener was registered as
an active or passive listener:<ul><li>An active listener is very similar to a callback: it is a function invoked
by the API. As opposed to the callbacks that were used in the API before
VirtualBox 4.0 however, events are now objects with an interface hierarchy.</li><li>Passive listeners are somewhat trickier to implement, but do not require
a client function to be callable, which is not an option with scripting
languages or web service clients. Internally the{@link org.virtualbox_7_0.IEventSource}implementation maintains an event queue for each passive listener, and
newly arrived events are put in this queue. When the listener calls{@link org.virtualbox_7_0.IEventSource#getEvent(org.virtualbox_7_0.IEventListener,Integer)}, first element from its internal event
queue is returned. When the client completes processing of an event,
the{@link org.virtualbox_7_0.IEventSource#eventProcessed(org.virtualbox_7_0.IEventListener,org.virtualbox_7_0.IEvent)}function must be called,
acknowledging that the event was processed. It supports implementing
waitable events. On passive listener unregistration, all events from its
queue are auto-acknowledged.</li></ul>Waitable events are useful in situations where the event generator wants to track
delivery or a party wants to wait until all listeners have completed the event. A
typical example would be a vetoable event (see{@link org.virtualbox_7_0.IVetoEvent}) where a
listeners might veto a certain action, and thus the event producer has to make
sure that all listeners have processed the event and not vetoed before taking
the action.

A given event may have both passive and active listeners at the same time.<b>Using events</b>Any VirtualBox object capable of producing externally visible events provides an
eventSource read-only attribute, which is of the type{@link org.virtualbox_7_0.IEventSource}.
This event source object is notified by VirtualBox once something has happened, so
consumers may register event listeners with this event source. To register a listener,
an object implementing the{@link org.virtualbox_7_0.IEventListener}interface must be provided.
For active listeners, such an object is typically created by the consumer, while for
passive listeners{@link org.virtualbox_7_0.IEventSource#createListener()}should be used. Please
note that a listener created with{@link org.virtualbox_7_0.IEventSource#createListener()}must not be used as an active listener.

Once created, the listener must be registered to listen for the desired events
(see{@link org.virtualbox_7_0.IEventSource#registerListener(org.virtualbox_7_0.IEventListener,List,Boolean)}), providing an array of{@link org.virtualbox_7_0.VBoxEventType}enums. Those elements can either be the individual
event IDs or wildcards matching multiple event IDs.

After registration, the callback's{@link org.virtualbox_7_0.IEventListener#handleEvent(org.virtualbox_7_0.IEvent)}method is
called automatically when the event is triggered, while passive listeners have to call{@link org.virtualbox_7_0.IEventSource#getEvent(org.virtualbox_7_0.IEventListener,Integer)}and{@link org.virtualbox_7_0.IEventSource#eventProcessed(org.virtualbox_7_0.IEventListener,org.virtualbox_7_0.IEvent)}in
an event processing loop.

The IEvent interface is an abstract parent interface for all such VirtualBox events
coming in. As a result, the standard use pattern inside{@link org.virtualbox_7_0.IEventListener#handleEvent(org.virtualbox_7_0.IEvent)}or the event processing loop is to check the{@link #getType()}attribute of the event and
then cast to the appropriate specific interface using  QueryInterface().

Interface ID: <code>{0CA2ADBA-8F30-401B-A8CD-FE31DBE839C0}</code>
*/
public class IEvent extends IUnknown
{

    public IEvent(String wrapped, ObjectRefManager objMgr, VboxPortType port)
    {
        super(wrapped, objMgr, port);
    }

/**
Event type.
@return org.virtualbox_7_0.VBoxEventType
*/
    public org.virtualbox_7_0.VBoxEventType getType()
    {
        try
        {
            org.virtualbox_7_0.jaxws.VBoxEventType retVal = port.iEventGetType(obj);
            return org.virtualbox_7_0.VBoxEventType.fromValue(retVal.value());
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
Source of this event.
@return org.virtualbox_7_0.IEventSource
*/
    public org.virtualbox_7_0.IEventSource getSource()
    {
        this.getObjMgr().preventObjRelease();
        try
        {
            String retVal = port.iEventGetSource(obj);
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
If we can wait for this event being processed. If false,{@link #waitProcessed(Integer)}returns immediately,
and{@link #setProcessed()}doesn't make sense. Non-waitable events are generally better performing,
as no additional overhead associated with waitability imposed.
Waitable events are needed when one need to be able to wait for particular event processed,
for example for vetoable changes, or if event refers to some resource which need to be kept immutable
until all consumers confirmed events.
@return Boolean
*/
    public Boolean getWaitable()
    {
        try
        {
            Boolean retVal = port.iEventGetWaitable(obj);
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
    public static IEvent queryInterface(IUnknown obj)
    {
        return obj == null ?  null : new IEvent(obj.getWrapped(), obj.getObjMgr(), obj.getRemoteWSPort());
    }

/**
Internal method called by the system when all listeners of a particular event have called{@link org.virtualbox_7_0.IEventSource#eventProcessed(org.virtualbox_7_0.IEventListener,org.virtualbox_7_0.IEvent)}. This should not be called by client code.
*/
    public void setProcessed()
    {
        try
        {
        port.iEventSetProcessed(obj);
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
Wait until time outs, or this event is processed. Event must be waitable for this operation to have
described semantics, for non-waitable returns true immediately.
@param timeout Maximum time to wait for event processing, in ms;
0 = no wait, -1 = indefinite wait.

@return If this event was processed before timeout.

*/
    public Boolean waitProcessed(Integer timeout)
    {
        try
        {
            Boolean retVal;
        retVal = port.iEventWaitProcessed(obj, timeout);
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
}

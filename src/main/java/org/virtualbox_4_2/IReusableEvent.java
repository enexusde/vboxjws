
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
 * IReusableEvent.java
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
 * Base abstract interface for all reusable events. Interface ID:
 * <tt>{69BFB134-80F6-4266-8E20-16371F68FA25}</tt>
 */
public class IReusableEvent extends IEvent {

	public IReusableEvent(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * Current generation of event, incremented on reuse.
	 * 
	 * @return Long
	 * 
	 */
	public Long getGeneration() {
		try {
			Long retVal = port.iReusableEventGetGeneration(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IReusableEvent queryInterface(IUnknown obj) {
		return obj == null ? null : new IReusableEvent(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Marks an event as reused, increments 'generation', fields shall no longer be
	 * considered valid.
	 * 
	 */
	public void reuse() {
		try {
			port.iReusableEventReuse(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}


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
 * IManagedObjectRef.java
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
 * Managed object reference.
 * 
 * Only within the webservice, a managed object reference (which is really an
 * opaque number) allows a webservice client to address an object that lives in
 * the address space of the webservice server.
 * 
 * Behind each managed object reference, there is a COM object that lives in the
 * webservice server's address space. The COM object is not freed until the
 * managed object reference is released, either by an explicit call to
 * {@link org.virtualbox_4_2.IManagedObjectRef#release()} or by logging off from
 * the webservice
 * ({@link org.virtualbox_4_2.IWebsessionManager#logoff(org.virtualbox_4_2.IVirtualBox)}),
 * which releases all objects created during the webservice session.
 * 
 * Whenever a method call of the VirtualBox API returns a COM object, the
 * webservice representation of that method will instead return a managed object
 * reference, which can then be used to invoke methods on that object.
 * 
 * Interface ID: <tt>{9474D09D-2313-46DE-B568-A42B8718E8ED}</tt>
 */
public class IManagedObjectRef extends IUnknown {

	public IManagedObjectRef(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	public static IManagedObjectRef queryInterface(IUnknown obj) {
		return obj == null ? null : new IManagedObjectRef(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Returns the name of the interface that this managed object represents, for
	 * example, "IMachine", as a string.
	 * 
	 */
	public String getInterfaceName() {
		try {
			String retVal;
			retVal = port.iManagedObjectRefGetInterfaceName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Releases this managed object reference and frees the resources that were
	 * allocated for it in the webservice server process. After calling this method,
	 * the identifier of the reference can no longer be used.
	 * 
	 */
	public void release() {
		try {
			port.iManagedObjectRefRelease(obj);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

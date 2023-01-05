
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
 * IVirtualBoxErrorInfo.java
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
 * The IVirtualBoxErrorInfo interface represents extended error information.
 * 
 * Extended error information can be set by VirtualBox components after
 * unsuccessful or partially successful method invocation. This information can
 * be retrieved by the calling party as an IVirtualBoxErrorInfo object and then
 * shown to the client in addition to the plain 32-bit result code.
 * 
 * In MS COM, this interface extends the IErrorInfo interface, in XPCOM, it
 * extends the nsIException interface. In both cases, it provides a set of
 * common attributes to retrieve error information.
 * 
 * Sometimes invocation of some component's method may involve methods of other
 * components that may also fail (independently of this method's failure), or a
 * series of non-fatal errors may precede a fatal error that causes method
 * failure. In cases like that, it may be desirable to preserve information
 * about all errors happened during method invocation and deliver it to the
 * caller. The {@link #getNext()} attribute is intended specifically for this
 * purpose and allows to represent a chain of errors through a single
 * IVirtualBoxErrorInfo object set after method invocation.
 * 
 * 
 * NOTE: errors are stored to a chain in the reverse order, i.e. the initial
 * error object you query right after method invocation is the last error set by
 * the callee, the object it points to in the next attribute is the previous
 * error and so on, up to the first error (which is the last in the chain).
 * 
 * Interface ID: <tt>{F91E6E91-49E1-4FD2-B21E-269003350D06}</tt>
 */
public class IVirtualBoxErrorInfo extends IUnknown {

	public IVirtualBoxErrorInfo(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Result code of the error. Usually, it will be the same as the result code
	 * returned by the method that provided this error information, but not always.
	 * For example, on Win32, CoCreateInstance() will most likely return
	 * E_NOINTERFACE upon unsuccessful component instantiation attempt, but not the
	 * value the component factory returned. Value is typed 'long', not 'result', to
	 * make interface usable from scripting languages.
	 * 
	 * NOTE: In MS COM, there is no equivalent. In XPCOM, it is the same as
	 * nsIException::result.
	 * 
	 * 
	 * @return Integer
	 * 
	 */
	public Integer getResultCode() {
		try {
			Integer retVal = port.iVirtualBoxErrorInfoGetResultCode(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * UUID of the interface that defined the error.
	 * 
	 * NOTE: In MS COM, it is the same as IErrorInfo::GetGUID, except for the data
	 * type. In XPCOM, there is no equivalent.
	 * 
	 * 
	 * @return String
	 * 
	 */
	public String getInterfaceID() {
		try {
			String retVal = port.iVirtualBoxErrorInfoGetInterfaceID(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Name of the component that generated the error.
	 * 
	 * NOTE: In MS COM, it is the same as IErrorInfo::GetSource. In XPCOM, there is
	 * no equivalent.
	 * 
	 * 
	 * @return String
	 * 
	 */
	public String getComponent() {
		try {
			String retVal = port.iVirtualBoxErrorInfoGetComponent(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Text description of the error.
	 * 
	 * NOTE: In MS COM, it is the same as IErrorInfo::GetDescription. In XPCOM, it
	 * is the same as nsIException::message.
	 * 
	 * 
	 * @return String
	 * 
	 */
	public String getText() {
		try {
			String retVal = port.iVirtualBoxErrorInfoGetText(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Next error object if there is any, or null otherwise.
	 * 
	 * NOTE: In MS COM, there is no equivalent. In XPCOM, it is the same as
	 * nsIException::inner.
	 * 
	 * 
	 * @return org.virtualbox_4_2.IVirtualBoxErrorInfo
	 * 
	 */
	public org.virtualbox_4_2.IVirtualBoxErrorInfo getNext() {
		try {
			String retVal = port.iVirtualBoxErrorInfoGetNext(obj);
			return (retVal.length() > 0) ? new org.virtualbox_4_2.IVirtualBoxErrorInfo(retVal, port) : null;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IVirtualBoxErrorInfo queryInterface(IUnknown obj) {
		return obj == null ? null : new IVirtualBoxErrorInfo(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

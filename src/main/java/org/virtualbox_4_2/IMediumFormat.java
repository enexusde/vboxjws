
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
 * IMediumFormat.java
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
 * The IMediumFormat interface represents a medium format.
 * 
 * Each medium format has an associated backend which is used to handle media
 * stored in this format. This interface provides information about the
 * properties of the associated backend.
 * 
 * Each medium format is identified by a string represented by the
 * {@link #getId()} attribute. This string is used in calls like
 * {@link org.virtualbox_4_2.IVirtualBox#createHardDisk(String,String)} to
 * specify the desired format.
 * 
 * The list of all supported medium formats can be obtained using
 * {@link org.virtualbox_4_2.ISystemProperties#getMediumFormats()}.
 * 
 * 
 * @see org.virtualbox_4_2.IMedium
 * 
 *      Interface ID: <tt>{9BD5B655-EA47-4637-99F3-AAD0948BE35B}</tt>
 */
public class IMediumFormat extends IUnknown {

	public IMediumFormat(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Identifier of this format.
	 * 
	 * The format identifier is a non- null non-empty ASCII string. Note that this
	 * string is case-insensitive. This means that, for example, all of the
	 * following strings:
	 * 
	 * <pre>
	   "VDI"
	   "vdi"
	   "VdI"
	 * </pre>
	 * 
	 * refer to the same medium format.
	 * 
	 * This string is used in methods of other interfaces where it is necessary to
	 * specify a medium format, such as
	 * {@link org.virtualbox_4_2.IVirtualBox#createHardDisk(String,String)}.
	 * 
	 * @return String
	 * 
	 */
	public String getId() {
		try {
			String retVal = port.iMediumFormatGetId(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Human readable description of this format.
	 * 
	 * Mainly for use in file open dialogs.
	 * 
	 * @return String
	 * 
	 */
	public String getName() {
		try {
			String retVal = port.iMediumFormatGetName(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Capabilities of the format as a set of bit flags.
	 * 
	 * For the meaning of individual capability flags see
	 * {@link org.virtualbox_4_2.MediumFormatCapabilities}.
	 * 
	 * @return Long
	 * 
	 */
	public Long getCapabilities() {
		try {
			Long retVal = port.iMediumFormatGetCapabilities(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IMediumFormat queryInterface(IUnknown obj) {
		return obj == null ? null : new IMediumFormat(obj.getWrapped(), obj.getRemoteWSPort());
	}

	/**
	 * 
	 * Returns two arrays describing the supported file extensions.
	 * 
	 * The first array contains the supported extensions and the seconds one the
	 * type each extension supports. Both have the same size.
	 * 
	 * Note that some backends do not work on files, so this array may be empty.
	 * 
	 * 
	 * @param extensions The array of supported extensions.
	 * 
	 * @param type       The array which indicates the device type for every given
	 *                   extension.
	 * 
	 * @see org.virtualbox_4_2.IMediumFormat#getCapabilities()
	 * 
	 */
	public void describeFileExtensions(Holder<List<String>> extensions,
			Holder<List<org.virtualbox_4_2.DeviceType>> type) {
		try {
			javax.xml.ws.Holder<List<String>> tmp_extensions = new javax.xml.ws.Holder<List<String>>();
			javax.xml.ws.Holder<List<org.virtualbox_4_2.jaxws.DeviceType>> tmp_type = new javax.xml.ws.Holder<List<org.virtualbox_4_2.jaxws.DeviceType>>();
			port.iMediumFormatDescribeFileExtensions(obj, tmp_extensions, tmp_type);
			extensions.value = tmp_extensions.value;
			type.value = Helper.convertEnums(org.virtualbox_4_2.jaxws.DeviceType.class,
					org.virtualbox_4_2.DeviceType.class, tmp_type.value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Returns several arrays describing the properties supported by this format.
	 * 
	 * An element with the given index in each array describes one property. Thus,
	 * the number of elements in each returned array is the same and corresponds to
	 * the number of supported properties.
	 * 
	 * The returned arrays are filled in only if the
	 * {@link org.virtualbox_4_2.MediumFormatCapabilities#Properties} flag is set.
	 * All arguments must be non- null.
	 * 
	 * 
	 * @param names       Array of property names.
	 * 
	 * @param description Array of property descriptions.
	 * 
	 * @param types       Array of property types.
	 * 
	 * @param flags       Array of property flags.
	 * 
	 * @param defaults    Array of default property values.
	 * 
	 * @see org.virtualbox_4_2.DataType
	 * @see org.virtualbox_4_2.DataFlags
	 * 
	 */
	public void describeProperties(Holder<List<String>> names, Holder<List<String>> description,
			Holder<List<org.virtualbox_4_2.DataType>> types, Holder<List<Long>> flags, Holder<List<String>> defaults) {
		try {
			javax.xml.ws.Holder<List<String>> tmp_names = new javax.xml.ws.Holder<List<String>>();
			javax.xml.ws.Holder<List<String>> tmp_description = new javax.xml.ws.Holder<List<String>>();
			javax.xml.ws.Holder<List<org.virtualbox_4_2.jaxws.DataType>> tmp_types = new javax.xml.ws.Holder<List<org.virtualbox_4_2.jaxws.DataType>>();
			javax.xml.ws.Holder<List<Long>> tmp_flags = new javax.xml.ws.Holder<List<Long>>();
			javax.xml.ws.Holder<List<String>> tmp_defaults = new javax.xml.ws.Holder<List<String>>();
			port.iMediumFormatDescribeProperties(obj, tmp_names, tmp_description, tmp_types, tmp_flags, tmp_defaults);
			names.value = tmp_names.value;
			description.value = tmp_description.value;
			types.value = Helper.convertEnums(org.virtualbox_4_2.jaxws.DataType.class,
					org.virtualbox_4_2.DataType.class, tmp_types.value);
			flags.value = tmp_flags.value;
			defaults.value = tmp_defaults.value;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}
}

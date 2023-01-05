
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
 * IAudioAdapter.java
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
 * The IAudioAdapter interface represents the virtual audio adapter of the
 * virtual machine. Used in
 * {@link org.virtualbox_4_2.IMachine#getAudioAdapter()}.
 * 
 * Interface ID: <tt>{921873DB-5F3F-4B69-91F9-7BE9E535A2CB}</tt>
 */
public class IAudioAdapter extends IUnknown {

	public IAudioAdapter(String wrapped, VboxPortType port) {
		super(wrapped, port);
	}

	/**
	 * 
	 * Flag whether the audio adapter is present in the guest system. If disabled,
	 * the virtual guest hardware will not contain any audio adapter. Can only be
	 * changed when the VM is not running.
	 * 
	 * @return Boolean
	 * 
	 */
	public Boolean getEnabled() {
		try {
			Boolean retVal = port.iAudioAdapterGetEnabled(obj);
			return retVal;
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Flag whether the audio adapter is present in the guest system. If disabled,
	 * the virtual guest hardware will not contain any audio adapter. Can only be
	 * changed when the VM is not running.
	 * 
	 * @param value Boolean
	 * 
	 */
	public void setEnabled(Boolean value) {
		try {
			port.iAudioAdapterSetEnabled(obj, value);
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The audio hardware we emulate.
	 * 
	 * @return org.virtualbox_4_2.AudioControllerType
	 * 
	 */
	public org.virtualbox_4_2.AudioControllerType getAudioController() {
		try {
			org.virtualbox_4_2.jaxws.AudioControllerType retVal = port.iAudioAdapterGetAudioController(obj);
			return org.virtualbox_4_2.AudioControllerType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * The audio hardware we emulate.
	 * 
	 * @param value org.virtualbox_4_2.AudioControllerType
	 * 
	 */
	public void setAudioController(org.virtualbox_4_2.AudioControllerType value) {
		try {
			port.iAudioAdapterSetAudioController(obj,
					org.virtualbox_4_2.jaxws.AudioControllerType.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Audio driver the adapter is connected to. This setting can only be changed
	 * when the VM is not running.
	 * 
	 * @return org.virtualbox_4_2.AudioDriverType
	 * 
	 */
	public org.virtualbox_4_2.AudioDriverType getAudioDriver() {
		try {
			org.virtualbox_4_2.jaxws.AudioDriverType retVal = port.iAudioAdapterGetAudioDriver(obj);
			return org.virtualbox_4_2.AudioDriverType.fromValue(retVal.value());
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	/**
	 * 
	 * Audio driver the adapter is connected to. This setting can only be changed
	 * when the VM is not running.
	 * 
	 * @param value org.virtualbox_4_2.AudioDriverType
	 * 
	 */
	public void setAudioDriver(org.virtualbox_4_2.AudioDriverType value) {
		try {
			port.iAudioAdapterSetAudioDriver(obj, org.virtualbox_4_2.jaxws.AudioDriverType.fromValue(value.name()));
		} catch (InvalidObjectFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		} catch (RuntimeFaultMsg e) {
			throw new VBoxException(e, e.getMessage());
		}
	}

	public static IAudioAdapter queryInterface(IUnknown obj) {
		return obj == null ? null : new IAudioAdapter(obj.getWrapped(), obj.getRemoteWSPort());
	}
}

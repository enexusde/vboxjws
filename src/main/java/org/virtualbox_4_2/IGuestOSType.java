
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
 * IGuestOSType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_4_2;

import org.virtualbox_4_2.jaxws.VboxPortType;

/**
 * 
 * Interface ID: <tt>{6D968F9A-858B-4C50-BF17-241F069E94C2}</tt>
 */
public class IGuestOSType {

	private org.virtualbox_4_2.jaxws.IGuestOSType real;
	private VboxPortType port;

	public IGuestOSType(org.virtualbox_4_2.jaxws.IGuestOSType real, VboxPortType port) {
		this.real = real;
		this.port = port;
	}

	public String getFamilyId() {
		String retVal = real.getFamilyId();
		return retVal;
	}

	public String getFamilyDescription() {
		String retVal = real.getFamilyDescription();
		return retVal;
	}

	public String getId() {
		String retVal = real.getId();
		return retVal;
	}

	public String getDescription() {
		String retVal = real.getDescription();
		return retVal;
	}

	public Boolean getIs64Bit() {
		Boolean retVal = real.isIs64Bit();
		return retVal;
	}

	public Boolean getRecommendedIOAPIC() {
		Boolean retVal = real.isRecommendedIOAPIC();
		return retVal;
	}

	public Boolean getRecommendedVirtEx() {
		Boolean retVal = real.isRecommendedVirtEx();
		return retVal;
	}

	public Long getRecommendedRAM() {
		Long retVal = real.getRecommendedRAM();
		return retVal;
	}

	public Long getRecommendedVRAM() {
		Long retVal = real.getRecommendedVRAM();
		return retVal;
	}

	public Boolean getRecommended2DVideoAcceleration() {
		Boolean retVal = real.isRecommended2DVideoAcceleration();
		return retVal;
	}

	public Boolean getRecommended3DAcceleration() {
		Boolean retVal = real.isRecommended3DAcceleration();
		return retVal;
	}

	public Long getRecommendedHDD() {
		Long retVal = real.getRecommendedHDD();
		return retVal;
	}

	public org.virtualbox_4_2.NetworkAdapterType getAdapterType() {
		org.virtualbox_4_2.jaxws.NetworkAdapterType retVal = real.getAdapterType();
		return org.virtualbox_4_2.NetworkAdapterType.fromValue(retVal.value());
	}

	public Boolean getRecommendedPAE() {
		Boolean retVal = real.isRecommendedPAE();
		return retVal;
	}

	public org.virtualbox_4_2.StorageControllerType getRecommendedDVDStorageController() {
		org.virtualbox_4_2.jaxws.StorageControllerType retVal = real.getRecommendedDVDStorageController();
		return org.virtualbox_4_2.StorageControllerType.fromValue(retVal.value());
	}

	public org.virtualbox_4_2.StorageBus getRecommendedDVDStorageBus() {
		org.virtualbox_4_2.jaxws.StorageBus retVal = real.getRecommendedDVDStorageBus();
		return org.virtualbox_4_2.StorageBus.fromValue(retVal.value());
	}

	public org.virtualbox_4_2.StorageControllerType getRecommendedHDStorageController() {
		org.virtualbox_4_2.jaxws.StorageControllerType retVal = real.getRecommendedHDStorageController();
		return org.virtualbox_4_2.StorageControllerType.fromValue(retVal.value());
	}

	public org.virtualbox_4_2.StorageBus getRecommendedHDStorageBus() {
		org.virtualbox_4_2.jaxws.StorageBus retVal = real.getRecommendedHDStorageBus();
		return org.virtualbox_4_2.StorageBus.fromValue(retVal.value());
	}

	public org.virtualbox_4_2.FirmwareType getRecommendedFirmware() {
		org.virtualbox_4_2.jaxws.FirmwareType retVal = real.getRecommendedFirmware();
		return org.virtualbox_4_2.FirmwareType.fromValue(retVal.value());
	}

	public Boolean getRecommendedUSBHID() {
		Boolean retVal = real.isRecommendedUSBHID();
		return retVal;
	}

	public Boolean getRecommendedHPET() {
		Boolean retVal = real.isRecommendedHPET();
		return retVal;
	}

	public Boolean getRecommendedUSBTablet() {
		Boolean retVal = real.isRecommendedUSBTablet();
		return retVal;
	}

	public Boolean getRecommendedRTCUseUTC() {
		Boolean retVal = real.isRecommendedRTCUseUTC();
		return retVal;
	}

	public org.virtualbox_4_2.ChipsetType getRecommendedChipset() {
		org.virtualbox_4_2.jaxws.ChipsetType retVal = real.getRecommendedChipset();
		return org.virtualbox_4_2.ChipsetType.fromValue(retVal.value());
	}

	public org.virtualbox_4_2.AudioControllerType getRecommendedAudioController() {
		org.virtualbox_4_2.jaxws.AudioControllerType retVal = real.getRecommendedAudioController();
		return org.virtualbox_4_2.AudioControllerType.fromValue(retVal.value());
	}

	public Boolean getRecommendedFloppy() {
		Boolean retVal = real.isRecommendedFloppy();
		return retVal;
	}

	public Boolean getRecommendedUSB() {
		Boolean retVal = real.isRecommendedUSB();
		return retVal;
	}
}

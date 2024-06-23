
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
 * IGuestOSType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;
import java.util.List;


/**


Interface ID: <code>{966303D0-36A8-4180-8971-18650B0D1055}</code>
*/
public class IGuestOSType
{

    private org.virtualbox_7_0.jaxws.IGuestOSType real;
    private VboxPortType port;
    private ObjectRefManager objMgr;

    public IGuestOSType(org.virtualbox_7_0.jaxws.IGuestOSType real, ObjectRefManager objMgr, VboxPortType port)
    {
        this.real = real;
        this.port = port;
        this.objMgr = objMgr;
    }

    private ObjectRefManager getObjMgr()
    {
        return this.objMgr;
    }

/**
Guest OS family identifier string.
@return String
*/
    public String getFamilyId()
    {
        String retVal = real.getFamilyId();
        return retVal;
    }

/**
Human readable description of the guest OS family.
@return String
*/
    public String getFamilyDescription()
    {
        String retVal = real.getFamilyDescription();
        return retVal;
    }

/**
Guest OS identifier string.
@return String
*/
    public String getId()
    {
        String retVal = real.getId();
        return retVal;
    }

/**
Human readable description of the guest OS.
@return String
*/
    public String getDescription()
    {
        String retVal = real.getDescription();
        return retVal;
    }

/**
Returns  true if the given OS is 64-bit
@return Boolean
*/
    public Boolean getIs64Bit()
    {
        Boolean retVal = real.isIs64Bit();
        return retVal;
    }

/**
Returns  true if I/O-APIC recommended for this OS type.
@return Boolean
*/
    public Boolean getRecommendedIOAPIC()
    {
        Boolean retVal = real.isRecommendedIOAPIC();
        return retVal;
    }

/**
Returns  true if VT-x or AMD-V recommended for this OS type.
@return Boolean
*/
    public Boolean getRecommendedVirtEx()
    {
        Boolean retVal = real.isRecommendedVirtEx();
        return retVal;
    }

/**
Recommended RAM size in Megabytes.
@return Long
*/
    public Long getRecommendedRAM()
    {
        Long retVal = real.getRecommendedRAM();
        return retVal;
    }

/**
Recommended graphics controller type.
@return org.virtualbox_7_0.GraphicsControllerType
*/
    public org.virtualbox_7_0.GraphicsControllerType getRecommendedGraphicsController()
    {
        org.virtualbox_7_0.jaxws.GraphicsControllerType retVal = real.getRecommendedGraphicsController();
        return org.virtualbox_7_0.GraphicsControllerType.fromValue(retVal.value());
    }

/**
Recommended video RAM size in Megabytes.
@return Long
*/
    public Long getRecommendedVRAM()
    {
        Long retVal = real.getRecommendedVRAM();
        return retVal;
    }

/**
Returns  true if 2D video acceleration is recommended for this OS type.
@return Boolean
*/
    public Boolean getRecommended2DVideoAcceleration()
    {
        Boolean retVal = real.isRecommended2DVideoAcceleration();
        return retVal;
    }

/**
Returns  true if 3D acceleration is recommended for this OS type.
@return Boolean
*/
    public Boolean getRecommended3DAcceleration()
    {
        Boolean retVal = real.isRecommended3DAcceleration();
        return retVal;
    }

/**
Recommended hard disk size in bytes.
@return Long
*/
    public Long getRecommendedHDD()
    {
        Long retVal = real.getRecommendedHDD();
        return retVal;
    }

/**
Returns recommended network adapter for this OS type.
@return org.virtualbox_7_0.NetworkAdapterType
*/
    public org.virtualbox_7_0.NetworkAdapterType getAdapterType()
    {
        org.virtualbox_7_0.jaxws.NetworkAdapterType retVal = real.getAdapterType();
        return org.virtualbox_7_0.NetworkAdapterType.fromValue(retVal.value());
    }

/**
Returns  true if using PAE is recommended for this OS type.
@return Boolean
*/
    public Boolean getRecommendedPAE()
    {
        Boolean retVal = real.isRecommendedPAE();
        return retVal;
    }

/**
Recommended storage controller type for DVD/CD drives.
@return org.virtualbox_7_0.StorageControllerType
*/
    public org.virtualbox_7_0.StorageControllerType getRecommendedDVDStorageController()
    {
        org.virtualbox_7_0.jaxws.StorageControllerType retVal = real.getRecommendedDVDStorageController();
        return org.virtualbox_7_0.StorageControllerType.fromValue(retVal.value());
    }

/**
Recommended storage bus type for DVD/CD drives.
@return org.virtualbox_7_0.StorageBus
*/
    public org.virtualbox_7_0.StorageBus getRecommendedDVDStorageBus()
    {
        org.virtualbox_7_0.jaxws.StorageBus retVal = real.getRecommendedDVDStorageBus();
        return org.virtualbox_7_0.StorageBus.fromValue(retVal.value());
    }

/**
Recommended storage controller type for HD drives.
@return org.virtualbox_7_0.StorageControllerType
*/
    public org.virtualbox_7_0.StorageControllerType getRecommendedHDStorageController()
    {
        org.virtualbox_7_0.jaxws.StorageControllerType retVal = real.getRecommendedHDStorageController();
        return org.virtualbox_7_0.StorageControllerType.fromValue(retVal.value());
    }

/**
Recommended storage bus type for HD drives.
@return org.virtualbox_7_0.StorageBus
*/
    public org.virtualbox_7_0.StorageBus getRecommendedHDStorageBus()
    {
        org.virtualbox_7_0.jaxws.StorageBus retVal = real.getRecommendedHDStorageBus();
        return org.virtualbox_7_0.StorageBus.fromValue(retVal.value());
    }

/**
Recommended firmware type.
@return org.virtualbox_7_0.FirmwareType
*/
    public org.virtualbox_7_0.FirmwareType getRecommendedFirmware()
    {
        org.virtualbox_7_0.jaxws.FirmwareType retVal = real.getRecommendedFirmware();
        return org.virtualbox_7_0.FirmwareType.fromValue(retVal.value());
    }

/**
Returns  true if using USB Human Interface Devices, such as keyboard and mouse recommended.
@return Boolean
*/
    public Boolean getRecommendedUSBHID()
    {
        Boolean retVal = real.isRecommendedUSBHID();
        return retVal;
    }

/**
Returns  true if using HPET is recommended for this OS type.
@return Boolean
*/
    public Boolean getRecommendedHPET()
    {
        Boolean retVal = real.isRecommendedHPET();
        return retVal;
    }

/**
Returns  true if using a USB Tablet is recommended.
@return Boolean
*/
    public Boolean getRecommendedUSBTablet()
    {
        Boolean retVal = real.isRecommendedUSBTablet();
        return retVal;
    }

/**
Returns  true if the RTC of this VM should be set to UTC
@return Boolean
*/
    public Boolean getRecommendedRTCUseUTC()
    {
        Boolean retVal = real.isRecommendedRTCUseUTC();
        return retVal;
    }

/**
Recommended chipset type.
@return org.virtualbox_7_0.ChipsetType
*/
    public org.virtualbox_7_0.ChipsetType getRecommendedChipset()
    {
        org.virtualbox_7_0.jaxws.ChipsetType retVal = real.getRecommendedChipset();
        return org.virtualbox_7_0.ChipsetType.fromValue(retVal.value());
    }

/**
Recommended IOMMU type.
@return org.virtualbox_7_0.IommuType
*/
    public org.virtualbox_7_0.IommuType getRecommendedIommuType()
    {
        org.virtualbox_7_0.jaxws.IommuType retVal = real.getRecommendedIommuType();
        return org.virtualbox_7_0.IommuType.fromValue(retVal.value());
    }

/**
Recommended audio controller type.
@return org.virtualbox_7_0.AudioControllerType
*/
    public org.virtualbox_7_0.AudioControllerType getRecommendedAudioController()
    {
        org.virtualbox_7_0.jaxws.AudioControllerType retVal = real.getRecommendedAudioController();
        return org.virtualbox_7_0.AudioControllerType.fromValue(retVal.value());
    }

/**
Recommended audio codec type.
@return org.virtualbox_7_0.AudioCodecType
*/
    public org.virtualbox_7_0.AudioCodecType getRecommendedAudioCodec()
    {
        org.virtualbox_7_0.jaxws.AudioCodecType retVal = real.getRecommendedAudioCodec();
        return org.virtualbox_7_0.AudioCodecType.fromValue(retVal.value());
    }

/**
Returns  true a floppy drive is recommended for this OS type.
@return Boolean
*/
    public Boolean getRecommendedFloppy()
    {
        Boolean retVal = real.isRecommendedFloppy();
        return retVal;
    }

/**
Returns  true a USB controller is recommended for this OS type.
@return Boolean
*/
    public Boolean getRecommendedUSB()
    {
        Boolean retVal = real.isRecommendedUSB();
        return retVal;
    }

/**
Returns  true an xHCI (USB 3) controller is recommended for this OS type.
@return Boolean
*/
    public Boolean getRecommendedUSB3()
    {
        Boolean retVal = real.isRecommendedUSB3();
        return retVal;
    }

/**
Returns  true if using VCPU reset on triple fault is recommended for this OS type.
@return Boolean
*/
    public Boolean getRecommendedTFReset()
    {
        Boolean retVal = real.isRecommendedTFReset();
        return retVal;
    }

/**
Returns  true if X2APIC is recommended for this OS type.
@return Boolean
*/
    public Boolean getRecommendedX2APIC()
    {
        Boolean retVal = real.isRecommendedX2APIC();
        return retVal;
    }

/**
Number of vCPUs recommended for this OS type.
@return Long
*/
    public Long getRecommendedCPUCount()
    {
        Long retVal = real.getRecommendedCPUCount();
        return retVal;
    }

/**
Returns the recommended trusted platform module type for this OS type.
@return org.virtualbox_7_0.TpmType
*/
    public org.virtualbox_7_0.TpmType getRecommendedTpmType()
    {
        org.virtualbox_7_0.jaxws.TpmType retVal = real.getRecommendedTpmType();
        return org.virtualbox_7_0.TpmType.fromValue(retVal.value());
    }

/**
Returns  true if EFI secure boot is recommended for this OS type.
@return Boolean
*/
    public Boolean getRecommendedSecureBoot()
    {
        Boolean retVal = real.isRecommendedSecureBoot();
        return retVal;
    }

/**
Returns  true if this OS usually has a WDDM graphics driver
from guest additions.
@return Boolean
*/
    public Boolean getRecommendedWDDMGraphics()
    {
        Boolean retVal = real.isRecommendedWDDMGraphics();
        return retVal;
    }
}

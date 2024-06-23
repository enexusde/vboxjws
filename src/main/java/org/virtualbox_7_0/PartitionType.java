
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
 * PartitionType.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/glue/glue-java.xsl
 */

package org.virtualbox_7_0;

import org.virtualbox_7_0.jaxws.*;
import jakarta.xml.ws.*;

/**

Interface ID: <code>{84A6629C-8E9C-474C-ADBB-21995671597F}</code>
*/
public enum PartitionType
{

/**
Empty partition entry
*/
    Empty(0),

/**
FAT12 if partition size less than 65536 sectors
*/
    FAT12(1),

/**
FAT16 if partition size less than 65536 sectors
*/
    FAT16(4),

/**
FAT12 or FAT16 if partition size greater or equal than 65536 sectors
*/
    FAT(6),

/**
NT and OS/2 installable file system, e.g. NTFS, exFAT, HPFS.
*/
    IFS(7),

/**
The FAT32 with CHS addressing.
*/
    FAT32CHS(11),

/**
The FAT32 with LBA addressing.
*/
    FAT32LBA(12),

/**
The FAT16 with LBA addressing.
*/
    FAT16B(14),

/**
The extended partition with LBA addressing.
*/
    Extended(15),

/**
Windows Recovery Environment (RE) partition (hidden NTFS partition).
*/
    WindowsRE(39),

/**
The linux swap partition (old versions).
*/
    LinuxSwapOld(66),

/**
The linux native partition (old versions).
*/
    LinuxOld(67),

/**
The BSD slice.
*/
    DragonFlyBSDSlice(108),

/**
The linux swap partition.
*/
    LinuxSwap(130),

/**
The linux native partition.
*/
    Linux(131),

/**
The linux extended partition.
*/
    LinuxExtended(133),

/**
The linux LVM partition.
*/
    LinuxLVM(142),

/**
The BSD slice.
*/
    BSDSlice(165),

/**
The Apple UFS partition.
*/
    AppleUFS(168),

/**
The Apple HFS partition.
*/
    AppleHFS(175),

/**
The Apple HFS partition.
*/
    Solaris(191),

/**
The GPT protective MBR partition.
*/
    GPT(238),

/**
The EFI system partition.
*/
    EFI(239),

/**
Unknown partition type.
*/
    Unknown(256),

/**
MBR partition scheme.
*/
    MBR(257),

/**
Intel Fast Flash (iFFS) partition.
*/
    iFFS(258),

/**
Sony boot partition.
*/
    SonyBoot(259),

/**
Lenovo boot partition.
*/
    LenovoBoot(260),

/**
Microsoft Reserved Partition (MSR).
*/
    WindowsMSR(270),

/**
Windows Basic data partition
*/
    WindowsBasicData(271),

/**
Windows Logical Disk Manager (LDM) metadata partition.
*/
    WindowsLDMMeta(272),

/**
Windows Logical Disk Manager data partition.
*/
    WindowsLDMData(273),

/**
Windows Recovery Environment.
*/
    WindowsRecovery(274),

/**
Windows Storage Spaces partition.
*/
    WindowsStorageSpaces(276),

/**
Windows Storage Replica partition.
*/
    WindowsStorageReplica(277),

/**
IBM General Parallel File System (GPFS) partition.
*/
    IBMGPFS(275),

/**
Linux filesystem data.
*/
    LinuxData(300),

/**
Linux RAID partition.
*/
    LinuxRAID(301),

/**
Linux root partition for x86.
*/
    LinuxRootX86(302),

/**
Linux root partition for AMD64.
*/
    LinuxRootAMD64(303),

/**
Linux root partition for ARM32.
*/
    LinuxRootARM32(304),

/**
Linux root partition for ARM64 / AArch64.
*/
    LinuxRootARM64(305),

/**
Linux /home partition.
*/
    LinuxHome(306),

/**
Linux /srv partition.
*/
    LinuxSrv(307),

/**
Linux plain dm-crypt partition.
*/
    LinuxPlainDmCrypt(308),

/**
Linux unitified key setup (LUKS) partition.
*/
    LinuxLUKS(309),

/**
Linux reserved partition.
*/
    LinuxReserved(310),

/**
FreeBSD boot partition.
*/
    FreeBSDBoot(330),

/**
FreeBSD data partition.
*/
    FreeBSDData(331),

/**
FreeBSD swap partition.
*/
    FreeBSDSwap(332),

/**
FreeBSD unix file system (UFS) partition.
*/
    FreeBSDUFS(333),

/**
FreeBSD Vinum volume manager partition.
*/
    FreeBSDVinum(334),

/**
FreeBSD ZFS partition.
*/
    FreeBSDZFS(335),

/**
Unknown FreeBSD partition.
*/
    FreeBSDUnknown(359),

/**
Apple hierarchical file system plus (HFS+) partition.
*/
    AppleHFSPlus(360),

/**
Apple APFS/FileFault container partition.
*/
    AppleAPFS(361),

/**
Apple RAID partition.
*/
    AppleRAID(362),

/**
Apple RAID partition, offline.
*/
    AppleRAIDOffline(363),

/**
Apple boot partition.
*/
    AppleBoot(364),

/**
Apple label.
*/
    AppleLabel(365),

/**
Apple TV recovery partition.
*/
    AppleTvRecovery(366),

/**
Apple Core Storage Containe.
*/
    AppleCoreStorage(367),

/**
SoftRAID status.
*/
    SoftRAIDStatus(370),

/**
SoftRAID scratch.
*/
    SoftRAIDScratch(371),

/**
SoftRAID volume.
*/
    SoftRAIDVolume(372),

/**
SoftRAID cache.
*/
    SoftRAIDCache(373),

/**
Unknown Apple partition.
*/
    AppleUnknown(389),

/**
Solaris boot partition.
*/
    SolarisBoot(390),

/**
Solaris root partition.
*/
    SolarisRoot(391),

/**
Solaris swap partition.
*/
    SolarisSwap(392),

/**
Solaris backup partition.
*/
    SolarisBackup(393),

/**
Solaris /usr partition.
*/
    SolarisUsr(394),

/**
Solaris /var partition.
*/
    SolarisVar(395),

/**
Solaris /home partition.
*/
    SolarisHome(396),

/**
Solaris alternate sector.
*/
    SolarisAltSector(397),

/**
Solaris reserved partition.
*/
    SolarisReserved(398),

/**
Unknown Solaris partition.
*/
    SolarisUnknown(419),

/**
NetBSD swap partition.
*/
    NetBSDSwap(420),

/**
NetBSD fast file system (FFS) partition.
*/
    NetBSDFFS(421),

/**
NetBSD log structured file system (LFS) partition.
*/
    NetBSDLFS(422),

/**
NetBSD RAID partition.
*/
    NetBSDRAID(423),

/**
NetBSD concatenated partition.
*/
    NetBSDConcatenated(424),

/**
NetBSD encrypted partition.
*/
    NetBSDEncrypted(425),

/**
Unknown NetBSD partition.
*/
    NetBSDUnknown(449),

/**
Chrome OS kernel partition.
*/
    ChromeOSKernel(450),

/**
Chrome OS root file system partition.
*/
    ChromeOSRootFS(451),

/**
Chrome OS partition reserved for future.
*/
    ChromeOSFuture(452),

/**
Container Linux /usr partition.
*/
    ContLnxUsr(480),

/**
Container Linux resizable root filesystem partition.
*/
    ContLnxRoot(481),

/**
Container Linux OEM customization partition.
*/
    ContLnxReserved(482),

/**
Container Linux root filesystem on RAID partition.
*/
    ContLnxRootRAID(483),

/**
Haiku BFS
*/
    HaikuBFS(510),

/**
MidnightBSD boot partition.
*/
    MidntBSDBoot(540),

/**
MidnightBSD data partition.
*/
    MidntBSDData(541),

/**
MidnightBSD swap partition.
*/
    MidntBSDSwap(542),

/**
MidnightBSD unix file system (UFS) partition.
*/
    MidntBSDUFS(543),

/**
MidnightBSD Vinum volume manager partition.
*/
    MidntBSDVium(544),

/**
MidnightBSD ZFS partition.
*/
    MidntBSDZFS(545),

/**
Unknown MidnightBSD partition.
*/
    MidntBSDUnknown(569),

/**
OpenBSD data partition.
*/
    OpenBSDData(570),

/**
QNX power-safe file system partition.
*/
    QNXPowerSafeFS(600),

/**
Plan 9 partition.
*/
    Plan9(630),

/**
VMWare ESX coredump partition.
*/
    VMWareVMKCore(660),

/**
VMWare ESX virtual machine file system (VMFS) partition.
*/
    VMWareVMFS(661),

/**
VMWare ESX reserved partition.
*/
    VMWareReserved(662),

/**
Unknown VMWare partition.
*/
    VMWareUnknown(689),

/**
Android x86 bootloader partition.
*/
    AndroidX86Bootloader(690),

/**
Android x86 bootloader2 partition.
*/
    AndroidX86Bootloader2(691),

/**
Android x86 boot partition.
*/
    AndroidX86Boot(692),

/**
Android x86 recovery partition.
*/
    AndroidX86Recovery(693),

/**
Android x86 misc partition.
*/
    AndroidX86Misc(694),

/**
Android x86 metadata partition.
*/
    AndroidX86Metadata(695),

/**
Android x86 system partition.
*/
    AndroidX86System(696),

/**
Android x86 cache partition.
*/
    AndroidX86Cache(697),

/**
Android x86 data partition.
*/
    AndroidX86Data(698),

/**
Android x86 persistent data partition.
*/
    AndroidX86Persistent(699),

/**
Android x86 vendor partition.
*/
    AndroidX86Vendor(700),

/**
Android x86 config partition.
*/
    AndroidX86Config(701),

/**
Android x86 factory partition.
*/
    AndroidX86Factory(702),

/**
Android x86 alternative factory partition.
*/
    AndroidX86FactoryAlt(703),

/**
Android x86 fastboot partition.
*/
    AndroidX86Fastboot(704),

/**
Android x86 OEM partition.
*/
    AndroidX86OEM(705),

/**
Android ARM meta partition.
*/
    AndroidARMMeta(720),

/**
Android ARM EXT partition.
*/
    AndroidARMExt(721),

/**
Open Network Install Environment (ONIE) boot partition.
*/
    ONIEBoot(750),

/**
Open Network Install Environment (ONIE) config partition.
*/
    ONIEConfig(751),

/**
PowerPC PReP boot partition.
*/
    PowerPCPrep(780),

/**
freedesktop.org shared boot loader configuration partition.
*/
    XDGShrBootConfig(810),

/**
Ceph block partition.
*/
    CephBlock(830),

/**
Ceph block DB partition.
*/
    CephBlockDB(831),

/**
Ceph dm-crypt block DB partition.
*/
    CephBlockDBDmc(832),

/**
Ceph dm-crypt Linux unitified key setup (LUKS) block DB partition.
*/
    CephBlockDBDmcLUKS(833),

/**
Ceph dm-crypt block partition.
*/
    CephBlockDmc(834),

/**
Ceph dm-crypt Linux unitified key setup (LUKS) block partition.
*/
    CephBlockDmcLUKS(835),

/**
Ceph block write-ahead log partition.
*/
    CephBlockWALog(836),

/**
Ceph dm-crypt block write-ahead log partition.
*/
    CephBlockWALogDmc(837),

/**
Ceph dm-crypt Linux unitified key setup (LUKS) block write-ahead log partition.
*/
    CephBlockWALogDmcLUKS(838),

/**
Ceph disk in creation partition.
*/
    CephDisk(839),

/**
Ceph dm-crypt disk in creation partition.
*/
    CephDiskDmc(840),

/**
Ceph Journal partition.
*/
    CephJournal(841),

/**
Ceph dm-crypt journal partition.
*/
    CephJournalDmc(842),

/**
Ceph dm-crypt Linux unitified key setup (LUKS) journal partition.
*/
    CephJournalDmcLUKS(843),

/**
Ceph Lockbox for dm-crypt keys partition.
*/
    CephLockbox(844),

/**
Ceph multipath block 1 partition.
*/
    CephMultipathBlock1(845),

/**
Ceph multipath block 2 partition.
*/
    CephMultipathBlock2(846),

/**
Ceph multipath block DB partition.
*/
    CephMultipathBlockDB(847),

/**
Ceph multipath block write-ahead log partition.
*/
    CephMultipathBLockWALog(848),

/**
Ceph multipath journal partition.
*/
    CephMultipathJournal(849),

/**
Ceph multipath object storage deamon (OSD) partition.
*/
    CephMultipathOSD(851),

/**
Ceph object storage deamon (OSD) partition.
*/
    CephOSD(852),

/**
Ceph dm-crypt object storage deamon (OSD) partition.
*/
    CephOSDDmc(853),

/**
Ceph dm-crypt Linux unitified key setup (LUKS) object storage deamon (OSD) partition.
*/
    CephOSDDmcLUKS(854);

    private final int value;

    PartitionType(int v)
    {
        value = v;
    }

    public int value()
    {
        return value;
    }

    public static PartitionType fromValue(long v)
    {
        for (PartitionType c: PartitionType.values())
        {
            if (c.value == (int)v)
            {
                return c;
            }
        }
        throw new IllegalArgumentException(Long.toString(v));
    }

    public static PartitionType fromValue(String v)
    {
        return valueOf(PartitionType.class, v);
    }
}


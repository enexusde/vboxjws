
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartitionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartitionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Empty"/>
 *     &lt;enumeration value="FAT12"/>
 *     &lt;enumeration value="FAT16"/>
 *     &lt;enumeration value="FAT"/>
 *     &lt;enumeration value="IFS"/>
 *     &lt;enumeration value="FAT32CHS"/>
 *     &lt;enumeration value="FAT32LBA"/>
 *     &lt;enumeration value="FAT16B"/>
 *     &lt;enumeration value="Extended"/>
 *     &lt;enumeration value="WindowsRE"/>
 *     &lt;enumeration value="LinuxSwapOld"/>
 *     &lt;enumeration value="LinuxOld"/>
 *     &lt;enumeration value="DragonFlyBSDSlice"/>
 *     &lt;enumeration value="LinuxSwap"/>
 *     &lt;enumeration value="Linux"/>
 *     &lt;enumeration value="LinuxExtended"/>
 *     &lt;enumeration value="LinuxLVM"/>
 *     &lt;enumeration value="BSDSlice"/>
 *     &lt;enumeration value="AppleUFS"/>
 *     &lt;enumeration value="AppleHFS"/>
 *     &lt;enumeration value="Solaris"/>
 *     &lt;enumeration value="GPT"/>
 *     &lt;enumeration value="EFI"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="MBR"/>
 *     &lt;enumeration value="iFFS"/>
 *     &lt;enumeration value="SonyBoot"/>
 *     &lt;enumeration value="LenovoBoot"/>
 *     &lt;enumeration value="WindowsMSR"/>
 *     &lt;enumeration value="WindowsBasicData"/>
 *     &lt;enumeration value="WindowsLDMMeta"/>
 *     &lt;enumeration value="WindowsLDMData"/>
 *     &lt;enumeration value="WindowsRecovery"/>
 *     &lt;enumeration value="WindowsStorageSpaces"/>
 *     &lt;enumeration value="WindowsStorageReplica"/>
 *     &lt;enumeration value="IBMGPFS"/>
 *     &lt;enumeration value="LinuxData"/>
 *     &lt;enumeration value="LinuxRAID"/>
 *     &lt;enumeration value="LinuxRootX86"/>
 *     &lt;enumeration value="LinuxRootAMD64"/>
 *     &lt;enumeration value="LinuxRootARM32"/>
 *     &lt;enumeration value="LinuxRootARM64"/>
 *     &lt;enumeration value="LinuxHome"/>
 *     &lt;enumeration value="LinuxSrv"/>
 *     &lt;enumeration value="LinuxPlainDmCrypt"/>
 *     &lt;enumeration value="LinuxLUKS"/>
 *     &lt;enumeration value="LinuxReserved"/>
 *     &lt;enumeration value="FreeBSDBoot"/>
 *     &lt;enumeration value="FreeBSDData"/>
 *     &lt;enumeration value="FreeBSDSwap"/>
 *     &lt;enumeration value="FreeBSDUFS"/>
 *     &lt;enumeration value="FreeBSDVinum"/>
 *     &lt;enumeration value="FreeBSDZFS"/>
 *     &lt;enumeration value="FreeBSDUnknown"/>
 *     &lt;enumeration value="AppleHFSPlus"/>
 *     &lt;enumeration value="AppleAPFS"/>
 *     &lt;enumeration value="AppleRAID"/>
 *     &lt;enumeration value="AppleRAIDOffline"/>
 *     &lt;enumeration value="AppleBoot"/>
 *     &lt;enumeration value="AppleLabel"/>
 *     &lt;enumeration value="AppleTvRecovery"/>
 *     &lt;enumeration value="AppleCoreStorage"/>
 *     &lt;enumeration value="SoftRAIDStatus"/>
 *     &lt;enumeration value="SoftRAIDScratch"/>
 *     &lt;enumeration value="SoftRAIDVolume"/>
 *     &lt;enumeration value="SoftRAIDCache"/>
 *     &lt;enumeration value="AppleUnknown"/>
 *     &lt;enumeration value="SolarisBoot"/>
 *     &lt;enumeration value="SolarisRoot"/>
 *     &lt;enumeration value="SolarisSwap"/>
 *     &lt;enumeration value="SolarisBackup"/>
 *     &lt;enumeration value="SolarisUsr"/>
 *     &lt;enumeration value="SolarisVar"/>
 *     &lt;enumeration value="SolarisHome"/>
 *     &lt;enumeration value="SolarisAltSector"/>
 *     &lt;enumeration value="SolarisReserved"/>
 *     &lt;enumeration value="SolarisUnknown"/>
 *     &lt;enumeration value="NetBSDSwap"/>
 *     &lt;enumeration value="NetBSDFFS"/>
 *     &lt;enumeration value="NetBSDLFS"/>
 *     &lt;enumeration value="NetBSDRAID"/>
 *     &lt;enumeration value="NetBSDConcatenated"/>
 *     &lt;enumeration value="NetBSDEncrypted"/>
 *     &lt;enumeration value="NetBSDUnknown"/>
 *     &lt;enumeration value="ChromeOSKernel"/>
 *     &lt;enumeration value="ChromeOSRootFS"/>
 *     &lt;enumeration value="ChromeOSFuture"/>
 *     &lt;enumeration value="ContLnxUsr"/>
 *     &lt;enumeration value="ContLnxRoot"/>
 *     &lt;enumeration value="ContLnxReserved"/>
 *     &lt;enumeration value="ContLnxRootRAID"/>
 *     &lt;enumeration value="HaikuBFS"/>
 *     &lt;enumeration value="MidntBSDBoot"/>
 *     &lt;enumeration value="MidntBSDData"/>
 *     &lt;enumeration value="MidntBSDSwap"/>
 *     &lt;enumeration value="MidntBSDUFS"/>
 *     &lt;enumeration value="MidntBSDVium"/>
 *     &lt;enumeration value="MidntBSDZFS"/>
 *     &lt;enumeration value="MidntBSDUnknown"/>
 *     &lt;enumeration value="OpenBSDData"/>
 *     &lt;enumeration value="QNXPowerSafeFS"/>
 *     &lt;enumeration value="Plan9"/>
 *     &lt;enumeration value="VMWareVMKCore"/>
 *     &lt;enumeration value="VMWareVMFS"/>
 *     &lt;enumeration value="VMWareReserved"/>
 *     &lt;enumeration value="VMWareUnknown"/>
 *     &lt;enumeration value="AndroidX86Bootloader"/>
 *     &lt;enumeration value="AndroidX86Bootloader2"/>
 *     &lt;enumeration value="AndroidX86Boot"/>
 *     &lt;enumeration value="AndroidX86Recovery"/>
 *     &lt;enumeration value="AndroidX86Misc"/>
 *     &lt;enumeration value="AndroidX86Metadata"/>
 *     &lt;enumeration value="AndroidX86System"/>
 *     &lt;enumeration value="AndroidX86Cache"/>
 *     &lt;enumeration value="AndroidX86Data"/>
 *     &lt;enumeration value="AndroidX86Persistent"/>
 *     &lt;enumeration value="AndroidX86Vendor"/>
 *     &lt;enumeration value="AndroidX86Config"/>
 *     &lt;enumeration value="AndroidX86Factory"/>
 *     &lt;enumeration value="AndroidX86FactoryAlt"/>
 *     &lt;enumeration value="AndroidX86Fastboot"/>
 *     &lt;enumeration value="AndroidX86OEM"/>
 *     &lt;enumeration value="AndroidARMMeta"/>
 *     &lt;enumeration value="AndroidARMExt"/>
 *     &lt;enumeration value="ONIEBoot"/>
 *     &lt;enumeration value="ONIEConfig"/>
 *     &lt;enumeration value="PowerPCPrep"/>
 *     &lt;enumeration value="XDGShrBootConfig"/>
 *     &lt;enumeration value="CephBlock"/>
 *     &lt;enumeration value="CephBlockDB"/>
 *     &lt;enumeration value="CephBlockDBDmc"/>
 *     &lt;enumeration value="CephBlockDBDmcLUKS"/>
 *     &lt;enumeration value="CephBlockDmc"/>
 *     &lt;enumeration value="CephBlockDmcLUKS"/>
 *     &lt;enumeration value="CephBlockWALog"/>
 *     &lt;enumeration value="CephBlockWALogDmc"/>
 *     &lt;enumeration value="CephBlockWALogDmcLUKS"/>
 *     &lt;enumeration value="CephDisk"/>
 *     &lt;enumeration value="CephDiskDmc"/>
 *     &lt;enumeration value="CephJournal"/>
 *     &lt;enumeration value="CephJournalDmc"/>
 *     &lt;enumeration value="CephJournalDmcLUKS"/>
 *     &lt;enumeration value="CephLockbox"/>
 *     &lt;enumeration value="CephMultipathBlock1"/>
 *     &lt;enumeration value="CephMultipathBlock2"/>
 *     &lt;enumeration value="CephMultipathBlockDB"/>
 *     &lt;enumeration value="CephMultipathBLockWALog"/>
 *     &lt;enumeration value="CephMultipathJournal"/>
 *     &lt;enumeration value="CephMultipathOSD"/>
 *     &lt;enumeration value="CephOSD"/>
 *     &lt;enumeration value="CephOSDDmc"/>
 *     &lt;enumeration value="CephOSDDmcLUKS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PartitionType")
@XmlEnum
public enum PartitionType {

    @XmlEnumValue("Empty")
    EMPTY("Empty"),
    @XmlEnumValue("FAT12")
    FAT_12("FAT12"),
    @XmlEnumValue("FAT16")
    FAT_16("FAT16"),
    FAT("FAT"),
    IFS("IFS"),
    @XmlEnumValue("FAT32CHS")
    FAT_32_CHS("FAT32CHS"),
    @XmlEnumValue("FAT32LBA")
    FAT_32_LBA("FAT32LBA"),
    @XmlEnumValue("FAT16B")
    FAT_16_B("FAT16B"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended"),
    @XmlEnumValue("WindowsRE")
    WINDOWS_RE("WindowsRE"),
    @XmlEnumValue("LinuxSwapOld")
    LINUX_SWAP_OLD("LinuxSwapOld"),
    @XmlEnumValue("LinuxOld")
    LINUX_OLD("LinuxOld"),
    @XmlEnumValue("DragonFlyBSDSlice")
    DRAGON_FLY_BSD_SLICE("DragonFlyBSDSlice"),
    @XmlEnumValue("LinuxSwap")
    LINUX_SWAP("LinuxSwap"),
    @XmlEnumValue("Linux")
    LINUX("Linux"),
    @XmlEnumValue("LinuxExtended")
    LINUX_EXTENDED("LinuxExtended"),
    @XmlEnumValue("LinuxLVM")
    LINUX_LVM("LinuxLVM"),
    @XmlEnumValue("BSDSlice")
    BSD_SLICE("BSDSlice"),
    @XmlEnumValue("AppleUFS")
    APPLE_UFS("AppleUFS"),
    @XmlEnumValue("AppleHFS")
    APPLE_HFS("AppleHFS"),
    @XmlEnumValue("Solaris")
    SOLARIS("Solaris"),
    GPT("GPT"),
    EFI("EFI"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    MBR("MBR"),
    @XmlEnumValue("iFFS")
    I_FFS("iFFS"),
    @XmlEnumValue("SonyBoot")
    SONY_BOOT("SonyBoot"),
    @XmlEnumValue("LenovoBoot")
    LENOVO_BOOT("LenovoBoot"),
    @XmlEnumValue("WindowsMSR")
    WINDOWS_MSR("WindowsMSR"),
    @XmlEnumValue("WindowsBasicData")
    WINDOWS_BASIC_DATA("WindowsBasicData"),
    @XmlEnumValue("WindowsLDMMeta")
    WINDOWS_LDM_META("WindowsLDMMeta"),
    @XmlEnumValue("WindowsLDMData")
    WINDOWS_LDM_DATA("WindowsLDMData"),
    @XmlEnumValue("WindowsRecovery")
    WINDOWS_RECOVERY("WindowsRecovery"),
    @XmlEnumValue("WindowsStorageSpaces")
    WINDOWS_STORAGE_SPACES("WindowsStorageSpaces"),
    @XmlEnumValue("WindowsStorageReplica")
    WINDOWS_STORAGE_REPLICA("WindowsStorageReplica"),
    IBMGPFS("IBMGPFS"),
    @XmlEnumValue("LinuxData")
    LINUX_DATA("LinuxData"),
    @XmlEnumValue("LinuxRAID")
    LINUX_RAID("LinuxRAID"),
    @XmlEnumValue("LinuxRootX86")
    LINUX_ROOT_X_86("LinuxRootX86"),
    @XmlEnumValue("LinuxRootAMD64")
    LINUX_ROOT_AMD_64("LinuxRootAMD64"),
    @XmlEnumValue("LinuxRootARM32")
    LINUX_ROOT_ARM_32("LinuxRootARM32"),
    @XmlEnumValue("LinuxRootARM64")
    LINUX_ROOT_ARM_64("LinuxRootARM64"),
    @XmlEnumValue("LinuxHome")
    LINUX_HOME("LinuxHome"),
    @XmlEnumValue("LinuxSrv")
    LINUX_SRV("LinuxSrv"),
    @XmlEnumValue("LinuxPlainDmCrypt")
    LINUX_PLAIN_DM_CRYPT("LinuxPlainDmCrypt"),
    @XmlEnumValue("LinuxLUKS")
    LINUX_LUKS("LinuxLUKS"),
    @XmlEnumValue("LinuxReserved")
    LINUX_RESERVED("LinuxReserved"),
    @XmlEnumValue("FreeBSDBoot")
    FREE_BSD_BOOT("FreeBSDBoot"),
    @XmlEnumValue("FreeBSDData")
    FREE_BSD_DATA("FreeBSDData"),
    @XmlEnumValue("FreeBSDSwap")
    FREE_BSD_SWAP("FreeBSDSwap"),
    @XmlEnumValue("FreeBSDUFS")
    FREE_BSDUFS("FreeBSDUFS"),
    @XmlEnumValue("FreeBSDVinum")
    FREE_BSD_VINUM("FreeBSDVinum"),
    @XmlEnumValue("FreeBSDZFS")
    FREE_BSDZFS("FreeBSDZFS"),
    @XmlEnumValue("FreeBSDUnknown")
    FREE_BSD_UNKNOWN("FreeBSDUnknown"),
    @XmlEnumValue("AppleHFSPlus")
    APPLE_HFS_PLUS("AppleHFSPlus"),
    @XmlEnumValue("AppleAPFS")
    APPLE_APFS("AppleAPFS"),
    @XmlEnumValue("AppleRAID")
    APPLE_RAID("AppleRAID"),
    @XmlEnumValue("AppleRAIDOffline")
    APPLE_RAID_OFFLINE("AppleRAIDOffline"),
    @XmlEnumValue("AppleBoot")
    APPLE_BOOT("AppleBoot"),
    @XmlEnumValue("AppleLabel")
    APPLE_LABEL("AppleLabel"),
    @XmlEnumValue("AppleTvRecovery")
    APPLE_TV_RECOVERY("AppleTvRecovery"),
    @XmlEnumValue("AppleCoreStorage")
    APPLE_CORE_STORAGE("AppleCoreStorage"),
    @XmlEnumValue("SoftRAIDStatus")
    SOFT_RAID_STATUS("SoftRAIDStatus"),
    @XmlEnumValue("SoftRAIDScratch")
    SOFT_RAID_SCRATCH("SoftRAIDScratch"),
    @XmlEnumValue("SoftRAIDVolume")
    SOFT_RAID_VOLUME("SoftRAIDVolume"),
    @XmlEnumValue("SoftRAIDCache")
    SOFT_RAID_CACHE("SoftRAIDCache"),
    @XmlEnumValue("AppleUnknown")
    APPLE_UNKNOWN("AppleUnknown"),
    @XmlEnumValue("SolarisBoot")
    SOLARIS_BOOT("SolarisBoot"),
    @XmlEnumValue("SolarisRoot")
    SOLARIS_ROOT("SolarisRoot"),
    @XmlEnumValue("SolarisSwap")
    SOLARIS_SWAP("SolarisSwap"),
    @XmlEnumValue("SolarisBackup")
    SOLARIS_BACKUP("SolarisBackup"),
    @XmlEnumValue("SolarisUsr")
    SOLARIS_USR("SolarisUsr"),
    @XmlEnumValue("SolarisVar")
    SOLARIS_VAR("SolarisVar"),
    @XmlEnumValue("SolarisHome")
    SOLARIS_HOME("SolarisHome"),
    @XmlEnumValue("SolarisAltSector")
    SOLARIS_ALT_SECTOR("SolarisAltSector"),
    @XmlEnumValue("SolarisReserved")
    SOLARIS_RESERVED("SolarisReserved"),
    @XmlEnumValue("SolarisUnknown")
    SOLARIS_UNKNOWN("SolarisUnknown"),
    @XmlEnumValue("NetBSDSwap")
    NET_BSD_SWAP("NetBSDSwap"),
    @XmlEnumValue("NetBSDFFS")
    NET_BSDFFS("NetBSDFFS"),
    @XmlEnumValue("NetBSDLFS")
    NET_BSDLFS("NetBSDLFS"),
    @XmlEnumValue("NetBSDRAID")
    NET_BSDRAID("NetBSDRAID"),
    @XmlEnumValue("NetBSDConcatenated")
    NET_BSD_CONCATENATED("NetBSDConcatenated"),
    @XmlEnumValue("NetBSDEncrypted")
    NET_BSD_ENCRYPTED("NetBSDEncrypted"),
    @XmlEnumValue("NetBSDUnknown")
    NET_BSD_UNKNOWN("NetBSDUnknown"),
    @XmlEnumValue("ChromeOSKernel")
    CHROME_OS_KERNEL("ChromeOSKernel"),
    @XmlEnumValue("ChromeOSRootFS")
    CHROME_OS_ROOT_FS("ChromeOSRootFS"),
    @XmlEnumValue("ChromeOSFuture")
    CHROME_OS_FUTURE("ChromeOSFuture"),
    @XmlEnumValue("ContLnxUsr")
    CONT_LNX_USR("ContLnxUsr"),
    @XmlEnumValue("ContLnxRoot")
    CONT_LNX_ROOT("ContLnxRoot"),
    @XmlEnumValue("ContLnxReserved")
    CONT_LNX_RESERVED("ContLnxReserved"),
    @XmlEnumValue("ContLnxRootRAID")
    CONT_LNX_ROOT_RAID("ContLnxRootRAID"),
    @XmlEnumValue("HaikuBFS")
    HAIKU_BFS("HaikuBFS"),
    @XmlEnumValue("MidntBSDBoot")
    MIDNT_BSD_BOOT("MidntBSDBoot"),
    @XmlEnumValue("MidntBSDData")
    MIDNT_BSD_DATA("MidntBSDData"),
    @XmlEnumValue("MidntBSDSwap")
    MIDNT_BSD_SWAP("MidntBSDSwap"),
    @XmlEnumValue("MidntBSDUFS")
    MIDNT_BSDUFS("MidntBSDUFS"),
    @XmlEnumValue("MidntBSDVium")
    MIDNT_BSD_VIUM("MidntBSDVium"),
    @XmlEnumValue("MidntBSDZFS")
    MIDNT_BSDZFS("MidntBSDZFS"),
    @XmlEnumValue("MidntBSDUnknown")
    MIDNT_BSD_UNKNOWN("MidntBSDUnknown"),
    @XmlEnumValue("OpenBSDData")
    OPEN_BSD_DATA("OpenBSDData"),
    @XmlEnumValue("QNXPowerSafeFS")
    QNX_POWER_SAFE_FS("QNXPowerSafeFS"),
    @XmlEnumValue("Plan9")
    PLAN_9("Plan9"),
    @XmlEnumValue("VMWareVMKCore")
    VM_WARE_VMK_CORE("VMWareVMKCore"),
    @XmlEnumValue("VMWareVMFS")
    VM_WARE_VMFS("VMWareVMFS"),
    @XmlEnumValue("VMWareReserved")
    VM_WARE_RESERVED("VMWareReserved"),
    @XmlEnumValue("VMWareUnknown")
    VM_WARE_UNKNOWN("VMWareUnknown"),
    @XmlEnumValue("AndroidX86Bootloader")
    ANDROID_X_86_BOOTLOADER("AndroidX86Bootloader"),
    @XmlEnumValue("AndroidX86Bootloader2")
    ANDROID_X_86_BOOTLOADER_2("AndroidX86Bootloader2"),
    @XmlEnumValue("AndroidX86Boot")
    ANDROID_X_86_BOOT("AndroidX86Boot"),
    @XmlEnumValue("AndroidX86Recovery")
    ANDROID_X_86_RECOVERY("AndroidX86Recovery"),
    @XmlEnumValue("AndroidX86Misc")
    ANDROID_X_86_MISC("AndroidX86Misc"),
    @XmlEnumValue("AndroidX86Metadata")
    ANDROID_X_86_METADATA("AndroidX86Metadata"),
    @XmlEnumValue("AndroidX86System")
    ANDROID_X_86_SYSTEM("AndroidX86System"),
    @XmlEnumValue("AndroidX86Cache")
    ANDROID_X_86_CACHE("AndroidX86Cache"),
    @XmlEnumValue("AndroidX86Data")
    ANDROID_X_86_DATA("AndroidX86Data"),
    @XmlEnumValue("AndroidX86Persistent")
    ANDROID_X_86_PERSISTENT("AndroidX86Persistent"),
    @XmlEnumValue("AndroidX86Vendor")
    ANDROID_X_86_VENDOR("AndroidX86Vendor"),
    @XmlEnumValue("AndroidX86Config")
    ANDROID_X_86_CONFIG("AndroidX86Config"),
    @XmlEnumValue("AndroidX86Factory")
    ANDROID_X_86_FACTORY("AndroidX86Factory"),
    @XmlEnumValue("AndroidX86FactoryAlt")
    ANDROID_X_86_FACTORY_ALT("AndroidX86FactoryAlt"),
    @XmlEnumValue("AndroidX86Fastboot")
    ANDROID_X_86_FASTBOOT("AndroidX86Fastboot"),
    @XmlEnumValue("AndroidX86OEM")
    ANDROID_X_86_OEM("AndroidX86OEM"),
    @XmlEnumValue("AndroidARMMeta")
    ANDROID_ARM_META("AndroidARMMeta"),
    @XmlEnumValue("AndroidARMExt")
    ANDROID_ARM_EXT("AndroidARMExt"),
    @XmlEnumValue("ONIEBoot")
    ONIE_BOOT("ONIEBoot"),
    @XmlEnumValue("ONIEConfig")
    ONIE_CONFIG("ONIEConfig"),
    @XmlEnumValue("PowerPCPrep")
    POWER_PC_PREP("PowerPCPrep"),
    @XmlEnumValue("XDGShrBootConfig")
    XDG_SHR_BOOT_CONFIG("XDGShrBootConfig"),
    @XmlEnumValue("CephBlock")
    CEPH_BLOCK("CephBlock"),
    @XmlEnumValue("CephBlockDB")
    CEPH_BLOCK_DB("CephBlockDB"),
    @XmlEnumValue("CephBlockDBDmc")
    CEPH_BLOCK_DB_DMC("CephBlockDBDmc"),
    @XmlEnumValue("CephBlockDBDmcLUKS")
    CEPH_BLOCK_DB_DMC_LUKS("CephBlockDBDmcLUKS"),
    @XmlEnumValue("CephBlockDmc")
    CEPH_BLOCK_DMC("CephBlockDmc"),
    @XmlEnumValue("CephBlockDmcLUKS")
    CEPH_BLOCK_DMC_LUKS("CephBlockDmcLUKS"),
    @XmlEnumValue("CephBlockWALog")
    CEPH_BLOCK_WA_LOG("CephBlockWALog"),
    @XmlEnumValue("CephBlockWALogDmc")
    CEPH_BLOCK_WA_LOG_DMC("CephBlockWALogDmc"),
    @XmlEnumValue("CephBlockWALogDmcLUKS")
    CEPH_BLOCK_WA_LOG_DMC_LUKS("CephBlockWALogDmcLUKS"),
    @XmlEnumValue("CephDisk")
    CEPH_DISK("CephDisk"),
    @XmlEnumValue("CephDiskDmc")
    CEPH_DISK_DMC("CephDiskDmc"),
    @XmlEnumValue("CephJournal")
    CEPH_JOURNAL("CephJournal"),
    @XmlEnumValue("CephJournalDmc")
    CEPH_JOURNAL_DMC("CephJournalDmc"),
    @XmlEnumValue("CephJournalDmcLUKS")
    CEPH_JOURNAL_DMC_LUKS("CephJournalDmcLUKS"),
    @XmlEnumValue("CephLockbox")
    CEPH_LOCKBOX("CephLockbox"),
    @XmlEnumValue("CephMultipathBlock1")
    CEPH_MULTIPATH_BLOCK_1("CephMultipathBlock1"),
    @XmlEnumValue("CephMultipathBlock2")
    CEPH_MULTIPATH_BLOCK_2("CephMultipathBlock2"),
    @XmlEnumValue("CephMultipathBlockDB")
    CEPH_MULTIPATH_BLOCK_DB("CephMultipathBlockDB"),
    @XmlEnumValue("CephMultipathBLockWALog")
    CEPH_MULTIPATH_B_LOCK_WA_LOG("CephMultipathBLockWALog"),
    @XmlEnumValue("CephMultipathJournal")
    CEPH_MULTIPATH_JOURNAL("CephMultipathJournal"),
    @XmlEnumValue("CephMultipathOSD")
    CEPH_MULTIPATH_OSD("CephMultipathOSD"),
    @XmlEnumValue("CephOSD")
    CEPH_OSD("CephOSD"),
    @XmlEnumValue("CephOSDDmc")
    CEPH_OSD_DMC("CephOSDDmc"),
    @XmlEnumValue("CephOSDDmcLUKS")
    CEPH_OSD_DMC_LUKS("CephOSDDmcLUKS");
    private final String value;

    PartitionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartitionType fromValue(String v) {
        for (PartitionType c: PartitionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualSystemDescriptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VirtualSystemDescriptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ignore"/>
 *     &lt;enumeration value="OS"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Product"/>
 *     &lt;enumeration value="Vendor"/>
 *     &lt;enumeration value="Version"/>
 *     &lt;enumeration value="ProductUrl"/>
 *     &lt;enumeration value="VendorUrl"/>
 *     &lt;enumeration value="Description"/>
 *     &lt;enumeration value="License"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *     &lt;enumeration value="CPU"/>
 *     &lt;enumeration value="Memory"/>
 *     &lt;enumeration value="HardDiskControllerIDE"/>
 *     &lt;enumeration value="HardDiskControllerSATA"/>
 *     &lt;enumeration value="HardDiskControllerSCSI"/>
 *     &lt;enumeration value="HardDiskControllerSAS"/>
 *     &lt;enumeration value="HardDiskImage"/>
 *     &lt;enumeration value="Floppy"/>
 *     &lt;enumeration value="CDROM"/>
 *     &lt;enumeration value="NetworkAdapter"/>
 *     &lt;enumeration value="USBController"/>
 *     &lt;enumeration value="SoundCard"/>
 *     &lt;enumeration value="SettingsFile"/>
 *     &lt;enumeration value="BaseFolder"/>
 *     &lt;enumeration value="PrimaryGroup"/>
 *     &lt;enumeration value="CloudInstanceShape"/>
 *     &lt;enumeration value="CloudDomain"/>
 *     &lt;enumeration value="CloudBootDiskSize"/>
 *     &lt;enumeration value="CloudBucket"/>
 *     &lt;enumeration value="CloudOCIVCN"/>
 *     &lt;enumeration value="CloudPublicIP"/>
 *     &lt;enumeration value="CloudProfileName"/>
 *     &lt;enumeration value="CloudOCISubnet"/>
 *     &lt;enumeration value="CloudKeepObject"/>
 *     &lt;enumeration value="CloudLaunchInstance"/>
 *     &lt;enumeration value="CloudInstanceId"/>
 *     &lt;enumeration value="CloudImageId"/>
 *     &lt;enumeration value="CloudInstanceState"/>
 *     &lt;enumeration value="CloudImageState"/>
 *     &lt;enumeration value="CloudInstanceDisplayName"/>
 *     &lt;enumeration value="CloudImageDisplayName"/>
 *     &lt;enumeration value="CloudOCILaunchMode"/>
 *     &lt;enumeration value="CloudPrivateIP"/>
 *     &lt;enumeration value="CloudBootVolumeId"/>
 *     &lt;enumeration value="CloudOCIVCNCompartment"/>
 *     &lt;enumeration value="CloudOCISubnetCompartment"/>
 *     &lt;enumeration value="CloudPublicSSHKey"/>
 *     &lt;enumeration value="BootingFirmware"/>
 *     &lt;enumeration value="CloudInitScriptPath"/>
 *     &lt;enumeration value="CloudCompartmentId"/>
 *     &lt;enumeration value="CloudShapeCpus"/>
 *     &lt;enumeration value="CloudShapeMemory"/>
 *     &lt;enumeration value="HardDiskControllerVirtioSCSI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VirtualSystemDescriptionType")
@XmlEnum
public enum VirtualSystemDescriptionType {

    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    OS("OS"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Product")
    PRODUCT("Product"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),
    @XmlEnumValue("Version")
    VERSION("Version"),
    @XmlEnumValue("ProductUrl")
    PRODUCT_URL("ProductUrl"),
    @XmlEnumValue("VendorUrl")
    VENDOR_URL("VendorUrl"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),
    @XmlEnumValue("License")
    LICENSE("License"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous"),
    CPU("CPU"),
    @XmlEnumValue("Memory")
    MEMORY("Memory"),
    @XmlEnumValue("HardDiskControllerIDE")
    HARD_DISK_CONTROLLER_IDE("HardDiskControllerIDE"),
    @XmlEnumValue("HardDiskControllerSATA")
    HARD_DISK_CONTROLLER_SATA("HardDiskControllerSATA"),
    @XmlEnumValue("HardDiskControllerSCSI")
    HARD_DISK_CONTROLLER_SCSI("HardDiskControllerSCSI"),
    @XmlEnumValue("HardDiskControllerSAS")
    HARD_DISK_CONTROLLER_SAS("HardDiskControllerSAS"),
    @XmlEnumValue("HardDiskImage")
    HARD_DISK_IMAGE("HardDiskImage"),
    @XmlEnumValue("Floppy")
    FLOPPY("Floppy"),
    CDROM("CDROM"),
    @XmlEnumValue("NetworkAdapter")
    NETWORK_ADAPTER("NetworkAdapter"),
    @XmlEnumValue("USBController")
    USB_CONTROLLER("USBController"),
    @XmlEnumValue("SoundCard")
    SOUND_CARD("SoundCard"),
    @XmlEnumValue("SettingsFile")
    SETTINGS_FILE("SettingsFile"),
    @XmlEnumValue("BaseFolder")
    BASE_FOLDER("BaseFolder"),
    @XmlEnumValue("PrimaryGroup")
    PRIMARY_GROUP("PrimaryGroup"),
    @XmlEnumValue("CloudInstanceShape")
    CLOUD_INSTANCE_SHAPE("CloudInstanceShape"),
    @XmlEnumValue("CloudDomain")
    CLOUD_DOMAIN("CloudDomain"),
    @XmlEnumValue("CloudBootDiskSize")
    CLOUD_BOOT_DISK_SIZE("CloudBootDiskSize"),
    @XmlEnumValue("CloudBucket")
    CLOUD_BUCKET("CloudBucket"),
    @XmlEnumValue("CloudOCIVCN")
    CLOUD_OCIVCN("CloudOCIVCN"),
    @XmlEnumValue("CloudPublicIP")
    CLOUD_PUBLIC_IP("CloudPublicIP"),
    @XmlEnumValue("CloudProfileName")
    CLOUD_PROFILE_NAME("CloudProfileName"),
    @XmlEnumValue("CloudOCISubnet")
    CLOUD_OCI_SUBNET("CloudOCISubnet"),
    @XmlEnumValue("CloudKeepObject")
    CLOUD_KEEP_OBJECT("CloudKeepObject"),
    @XmlEnumValue("CloudLaunchInstance")
    CLOUD_LAUNCH_INSTANCE("CloudLaunchInstance"),
    @XmlEnumValue("CloudInstanceId")
    CLOUD_INSTANCE_ID("CloudInstanceId"),
    @XmlEnumValue("CloudImageId")
    CLOUD_IMAGE_ID("CloudImageId"),
    @XmlEnumValue("CloudInstanceState")
    CLOUD_INSTANCE_STATE("CloudInstanceState"),
    @XmlEnumValue("CloudImageState")
    CLOUD_IMAGE_STATE("CloudImageState"),
    @XmlEnumValue("CloudInstanceDisplayName")
    CLOUD_INSTANCE_DISPLAY_NAME("CloudInstanceDisplayName"),
    @XmlEnumValue("CloudImageDisplayName")
    CLOUD_IMAGE_DISPLAY_NAME("CloudImageDisplayName"),
    @XmlEnumValue("CloudOCILaunchMode")
    CLOUD_OCI_LAUNCH_MODE("CloudOCILaunchMode"),
    @XmlEnumValue("CloudPrivateIP")
    CLOUD_PRIVATE_IP("CloudPrivateIP"),
    @XmlEnumValue("CloudBootVolumeId")
    CLOUD_BOOT_VOLUME_ID("CloudBootVolumeId"),
    @XmlEnumValue("CloudOCIVCNCompartment")
    CLOUD_OCIVCN_COMPARTMENT("CloudOCIVCNCompartment"),
    @XmlEnumValue("CloudOCISubnetCompartment")
    CLOUD_OCI_SUBNET_COMPARTMENT("CloudOCISubnetCompartment"),
    @XmlEnumValue("CloudPublicSSHKey")
    CLOUD_PUBLIC_SSH_KEY("CloudPublicSSHKey"),
    @XmlEnumValue("BootingFirmware")
    BOOTING_FIRMWARE("BootingFirmware"),
    @XmlEnumValue("CloudInitScriptPath")
    CLOUD_INIT_SCRIPT_PATH("CloudInitScriptPath"),
    @XmlEnumValue("CloudCompartmentId")
    CLOUD_COMPARTMENT_ID("CloudCompartmentId"),
    @XmlEnumValue("CloudShapeCpus")
    CLOUD_SHAPE_CPUS("CloudShapeCpus"),
    @XmlEnumValue("CloudShapeMemory")
    CLOUD_SHAPE_MEMORY("CloudShapeMemory"),
    @XmlEnumValue("HardDiskControllerVirtioSCSI")
    HARD_DISK_CONTROLLER_VIRTIO_SCSI("HardDiskControllerVirtioSCSI");
    private final String value;

    VirtualSystemDescriptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VirtualSystemDescriptionType fromValue(String v) {
        for (VirtualSystemDescriptionType c: VirtualSystemDescriptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

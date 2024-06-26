
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageBus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StorageBus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="IDE"/>
 *     &lt;enumeration value="SATA"/>
 *     &lt;enumeration value="SCSI"/>
 *     &lt;enumeration value="Floppy"/>
 *     &lt;enumeration value="SAS"/>
 *     &lt;enumeration value="USB"/>
 *     &lt;enumeration value="PCIe"/>
 *     &lt;enumeration value="VirtioSCSI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StorageBus")
@XmlEnum
public enum StorageBus {

    @XmlEnumValue("Null")
    NULL("Null"),
    IDE("IDE"),
    SATA("SATA"),
    SCSI("SCSI"),
    @XmlEnumValue("Floppy")
    FLOPPY("Floppy"),
    SAS("SAS"),
    USB("USB"),
    @XmlEnumValue("PCIe")
    PC_IE("PCIe"),
    @XmlEnumValue("VirtioSCSI")
    VIRTIO_SCSI("VirtioSCSI");
    private final String value;

    StorageBus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StorageBus fromValue(String v) {
        for (StorageBus c: StorageBus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="Floppy"/>
 *     &lt;enumeration value="DVD"/>
 *     &lt;enumeration value="HardDisk"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="USB"/>
 *     &lt;enumeration value="SharedFolder"/>
 *     &lt;enumeration value="Graphics3D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceType")
@XmlEnum
public enum DeviceType {

    @XmlEnumValue("Null")
    NULL("Null"),
    @XmlEnumValue("Floppy")
    FLOPPY("Floppy"),
    DVD("DVD"),
    @XmlEnumValue("HardDisk")
    HARD_DISK("HardDisk"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    USB("USB"),
    @XmlEnumValue("SharedFolder")
    SHARED_FOLDER("SharedFolder"),
    @XmlEnumValue("Graphics3D")
    GRAPHICS_3_D("Graphics3D");
    private final String value;

    DeviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceType fromValue(String v) {
        for (DeviceType c: DeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

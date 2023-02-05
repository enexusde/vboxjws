
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirmwareType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FirmwareType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BIOS"/>
 *     &lt;enumeration value="EFI"/>
 *     &lt;enumeration value="EFI32"/>
 *     &lt;enumeration value="EFI64"/>
 *     &lt;enumeration value="EFIDUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FirmwareType")
@XmlEnum
public enum FirmwareType {

    BIOS("BIOS"),
    EFI("EFI"),
    @XmlEnumValue("EFI32")
    EFI_32("EFI32"),
    @XmlEnumValue("EFI64")
    EFI_64("EFI64"),
    EFIDUAL("EFIDUAL");
    private final String value;

    FirmwareType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FirmwareType fromValue(String v) {
        for (FirmwareType c: FirmwareType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChipsetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChipsetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="PIIX3"/>
 *     &lt;enumeration value="ICH9"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChipsetType")
@XmlEnum
public enum ChipsetType {

    @XmlEnumValue("Null")
    NULL("Null"),
    @XmlEnumValue("PIIX3")
    PIIX_3("PIIX3"),
    @XmlEnumValue("ICH9")
    ICH_9("ICH9");
    private final String value;

    ChipsetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChipsetType fromValue(String v) {
        for (ChipsetType c: ChipsetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

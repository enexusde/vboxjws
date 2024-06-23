
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DHCPOptionEncoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DHCPOptionEncoding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Hex"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DHCPOptionEncoding")
@XmlEnum
public enum DHCPOptionEncoding {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Hex")
    HEX("Hex");
    private final String value;

    DHCPOptionEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DHCPOptionEncoding fromValue(String v) {
        for (DHCPOptionEncoding c: DHCPOptionEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

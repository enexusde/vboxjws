
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestMouseEventMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuestMouseEventMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Relative"/>
 *     &lt;enumeration value="Absolute"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuestMouseEventMode")
@XmlEnum
public enum GuestMouseEventMode {

    @XmlEnumValue("Relative")
    RELATIVE("Relative"),
    @XmlEnumValue("Absolute")
    ABSOLUTE("Absolute");
    private final String value;

    GuestMouseEventMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuestMouseEventMode fromValue(String v) {
        for (GuestMouseEventMode c: GuestMouseEventMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

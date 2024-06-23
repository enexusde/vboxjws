
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestDebugProvider.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuestDebugProvider">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Native"/>
 *     &lt;enumeration value="GDB"/>
 *     &lt;enumeration value="KD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuestDebugProvider")
@XmlEnum
public enum GuestDebugProvider {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Native")
    NATIVE("Native"),
    GDB("GDB"),
    KD("KD");
    private final String value;

    GuestDebugProvider(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuestDebugProvider fromValue(String v) {
        for (GuestDebugProvider c: GuestDebugProvider.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

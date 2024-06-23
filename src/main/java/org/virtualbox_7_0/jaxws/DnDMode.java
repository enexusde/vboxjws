
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DnDMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DnDMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="HostToGuest"/>
 *     &lt;enumeration value="GuestToHost"/>
 *     &lt;enumeration value="Bidirectional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DnDMode")
@XmlEnum
public enum DnDMode {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("HostToGuest")
    HOST_TO_GUEST("HostToGuest"),
    @XmlEnumValue("GuestToHost")
    GUEST_TO_HOST("GuestToHost"),
    @XmlEnumValue("Bidirectional")
    BIDIRECTIONAL("Bidirectional");
    private final String value;

    DnDMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DnDMode fromValue(String v) {
        for (DnDMode c: DnDMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

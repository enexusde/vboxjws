
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestShutdownFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuestShutdownFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="PowerOff"/>
 *     &lt;enumeration value="Reboot"/>
 *     &lt;enumeration value="Force"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuestShutdownFlag")
@XmlEnum
public enum GuestShutdownFlag {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("PowerOff")
    POWER_OFF("PowerOff"),
    @XmlEnumValue("Reboot")
    REBOOT("Reboot"),
    @XmlEnumValue("Force")
    FORCE("Force");
    private final String value;

    GuestShutdownFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuestShutdownFlag fromValue(String v) {
        for (GuestShutdownFlag c: GuestShutdownFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

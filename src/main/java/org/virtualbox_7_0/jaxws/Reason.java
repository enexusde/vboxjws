
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unspecified"/>
 *     &lt;enumeration value="HostSuspend"/>
 *     &lt;enumeration value="HostResume"/>
 *     &lt;enumeration value="HostBatteryLow"/>
 *     &lt;enumeration value="Snapshot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Reason")
@XmlEnum
public enum Reason {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("HostSuspend")
    HOST_SUSPEND("HostSuspend"),
    @XmlEnumValue("HostResume")
    HOST_RESUME("HostResume"),
    @XmlEnumValue("HostBatteryLow")
    HOST_BATTERY_LOW("HostBatteryLow"),
    @XmlEnumValue("Snapshot")
    SNAPSHOT("Snapshot");
    private final String value;

    Reason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Reason fromValue(String v) {
        for (Reason c: Reason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

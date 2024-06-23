
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestSessionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuestSessionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="Starting"/>
 *     &lt;enumeration value="Started"/>
 *     &lt;enumeration value="Terminating"/>
 *     &lt;enumeration value="Terminated"/>
 *     &lt;enumeration value="TimedOutKilled"/>
 *     &lt;enumeration value="TimedOutAbnormally"/>
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuestSessionStatus")
@XmlEnum
public enum GuestSessionStatus {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Starting")
    STARTING("Starting"),
    @XmlEnumValue("Started")
    STARTED("Started"),
    @XmlEnumValue("Terminating")
    TERMINATING("Terminating"),
    @XmlEnumValue("Terminated")
    TERMINATED("Terminated"),
    @XmlEnumValue("TimedOutKilled")
    TIMED_OUT_KILLED("TimedOutKilled"),
    @XmlEnumValue("TimedOutAbnormally")
    TIMED_OUT_ABNORMALLY("TimedOutAbnormally"),
    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    GuestSessionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuestSessionStatus fromValue(String v) {
        for (GuestSessionStatus c: GuestSessionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestSessionWaitForFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuestSessionWaitForFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Start"/>
 *     &lt;enumeration value="Terminate"/>
 *     &lt;enumeration value="Status"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuestSessionWaitForFlag")
@XmlEnum
public enum GuestSessionWaitForFlag {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("Terminate")
    TERMINATE("Terminate"),
    @XmlEnumValue("Status")
    STATUS("Status");
    private final String value;

    GuestSessionWaitForFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuestSessionWaitForFlag fromValue(String v) {
        for (GuestSessionWaitForFlag c: GuestSessionWaitForFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

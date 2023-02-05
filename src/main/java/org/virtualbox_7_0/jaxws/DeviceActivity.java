
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceActivity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceActivity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="Idle"/>
 *     &lt;enumeration value="Reading"/>
 *     &lt;enumeration value="Writing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceActivity")
@XmlEnum
public enum DeviceActivity {

    @XmlEnumValue("Null")
    NULL("Null"),
    @XmlEnumValue("Idle")
    IDLE("Idle"),
    @XmlEnumValue("Reading")
    READING("Reading"),
    @XmlEnumValue("Writing")
    WRITING("Writing");
    private final String value;

    DeviceActivity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceActivity fromValue(String v) {
        for (DeviceActivity c: DeviceActivity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

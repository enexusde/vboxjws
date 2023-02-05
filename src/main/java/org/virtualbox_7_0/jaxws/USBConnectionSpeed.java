
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USBConnectionSpeed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="USBConnectionSpeed">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Super"/>
 *     &lt;enumeration value="SuperPlus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "USBConnectionSpeed")
@XmlEnum
public enum USBConnectionSpeed {

    @XmlEnumValue("Null")
    NULL("Null"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Super")
    SUPER("Super"),
    @XmlEnumValue("SuperPlus")
    SUPER_PLUS("SuperPlus");
    private final String value;

    USBConnectionSpeed(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static USBConnectionSpeed fromValue(String v) {
        for (USBConnectionSpeed c: USBConnectionSpeed.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

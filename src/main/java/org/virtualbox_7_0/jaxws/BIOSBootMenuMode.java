
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BIOSBootMenuMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BIOSBootMenuMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="MenuOnly"/>
 *     &lt;enumeration value="MessageAndMenu"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BIOSBootMenuMode")
@XmlEnum
public enum BIOSBootMenuMode {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("MenuOnly")
    MENU_ONLY("MenuOnly"),
    @XmlEnumValue("MessageAndMenu")
    MESSAGE_AND_MENU("MessageAndMenu");
    private final String value;

    BIOSBootMenuMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BIOSBootMenuMode fromValue(String v) {
        for (BIOSBootMenuMode c: BIOSBootMenuMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyboardLED.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyboardLED">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NumLock"/>
 *     &lt;enumeration value="CapsLock"/>
 *     &lt;enumeration value="ScrollLock"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KeyboardLED")
@XmlEnum
public enum KeyboardLED {

    @XmlEnumValue("NumLock")
    NUM_LOCK("NumLock"),
    @XmlEnumValue("CapsLock")
    CAPS_LOCK("CapsLock"),
    @XmlEnumValue("ScrollLock")
    SCROLL_LOCK("ScrollLock");
    private final String value;

    KeyboardLED(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeyboardLED fromValue(String v) {
        for (KeyboardLED c: KeyboardLED.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

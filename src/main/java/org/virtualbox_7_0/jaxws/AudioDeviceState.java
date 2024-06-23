
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioDeviceState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudioDeviceState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="NotPresent"/>
 *     &lt;enumeration value="Unplugged"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudioDeviceState")
@XmlEnum
public enum AudioDeviceState {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("NotPresent")
    NOT_PRESENT("NotPresent"),
    @XmlEnumValue("Unplugged")
    UNPLUGGED("Unplugged");
    private final String value;

    AudioDeviceState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudioDeviceState fromValue(String v) {
        for (AudioDeviceState c: AudioDeviceState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

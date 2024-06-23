
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudioDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="In"/>
 *     &lt;enumeration value="Out"/>
 *     &lt;enumeration value="Duplex"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudioDirection")
@XmlEnum
public enum AudioDirection {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("In")
    IN("In"),
    @XmlEnumValue("Out")
    OUT("Out"),
    @XmlEnumValue("Duplex")
    DUPLEX("Duplex");
    private final String value;

    AudioDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudioDirection fromValue(String v) {
        for (AudioDirection c: AudioDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

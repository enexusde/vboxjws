
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioControllerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudioControllerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AC97"/>
 *     &lt;enumeration value="SB16"/>
 *     &lt;enumeration value="HDA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudioControllerType")
@XmlEnum
public enum AudioControllerType {

    @XmlEnumValue("AC97")
    AC_97("AC97"),
    @XmlEnumValue("SB16")
    SB_16("SB16"),
    HDA("HDA");
    private final String value;

    AudioControllerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudioControllerType fromValue(String v) {
        for (AudioControllerType c: AudioControllerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

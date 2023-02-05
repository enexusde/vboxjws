
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioDeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudioDeviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="BuiltLin"/>
 *     &lt;enumeration value="ExternalUSB"/>
 *     &lt;enumeration value="ExternalOther"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudioDeviceType")
@XmlEnum
public enum AudioDeviceType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("BuiltLin")
    BUILT_LIN("BuiltLin"),
    @XmlEnumValue("ExternalUSB")
    EXTERNAL_USB("ExternalUSB"),
    @XmlEnumValue("ExternalOther")
    EXTERNAL_OTHER("ExternalOther");
    private final String value;

    AudioDeviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudioDeviceType fromValue(String v) {
        for (AudioDeviceType c: AudioDeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

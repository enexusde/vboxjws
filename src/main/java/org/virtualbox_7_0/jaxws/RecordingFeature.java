
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordingFeature.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordingFeature">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Video"/>
 *     &lt;enumeration value="Audio"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecordingFeature")
@XmlEnum
public enum RecordingFeature {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Video")
    VIDEO("Video"),
    @XmlEnumValue("Audio")
    AUDIO("Audio");
    private final String value;

    RecordingFeature(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordingFeature fromValue(String v) {
        for (RecordingFeature c: RecordingFeature.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

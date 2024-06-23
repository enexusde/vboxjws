
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordingVideoScalingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordingVideoScalingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="NearestNeighbor"/>
 *     &lt;enumeration value="Bilinear"/>
 *     &lt;enumeration value="Bicubic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecordingVideoScalingMode")
@XmlEnum
public enum RecordingVideoScalingMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("NearestNeighbor")
    NEAREST_NEIGHBOR("NearestNeighbor"),
    @XmlEnumValue("Bilinear")
    BILINEAR("Bilinear"),
    @XmlEnumValue("Bicubic")
    BICUBIC("Bicubic");
    private final String value;

    RecordingVideoScalingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordingVideoScalingMode fromValue(String v) {
        for (RecordingVideoScalingMode c: RecordingVideoScalingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

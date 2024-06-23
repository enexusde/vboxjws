
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordingCodecDeadline.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordingCodecDeadline">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Realtime"/>
 *     &lt;enumeration value="Good"/>
 *     &lt;enumeration value="Best"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecordingCodecDeadline")
@XmlEnum
public enum RecordingCodecDeadline {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Realtime")
    REALTIME("Realtime"),
    @XmlEnumValue("Good")
    GOOD("Good"),
    @XmlEnumValue("Best")
    BEST("Best");
    private final String value;

    RecordingCodecDeadline(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordingCodecDeadline fromValue(String v) {
        for (RecordingCodecDeadline c: RecordingCodecDeadline.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

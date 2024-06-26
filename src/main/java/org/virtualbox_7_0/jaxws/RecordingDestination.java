
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordingDestination.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordingDestination">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="File"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecordingDestination")
@XmlEnum
public enum RecordingDestination {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("File")
    FILE("File");
    private final String value;

    RecordingDestination(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordingDestination fromValue(String v) {
        for (RecordingDestination c: RecordingDestination.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

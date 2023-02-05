
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="Opening"/>
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Closing"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileStatus")
@XmlEnum
public enum FileStatus {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Opening")
    OPENING("Opening"),
    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Closing")
    CLOSING("Closing"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    FileStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileStatus fromValue(String v) {
        for (FileStatus c: FileStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

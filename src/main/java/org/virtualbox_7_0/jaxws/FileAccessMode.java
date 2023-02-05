
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileAccessMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileAccessMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ReadOnly"/>
 *     &lt;enumeration value="WriteOnly"/>
 *     &lt;enumeration value="ReadWrite"/>
 *     &lt;enumeration value="AppendOnly"/>
 *     &lt;enumeration value="AppendRead"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileAccessMode")
@XmlEnum
public enum FileAccessMode {

    @XmlEnumValue("ReadOnly")
    READ_ONLY("ReadOnly"),
    @XmlEnumValue("WriteOnly")
    WRITE_ONLY("WriteOnly"),
    @XmlEnumValue("ReadWrite")
    READ_WRITE("ReadWrite"),
    @XmlEnumValue("AppendOnly")
    APPEND_ONLY("AppendOnly"),
    @XmlEnumValue("AppendRead")
    APPEND_READ("AppendRead");
    private final String value;

    FileAccessMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileAccessMode fromValue(String v) {
        for (FileAccessMode c: FileAccessMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

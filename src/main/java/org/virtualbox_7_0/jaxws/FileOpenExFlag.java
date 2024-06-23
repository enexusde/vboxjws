
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileOpenExFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileOpenExFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileOpenExFlag")
@XmlEnum
public enum FileOpenExFlag {

    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    FileOpenExFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileOpenExFlag fromValue(String v) {
        for (FileOpenExFlag c: FileOpenExFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectoryRemoveRecFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectoryRemoveRecFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ContentAndDir"/>
 *     &lt;enumeration value="ContentOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectoryRemoveRecFlag")
@XmlEnum
public enum DirectoryRemoveRecFlag {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ContentAndDir")
    CONTENT_AND_DIR("ContentAndDir"),
    @XmlEnumValue("ContentOnly")
    CONTENT_ONLY("ContentOnly");
    private final String value;

    DirectoryRemoveRecFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectoryRemoveRecFlag fromValue(String v) {
        for (DirectoryRemoveRecFlag c: DirectoryRemoveRecFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

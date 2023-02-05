
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectoryCopyFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectoryCopyFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CopyIntoExisting"/>
 *     &lt;enumeration value="Recursive"/>
 *     &lt;enumeration value="FollowLinks"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectoryCopyFlag")
@XmlEnum
public enum DirectoryCopyFlag {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("CopyIntoExisting")
    COPY_INTO_EXISTING("CopyIntoExisting"),
    @XmlEnumValue("Recursive")
    RECURSIVE("Recursive"),
    @XmlEnumValue("FollowLinks")
    FOLLOW_LINKS("FollowLinks");
    private final String value;

    DirectoryCopyFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectoryCopyFlag fromValue(String v) {
        for (DirectoryCopyFlag c: DirectoryCopyFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

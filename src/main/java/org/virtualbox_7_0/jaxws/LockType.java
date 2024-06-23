
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LockType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LockType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="Shared"/>
 *     &lt;enumeration value="Write"/>
 *     &lt;enumeration value="VM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LockType")
@XmlEnum
public enum LockType {

    @XmlEnumValue("Null")
    NULL("Null"),
    @XmlEnumValue("Shared")
    SHARED("Shared"),
    @XmlEnumValue("Write")
    WRITE("Write"),
    VM("VM");
    private final String value;

    LockType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LockType fromValue(String v) {
        for (LockType c: LockType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

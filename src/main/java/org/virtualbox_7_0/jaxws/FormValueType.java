
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FormValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Boolean"/>
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Choice"/>
 *     &lt;enumeration value="RangedInteger"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FormValueType")
@XmlEnum
public enum FormValueType {

    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Choice")
    CHOICE("Choice"),
    @XmlEnumValue("RangedInteger")
    RANGED_INTEGER("RangedInteger");
    private final String value;

    FormValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormValueType fromValue(String v) {
        for (FormValueType c: FormValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

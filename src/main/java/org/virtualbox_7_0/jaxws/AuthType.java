
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="External"/>
 *     &lt;enumeration value="Guest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthType")
@XmlEnum
public enum AuthType {

    @XmlEnumValue("Null")
    NULL("Null"),
    @XmlEnumValue("External")
    EXTERNAL("External"),
    @XmlEnumValue("Guest")
    GUEST("Guest");
    private final String value;

    AuthType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthType fromValue(String v) {
        for (AuthType c: AuthType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

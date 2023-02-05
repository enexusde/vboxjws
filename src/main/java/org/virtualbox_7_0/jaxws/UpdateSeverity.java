
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="Critical"/>
 *     &lt;enumeration value="Major"/>
 *     &lt;enumeration value="Minor"/>
 *     &lt;enumeration value="Testing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateSeverity")
@XmlEnum
public enum UpdateSeverity {

    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    @XmlEnumValue("Critical")
    CRITICAL("Critical"),
    @XmlEnumValue("Major")
    MAJOR("Major"),
    @XmlEnumValue("Minor")
    MINOR("Minor"),
    @XmlEnumValue("Testing")
    TESTING("Testing");
    private final String value;

    UpdateSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateSeverity fromValue(String v) {
        for (UpdateSeverity c: UpdateSeverity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

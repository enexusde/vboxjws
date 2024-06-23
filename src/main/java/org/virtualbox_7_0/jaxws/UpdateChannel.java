
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateChannel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateChannel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="Stable"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="WithBetas"/>
 *     &lt;enumeration value="WithTesting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateChannel")
@XmlEnum
public enum UpdateChannel {

    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    @XmlEnumValue("Stable")
    STABLE("Stable"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("WithBetas")
    WITH_BETAS("WithBetas"),
    @XmlEnumValue("WithTesting")
    WITH_TESTING("WithTesting");
    private final String value;

    UpdateChannel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateChannel fromValue(String v) {
        for (UpdateChannel c: UpdateChannel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

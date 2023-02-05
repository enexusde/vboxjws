
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpmType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpmType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="v1_2"/>
 *     &lt;enumeration value="v2_0"/>
 *     &lt;enumeration value="Host"/>
 *     &lt;enumeration value="Swtpm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TpmType")
@XmlEnum
public enum TpmType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("v1_2")
    V_1_2("v1_2"),
    @XmlEnumValue("v2_0")
    V_2_0("v2_0"),
    @XmlEnumValue("Host")
    HOST("Host"),
    @XmlEnumValue("Swtpm")
    SWTPM("Swtpm");
    private final String value;

    TpmType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpmType fromValue(String v) {
        for (TpmType c: TpmType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

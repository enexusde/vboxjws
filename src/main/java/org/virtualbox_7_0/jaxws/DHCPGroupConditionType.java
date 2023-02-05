
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DHCPGroupConditionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DHCPGroupConditionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAC"/>
 *     &lt;enumeration value="MACWildcard"/>
 *     &lt;enumeration value="vendorClassID"/>
 *     &lt;enumeration value="vendorClassIDWildcard"/>
 *     &lt;enumeration value="userClassID"/>
 *     &lt;enumeration value="userClassIDWildcard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DHCPGroupConditionType")
@XmlEnum
public enum DHCPGroupConditionType {

    MAC("MAC"),
    @XmlEnumValue("MACWildcard")
    MAC_WILDCARD("MACWildcard"),
    @XmlEnumValue("vendorClassID")
    VENDOR_CLASS_ID("vendorClassID"),
    @XmlEnumValue("vendorClassIDWildcard")
    VENDOR_CLASS_ID_WILDCARD("vendorClassIDWildcard"),
    @XmlEnumValue("userClassID")
    USER_CLASS_ID("userClassID"),
    @XmlEnumValue("userClassIDWildcard")
    USER_CLASS_ID_WILDCARD("userClassIDWildcard");
    private final String value;

    DHCPGroupConditionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DHCPGroupConditionType fromValue(String v) {
        for (DHCPGroupConditionType c: DHCPGroupConditionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

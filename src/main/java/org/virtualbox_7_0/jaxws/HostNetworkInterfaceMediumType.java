
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNetworkInterfaceMediumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostNetworkInterfaceMediumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Ethernet"/>
 *     &lt;enumeration value="PPP"/>
 *     &lt;enumeration value="SLIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostNetworkInterfaceMediumType")
@XmlEnum
public enum HostNetworkInterfaceMediumType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Ethernet")
    ETHERNET("Ethernet"),
    PPP("PPP"),
    SLIP("SLIP");
    private final String value;

    HostNetworkInterfaceMediumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostNetworkInterfaceMediumType fromValue(String v) {
        for (HostNetworkInterfaceMediumType c: HostNetworkInterfaceMediumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

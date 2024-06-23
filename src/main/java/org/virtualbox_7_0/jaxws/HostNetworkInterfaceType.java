
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNetworkInterfaceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostNetworkInterfaceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bridged"/>
 *     &lt;enumeration value="HostOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostNetworkInterfaceType")
@XmlEnum
public enum HostNetworkInterfaceType {

    @XmlEnumValue("Bridged")
    BRIDGED("Bridged"),
    @XmlEnumValue("HostOnly")
    HOST_ONLY("HostOnly");
    private final String value;

    HostNetworkInterfaceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostNetworkInterfaceType fromValue(String v) {
        for (HostNetworkInterfaceType c: HostNetworkInterfaceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

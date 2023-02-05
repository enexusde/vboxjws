
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DHCPConfigScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DHCPConfigScope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Global"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="MachineNIC"/>
 *     &lt;enumeration value="MAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DHCPConfigScope")
@XmlEnum
public enum DHCPConfigScope {

    @XmlEnumValue("Global")
    GLOBAL("Global"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("MachineNIC")
    MACHINE_NIC("MachineNIC"),
    MAC("MAC");
    private final String value;

    DHCPConfigScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DHCPConfigScope fromValue(String v) {
        for (DHCPConfigScope c: DHCPConfigScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

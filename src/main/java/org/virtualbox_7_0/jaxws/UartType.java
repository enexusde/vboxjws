
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UartType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UartType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="U16450"/>
 *     &lt;enumeration value="U16550A"/>
 *     &lt;enumeration value="U16750"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UartType")
@XmlEnum
public enum UartType {

    @XmlEnumValue("U16450")
    U_16450("U16450"),
    @XmlEnumValue("U16550A")
    U_16550_A("U16550A"),
    @XmlEnumValue("U16750")
    U_16750("U16750");
    private final String value;

    UartType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UartType fromValue(String v) {
        for (UartType c: UartType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

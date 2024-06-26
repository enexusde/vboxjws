
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessPriority">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="Default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessPriority")
@XmlEnum
public enum ProcessPriority {

    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    @XmlEnumValue("Default")
    DEFAULT("Default");
    private final String value;

    ProcessPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessPriority fromValue(String v) {
        for (ProcessPriority c: ProcessPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

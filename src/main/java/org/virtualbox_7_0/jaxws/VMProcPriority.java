
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMProcPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VMProcPriority">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Flat"/>
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="High"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VMProcPriority")
@XmlEnum
public enum VMProcPriority {

    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Flat")
    FLAT("Flat"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    VMProcPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VMProcPriority fromValue(String v) {
        for (VMProcPriority c: VMProcPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessInputStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessInputStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="Broken"/>
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Written"/>
 *     &lt;enumeration value="Overflow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessInputStatus")
@XmlEnum
public enum ProcessInputStatus {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Broken")
    BROKEN("Broken"),
    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Written")
    WRITTEN("Written"),
    @XmlEnumValue("Overflow")
    OVERFLOW("Overflow");
    private final String value;

    ProcessInputStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessInputStatus fromValue(String v) {
        for (ProcessInputStatus c: ProcessInputStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

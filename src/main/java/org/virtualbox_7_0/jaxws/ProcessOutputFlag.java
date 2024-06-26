
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessOutputFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessOutputFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="StdErr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessOutputFlag")
@XmlEnum
public enum ProcessOutputFlag {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("StdErr")
    STD_ERR("StdErr");
    private final String value;

    ProcessOutputFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessOutputFlag fromValue(String v) {
        for (ProcessOutputFlag c: ProcessOutputFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

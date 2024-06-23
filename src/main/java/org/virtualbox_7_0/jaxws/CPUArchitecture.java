
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPUArchitecture.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CPUArchitecture">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="x86"/>
 *     &lt;enumeration value="AMD64"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CPUArchitecture")
@XmlEnum
public enum CPUArchitecture {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("x86")
    X_86("x86"),
    @XmlEnumValue("AMD64")
    AMD_64("AMD64");
    private final String value;

    CPUArchitecture(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CPUArchitecture fromValue(String v) {
        for (CPUArchitecture c: CPUArchitecture.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

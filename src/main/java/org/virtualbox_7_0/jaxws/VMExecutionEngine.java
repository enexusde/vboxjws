
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMExecutionEngine.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VMExecutionEngine">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Emulated"/>
 *     &lt;enumeration value="HwVirt"/>
 *     &lt;enumeration value="NativeApi"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VMExecutionEngine")
@XmlEnum
public enum VMExecutionEngine {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Emulated")
    EMULATED("Emulated"),
    @XmlEnumValue("HwVirt")
    HW_VIRT("HwVirt"),
    @XmlEnumValue("NativeApi")
    NATIVE_API("NativeApi");
    private final String value;

    VMExecutionEngine(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VMExecutionEngine fromValue(String v) {
        for (VMExecutionEngine c: VMExecutionEngine.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

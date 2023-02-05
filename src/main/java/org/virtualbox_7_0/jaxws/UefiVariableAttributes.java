
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UefiVariableAttributes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UefiVariableAttributes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="NonVolatile"/>
 *     &lt;enumeration value="BootServiceAccess"/>
 *     &lt;enumeration value="RuntimeAccess"/>
 *     &lt;enumeration value="HwErrorRecord"/>
 *     &lt;enumeration value="AuthWriteAccess"/>
 *     &lt;enumeration value="AuthTimeBasedWriteAccess"/>
 *     &lt;enumeration value="AuthAppendWrite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UefiVariableAttributes")
@XmlEnum
public enum UefiVariableAttributes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("NonVolatile")
    NON_VOLATILE("NonVolatile"),
    @XmlEnumValue("BootServiceAccess")
    BOOT_SERVICE_ACCESS("BootServiceAccess"),
    @XmlEnumValue("RuntimeAccess")
    RUNTIME_ACCESS("RuntimeAccess"),
    @XmlEnumValue("HwErrorRecord")
    HW_ERROR_RECORD("HwErrorRecord"),
    @XmlEnumValue("AuthWriteAccess")
    AUTH_WRITE_ACCESS("AuthWriteAccess"),
    @XmlEnumValue("AuthTimeBasedWriteAccess")
    AUTH_TIME_BASED_WRITE_ACCESS("AuthTimeBasedWriteAccess"),
    @XmlEnumValue("AuthAppendWrite")
    AUTH_APPEND_WRITE("AuthAppendWrite");
    private final String value;

    UefiVariableAttributes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UefiVariableAttributes fromValue(String v) {
        for (UefiVariableAttributes c: UefiVariableAttributes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

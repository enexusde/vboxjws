
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HWVirtExPropertyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HWVirtExPropertyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="VPID"/>
 *     &lt;enumeration value="NestedPaging"/>
 *     &lt;enumeration value="UnrestrictedExecution"/>
 *     &lt;enumeration value="LargePages"/>
 *     &lt;enumeration value="Force"/>
 *     &lt;enumeration value="UseNativeApi"/>
 *     &lt;enumeration value="VirtVmsaveVmload"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HWVirtExPropertyType")
@XmlEnum
public enum HWVirtExPropertyType {

    @XmlEnumValue("Null")
    NULL("Null"),
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    VPID("VPID"),
    @XmlEnumValue("NestedPaging")
    NESTED_PAGING("NestedPaging"),
    @XmlEnumValue("UnrestrictedExecution")
    UNRESTRICTED_EXECUTION("UnrestrictedExecution"),
    @XmlEnumValue("LargePages")
    LARGE_PAGES("LargePages"),
    @XmlEnumValue("Force")
    FORCE("Force"),
    @XmlEnumValue("UseNativeApi")
    USE_NATIVE_API("UseNativeApi"),
    @XmlEnumValue("VirtVmsaveVmload")
    VIRT_VMSAVE_VMLOAD("VirtVmsaveVmload");
    private final String value;

    HWVirtExPropertyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HWVirtExPropertyType fromValue(String v) {
        for (HWVirtExPropertyType c: HWVirtExPropertyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

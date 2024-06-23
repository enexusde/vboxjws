
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessorFeature.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessorFeature">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HWVirtEx"/>
 *     &lt;enumeration value="PAE"/>
 *     &lt;enumeration value="LongMode"/>
 *     &lt;enumeration value="NestedPaging"/>
 *     &lt;enumeration value="UnrestrictedGuest"/>
 *     &lt;enumeration value="NestedHWVirt"/>
 *     &lt;enumeration value="VirtVmsaveVmload"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessorFeature")
@XmlEnum
public enum ProcessorFeature {

    @XmlEnumValue("HWVirtEx")
    HW_VIRT_EX("HWVirtEx"),
    PAE("PAE"),
    @XmlEnumValue("LongMode")
    LONG_MODE("LongMode"),
    @XmlEnumValue("NestedPaging")
    NESTED_PAGING("NestedPaging"),
    @XmlEnumValue("UnrestrictedGuest")
    UNRESTRICTED_GUEST("UnrestrictedGuest"),
    @XmlEnumValue("NestedHWVirt")
    NESTED_HW_VIRT("NestedHWVirt"),
    @XmlEnumValue("VirtVmsaveVmload")
    VIRT_VMSAVE_VMLOAD("VirtVmsaveVmload");
    private final String value;

    ProcessorFeature(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessorFeature fromValue(String v) {
        for (ProcessorFeature c: ProcessorFeature.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPUPropertyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CPUPropertyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="PAE"/>
 *     &lt;enumeration value="LongMode"/>
 *     &lt;enumeration value="TripleFaultReset"/>
 *     &lt;enumeration value="APIC"/>
 *     &lt;enumeration value="X2APIC"/>
 *     &lt;enumeration value="IBPBOnVMExit"/>
 *     &lt;enumeration value="IBPBOnVMEntry"/>
 *     &lt;enumeration value="HWVirt"/>
 *     &lt;enumeration value="SpecCtrl"/>
 *     &lt;enumeration value="SpecCtrlByHost"/>
 *     &lt;enumeration value="L1DFlushOnEMTScheduling"/>
 *     &lt;enumeration value="L1DFlushOnVMEntry"/>
 *     &lt;enumeration value="MDSClearOnEMTScheduling"/>
 *     &lt;enumeration value="MDSClearOnVMEntry"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CPUPropertyType")
@XmlEnum
public enum CPUPropertyType {

    @XmlEnumValue("Null")
    NULL("Null"),
    PAE("PAE"),
    @XmlEnumValue("LongMode")
    LONG_MODE("LongMode"),
    @XmlEnumValue("TripleFaultReset")
    TRIPLE_FAULT_RESET("TripleFaultReset"),
    APIC("APIC"),
    @XmlEnumValue("X2APIC")
    X_2_APIC("X2APIC"),
    @XmlEnumValue("IBPBOnVMExit")
    IBPB_ON_VM_EXIT("IBPBOnVMExit"),
    @XmlEnumValue("IBPBOnVMEntry")
    IBPB_ON_VM_ENTRY("IBPBOnVMEntry"),
    @XmlEnumValue("HWVirt")
    HW_VIRT("HWVirt"),
    @XmlEnumValue("SpecCtrl")
    SPEC_CTRL("SpecCtrl"),
    @XmlEnumValue("SpecCtrlByHost")
    SPEC_CTRL_BY_HOST("SpecCtrlByHost"),
    @XmlEnumValue("L1DFlushOnEMTScheduling")
    L_1_D_FLUSH_ON_EMT_SCHEDULING("L1DFlushOnEMTScheduling"),
    @XmlEnumValue("L1DFlushOnVMEntry")
    L_1_D_FLUSH_ON_VM_ENTRY("L1DFlushOnVMEntry"),
    @XmlEnumValue("MDSClearOnEMTScheduling")
    MDS_CLEAR_ON_EMT_SCHEDULING("MDSClearOnEMTScheduling"),
    @XmlEnumValue("MDSClearOnVMEntry")
    MDS_CLEAR_ON_VM_ENTRY("MDSClearOnVMEntry");
    private final String value;

    CPUPropertyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CPUPropertyType fromValue(String v) {
        for (CPUPropertyType c: CPUPropertyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

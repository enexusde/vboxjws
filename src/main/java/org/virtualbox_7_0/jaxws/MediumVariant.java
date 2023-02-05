
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediumVariant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MediumVariant">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="VmdkSplit2G"/>
 *     &lt;enumeration value="VmdkRawDisk"/>
 *     &lt;enumeration value="VmdkStreamOptimized"/>
 *     &lt;enumeration value="VmdkESX"/>
 *     &lt;enumeration value="VdiZeroExpand"/>
 *     &lt;enumeration value="Fixed"/>
 *     &lt;enumeration value="Diff"/>
 *     &lt;enumeration value="Formatted"/>
 *     &lt;enumeration value="NoCreateDir"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MediumVariant")
@XmlEnum
public enum MediumVariant {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("VmdkSplit2G")
    VMDK_SPLIT_2_G("VmdkSplit2G"),
    @XmlEnumValue("VmdkRawDisk")
    VMDK_RAW_DISK("VmdkRawDisk"),
    @XmlEnumValue("VmdkStreamOptimized")
    VMDK_STREAM_OPTIMIZED("VmdkStreamOptimized"),
    @XmlEnumValue("VmdkESX")
    VMDK_ESX("VmdkESX"),
    @XmlEnumValue("VdiZeroExpand")
    VDI_ZERO_EXPAND("VdiZeroExpand"),
    @XmlEnumValue("Fixed")
    FIXED("Fixed"),
    @XmlEnumValue("Diff")
    DIFF("Diff"),
    @XmlEnumValue("Formatted")
    FORMATTED("Formatted"),
    @XmlEnumValue("NoCreateDir")
    NO_CREATE_DIR("NoCreateDir");
    private final String value;

    MediumVariant(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediumVariant fromValue(String v) {
        for (MediumVariant c: MediumVariant.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

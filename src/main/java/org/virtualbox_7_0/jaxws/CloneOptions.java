
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CloneOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CloneOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Link"/>
 *     &lt;enumeration value="KeepAllMACs"/>
 *     &lt;enumeration value="KeepNATMACs"/>
 *     &lt;enumeration value="KeepDiskNames"/>
 *     &lt;enumeration value="KeepHwUUIDs"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CloneOptions")
@XmlEnum
public enum CloneOptions {

    @XmlEnumValue("Link")
    LINK("Link"),
    @XmlEnumValue("KeepAllMACs")
    KEEP_ALL_MA_CS("KeepAllMACs"),
    @XmlEnumValue("KeepNATMACs")
    KEEP_NATMA_CS("KeepNATMACs"),
    @XmlEnumValue("KeepDiskNames")
    KEEP_DISK_NAMES("KeepDiskNames"),
    @XmlEnumValue("KeepHwUUIDs")
    KEEP_HW_UUI_DS("KeepHwUUIDs");
    private final String value;

    CloneOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CloneOptions fromValue(String v) {
        for (CloneOptions c: CloneOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

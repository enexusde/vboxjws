
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CleanupMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CleanupMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UnregisterOnly"/>
 *     &lt;enumeration value="DetachAllReturnNone"/>
 *     &lt;enumeration value="DetachAllReturnHardDisksOnly"/>
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="DetachAllReturnHardDisksAndVMRemovable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CleanupMode")
@XmlEnum
public enum CleanupMode {

    @XmlEnumValue("UnregisterOnly")
    UNREGISTER_ONLY("UnregisterOnly"),
    @XmlEnumValue("DetachAllReturnNone")
    DETACH_ALL_RETURN_NONE("DetachAllReturnNone"),
    @XmlEnumValue("DetachAllReturnHardDisksOnly")
    DETACH_ALL_RETURN_HARD_DISKS_ONLY("DetachAllReturnHardDisksOnly"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("DetachAllReturnHardDisksAndVMRemovable")
    DETACH_ALL_RETURN_HARD_DISKS_AND_VM_REMOVABLE("DetachAllReturnHardDisksAndVMRemovable");
    private final String value;

    CleanupMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CleanupMode fromValue(String v) {
        for (CleanupMode c: CleanupMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CloudImageState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CloudImageState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="Provisioning"/>
 *     &lt;enumeration value="Importing"/>
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Exporting"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CloudImageState")
@XmlEnum
public enum CloudImageState {

    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    @XmlEnumValue("Provisioning")
    PROVISIONING("Provisioning"),
    @XmlEnumValue("Importing")
    IMPORTING("Importing"),
    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Exporting")
    EXPORTING("Exporting"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    CloudImageState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CloudImageState fromValue(String v) {
        for (CloudImageState c: CloudImageState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

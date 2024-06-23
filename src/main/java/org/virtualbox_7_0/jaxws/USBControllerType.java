
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USBControllerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="USBControllerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="OHCI"/>
 *     &lt;enumeration value="EHCI"/>
 *     &lt;enumeration value="XHCI"/>
 *     &lt;enumeration value="Last"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "USBControllerType")
@XmlEnum
public enum USBControllerType {

    @XmlEnumValue("Null")
    NULL("Null"),
    OHCI("OHCI"),
    EHCI("EHCI"),
    XHCI("XHCI"),
    @XmlEnumValue("Last")
    LAST("Last");
    private final String value;

    USBControllerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static USBControllerType fromValue(String v) {
        for (USBControllerType c: USBControllerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

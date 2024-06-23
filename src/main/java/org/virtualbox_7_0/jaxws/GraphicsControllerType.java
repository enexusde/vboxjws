
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraphicsControllerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GraphicsControllerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="VBoxVGA"/>
 *     &lt;enumeration value="VMSVGA"/>
 *     &lt;enumeration value="VBoxSVGA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GraphicsControllerType")
@XmlEnum
public enum GraphicsControllerType {

    @XmlEnumValue("Null")
    NULL("Null"),
    @XmlEnumValue("VBoxVGA")
    V_BOX_VGA("VBoxVGA"),
    VMSVGA("VMSVGA"),
    @XmlEnumValue("VBoxSVGA")
    V_BOX_SVGA("VBoxSVGA");
    private final String value;

    GraphicsControllerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GraphicsControllerType fromValue(String v) {
        for (GraphicsControllerType c: GraphicsControllerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

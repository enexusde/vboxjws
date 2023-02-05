
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScreenLayoutMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScreenLayoutMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Apply"/>
 *     &lt;enumeration value="Reset"/>
 *     &lt;enumeration value="Attach"/>
 *     &lt;enumeration value="Silent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScreenLayoutMode")
@XmlEnum
public enum ScreenLayoutMode {

    @XmlEnumValue("Apply")
    APPLY("Apply"),
    @XmlEnumValue("Reset")
    RESET("Reset"),
    @XmlEnumValue("Attach")
    ATTACH("Attach"),
    @XmlEnumValue("Silent")
    SILENT("Silent");
    private final String value;

    ScreenLayoutMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScreenLayoutMode fromValue(String v) {
        for (ScreenLayoutMode c: ScreenLayoutMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

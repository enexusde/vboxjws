
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IommuType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IommuType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="AMD"/>
 *     &lt;enumeration value="Intel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IommuType")
@XmlEnum
public enum IommuType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    AMD("AMD"),
    @XmlEnumValue("Intel")
    INTEL("Intel");
    private final String value;

    IommuType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IommuType fromValue(String v) {
        for (IommuType c: IommuType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

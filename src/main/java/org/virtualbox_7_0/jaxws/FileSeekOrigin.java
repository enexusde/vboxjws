
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileSeekOrigin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileSeekOrigin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Begin"/>
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="End"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileSeekOrigin")
@XmlEnum
public enum FileSeekOrigin {

    @XmlEnumValue("Begin")
    BEGIN("Begin"),
    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("End")
    END("End");
    private final String value;

    FileSeekOrigin(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileSeekOrigin fromValue(String v) {
        for (FileSeekOrigin c: FileSeekOrigin.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

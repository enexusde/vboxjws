
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PathStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PathStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DOS"/>
 *     &lt;enumeration value="UNIX"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PathStyle")
@XmlEnum
public enum PathStyle {

    DOS("DOS"),
    UNIX("UNIX"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    PathStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PathStyle fromValue(String v) {
        for (PathStyle c: PathStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

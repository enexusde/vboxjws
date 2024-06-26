
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VFSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VFSType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="File"/>
 *     &lt;enumeration value="Cloud"/>
 *     &lt;enumeration value="S3"/>
 *     &lt;enumeration value="WebDav"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VFSType")
@XmlEnum
public enum VFSType {

    @XmlEnumValue("File")
    FILE("File"),
    @XmlEnumValue("Cloud")
    CLOUD("Cloud"),
    @XmlEnumValue("S3")
    S_3("S3"),
    @XmlEnumValue("WebDav")
    WEB_DAV("WebDav");
    private final String value;

    VFSType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VFSType fromValue(String v) {
        for (VFSType c: VFSType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

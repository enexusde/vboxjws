
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignatureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="X509"/>
 *     &lt;enumeration value="Sha256"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignatureType")
@XmlEnum
public enum SignatureType {

    @XmlEnumValue("X509")
    X_509("X509"),
    @XmlEnumValue("Sha256")
    SHA_256("Sha256");
    private final String value;

    SignatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignatureType fromValue(String v) {
        for (SignatureType c: SignatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

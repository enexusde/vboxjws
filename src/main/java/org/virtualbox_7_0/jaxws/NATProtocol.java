
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NATProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NATProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UDP"/>
 *     &lt;enumeration value="TCP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NATProtocol")
@XmlEnum
public enum NATProtocol {

    UDP,
    TCP;

    public String value() {
        return name();
    }

    public static NATProtocol fromValue(String v) {
        return valueOf(v);
    }

}

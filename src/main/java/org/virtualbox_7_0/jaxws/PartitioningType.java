
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartitioningType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartitioningType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MBR"/>
 *     &lt;enumeration value="GPT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PartitioningType")
@XmlEnum
public enum PartitioningType {

    MBR,
    GPT;

    public String value() {
        return name();
    }

    public static PartitioningType fromValue(String v) {
        return valueOf(v);
    }

}

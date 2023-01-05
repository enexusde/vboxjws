
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CPUPropertyType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="CPUPropertyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="PAE"/>
 *     &lt;enumeration value="Synthetic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CPUPropertyType")
@XmlEnum
public enum CPUPropertyType {

	@XmlEnumValue("Null")
	NULL("Null"), PAE("PAE"), @XmlEnumValue("Synthetic")
	SYNTHETIC("Synthetic");

	private final String value;

	CPUPropertyType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static CPUPropertyType fromValue(String v) {
		for (CPUPropertyType c : CPUPropertyType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

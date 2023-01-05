
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for LockType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="LockType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Write"/>
 *     &lt;enumeration value="Shared"/>
 *     &lt;enumeration value="VM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LockType")
@XmlEnum
public enum LockType {

	@XmlEnumValue("Write")
	WRITE("Write"), @XmlEnumValue("Shared")
	SHARED("Shared"), VM("VM");

	private final String value;

	LockType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static LockType fromValue(String v) {
		for (LockType c : LockType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

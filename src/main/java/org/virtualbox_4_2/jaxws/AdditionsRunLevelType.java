
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AdditionsRunLevelType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="AdditionsRunLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="Userland"/>
 *     &lt;enumeration value="Desktop"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionsRunLevelType")
@XmlEnum
public enum AdditionsRunLevelType {

	@XmlEnumValue("None")
	NONE("None"), @XmlEnumValue("System")
	SYSTEM("System"), @XmlEnumValue("Userland")
	USERLAND("Userland"), @XmlEnumValue("Desktop")
	DESKTOP("Desktop");

	private final String value;

	AdditionsRunLevelType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static AdditionsRunLevelType fromValue(String v) {
		for (AdditionsRunLevelType c : AdditionsRunLevelType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}


package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AdditionsFacilityClass.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="AdditionsFacilityClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Driver"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Program"/>
 *     &lt;enumeration value="Feature"/>
 *     &lt;enumeration value="ThirdParty"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionsFacilityClass")
@XmlEnum
public enum AdditionsFacilityClass {

	@XmlEnumValue("None")
	NONE("None"), @XmlEnumValue("Driver")
	DRIVER("Driver"), @XmlEnumValue("Service")
	SERVICE("Service"), @XmlEnumValue("Program")
	PROGRAM("Program"), @XmlEnumValue("Feature")
	FEATURE("Feature"), @XmlEnumValue("ThirdParty")
	THIRD_PARTY("ThirdParty"), @XmlEnumValue("All")
	ALL("All");

	private final String value;

	AdditionsFacilityClass(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static AdditionsFacilityClass fromValue(String v) {
		for (AdditionsFacilityClass c : AdditionsFacilityClass.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

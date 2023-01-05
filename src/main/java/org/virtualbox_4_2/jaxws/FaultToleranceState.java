
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for FaultToleranceState.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="FaultToleranceState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Master"/>
 *     &lt;enumeration value="Standby"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FaultToleranceState")
@XmlEnum
public enum FaultToleranceState {

	@XmlEnumValue("Inactive")
	INACTIVE("Inactive"), @XmlEnumValue("Master")
	MASTER("Master"), @XmlEnumValue("Standby")
	STANDBY("Standby");

	private final String value;

	FaultToleranceState(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static FaultToleranceState fromValue(String v) {
		for (FaultToleranceState c : FaultToleranceState.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

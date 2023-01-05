
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for USBDeviceState.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="USBDeviceState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSupported"/>
 *     &lt;enumeration value="Unavailable"/>
 *     &lt;enumeration value="Busy"/>
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Held"/>
 *     &lt;enumeration value="Captured"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "USBDeviceState")
@XmlEnum
public enum USBDeviceState {

	@XmlEnumValue("NotSupported")
	NOT_SUPPORTED("NotSupported"), @XmlEnumValue("Unavailable")
	UNAVAILABLE("Unavailable"), @XmlEnumValue("Busy")
	BUSY("Busy"), @XmlEnumValue("Available")
	AVAILABLE("Available"), @XmlEnumValue("Held")
	HELD("Held"), @XmlEnumValue("Captured")
	CAPTURED("Captured");

	private final String value;

	USBDeviceState(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static USBDeviceState fromValue(String v) {
		for (USBDeviceState c : USBDeviceState.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}


package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PointingHIDType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="PointingHIDType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="PS2Mouse"/>
 *     &lt;enumeration value="USBMouse"/>
 *     &lt;enumeration value="USBTablet"/>
 *     &lt;enumeration value="ComboMouse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PointingHIDType")
@XmlEnum
public enum PointingHIDType {

	@XmlEnumValue("None")
	NONE("None"), @XmlEnumValue("PS2Mouse")
	PS_2_MOUSE("PS2Mouse"), @XmlEnumValue("USBMouse")
	USB_MOUSE("USBMouse"), @XmlEnumValue("USBTablet")
	USB_TABLET("USBTablet"), @XmlEnumValue("ComboMouse")
	COMBO_MOUSE("ComboMouse");

	private final String value;

	PointingHIDType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static PointingHIDType fromValue(String v) {
		for (PointingHIDType c : PointingHIDType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

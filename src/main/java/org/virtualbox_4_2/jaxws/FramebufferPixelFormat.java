
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for FramebufferPixelFormat.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="FramebufferPixelFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Opaque"/>
 *     &lt;enumeration value="FOURCC_RGB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FramebufferPixelFormat")
@XmlEnum
public enum FramebufferPixelFormat {

	@XmlEnumValue("Opaque")
	OPAQUE("Opaque"), FOURCC_RGB("FOURCC_RGB");

	private final String value;

	FramebufferPixelFormat(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static FramebufferPixelFormat fromValue(String v) {
		for (FramebufferPixelFormat c : FramebufferPixelFormat.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

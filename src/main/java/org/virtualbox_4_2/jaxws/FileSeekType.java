
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for FileSeekType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="FileSeekType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Set"/>
 *     &lt;enumeration value="Current"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileSeekType")
@XmlEnum
public enum FileSeekType {

	@XmlEnumValue("Set")
	SET("Set"), @XmlEnumValue("Current")
	CURRENT("Current");

	private final String value;

	FileSeekType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static FileSeekType fromValue(String v) {
		for (FileSeekType c : FileSeekType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

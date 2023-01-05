
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MediumType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="MediumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Immutable"/>
 *     &lt;enumeration value="Writethrough"/>
 *     &lt;enumeration value="Shareable"/>
 *     &lt;enumeration value="Readonly"/>
 *     &lt;enumeration value="MultiAttach"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MediumType")
@XmlEnum
public enum MediumType {

	@XmlEnumValue("Normal")
	NORMAL("Normal"), @XmlEnumValue("Immutable")
	IMMUTABLE("Immutable"), @XmlEnumValue("Writethrough")
	WRITETHROUGH("Writethrough"), @XmlEnumValue("Shareable")
	SHAREABLE("Shareable"), @XmlEnumValue("Readonly")
	READONLY("Readonly"), @XmlEnumValue("MultiAttach")
	MULTI_ATTACH("MultiAttach");

	private final String value;

	MediumType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static MediumType fromValue(String v) {
		for (MediumType c : MediumType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

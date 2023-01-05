
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DirectoryCreateFlag.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="DirectoryCreateFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Parents"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectoryCreateFlag")
@XmlEnum
public enum DirectoryCreateFlag {

	@XmlEnumValue("None")
	NONE("None"), @XmlEnumValue("Parents")
	PARENTS("Parents");

	private final String value;

	DirectoryCreateFlag(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static DirectoryCreateFlag fromValue(String v) {
		for (DirectoryCreateFlag c : DirectoryCreateFlag.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

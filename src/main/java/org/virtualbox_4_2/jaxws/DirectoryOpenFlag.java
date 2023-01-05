
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DirectoryOpenFlag.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="DirectoryOpenFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="NoSymlinks"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectoryOpenFlag")
@XmlEnum
public enum DirectoryOpenFlag {

	@XmlEnumValue("None")
	NONE("None"), @XmlEnumValue("NoSymlinks")
	NO_SYMLINKS("NoSymlinks");

	private final String value;

	DirectoryOpenFlag(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static DirectoryOpenFlag fromValue(String v) {
		for (DirectoryOpenFlag c : DirectoryOpenFlag.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

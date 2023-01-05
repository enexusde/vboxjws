
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PathRenameFlag.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="PathRenameFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="NoReplace"/>
 *     &lt;enumeration value="Replace"/>
 *     &lt;enumeration value="NoSymlinks"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PathRenameFlag")
@XmlEnum
public enum PathRenameFlag {

	@XmlEnumValue("None")
	NONE("None"), @XmlEnumValue("NoReplace")
	NO_REPLACE("NoReplace"), @XmlEnumValue("Replace")
	REPLACE("Replace"), @XmlEnumValue("NoSymlinks")
	NO_SYMLINKS("NoSymlinks");

	private final String value;

	PathRenameFlag(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static PathRenameFlag fromValue(String v) {
		for (PathRenameFlag c : PathRenameFlag.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

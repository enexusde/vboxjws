
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DataFlags.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="DataFlags">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Mandatory"/>
 *     &lt;enumeration value="Expert"/>
 *     &lt;enumeration value="Array"/>
 *     &lt;enumeration value="FlagMask"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataFlags")
@XmlEnum
public enum DataFlags {

	@XmlEnumValue("None")
	NONE("None"), @XmlEnumValue("Mandatory")
	MANDATORY("Mandatory"), @XmlEnumValue("Expert")
	EXPERT("Expert"), @XmlEnumValue("Array")
	ARRAY("Array"), @XmlEnumValue("FlagMask")
	FLAG_MASK("FlagMask");

	private final String value;

	DataFlags(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static DataFlags fromValue(String v) {
		for (DataFlags c : DataFlags.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

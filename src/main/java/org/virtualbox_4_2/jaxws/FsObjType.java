
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for FsObjType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="FsObjType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="FIFO"/>
 *     &lt;enumeration value="DevChar"/>
 *     &lt;enumeration value="DevBlock"/>
 *     &lt;enumeration value="Directory"/>
 *     &lt;enumeration value="File"/>
 *     &lt;enumeration value="Symlink"/>
 *     &lt;enumeration value="Socket"/>
 *     &lt;enumeration value="Whiteout"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FsObjType")
@XmlEnum
public enum FsObjType {

	@XmlEnumValue("Undefined")
	UNDEFINED("Undefined"), FIFO("FIFO"), @XmlEnumValue("DevChar")
	DEV_CHAR("DevChar"), @XmlEnumValue("DevBlock")
	DEV_BLOCK("DevBlock"), @XmlEnumValue("Directory")
	DIRECTORY("Directory"), @XmlEnumValue("File")
	FILE("File"), @XmlEnumValue("Symlink")
	SYMLINK("Symlink"), @XmlEnumValue("Socket")
	SOCKET("Socket"), @XmlEnumValue("Whiteout")
	WHITEOUT("Whiteout");

	private final String value;

	FsObjType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static FsObjType fromValue(String v) {
		for (FsObjType c : FsObjType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

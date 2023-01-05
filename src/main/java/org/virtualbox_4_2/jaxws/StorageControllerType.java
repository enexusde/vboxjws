
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for StorageControllerType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="StorageControllerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="LsiLogic"/>
 *     &lt;enumeration value="BusLogic"/>
 *     &lt;enumeration value="IntelAhci"/>
 *     &lt;enumeration value="PIIX3"/>
 *     &lt;enumeration value="PIIX4"/>
 *     &lt;enumeration value="ICH6"/>
 *     &lt;enumeration value="I82078"/>
 *     &lt;enumeration value="LsiLogicSas"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StorageControllerType")
@XmlEnum
public enum StorageControllerType {

	@XmlEnumValue("Null")
	NULL("Null"), @XmlEnumValue("LsiLogic")
	LSI_LOGIC("LsiLogic"), @XmlEnumValue("BusLogic")
	BUS_LOGIC("BusLogic"), @XmlEnumValue("IntelAhci")
	INTEL_AHCI("IntelAhci"), @XmlEnumValue("PIIX3")
	PIIX_3("PIIX3"), @XmlEnumValue("PIIX4")
	PIIX_4("PIIX4"), @XmlEnumValue("ICH6")
	ICH_6("ICH6"), @XmlEnumValue("I82078")
	I_82078("I82078"), @XmlEnumValue("LsiLogicSas")
	LSI_LOGIC_SAS("LsiLogicSas");

	private final String value;

	StorageControllerType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static StorageControllerType fromValue(String v) {
		for (StorageControllerType c : StorageControllerType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

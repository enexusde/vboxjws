
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ProcessCreateFlag.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="ProcessCreateFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="WaitForProcessStartOnly"/>
 *     &lt;enumeration value="IgnoreOrphanedProcesses"/>
 *     &lt;enumeration value="Hidden"/>
 *     &lt;enumeration value="NoProfile"/>
 *     &lt;enumeration value="WaitForStdOut"/>
 *     &lt;enumeration value="WaitForStdErr"/>
 *     &lt;enumeration value="ExpandArguments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessCreateFlag")
@XmlEnum
public enum ProcessCreateFlag {

	@XmlEnumValue("None")
	NONE("None"), @XmlEnumValue("WaitForProcessStartOnly")
	WAIT_FOR_PROCESS_START_ONLY("WaitForProcessStartOnly"), @XmlEnumValue("IgnoreOrphanedProcesses")
	IGNORE_ORPHANED_PROCESSES("IgnoreOrphanedProcesses"), @XmlEnumValue("Hidden")
	HIDDEN("Hidden"), @XmlEnumValue("NoProfile")
	NO_PROFILE("NoProfile"), @XmlEnumValue("WaitForStdOut")
	WAIT_FOR_STD_OUT("WaitForStdOut"), @XmlEnumValue("WaitForStdErr")
	WAIT_FOR_STD_ERR("WaitForStdErr"), @XmlEnumValue("ExpandArguments")
	EXPAND_ARGUMENTS("ExpandArguments");

	private final String value;

	ProcessCreateFlag(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static ProcessCreateFlag fromValue(String v) {
		for (ProcessCreateFlag c : ProcessCreateFlag.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

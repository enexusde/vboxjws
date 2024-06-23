
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessWaitForFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessWaitForFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Start"/>
 *     &lt;enumeration value="Terminate"/>
 *     &lt;enumeration value="StdIn"/>
 *     &lt;enumeration value="StdOut"/>
 *     &lt;enumeration value="StdErr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessWaitForFlag")
@XmlEnum
public enum ProcessWaitForFlag {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("Terminate")
    TERMINATE("Terminate"),
    @XmlEnumValue("StdIn")
    STD_IN("StdIn"),
    @XmlEnumValue("StdOut")
    STD_OUT("StdOut"),
    @XmlEnumValue("StdErr")
    STD_ERR("StdErr");
    private final String value;

    ProcessWaitForFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessWaitForFlag fromValue(String v) {
        for (ProcessWaitForFlag c: ProcessWaitForFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

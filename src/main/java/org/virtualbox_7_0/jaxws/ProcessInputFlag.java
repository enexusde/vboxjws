
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessInputFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessInputFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="EndOfFile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessInputFlag")
@XmlEnum
public enum ProcessInputFlag {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("EndOfFile")
    END_OF_FILE("EndOfFile");
    private final String value;

    ProcessInputFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessInputFlag fromValue(String v) {
        for (ProcessInputFlag c: ProcessInputFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

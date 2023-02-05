
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CloudMachineState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CloudMachineState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="Provisioning"/>
 *     &lt;enumeration value="Running"/>
 *     &lt;enumeration value="Starting"/>
 *     &lt;enumeration value="Stopping"/>
 *     &lt;enumeration value="Stopped"/>
 *     &lt;enumeration value="CreatingImage"/>
 *     &lt;enumeration value="Terminating"/>
 *     &lt;enumeration value="Terminated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CloudMachineState")
@XmlEnum
public enum CloudMachineState {

    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    @XmlEnumValue("Provisioning")
    PROVISIONING("Provisioning"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Starting")
    STARTING("Starting"),
    @XmlEnumValue("Stopping")
    STOPPING("Stopping"),
    @XmlEnumValue("Stopped")
    STOPPED("Stopped"),
    @XmlEnumValue("CreatingImage")
    CREATING_IMAGE("CreatingImage"),
    @XmlEnumValue("Terminating")
    TERMINATING("Terminating"),
    @XmlEnumValue("Terminated")
    TERMINATED("Terminated");
    private final String value;

    CloudMachineState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CloudMachineState fromValue(String v) {
        for (CloudMachineState c: CloudMachineState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

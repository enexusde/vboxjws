
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestSessionWaitResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuestSessionWaitResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Start"/>
 *     &lt;enumeration value="Terminate"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Timeout"/>
 *     &lt;enumeration value="WaitFlagNotSupported"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuestSessionWaitResult")
@XmlEnum
public enum GuestSessionWaitResult {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("Terminate")
    TERMINATE("Terminate"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Timeout")
    TIMEOUT("Timeout"),
    @XmlEnumValue("WaitFlagNotSupported")
    WAIT_FLAG_NOT_SUPPORTED("WaitFlagNotSupported");
    private final String value;

    GuestSessionWaitResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuestSessionWaitResult fromValue(String v) {
        for (GuestSessionWaitResult c: GuestSessionWaitResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

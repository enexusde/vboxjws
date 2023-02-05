
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TouchContactState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TouchContactState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="InContact"/>
 *     &lt;enumeration value="InRange"/>
 *     &lt;enumeration value="ContactStateMask"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TouchContactState")
@XmlEnum
public enum TouchContactState {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("InContact")
    IN_CONTACT("InContact"),
    @XmlEnumValue("InRange")
    IN_RANGE("InRange"),
    @XmlEnumValue("ContactStateMask")
    CONTACT_STATE_MASK("ContactStateMask");
    private final String value;

    TouchContactState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TouchContactState fromValue(String v) {
        for (TouchContactState c: TouchContactState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

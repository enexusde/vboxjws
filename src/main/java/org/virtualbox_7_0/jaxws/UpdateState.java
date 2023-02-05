
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="NotAvailable"/>
 *     &lt;enumeration value="Downloading"/>
 *     &lt;enumeration value="Downloaded"/>
 *     &lt;enumeration value="Installing"/>
 *     &lt;enumeration value="Installed"/>
 *     &lt;enumeration value="UserInteraction"/>
 *     &lt;enumeration value="Canceled"/>
 *     &lt;enumeration value="Maintenance"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateState")
@XmlEnum
public enum UpdateState {

    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),
    @XmlEnumValue("Downloading")
    DOWNLOADING("Downloading"),
    @XmlEnumValue("Downloaded")
    DOWNLOADED("Downloaded"),
    @XmlEnumValue("Installing")
    INSTALLING("Installing"),
    @XmlEnumValue("Installed")
    INSTALLED("Installed"),
    @XmlEnumValue("UserInteraction")
    USER_INTERACTION("UserInteraction"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Maintenance")
    MAINTENANCE("Maintenance"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    UpdateState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateState fromValue(String v) {
        for (UpdateState c: UpdateState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

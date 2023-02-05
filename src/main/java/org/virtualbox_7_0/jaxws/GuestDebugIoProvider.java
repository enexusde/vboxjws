
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestDebugIoProvider.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuestDebugIoProvider">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="TCP"/>
 *     &lt;enumeration value="UDP"/>
 *     &lt;enumeration value="IPC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuestDebugIoProvider")
@XmlEnum
public enum GuestDebugIoProvider {

    @XmlEnumValue("None")
    NONE("None"),
    TCP("TCP"),
    UDP("UDP"),
    IPC("IPC");
    private final String value;

    GuestDebugIoProvider(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuestDebugIoProvider fromValue(String v) {
        for (GuestDebugIoProvider c: GuestDebugIoProvider.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

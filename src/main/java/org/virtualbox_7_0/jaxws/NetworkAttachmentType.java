
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkAttachmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkAttachmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="NAT"/>
 *     &lt;enumeration value="Bridged"/>
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="HostOnly"/>
 *     &lt;enumeration value="Generic"/>
 *     &lt;enumeration value="NATNetwork"/>
 *     &lt;enumeration value="Cloud"/>
 *     &lt;enumeration value="HostOnlyNetwork"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkAttachmentType")
@XmlEnum
public enum NetworkAttachmentType {

    @XmlEnumValue("Null")
    NULL("Null"),
    NAT("NAT"),
    @XmlEnumValue("Bridged")
    BRIDGED("Bridged"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("HostOnly")
    HOST_ONLY("HostOnly"),
    @XmlEnumValue("Generic")
    GENERIC("Generic"),
    @XmlEnumValue("NATNetwork")
    NAT_NETWORK("NATNetwork"),
    @XmlEnumValue("Cloud")
    CLOUD("Cloud"),
    @XmlEnumValue("HostOnlyNetwork")
    HOST_ONLY_NETWORK("HostOnlyNetwork");
    private final String value;

    NetworkAttachmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkAttachmentType fromValue(String v) {
        for (NetworkAttachmentType c: NetworkAttachmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkAdapterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkAdapterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Null"/>
 *     &lt;enumeration value="Am79C970A"/>
 *     &lt;enumeration value="Am79C973"/>
 *     &lt;enumeration value="I82540EM"/>
 *     &lt;enumeration value="I82543GC"/>
 *     &lt;enumeration value="I82545EM"/>
 *     &lt;enumeration value="Virtio"/>
 *     &lt;enumeration value="Am79C960"/>
 *     &lt;enumeration value="NE2000"/>
 *     &lt;enumeration value="NE1000"/>
 *     &lt;enumeration value="WD8013"/>
 *     &lt;enumeration value="WD8003"/>
 *     &lt;enumeration value="ELNK2"/>
 *     &lt;enumeration value="ELNK1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkAdapterType")
@XmlEnum
public enum NetworkAdapterType {

    @XmlEnumValue("Null")
    NULL("Null"),
    @XmlEnumValue("Am79C970A")
    AM_79_C_970_A("Am79C970A"),
    @XmlEnumValue("Am79C973")
    AM_79_C_973("Am79C973"),
    @XmlEnumValue("I82540EM")
    I_82540_EM("I82540EM"),
    @XmlEnumValue("I82543GC")
    I_82543_GC("I82543GC"),
    @XmlEnumValue("I82545EM")
    I_82545_EM("I82545EM"),
    @XmlEnumValue("Virtio")
    VIRTIO("Virtio"),
    @XmlEnumValue("Am79C960")
    AM_79_C_960("Am79C960"),
    @XmlEnumValue("NE2000")
    NE_2000("NE2000"),
    @XmlEnumValue("NE1000")
    NE_1000("NE1000"),
    @XmlEnumValue("WD8013")
    WD_8013("WD8013"),
    @XmlEnumValue("WD8003")
    WD_8003("WD8003"),
    @XmlEnumValue("ELNK2")
    ELNK_2("ELNK2"),
    @XmlEnumValue("ELNK1")
    ELNK_1("ELNK1");
    private final String value;

    NetworkAdapterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkAdapterType fromValue(String v) {
        for (NetworkAdapterType c: NetworkAdapterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

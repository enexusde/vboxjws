
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DnDAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DnDAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ignore"/>
 *     &lt;enumeration value="Copy"/>
 *     &lt;enumeration value="Move"/>
 *     &lt;enumeration value="Link"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DnDAction")
@XmlEnum
public enum DnDAction {

    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    @XmlEnumValue("Copy")
    COPY("Copy"),
    @XmlEnumValue("Move")
    MOVE("Move"),
    @XmlEnumValue("Link")
    LINK("Link");
    private final String value;

    DnDAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DnDAction fromValue(String v) {
        for (DnDAction c: DnDAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FramebufferCapabilities.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FramebufferCapabilities">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UpdateImage"/>
 *     &lt;enumeration value="VHWA"/>
 *     &lt;enumeration value="VisibleRegion"/>
 *     &lt;enumeration value="RenderCursor"/>
 *     &lt;enumeration value="MoveCursor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FramebufferCapabilities")
@XmlEnum
public enum FramebufferCapabilities {

    @XmlEnumValue("UpdateImage")
    UPDATE_IMAGE("UpdateImage"),
    VHWA("VHWA"),
    @XmlEnumValue("VisibleRegion")
    VISIBLE_REGION("VisibleRegion"),
    @XmlEnumValue("RenderCursor")
    RENDER_CURSOR("RenderCursor"),
    @XmlEnumValue("MoveCursor")
    MOVE_CURSOR("MoveCursor");
    private final String value;

    FramebufferCapabilities(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FramebufferCapabilities fromValue(String v) {
        for (FramebufferCapabilities c: FramebufferCapabilities.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FsObjMoveFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FsObjMoveFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Replace"/>
 *     &lt;enumeration value="FollowLinks"/>
 *     &lt;enumeration value="AllowDirectoryMoves"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FsObjMoveFlag")
@XmlEnum
public enum FsObjMoveFlag {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Replace")
    REPLACE("Replace"),
    @XmlEnumValue("FollowLinks")
    FOLLOW_LINKS("FollowLinks"),
    @XmlEnumValue("AllowDirectoryMoves")
    ALLOW_DIRECTORY_MOVES("AllowDirectoryMoves");
    private final String value;

    FsObjMoveFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FsObjMoveFlag fromValue(String v) {
        for (FsObjMoveFlag c: FsObjMoveFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FsObjRenameFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FsObjRenameFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoReplace"/>
 *     &lt;enumeration value="Replace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FsObjRenameFlag")
@XmlEnum
public enum FsObjRenameFlag {

    @XmlEnumValue("NoReplace")
    NO_REPLACE("NoReplace"),
    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    FsObjRenameFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FsObjRenameFlag fromValue(String v) {
        for (FsObjRenameFlag c: FsObjRenameFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

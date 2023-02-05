
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KeepAllMACs"/>
 *     &lt;enumeration value="KeepNATMACs"/>
 *     &lt;enumeration value="ImportToVDI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImportOptions")
@XmlEnum
public enum ImportOptions {

    @XmlEnumValue("KeepAllMACs")
    KEEP_ALL_MA_CS("KeepAllMACs"),
    @XmlEnumValue("KeepNATMACs")
    KEEP_NATMA_CS("KeepNATMACs"),
    @XmlEnumValue("ImportToVDI")
    IMPORT_TO_VDI("ImportToVDI");
    private final String value;

    ImportOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportOptions fromValue(String v) {
        for (ImportOptions c: ImportOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

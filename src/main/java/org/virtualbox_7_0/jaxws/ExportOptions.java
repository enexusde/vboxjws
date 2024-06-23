
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExportOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CreateManifest"/>
 *     &lt;enumeration value="ExportDVDImages"/>
 *     &lt;enumeration value="StripAllMACs"/>
 *     &lt;enumeration value="StripAllNonNATMACs"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExportOptions")
@XmlEnum
public enum ExportOptions {

    @XmlEnumValue("CreateManifest")
    CREATE_MANIFEST("CreateManifest"),
    @XmlEnumValue("ExportDVDImages")
    EXPORT_DVD_IMAGES("ExportDVDImages"),
    @XmlEnumValue("StripAllMACs")
    STRIP_ALL_MA_CS("StripAllMACs"),
    @XmlEnumValue("StripAllNonNATMACs")
    STRIP_ALL_NON_NATMA_CS("StripAllNonNATMACs");
    private final String value;

    ExportOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExportOptions fromValue(String v) {
        for (ExportOptions c: ExportOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

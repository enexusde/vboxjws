
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordingRateControlMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordingRateControlMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABR"/>
 *     &lt;enumeration value="CBR"/>
 *     &lt;enumeration value="VBR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecordingRateControlMode")
@XmlEnum
public enum RecordingRateControlMode {

    ABR,
    CBR,
    VBR;

    public String value() {
        return name();
    }

    public static RecordingRateControlMode fromValue(String v) {
        return valueOf(v);
    }

}

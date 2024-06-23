
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordingVideoCodec.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordingVideoCodec">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MJPEG"/>
 *     &lt;enumeration value="H262"/>
 *     &lt;enumeration value="H264"/>
 *     &lt;enumeration value="H265"/>
 *     &lt;enumeration value="H266"/>
 *     &lt;enumeration value="VP8"/>
 *     &lt;enumeration value="VP9"/>
 *     &lt;enumeration value="AV1"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecordingVideoCodec")
@XmlEnum
public enum RecordingVideoCodec {

    @XmlEnumValue("None")
    NONE("None"),
    MJPEG("MJPEG"),
    @XmlEnumValue("H262")
    H_262("H262"),
    @XmlEnumValue("H264")
    H_264("H264"),
    @XmlEnumValue("H265")
    H_265("H265"),
    @XmlEnumValue("H266")
    H_266("H266"),
    @XmlEnumValue("VP8")
    VP_8("VP8"),
    @XmlEnumValue("VP9")
    VP_9("VP9"),
    @XmlEnumValue("AV1")
    AV_1("AV1"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RecordingVideoCodec(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordingVideoCodec fromValue(String v) {
        for (RecordingVideoCodec c: RecordingVideoCodec.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

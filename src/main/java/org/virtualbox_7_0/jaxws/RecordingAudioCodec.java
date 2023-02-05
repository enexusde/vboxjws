
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordingAudioCodec.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordingAudioCodec">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="WavPCM"/>
 *     &lt;enumeration value="MP3"/>
 *     &lt;enumeration value="OggVorbis"/>
 *     &lt;enumeration value="Opus"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecordingAudioCodec")
@XmlEnum
public enum RecordingAudioCodec {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("WavPCM")
    WAV_PCM("WavPCM"),
    @XmlEnumValue("MP3")
    MP_3("MP3"),
    @XmlEnumValue("OggVorbis")
    OGG_VORBIS("OggVorbis"),
    @XmlEnumValue("Opus")
    OPUS("Opus"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RecordingAudioCodec(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordingAudioCodec fromValue(String v) {
        for (RecordingAudioCodec c: RecordingAudioCodec.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

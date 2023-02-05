
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="audioCodec" type="{http://www.virtualbox.org/}RecordingAudioCodec"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_this",
    "audioCodec"
})
@XmlRootElement(name = "IRecordingScreenSettings_setAudioCodec")
public class IRecordingScreenSettingsSetAudioCodec {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected RecordingAudioCodec audioCodec;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThis(String value) {
        this._this = value;
    }

    /**
     * Gets the value of the audioCodec property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingAudioCodec }
     *     
     */
    public RecordingAudioCodec getAudioCodec() {
        return audioCodec;
    }

    /**
     * Sets the value of the audioCodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingAudioCodec }
     *     
     */
    public void setAudioCodec(RecordingAudioCodec value) {
        this.audioCodec = value;
    }

}

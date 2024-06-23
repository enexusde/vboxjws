
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usInterval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="usSampleTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "filename",
    "usInterval",
    "usSampleTime"
})
@XmlRootElement(name = "IMachineDebugger_takeGuestSample")
public class IMachineDebuggerTakeGuestSample {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected String filename;
    @XmlSchemaType(name = "unsignedInt")
    protected long usInterval;
    protected long usSampleTime;

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
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the usInterval property.
     * 
     */
    public long getUsInterval() {
        return usInterval;
    }

    /**
     * Sets the value of the usInterval property.
     * 
     */
    public void setUsInterval(long value) {
        this.usInterval = value;
    }

    /**
     * Gets the value of the usSampleTime property.
     * 
     */
    public long getUsSampleTime() {
        return usSampleTime;
    }

    /**
     * Sets the value of the usSampleTime property.
     * 
     */
    public void setUsSampleTime(long value) {
        this.usSampleTime = value;
    }

}

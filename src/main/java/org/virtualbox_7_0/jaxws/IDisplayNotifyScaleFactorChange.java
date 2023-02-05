
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="screenId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="u32ScaleFactorWMultiplied" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="u32ScaleFactorHMultiplied" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "screenId",
    "u32ScaleFactorWMultiplied",
    "u32ScaleFactorHMultiplied"
})
@XmlRootElement(name = "IDisplay_notifyScaleFactorChange")
public class IDisplayNotifyScaleFactorChange {

    @XmlElement(required = true)
    protected String _this;
    @XmlSchemaType(name = "unsignedInt")
    protected long screenId;
    @XmlSchemaType(name = "unsignedInt")
    protected long u32ScaleFactorWMultiplied;
    @XmlSchemaType(name = "unsignedInt")
    protected long u32ScaleFactorHMultiplied;

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
     * Gets the value of the screenId property.
     * 
     */
    public long getScreenId() {
        return screenId;
    }

    /**
     * Sets the value of the screenId property.
     * 
     */
    public void setScreenId(long value) {
        this.screenId = value;
    }

    /**
     * Gets the value of the u32ScaleFactorWMultiplied property.
     * 
     */
    public long getU32ScaleFactorWMultiplied() {
        return u32ScaleFactorWMultiplied;
    }

    /**
     * Sets the value of the u32ScaleFactorWMultiplied property.
     * 
     */
    public void setU32ScaleFactorWMultiplied(long value) {
        this.u32ScaleFactorWMultiplied = value;
    }

    /**
     * Gets the value of the u32ScaleFactorHMultiplied property.
     * 
     */
    public long getU32ScaleFactorHMultiplied() {
        return u32ScaleFactorHMultiplied;
    }

    /**
     * Sets the value of the u32ScaleFactorHMultiplied property.
     * 
     */
    public void setU32ScaleFactorHMultiplied(long value) {
        this.u32ScaleFactorHMultiplied = value;
    }

}

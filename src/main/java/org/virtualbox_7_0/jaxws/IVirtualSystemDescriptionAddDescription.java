
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="type" type="{http://www.virtualbox.org/}VirtualSystemDescriptionType"/>
 *         &lt;element name="VBoxValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extraConfigValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "type",
    "vBoxValue",
    "extraConfigValue"
})
@XmlRootElement(name = "IVirtualSystemDescription_addDescription")
public class IVirtualSystemDescriptionAddDescription {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected VirtualSystemDescriptionType type;
    @XmlElement(name = "VBoxValue", required = true)
    protected String vBoxValue;
    @XmlElement(required = true)
    protected String extraConfigValue;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualSystemDescriptionType }
     *     
     */
    public VirtualSystemDescriptionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualSystemDescriptionType }
     *     
     */
    public void setType(VirtualSystemDescriptionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the vBoxValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVBoxValue() {
        return vBoxValue;
    }

    /**
     * Sets the value of the vBoxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVBoxValue(String value) {
        this.vBoxValue = value;
    }

    /**
     * Gets the value of the extraConfigValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraConfigValue() {
        return extraConfigValue;
    }

    /**
     * Sets the value of the extraConfigValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraConfigValue(String value) {
        this.extraConfigValue = value;
    }

}

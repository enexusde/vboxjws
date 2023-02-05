
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
 *         &lt;element name="type" type="{http://www.virtualbox.org/}VirtualSystemDescriptionType"/>
 *         &lt;element name="which" type="{http://www.virtualbox.org/}VirtualSystemDescriptionValueType"/>
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
    "which"
})
@XmlRootElement(name = "IVirtualSystemDescription_getValuesByType")
public class IVirtualSystemDescriptionGetValuesByType {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected VirtualSystemDescriptionType type;
    @XmlElement(required = true)
    protected VirtualSystemDescriptionValueType which;

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
     * Gets the value of the which property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualSystemDescriptionValueType }
     *     
     */
    public VirtualSystemDescriptionValueType getWhich() {
        return which;
    }

    /**
     * Sets the value of the which property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualSystemDescriptionValueType }
     *     
     */
    public void setWhich(VirtualSystemDescriptionValueType value) {
        this.which = value;
    }

}

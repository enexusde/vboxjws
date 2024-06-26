
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
 *         &lt;element name="trunkName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trunkType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "trunkName",
    "trunkType"
})
@XmlRootElement(name = "IDHCPServer_start")
public class IDHCPServerStart {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected String trunkName;
    @XmlElement(required = true)
    protected String trunkType;

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
     * Gets the value of the trunkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkName() {
        return trunkName;
    }

    /**
     * Sets the value of the trunkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkName(String value) {
        this.trunkName = value;
    }

    /**
     * Gets the value of the trunkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkType() {
        return trunkType;
    }

    /**
     * Sets the value of the trunkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkType(String value) {
        this.trunkType = value;
    }

}

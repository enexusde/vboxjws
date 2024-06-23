
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
 *         &lt;element name="VRDEAuthLibrary" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "vrdeAuthLibrary"
})
@XmlRootElement(name = "ISystemProperties_setVRDEAuthLibrary")
public class ISystemPropertiesSetVRDEAuthLibrary {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(name = "VRDEAuthLibrary", required = true)
    protected String vrdeAuthLibrary;

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
     * Gets the value of the vrdeAuthLibrary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRDEAuthLibrary() {
        return vrdeAuthLibrary;
    }

    /**
     * Sets the value of the vrdeAuthLibrary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRDEAuthLibrary(String value) {
        this.vrdeAuthLibrary = value;
    }

}

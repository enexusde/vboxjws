
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
 *         &lt;element name="storageBus" type="{http://www.virtualbox.org/}StorageBus"/>
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
    "storageBus"
})
@XmlRootElement(name = "ISystemProperties_getStorageControllerTypesForStorageBus")
public class ISystemPropertiesGetStorageControllerTypesForStorageBus {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected StorageBus storageBus;

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
     * Gets the value of the storageBus property.
     * 
     * @return
     *     possible object is
     *     {@link StorageBus }
     *     
     */
    public StorageBus getStorageBus() {
        return storageBus;
    }

    /**
     * Sets the value of the storageBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageBus }
     *     
     */
    public void setStorageBus(StorageBus value) {
        this.storageBus = value;
    }

}

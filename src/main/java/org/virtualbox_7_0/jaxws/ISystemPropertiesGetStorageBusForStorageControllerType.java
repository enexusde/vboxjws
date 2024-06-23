
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
 *         &lt;element name="storageControllerType" type="{http://www.virtualbox.org/}StorageControllerType"/>
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
    "storageControllerType"
})
@XmlRootElement(name = "ISystemProperties_getStorageBusForStorageControllerType")
public class ISystemPropertiesGetStorageBusForStorageControllerType {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected StorageControllerType storageControllerType;

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
     * Gets the value of the storageControllerType property.
     * 
     * @return
     *     possible object is
     *     {@link StorageControllerType }
     *     
     */
    public StorageControllerType getStorageControllerType() {
        return storageControllerType;
    }

    /**
     * Sets the value of the storageControllerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageControllerType }
     *     
     */
    public void setStorageControllerType(StorageControllerType value) {
        this.storageControllerType = value;
    }

}

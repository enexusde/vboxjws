
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
 *         &lt;element name="cipher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passwordId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "cipher",
    "passwordId"
})
@XmlRootElement(name = "IMachine_getEncryptionSettingsResponse")
public class IMachineGetEncryptionSettingsResponse {

    @XmlElement(required = true)
    protected String cipher;
    @XmlElement(required = true)
    protected String passwordId;

    /**
     * Gets the value of the cipher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCipher() {
        return cipher;
    }

    /**
     * Sets the value of the cipher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCipher(String value) {
        this.cipher = value;
    }

    /**
     * Gets the value of the passwordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordId() {
        return passwordId;
    }

    /**
     * Sets the value of the passwordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordId(String value) {
        this.passwordId = value;
    }

}

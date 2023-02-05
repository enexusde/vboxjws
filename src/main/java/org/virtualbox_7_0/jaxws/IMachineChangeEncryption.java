
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
 *         &lt;element name="currentPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cipher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newPasswordId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="force" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "currentPassword",
    "cipher",
    "newPassword",
    "newPasswordId",
    "force"
})
@XmlRootElement(name = "IMachine_changeEncryption")
public class IMachineChangeEncryption {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected String currentPassword;
    @XmlElement(required = true)
    protected String cipher;
    @XmlElement(required = true)
    protected String newPassword;
    @XmlElement(required = true)
    protected String newPasswordId;
    protected boolean force;

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
     * Gets the value of the currentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * Sets the value of the currentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPassword(String value) {
        this.currentPassword = value;
    }

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
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

    /**
     * Gets the value of the newPasswordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPasswordId() {
        return newPasswordId;
    }

    /**
     * Sets the value of the newPasswordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPasswordId(String value) {
        this.newPasswordId = value;
    }

    /**
     * Gets the value of the force property.
     * 
     */
    public boolean isForce() {
        return force;
    }

    /**
     * Sets the value of the force property.
     * 
     */
    public void setForce(boolean value) {
        this.force = value;
    }

}

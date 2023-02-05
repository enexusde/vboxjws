
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
 *         &lt;element name="hostAddress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desiredGuestAddress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tryToUnbind" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "hostAddress",
    "desiredGuestAddress",
    "tryToUnbind"
})
@XmlRootElement(name = "IMachine_attachHostPCIDevice")
public class IMachineAttachHostPCIDevice {

    @XmlElement(required = true)
    protected String _this;
    protected int hostAddress;
    protected int desiredGuestAddress;
    protected boolean tryToUnbind;

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
     * Gets the value of the hostAddress property.
     * 
     */
    public int getHostAddress() {
        return hostAddress;
    }

    /**
     * Sets the value of the hostAddress property.
     * 
     */
    public void setHostAddress(int value) {
        this.hostAddress = value;
    }

    /**
     * Gets the value of the desiredGuestAddress property.
     * 
     */
    public int getDesiredGuestAddress() {
        return desiredGuestAddress;
    }

    /**
     * Sets the value of the desiredGuestAddress property.
     * 
     */
    public void setDesiredGuestAddress(int value) {
        this.desiredGuestAddress = value;
    }

    /**
     * Gets the value of the tryToUnbind property.
     * 
     */
    public boolean isTryToUnbind() {
        return tryToUnbind;
    }

    /**
     * Sets the value of the tryToUnbind property.
     * 
     */
    public void setTryToUnbind(boolean value) {
        this.tryToUnbind = value;
    }

}

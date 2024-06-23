
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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="controllerPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="device" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="discard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "name",
    "controllerPort",
    "device",
    "discard"
})
@XmlRootElement(name = "IMachine_setAutoDiscardForDevice")
public class IMachineSetAutoDiscardForDevice {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected String name;
    protected int controllerPort;
    protected int device;
    protected boolean discard;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the controllerPort property.
     * 
     */
    public int getControllerPort() {
        return controllerPort;
    }

    /**
     * Sets the value of the controllerPort property.
     * 
     */
    public void setControllerPort(int value) {
        this.controllerPort = value;
    }

    /**
     * Gets the value of the device property.
     * 
     */
    public int getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     */
    public void setDevice(int value) {
        this.device = value;
    }

    /**
     * Gets the value of the discard property.
     * 
     */
    public boolean isDiscard() {
        return discard;
    }

    /**
     * Sets the value of the discard property.
     * 
     */
    public void setDiscard(boolean value) {
        this.discard = value;
    }

}

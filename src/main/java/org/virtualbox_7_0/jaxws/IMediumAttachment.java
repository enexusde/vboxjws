
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IMediumAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMediumAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="machine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="medium" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="controller" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="device" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.virtualbox.org/}DeviceType"/>
 *         &lt;element name="passthrough" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="temporaryEject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isEjected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nonRotational" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="discard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hotPluggable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bandwidthGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMediumAttachment", propOrder = {
    "machine",
    "medium",
    "controller",
    "port",
    "device",
    "type",
    "passthrough",
    "temporaryEject",
    "isEjected",
    "nonRotational",
    "discard",
    "hotPluggable",
    "bandwidthGroup"
})
public class IMediumAttachment {

    @XmlElement(required = true)
    protected String machine;
    @XmlElement(required = true)
    protected String medium;
    @XmlElement(required = true)
    protected String controller;
    protected int port;
    protected int device;
    @XmlElement(required = true)
    protected DeviceType type;
    protected boolean passthrough;
    protected boolean temporaryEject;
    protected boolean isEjected;
    protected boolean nonRotational;
    protected boolean discard;
    protected boolean hotPluggable;
    @XmlElement(required = true)
    protected String bandwidthGroup;

    /**
     * Gets the value of the machine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachine() {
        return machine;
    }

    /**
     * Sets the value of the machine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachine(String value) {
        this.machine = value;
    }

    /**
     * Gets the value of the medium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedium() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedium(String value) {
        this.medium = value;
    }

    /**
     * Gets the value of the controller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getController() {
        return controller;
    }

    /**
     * Sets the value of the controller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setController(String value) {
        this.controller = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceType }
     *     
     */
    public DeviceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType }
     *     
     */
    public void setType(DeviceType value) {
        this.type = value;
    }

    /**
     * Gets the value of the passthrough property.
     * 
     */
    public boolean isPassthrough() {
        return passthrough;
    }

    /**
     * Sets the value of the passthrough property.
     * 
     */
    public void setPassthrough(boolean value) {
        this.passthrough = value;
    }

    /**
     * Gets the value of the temporaryEject property.
     * 
     */
    public boolean isTemporaryEject() {
        return temporaryEject;
    }

    /**
     * Sets the value of the temporaryEject property.
     * 
     */
    public void setTemporaryEject(boolean value) {
        this.temporaryEject = value;
    }

    /**
     * Gets the value of the isEjected property.
     * 
     */
    public boolean isIsEjected() {
        return isEjected;
    }

    /**
     * Sets the value of the isEjected property.
     * 
     */
    public void setIsEjected(boolean value) {
        this.isEjected = value;
    }

    /**
     * Gets the value of the nonRotational property.
     * 
     */
    public boolean isNonRotational() {
        return nonRotational;
    }

    /**
     * Sets the value of the nonRotational property.
     * 
     */
    public void setNonRotational(boolean value) {
        this.nonRotational = value;
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

    /**
     * Gets the value of the hotPluggable property.
     * 
     */
    public boolean isHotPluggable() {
        return hotPluggable;
    }

    /**
     * Sets the value of the hotPluggable property.
     * 
     */
    public void setHotPluggable(boolean value) {
        this.hotPluggable = value;
    }

    /**
     * Gets the value of the bandwidthGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandwidthGroup() {
        return bandwidthGroup;
    }

    /**
     * Sets the value of the bandwidthGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandwidthGroup(String value) {
        this.bandwidthGroup = value;
    }

}

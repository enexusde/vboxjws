
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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="writable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="automount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="autoMountPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "hostPath",
    "writable",
    "automount",
    "autoMountPoint"
})
@XmlRootElement(name = "IConsole_createSharedFolder")
public class IConsoleCreateSharedFolder {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String hostPath;
    protected boolean writable;
    protected boolean automount;
    @XmlElement(required = true)
    protected String autoMountPoint;

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
     * Gets the value of the hostPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostPath() {
        return hostPath;
    }

    /**
     * Sets the value of the hostPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostPath(String value) {
        this.hostPath = value;
    }

    /**
     * Gets the value of the writable property.
     * 
     */
    public boolean isWritable() {
        return writable;
    }

    /**
     * Sets the value of the writable property.
     * 
     */
    public void setWritable(boolean value) {
        this.writable = value;
    }

    /**
     * Gets the value of the automount property.
     * 
     */
    public boolean isAutomount() {
        return automount;
    }

    /**
     * Sets the value of the automount property.
     * 
     */
    public void setAutomount(boolean value) {
        this.automount = value;
    }

    /**
     * Gets the value of the autoMountPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoMountPoint() {
        return autoMountPoint;
    }

    /**
     * Sets the value of the autoMountPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoMountPoint(String value) {
        this.autoMountPoint = value;
    }

}

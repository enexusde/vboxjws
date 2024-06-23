
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="proto" type="{http://www.virtualbox.org/}NATProtocol"/>
 *         &lt;element name="hostIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostPort" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="guestIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="guestPort" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
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
    "proto",
    "hostIP",
    "hostPort",
    "guestIP",
    "guestPort"
})
@XmlRootElement(name = "INATEngine_addRedirect")
public class INATEngineAddRedirect {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected NATProtocol proto;
    @XmlElement(required = true)
    protected String hostIP;
    @XmlSchemaType(name = "unsignedShort")
    protected int hostPort;
    @XmlElement(required = true)
    protected String guestIP;
    @XmlSchemaType(name = "unsignedShort")
    protected int guestPort;

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
     * Gets the value of the proto property.
     * 
     * @return
     *     possible object is
     *     {@link NATProtocol }
     *     
     */
    public NATProtocol getProto() {
        return proto;
    }

    /**
     * Sets the value of the proto property.
     * 
     * @param value
     *     allowed object is
     *     {@link NATProtocol }
     *     
     */
    public void setProto(NATProtocol value) {
        this.proto = value;
    }

    /**
     * Gets the value of the hostIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostIP() {
        return hostIP;
    }

    /**
     * Sets the value of the hostIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostIP(String value) {
        this.hostIP = value;
    }

    /**
     * Gets the value of the hostPort property.
     * 
     */
    public int getHostPort() {
        return hostPort;
    }

    /**
     * Sets the value of the hostPort property.
     * 
     */
    public void setHostPort(int value) {
        this.hostPort = value;
    }

    /**
     * Gets the value of the guestIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestIP() {
        return guestIP;
    }

    /**
     * Sets the value of the guestIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestIP(String value) {
        this.guestIP = value;
    }

    /**
     * Gets the value of the guestPort property.
     * 
     */
    public int getGuestPort() {
        return guestPort;
    }

    /**
     * Sets the value of the guestPort property.
     * 
     */
    public void setGuestPort(int value) {
        this.guestPort = value;
    }

}

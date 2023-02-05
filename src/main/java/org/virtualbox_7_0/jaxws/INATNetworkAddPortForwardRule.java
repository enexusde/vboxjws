
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="isIpv6" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ruleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "isIpv6",
    "ruleName",
    "proto",
    "hostIP",
    "hostPort",
    "guestIP",
    "guestPort"
})
@XmlRootElement(name = "INATNetwork_addPortForwardRule")
public class INATNetworkAddPortForwardRule {

    @XmlElement(required = true)
    protected String _this;
    protected boolean isIpv6;
    @XmlElement(required = true)
    protected String ruleName;
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
     * Gets the value of the isIpv6 property.
     * 
     */
    public boolean isIsIpv6() {
        return isIpv6;
    }

    /**
     * Sets the value of the isIpv6 property.
     * 
     */
    public void setIsIpv6(boolean value) {
        this.isIpv6 = value;
    }

    /**
     * Gets the value of the ruleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * Sets the value of the ruleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleName(String value) {
        this.ruleName = value;
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

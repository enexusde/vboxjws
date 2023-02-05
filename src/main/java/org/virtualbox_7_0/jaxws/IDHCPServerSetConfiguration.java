
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
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="networkMask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ipAddress",
    "networkMask",
    "fromIPAddress",
    "toIPAddress"
})
@XmlRootElement(name = "IDHCPServer_setConfiguration")
public class IDHCPServerSetConfiguration {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(name = "IPAddress", required = true)
    protected String ipAddress;
    @XmlElement(required = true)
    protected String networkMask;
    @XmlElement(name = "FromIPAddress", required = true)
    protected String fromIPAddress;
    @XmlElement(name = "ToIPAddress", required = true)
    protected String toIPAddress;

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
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the networkMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkMask() {
        return networkMask;
    }

    /**
     * Sets the value of the networkMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkMask(String value) {
        this.networkMask = value;
    }

    /**
     * Gets the value of the fromIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromIPAddress() {
        return fromIPAddress;
    }

    /**
     * Sets the value of the fromIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromIPAddress(String value) {
        this.fromIPAddress = value;
    }

    /**
     * Gets the value of the toIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToIPAddress() {
        return toIPAddress;
    }

    /**
     * Sets the value of the toIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToIPAddress(String value) {
        this.toIPAddress = value;
    }

}


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
 *         &lt;element name="tunnelNetworkName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tunnelNetworkRange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gatewayOsName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gatewayOsVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gatewayShape" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "tunnelNetworkName",
    "tunnelNetworkRange",
    "gatewayOsName",
    "gatewayOsVersion",
    "gatewayShape"
})
@XmlRootElement(name = "ICloudClient_setupCloudNetworkEnvironment")
public class ICloudClientSetupCloudNetworkEnvironment {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected String tunnelNetworkName;
    @XmlElement(required = true)
    protected String tunnelNetworkRange;
    @XmlElement(required = true)
    protected String gatewayOsName;
    @XmlElement(required = true)
    protected String gatewayOsVersion;
    @XmlElement(required = true)
    protected String gatewayShape;

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
     * Gets the value of the tunnelNetworkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunnelNetworkName() {
        return tunnelNetworkName;
    }

    /**
     * Sets the value of the tunnelNetworkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunnelNetworkName(String value) {
        this.tunnelNetworkName = value;
    }

    /**
     * Gets the value of the tunnelNetworkRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunnelNetworkRange() {
        return tunnelNetworkRange;
    }

    /**
     * Sets the value of the tunnelNetworkRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunnelNetworkRange(String value) {
        this.tunnelNetworkRange = value;
    }

    /**
     * Gets the value of the gatewayOsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayOsName() {
        return gatewayOsName;
    }

    /**
     * Sets the value of the gatewayOsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayOsName(String value) {
        this.gatewayOsName = value;
    }

    /**
     * Gets the value of the gatewayOsVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayOsVersion() {
        return gatewayOsVersion;
    }

    /**
     * Sets the value of the gatewayOsVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayOsVersion(String value) {
        this.gatewayOsVersion = value;
    }

    /**
     * Gets the value of the gatewayShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayShape() {
        return gatewayShape;
    }

    /**
     * Sets the value of the gatewayShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayShape(String value) {
        this.gatewayShape = value;
    }

}

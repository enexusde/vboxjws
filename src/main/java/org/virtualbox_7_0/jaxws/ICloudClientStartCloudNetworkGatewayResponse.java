
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
 *         &lt;element name="gatewayInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnval" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "gatewayInfo",
    "returnval"
})
@XmlRootElement(name = "ICloudClient_startCloudNetworkGatewayResponse")
public class ICloudClientStartCloudNetworkGatewayResponse {

    @XmlElement(required = true)
    protected String gatewayInfo;
    @XmlElement(required = true)
    protected String returnval;

    /**
     * Gets the value of the gatewayInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayInfo() {
        return gatewayInfo;
    }

    /**
     * Sets the value of the gatewayInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayInfo(String value) {
        this.gatewayInfo = value;
    }

    /**
     * Gets the value of the returnval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnval() {
        return returnval;
    }

    /**
     * Sets the value of the returnval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnval(String value) {
        this.returnval = value;
    }

}

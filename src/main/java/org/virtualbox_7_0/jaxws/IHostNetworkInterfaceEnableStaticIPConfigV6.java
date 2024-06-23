
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
 *         &lt;element name="IPV6Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IPV6NetworkMaskPrefixLength" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "ipv6Address",
    "ipv6NetworkMaskPrefixLength"
})
@XmlRootElement(name = "IHostNetworkInterface_enableStaticIPConfigV6")
public class IHostNetworkInterfaceEnableStaticIPConfigV6 {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(name = "IPV6Address", required = true)
    protected String ipv6Address;
    @XmlElement(name = "IPV6NetworkMaskPrefixLength")
    @XmlSchemaType(name = "unsignedInt")
    protected long ipv6NetworkMaskPrefixLength;

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
     * Gets the value of the ipv6Address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPV6Address() {
        return ipv6Address;
    }

    /**
     * Sets the value of the ipv6Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPV6Address(String value) {
        this.ipv6Address = value;
    }

    /**
     * Gets the value of the ipv6NetworkMaskPrefixLength property.
     * 
     */
    public long getIPV6NetworkMaskPrefixLength() {
        return ipv6NetworkMaskPrefixLength;
    }

    /**
     * Sets the value of the ipv6NetworkMaskPrefixLength property.
     * 
     */
    public void setIPV6NetworkMaskPrefixLength(long value) {
        this.ipv6NetworkMaskPrefixLength = value;
    }

}

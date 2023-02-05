
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
 *         &lt;element name="encoding" type="{http://www.virtualbox.org/}DHCPOptionEncoding"/>
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
    "encoding",
    "returnval"
})
@XmlRootElement(name = "IDHCPConfig_getOptionResponse")
public class IDHCPConfigGetOptionResponse {

    @XmlElement(required = true)
    protected DHCPOptionEncoding encoding;
    @XmlElement(required = true)
    protected String returnval;

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link DHCPOptionEncoding }
     *     
     */
    public DHCPOptionEncoding getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link DHCPOptionEncoding }
     *     
     */
    public void setEncoding(DHCPOptionEncoding value) {
        this.encoding = value;
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

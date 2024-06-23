
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
 *         &lt;element name="returnNames" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnIds" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "returnNames",
    "returnIds",
    "returnval"
})
@XmlRootElement(name = "ICloudClient_listBootVolumesResponse")
public class ICloudClientListBootVolumesResponse {

    @XmlElement(required = true)
    protected String returnNames;
    @XmlElement(required = true)
    protected String returnIds;
    @XmlElement(required = true)
    protected String returnval;

    /**
     * Gets the value of the returnNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnNames() {
        return returnNames;
    }

    /**
     * Sets the value of the returnNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnNames(String value) {
        this.returnNames = value;
    }

    /**
     * Gets the value of the returnIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnIds() {
        return returnIds;
    }

    /**
     * Sets the value of the returnIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnIds(String value) {
        this.returnIds = value;
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

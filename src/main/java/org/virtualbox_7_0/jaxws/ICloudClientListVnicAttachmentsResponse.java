
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
 *         &lt;element name="returnVnicAttachmentIds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnVnicIds" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "returnVnicAttachmentIds",
    "returnVnicIds",
    "returnval"
})
@XmlRootElement(name = "ICloudClient_listVnicAttachmentsResponse")
public class ICloudClientListVnicAttachmentsResponse {

    @XmlElement(required = true)
    protected String returnVnicAttachmentIds;
    @XmlElement(required = true)
    protected String returnVnicIds;
    @XmlElement(required = true)
    protected String returnval;

    /**
     * Gets the value of the returnVnicAttachmentIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnVnicAttachmentIds() {
        return returnVnicAttachmentIds;
    }

    /**
     * Sets the value of the returnVnicAttachmentIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnVnicAttachmentIds(String value) {
        this.returnVnicAttachmentIds = value;
    }

    /**
     * Gets the value of the returnVnicIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnVnicIds() {
        return returnVnicIds;
    }

    /**
     * Sets the value of the returnVnicIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnVnicIds(String value) {
        this.returnVnicIds = value;
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

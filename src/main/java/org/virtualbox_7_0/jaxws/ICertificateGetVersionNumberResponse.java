
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
 *         &lt;element name="returnval" type="{http://www.virtualbox.org/}CertificateVersion"/>
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
    "returnval"
})
@XmlRootElement(name = "ICertificate_getVersionNumberResponse")
public class ICertificateGetVersionNumberResponse {

    @XmlElement(required = true)
    protected CertificateVersion returnval;

    /**
     * Gets the value of the returnval property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateVersion }
     *     
     */
    public CertificateVersion getReturnval() {
        return returnval;
    }

    /**
     * Sets the value of the returnval property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateVersion }
     *     
     */
    public void setReturnval(CertificateVersion value) {
        this.returnval = value;
    }

}

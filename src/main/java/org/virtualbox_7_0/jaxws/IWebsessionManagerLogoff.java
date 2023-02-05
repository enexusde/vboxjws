
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
 *         &lt;element name="refIVirtualBox" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "refIVirtualBox"
})
@XmlRootElement(name = "IWebsessionManager_logoff")
public class IWebsessionManagerLogoff {

    @XmlElement(required = true)
    protected String refIVirtualBox;

    /**
     * Gets the value of the refIVirtualBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefIVirtualBox() {
        return refIVirtualBox;
    }

    /**
     * Sets the value of the refIVirtualBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefIVirtualBox(String value) {
        this.refIVirtualBox = value;
    }

}

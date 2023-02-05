
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
 *         &lt;element name="usageCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usagePage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="keyRelease" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "usageCode",
    "usagePage",
    "keyRelease"
})
@XmlRootElement(name = "IKeyboard_putUsageCode")
public class IKeyboardPutUsageCode {

    @XmlElement(required = true)
    protected String _this;
    protected int usageCode;
    protected int usagePage;
    protected boolean keyRelease;

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
     * Gets the value of the usageCode property.
     * 
     */
    public int getUsageCode() {
        return usageCode;
    }

    /**
     * Sets the value of the usageCode property.
     * 
     */
    public void setUsageCode(int value) {
        this.usageCode = value;
    }

    /**
     * Gets the value of the usagePage property.
     * 
     */
    public int getUsagePage() {
        return usagePage;
    }

    /**
     * Sets the value of the usagePage property.
     * 
     */
    public void setUsagePage(int value) {
        this.usagePage = value;
    }

    /**
     * Gets the value of the keyRelease property.
     * 
     */
    public boolean isKeyRelease() {
        return keyRelease;
    }

    /**
     * Sets the value of the keyRelease property.
     * 
     */
    public void setKeyRelease(boolean value) {
        this.keyRelease = value;
    }

}

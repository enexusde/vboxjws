
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
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contacts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isTouchScreen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="scanTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "count",
    "contacts",
    "isTouchScreen",
    "scanTime"
})
@XmlRootElement(name = "IMouse_putEventMultiTouchString")
public class IMousePutEventMultiTouchString {

    @XmlElement(required = true)
    protected String _this;
    protected int count;
    @XmlElement(required = true)
    protected String contacts;
    protected boolean isTouchScreen;
    @XmlSchemaType(name = "unsignedInt")
    protected long scanTime;

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
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacts(String value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the isTouchScreen property.
     * 
     */
    public boolean isIsTouchScreen() {
        return isTouchScreen;
    }

    /**
     * Sets the value of the isTouchScreen property.
     * 
     */
    public void setIsTouchScreen(boolean value) {
        this.isTouchScreen = value;
    }

    /**
     * Gets the value of the scanTime property.
     * 
     */
    public long getScanTime() {
        return scanTime;
    }

    /**
     * Sets the value of the scanTime property.
     * 
     */
    public void setScanTime(long value) {
        this.scanTime = value;
    }

}

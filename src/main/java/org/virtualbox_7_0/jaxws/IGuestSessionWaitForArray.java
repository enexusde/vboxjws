
package org.virtualbox_7_0.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="waitFor" type="{http://www.virtualbox.org/}GuestSessionWaitForFlag" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeoutMS" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "waitFor",
    "timeoutMS"
})
@XmlRootElement(name = "IGuestSession_waitForArray")
public class IGuestSessionWaitForArray {

    @XmlElement(required = true)
    protected String _this;
    protected List<GuestSessionWaitForFlag> waitFor;
    @XmlSchemaType(name = "unsignedInt")
    protected long timeoutMS;

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
     * Gets the value of the waitFor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waitFor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaitFor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestSessionWaitForFlag }
     * 
     * 
     */
    public List<GuestSessionWaitForFlag> getWaitFor() {
        if (waitFor == null) {
            waitFor = new ArrayList<GuestSessionWaitForFlag>();
        }
        return this.waitFor;
    }

    /**
     * Gets the value of the timeoutMS property.
     * 
     */
    public long getTimeoutMS() {
        return timeoutMS;
    }

    /**
     * Sets the value of the timeoutMS property.
     * 
     */
    public void setTimeoutMS(long value) {
        this.timeoutMS = value;
    }

}

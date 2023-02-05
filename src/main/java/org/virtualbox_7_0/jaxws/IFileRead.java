
package org.virtualbox_7_0.jaxws;

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
 *         &lt;element name="toRead" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "toRead",
    "timeoutMS"
})
@XmlRootElement(name = "IFile_read")
public class IFileRead {

    @XmlElement(required = true)
    protected String _this;
    @XmlSchemaType(name = "unsignedInt")
    protected long toRead;
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
     * Gets the value of the toRead property.
     * 
     */
    public long getToRead() {
        return toRead;
    }

    /**
     * Sets the value of the toRead property.
     * 
     */
    public void setToRead(long value) {
        this.toRead = value;
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

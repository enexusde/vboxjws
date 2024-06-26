
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
 *         &lt;element name="screenId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="xOrigin" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="yOrigin" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "screenId",
    "xOrigin",
    "yOrigin",
    "width",
    "height"
})
@XmlRootElement(name = "IFramebuffer_notifyChange")
public class IFramebufferNotifyChange {

    @XmlElement(required = true)
    protected String _this;
    @XmlSchemaType(name = "unsignedInt")
    protected long screenId;
    @XmlSchemaType(name = "unsignedInt")
    protected long xOrigin;
    @XmlSchemaType(name = "unsignedInt")
    protected long yOrigin;
    @XmlSchemaType(name = "unsignedInt")
    protected long width;
    @XmlSchemaType(name = "unsignedInt")
    protected long height;

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
     * Gets the value of the screenId property.
     * 
     */
    public long getScreenId() {
        return screenId;
    }

    /**
     * Sets the value of the screenId property.
     * 
     */
    public void setScreenId(long value) {
        this.screenId = value;
    }

    /**
     * Gets the value of the xOrigin property.
     * 
     */
    public long getXOrigin() {
        return xOrigin;
    }

    /**
     * Sets the value of the xOrigin property.
     * 
     */
    public void setXOrigin(long value) {
        this.xOrigin = value;
    }

    /**
     * Gets the value of the yOrigin property.
     * 
     */
    public long getYOrigin() {
        return yOrigin;
    }

    /**
     * Sets the value of the yOrigin property.
     * 
     */
    public void setYOrigin(long value) {
        this.yOrigin = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public long getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(long value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public long getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(long value) {
        this.height = value;
    }

}

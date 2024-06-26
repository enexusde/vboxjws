
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
 *         &lt;element name="display" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="status" type="{http://www.virtualbox.org/}GuestMonitorStatus"/>
 *         &lt;element name="primary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="changeOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="originX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="originY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="bitsPerPixel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "display",
    "status",
    "primary",
    "changeOrigin",
    "originX",
    "originY",
    "width",
    "height",
    "bitsPerPixel"
})
@XmlRootElement(name = "IDisplay_createGuestScreenInfo")
public class IDisplayCreateGuestScreenInfo {

    @XmlElement(required = true)
    protected String _this;
    @XmlSchemaType(name = "unsignedInt")
    protected long display;
    @XmlElement(required = true)
    protected GuestMonitorStatus status;
    protected boolean primary;
    protected boolean changeOrigin;
    protected int originX;
    protected int originY;
    @XmlSchemaType(name = "unsignedInt")
    protected long width;
    @XmlSchemaType(name = "unsignedInt")
    protected long height;
    @XmlSchemaType(name = "unsignedInt")
    protected long bitsPerPixel;

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
     * Gets the value of the display property.
     * 
     */
    public long getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     */
    public void setDisplay(long value) {
        this.display = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link GuestMonitorStatus }
     *     
     */
    public GuestMonitorStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestMonitorStatus }
     *     
     */
    public void setStatus(GuestMonitorStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     */
    public boolean isPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     */
    public void setPrimary(boolean value) {
        this.primary = value;
    }

    /**
     * Gets the value of the changeOrigin property.
     * 
     */
    public boolean isChangeOrigin() {
        return changeOrigin;
    }

    /**
     * Sets the value of the changeOrigin property.
     * 
     */
    public void setChangeOrigin(boolean value) {
        this.changeOrigin = value;
    }

    /**
     * Gets the value of the originX property.
     * 
     */
    public int getOriginX() {
        return originX;
    }

    /**
     * Sets the value of the originX property.
     * 
     */
    public void setOriginX(int value) {
        this.originX = value;
    }

    /**
     * Gets the value of the originY property.
     * 
     */
    public int getOriginY() {
        return originY;
    }

    /**
     * Sets the value of the originY property.
     * 
     */
    public void setOriginY(int value) {
        this.originY = value;
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

    /**
     * Gets the value of the bitsPerPixel property.
     * 
     */
    public long getBitsPerPixel() {
        return bitsPerPixel;
    }

    /**
     * Sets the value of the bitsPerPixel property.
     * 
     */
    public void setBitsPerPixel(long value) {
        this.bitsPerPixel = value;
    }

}

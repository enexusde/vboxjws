
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
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="bitsPerPixel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="xOrigin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yOrigin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="guestMonitorStatus" type="{http://www.virtualbox.org/}GuestMonitorStatus"/>
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
    "width",
    "height",
    "bitsPerPixel",
    "xOrigin",
    "yOrigin",
    "guestMonitorStatus"
})
@XmlRootElement(name = "IDisplay_getScreenResolutionResponse")
public class IDisplayGetScreenResolutionResponse {

    @XmlSchemaType(name = "unsignedInt")
    protected long width;
    @XmlSchemaType(name = "unsignedInt")
    protected long height;
    @XmlSchemaType(name = "unsignedInt")
    protected long bitsPerPixel;
    protected int xOrigin;
    protected int yOrigin;
    @XmlElement(required = true)
    protected GuestMonitorStatus guestMonitorStatus;

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

    /**
     * Gets the value of the xOrigin property.
     * 
     */
    public int getXOrigin() {
        return xOrigin;
    }

    /**
     * Sets the value of the xOrigin property.
     * 
     */
    public void setXOrigin(int value) {
        this.xOrigin = value;
    }

    /**
     * Gets the value of the yOrigin property.
     * 
     */
    public int getYOrigin() {
        return yOrigin;
    }

    /**
     * Sets the value of the yOrigin property.
     * 
     */
    public void setYOrigin(int value) {
        this.yOrigin = value;
    }

    /**
     * Gets the value of the guestMonitorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GuestMonitorStatus }
     *     
     */
    public GuestMonitorStatus getGuestMonitorStatus() {
        return guestMonitorStatus;
    }

    /**
     * Sets the value of the guestMonitorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestMonitorStatus }
     *     
     */
    public void setGuestMonitorStatus(GuestMonitorStatus value) {
        this.guestMonitorStatus = value;
    }

}

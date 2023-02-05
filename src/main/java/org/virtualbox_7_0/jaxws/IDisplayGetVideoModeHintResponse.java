
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "enabled",
    "changeOrigin",
    "originX",
    "originY",
    "width",
    "height",
    "bitsPerPixel"
})
@XmlRootElement(name = "IDisplay_getVideoModeHintResponse")
public class IDisplayGetVideoModeHintResponse {

    protected boolean enabled;
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
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
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

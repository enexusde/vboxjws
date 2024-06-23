
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="originX" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="originY" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "originX",
    "originY",
    "width",
    "height",
    "enabled"
})
@XmlRootElement(name = "IMachine_querySavedGuestScreenInfoResponse")
public class IMachineQuerySavedGuestScreenInfoResponse {

    @XmlSchemaType(name = "unsignedInt")
    protected long originX;
    @XmlSchemaType(name = "unsignedInt")
    protected long originY;
    @XmlSchemaType(name = "unsignedInt")
    protected long width;
    @XmlSchemaType(name = "unsignedInt")
    protected long height;
    protected boolean enabled;

    /**
     * Gets the value of the originX property.
     * 
     */
    public long getOriginX() {
        return originX;
    }

    /**
     * Sets the value of the originX property.
     * 
     */
    public void setOriginX(long value) {
        this.originX = value;
    }

    /**
     * Gets the value of the originY property.
     * 
     */
    public long getOriginY() {
        return originY;
    }

    /**
     * Sets the value of the originY property.
     * 
     */
    public void setOriginY(long value) {
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

}

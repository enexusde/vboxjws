
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
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dw" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="buttonState" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "x",
    "y",
    "dz",
    "dw",
    "buttonState"
})
@XmlRootElement(name = "IMouse_putMouseEventAbsolute")
public class IMousePutMouseEventAbsolute {

    @XmlElement(required = true)
    protected String _this;
    protected int x;
    protected int y;
    protected int dz;
    protected int dw;
    protected int buttonState;

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
     * Gets the value of the x property.
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(int value) {
        this.y = value;
    }

    /**
     * Gets the value of the dz property.
     * 
     */
    public int getDz() {
        return dz;
    }

    /**
     * Sets the value of the dz property.
     * 
     */
    public void setDz(int value) {
        this.dz = value;
    }

    /**
     * Gets the value of the dw property.
     * 
     */
    public int getDw() {
        return dw;
    }

    /**
     * Sets the value of the dw property.
     * 
     */
    public void setDw(int value) {
        this.dw = value;
    }

    /**
     * Gets the value of the buttonState property.
     * 
     */
    public int getButtonState() {
        return buttonState;
    }

    /**
     * Sets the value of the buttonState property.
     * 
     */
    public void setButtonState(int value) {
        this.buttonState = value;
    }

}

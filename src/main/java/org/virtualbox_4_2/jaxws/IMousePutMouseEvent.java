
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dy" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "", propOrder = { "_this", "dx", "dy", "dz", "dw", "buttonState" })
@XmlRootElement(name = "IMouse_putMouseEvent")
public class IMousePutMouseEvent {

	@XmlElement(required = true)
	protected String _this;
	protected int dx;
	protected int dy;
	protected int dz;
	protected int dw;
	protected int buttonState;

	/**
	 * Gets the value of the this property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThis() {
		return _this;
	}

	/**
	 * Sets the value of the this property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setThis(String value) {
		this._this = value;
	}

	/**
	 * Gets the value of the dx property.
	 * 
	 */
	public int getDx() {
		return dx;
	}

	/**
	 * Sets the value of the dx property.
	 * 
	 */
	public void setDx(int value) {
		this.dx = value;
	}

	/**
	 * Gets the value of the dy property.
	 * 
	 */
	public int getDy() {
		return dy;
	}

	/**
	 * Sets the value of the dy property.
	 * 
	 */
	public void setDy(int value) {
		this.dy = value;
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

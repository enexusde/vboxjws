
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="screenId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
@XmlType(name = "", propOrder = { "_this", "screenId", "x", "y", "width", "height" })
@XmlRootElement(name = "IDisplay_viewportChanged")
public class IDisplayViewportChanged {

	@XmlElement(required = true)
	protected String _this;
	@XmlSchemaType(name = "unsignedInt")
	protected long screenId;
	@XmlSchemaType(name = "unsignedInt")
	protected long x;
	@XmlSchemaType(name = "unsignedInt")
	protected long y;
	@XmlSchemaType(name = "unsignedInt")
	protected long width;
	@XmlSchemaType(name = "unsignedInt")
	protected long height;

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
	 * Gets the value of the x property.
	 * 
	 */
	public long getX() {
		return x;
	}

	/**
	 * Sets the value of the x property.
	 * 
	 */
	public void setX(long value) {
		this.x = value;
	}

	/**
	 * Gets the value of the y property.
	 * 
	 */
	public long getY() {
		return y;
	}

	/**
	 * Sets the value of the y property.
	 * 
	 */
	public void setY(long value) {
		this.y = value;
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

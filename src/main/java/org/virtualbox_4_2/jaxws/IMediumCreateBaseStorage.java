
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
 *         &lt;element name="logicalSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="variant" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "logicalSize", "variant" })
@XmlRootElement(name = "IMedium_createBaseStorage")
public class IMediumCreateBaseStorage {

	@XmlElement(required = true)
	protected String _this;
	protected long logicalSize;
	@XmlSchemaType(name = "unsignedInt")
	protected long variant;

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
	 * Gets the value of the logicalSize property.
	 * 
	 */
	public long getLogicalSize() {
		return logicalSize;
	}

	/**
	 * Sets the value of the logicalSize property.
	 * 
	 */
	public void setLogicalSize(long value) {
		this.logicalSize = value;
	}

	/**
	 * Gets the value of the variant property.
	 * 
	 */
	public long getVariant() {
		return variant;
	}

	/**
	 * Sets the value of the variant property.
	 * 
	 */
	public void setVariant(long value) {
		this.variant = value;
	}

}

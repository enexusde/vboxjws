
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
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="variant" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="parent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "target", "variant", "parent" })
@XmlRootElement(name = "IMedium_cloneTo")
public class IMediumCloneTo {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected String target;
	@XmlSchemaType(name = "unsignedInt")
	protected long variant;
	@XmlElement(required = true)
	protected String parent;

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
	 * Gets the value of the target property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * Sets the value of the target property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTarget(String value) {
		this.target = value;
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

	/**
	 * Gets the value of the parent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParent() {
		return parent;
	}

	/**
	 * Sets the value of the parent property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setParent(String value) {
		this.parent = value;
	}

}

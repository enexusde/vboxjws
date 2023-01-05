
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
 *         &lt;element name="aType" type="{http://www.virtualbox.org/}VirtualSystemDescriptionType"/>
 *         &lt;element name="aVBoxValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aExtraConfigValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "aType", "avBoxValue", "aExtraConfigValue" })
@XmlRootElement(name = "IVirtualSystemDescription_addDescription")
public class IVirtualSystemDescriptionAddDescription {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected VirtualSystemDescriptionType aType;
	@XmlElement(name = "aVBoxValue", required = true)
	protected String avBoxValue;
	@XmlElement(required = true)
	protected String aExtraConfigValue;

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
	 * Gets the value of the aType property.
	 * 
	 * @return possible object is {@link VirtualSystemDescriptionType }
	 * 
	 */
	public VirtualSystemDescriptionType getAType() {
		return aType;
	}

	/**
	 * Sets the value of the aType property.
	 * 
	 * @param value allowed object is {@link VirtualSystemDescriptionType }
	 * 
	 */
	public void setAType(VirtualSystemDescriptionType value) {
		this.aType = value;
	}

	/**
	 * Gets the value of the avBoxValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAVBoxValue() {
		return avBoxValue;
	}

	/**
	 * Sets the value of the avBoxValue property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAVBoxValue(String value) {
		this.avBoxValue = value;
	}

	/**
	 * Gets the value of the aExtraConfigValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAExtraConfigValue() {
		return aExtraConfigValue;
	}

	/**
	 * Sets the value of the aExtraConfigValue property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAExtraConfigValue(String value) {
		this.aExtraConfigValue = value;
	}

}


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
 *         &lt;element name="setImageId" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="imageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="setParentId" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "setImageId", "imageId", "setParentId", "parentId" })
@XmlRootElement(name = "IMedium_setIds")
public class IMediumSetIds {

	@XmlElement(required = true)
	protected String _this;
	protected boolean setImageId;
	@XmlElement(required = true)
	protected String imageId;
	protected boolean setParentId;
	@XmlElement(required = true)
	protected String parentId;

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
	 * Gets the value of the setImageId property.
	 * 
	 */
	public boolean isSetImageId() {
		return setImageId;
	}

	/**
	 * Sets the value of the setImageId property.
	 * 
	 */
	public void setSetImageId(boolean value) {
		this.setImageId = value;
	}

	/**
	 * Gets the value of the imageId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getImageId() {
		return imageId;
	}

	/**
	 * Sets the value of the imageId property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setImageId(String value) {
		this.imageId = value;
	}

	/**
	 * Gets the value of the setParentId property.
	 * 
	 */
	public boolean isSetParentId() {
		return setParentId;
	}

	/**
	 * Sets the value of the setParentId property.
	 * 
	 */
	public void setSetParentId(boolean value) {
		this.setParentId = value;
	}

	/**
	 * Gets the value of the parentId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParentId() {
		return parentId;
	}

	/**
	 * Sets the value of the parentId property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setParentId(String value) {
		this.parentId = value;
	}

}

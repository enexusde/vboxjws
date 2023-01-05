
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
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manifest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "format", "manifest", "path" })
@XmlRootElement(name = "IAppliance_write")
public class IApplianceWrite {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected String format;
	protected boolean manifest;
	@XmlElement(required = true)
	protected String path;

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
	 * Gets the value of the format property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * Sets the value of the format property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFormat(String value) {
		this.format = value;
	}

	/**
	 * Gets the value of the manifest property.
	 * 
	 */
	public boolean isManifest() {
		return manifest;
	}

	/**
	 * Sets the value of the manifest property.
	 * 
	 */
	public void setManifest(boolean value) {
		this.manifest = value;
	}

	/**
	 * Gets the value of the path property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPath() {
		return path;
	}

	/**
	 * Sets the value of the path property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPath(String value) {
		this.path = value;
	}

}


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
 *         &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "file", "acl" })
@XmlRootElement(name = "IGuestSession_fileSetACL")
public class IGuestSessionFileSetACL {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected String file;
	@XmlElement(required = true)
	protected String acl;

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
	 * Gets the value of the file property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFile() {
		return file;
	}

	/**
	 * Sets the value of the file property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFile(String value) {
		this.file = value;
	}

	/**
	 * Gets the value of the acl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAcl() {
		return acl;
	}

	/**
	 * Sets the value of the acl property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAcl(String value) {
		this.acl = value;
	}

}

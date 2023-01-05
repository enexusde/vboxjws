
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
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="openMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="disposition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creationMode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "path", "openMode", "disposition", "creationMode", "offset" })
@XmlRootElement(name = "IGuestSession_fileOpen")
public class IGuestSessionFileOpen {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected String path;
	@XmlElement(required = true)
	protected String openMode;
	@XmlElement(required = true)
	protected String disposition;
	@XmlSchemaType(name = "unsignedInt")
	protected long creationMode;
	protected long offset;

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

	/**
	 * Gets the value of the openMode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOpenMode() {
		return openMode;
	}

	/**
	 * Sets the value of the openMode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOpenMode(String value) {
		this.openMode = value;
	}

	/**
	 * Gets the value of the disposition property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDisposition() {
		return disposition;
	}

	/**
	 * Sets the value of the disposition property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDisposition(String value) {
		this.disposition = value;
	}

	/**
	 * Gets the value of the creationMode property.
	 * 
	 */
	public long getCreationMode() {
		return creationMode;
	}

	/**
	 * Sets the value of the creationMode property.
	 * 
	 */
	public void setCreationMode(long value) {
		this.creationMode = value;
	}

	/**
	 * Gets the value of the offset property.
	 * 
	 */
	public long getOffset() {
		return offset;
	}

	/**
	 * Sets the value of the offset property.
	 * 
	 */
	public void setOffset(long value) {
		this.offset = value;
	}

}

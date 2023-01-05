
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
@XmlType(name = "", propOrder = { "size", "width", "height" })
@XmlRootElement(name = "IMachine_querySavedThumbnailSizeResponse")
public class IMachineQuerySavedThumbnailSizeResponse {

	@XmlSchemaType(name = "unsignedInt")
	protected long size;
	@XmlSchemaType(name = "unsignedInt")
	protected long width;
	@XmlSchemaType(name = "unsignedInt")
	protected long height;

	/**
	 * Gets the value of the size property.
	 * 
	 */
	public long getSize() {
		return size;
	}

	/**
	 * Sets the value of the size property.
	 * 
	 */
	public void setSize(long value) {
		this.size = value;
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

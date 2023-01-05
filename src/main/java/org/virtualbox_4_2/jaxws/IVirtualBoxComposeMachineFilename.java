
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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createFlags" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseFolder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "name", "group", "createFlags", "baseFolder" })
@XmlRootElement(name = "IVirtualBox_composeMachineFilename")
public class IVirtualBoxComposeMachineFilename {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected String name;
	@XmlElement(required = true)
	protected String group;
	@XmlElement(required = true)
	protected String createFlags;
	@XmlElement(required = true)
	protected String baseFolder;

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
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the group property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * Sets the value of the group property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setGroup(String value) {
		this.group = value;
	}

	/**
	 * Gets the value of the createFlags property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreateFlags() {
		return createFlags;
	}

	/**
	 * Sets the value of the createFlags property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCreateFlags(String value) {
		this.createFlags = value;
	}

	/**
	 * Gets the value of the baseFolder property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBaseFolder() {
		return baseFolder;
	}

	/**
	 * Sets the value of the baseFolder property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBaseFolder(String value) {
		this.baseFolder = value;
	}

}


package org.virtualbox_4_2.jaxws;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="settingsFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groups" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="osTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "settingsFile", "name", "groups", "osTypeId", "flags" })
@XmlRootElement(name = "IVirtualBox_createMachine")
public class IVirtualBoxCreateMachine {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected String settingsFile;
	@XmlElement(required = true)
	protected String name;
	protected List<String> groups;
	@XmlElement(required = true)
	protected String osTypeId;
	@XmlElement(required = true)
	protected String flags;

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
	 * Gets the value of the settingsFile property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSettingsFile() {
		return settingsFile;
	}

	/**
	 * Sets the value of the settingsFile property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSettingsFile(String value) {
		this.settingsFile = value;
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
	 * Gets the value of the groups property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the groups property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getGroups().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getGroups() {
		if (groups == null) {
			groups = new ArrayList<String>();
		}
		return this.groups;
	}

	/**
	 * Gets the value of the osTypeId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOsTypeId() {
		return osTypeId;
	}

	/**
	 * Sets the value of the osTypeId property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOsTypeId(String value) {
		this.osTypeId = value;
	}

	/**
	 * Gets the value of the flags property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFlags() {
		return flags;
	}

	/**
	 * Sets the value of the flags property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFlags(String value) {
		this.flags = value;
	}

}

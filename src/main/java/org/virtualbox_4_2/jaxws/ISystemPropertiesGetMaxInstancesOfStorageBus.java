
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
 *         &lt;element name="chipset" type="{http://www.virtualbox.org/}ChipsetType"/>
 *         &lt;element name="bus" type="{http://www.virtualbox.org/}StorageBus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "chipset", "bus" })
@XmlRootElement(name = "ISystemProperties_getMaxInstancesOfStorageBus")
public class ISystemPropertiesGetMaxInstancesOfStorageBus {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected ChipsetType chipset;
	@XmlElement(required = true)
	protected StorageBus bus;

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
	 * Gets the value of the chipset property.
	 * 
	 * @return possible object is {@link ChipsetType }
	 * 
	 */
	public ChipsetType getChipset() {
		return chipset;
	}

	/**
	 * Sets the value of the chipset property.
	 * 
	 * @param value allowed object is {@link ChipsetType }
	 * 
	 */
	public void setChipset(ChipsetType value) {
		this.chipset = value;
	}

	/**
	 * Gets the value of the bus property.
	 * 
	 * @return possible object is {@link StorageBus }
	 * 
	 */
	public StorageBus getBus() {
		return bus;
	}

	/**
	 * Sets the value of the bus property.
	 * 
	 * @param value allowed object is {@link StorageBus }
	 * 
	 */
	public void setBus(StorageBus value) {
		this.bus = value;
	}

}

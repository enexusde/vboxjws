
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
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deviceType" type="{http://www.virtualbox.org/}DeviceType"/>
 *         &lt;element name="accessMode" type="{http://www.virtualbox.org/}AccessMode"/>
 *         &lt;element name="forceNewUuid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "location", "deviceType", "accessMode", "forceNewUuid" })
@XmlRootElement(name = "IVirtualBox_openMedium")
public class IVirtualBoxOpenMedium {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected String location;
	@XmlElement(required = true)
	protected DeviceType deviceType;
	@XmlElement(required = true)
	protected AccessMode accessMode;
	protected boolean forceNewUuid;

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
	 * Gets the value of the location property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the value of the location property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLocation(String value) {
		this.location = value;
	}

	/**
	 * Gets the value of the deviceType property.
	 * 
	 * @return possible object is {@link DeviceType }
	 * 
	 */
	public DeviceType getDeviceType() {
		return deviceType;
	}

	/**
	 * Sets the value of the deviceType property.
	 * 
	 * @param value allowed object is {@link DeviceType }
	 * 
	 */
	public void setDeviceType(DeviceType value) {
		this.deviceType = value;
	}

	/**
	 * Gets the value of the accessMode property.
	 * 
	 * @return possible object is {@link AccessMode }
	 * 
	 */
	public AccessMode getAccessMode() {
		return accessMode;
	}

	/**
	 * Sets the value of the accessMode property.
	 * 
	 * @param value allowed object is {@link AccessMode }
	 * 
	 */
	public void setAccessMode(AccessMode value) {
		this.accessMode = value;
	}

	/**
	 * Gets the value of the forceNewUuid property.
	 * 
	 */
	public boolean isForceNewUuid() {
		return forceNewUuid;
	}

	/**
	 * Sets the value of the forceNewUuid property.
	 * 
	 */
	public void setForceNewUuid(boolean value) {
		this.forceNewUuid = value;
	}

}

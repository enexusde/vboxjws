
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for IPCIDeviceAttachment complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="IPCIDeviceAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isPhysicalDevice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hostAddress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="guestAddress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPCIDeviceAttachment", propOrder = { "name", "isPhysicalDevice", "hostAddress", "guestAddress" })
public class IPCIDeviceAttachment {

	@XmlElement(required = true)
	protected String name;
	protected boolean isPhysicalDevice;
	protected int hostAddress;
	protected int guestAddress;

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
	 * Gets the value of the isPhysicalDevice property.
	 * 
	 */
	public boolean isIsPhysicalDevice() {
		return isPhysicalDevice;
	}

	/**
	 * Sets the value of the isPhysicalDevice property.
	 * 
	 */
	public void setIsPhysicalDevice(boolean value) {
		this.isPhysicalDevice = value;
	}

	/**
	 * Gets the value of the hostAddress property.
	 * 
	 */
	public int getHostAddress() {
		return hostAddress;
	}

	/**
	 * Sets the value of the hostAddress property.
	 * 
	 */
	public void setHostAddress(int value) {
		this.hostAddress = value;
	}

	/**
	 * Gets the value of the guestAddress property.
	 * 
	 */
	public int getGuestAddress() {
		return guestAddress;
	}

	/**
	 * Sets the value of the guestAddress property.
	 * 
	 */
	public void setGuestAddress(int value) {
		this.guestAddress = value;
	}

}

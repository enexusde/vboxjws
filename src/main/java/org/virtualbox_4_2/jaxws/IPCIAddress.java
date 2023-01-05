
package org.virtualbox_4_2.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for IPCIAddress complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="IPCIAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bus" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="device" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="devFunction" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPCIAddress", propOrder = { "bus", "device", "devFunction" })
public class IPCIAddress {

	protected short bus;
	protected short device;
	protected short devFunction;

	/**
	 * Gets the value of the bus property.
	 * 
	 */
	public short getBus() {
		return bus;
	}

	/**
	 * Sets the value of the bus property.
	 * 
	 */
	public void setBus(short value) {
		this.bus = value;
	}

	/**
	 * Gets the value of the device property.
	 * 
	 */
	public short getDevice() {
		return device;
	}

	/**
	 * Sets the value of the device property.
	 * 
	 */
	public void setDevice(short value) {
		this.device = value;
	}

	/**
	 * Gets the value of the devFunction property.
	 * 
	 */
	public short getDevFunction() {
		return devFunction;
	}

	/**
	 * Sets the value of the devFunction property.
	 * 
	 */
	public void setDevFunction(short value) {
		this.devFunction = value;
	}

}

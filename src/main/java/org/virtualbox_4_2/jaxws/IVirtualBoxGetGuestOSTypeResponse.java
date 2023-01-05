
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
 *         &lt;element name="returnval" type="{http://www.virtualbox.org/}IGuestOSType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "returnval" })
@XmlRootElement(name = "IVirtualBox_getGuestOSTypeResponse")
public class IVirtualBoxGetGuestOSTypeResponse {

	@XmlElement(required = true)
	protected IGuestOSType returnval;

	/**
	 * Gets the value of the returnval property.
	 * 
	 * @return possible object is {@link IGuestOSType }
	 * 
	 */
	public IGuestOSType getReturnval() {
		return returnval;
	}

	/**
	 * Sets the value of the returnval property.
	 * 
	 * @param value allowed object is {@link IGuestOSType }
	 * 
	 */
	public void setReturnval(IGuestOSType value) {
		this.returnval = value;
	}

}

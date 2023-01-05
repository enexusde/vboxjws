
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
 *         &lt;element name="valEax" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="valEbx" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="valEcx" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="valEdx" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "valEax", "valEbx", "valEcx", "valEdx" })
@XmlRootElement(name = "IHost_getProcessorCPUIDLeafResponse")
public class IHostGetProcessorCPUIDLeafResponse {

	@XmlSchemaType(name = "unsignedInt")
	protected long valEax;
	@XmlSchemaType(name = "unsignedInt")
	protected long valEbx;
	@XmlSchemaType(name = "unsignedInt")
	protected long valEcx;
	@XmlSchemaType(name = "unsignedInt")
	protected long valEdx;

	/**
	 * Gets the value of the valEax property.
	 * 
	 */
	public long getValEax() {
		return valEax;
	}

	/**
	 * Sets the value of the valEax property.
	 * 
	 */
	public void setValEax(long value) {
		this.valEax = value;
	}

	/**
	 * Gets the value of the valEbx property.
	 * 
	 */
	public long getValEbx() {
		return valEbx;
	}

	/**
	 * Sets the value of the valEbx property.
	 * 
	 */
	public void setValEbx(long value) {
		this.valEbx = value;
	}

	/**
	 * Gets the value of the valEcx property.
	 * 
	 */
	public long getValEcx() {
		return valEcx;
	}

	/**
	 * Sets the value of the valEcx property.
	 * 
	 */
	public void setValEcx(long value) {
		this.valEcx = value;
	}

	/**
	 * Gets the value of the valEdx property.
	 * 
	 */
	public long getValEdx() {
		return valEdx;
	}

	/**
	 * Sets the value of the valEdx property.
	 * 
	 */
	public void setValEdx(long value) {
		this.valEdx = value;
	}

}

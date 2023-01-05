
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
 *         &lt;element name="cpuId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="leaf" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="subLeaf" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "cpuId", "leaf", "subLeaf" })
@XmlRootElement(name = "IHost_getProcessorCPUIDLeaf")
public class IHostGetProcessorCPUIDLeaf {

	@XmlElement(required = true)
	protected String _this;
	@XmlSchemaType(name = "unsignedInt")
	protected long cpuId;
	@XmlSchemaType(name = "unsignedInt")
	protected long leaf;
	@XmlSchemaType(name = "unsignedInt")
	protected long subLeaf;

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
	 * Gets the value of the cpuId property.
	 * 
	 */
	public long getCpuId() {
		return cpuId;
	}

	/**
	 * Sets the value of the cpuId property.
	 * 
	 */
	public void setCpuId(long value) {
		this.cpuId = value;
	}

	/**
	 * Gets the value of the leaf property.
	 * 
	 */
	public long getLeaf() {
		return leaf;
	}

	/**
	 * Sets the value of the leaf property.
	 * 
	 */
	public void setLeaf(long value) {
		this.leaf = value;
	}

	/**
	 * Gets the value of the subLeaf property.
	 * 
	 */
	public long getSubLeaf() {
		return subLeaf;
	}

	/**
	 * Sets the value of the subLeaf property.
	 * 
	 */
	public void setSubLeaf(long value) {
		this.subLeaf = value;
	}

}


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
 *         &lt;element name="networkName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trunkName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trunkType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "networkName", "trunkName", "trunkType" })
@XmlRootElement(name = "IDHCPServer_start")
public class IDHCPServerStart {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected String networkName;
	@XmlElement(required = true)
	protected String trunkName;
	@XmlElement(required = true)
	protected String trunkType;

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
	 * Gets the value of the networkName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNetworkName() {
		return networkName;
	}

	/**
	 * Sets the value of the networkName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setNetworkName(String value) {
		this.networkName = value;
	}

	/**
	 * Gets the value of the trunkName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTrunkName() {
		return trunkName;
	}

	/**
	 * Sets the value of the trunkName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTrunkName(String value) {
		this.trunkName = value;
	}

	/**
	 * Gets the value of the trunkType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTrunkType() {
		return trunkType;
	}

	/**
	 * Sets the value of the trunkType property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTrunkType(String value) {
		this.trunkType = value;
	}

}

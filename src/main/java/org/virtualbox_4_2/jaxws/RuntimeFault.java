
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
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="interfaceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="component" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "resultCode", "interfaceID", "component", "text" })
@XmlRootElement(name = "RuntimeFault")
public class RuntimeFault {

	protected int resultCode;
	@XmlElement(required = true)
	protected String interfaceID;
	@XmlElement(required = true)
	protected String component;
	@XmlElement(required = true)
	protected String text;

	/**
	 * Gets the value of the resultCode property.
	 * 
	 */
	public int getResultCode() {
		return resultCode;
	}

	/**
	 * Sets the value of the resultCode property.
	 * 
	 */
	public void setResultCode(int value) {
		this.resultCode = value;
	}

	/**
	 * Gets the value of the interfaceID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInterfaceID() {
		return interfaceID;
	}

	/**
	 * Sets the value of the interfaceID property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInterfaceID(String value) {
		this.interfaceID = value;
	}

	/**
	 * Gets the value of the component property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getComponent() {
		return component;
	}

	/**
	 * Sets the value of the component property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setComponent(String value) {
		this.component = value;
	}

	/**
	 * Gets the value of the text property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the value of the text property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setText(String value) {
		this.text = value;
	}

}

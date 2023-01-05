
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
 *         &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="environment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "session", "type", "environment" })
@XmlRootElement(name = "IMachine_launchVMProcess")
public class IMachineLaunchVMProcess {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected String session;
	@XmlElement(required = true)
	protected String type;
	@XmlElement(required = true)
	protected String environment;

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
	 * Gets the value of the session property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSession() {
		return session;
	}

	/**
	 * Sets the value of the session property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSession(String value) {
		this.session = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * Gets the value of the environment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * Sets the value of the environment property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEnvironment(String value) {
		this.environment = value;
	}

}

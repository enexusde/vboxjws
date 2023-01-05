
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
 *         &lt;element name="lockType" type="{http://www.virtualbox.org/}LockType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "session", "lockType" })
@XmlRootElement(name = "IMachine_lockMachine")
public class IMachineLockMachine {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected String session;
	@XmlElement(required = true)
	protected LockType lockType;

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
	 * Gets the value of the lockType property.
	 * 
	 * @return possible object is {@link LockType }
	 * 
	 */
	public LockType getLockType() {
		return lockType;
	}

	/**
	 * Sets the value of the lockType property.
	 * 
	 * @param value allowed object is {@link LockType }
	 * 
	 */
	public void setLockType(LockType value) {
		this.lockType = value;
	}

}


package org.virtualbox_4_2.jaxws;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="handle" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="flags" type="{http://www.virtualbox.org/}ProcessInputFlag" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeoutMS" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "handle", "flags", "data", "timeoutMS" })
@XmlRootElement(name = "IProcess_writeArray")
public class IProcessWriteArray {

	@XmlElement(required = true)
	protected String _this;
	@XmlSchemaType(name = "unsignedInt")
	protected long handle;
	protected List<ProcessInputFlag> flags;
	@XmlElement(required = true)
	protected String data;
	@XmlSchemaType(name = "unsignedInt")
	protected long timeoutMS;

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
	 * Gets the value of the handle property.
	 * 
	 */
	public long getHandle() {
		return handle;
	}

	/**
	 * Sets the value of the handle property.
	 * 
	 */
	public void setHandle(long value) {
		this.handle = value;
	}

	/**
	 * Gets the value of the flags property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the flags property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFlags().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ProcessInputFlag }
	 * 
	 * 
	 */
	public List<ProcessInputFlag> getFlags() {
		if (flags == null) {
			flags = new ArrayList<ProcessInputFlag>();
		}
		return this.flags;
	}

	/**
	 * Gets the value of the data property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getData() {
		return data;
	}

	/**
	 * Sets the value of the data property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setData(String value) {
		this.data = value;
	}

	/**
	 * Gets the value of the timeoutMS property.
	 * 
	 */
	public long getTimeoutMS() {
		return timeoutMS;
	}

	/**
	 * Sets the value of the timeoutMS property.
	 * 
	 */
	public void setTimeoutMS(long value) {
		this.timeoutMS = value;
	}

}

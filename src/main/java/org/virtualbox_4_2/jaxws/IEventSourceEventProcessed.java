
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
 *         &lt;element name="listener" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="event" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_this", "listener", "event" })
@XmlRootElement(name = "IEventSource_eventProcessed")
public class IEventSourceEventProcessed {

	@XmlElement(required = true)
	protected String _this;
	@XmlElement(required = true)
	protected String listener;
	@XmlElement(required = true)
	protected String event;

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
	 * Gets the value of the listener property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getListener() {
		return listener;
	}

	/**
	 * Sets the value of the listener property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setListener(String value) {
		this.listener = value;
	}

	/**
	 * Gets the value of the event property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * Sets the value of the event property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEvent(String value) {
		this.event = value;
	}

}

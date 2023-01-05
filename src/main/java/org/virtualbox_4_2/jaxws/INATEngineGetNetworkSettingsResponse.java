
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
 *         &lt;element name="mtu" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="sockSnd" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="sockRcv" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="TcpWndSnd" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="TcpWndRcv" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "mtu", "sockSnd", "sockRcv", "tcpWndSnd", "tcpWndRcv" })
@XmlRootElement(name = "INATEngine_getNetworkSettingsResponse")
public class INATEngineGetNetworkSettingsResponse {

	@XmlSchemaType(name = "unsignedInt")
	protected long mtu;
	@XmlSchemaType(name = "unsignedInt")
	protected long sockSnd;
	@XmlSchemaType(name = "unsignedInt")
	protected long sockRcv;
	@XmlElement(name = "TcpWndSnd")
	@XmlSchemaType(name = "unsignedInt")
	protected long tcpWndSnd;
	@XmlElement(name = "TcpWndRcv")
	@XmlSchemaType(name = "unsignedInt")
	protected long tcpWndRcv;

	/**
	 * Gets the value of the mtu property.
	 * 
	 */
	public long getMtu() {
		return mtu;
	}

	/**
	 * Sets the value of the mtu property.
	 * 
	 */
	public void setMtu(long value) {
		this.mtu = value;
	}

	/**
	 * Gets the value of the sockSnd property.
	 * 
	 */
	public long getSockSnd() {
		return sockSnd;
	}

	/**
	 * Sets the value of the sockSnd property.
	 * 
	 */
	public void setSockSnd(long value) {
		this.sockSnd = value;
	}

	/**
	 * Gets the value of the sockRcv property.
	 * 
	 */
	public long getSockRcv() {
		return sockRcv;
	}

	/**
	 * Sets the value of the sockRcv property.
	 * 
	 */
	public void setSockRcv(long value) {
		this.sockRcv = value;
	}

	/**
	 * Gets the value of the tcpWndSnd property.
	 * 
	 */
	public long getTcpWndSnd() {
		return tcpWndSnd;
	}

	/**
	 * Sets the value of the tcpWndSnd property.
	 * 
	 */
	public void setTcpWndSnd(long value) {
		this.tcpWndSnd = value;
	}

	/**
	 * Gets the value of the tcpWndRcv property.
	 * 
	 */
	public long getTcpWndRcv() {
		return tcpWndRcv;
	}

	/**
	 * Sets the value of the tcpWndRcv property.
	 * 
	 */
	public void setTcpWndRcv(long value) {
		this.tcpWndRcv = value;
	}

}

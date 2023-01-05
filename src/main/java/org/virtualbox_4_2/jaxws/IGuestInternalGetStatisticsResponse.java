
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
 *         &lt;element name="cpuUser" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="cpuKernel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="cpuIdle" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="memTotal" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="memFree" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="memBalloon" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="memShared" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="memCache" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="pagedTotal" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="memAllocTotal" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="memFreeTotal" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="memBalloonTotal" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="memSharedTotal" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cpuUser", "cpuKernel", "cpuIdle", "memTotal", "memFree", "memBalloon", "memShared",
		"memCache", "pagedTotal", "memAllocTotal", "memFreeTotal", "memBalloonTotal", "memSharedTotal" })
@XmlRootElement(name = "IGuest_internalGetStatisticsResponse")
public class IGuestInternalGetStatisticsResponse {

	@XmlSchemaType(name = "unsignedInt")
	protected long cpuUser;
	@XmlSchemaType(name = "unsignedInt")
	protected long cpuKernel;
	@XmlSchemaType(name = "unsignedInt")
	protected long cpuIdle;
	@XmlSchemaType(name = "unsignedInt")
	protected long memTotal;
	@XmlSchemaType(name = "unsignedInt")
	protected long memFree;
	@XmlSchemaType(name = "unsignedInt")
	protected long memBalloon;
	@XmlSchemaType(name = "unsignedInt")
	protected long memShared;
	@XmlSchemaType(name = "unsignedInt")
	protected long memCache;
	@XmlSchemaType(name = "unsignedInt")
	protected long pagedTotal;
	@XmlSchemaType(name = "unsignedInt")
	protected long memAllocTotal;
	@XmlSchemaType(name = "unsignedInt")
	protected long memFreeTotal;
	@XmlSchemaType(name = "unsignedInt")
	protected long memBalloonTotal;
	@XmlSchemaType(name = "unsignedInt")
	protected long memSharedTotal;

	/**
	 * Gets the value of the cpuUser property.
	 * 
	 */
	public long getCpuUser() {
		return cpuUser;
	}

	/**
	 * Sets the value of the cpuUser property.
	 * 
	 */
	public void setCpuUser(long value) {
		this.cpuUser = value;
	}

	/**
	 * Gets the value of the cpuKernel property.
	 * 
	 */
	public long getCpuKernel() {
		return cpuKernel;
	}

	/**
	 * Sets the value of the cpuKernel property.
	 * 
	 */
	public void setCpuKernel(long value) {
		this.cpuKernel = value;
	}

	/**
	 * Gets the value of the cpuIdle property.
	 * 
	 */
	public long getCpuIdle() {
		return cpuIdle;
	}

	/**
	 * Sets the value of the cpuIdle property.
	 * 
	 */
	public void setCpuIdle(long value) {
		this.cpuIdle = value;
	}

	/**
	 * Gets the value of the memTotal property.
	 * 
	 */
	public long getMemTotal() {
		return memTotal;
	}

	/**
	 * Sets the value of the memTotal property.
	 * 
	 */
	public void setMemTotal(long value) {
		this.memTotal = value;
	}

	/**
	 * Gets the value of the memFree property.
	 * 
	 */
	public long getMemFree() {
		return memFree;
	}

	/**
	 * Sets the value of the memFree property.
	 * 
	 */
	public void setMemFree(long value) {
		this.memFree = value;
	}

	/**
	 * Gets the value of the memBalloon property.
	 * 
	 */
	public long getMemBalloon() {
		return memBalloon;
	}

	/**
	 * Sets the value of the memBalloon property.
	 * 
	 */
	public void setMemBalloon(long value) {
		this.memBalloon = value;
	}

	/**
	 * Gets the value of the memShared property.
	 * 
	 */
	public long getMemShared() {
		return memShared;
	}

	/**
	 * Sets the value of the memShared property.
	 * 
	 */
	public void setMemShared(long value) {
		this.memShared = value;
	}

	/**
	 * Gets the value of the memCache property.
	 * 
	 */
	public long getMemCache() {
		return memCache;
	}

	/**
	 * Sets the value of the memCache property.
	 * 
	 */
	public void setMemCache(long value) {
		this.memCache = value;
	}

	/**
	 * Gets the value of the pagedTotal property.
	 * 
	 */
	public long getPagedTotal() {
		return pagedTotal;
	}

	/**
	 * Sets the value of the pagedTotal property.
	 * 
	 */
	public void setPagedTotal(long value) {
		this.pagedTotal = value;
	}

	/**
	 * Gets the value of the memAllocTotal property.
	 * 
	 */
	public long getMemAllocTotal() {
		return memAllocTotal;
	}

	/**
	 * Sets the value of the memAllocTotal property.
	 * 
	 */
	public void setMemAllocTotal(long value) {
		this.memAllocTotal = value;
	}

	/**
	 * Gets the value of the memFreeTotal property.
	 * 
	 */
	public long getMemFreeTotal() {
		return memFreeTotal;
	}

	/**
	 * Sets the value of the memFreeTotal property.
	 * 
	 */
	public void setMemFreeTotal(long value) {
		this.memFreeTotal = value;
	}

	/**
	 * Gets the value of the memBalloonTotal property.
	 * 
	 */
	public long getMemBalloonTotal() {
		return memBalloonTotal;
	}

	/**
	 * Sets the value of the memBalloonTotal property.
	 * 
	 */
	public void setMemBalloonTotal(long value) {
		this.memBalloonTotal = value;
	}

	/**
	 * Gets the value of the memSharedTotal property.
	 * 
	 */
	public long getMemSharedTotal() {
		return memSharedTotal;
	}

	/**
	 * Sets the value of the memSharedTotal property.
	 * 
	 */
	public void setMemSharedTotal(long value) {
		this.memSharedTotal = value;
	}

}

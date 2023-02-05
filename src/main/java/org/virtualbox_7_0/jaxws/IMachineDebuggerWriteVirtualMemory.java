
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpuId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="bytes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_this",
    "cpuId",
    "address",
    "size",
    "bytes"
})
@XmlRootElement(name = "IMachineDebugger_writeVirtualMemory")
public class IMachineDebuggerWriteVirtualMemory {

    @XmlElement(required = true)
    protected String _this;
    @XmlSchemaType(name = "unsignedInt")
    protected long cpuId;
    protected long address;
    @XmlSchemaType(name = "unsignedInt")
    protected long size;
    @XmlElement(required = true)
    protected String bytes;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
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
     * Gets the value of the address property.
     * 
     */
    public long getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     */
    public void setAddress(long value) {
        this.address = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Gets the value of the bytes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBytes() {
        return bytes;
    }

    /**
     * Sets the value of the bytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBytes(String value) {
        this.bytes = value;
    }

}

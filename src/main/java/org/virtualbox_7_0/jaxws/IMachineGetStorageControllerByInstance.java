
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
 *         &lt;element name="connectionType" type="{http://www.virtualbox.org/}StorageBus"/>
 *         &lt;element name="instance" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "connectionType",
    "instance"
})
@XmlRootElement(name = "IMachine_getStorageControllerByInstance")
public class IMachineGetStorageControllerByInstance {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected StorageBus connectionType;
    @XmlSchemaType(name = "unsignedInt")
    protected long instance;

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
     * Gets the value of the connectionType property.
     * 
     * @return
     *     possible object is
     *     {@link StorageBus }
     *     
     */
    public StorageBus getConnectionType() {
        return connectionType;
    }

    /**
     * Sets the value of the connectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageBus }
     *     
     */
    public void setConnectionType(StorageBus value) {
        this.connectionType = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     */
    public long getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     */
    public void setInstance(long value) {
        this.instance = value;
    }

}


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
 *         &lt;element name="scope" type="{http://www.virtualbox.org/}DHCPConfigScope"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="slot" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="mayAdd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "scope",
    "name",
    "slot",
    "mayAdd"
})
@XmlRootElement(name = "IDHCPServer_getConfig")
public class IDHCPServerGetConfig {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected DHCPConfigScope scope;
    @XmlElement(required = true)
    protected String name;
    @XmlSchemaType(name = "unsignedInt")
    protected long slot;
    protected boolean mayAdd;

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
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link DHCPConfigScope }
     *     
     */
    public DHCPConfigScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link DHCPConfigScope }
     *     
     */
    public void setScope(DHCPConfigScope value) {
        this.scope = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the slot property.
     * 
     */
    public long getSlot() {
        return slot;
    }

    /**
     * Sets the value of the slot property.
     * 
     */
    public void setSlot(long value) {
        this.slot = value;
    }

    /**
     * Gets the value of the mayAdd property.
     * 
     */
    public boolean isMayAdd() {
        return mayAdd;
    }

    /**
     * Sets the value of the mayAdd property.
     * 
     */
    public void setMayAdd(boolean value) {
        this.mayAdd = value;
    }

}

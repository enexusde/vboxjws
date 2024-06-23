
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="idx" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="idxSub" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "idx",
    "idxSub"
})
@XmlRootElement(name = "IMachine_getCPUIDLeaf")
public class IMachineGetCPUIDLeaf {

    @XmlElement(required = true)
    protected String _this;
    @XmlSchemaType(name = "unsignedInt")
    protected long idx;
    @XmlSchemaType(name = "unsignedInt")
    protected long idxSub;

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
     * Gets the value of the idx property.
     * 
     */
    public long getIdx() {
        return idx;
    }

    /**
     * Sets the value of the idx property.
     * 
     */
    public void setIdx(long value) {
        this.idx = value;
    }

    /**
     * Gets the value of the idxSub property.
     * 
     */
    public long getIdxSub() {
        return idxSub;
    }

    /**
     * Sets the value of the idxSub property.
     * 
     */
    public void setIdxSub(long value) {
        this.idxSub = value;
    }

}

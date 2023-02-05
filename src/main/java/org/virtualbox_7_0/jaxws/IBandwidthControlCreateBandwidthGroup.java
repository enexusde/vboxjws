
package org.virtualbox_7_0.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.virtualbox.org/}BandwidthGroupType"/>
 *         &lt;element name="maxBytesPerSec" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "name",
    "type",
    "maxBytesPerSec"
})
@XmlRootElement(name = "IBandwidthControl_createBandwidthGroup")
public class IBandwidthControlCreateBandwidthGroup {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected BandwidthGroupType type;
    protected long maxBytesPerSec;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BandwidthGroupType }
     *     
     */
    public BandwidthGroupType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandwidthGroupType }
     *     
     */
    public void setType(BandwidthGroupType value) {
        this.type = value;
    }

    /**
     * Gets the value of the maxBytesPerSec property.
     * 
     */
    public long getMaxBytesPerSec() {
        return maxBytesPerSec;
    }

    /**
     * Sets the value of the maxBytesPerSec property.
     * 
     */
    public void setMaxBytesPerSec(long value) {
        this.maxBytesPerSec = value;
    }

}

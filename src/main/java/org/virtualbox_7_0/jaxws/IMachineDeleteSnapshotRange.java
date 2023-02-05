
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
 *         &lt;element name="startId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "startId",
    "endId"
})
@XmlRootElement(name = "IMachine_deleteSnapshotRange")
public class IMachineDeleteSnapshotRange {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected String startId;
    @XmlElement(required = true)
    protected String endId;

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
     * Gets the value of the startId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartId() {
        return startId;
    }

    /**
     * Sets the value of the startId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartId(String value) {
        this.startId = value;
    }

    /**
     * Gets the value of the endId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndId() {
        return endId;
    }

    /**
     * Sets the value of the endId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndId(String value) {
        this.endId = value;
    }

}


package org.virtualbox_7_0.jaxws;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="formats" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allowedActions" type="{http://www.virtualbox.org/}DnDAction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnval" type="{http://www.virtualbox.org/}DnDAction"/>
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
    "formats",
    "allowedActions",
    "returnval"
})
@XmlRootElement(name = "IDnDSource_dragIsPendingResponse")
public class IDnDSourceDragIsPendingResponse {

    protected List<String> formats;
    protected List<DnDAction> allowedActions;
    @XmlElement(required = true)
    protected DnDAction returnval;

    /**
     * Gets the value of the formats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFormats() {
        if (formats == null) {
            formats = new ArrayList<String>();
        }
        return this.formats;
    }

    /**
     * Gets the value of the allowedActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DnDAction }
     * 
     * 
     */
    public List<DnDAction> getAllowedActions() {
        if (allowedActions == null) {
            allowedActions = new ArrayList<DnDAction>();
        }
        return this.allowedActions;
    }

    /**
     * Gets the value of the returnval property.
     * 
     * @return
     *     possible object is
     *     {@link DnDAction }
     *     
     */
    public DnDAction getReturnval() {
        return returnval;
    }

    /**
     * Sets the value of the returnval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DnDAction }
     *     
     */
    public void setReturnval(DnDAction value) {
        this.returnval = value;
    }

}

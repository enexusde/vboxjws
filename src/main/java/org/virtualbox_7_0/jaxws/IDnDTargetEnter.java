
package org.virtualbox_7_0.jaxws;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="screenId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="defaultAction" type="{http://www.virtualbox.org/}DnDAction"/>
 *         &lt;element name="allowedActions" type="{http://www.virtualbox.org/}DnDAction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="formats" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "screenId",
    "y",
    "x",
    "defaultAction",
    "allowedActions",
    "formats"
})
@XmlRootElement(name = "IDnDTarget_enter")
public class IDnDTargetEnter {

    @XmlElement(required = true)
    protected String _this;
    @XmlSchemaType(name = "unsignedInt")
    protected long screenId;
    @XmlSchemaType(name = "unsignedInt")
    protected long y;
    @XmlSchemaType(name = "unsignedInt")
    protected long x;
    @XmlElement(required = true)
    protected DnDAction defaultAction;
    protected List<DnDAction> allowedActions;
    protected List<String> formats;

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
     * Gets the value of the screenId property.
     * 
     */
    public long getScreenId() {
        return screenId;
    }

    /**
     * Sets the value of the screenId property.
     * 
     */
    public void setScreenId(long value) {
        this.screenId = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public long getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(long value) {
        this.y = value;
    }

    /**
     * Gets the value of the x property.
     * 
     */
    public long getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(long value) {
        this.x = value;
    }

    /**
     * Gets the value of the defaultAction property.
     * 
     * @return
     *     possible object is
     *     {@link DnDAction }
     *     
     */
    public DnDAction getDefaultAction() {
        return defaultAction;
    }

    /**
     * Sets the value of the defaultAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DnDAction }
     *     
     */
    public void setDefaultAction(DnDAction value) {
        this.defaultAction = value;
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

}

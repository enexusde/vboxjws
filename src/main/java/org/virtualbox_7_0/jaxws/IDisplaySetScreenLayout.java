
package org.virtualbox_7_0.jaxws;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="screenLayoutMode" type="{http://www.virtualbox.org/}ScreenLayoutMode"/>
 *         &lt;element name="guestScreenInfo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "screenLayoutMode",
    "guestScreenInfo"
})
@XmlRootElement(name = "IDisplay_setScreenLayout")
public class IDisplaySetScreenLayout {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected ScreenLayoutMode screenLayoutMode;
    protected List<String> guestScreenInfo;

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
     * Gets the value of the screenLayoutMode property.
     * 
     * @return
     *     possible object is
     *     {@link ScreenLayoutMode }
     *     
     */
    public ScreenLayoutMode getScreenLayoutMode() {
        return screenLayoutMode;
    }

    /**
     * Sets the value of the screenLayoutMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreenLayoutMode }
     *     
     */
    public void setScreenLayoutMode(ScreenLayoutMode value) {
        this.screenLayoutMode = value;
    }

    /**
     * Gets the value of the guestScreenInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestScreenInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestScreenInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGuestScreenInfo() {
        if (guestScreenInfo == null) {
            guestScreenInfo = new ArrayList<String>();
        }
        return this.guestScreenInfo;
    }

}

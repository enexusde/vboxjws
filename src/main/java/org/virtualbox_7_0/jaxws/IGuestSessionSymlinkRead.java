
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
 *         &lt;element name="_this" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="symlink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flags" type="{http://www.virtualbox.org/}SymlinkReadFlag" maxOccurs="unbounded" minOccurs="0"/>
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
    "symlink",
    "flags"
})
@XmlRootElement(name = "IGuestSession_symlinkRead")
public class IGuestSessionSymlinkRead {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected String symlink;
    protected List<SymlinkReadFlag> flags;

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
     * Gets the value of the symlink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymlink() {
        return symlink;
    }

    /**
     * Sets the value of the symlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymlink(String value) {
        this.symlink = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SymlinkReadFlag }
     * 
     * 
     */
    public List<SymlinkReadFlag> getFlags() {
        if (flags == null) {
            flags = new ArrayList<SymlinkReadFlag>();
        }
        return this.flags;
    }

}

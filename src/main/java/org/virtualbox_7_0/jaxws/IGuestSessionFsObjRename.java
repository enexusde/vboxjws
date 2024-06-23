
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
 *         &lt;element name="oldPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flags" type="{http://www.virtualbox.org/}FsObjRenameFlag" maxOccurs="unbounded" minOccurs="0"/>
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
    "oldPath",
    "newPath",
    "flags"
})
@XmlRootElement(name = "IGuestSession_fsObjRename")
public class IGuestSessionFsObjRename {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected String oldPath;
    @XmlElement(required = true)
    protected String newPath;
    protected List<FsObjRenameFlag> flags;

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
     * Gets the value of the oldPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPath() {
        return oldPath;
    }

    /**
     * Sets the value of the oldPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPath(String value) {
        this.oldPath = value;
    }

    /**
     * Gets the value of the newPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPath() {
        return newPath;
    }

    /**
     * Sets the value of the newPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPath(String value) {
        this.newPath = value;
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
     * {@link FsObjRenameFlag }
     * 
     * 
     */
    public List<FsObjRenameFlag> getFlags() {
        if (flags == null) {
            flags = new ArrayList<FsObjRenameFlag>();
        }
        return this.flags;
    }

}

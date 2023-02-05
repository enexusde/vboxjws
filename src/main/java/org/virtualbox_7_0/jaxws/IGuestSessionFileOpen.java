
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
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accessMode" type="{http://www.virtualbox.org/}FileAccessMode"/>
 *         &lt;element name="openAction" type="{http://www.virtualbox.org/}FileOpenAction"/>
 *         &lt;element name="creationMode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "path",
    "accessMode",
    "openAction",
    "creationMode"
})
@XmlRootElement(name = "IGuestSession_fileOpen")
public class IGuestSessionFileOpen {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected String path;
    @XmlElement(required = true)
    protected FileAccessMode accessMode;
    @XmlElement(required = true)
    protected FileOpenAction openAction;
    @XmlSchemaType(name = "unsignedInt")
    protected long creationMode;

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
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the accessMode property.
     * 
     * @return
     *     possible object is
     *     {@link FileAccessMode }
     *     
     */
    public FileAccessMode getAccessMode() {
        return accessMode;
    }

    /**
     * Sets the value of the accessMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileAccessMode }
     *     
     */
    public void setAccessMode(FileAccessMode value) {
        this.accessMode = value;
    }

    /**
     * Gets the value of the openAction property.
     * 
     * @return
     *     possible object is
     *     {@link FileOpenAction }
     *     
     */
    public FileOpenAction getOpenAction() {
        return openAction;
    }

    /**
     * Sets the value of the openAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileOpenAction }
     *     
     */
    public void setOpenAction(FileOpenAction value) {
        this.openAction = value;
    }

    /**
     * Gets the value of the creationMode property.
     * 
     */
    public long getCreationMode() {
        return creationMode;
    }

    /**
     * Sets the value of the creationMode property.
     * 
     */
    public void setCreationMode(long value) {
        this.creationMode = value;
    }

}

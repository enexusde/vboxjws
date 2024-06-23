
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
 *         &lt;element name="executable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arguments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="environmentChanges" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="flags" type="{http://www.virtualbox.org/}ProcessCreateFlag" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeoutMS" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="priority" type="{http://www.virtualbox.org/}ProcessPriority"/>
 *         &lt;element name="affinity" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
    "executable",
    "arguments",
    "environmentChanges",
    "flags",
    "timeoutMS",
    "priority",
    "affinity"
})
@XmlRootElement(name = "IGuestSession_processCreateEx")
public class IGuestSessionProcessCreateEx {

    @XmlElement(required = true)
    protected String _this;
    @XmlElement(required = true)
    protected String executable;
    protected List<String> arguments;
    protected List<String> environmentChanges;
    protected List<ProcessCreateFlag> flags;
    @XmlSchemaType(name = "unsignedInt")
    protected long timeoutMS;
    @XmlElement(required = true)
    protected ProcessPriority priority;
    @XmlElement(type = Integer.class)
    protected List<Integer> affinity;

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
     * Gets the value of the executable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutable() {
        return executable;
    }

    /**
     * Sets the value of the executable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutable(String value) {
        this.executable = value;
    }

    /**
     * Gets the value of the arguments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arguments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArguments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArguments() {
        if (arguments == null) {
            arguments = new ArrayList<String>();
        }
        return this.arguments;
    }

    /**
     * Gets the value of the environmentChanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentChanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentChanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEnvironmentChanges() {
        if (environmentChanges == null) {
            environmentChanges = new ArrayList<String>();
        }
        return this.environmentChanges;
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
     * {@link ProcessCreateFlag }
     * 
     * 
     */
    public List<ProcessCreateFlag> getFlags() {
        if (flags == null) {
            flags = new ArrayList<ProcessCreateFlag>();
        }
        return this.flags;
    }

    /**
     * Gets the value of the timeoutMS property.
     * 
     */
    public long getTimeoutMS() {
        return timeoutMS;
    }

    /**
     * Sets the value of the timeoutMS property.
     * 
     */
    public void setTimeoutMS(long value) {
        this.timeoutMS = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessPriority }
     *     
     */
    public ProcessPriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessPriority }
     *     
     */
    public void setPriority(ProcessPriority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the affinity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affinity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffinity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAffinity() {
        if (affinity == null) {
            affinity = new ArrayList<Integer>();
        }
        return this.affinity;
    }

}

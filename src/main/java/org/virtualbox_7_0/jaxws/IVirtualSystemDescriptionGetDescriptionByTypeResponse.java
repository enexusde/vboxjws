
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
 *         &lt;element name="types" type="{http://www.virtualbox.org/}VirtualSystemDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OVFValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VBoxValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extraConfigValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "types",
    "refs",
    "ovfValues",
    "vBoxValues",
    "extraConfigValues"
})
@XmlRootElement(name = "IVirtualSystemDescription_getDescriptionByTypeResponse")
public class IVirtualSystemDescriptionGetDescriptionByTypeResponse {

    protected List<VirtualSystemDescriptionType> types;
    protected List<String> refs;
    @XmlElement(name = "OVFValues")
    protected List<String> ovfValues;
    @XmlElement(name = "VBoxValues")
    protected List<String> vBoxValues;
    protected List<String> extraConfigValues;

    /**
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualSystemDescriptionType }
     * 
     * 
     */
    public List<VirtualSystemDescriptionType> getTypes() {
        if (types == null) {
            types = new ArrayList<VirtualSystemDescriptionType>();
        }
        return this.types;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRefs() {
        if (refs == null) {
            refs = new ArrayList<String>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the ovfValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ovfValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOVFValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOVFValues() {
        if (ovfValues == null) {
            ovfValues = new ArrayList<String>();
        }
        return this.ovfValues;
    }

    /**
     * Gets the value of the vBoxValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vBoxValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVBoxValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVBoxValues() {
        if (vBoxValues == null) {
            vBoxValues = new ArrayList<String>();
        }
        return this.vBoxValues;
    }

    /**
     * Gets the value of the extraConfigValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraConfigValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraConfigValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtraConfigValues() {
        if (extraConfigValues == null) {
            extraConfigValues = new ArrayList<String>();
        }
        return this.extraConfigValues;
    }

}

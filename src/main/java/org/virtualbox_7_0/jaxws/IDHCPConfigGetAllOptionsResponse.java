
package org.virtualbox_7_0.jaxws;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="options" type="{http://www.virtualbox.org/}DHCPOption" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="encodings" type="{http://www.virtualbox.org/}DHCPOptionEncoding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnval" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "options",
    "encodings",
    "returnval"
})
@XmlRootElement(name = "IDHCPConfig_getAllOptionsResponse")
public class IDHCPConfigGetAllOptionsResponse {

    protected List<DHCPOption> options;
    protected List<DHCPOptionEncoding> encodings;
    protected List<String> returnval;

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DHCPOption }
     * 
     * 
     */
    public List<DHCPOption> getOptions() {
        if (options == null) {
            options = new ArrayList<DHCPOption>();
        }
        return this.options;
    }

    /**
     * Gets the value of the encodings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encodings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncodings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DHCPOptionEncoding }
     * 
     * 
     */
    public List<DHCPOptionEncoding> getEncodings() {
        if (encodings == null) {
            encodings = new ArrayList<DHCPOptionEncoding>();
        }
        return this.encodings;
    }

    /**
     * Gets the value of the returnval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReturnval() {
        if (returnval == null) {
            returnval = new ArrayList<String>();
        }
        return this.returnval;
    }

}

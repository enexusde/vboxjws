
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
 *         &lt;element name="returnval" type="{http://www.virtualbox.org/}VFSType" maxOccurs="unbounded" minOccurs="0"/>
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
    "returnval"
})
@XmlRootElement(name = "ISystemProperties_getSupportedVFSTypesResponse")
public class ISystemPropertiesGetSupportedVFSTypesResponse {

    protected List<VFSType> returnval;

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
     * {@link VFSType }
     * 
     * 
     */
    public List<VFSType> getReturnval() {
        if (returnval == null) {
            returnval = new ArrayList<VFSType>();
        }
        return this.returnval;
    }

}

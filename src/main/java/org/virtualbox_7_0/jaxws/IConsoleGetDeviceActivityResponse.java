
package org.virtualbox_7_0.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="returnval" type="{http://www.virtualbox.org/}DeviceActivity" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "IConsole_getDeviceActivityResponse")
public class IConsoleGetDeviceActivityResponse {

    protected List<DeviceActivity> returnval;

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
     * {@link DeviceActivity }
     * 
     * 
     */
    public List<DeviceActivity> getReturnval() {
        if (returnval == null) {
            returnval = new ArrayList<DeviceActivity>();
        }
        return this.returnval;
    }

}

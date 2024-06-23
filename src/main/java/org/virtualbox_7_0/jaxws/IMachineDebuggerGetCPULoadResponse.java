
package org.virtualbox_7_0.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="pctExecuting" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="pctHalted" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="pctOther" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="returnval" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "pctExecuting",
    "pctHalted",
    "pctOther",
    "returnval"
})
@XmlRootElement(name = "IMachineDebugger_getCPULoadResponse")
public class IMachineDebuggerGetCPULoadResponse {

    @XmlSchemaType(name = "unsignedInt")
    protected long pctExecuting;
    @XmlSchemaType(name = "unsignedInt")
    protected long pctHalted;
    @XmlSchemaType(name = "unsignedInt")
    protected long pctOther;
    protected long returnval;

    /**
     * Gets the value of the pctExecuting property.
     * 
     */
    public long getPctExecuting() {
        return pctExecuting;
    }

    /**
     * Sets the value of the pctExecuting property.
     * 
     */
    public void setPctExecuting(long value) {
        this.pctExecuting = value;
    }

    /**
     * Gets the value of the pctHalted property.
     * 
     */
    public long getPctHalted() {
        return pctHalted;
    }

    /**
     * Sets the value of the pctHalted property.
     * 
     */
    public void setPctHalted(long value) {
        this.pctHalted = value;
    }

    /**
     * Gets the value of the pctOther property.
     * 
     */
    public long getPctOther() {
        return pctOther;
    }

    /**
     * Sets the value of the pctOther property.
     * 
     */
    public void setPctOther(long value) {
        this.pctOther = value;
    }

    /**
     * Gets the value of the returnval property.
     * 
     */
    public long getReturnval() {
        return returnval;
    }

    /**
     * Sets the value of the returnval property.
     * 
     */
    public void setReturnval(long value) {
        this.returnval = value;
    }

}

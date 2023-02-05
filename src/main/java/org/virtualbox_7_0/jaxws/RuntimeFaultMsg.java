
package org.virtualbox_7_0.jaxws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "RuntimeFault", targetNamespace = "http://www.virtualbox.org/")
public class RuntimeFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RuntimeFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public RuntimeFaultMsg(String message, RuntimeFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public RuntimeFaultMsg(String message, RuntimeFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.virtualbox_7_0.jaxws.RuntimeFault
     */
    public RuntimeFault getFaultInfo() {
        return faultInfo;
    }

}
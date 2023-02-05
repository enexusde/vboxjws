
package org.virtualbox_7_0.jaxws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "InvalidObjectFault", targetNamespace = "http://www.virtualbox.org/")
public class InvalidObjectFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidObjectFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidObjectFaultMsg(String message, InvalidObjectFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidObjectFaultMsg(String message, InvalidObjectFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.virtualbox_7_0.jaxws.InvalidObjectFault
     */
    public InvalidObjectFault getFaultInfo() {
        return faultInfo;
    }

}


package main.java.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ClientException", targetNamespace = "http://services.web/")
public class ClientException_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ClientException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ClientException_Exception(String message, ClientException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ClientException_Exception(String message, ClientException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: main.java.webservice.ClientException
     */
    public ClientException getFaultInfo() {
        return faultInfo;
    }

}

package main.java.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "HotelException", targetNamespace = "http://services.web/")
public class HotelException_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private HotelException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public HotelException_Exception(String message, HotelException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public HotelException_Exception(String message, HotelException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: main.java.webservice.HotelException
     */
    public HotelException getFaultInfo() {
        return faultInfo;
    }

}
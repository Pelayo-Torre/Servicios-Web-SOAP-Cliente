
package main.java.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "BookingException", targetNamespace = "http://services.web/")
public class BookingException_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private BookingException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public BookingException_Exception(String message, BookingException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public BookingException_Exception(String message, BookingException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: main.java.webservice.BookingException
     */
    public BookingException getFaultInfo() {
        return faultInfo;
    }

}

package main.java.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HotelWSService", targetNamespace = "http://services.web/", wsdlLocation = "http://localhost:8080/ServicioWebSOAP/soapws/hotel?wsdl")
public class HotelWSService
    extends Service
{

    private final static URL HOTELWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException HOTELWSSERVICE_EXCEPTION;
    private final static QName HOTELWSSERVICE_QNAME = new QName("http://services.web/", "HotelWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServicioWebSOAP/soapws/hotel?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOTELWSSERVICE_WSDL_LOCATION = url;
        HOTELWSSERVICE_EXCEPTION = e;
    }

    public HotelWSService() {
        super(__getWsdlLocation(), HOTELWSSERVICE_QNAME);
    }

    public HotelWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOTELWSSERVICE_QNAME, features);
    }

    public HotelWSService(URL wsdlLocation) {
        super(wsdlLocation, HOTELWSSERVICE_QNAME);
    }

    public HotelWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOTELWSSERVICE_QNAME, features);
    }

    public HotelWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IHotelWS
     */
    @WebEndpoint(name = "HotelWSPort")
    public IHotelWS getHotelWSPort() {
        return super.getPort(new QName("http://services.web/", "HotelWSPort"), IHotelWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IHotelWS
     */
    @WebEndpoint(name = "HotelWSPort")
    public IHotelWS getHotelWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.web/", "HotelWSPort"), IHotelWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOTELWSSERVICE_EXCEPTION!= null) {
            throw HOTELWSSERVICE_EXCEPTION;
        }
        return HOTELWSSERVICE_WSDL_LOCATION;
    }

}

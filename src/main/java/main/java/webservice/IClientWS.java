
package main.java.webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IClientWS", targetNamespace = "http://services.web/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IClientWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws ClientException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateClient", targetNamespace = "http://services.web/", className = "main.java.webservice.UpdateClient")
    @ResponseWrapper(localName = "updateClientResponse", targetNamespace = "http://services.web/", className = "main.java.webservice.UpdateClientResponse")
    @Action(input = "http://services.web/IClientWS/updateClientRequest", output = "http://services.web/IClientWS/updateClientResponse", fault = {
        @FaultAction(className = ClientException_Exception.class, value = "http://services.web/IClientWS/updateClient/Fault/ClientException")
    })
    public String updateClient(
        @WebParam(name = "arg0", targetNamespace = "")
        ClientDTO arg0)
        throws ClientException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws ClientException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteClient", targetNamespace = "http://services.web/", className = "main.java.webservice.DeleteClient")
    @ResponseWrapper(localName = "deleteClientResponse", targetNamespace = "http://services.web/", className = "main.java.webservice.DeleteClientResponse")
    @Action(input = "http://services.web/IClientWS/deleteClientRequest", output = "http://services.web/IClientWS/deleteClientResponse", fault = {
        @FaultAction(className = ClientException_Exception.class, value = "http://services.web/IClientWS/deleteClient/Fault/ClientException")
    })
    public String deleteClient(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws ClientException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns main.java.webservice.ClientDTO
     * @throws ClientException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listClient", targetNamespace = "http://services.web/", className = "main.java.webservice.ListClient")
    @ResponseWrapper(localName = "listClientResponse", targetNamespace = "http://services.web/", className = "main.java.webservice.ListClientResponse")
    @Action(input = "http://services.web/IClientWS/listClientRequest", output = "http://services.web/IClientWS/listClientResponse", fault = {
        @FaultAction(className = ClientException_Exception.class, value = "http://services.web/IClientWS/listClient/Fault/ClientException")
    })
    public ClientDTO listClient(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws ClientException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws HotelException_Exception
     * @throws ClientException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addClient", targetNamespace = "http://services.web/", className = "main.java.webservice.AddClient")
    @ResponseWrapper(localName = "addClientResponse", targetNamespace = "http://services.web/", className = "main.java.webservice.AddClientResponse")
    @Action(input = "http://services.web/IClientWS/addClientRequest", output = "http://services.web/IClientWS/addClientResponse", fault = {
        @FaultAction(className = ClientException_Exception.class, value = "http://services.web/IClientWS/addClient/Fault/ClientException"),
        @FaultAction(className = HotelException_Exception.class, value = "http://services.web/IClientWS/addClient/Fault/HotelException")
    })
    public String addClient(
        @WebParam(name = "arg0", targetNamespace = "")
        ClientAddDTO arg0)
        throws ClientException_Exception, HotelException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<main.java.webservice.ClientDTO>
     * @throws HotelException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listClientsOfHotel", targetNamespace = "http://services.web/", className = "main.java.webservice.ListClientsOfHotel")
    @ResponseWrapper(localName = "listClientsOfHotelResponse", targetNamespace = "http://services.web/", className = "main.java.webservice.ListClientsOfHotelResponse")
    @Action(input = "http://services.web/IClientWS/listClientsOfHotelRequest", output = "http://services.web/IClientWS/listClientsOfHotelResponse", fault = {
        @FaultAction(className = HotelException_Exception.class, value = "http://services.web/IClientWS/listClientsOfHotel/Fault/HotelException")
    })
    public List<ClientDTO> listClientsOfHotel(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws HotelException_Exception
    ;

}

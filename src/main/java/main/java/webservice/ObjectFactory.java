
package main.java.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the main.java.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ClientException_QNAME = new QName("http://services.web/", "ClientException");
    private final static QName _Exception_QNAME = new QName("http://services.web/", "Exception");
    private final static QName _AddClient_QNAME = new QName("http://services.web/", "addClient");
    private final static QName _AddClientResponse_QNAME = new QName("http://services.web/", "addClientResponse");
    private final static QName _DeleteClient_QNAME = new QName("http://services.web/", "deleteClient");
    private final static QName _DeleteClientResponse_QNAME = new QName("http://services.web/", "deleteClientResponse");
    private final static QName _ListClient_QNAME = new QName("http://services.web/", "listClient");
    private final static QName _ListClientResponse_QNAME = new QName("http://services.web/", "listClientResponse");
    private final static QName _ListClientsOfHotel_QNAME = new QName("http://services.web/", "listClientsOfHotel");
    private final static QName _ListClientsOfHotelResponse_QNAME = new QName("http://services.web/", "listClientsOfHotelResponse");
    private final static QName _UpdateClient_QNAME = new QName("http://services.web/", "updateClient");
    private final static QName _UpdateClientResponse_QNAME = new QName("http://services.web/", "updateClientResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: main.java.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClientException }
     * 
     */
    public ClientException createClientException() {
        return new ClientException();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link AddClient }
     * 
     */
    public AddClient createAddClient() {
        return new AddClient();
    }

    /**
     * Create an instance of {@link AddClientResponse }
     * 
     */
    public AddClientResponse createAddClientResponse() {
        return new AddClientResponse();
    }

    /**
     * Create an instance of {@link DeleteClient }
     * 
     */
    public DeleteClient createDeleteClient() {
        return new DeleteClient();
    }

    /**
     * Create an instance of {@link DeleteClientResponse }
     * 
     */
    public DeleteClientResponse createDeleteClientResponse() {
        return new DeleteClientResponse();
    }

    /**
     * Create an instance of {@link ListClient }
     * 
     */
    public ListClient createListClient() {
        return new ListClient();
    }

    /**
     * Create an instance of {@link ListClientResponse }
     * 
     */
    public ListClientResponse createListClientResponse() {
        return new ListClientResponse();
    }

    /**
     * Create an instance of {@link ListClientsOfHotel }
     * 
     */
    public ListClientsOfHotel createListClientsOfHotel() {
        return new ListClientsOfHotel();
    }

    /**
     * Create an instance of {@link ListClientsOfHotelResponse }
     * 
     */
    public ListClientsOfHotelResponse createListClientsOfHotelResponse() {
        return new ListClientsOfHotelResponse();
    }

    /**
     * Create an instance of {@link UpdateClient }
     * 
     */
    public UpdateClient createUpdateClient() {
        return new UpdateClient();
    }

    /**
     * Create an instance of {@link UpdateClientResponse }
     * 
     */
    public UpdateClientResponse createUpdateClientResponse() {
        return new UpdateClientResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientException }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "ClientException")
    public JAXBElement<ClientException> createClientException(ClientException value) {
        return new JAXBElement<ClientException>(_ClientException_QNAME, ClientException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "addClient")
    public JAXBElement<AddClient> createAddClient(AddClient value) {
        return new JAXBElement<AddClient>(_AddClient_QNAME, AddClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "addClientResponse")
    public JAXBElement<AddClientResponse> createAddClientResponse(AddClientResponse value) {
        return new JAXBElement<AddClientResponse>(_AddClientResponse_QNAME, AddClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "deleteClient")
    public JAXBElement<DeleteClient> createDeleteClient(DeleteClient value) {
        return new JAXBElement<DeleteClient>(_DeleteClient_QNAME, DeleteClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "deleteClientResponse")
    public JAXBElement<DeleteClientResponse> createDeleteClientResponse(DeleteClientResponse value) {
        return new JAXBElement<DeleteClientResponse>(_DeleteClientResponse_QNAME, DeleteClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "listClient")
    public JAXBElement<ListClient> createListClient(ListClient value) {
        return new JAXBElement<ListClient>(_ListClient_QNAME, ListClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "listClientResponse")
    public JAXBElement<ListClientResponse> createListClientResponse(ListClientResponse value) {
        return new JAXBElement<ListClientResponse>(_ListClientResponse_QNAME, ListClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListClientsOfHotel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListClientsOfHotel }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "listClientsOfHotel")
    public JAXBElement<ListClientsOfHotel> createListClientsOfHotel(ListClientsOfHotel value) {
        return new JAXBElement<ListClientsOfHotel>(_ListClientsOfHotel_QNAME, ListClientsOfHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListClientsOfHotelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListClientsOfHotelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "listClientsOfHotelResponse")
    public JAXBElement<ListClientsOfHotelResponse> createListClientsOfHotelResponse(ListClientsOfHotelResponse value) {
        return new JAXBElement<ListClientsOfHotelResponse>(_ListClientsOfHotelResponse_QNAME, ListClientsOfHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "updateClient")
    public JAXBElement<UpdateClient> createUpdateClient(UpdateClient value) {
        return new JAXBElement<UpdateClient>(_UpdateClient_QNAME, UpdateClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "updateClientResponse")
    public JAXBElement<UpdateClientResponse> createUpdateClientResponse(UpdateClientResponse value) {
        return new JAXBElement<UpdateClientResponse>(_UpdateClientResponse_QNAME, UpdateClientResponse.class, null, value);
    }

}

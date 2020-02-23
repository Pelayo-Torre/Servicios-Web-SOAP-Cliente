
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

    private final static QName _BookingException_QNAME = new QName("http://services.web/", "BookingException");
    private final static QName _HotelException_QNAME = new QName("http://services.web/", "HotelException");
    private final static QName _ServiceException_QNAME = new QName("http://services.web/", "ServiceException");
    private final static QName _AddService_QNAME = new QName("http://services.web/", "addService");
    private final static QName _AddServiceResponse_QNAME = new QName("http://services.web/", "addServiceResponse");
    private final static QName _DeleteService_QNAME = new QName("http://services.web/", "deleteService");
    private final static QName _DeleteServiceResponse_QNAME = new QName("http://services.web/", "deleteServiceResponse");
    private final static QName _ListService_QNAME = new QName("http://services.web/", "listService");
    private final static QName _ListServiceResponse_QNAME = new QName("http://services.web/", "listServiceResponse");
    private final static QName _ListServicesOfBooking_QNAME = new QName("http://services.web/", "listServicesOfBooking");
    private final static QName _ListServicesOfBookingResponse_QNAME = new QName("http://services.web/", "listServicesOfBookingResponse");
    private final static QName _ListServicesOfHotel_QNAME = new QName("http://services.web/", "listServicesOfHotel");
    private final static QName _ListServicesOfHotelResponse_QNAME = new QName("http://services.web/", "listServicesOfHotelResponse");
    private final static QName _UpdateService_QNAME = new QName("http://services.web/", "updateService");
    private final static QName _UpdateServiceResponse_QNAME = new QName("http://services.web/", "updateServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: main.java.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookingException }
     * 
     */
    public BookingException createBookingException() {
        return new BookingException();
    }

    /**
     * Create an instance of {@link HotelException }
     * 
     */
    public HotelException createHotelException() {
        return new HotelException();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link AddService }
     * 
     */
    public AddService createAddService() {
        return new AddService();
    }

    /**
     * Create an instance of {@link AddServiceResponse }
     * 
     */
    public AddServiceResponse createAddServiceResponse() {
        return new AddServiceResponse();
    }

    /**
     * Create an instance of {@link DeleteService }
     * 
     */
    public DeleteService createDeleteService() {
        return new DeleteService();
    }

    /**
     * Create an instance of {@link DeleteServiceResponse }
     * 
     */
    public DeleteServiceResponse createDeleteServiceResponse() {
        return new DeleteServiceResponse();
    }

    /**
     * Create an instance of {@link ListService }
     * 
     */
    public ListService createListService() {
        return new ListService();
    }

    /**
     * Create an instance of {@link ListServiceResponse }
     * 
     */
    public ListServiceResponse createListServiceResponse() {
        return new ListServiceResponse();
    }

    /**
     * Create an instance of {@link ListServicesOfBooking }
     * 
     */
    public ListServicesOfBooking createListServicesOfBooking() {
        return new ListServicesOfBooking();
    }

    /**
     * Create an instance of {@link ListServicesOfBookingResponse }
     * 
     */
    public ListServicesOfBookingResponse createListServicesOfBookingResponse() {
        return new ListServicesOfBookingResponse();
    }

    /**
     * Create an instance of {@link ListServicesOfHotel }
     * 
     */
    public ListServicesOfHotel createListServicesOfHotel() {
        return new ListServicesOfHotel();
    }

    /**
     * Create an instance of {@link ListServicesOfHotelResponse }
     * 
     */
    public ListServicesOfHotelResponse createListServicesOfHotelResponse() {
        return new ListServicesOfHotelResponse();
    }

    /**
     * Create an instance of {@link UpdateService }
     * 
     */
    public UpdateService createUpdateService() {
        return new UpdateService();
    }

    /**
     * Create an instance of {@link UpdateServiceResponse }
     * 
     */
    public UpdateServiceResponse createUpdateServiceResponse() {
        return new UpdateServiceResponse();
    }

    /**
     * Create an instance of {@link ServiceDTO }
     * 
     */
    public ServiceDTO createServiceDTO() {
        return new ServiceDTO();
    }

    /**
     * Create an instance of {@link ServiceAddDTO }
     * 
     */
    public ServiceAddDTO createServiceAddDTO() {
        return new ServiceAddDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookingException }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "BookingException")
    public JAXBElement<BookingException> createBookingException(BookingException value) {
        return new JAXBElement<BookingException>(_BookingException_QNAME, BookingException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HotelException }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "HotelException")
    public JAXBElement<HotelException> createHotelException(HotelException value) {
        return new JAXBElement<HotelException>(_HotelException_QNAME, HotelException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "ServiceException")
    public JAXBElement<ServiceException> createServiceException(ServiceException value) {
        return new JAXBElement<ServiceException>(_ServiceException_QNAME, ServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddService }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "addService")
    public JAXBElement<AddService> createAddService(AddService value) {
        return new JAXBElement<AddService>(_AddService_QNAME, AddService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "addServiceResponse")
    public JAXBElement<AddServiceResponse> createAddServiceResponse(AddServiceResponse value) {
        return new JAXBElement<AddServiceResponse>(_AddServiceResponse_QNAME, AddServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteService }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "deleteService")
    public JAXBElement<DeleteService> createDeleteService(DeleteService value) {
        return new JAXBElement<DeleteService>(_DeleteService_QNAME, DeleteService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "deleteServiceResponse")
    public JAXBElement<DeleteServiceResponse> createDeleteServiceResponse(DeleteServiceResponse value) {
        return new JAXBElement<DeleteServiceResponse>(_DeleteServiceResponse_QNAME, DeleteServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListService }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "listService")
    public JAXBElement<ListService> createListService(ListService value) {
        return new JAXBElement<ListService>(_ListService_QNAME, ListService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "listServiceResponse")
    public JAXBElement<ListServiceResponse> createListServiceResponse(ListServiceResponse value) {
        return new JAXBElement<ListServiceResponse>(_ListServiceResponse_QNAME, ListServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListServicesOfBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListServicesOfBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "listServicesOfBooking")
    public JAXBElement<ListServicesOfBooking> createListServicesOfBooking(ListServicesOfBooking value) {
        return new JAXBElement<ListServicesOfBooking>(_ListServicesOfBooking_QNAME, ListServicesOfBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListServicesOfBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListServicesOfBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "listServicesOfBookingResponse")
    public JAXBElement<ListServicesOfBookingResponse> createListServicesOfBookingResponse(ListServicesOfBookingResponse value) {
        return new JAXBElement<ListServicesOfBookingResponse>(_ListServicesOfBookingResponse_QNAME, ListServicesOfBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListServicesOfHotel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListServicesOfHotel }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "listServicesOfHotel")
    public JAXBElement<ListServicesOfHotel> createListServicesOfHotel(ListServicesOfHotel value) {
        return new JAXBElement<ListServicesOfHotel>(_ListServicesOfHotel_QNAME, ListServicesOfHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListServicesOfHotelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListServicesOfHotelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "listServicesOfHotelResponse")
    public JAXBElement<ListServicesOfHotelResponse> createListServicesOfHotelResponse(ListServicesOfHotelResponse value) {
        return new JAXBElement<ListServicesOfHotelResponse>(_ListServicesOfHotelResponse_QNAME, ListServicesOfHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateService }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "updateService")
    public JAXBElement<UpdateService> createUpdateService(UpdateService value) {
        return new JAXBElement<UpdateService>(_UpdateService_QNAME, UpdateService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.web/", name = "updateServiceResponse")
    public JAXBElement<UpdateServiceResponse> createUpdateServiceResponse(UpdateServiceResponse value) {
        return new JAXBElement<UpdateServiceResponse>(_UpdateServiceResponse_QNAME, UpdateServiceResponse.class, null, value);
    }

}

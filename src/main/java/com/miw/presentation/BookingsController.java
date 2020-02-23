package com.miw.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.miw.utils.Booking;
import com.miw.utils.ServiceBooking;

import main.java.webservice.BookingAddDTO;
import main.java.webservice.BookingDTO;
import main.java.webservice.BookingException_Exception;
import main.java.webservice.BookingWSService;
import main.java.webservice.ClientException_Exception;
import main.java.webservice.HotelException_Exception;
import main.java.webservice.IBookingWS;
import main.java.webservice.IServiceWS;
import main.java.webservice.ParseException_Exception;
import main.java.webservice.ServiceDTO;
import main.java.webservice.ServiceException_Exception;
import main.java.webservice.ServiceWSService;

@Controller
@RequestMapping("bookings")
public class BookingsController {
	
	@Autowired 
	private HttpSession session;
	
	@ModelAttribute("booking")
	public BookingAddDTO getBooking() {
		return new BookingAddDTO();
	}
	
	@ModelAttribute("bookingEdit")
	public Booking getBookingEdit() {
		return new Booking();
	}
	
	@ModelAttribute("serviceBooking")
	public ServiceBooking getServiceBooking() {
		return new ServiceBooking();
	}
	
	@RequestMapping(value="/add/{idClient}", method = RequestMethod.GET)
	public String addBooking(@PathVariable Long idClient, Model model) {
		model.addAttribute("error", "");
		model.addAttribute("idClient", idClient);		
		return "addBooking";
	}
	
	@RequestMapping(value="/add/services/{idBooking}/{idClient}", method = RequestMethod.GET)
	public String addServiceToBooking(@PathVariable Long idBooking, @PathVariable Long idClient, Model model) {
		model.addAttribute("error", "");
		model.addAttribute("idBooking", idBooking);	
		model.addAttribute("idClient", idClient);	
		
		ServiceWSService ser = new ServiceWSService();
		IServiceWS servicews = ser.getServiceWSPort();
		
		List<ServiceDTO> allServices = new ArrayList<ServiceDTO>();
		List<ServiceDTO> clientServices = new ArrayList<ServiceDTO>();
		List<ServiceBooking> pantalla = new ArrayList<ServiceBooking>();
		List<Long> iniciales = new ArrayList<Long>();
		
		try {
			allServices =  servicews.listServicesOfHotel(2L);
			model.addAttribute("error", "");
		} catch (HotelException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "listBookings";
		}
		
		try {
			clientServices = servicews.listServicesOfBooking(idBooking);
		} catch (BookingException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "listBookings";
		}
		
		
		for(ServiceDTO allS : allServices) {
			boolean ig = false;
			ServiceBooking sb = new ServiceBooking();
			sb.setName(allS.getName());
			sb.setIdService(allS.getId());
			for(ServiceDTO clientS : clientServices) {
				if(allS.getId() == clientS.getId()) {
					ig = true;
					sb.setSelected(true);
					iniciales.add(allS.getId());
				}
			}
			if(!ig) {
				sb.setSelected(false);
			}
			pantalla.add(sb);
		}
		
		session.setAttribute("iniciales", iniciales);
		
		model.addAttribute("services", pantalla);
		
		return "addServicesToBooking";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/add/services", method = RequestMethod.POST)
	public String addServiceToBooking(@ModelAttribute("serviceBooking") ServiceBooking sb, Model model) {		
		BookingWSService service = new BookingWSService();
		IBookingWS bookingws = service.getBookingWSPort();
		
		List<ServiceDTO> idsBorrar = new ArrayList<ServiceDTO>();
		List<ServiceDTO> servicesSelected = new ArrayList<ServiceDTO>();
		
		for(Long ids : sb.getSeleccionados()) {
			ServiceDTO s = new ServiceDTO();
			s.setId(ids);
			servicesSelected.add(s);
		}
		
		for(Long id : (List<Long>)session.getAttribute("iniciales")) {
			boolean esta = false;
			for(Long ids : sb.getSeleccionados()) {
				if(id == ids)
					esta = true;
			}
			if(!esta) {
				ServiceDTO dto = new ServiceDTO();
				dto.setId(id);
				idsBorrar.add(dto);
			}
				
		}
		
		
		try {
			
			bookingws.addServicesToBooking(sb.getIdBooking(), servicesSelected);
			bookingws.removeServicesToBooking(sb.getIdBooking(), idsBorrar);
			model.addAttribute("error", "");
		}  catch (BookingException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addServicesToBooking";
		} catch (ServiceException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addServicesToBooking";
		}
		
		
		
		try {
			model.addAttribute("bookings", bookingws.listBookingsOfClient(sb.getIdClient()));
			model.addAttribute("idClient", sb.getIdClient());
		} catch (ClientException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addBooking"; 
		}
		
		return "listBookings";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addBooking(@ModelAttribute("booking") BookingAddDTO booking,Model model) {
		BookingWSService service = new BookingWSService();
		IBookingWS bookingws = service.getBookingWSPort();
		
		try {
			bookingws.addBooking(booking);
			model.addAttribute("error", "");

		} catch (BookingException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addBooking";
		} catch (ClientException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addBooking";
		} catch (ParseException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addBooking";
		}
		
		try {
			model.addAttribute("bookings", bookingws.listBookingsOfClient(booking.getIdClient()));
			model.addAttribute("idClient", booking.getIdClient());
		} catch (ClientException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addBooking"; 
		}
		
		return "listBookings";
	}
	
	@RequestMapping(value="/edit", method = RequestMethod.POST)
	public String editClient(@ModelAttribute("bookingEdit") Booking booking, Model model) {
		BookingWSService service = new BookingWSService();
		IBookingWS bookingws = service.getBookingWSPort();
			
		try {
			BookingDTO dto = new BookingDTO();
			dto.setCancelled(booking.getCancelled());
			dto.setEndDate(booking.getEndDate());
			dto.setIdBooking(booking.getIdBooking());
			dto.setPrice(booking.getPrice());
			dto.setStartDate(booking.getStartDate());
			bookingws.updateBooking(dto);
		} catch (BookingException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "editBooking";
		} catch (ParseException_Exception e) {
			model.addAttribute("error", e.getMessage());
		} 
		return "redirect:list/" + booking.getIdClient();
	}
	
	@RequestMapping(value="/list/{idClient}", method = RequestMethod.GET)
	public String listBooking(@PathVariable Long idClient, Model model) {
		BookingWSService service = new BookingWSService();
		IBookingWS bookingws = service.getBookingWSPort();
		try {
			model.addAttribute("bookings", bookingws.listBookingsOfClient(idClient));
			model.addAttribute("idClient", idClient);
			model.addAttribute("error", "");
		}catch (ClientException_Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "listBookings";
	}
	
	@RequestMapping(value="/edit/{idClient}/{id}", method = RequestMethod.GET)
	public String editBooking(@PathVariable Long idClient, @PathVariable Long id, Model model) {
		BookingWSService service = new BookingWSService();
		IBookingWS bookingws = service.getBookingWSPort();
		try {
			Booking booking = new Booking();
			BookingDTO dto = new BookingDTO();
			
			dto = bookingws.listBooking(id);
			
			booking.setCancelled(dto.getCancelled());
			booking.setEndDate(dto.getEndDate());
			booking.setIdBooking(dto.getIdBooking());
			booking.setIdClient(idClient);
			booking.setPrice(dto.getPrice());
			booking.setStartDate(dto.getStartDate());
			
			model.addAttribute("bookingEdit", booking);
			model.addAttribute("idClient", idClient);
			model.addAttribute("error", "");
		} catch (BookingException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "listBookings";
		}
		return "editBooking";
	}
	
	@RequestMapping(value="/desactivate/{idClient}/{id}", method = RequestMethod.GET)
	public String desactivateBooking(@PathVariable() Long idClient, @PathVariable Long id, Model model) {
		BookingWSService service = new BookingWSService();
		IBookingWS bookingws = service.getBookingWSPort();
		try {
			bookingws.deleteBooking(id);
			model.addAttribute("error", "");
		} catch (BookingException_Exception e) {
			model.addAttribute("error", e.getMessage());
		} catch (ParseException_Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "redirect:/bookings/list/" + idClient;
	}

}

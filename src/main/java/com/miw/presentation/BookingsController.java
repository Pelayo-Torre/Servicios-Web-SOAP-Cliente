package com.miw.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.webservice.BookingAddDTO;
import main.java.webservice.BookingDTO;
import main.java.webservice.BookingException_Exception;
import main.java.webservice.BookingWSService;
import main.java.webservice.ClientDTO;
import main.java.webservice.ClientException_Exception;
import main.java.webservice.ClientWSService;
import main.java.webservice.HotelException_Exception;
import main.java.webservice.IBookingWS;
import main.java.webservice.IClientWS;
import main.java.webservice.IRoomWS;
import main.java.webservice.IServiceWS;
import main.java.webservice.ParseException_Exception;
import main.java.webservice.RoomWSService;
import main.java.webservice.ServiceWSService;

@Controller
@RequestMapping("bookings")
public class BookingsController {
	
	@ModelAttribute("booking")
	public BookingAddDTO getBooking() {
		return new BookingAddDTO();
	}
	
	@ModelAttribute("bookingEdit")
	public BookingDTO getBookingEdit() {
		return new BookingDTO();
	}
	
	@RequestMapping(value="/add/{idClient}", method = RequestMethod.GET)
	public String addBooking(@PathVariable Long idClient, Model model) {
		model.addAttribute("error", "");
		model.addAttribute("idClient", idClient);		
		return "addBooking";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addBooking(@ModelAttribute("booking") BookingAddDTO booking,Model model) {
		BookingWSService service = new BookingWSService();
		IBookingWS bookingws = service.getBookingWSPort();
		
		try {
			bookingws.addBooking(booking);
		} catch (BookingException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addClient";
		} catch (ClientException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addClient";
		} catch (ParseException_Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "redirect:list";
	}
	
//	@RequestMapping(value="/edit", method = RequestMethod.POST)
//	public String editClient(@ModelAttribute("clientEdit") ClientDTO client, Model model) {
//		ClientWSService service = new ClientWSService();
//		IClientWS clientws = service.getClientWSPort();
//			
//		try {
//			clientws.updateClient(client);
//		} catch (ClientException_Exception e) {
//			model.addAttribute("error", e.getMessage());
//			return "editClient";
//		} 
//		return "redirect:list";
//	}
	
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
	
//	@RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
//	public String editClient(@PathVariable Long id, Model model) {
//		ClientWSService service = new ClientWSService();
//		IClientWS clientws = service.getClientWSPort();
//		try {
//			model.addAttribute("clientEdit", clientws.listClient(id));
//			model.addAttribute("error", "");
//		} catch (ClientException_Exception e) {
//			model.addAttribute("error", e.getMessage());
//			return "listClients";
//		}
//		return "editClient";
//	}
	
//	@RequestMapping(value="/desactivate/{id}", method = RequestMethod.GET)
//	public String desactivateClient(@PathVariable Long id, Model model) {
//		ClientWSService service = new ClientWSService();
//		IClientWS clientws = service.getClientWSPort();
//		try {
//			clientws.deleteClient(id);
//			model.addAttribute("error", "");
//		} catch (ClientException_Exception e) {
//			model.addAttribute("error", e.getMessage());
//		}
//		return "redirect:/clients/list";
//	}

}

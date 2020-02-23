package com.miw.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.webservice.HotelException_Exception;
import main.java.webservice.IServiceWS;
import main.java.webservice.ServiceAddDTO;
import main.java.webservice.ServiceDTO;
import main.java.webservice.ServiceException_Exception;
import main.java.webservice.ServiceWSService;

@Controller
@RequestMapping("services")
public class ServicesController {
	
	@ModelAttribute("service")
	public ServiceAddDTO getService() {
		return new ServiceAddDTO();
	}
	
	@ModelAttribute("serviceEdit")
	public ServiceDTO getServiceEdit() {
		return new ServiceDTO();
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String addService(Model model) {
		model.addAttribute("error", "");
		return "addService";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addService(@ModelAttribute("service") ServiceAddDTO service, Model model) {
		ServiceWSService ser = new ServiceWSService();
		IServiceWS servicews = ser.getServiceWSPort();
		
		service.setIdHotel(2L);
				
		try {
			servicews.addService(service);
		} catch (HotelException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addService";
		} catch (ServiceException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addService";
		}
		return "redirect:list";
	}
	
	@RequestMapping(value="/edit", method = RequestMethod.POST)
	public String serviceClient(@ModelAttribute("serviceEdit") ServiceDTO service, Model model) {
		ServiceWSService ser = new ServiceWSService();
		IServiceWS servicews = ser.getServiceWSPort();
			
		try {
			servicews.updateService(service);
		} catch (ServiceException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "editService";
		} 
		return "redirect:list";
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String listService(Model model) {
		ServiceWSService ser = new ServiceWSService();
		IServiceWS servicews = ser.getServiceWSPort();
		
		try {
			model.addAttribute("services", servicews.listServicesOfHotel(2L));
			model.addAttribute("error", "");
		} catch (HotelException_Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "listServices";
	}
	
	@RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
	public String editService(@PathVariable Long id, Model model) {
		ServiceWSService ser = new ServiceWSService();
		IServiceWS servicews = ser.getServiceWSPort();
		try {
			model.addAttribute("serviceEdit", servicews.listService(id));
			model.addAttribute("error", "");
		} catch (ServiceException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "listServices";
		}
		return "editService";
	}
	
	@RequestMapping(value="/desactivate/{id}", method = RequestMethod.GET)
	public String desactivateService(@PathVariable Long id, Model model) {
		ServiceWSService ser = new ServiceWSService();
		IServiceWS servicews = ser.getServiceWSPort();
		try {
			servicews.deleteService(id);
			model.addAttribute("error", "");
		} catch (ServiceException_Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "redirect:/services/list";
	}

}

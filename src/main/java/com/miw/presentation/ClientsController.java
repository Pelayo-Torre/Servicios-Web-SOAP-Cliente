package com.miw.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.webservice.ClientAddDTO;
import main.java.webservice.ClientDTO;
import main.java.webservice.ClientException_Exception;
import main.java.webservice.ClientWSService;
import main.java.webservice.HotelException_Exception;
import main.java.webservice.IClientWS;

@Controller
@RequestMapping("clients")
public class ClientsController {
	
	@ModelAttribute("client")
	public ClientAddDTO getClient() {
		return new ClientAddDTO();
	}
	
	@ModelAttribute("clientEdit")
	public ClientDTO getClientEdit() {
		return new ClientDTO();
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String addClient(Model model) {
		model.addAttribute("error", "");
		return "addClient";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addClient(@ModelAttribute("client") ClientAddDTO client, Model model) {
		ClientWSService service = new ClientWSService();
		IClientWS clientws = service.getClientWSPort();
		client.setIdHotel(2L);
				
		try {
			clientws.addClient(client);
		} catch (ClientException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addClient";
		} catch (HotelException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "addClient";
		}
		return "redirect:list";
	}
	
	@RequestMapping(value="/edit", method = RequestMethod.POST)
	public String editClient(@ModelAttribute("clientEdit") ClientDTO client, Model model) {
		ClientWSService service = new ClientWSService();
		IClientWS clientws = service.getClientWSPort();
			
		try {
			clientws.updateClient(client);
		} catch (ClientException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "editClient";
		} 
		return "redirect:list";
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String listClient(Model model) {
		ClientWSService service = new ClientWSService();
		IClientWS clientws = service.getClientWSPort();
		try {
			model.addAttribute("clients", clientws.listClientsOfHotel(2L));
			model.addAttribute("error", "");
		} catch (HotelException_Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "listClients";
	}
	
	@RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
	public String editClient(@PathVariable Long id, Model model) {
		ClientWSService service = new ClientWSService();
		IClientWS clientws = service.getClientWSPort();
		try {
			model.addAttribute("clientEdit", clientws.listClient(id));
			model.addAttribute("error", "");
		} catch (ClientException_Exception e) {
			model.addAttribute("error", e.getMessage());
			return "listClients";
		}
		return "editClient";
	}
	
	@RequestMapping(value="/desactivate/{id}", method = RequestMethod.GET)
	public String desactivateClient(@PathVariable Long id, Model model) {
		ClientWSService service = new ClientWSService();
		IClientWS clientws = service.getClientWSPort();
		try {
			clientws.deleteClient(id);
			model.addAttribute("error", "");
		} catch (ClientException_Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "redirect:/clients/list";
	}

}

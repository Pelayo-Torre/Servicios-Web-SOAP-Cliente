package com.miw.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.webservice.Client;
import main.java.webservice.ClientException_Exception;
import main.java.webservice.ClientWSService;
import main.java.webservice.Exception_Exception;
import main.java.webservice.IClientWS;

@Controller
@RequestMapping("clients")
public class ClientsController {
	
	@ModelAttribute("client")
	public Client getClient() {
		return new Client();
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addClient(@ModelAttribute("client") Client client) throws ClientException_Exception, Exception_Exception {
		ClientWSService service = new ClientWSService();
		IClientWS clientws = service.getClientWSPort();
		clientws.addClient(client);
		return "redirect:/clients/list";
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String listClient(Model model) throws ClientException_Exception, Exception_Exception {
		ClientWSService service = new ClientWSService();
		IClientWS clientws = service.getClientWSPort();
		model.addAttribute("clients", clientws.listClientsOfHotel(1L));
		return "listClients";
	}
	
	@RequestMapping(value="/edit", method = RequestMethod.PUT)
	public String editClient(Model model) throws ClientException_Exception, Exception_Exception {
		ClientWSService service = new ClientWSService();
		IClientWS clientws = service.getClientWSPort();
		model.addAttribute("clients", clientws.listClientsOfHotel(1L));
		return "listClients";
	}

}

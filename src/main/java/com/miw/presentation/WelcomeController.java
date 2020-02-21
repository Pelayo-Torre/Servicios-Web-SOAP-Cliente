package com.miw.presentation;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.webservice.Client;
import main.java.webservice.ClientException_Exception;
import main.java.webservice.ClientWSService;
import main.java.webservice.Exception_Exception;
import main.java.webservice.IClientWS;


@Controller
public class WelcomeController {
	
	/*
	 * Setting / as request mapping url we are setting the default controller for the application.
	 */
	@RequestMapping("/")
	public String welcome()
	{
		return "addClient";
	}
	
	@ModelAttribute("client")
	public Client getClient() {
		return new Client();
	}

}

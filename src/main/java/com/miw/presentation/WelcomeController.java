package com.miw.presentation;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import main.java.webservice.ClientAddDTO;


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
	public ClientAddDTO getClient() {
		return new ClientAddDTO();
	}

}

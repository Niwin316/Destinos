package com.edutecno.destinos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.edutecno.destinos.service.DestinoService;

@Controller
public class HomeController {

	@Autowired
	private DestinoService destinoService;

	@GetMapping({ "/", "home" })
	public ModelAndView clientes() {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("destinos", destinoService.findAll().getDestinos());
		return modelAndView;
	}

}

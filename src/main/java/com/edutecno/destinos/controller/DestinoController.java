package com.edutecno.destinos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.edutecno.destinos.modelo.Destino;
import com.edutecno.destinos.service.DestinoService;
import com.edutecno.destinos.service.PasajeroService;

@Controller
@RequestMapping("destinos")
public class DestinoController {

	@Autowired
	private DestinoService destinoService;

	@Autowired
	private PasajeroService pasajeroService;

	@GetMapping("/crear")
	public ModelAndView crear(Model model) {
		ModelAndView modelAndView = new ModelAndView("crear-destino");
		modelAndView.addObject("destino", new Destino());
		model.addAttribute("pasajero", pasajeroService.findAll().getPasajeros());
		return modelAndView;
	}

	@PostMapping("/agregar")
	public RedirectView crear(@ModelAttribute Destino destino) {
		destinoService.save(destino);
		return new RedirectView("/destinos");
	}

	@GetMapping
	public ModelAndView destinos(Model model) {
		ModelAndView modelAndView = new ModelAndView("destinos");
		modelAndView.addObject("destino", destinoService.findAll().getDestinos());
		return modelAndView;
	}

}

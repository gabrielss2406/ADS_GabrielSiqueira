package br.inatel.labs.padraomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloMvcController {

	@GetMapping("/hello")
	public String getHello(Model model) {
		String nomeUsuario = "Tiquinho Soares";
		model.addAttribute("usuario", nomeUsuario);
		return "minha_homepage";
	}
	
}

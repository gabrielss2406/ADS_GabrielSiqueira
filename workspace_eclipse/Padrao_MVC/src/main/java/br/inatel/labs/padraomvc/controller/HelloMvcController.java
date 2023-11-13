package br.inatel.labs.padraomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The HelloMvcController class handles requests for the "/hello" endpoint.
 * It provides a greeting message with a predefined user name.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
@Controller
public class HelloMvcController {

    /**
     * Handles GET requests for the "/hello" endpoint.
     * 
     * @param model the Model object for adding attributes
     * @return the view name ("minha_homepage")
     */
    @GetMapping("/hello")
    public String getHello(Model model) {
        String nomeUsuario = "Tiquinho Soares";
        model.addAttribute("usuario", nomeUsuario);
        return "minha_homepage";
    }

}

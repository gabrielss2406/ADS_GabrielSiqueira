package br.inatel.labs.padraomvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.inatel.labs.padraomvc.model.entity.Produto;
import br.inatel.labs.padraomvc.model.service.ProdutoService;

/**
 * The ProdutoController class handles requests for the "/produtos" endpoint.
 * It retrieves a list of products from the ProdutoService and adds it to the model.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	/**
	 * Handles GET requests for the "/produtos" endpoint.
	 * Retrieves a list of products from the ProdutoService and adds it to the model.
	 * 
	 * @param model the Model object for adding attributes
	 * @return the view name ("tabela_de_produtos")
	 */
	@GetMapping("/produtos")
	public String getProdutos(Model model) {
		List<Produto> listaProdutos = service.findAll();
		
		model.addAttribute("listaProdutos", listaProdutos);
		
		return "tabela_de_produtos";
	}
}

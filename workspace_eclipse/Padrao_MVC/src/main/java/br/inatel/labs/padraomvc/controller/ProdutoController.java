package br.inatel.labs.padraomvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.inatel.labs.padraomvc.model.entity.Produto;
import br.inatel.labs.padraomvc.model.service.ProdutoService;

@Controller
public class ProdutoController {
	@Autowired
	private ProdutoService service;
	
	@GetMapping("/produtos")
	public String getProdutos(Model model) {
		List<Produto> listaProdutos = service.findAll();
		
		model.addAttribute("listaProdutos", listaProdutos);
		
		return "tabela_de_produtos";
	}
}

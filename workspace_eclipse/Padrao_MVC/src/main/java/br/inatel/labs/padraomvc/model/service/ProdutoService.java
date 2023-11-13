package br.inatel.labs.padraomvc.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.inatel.labs.padraomvc.model.entity.Produto;
import jakarta.annotation.PostConstruct;

/**
 * The ProdutoService class provides business logic for managing products.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
@Service
public class ProdutoService {
    
    private List<Produto> listaProdutos = new ArrayList<Produto>();
    
    /**
     * Initializes the list of products with some sample data.
     */
    @PostConstruct
    public void setup() {
        Produto p1 = new Produto(1L, "Furadeira", 300.0);
        Produto p2 = new Produto(2L, "Furador", 200.0);
        Produto p3 = new Produto(3L, "Furão", 100.0);
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
    }
    
    /**
     * Retrieves the list of all products.
     *
     * @return the list of products
     */
    public List<Produto> findAll() {
        return this.listaProdutos;
    }
}

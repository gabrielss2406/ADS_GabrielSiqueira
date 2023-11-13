package br.inatel.labs.padraomvc.model.entity;

import java.util.Objects;

/**
 * The Produto class represents a product entity.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class Produto {
    
    private Long id;
    private String descricao;
    private Double preco;
    
    /**
     * Constructs a new Produto with the specified id, description, and price.
     *
     * @param id the unique identifier of the product
     * @param descricao the description of the product
     * @param preco the price of the product
     */
    public Produto(Long id, String descricao, Double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    /**
     * Generates a hash code value for the Produto based on its id.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Indicates whether some other object is equal to this Produto based on its id.
     *
     * @param obj the reference object with which to compare
     * @return true if this Produto is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        return Objects.equals(id, other.id);
    }

    /**
     * Gets the id of the product.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id of the product.
     *
     * @param id the new id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the description of the product.
     *
     * @return the description
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the description of the product.
     *
     * @param descricao the new description to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Gets the price of the product.
     *
     * @return the price
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * Sets the price of the product.
     *
     * @param preco the new price to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

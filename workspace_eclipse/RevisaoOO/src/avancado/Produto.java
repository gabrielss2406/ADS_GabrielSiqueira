package avancado;

/**
 * A classe Produto representa um produto com um identificador único (ID), uma descrição e um preço.
 */
public class Produto {
    private Long id;
    private String descricao;
    private Double preco;
    
    /**
     * Construtor para criar uma instância de Produto com o ID, a descrição e o preço especificados.
     *
     * @param id        O identificador único do produto.
     * @param descricao A descrição do produto.
     * @param preco     O preço do produto.
     */
    public Produto(Long id, String descricao, Double preco) {
        super();
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    /**
     * Obtém o identificador único do produto.
     *
     * @return O identificador único do produto.
     */
    public Long getId() {
        return id;
    }

    /**
     * Obtém a descrição do produto.
     *
     * @return A descrição do produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Obtém o preço do produto.
     *
     * @return O preço do produto.
     */
    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + "]";
    }
}

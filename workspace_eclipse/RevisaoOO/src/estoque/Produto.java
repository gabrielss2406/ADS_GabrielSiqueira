package estoque;

import java.time.LocalDate;

/**
 * A classe Produto representa um item em estoque.
 */
public class Produto {
    private String descricao;
    private Double valorCompra;
    private LocalDate dataValidade;

    /**
     * Obtém a descrição do produto.
     *
     * @return A descrição do produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do produto.
     *
     * @param descricao A nova descrição para o produto.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o valor de compra do produto.
     *
     * @return O valor de compra do produto.
     */
    public Double getValorCompra() {
        return valorCompra;
    }

    /**
     * Define o valor de compra do produto.
     *
     * @param valorCompra O novo valor de compra para o produto.
     */
    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    /**
     * Obtém a data de validade do produto.
     *
     * @return A data de validade do produto.
     */
    public LocalDate getDataValidade() {
        return dataValidade;
    }

    /**
     * Define a data de validade do produto.
     *
     * @param dataValidade A nova data de validade para o produto.
     */
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}

package esporte;

/**
 * A classe Atleta representa um atleta com informações adicionais, herdando de Pessoa.
 */
public class Atleta extends Pessoa {
    Integer peso;
    Boolean aposentado;

    /**
     * Construtor para criar uma nova instância de Atleta com informações básicas.
     *
     * @param nome       O nome do atleta.
     * @param idade      A idade do atleta.
     * @param peso       O peso do atleta.
     * @param aposentado Indica se o atleta está aposentado.
     */
    public Atleta(String nome, Integer idade, Integer peso, Boolean aposentado) {
        super(nome, idade);
        this.peso = peso;
        this.aposentado = aposentado;
    }

    /**
     * Executa o aquecimento do atleta.
     */
    void aquecer() {
        System.out.println("aquecendo");
    }

    /**
     * Aposenta o atleta, definindo seu estado de aposentado como verdadeiro.
     */
    void aposentar() {
        this.aposentado = true;
    }
}

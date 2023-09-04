package esporte;

/**
 * A classe Pessoa representa uma pessoa com nome e idade.
 */
public class Pessoa {
    String nome;
    Integer idade;

    /**
     * Construtor para criar uma nova instância de Pessoa com nome e idade.
     *
     * @param nome  O nome da pessoa.
     * @param idade A idade da pessoa.
     */
    public Pessoa(String nome, Integer idade) {
        super();
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Incrementa a idade da pessoa em um ano.
     */
    public void envelhecer() {
        this.idade++;
    }
}

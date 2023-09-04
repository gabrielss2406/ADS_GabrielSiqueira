package cidadania;

/**
 * A classe Pessoa representa uma pessoa com informações básicas de identidade.
 */
public class Pessoa {
    String nome;
    String sexo;
    Integer idade;

    /**
     * Construtor para criar uma nova instância de Pessoa com informações de nome, sexo e idade.
     *
     * @param nome  O nome da pessoa.
     * @param sexo  O sexo da pessoa.
     * @param idade A idade da pessoa.
     */
    public Pessoa(String nome, String sexo, Integer idade) {
        super();
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
}

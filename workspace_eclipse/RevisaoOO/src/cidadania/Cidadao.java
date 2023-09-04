package cidadania;

/**
 * A classe Cidadao representa uma pessoa com informações adicionais de cidadania, herdando de Pessoa.
 */
public class Cidadao extends Pessoa {
    String cpf;

    /**
     * Construtor para criar uma nova instância de Cidadao com informações de nome, sexo, idade e CPF.
     *
     * @param nome  O nome do cidadão.
     * @param sexo  O sexo do cidadão.
     * @param idade A idade do cidadão.
     * @param cpf   O CPF do cidadão.
     */
    public Cidadao(String nome, String sexo, Integer idade, String cpf) {
        super(nome, sexo, idade);
        this.cpf = cpf;
    }
}

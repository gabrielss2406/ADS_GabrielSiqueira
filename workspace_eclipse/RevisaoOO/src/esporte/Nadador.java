package esporte;

/**
 * A classe Nadador representa um atleta do tipo nadador, herdando de Atleta.
 */
public class Nadador extends Atleta {

    /**
     * Construtor para criar uma nova instância de Nadador com informações básicas.
     *
     * @param nome       O nome do nadador.
     * @param idade      A idade do nadador.
     * @param peso       O peso do nadador.
     * @param aposentado Indica se o nadador está aposentado.
     */
    public Nadador(String nome, Integer idade, Integer peso, Boolean aposentado) {
        super(nome, idade, peso, aposentado);
    }

    /**
     * Realiza a ação de nadar, indicando que o nadador está nadando.
     */
    void nadar() {
        System.out.println("Nadador nadando");
    }
}

package esporte;

/**
 * A classe Corredor representa um atleta do tipo corredor, herdando de Atleta.
 */
public class Corredor extends Atleta {

    /**
     * Construtor para criar uma nova instância de Corredor com informações básicas.
     *
     * @param nome       O nome do corredor.
     * @param idade      A idade do corredor.
     * @param peso       O peso do corredor.
     * @param aposentado Indica se o corredor está aposentado.
     */
    public Corredor(String nome, Integer idade, Integer peso, Boolean aposentado) {
        super(nome, idade, peso, aposentado);
    }

    /**
     * Realiza a ação de correr, indicando que o corredor está correndo.
     */
    void correr() {
        System.out.println("Corredor correndo");
    }
}

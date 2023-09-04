package esporte;

/**
 * A classe Ciclista representa um atleta do tipo ciclista, herdando de Atleta.
 */
public class Ciclista extends Atleta {

    /**
     * Construtor para criar uma nova instância de Ciclista com informações básicas.
     *
     * @param nome       O nome do ciclista.
     * @param idade      A idade do ciclista.
     * @param peso       O peso do ciclista.
     * @param aposentado Indica se o ciclista está aposentado.
     */
    public Ciclista(String nome, Integer idade, Integer peso, Boolean aposentado) {
        super(nome, idade, peso, aposentado);
    }

    /**
     * Realiza a ação de pedalar, indicando que o ciclista está pedalando.
     */
    void pedalar() {
        System.out.println("Ciclista pedalando");
    }
}

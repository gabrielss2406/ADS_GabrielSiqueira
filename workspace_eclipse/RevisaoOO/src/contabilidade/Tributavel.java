package contabilidade;

/**
 * A interface Tributavel define os métodos para cálculo de impostos relacionados a uma entidade.
 */
public interface Tributavel {

    /**
     * Obtém o valor do Imposto de Renda (IR) associado à entidade.
     *
     * @return O valor do Imposto de Renda (IR).
     */
    Double getValorIR();

    /**
     * Obtém o valor do Imposto sobre Serviços (ISS) associado à entidade.
     *
     * @return O valor do Imposto sobre Serviços (ISS).
     */
    Double getValorISS();
}

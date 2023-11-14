package strategy.impostos;

/**
 * The ImpostoICMS class represents a tax calculation based on the ICMS (Imposto sobre Circulação de Mercadorias e Serviços) system.
 * It applies a fixed tax rate to the total value of a given invoice.
 * 
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class ImpostoICMS implements Tributavel {
    
    private static final double ALIQUOTA_ICMS = 0.10;

    /**
     * Calculates the ICMS tax based on the given total value of the invoice.
     * 
     * @param valorTotalNF the total value of the invoice
     * @return the calculated ICMS tax amount
     */
    @Override
    public double calcularImposto(double valorTotalNF) {
        return valorTotalNF * ALIQUOTA_ICMS;
    }
}

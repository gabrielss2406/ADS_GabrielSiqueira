package strategy.impostos;

/**
 * The ImpostoISS class represents a tax calculation based on the ISS (Imposto sobre Serviços) system.
 * It applies a fixed tax rate to the total value of a given invoice.
 * 
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class ImpostoISS implements Tributavel {
    
    private static final double ALIQUOTA_ISS = 0.02;

    /**
     * Calculates the ISS tax based on the given total value of the invoice.
     * 
     * @param valorTotalNF the total value of the invoice
     * @return the calculated ISS tax amount
     */
    @Override
    public double calcularImposto(double valorTotalNF) {
        return valorTotalNF * ALIQUOTA_ISS;
    }
}

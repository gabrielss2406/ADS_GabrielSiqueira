package strategy.impostos;

/**
 * The ImpostoIVA class represents a tax calculation based on the IVA (Imposto sobre o Valor Adicionado) system.
 * It applies a fixed tax rate to the total value of a given invoice.
 * 
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class ImpostoIVA implements Tributavel {
    
    private static final double ALIQUOTA_IVA = 0.05;

    /**
     * Calculates the IVA tax based on the given total value of the invoice.
     * 
     * @param valorTotalNF the total value of the invoice
     * @return the calculated IVA tax amount
     */
    @Override
    public double calcularImposto(double valorTotalNF) {
        return valorTotalNF * ALIQUOTA_IVA;
    }
}

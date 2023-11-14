package strategy.impostos;

/**
 * The Tributavel interface represents items that can be taxed.
 * It defines a method to calculate the tax based on the total value of the item.
 * 
 * @author Gabriel Siqueira
 * @version 1.0
 */
public interface Tributavel {

    /**
     * Calculates the tax based on the total value of the item.
     * 
     * @param valorTotalNF the total value of the item
     * @return the calculated tax
     */
    double calcularImposto(double valorTotalNF);
}

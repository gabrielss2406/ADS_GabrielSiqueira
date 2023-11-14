package stategy.frete;

/**
 * The ServicoFreteDHL class represents a shipping service implementation for DHL.
 * 
 * This implementation calculates the freight cost based on the weight of the package.
 * 
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class ServicoFreteDHL implements Fretavel {

    /**
     * Calculates the freight cost based on the weight of the package for DHL.
     * 
     * @param pesoEmKg The weight of the package in kilograms.
     * @return The calculated freight cost.
     */
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 20.0) {
            return 100.00;
        } else {
            return 190.00;
        }
    }
}

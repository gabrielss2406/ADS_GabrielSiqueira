package stategy.frete;

/**
 * The ServicoFreteFedEx class represents a shipping service implementation for FedEx.
 * 
 * This implementation calculates the freight cost based on the weight of the package.
 * 
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class ServicoFreteFedEx implements Fretavel {

    /**
     * Calculates the freight cost based on the weight of the package for FedEx.
     * 
     * @param pesoEmKg The weight of the package in kilograms.
     * @return The calculated freight cost.
     */
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 20.0) {
            return 0.00;
        } else if (pesoEmKg < 40.0) {
            return 45.00;
        } else {
            return 75.00;
        }
    }
}

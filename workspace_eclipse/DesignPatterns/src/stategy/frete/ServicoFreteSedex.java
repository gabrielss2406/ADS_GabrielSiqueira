package stategy.frete;

/**
 * The ServicoFreteSedex class represents a shipping service implementation for Sedex.
 * 
 * This implementation calculates the freight cost based on the weight of the package.
 * 
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class ServicoFreteSedex implements Fretavel {

    /**
     * Calculates the freight cost based on the weight of the package for Sedex.
     * 
     * @param pesoEmKg The weight of the package in kilograms.
     * @return The calculated freight cost.
     */
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 10.0) {
            return 50.00;
        } else if (pesoEmKg < 20.00) {
            return 70.00;
        } else {
            return 90.00;
        }
    }
}

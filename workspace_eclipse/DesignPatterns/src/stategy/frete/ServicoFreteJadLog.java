package stategy.frete;

/**
 * The ServicoFreteJadLog class represents a shipping service implementation for JadLog.
 * 
 * This implementation calculates the freight cost based on the weight of the package.
 * 
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class ServicoFreteJadLog implements Fretavel {

    /**
     * Calculates the freight cost based on the weight of the package for JadLog.
     * 
     * @param pesoEmKg The weight of the package in kilograms.
     * @return The calculated freight cost.
     */
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 30.0) {
            return 0.00;
        } else {
            return 150.00;
        }
    }
}

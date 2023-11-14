package stategy.frete;

/**
 * The Fretavel interface defines the contract for classes that represent shipping services.
 * 
 * Implementing classes must provide a method to calculate the freight cost based on the weight of the package.
 * 
 * @author Gabriel Siqueira
 * @version 1.0
 */
public interface Fretavel {

    /**
     * Calculates the freight cost based on the weight of the package.
     * 
     * @param pesoEmKg The weight of the package in kilograms.
     * @return The calculated freight cost.
     */
    double calcularValor(double pesoEmKg);
}

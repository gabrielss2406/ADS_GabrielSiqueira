package stategy.frete;

/**
 * The CalculadoraFrete class is responsible for calculating the freight value based on the chosen strategy.
 *
 * This class utilizes the strategy pattern, where different implementations of the Fretavel interface can be
 * injected to provide different freight calculation strategies.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class CalculadoraFrete {

    /**
     * Calculates the freight value using the specified Fretavel implementation and weight in kilograms.
     *
     * @param fretavel  the strategy for calculating freight
     * @param pesoEmKg  the weight in kilograms
     * @return the calculated freight value
     */
    public double calcularValor(Fretavel fretavel, double pesoEmKg) {
        return fretavel.calcularValor(pesoEmKg);
    }
}

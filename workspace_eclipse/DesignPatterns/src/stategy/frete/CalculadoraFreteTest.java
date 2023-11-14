package stategy.frete;

import org.junit.jupiter.api.Test;

/**
 * The CalculadoraFreteTest class contains test cases for the freight calculation using different shipping services.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class CalculadoraFreteTest {

    /**
     * Tests the freight calculation for the DHL shipping service.
     */
    @Test
    public void deveCalcularFreteParaDHL() {
        CalculadoraFrete calc = new CalculadoraFrete();
        Fretavel frete = new ServicoFreteDHL();

        double value1 = calc.calcularValor(frete, 0);
        assert (value1 == 100.00);

        double value2 = calc.calcularValor(frete, 30);
        assert (value2 == 190.00);
    }

    /**
     * Tests the freight calculation for the Sedex shipping service.
     */
    @Test
    public void deveCalcularFreteParaSedex() {
        CalculadoraFrete calc = new CalculadoraFrete();
        Fretavel frete = new ServicoFreteSedex();

        double value1 = calc.calcularValor(frete, 0);
        assert (value1 == 50.00);

        double value2 = calc.calcularValor(frete, 15);
        assert (value2 == 70.00);

        double value3 = calc.calcularValor(frete, 30);
        assert (value3 == 90.00);
    }

    /**
     * Tests the freight calculation for the JadLog shipping service.
     */
    @Test
    public void deveCalcularFreteParaJadLog() {
        CalculadoraFrete calc = new CalculadoraFrete();
        Fretavel frete = new ServicoFreteJadLog();

        double value1 = calc.calcularValor(frete, 0);
        assert (value1 == 0.00);

        double value2 = calc.calcularValor(frete, 40);
        assert (value2 == 150.00);
    }

    /**
     * Tests the freight calculation for the FedEx shipping service.
     */
    @Test
    public void deveCalcularFreteParaFedEx() {
        CalculadoraFrete calc = new CalculadoraFrete();
        Fretavel frete = new ServicoFreteFedEx();

        double value1 = calc.calcularValor(frete, 0);
        assert (value1 == 0.00);

        double value2 = calc.calcularValor(frete, 40);
        assert (value2 == 75.00);
    }
}

package builder;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * The CarroBuilderFluenteTest class contains test cases for the CarroBuilderFluente class.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class CarroBuilderFluenteTest {

    /**
     * Tests the construction of a car with valid parts using the CarroBuilderFluente.
     */
    @Test
    public void dadoPartesValida_quantoGetCarro_entaoCarroEhConstruido() {
        // partes validas
        Motor motor = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = { portaMotorista, portaPassageiro };
        ComputadorBordo computadorBordo = new ComputadorBordo();
        FreioABS freioABS = new FreioABS();

        // construindo de maneira fluente
        Carro carroPronto = new CarroBuilderFluente()
                .buildPortas(portas)
                .buildMotor(motor)
                .buildComputadorBordo(computadorBordo)
                .buildFreioABS(freioABS)
                .getCarro();

        // asserts
        assertNotNull(carroPronto);
        assertNotNull(carroPronto.getPortas());
        assertNotNull(carroPronto.getMotor());
        assertNotNull(carroPronto.getComputadorBordo());
        assertNotNull(carroPronto.getFreioABS());
        assertTrue(carroPronto.getPortas().length == 2);
    }
}

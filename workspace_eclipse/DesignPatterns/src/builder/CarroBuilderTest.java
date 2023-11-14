package builder;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * The CarroBuilderTest class contains test cases for the CarroBuilder class.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class CarroBuilderTest {

    /**
     * Tests the construction of a car with valid parts using the CarroBuilder.
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

        // invocando builder
        CarroBuilder carroBuilder = new CarroBuilder();
        carroBuilder.buildMotor(motor);
        carroBuilder.buildPortas(portas);
        carroBuilder.buildComputadorBordo(computadorBordo);
        carroBuilder.buildFreioABS(freioABS);

        Carro carroPronto = carroBuilder.getCarro();

        // asserts
        assertNotNull(carroPronto);
        assertNotNull(carroPronto.getPortas());
        assertNotNull(carroPronto.getMotor());
        assertNotNull(carroPronto.getComputadorBordo());
        assertNotNull(carroPronto.getFreioABS());
        assertTrue(carroPronto.getPortas().length == 2);
    }

    /**
     * Tests the construction of a car without a motor using the CarroBuilder.
     */
    @Test
    public void dadoPartesValida_quantoGetCarro_semMotor() {
        // partes validas
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = { portaMotorista, portaPassageiro };
        ComputadorBordo computadorBordo = new ComputadorBordo();
        FreioABS freioABS = new FreioABS();

        // invocando builder
        CarroBuilder carroBuilder = new CarroBuilder();
        carroBuilder.buildPortas(portas);
        carroBuilder.buildComputadorBordo(computadorBordo);
        carroBuilder.buildFreioABS(freioABS);

        Carro carroPronto = carroBuilder.getCarro();

        // asserts
        assertNotNull(carroPronto);
        assertNotNull(carroPronto.getPortas());
        assertNotNull(carroPronto.getMotor());
        assertNotNull(carroPronto.getComputadorBordo());
        assertNotNull(carroPronto.getFreioABS());
        assertTrue(carroPronto.getPortas().length == 2);
    }
}

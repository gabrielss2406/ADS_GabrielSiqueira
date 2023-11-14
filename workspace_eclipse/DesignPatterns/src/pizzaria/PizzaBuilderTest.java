package pizzaria;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * The PizzaBuilderTest class contains unit tests for the PizzaBuilder class.
 *
 * It tests the construction of Pizza objects using the PizzaBuilder, ensuring that pizzas are built correctly and
 * validating that exceptions are thrown for invalid input.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class PizzaBuilderTest {

    /**
     * Tests constructing a pizza with valid parameters.
     */
    @Test
    public void dadoPartesValidas_quandoGetPizza_entaoPizzaEhConstruida() {
        // Build a pizza with valid parameters
        Pizza pizzaPronta = new PizzaBuilder()
                .addCheese()
                .addPeperoni()
                .defineSize(1)
                .getPizza();

        // Asserts
        assertNotNull(pizzaPronta);
        assertTrue(pizzaPronta.getSize() >= 1 && pizzaPronta.getSize() <= 3);
        assertTrue(pizzaPronta.getFlagCheese());
        assertTrue(pizzaPronta.getFlagPeperoni());
    }

    /**
     * Tests constructing a pizza with an invalid size, expecting an exception to be thrown.
     */
    @Test
    public void dadoPizzaComTamanhoInvalido_quantoGetPizza_entaoLancaException() {
        // Attempt to build a pizza with an invalid size
        Integer tamanhoInvalido = 4;

        // Asserts that an exception is thrown
        assertThrows(IllegalStateException.class, () -> {
            Pizza pizzaPronta = new PizzaBuilder()
                    .addCheese()
                    .addPeperoni()
                    .defineSize(tamanhoInvalido)
                    .getPizza();
        });
    }

    /**
     * Tests constructing a pizza without any ingredients, expecting an exception to be thrown.
     */
    @Test
    public void dadoPizzaSemIngrediente_quantoGetPizza_entaoLancaException() {
        // Attempt to build a pizza without any ingredients
        // Asserts that an exception is thrown
        assertThrows(IllegalStateException.class, () -> {
            Pizza pizzaPronta = new PizzaBuilder()
                    .defineSize(1)
                    .getPizza();
        });
    }
}

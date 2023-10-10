package pizzaria;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PizzaBuilderTest {
	@Test
	public void dadoPartesValidas_quandoGetPizza_entaoPizzaEhConstruida() {
		Pizza pizzaPronta = new PizzaBuilder()
				.addCheese()
				.addPeperoni()
				.defineSize(1)
				.getPizza();
		
		assertNotNull(pizzaPronta);
		assertTrue(pizzaPronta.getSize() >= 1 && pizzaPronta.getSize() <= 3);
		assertTrue(pizzaPronta.getFlagCheese());
		assertTrue(pizzaPronta.getFlagPeperoni());
	}

	@Test
	public void dadoPizzaComTamanhoInvalido_quantoGetPizza_entaoLancaException() {
		Integer tamanhoInvalido = 4;
		
		assertThrows(IllegalStateException.class, () -> {
			Pizza pizzaPronta = new PizzaBuilder()
					.addCheese()
					.addPeperoni()
					.defineSize(tamanhoInvalido)
					.getPizza();
		});
	}
	
	@Test
	public void dadoPizzaSemIngrediente_quantoGetPizza_entaoLancaException() {
		assertThrows(IllegalStateException.class, () -> {
			Pizza pizzaPronta = new PizzaBuilder()
					.defineSize(1)
					.getPizza();
		});
	}
}
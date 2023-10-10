package pizzaria;

public class PizzaBuilder {
	private Pizza pizza = new Pizza();
	
	public PizzaBuilder addCheese() {
		pizza.setFlagCheese(true);
		return this;
	}
	public PizzaBuilder addPeperoni() {
		pizza.setFlagPeperoni(true);
		return this;
	}
	public PizzaBuilder defineSize(Integer s) {
		pizza.setSize(s);
		return this;
	}
	
	private void validateSize() {
		if (pizza.getSize() < 1 || pizza.getSize() > 3)
			throw new IllegalStateException("Tamanho deve ser de 1 a 3");
	}
	private void validateIngredients() {
		if(!pizza.getFlagCheese() && !pizza.getFlagPeperoni())
			throw new IllegalStateException("Não foi adicionado ingredientes");
	}
	
	public Pizza getPizza() {
		validateSize();
		validateIngredients();
		return pizza;
	}
}

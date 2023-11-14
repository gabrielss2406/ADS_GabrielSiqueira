package pizzaria;

/**
 * The PizzaBuilder class provides a fluent interface to build Pizza objects with customizable options.
 *
 * It allows adding cheese, adding peperoni, and defining the size of the pizza.
 *
 * The builder performs validation to ensure that the size is between 1 and 3 and at least one ingredient is added.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class PizzaBuilder {

    private Pizza pizza = new Pizza();

    /**
     * Adds cheese to the pizza.
     *
     * @return the PizzaBuilder instance for method chaining
     */
    public PizzaBuilder addCheese() {
        pizza.setFlagCheese(true);
        return this;
    }

    /**
     * Adds peperoni to the pizza.
     *
     * @return the PizzaBuilder instance for method chaining
     */
    public PizzaBuilder addPeperoni() {
        pizza.setFlagPeperoni(true);
        return this;
    }

    /**
     * Defines the size of the pizza.
     *
     * @param s the size to set for the pizza
     * @return the PizzaBuilder instance for method chaining
     */
    public PizzaBuilder defineSize(Integer s) {
        pizza.setSize(s);
        return this;
    }

    /**
     * Validates that the size is between 1 and 3.
     *
     * @throws IllegalStateException if the size is not between 1 and 3
     */
    private void validateSize() {
        if (pizza.getSize() < 1 || pizza.getSize() > 3)
            throw new IllegalStateException("Tamanho deve ser de 1 a 3");
    }

    /**
     * Validates that at least one ingredient is added.
     *
     * @throws IllegalStateException if no ingredient is added
     */
    private void validateIngredients() {
        if (!pizza.getFlagCheese() && !pizza.getFlagPeperoni())
            throw new IllegalStateException("Não foi adicionado ingredientes");
    }

    /**
     * Gets the constructed Pizza object, performing validation before returning.
     *
     * @return the constructed Pizza object
     * @throws IllegalStateException if validation fails
     */
    public Pizza getPizza() {
        validateSize();
        validateIngredients();
        return pizza;
    }
}

package pizzaria;

/**
 * The Pizza class represents a pizza with customizable options such as size, cheese, and peperoni.
 *
 * It provides methods to get and set the size, cheese flag, and peperoni flag for the pizza.
 *
 * The size attribute can have values 1, 2, or 3.
 * The flagCheese attribute indicates whether the pizza has cheese.
 * The flagPeperoni attribute indicates whether the pizza has peperoni.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class Pizza {

    private Integer size = 0; // valores: 1, 2 ou 3
    private Boolean flagCheese = false;
    private Boolean flagPeperoni = false;

    /**
     * Gets the size of the pizza.
     *
     * @return the size of the pizza
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the size of the pizza.
     *
     * @param size the size to set for the pizza
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Checks if the pizza has cheese.
     *
     * @return true if the pizza has cheese, false otherwise
     */
    public Boolean getFlagCheese() {
        return flagCheese;
    }

    /**
     * Sets the flag indicating whether the pizza has cheese.
     *
     * @param flagCheese the flag indicating whether the pizza has cheese
     */
    public void setFlagCheese(Boolean flagCheese) {
        this.flagCheese = flagCheese;
    }

    /**
     * Checks if the pizza has peperoni.
     *
     * @return true if the pizza has peperoni, false otherwise
     */
    public Boolean getFlagPeperoni() {
        return flagPeperoni;
    }

    /**
     * Sets the flag indicating whether the pizza has peperoni.
     *
     * @param flagPeperoni the flag indicating whether the pizza has peperoni
     */
    public void setFlagPeperoni(Boolean flagPeperoni) {
        this.flagPeperoni = flagPeperoni;
    }
}

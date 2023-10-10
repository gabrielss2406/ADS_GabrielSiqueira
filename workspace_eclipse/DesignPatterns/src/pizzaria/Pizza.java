package pizzaria;

public class Pizza {
	private Integer size = 0; // valores: 1, 2 ou 3
	private Boolean flagCheese = false;
	private Boolean flagPeperoni = false;
	
	// GETTERS E SETTERS
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Boolean getFlagCheese() {
		return flagCheese;
	}
	public void setFlagCheese(Boolean flagCheese) {
		this.flagCheese = flagCheese;
	}
	public Boolean getFlagPeperoni() {
		return flagPeperoni;
	}
	public void setFlagPeperoni(Boolean flagPeperoni) {
		this.flagPeperoni = flagPeperoni;
	}
}

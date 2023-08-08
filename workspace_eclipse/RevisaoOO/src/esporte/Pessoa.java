package esporte;

public class Pessoa {
	String nome;
	Integer idade;
	
	// Generate with constructor generator (Ctrl+3)
	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void envelhecer() {
		this.idade++;
	}
}

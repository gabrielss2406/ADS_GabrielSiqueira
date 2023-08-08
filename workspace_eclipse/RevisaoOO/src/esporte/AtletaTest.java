package esporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AtletaTest {

	@Test
	void testConstructor() {
		// Generated the left side with Ctrl+1
		Pessoa pessoa = new Pessoa("Edson", 121);
		
		System.out.println(pessoa.nome);
		System.out.println(pessoa.idade);
		
		Atleta atleta = new Atleta("Edson", 21, 80, false);
		System.out.println(atleta.nome);
		System.out.println(atleta.idade);
		System.out.println(atleta.peso);
		System.out.println(atleta.aposentado);
	}
	
	@Test
	void testNadador() {
		Nadador nadador = new Nadador("Gustavo", 35, 90, false);
		nadador.nadar();
		
		nadador.envelhecer();
		System.out.println(nadador.idade);
		
		nadador.aposentar();
		System.out.println(nadador.aposentado);
	}
	
	@Test
	void testCiclista() {
		Ciclista ciclista = new Ciclista("Tiago", 44, 85, false);
		System.out.println("Está aposentado");
		if(ciclista.aposentado) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		
		ciclista.pedalar();
		ciclista.envelhecer();
		ciclista.aposentar();
		System.out.println("Agora ja esta aposentado!");
		System.out.println(ciclista.aposentado ? "Sim" : "Não");
	}

}

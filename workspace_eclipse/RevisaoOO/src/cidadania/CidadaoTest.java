package cidadania;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class CidadaoTest {

	@Test
	void testCidadao() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o nome: ");
		String nome = scanner.nextLine();
		System.out.println("Entre com o sexo: ");
		String sexo = scanner.nextLine();
		System.out.println("Entre com a idade: ");
		Integer idade = scanner.nextInt();
		System.out.println("Entre com o CPF: ");
		scanner.nextLine(); // Debug scanner
		String cpf = scanner.nextLine();
		
		scanner.close();
		
		Cidadao cidadao = new Cidadao(nome,sexo,idade,cpf);
		System.out.println(cidadao.nome);
		System.out.println(cidadao.sexo);
		System.out.println(cidadao.idade);
		System.out.println(cidadao.cpf);
	}

}

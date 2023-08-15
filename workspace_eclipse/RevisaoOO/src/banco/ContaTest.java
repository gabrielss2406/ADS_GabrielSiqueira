package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaTest {
	
	@Test
	void testContaCorrente() {
		Conta cc = new ContaCorrente();
		cc.depositar(110.0);
		cc.sacar(10.0);
		cc.rentabilizar();
		
		Double saldoAtual = cc.saldo;
		Double saldoEsperado = 101.0;
		
		assertEquals(saldoAtual, saldoEsperado);
	}
	
	@Test
	void testContaPoupanca() {
		Conta cp = new ContaPoupanca();
		cp.depositar(1100.0);
		cp.sacar(100.0);
		cp.rentabilizar();
		
		Double saldoAtual = cp.saldo;
		Double saldoEsperado = 1020.0;
		
		assertEquals(saldoAtual, saldoEsperado);
	}

	@Test
	void testPolimorfismo() {
		// Este flag define qual sera a instancia da conta
		boolean flagContaCorrenteComoDefault = true;
		
		Conta conta = null;
		if(flagContaCorrenteComoDefault) {
			conta = new ContaCorrente();
		}
	}
	
	@Test
	void testConta_toSring() {
		Conta conta = new ContaCorrente();
		conta.depositar(100.0);
		conta.sacar(10.0);
		
		String str = conta.toString();
		
		System.out.println(str);
	}
}

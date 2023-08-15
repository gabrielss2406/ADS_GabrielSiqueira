package contabilidade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContabilidadeTest {

	@Test
	void testEmpresaMEI() {
		EmpresaMEI empresa = new EmpresaMEI(1000.0);
		
		System.out.println("valor IR: " + empresa.getValorIR());
		System.out.println("valor ISS:" + empresa.getValorISS());
	}
	
	@Test
	void testEmpresaSimples() {
		EmpresaSimples empresa = new EmpresaSimples(1000.0);
		
		System.out.println("valor IR: " + empresa.getValorIR());
		System.out.println("valor ISS:" + empresa.getValorISS());
	}
}

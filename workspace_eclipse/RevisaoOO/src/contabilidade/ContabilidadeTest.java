package contabilidade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContabilidadeTest {

	@Test
	void testEmpresaMEI() {
		EmpresaMEI empresa = new EmpresaMEI(1000.0);
		Double esperadoIR = 275.0;
		Double esperadoISS = 0.0;
		
		assertEquals(empresa.getValorIR(), esperadoIR);
		assertEquals(empresa.getValorISS(), esperadoISS);
	}
	
	@Test
	void testEmpresaSimples() {
		EmpresaSimples empresa = new EmpresaSimples(1000.0);
		Double esperadoIR = 150.0;
		Double esperadoISS = 80.0;
		
		assertEquals(empresa.getValorIR(), esperadoIR);
		assertEquals(empresa.getValorISS(), esperadoISS);
	}
}

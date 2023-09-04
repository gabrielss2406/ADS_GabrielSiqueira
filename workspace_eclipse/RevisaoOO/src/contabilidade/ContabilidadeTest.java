package contabilidade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Classe de teste para as classes relacionadas à contabilidade.
 */
class ContabilidadeTest {

    /**
     * Testa os cálculos de impostos para uma Empresa MEI.
     */
    @Test
    void testEmpresaMEI() {
        EmpresaMEI empresa = new EmpresaMEI(1000.0);
        Double esperadoIR = 275.0;
        Double esperadoISS = 0.0;
        
        assertEquals(empresa.getValorIR(), esperadoIR);
        assertEquals(empresa.getValorISS(), esperadoISS);
    }
    
    /**
     * Testa os cálculos de impostos para uma Empresa Simples.
     */
    @Test
    void testEmpresaSimples() {
        EmpresaSimples empresa = new EmpresaSimples(1000.0);
        Double esperadoIR = 150.0;
        Double esperadoISS = 80.0;
        
        assertEquals(empresa.getValorIR(), esperadoIR);
        assertEquals(empresa.getValorISS(), esperadoISS);
    }
}

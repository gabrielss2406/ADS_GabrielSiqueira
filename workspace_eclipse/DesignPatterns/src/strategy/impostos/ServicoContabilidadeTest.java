package strategy.impostos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * The ServicoContabilidadeTest class contains test cases for the totalization of taxes in a given invoice.
 * 
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class ServicoContabilidadeTest {

    /**
     * Tests the totalization of taxes in a given invoice.
     */
    @Test
    void deveTotalizarImpostosDaNotaFiscal() {
        NotaFiscal nf = new NotaFiscal(1L, LocalDate.of(2023, Month.OCTOBER, 24), 1000.0);

        ReceitaFederal rf = new ReceitaFederal();
        List<Tributavel> impostosVigentes = rf.buscarListaImpostosVigentes();

        ServicoContabilidade sc = new ServicoContabilidade();
        double impostosTotalizados = sc.totalizarImpostos(nf, impostosVigentes);

        double impostosTotalizadosEsperado = 170.0;

        assertEquals(impostosTotalizados, impostosTotalizadosEsperado);
    }
}

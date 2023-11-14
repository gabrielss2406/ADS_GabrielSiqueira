package strategy.impostos;

import java.util.List;

/**
 * The ServicoContabilidade class provides services related to accounting, including the calculation of total taxes for a given invoice.
 * It includes a method to calculate the total taxes based on a provided invoice and a list of currently applicable taxes.
 * 
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class ServicoContabilidade {

    /**
     * Calculates the total taxes for a given invoice.
     * 
     * @param nf                   the invoice for which taxes need to be calculated
     * @param listaImpostosVigentes the list of currently applicable taxes
     * @return the total amount of taxes for the given invoice
     */
    double totalizarImpostos(NotaFiscal nf, List<Tributavel> listaImpostosVigentes) {
        double valorTotalNF = nf.getValorTotal();

        return listaImpostosVigentes.stream()
                .map(t -> t.calcularImposto(valorTotalNF))
                .reduce(0.00, Double::sum);
    }
}

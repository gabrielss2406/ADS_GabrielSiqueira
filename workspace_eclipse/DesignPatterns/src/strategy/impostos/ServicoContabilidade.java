package strategy.impostos;

import java.util.List;

public class ServicoContabilidade {
	double totalizarImpostos(NotaFiscal nf, List<Tributavel> listaImpostosVigentes) {
		double valorTotalNF = nf.getValorTotal();
		
		return listaImpostosVigentes.stream()
				.map(t -> t.calcularImposto(valorTotalNF))
				.reduce(0.00, Double::sum);
	}
}

package strategy.impostos;

import java.util.List;

public class ReceitaFederal {
	List<Tributavel> buscarListaImpostosVigentes(){
		return List.of(
				new ImpostoISS(),
				new ImpostoICMS(),
				new ImpostoIVA());
	}
}

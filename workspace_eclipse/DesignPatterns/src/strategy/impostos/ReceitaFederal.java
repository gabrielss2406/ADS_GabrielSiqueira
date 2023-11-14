package strategy.impostos;

import java.util.List;

/**
 * The ReceitaFederal class represents the tax authority that provides a list of current taxes.
 * It includes a method to retrieve a list of currently applicable taxes.
 * 
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class ReceitaFederal {

    /**
     * Retrieves a list of currently applicable taxes.
     * 
     * @return the list of currently applicable taxes
     */
    List<Tributavel> buscarListaImpostosVigentes() {
        return List.of(
                new ImpostoISS(),
                new ImpostoICMS(),
                new ImpostoIVA());
    }
}

package avancado;

import java.util.Comparator;

/**
 * Classe que implementa um comparador personalizado para comparar objetos da classe Animal com base em seus nomes.
 */
public class ComparadorPorNome implements Comparator<Animal> {
    
    /**
     * Compara dois objetos da classe Animal com base em seus nomes.
     *
     * @param a1 O primeiro animal a ser comparado.
     * @param a2 O segundo animal a ser comparado.
     * @return Um valor negativo se o nome de "a1" vier antes de "a2" na ordem alfabética,
     *         um valor positivo se o nome de "a1" vier depois de "a2" e 0 se os nomes forem iguais.
     */
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getNome().compareTo(a2.getNome());
    }
}

package avancado;

import java.util.Comparator;

/**
 * Classe que implementa um comparador personalizado para comparar objetos da classe Animal com base em seus IDs.
 */
public class ComparadorPorId implements Comparator<Animal> {
    
    /**
     * Compara dois objetos da classe Animal com base em seus IDs.
     *
     * @param a1 O primeiro animal a ser comparado.
     * @param a2 O segundo animal a ser comparado.
     * @return Um valor negativo se o ID de "a1" for menor que o ID de "a2",
     *         um valor positivo se o ID de "a1" for maior que o ID de "a2" e 0 se os IDs forem iguais.
     */
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getId().compareTo(a2.getId());
    }
}

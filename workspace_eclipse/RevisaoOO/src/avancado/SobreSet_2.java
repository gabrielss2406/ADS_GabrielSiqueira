package avancado;

import java.util.Set;
import java.util.TreeSet;

/**
 * Exemplo de uso de conjuntos (Set) em Java com strings utilizando a implementação TreeSet.
 */
public class SobreSet_2 {

    public static void main(String[] args) {
        // Criando um conjunto de frutas usando a implementação TreeSet
        Set<String> setDeFrutas = new TreeSet<>();

        // Adicionando frutas ao conjunto
        setDeFrutas.add("Laranja");
        setDeFrutas.add("Pera");
        setDeFrutas.add("Manga");
        setDeFrutas.add("Limão");
        
        // Imprimindo o conjunto de frutas (ordenado)
        System.out.println(setDeFrutas);
    }
}

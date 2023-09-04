package avancado;

import java.util.HashSet;
import java.util.Set;

/**
 * Exemplo de uso de conjuntos (Set) em Java com strings utilizando a implementação HashSet.
 */
public class SobreSet_1 {
    public static void main(String[] args) {
        // Criando um conjunto de frutas usando a implementação HashSet
        Set<String> setDeFrutas = new HashSet<>();

        // Adicionando frutas ao conjunto
        setDeFrutas.add("Laranja");
        setDeFrutas.add("Pera");
        setDeFrutas.add("Manga");
        setDeFrutas.add("Limão");
        
        // Imprimindo o conjunto de frutas (não ordenado)
        System.out.println(setDeFrutas);
    }
}

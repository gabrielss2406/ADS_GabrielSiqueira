package avancado;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Exemplo de uso de conjuntos (Set) em Java com objetos personalizados.
 */
public class SobreSet_3 {

    public static void main(String[] args) {
        // Criando um conjunto de animais usando a implementação HashSet
        Set<Animal> setDeAnimais = new HashSet<>();

        // Adicionando animais ao conjunto
        setDeAnimais.add(new Animal(1L, "Tartaruga"));
        setDeAnimais.add(new Animal(2L, "Coelho"));
        setDeAnimais.add(new Animal(3L, "Cachorro"));
        setDeAnimais.add(new Animal(4L, "Gato"));
        setDeAnimais.add(new Animal(2L, "Coelho")); // Duplicado (mesmo ID)

        // Iterando e imprimindo os animais no conjunto
        setDeAnimais.forEach(System.out::println);
    }
}

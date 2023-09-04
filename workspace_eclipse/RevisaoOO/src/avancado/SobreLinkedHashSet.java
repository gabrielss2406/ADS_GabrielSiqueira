package avancado;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Exemplo de uso de um LinkedHashSet para armazenar objetos da classe Animal.
 */
public class SobreLinkedHashSet {

    public static void main(String[] args) {
        // Criando um conjunto (Set) de objetos da classe Animal usando LinkedHashSet
        Set<Animal> setDeAnimais = new LinkedHashSet<>();

        // Adicionando objetos da classe Animal ao conjunto
        setDeAnimais.add(new Animal(1L, "Tartaruga"));
        setDeAnimais.add(new Animal(2L, "Coelho"));
        setDeAnimais.add(new Animal(3L, "Cachorro"));
        setDeAnimais.add(new Animal(4L, "Gato"));

        // Iterando pelo conjunto e imprimindo os objetos da classe Animal
        for (Animal animal : setDeAnimais) {
            System.out.println(animal);
        }
    }
}

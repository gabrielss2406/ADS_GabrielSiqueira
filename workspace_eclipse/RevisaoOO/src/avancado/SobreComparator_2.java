package avancado;

import java.util.ArrayList;
import java.util.List;

/**
 * Exemplo de uso de expressão lambda para ordenar uma lista de objetos da classe Animal em ordem alfabética do nome.
 */
public class SobreComparator_2 {

    public static void main(String[] args) {
        // Criando uma lista de objetos da classe Animal
        List<Animal> listaDeAnimais = new ArrayList<>();
        
        listaDeAnimais.add(new Animal(1L, "Tartaruga"));
        listaDeAnimais.add(new Animal(2L, "Coelho"));
        listaDeAnimais.add(new Animal(3L, "Cachorro"));
        listaDeAnimais.add(new Animal(4L, "Gato"));
        listaDeAnimais.add(new Animal(5L, "Girafa"));
        listaDeAnimais.add(new Animal(6L, "Gato"));
        
        // Usando uma expressão lambda para ordenar a lista em ordem alfabética do nome do animal
        listaDeAnimais.sort((a1, a2) -> a1.getNome().compareTo(a2.getNome()));
    
        // Imprimindo a lista ordenada
        for (Animal animal : listaDeAnimais) {
            System.out.println(animal.getNome());
        }
    }
}

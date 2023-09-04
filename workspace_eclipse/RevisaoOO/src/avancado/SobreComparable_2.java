package avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exemplo de uso da interface Comparable em Java para ordenar uma lista de objetos da classe Animal.
 */
public class SobreComparable_2 {

    public static void main(String[] args) {
        // Criando uma lista de objetos da classe Animal
        List<Animal> listaDeAnimais = new ArrayList<>();
        
        listaDeAnimais.add(new Animal(1L, "Tartaruga"));
        listaDeAnimais.add(new Animal(2L, "Coelho"));
        listaDeAnimais.add(new Animal(3L, "Cachorro"));
        listaDeAnimais.add(new Animal(4L, "Gato"));
        listaDeAnimais.add(new Animal(5L, "Girafa"));
        listaDeAnimais.add(new Animal(6L, "Gato"));
        
        System.out.println("> Pela ordem de inserção: ");
        System.out.println(listaDeAnimais);
        
        // Ordenando a lista em ordem alfabética do nome do animal usando a função Collections.sort
        System.out.println("> Pela ordem alfabética do nome do animal: ");
        Collections.sort(listaDeAnimais);
        System.out.println(listaDeAnimais);
    }
}
